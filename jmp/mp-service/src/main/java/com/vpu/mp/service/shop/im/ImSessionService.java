package com.vpu.mp.service.shop.im;

import com.vpu.mp.common.foundation.util.DateUtils;
import com.vpu.mp.common.foundation.util.Util;
import com.vpu.mp.common.pojo.shop.table.ImSessionDo;
import com.vpu.mp.common.pojo.shop.table.ImSessionItemDo;
import com.vpu.mp.dao.shop.session.ImSessionDao;
import com.vpu.mp.dao.shop.session.ImSessionItemDao;
import com.vpu.mp.service.foundation.jedis.JedisKeyConstant;
import com.vpu.mp.service.foundation.jedis.JedisManager;
import com.vpu.mp.service.foundation.service.ShopBaseService;
import com.vpu.mp.service.pojo.wxapp.medical.im.ImSessionConstant;
import com.vpu.mp.service.pojo.wxapp.medical.im.base.ImSessionItemBase;
import com.vpu.mp.service.pojo.wxapp.medical.im.condition.ImSessionCondition;
import com.vpu.mp.service.pojo.wxapp.medical.im.param.ImSessionNewParam;
import com.vpu.mp.service.pojo.wxapp.medical.im.param.ImSessionPullMsgParam;
import com.vpu.mp.service.pojo.wxapp.medical.im.param.ImSessionSendMsgParam;
import com.vpu.mp.service.pojo.wxapp.medical.im.vo.ImSessionItemRenderVo;
import com.vpu.mp.service.pojo.wxapp.medical.im.vo.ImSessionRenderVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 会话处理service
 * @author 李晓冰
 * @date 2020年07月21日
 */
@Service
public class ImSessionService extends ShopBaseService {
    @Autowired
    private ImSessionDao imSessionDao;
    @Autowired
    private ImSessionItemDao imSessionItemDao;
    @Autowired
    private JedisManager jedisManager;

    /**
     * 新增会话
     * @param param 新增会话信息
     * @return 会话id
     */
    public Integer insertNewSession(ImSessionNewParam param){
        ImSessionDo imSessionDo = new ImSessionDo();
        imSessionDo.setDoctorId(param.getDoctorId());
        imSessionDo.setDepartmentId(param.getDepartmentId());
        imSessionDo.setUserId(param.getUserId());
        imSessionDo.setPatientId(param.getPatientId());
        imSessionDo.setOrderSn(param.getOrderSn());
        imSessionDo.setSessionStatus(ImSessionConstant.SESSION_READY_TO_START);

        imSessionDao.insert(imSessionDo);
        return imSessionDo.getId();
    }

    /**
     * 会话状态修改为进行中
     * @param sessionId 会话id
     * @return
     */
    public void updateSessionToGoingOn(Integer sessionId){
        ImSessionDo imSessionDo = imSessionDao.getById(sessionId);
        imSessionDo.setLimitTime(DateUtils.getTimeStampPlus(ImSessionConstant.CLOSE_LIMIT_TIME, ChronoUnit.HOURS));
        imSessionDao.update(imSessionDo);
    }

    /**
     * 批量取消未接诊过期的会话
     */
    public void batchCancelSession(){
        ImSessionCondition cancelCondition =new ImSessionCondition();
        cancelCondition.setStatus(ImSessionConstant.SESSION_READY_TO_START);
        Timestamp lessCreateTime = DateUtils.getTimeStampPlus(-ImSessionConstant.CANCEL_LIMIT_TIME, ChronoUnit.HOURS);
        cancelCondition.setLessCreateTime(lessCreateTime);
        List<ImSessionDo> imSessionDos = imSessionDao.listImSession(cancelCondition);

        List<Integer> sessionIds = imSessionDos.stream().map(ImSessionDo::getId).collect(Collectors.toList());
        imSessionDao.batchUpdateSessionStatus(sessionIds,ImSessionConstant.SESSION_CANCEL);
    }

    /**
     * 批量关闭到时间的会话
     */
    public void batchCloseSession(){
        ImSessionCondition cancelCondition =new ImSessionCondition();
        cancelCondition.setStatus(ImSessionConstant.SESSION_ON);
        Timestamp limitTime = DateUtils.getLocalDateTime();
        cancelCondition.setLimitTime(limitTime);
        List<ImSessionDo> imSessionDos = imSessionDao.listImSession(cancelCondition);
        List<Integer> sessionIds = imSessionDos.stream().map(ImSessionDo::getId).collect(Collectors.toList());
        imSessionDao.batchUpdateSessionStatus(sessionIds,ImSessionConstant.SESSION_END);
    }

    /**
     * 恢复已有的聊天记录,目前没有做成分页的
     * @param sessionId 会话id
     * @return 会话聊天内容信息
     */
    public ImSessionRenderVo renderSession(Integer sessionId) {
        ImSessionDo imSessionDo = imSessionDao.getById(sessionId);
        Integer doctorId = imSessionDo.getDoctorId();
        List<ImSessionItemDo> imSessionItemDos = imSessionItemDao.getBySessionId(sessionId);
        ImSessionRenderVo imSessionRenderVo = new ImSessionRenderVo();
        imSessionRenderVo.setLimitTime(imSessionDo.getLimitTime());

        List<ImSessionItemRenderVo> sessionItemRenderVos = imSessionItemDos.stream().sorted(Comparator.comparing(ImSessionItemDo::getSendTime)).map(item -> {
            ImSessionItemRenderVo itemVo = new ImSessionItemRenderVo();
            itemVo.setDoctor(doctorId.equals(item.getFormId()));
            itemVo.setMessage(item.getMessage());
            itemVo.setType(item.getType());
            itemVo.setSendTime(item.getSendTime());
            return itemVo;
        }).collect(Collectors.toList());
        imSessionRenderVo.setSessionItemRenderVos(sessionItemRenderVos);
        return imSessionRenderVo;
    }

    /**
     * 将消息发送，存储至redis
     * @param sendMsgParam 会话消息
     */
    public void sendMsg(ImSessionSendMsgParam sendMsgParam){
        String sessionKey = getSessionRedisKey(getShopId(), sendMsgParam.getDepartmentId(),sendMsgParam.getPatientId(), sendMsgParam.getFromId(), sendMsgParam.getToId());
        jedisManager.rpush(sessionKey, Util.toJson(sendMsgParam.getImSessionItem()));
    }

    /**
     * 拉取对方发送的消息内
     * @return
     */
    public List<ImSessionItemBase> pullMsg(ImSessionPullMsgParam param){
        return dumpSessionReadyToBak(getShopId(), param.getDepartmentId(),param.getPatientId(), param.getPullFromId(), param.getSelfId());
    }

    /**
     * 关闭对话session
     * @param sessionId 会话id
     */
    public void closeImSession(Integer sessionId){
        ImSessionDo imSessionDo = imSessionDao.getById(sessionId);
        if (!ImSessionConstant.SESSION_ON.equals(imSessionDo.getSessionStatus())) {
            return;
        }
        imSessionDao.updateSessionStatus(sessionId, ImSessionConstant.SESSION_END);
        Integer shopId = getShopId();
        // 用户发送的消息列表
        List<String> userSession = removeSessionReadyAndBak(shopId, imSessionDo.getDepartmentId(),imSessionDo.getPatientId(), imSessionDo.getUserId(), imSessionDo.getDoctorId());
        // 医生发送的消息列表
        List<String> doctorSession = removeSessionReadyAndBak(shopId,imSessionDo.getDepartmentId(),imSessionDo.getPatientId(),imSessionDo.getDoctorId(),imSessionDo.getUserId());

        List<ImSessionItemDo> readyToDb = new ArrayList<>();
        for (String s : userSession) {
            ImSessionItemBase imSessionItemBase = Util.parseJson(s, ImSessionItemBase.class);
            if (imSessionItemBase == null) {
                continue;
            }
            ImSessionItemDo imSessionItemDo = convertImSessionItemBasetoDo(imSessionItemBase, sessionId, imSessionDo.getUserId(), imSessionDo.getDoctorId());
            readyToDb.add(imSessionItemDo);
        }
        for (String s : doctorSession) {
            ImSessionItemBase imSessionItemBase = Util.parseJson(s, ImSessionItemBase.class);
            if (imSessionItemBase == null) {
                continue;
            }
            ImSessionItemDo imSessionItemDo = convertImSessionItemBasetoDo(imSessionItemBase, sessionId, imSessionDo.getDoctorId(), imSessionDo.getUserId());
            readyToDb.add(imSessionItemDo);
        }

        imSessionItemDao.batchInsert(readyToDb);
    }

    private ImSessionItemDo convertImSessionItemBasetoDo(ImSessionItemBase imSessionItemBase,Integer sessionId,Integer fromId,Integer toId){
        ImSessionItemDo imSessionItemDo =new ImSessionItemDo();
        imSessionItemDo.setImSessionId(sessionId);
        imSessionItemDo.setFormId(fromId);
        imSessionItemDo.setToId(toId);
        imSessionItemDo.setMessage(imSessionItemBase.getMessage());
        imSessionItemDo.setType(imSessionItemBase.getType());
        imSessionItemDo.setSendTime(imSessionItemBase.getSendTime());
        return imSessionItemDo;
    }

    /**
     * 将待查看会话中的信息内容移动至会话过往记录列表内
     * @param shopId 店铺id
     * @param departmentId 科室id
     * @param patientId 患者id
     * @param fromId 发送者id
     * @param toId 接受者id
     * @return 待查看会话集合
     */
    private List<ImSessionItemBase> dumpSessionReadyToBak(Integer shopId, Integer departmentId,Integer patientId, Integer fromId, Integer toId) {
        String sessionKey = getSessionRedisKey(getShopId(), departmentId,patientId, fromId, toId);
        String sessionBakKey = getSessionRedisKeyBak(getShopId(), departmentId,patientId, fromId, toId);

        List<String> readyToReadList = jedisManager.getList(sessionKey);
        List<String> dumpList = new ArrayList<>(readyToReadList.size());
        List<ImSessionItemBase> retVos = new ArrayList<>(readyToReadList.size());

        Timestamp curTime = DateUtils.getLocalDateTime();
        for (String s : readyToReadList) {
            ImSessionItemBase vo = Util.parseJson(s,ImSessionItemBase.class);
            if (vo == null) {
                continue;
            }
            vo.setSendTime(curTime);
            retVos.add(vo);
            dumpList.add(Util.toJson(vo));
        }
        jedisManager.cleanList(sessionKey);
        jedisManager.rpush(sessionBakKey, dumpList);
        return retVos;
    }

    /**
     * 清空待查看和已查看redis key
     * @param shopId 店铺id
     * @param departmentId 科室id
     * @param patientId 患者id
     * @param fromId 发送者id
     * @param toId 接受者id
     * @return 所有会话记录集合
     */
    private List<String> removeSessionReadyAndBak(Integer shopId,Integer departmentId,Integer patientId, Integer fromId, Integer toId){
        dumpSessionReadyToBak(shopId,departmentId,patientId,fromId,toId);
        String sessionKey = getSessionRedisKey(shopId,departmentId,patientId, fromId,toId);
        String sessionBakKey = getSessionRedisKeyBak(shopId,departmentId,patientId, fromId, toId);
        List<String> list = jedisManager.getList(sessionBakKey);
        jedisManager.delete(sessionKey);
        jedisManager.delete(sessionBakKey);
        return list;
    }

    /**
     * 判断信息
     * @param sessionId
     * @return
     */
    public boolean sessionExist(Integer sessionId) {
        return imSessionDao.getById(sessionId) !=null;
    }

    /**
     * 获取待查看会话redis key
     * @param shopId 店铺id
     * @param departmentId 科室id
     * @param patientId 患者id
     * @param fromId 发送者id
     * @param toId 接受者id
     * @return
     */
    private String getSessionRedisKey(Integer shopId, Integer departmentId,Integer patientId, Integer fromId, Integer toId) {
        return String.format(JedisKeyConstant.IM_SESSION_ITEM_LIST_KEY,shopId,departmentId,patientId,fromId,toId);
    }

    /**
     * 获取已查看会话记录redis key
     * @param shopId 店铺id
     * @param departmentId 科室id
     * @param patientId 患者id
     * @param fromId 发送者id
     * @param toId 接受者id
     * @return
     */
    private String getSessionRedisKeyBak(Integer shopId, Integer departmentId,Integer patientId, Integer fromId, Integer toId){
        return String.format(JedisKeyConstant.IM_SESSION_ITEM_LIST_KEY_BAK,shopId,departmentId,patientId,fromId,toId);
    }
}
