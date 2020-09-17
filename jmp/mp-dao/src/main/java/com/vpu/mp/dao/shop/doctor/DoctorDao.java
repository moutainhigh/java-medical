package com.vpu.mp.dao.shop.doctor;

import cn.hutool.core.date.DateUtil;
import com.vpu.mp.common.foundation.data.DelFlag;
import com.vpu.mp.common.foundation.util.FieldsUtil;
import com.vpu.mp.common.foundation.util.PageResult;
import com.vpu.mp.common.pojo.shop.table.DoctorDo;
import com.vpu.mp.dao.foundation.base.ShopBaseDao;
import com.vpu.mp.db.shop.tables.records.DoctorRecord;
import com.vpu.mp.service.pojo.shop.department.DepartmentListVo;
import com.vpu.mp.service.pojo.shop.doctor.*;
import com.vpu.mp.service.pojo.wxapp.order.inquiry.InquiryOrderConstant;
import org.apache.commons.lang3.StringUtils;
import org.jooq.Condition;
import org.jooq.Record;
import org.jooq.SelectJoinStep;
import org.jooq.impl.DSL;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.vpu.mp.db.shop.Tables.*;
import static com.vpu.mp.service.pojo.shop.doctor.DoctorListParam.*;

/**
 * @author chenjie
 */
@Repository
public class DoctorDao extends ShopBaseDao {

    /**
     * 医师列表
     *
     * @param param
     * @return
     */
    public PageResult<DoctorOneParam> getDoctorList(DoctorListParam param) {
        SelectJoinStep<? extends Record> select = db()
            .select(DOCTOR.asterisk())
            .from(DOCTOR);
        select.where(DOCTOR.IS_DELETE.eq((byte) 0));
        buildOptions(select, param);
        if (param.getOrderField() != null) {
            doctorFiledSorted(select, param);
        } else {
            select.orderBy(DOCTOR.ID.desc());
        }
        return this.getPageResult(select, param.getCurrentPage(),
            param.getPageRows(), DoctorOneParam.class);
    }

    /**
     * 对医师按指定字段进行排序
     * @param select 查询实体
     * @param param 排序参数
     */
    private void doctorFiledSorted(SelectJoinStep<? extends Record> select, DoctorListParam param) {
        if (ASC.equals(param.getOrderDirection())) {
            switch (param.getOrderField()) {
                case AVG_COMMENT_STAR:
                    select.orderBy(DOCTOR.AVG_COMMENT_STAR.asc());
                    break;
                case AVG_ANSWER_TIME:
                    select.orderBy(DOCTOR.AVG_ANSWER_TIME.asc());
                    break;
                case ATTENTION_NUMBER:
                    select.orderBy(DOCTOR.ATTENTION_NUMBER.asc());
                    break;
                case CONSULTATION_NUMBER:
                    select.orderBy(DOCTOR.CONSULTATION_NUMBER.asc());
                    break;
                case CONSULTATION_PRICE:
                    select.orderBy(DOCTOR.CONSULTATION_PRICE.asc());
                    break;
                default:
                    break;
            }
        } else {
            switch (param.getOrderField()) {
                case AVG_COMMENT_STAR:
                    select.orderBy(DOCTOR.AVG_COMMENT_STAR.desc());
                    break;
                case AVG_ANSWER_TIME:
                    select.orderBy(DOCTOR.AVG_ANSWER_TIME.desc());
                    break;
                case ATTENTION_NUMBER:
                    select.orderBy(DOCTOR.ATTENTION_NUMBER.desc());
                    break;
                case CONSULTATION_NUMBER:
                    select.orderBy(DOCTOR.CONSULTATION_NUMBER.desc());
                    break;
                case CONSULTATION_PRICE:
                    select.orderBy(DOCTOR.CONSULTATION_PRICE.desc());
                    break;
                default:
                    break;
            }
        }
    }

    /**
     * 医师搜索查询
     *
     * @param select
     * @param param
     */
    protected void buildOptions(SelectJoinStep<? extends Record> select, DoctorListParam param) {
        if (param.getName() != null) {
            select.where(DOCTOR.NAME.like(likeValue(param.getName())));
        }
        if (param.getDoctorNo() != null) {
            select.where(DOCTOR.HOSPITAL_CODE.like(param.getDoctorNo()));
        }
        if (param.getDoctorIds() != null) {
            select.where(DOCTOR.ID.in(param.getDoctorIds()));
        }
        if(param.getTitleId()!=null){
            select.where(DOCTOR.TITLE_ID.eq(param.getTitleId()));
        }
        if(param.getSex()!=null){
            select.where(DOCTOR.SEX.eq(param.getSex()));
        }
        if(param.getConsultationMoneyMix()!=null){
            select.where(DOCTOR.CONSULTATION_TOTAL_MONEY.ge(param.getConsultationMoneyMix()));
        }
        if(param.getConsultationMoneyMax()!=null){
            select.where(DOCTOR.CONSULTATION_TOTAL_MONEY.le(param.getConsultationMoneyMax()));
        }
    }

    /**
     * 获取一条医师的信息
     *
     * @param doctorId
     * @return
     */
    public DoctorOneParam getOneInfo(Integer doctorId) {
        DoctorOneParam info = db().select().from(DOCTOR).where(DOCTOR.ID.eq(doctorId))
            .fetchOneInto(DoctorOneParam.class);
        return info;
    }

    /**
     * 编辑保存
     *
     * @param param
     * @return
     */
    public void updateDoctor(DoctorOneParam param) {
        DoctorRecord record = db().select().from(DOCTOR).where(DOCTOR.ID.eq(param.getId()))
            .fetchOneInto(DoctorRecord.class);
        FieldsUtil.assign(param, record);
        record.update();
        param.setId(record.getId());
    }

    /**
     * 添加医师
     *
     * @param param
     * @return
     */
    public void insertDoctor(DoctorOneParam param) {
        DoctorRecord record = db().newRecord(DOCTOR);
        FieldsUtil.assign(param, record);
        record.insert();
        param.setId(record.getId());
    }

    /**
     * 删除
     *
     * @param doctorId
     * @return
     */
    public int deleteDoctor(Integer doctorId) {
        int res = db().update(DOCTOR).set(DOCTOR.IS_DELETE, (byte) 1).where(DOCTOR.ID.eq(doctorId))
            .execute();
        return res;
    }

    /**
     * 获取一条医师的信息(根据hospitalCode)
     *
     * @param hospitalCode
     * @return
     */
    public DoctorOneParam getDoctorByHospitalCode(String hospitalCode) {
        return db().select().from(DOCTOR).where(DOCTOR.HOSPITAL_CODE.eq(hospitalCode))
            .fetchOneInto(DoctorOneParam.class);
    }

    /**
     * 医师是否存在，用来新增检查
     * @param doctorId 医师ID
     * @param code 医师Code
     * @return true 存在 false 不存在
     */
    public boolean isCodeExist(Integer doctorId,String code) {
        Condition condition = DOCTOR.HOSPITAL_CODE.eq(code);
        if (doctorId != null) {
            condition = condition.and(DOCTOR.ID.ne(doctorId));
        }
        int count = db().fetchCount(DOCTOR, condition);
        return count>0;
    }

    /**
     * @Author 赵晓东
     * @Create 2020-07-22 14:53:51
     */
    /**
     * 医师认证
     * @param doctorAuthParam 医师认证入参
     * @return DoctorDo
     */
    public DoctorDo doctorAuth(DoctorAuthParam doctorAuthParam) {
        return db().select().from(DOCTOR)
            .where(DOCTOR.NAME.eq(doctorAuthParam.getDoctorName()))
            // 不校验手机号 2020-9-16
//            .and(DOCTOR.MOBILE.eq(doctorAuthParam.getMobile()))
            .and(DOCTOR.HOSPITAL_CODE.eq(doctorAuthParam.getHospitalCode()))
            .fetchAnyInto(DoctorDo.class);
    }

    /**
     * 更新医师表用户id
     * @param doctorDo 当前用户
     * @return int
     */
    public int updateUserId(DoctorDo doctorDo, String mobile){
        return db().update(DOCTOR).set(DOCTOR.USER_ID, doctorDo.getUserId())
            .set(DOCTOR.MOBILE, mobile)
            .where(DOCTOR.NAME.eq(doctorDo.getName())
                .and(DOCTOR.MOBILE.eq(doctorDo.getMobile()))).execute();
    }

    /**
     * 更新医师登录token
     * @param doctorId
     * @param userToken
     */
    public void updateUserToken(Integer doctorId, String userToken){
        db().update(DOCTOR).set(DOCTOR.USER_TOKEN, userToken)
            .where(DOCTOR.ID.eq(doctorId))
                .execute();
    }

    /**
     * 查询医师信息集合
     * @param doctorIds 医师id集合
     * @return
     */
    public List<DoctorSimpleVo> listDoctorSimpleInfo(List<Integer> doctorIds) {
        return db().select(DOCTOR.ID,DOCTOR.NAME).from(DOCTOR).where(DOCTOR.ID.in(doctorIds).and(DOCTOR.IS_DELETE.eq(DelFlag.NORMAL_VALUE)))
            .fetchInto(DoctorSimpleVo.class);
    }

    /**
     *
     * 	根据医生id查询医生所属科室
     * @param doctorId 医师id
     * @return List<Department>
     */
    public List<DepartmentListVo>   selectDepartmentsByDoctorId(Integer doctorId){
        return db().select().from(DEPARTMENT)
            .join(DOCTOR_DEPARTMENT_COUPLE)
            .on(DEPARTMENT.ID.eq(DOCTOR_DEPARTMENT_COUPLE.DEPARTMENT_ID)
            .and(DOCTOR_DEPARTMENT_COUPLE.DOCTOR_ID.eq(doctorId))
            .and(DEPARTMENT.IS_DELETE.eq(DelFlag.NORMAL_VALUE)))
            .fetchInto(DepartmentListVo.class);
    }

    /**
     * 根据职称id查询职称名称
     * @param doctorOneParam 医师职称id
     * @return String
     */
    public String selectDoctorTitle(DoctorOneParam doctorOneParam){
        return db().select(DOCTOR_TITLE.NAME).from(DOCTOR_TITLE)
            .where(DOCTOR_TITLE.ID.eq(Integer.valueOf(doctorOneParam.getDuty()))).fetchAnyInto(String.class);
    }

    /**
     * 根据医师id查询医师编码
     * @param doctorId 医师id
     * @return String
     */
    public String selectDoctorCodeByDoctorId(Integer doctorId) {
        return db().select(DOCTOR.HOSPITAL_CODE).from(DOCTOR)
            .where(DOCTOR.ID.eq(doctorId)).fetchAnyInto(String.class);
    }

    /**
     * 医师下拉列表
     *
     * @param param
     * @return
     */
    public List<DoctorOneParam> getSelectDoctorList(DoctorListParam param) {
        Condition condition = DOCTOR.IS_DELETE.eq((byte) 0).and(DOCTOR.STATUS.eq((byte) 1));
        if (!StringUtils.isBlank(param.getName())) {
            condition = condition.and(DOCTOR.NAME.like(likeValue(param.getName())));
        }
        return db().select().from(DOCTOR).where(condition).fetchInto(DoctorOneParam.class);
    }

    /**
     * 更新医师上班状态
     * @param param
     * @return int
     */
    public void updateOnDuty(DoctorDutyParam param){
        db().update(DOCTOR).set(DOCTOR.IS_ON_DUTY, param.getOnDutyStatus())
            .where(DOCTOR.ID.eq(param.getDoctorId()))
            .execute();

    }

    /**
     * 更新医师上班状态
     * @param param
     * @return int
     */
    public int updateOnDutyTime(DoctorDutyParam param){
        return db().update(DOCTOR).set(DOCTOR.ON_DUTY_TIME, param.getOnDutyTime())
            .where(DOCTOR.ID.eq(param.getDoctorId()))
            .execute();
    }

    public List<Integer> listNotOnDutyDoctorIds (){
        return db().select(DOCTOR.ID).from(DOCTOR)
            .where(DOCTOR.IS_ON_DUTY.eq(DoctorConstant.NOT_ON_DUTY)
            .and(DOCTOR.IS_DELETE.eq(DelFlag.NORMAL_VALUE)))
            .and(DOCTOR.ON_DUTY_TIME.lt(DateUtil.date().toTimestamp()))
            .fetchInto(Integer.class);
    }

    /**
     * 更新医师平均响应时间
     * @param param
     */
    public void updateAvgAnswerTime(DoctorSortParam param){
        db().update(DOCTOR).set(DOCTOR.AVG_ANSWER_TIME, param.getAvgAnswerTime())
            .where(DOCTOR.ID.eq(param.getDoctorId()))
            .execute();
    }

    /**
     * 更新医师接诊数
     * @param param
     */
    public void updateConsultationNumber(DoctorSortParam param){
        db().update(DOCTOR).set(DOCTOR.CONSULTATION_NUMBER, param.getConsultationNumber())
            .where(DOCTOR.ID.eq(param.getDoctorId()))
            .execute();
    }

    /**
     * 更新医师平均评分
     * @param param
     */
    public void updateAvgCommentStar(DoctorSortParam param){
        db().update(DOCTOR).set(DOCTOR.AVG_COMMENT_STAR, param.getAvgCommentStar())
            .where(DOCTOR.ID.eq(param.getDoctorId()))
            .execute();
    }

    /**
     * 更新医师关注数
     * @param param
     */
    public void updateAttentionNumber(DoctorSortParam param){
        db().update(DOCTOR).set(DOCTOR.ATTENTION_NUMBER, param.getAttentionNumber())
            .where(DOCTOR.ID.eq(param.getDoctorId()))
            .execute();
    }

    /**
     * 更新医师userToken
     * @param userId
     * @param userToken
     */
    public void updateUserTokenByUserId(Integer userId,String userToken){
        db().update(DOCTOR).set(DOCTOR.USER_TOKEN, userToken)
            .where(DOCTOR.USER_ID.eq(userId))
            .execute();
    }

    /**
     * 医师解绑 删除医师绑定用户信息
     * @param doctorId 医师id
     */
    public void unbundlingDoctorAuth(Integer doctorId) {
        db().update(DOCTOR)
            .set(DOCTOR.USER_ID, 0)
            .where(DOCTOR.ID.eq(doctorId)).execute();
    }

    /**
     * 医师解绑删除用户token
     * @param doctorId 医师id
     */
    public void unbundlingDoctorToken(Integer doctorId) {
        db().update(DOCTOR).set(DOCTOR.USER_TOKEN, "")
            .where(DOCTOR.ID.eq(doctorId)).execute();
    }

    /**
     * 医师是否接诊
     * @param doctorId
     */
    public void canConsultation(Integer doctorId) {
        DoctorOneParam oneInfo = this.getOneInfo(doctorId);
        // 如果启用
        if (oneInfo.getCanConsultation().equals((byte)1)) {
            db().update(DOCTOR).set(DOCTOR.CAN_CONSULTATION, (byte)0)
                .where(DOCTOR.ID.eq(doctorId)).execute();
        } else { // 如果禁用
            db().update(DOCTOR).set(DOCTOR.CAN_CONSULTATION, (byte)1)
                .where(DOCTOR.ID.eq(doctorId)).execute();
        }
    }

    /**
     * 更新医师咨询总金额
     * @param param
     */
    public void updateConsultationTotalMoney(DoctorSortParam param){
        db().update(DOCTOR).set(DOCTOR.CONSULTATION_TOTAL_MONEY, param.getConsultationTotalMoney())
            .where(DOCTOR.ID.eq(param.getDoctorId()))
            .execute();
    }

    public void countDateByDoctor(Integer doctorCode) {
    }

    /**
     * 更改是否接诊状态
     * @param doctorId
     * @param canConsultation
     */
    public void updateCanConsultation(Integer doctorId,Byte canConsultation){
        db().update(DOCTOR).set(DOCTOR.CAN_CONSULTATION,canConsultation).where(DOCTOR.ID.eq(doctorId)).execute();
    }

    /**
     * 更新医师签名
     * @param doctorId
     * @param signature
     */
    public void updateSignature(Integer doctorId,String signature){
        db().update(DOCTOR).set(DOCTOR.SIGNATURE,signature).where(DOCTOR.ID.eq(doctorId)).execute();
    }

    /**
     * 获取所有医师的信息
     *
     * @return
     */
    public List<DoctorOneParam> getAllDoctor() {
        return db().select().from(DOCTOR)
            .fetchInto(DoctorOneParam.class);
    }

    /**
     * 获取科室处方统计数据
     * @param param
     * @return
     */
    public DoctorStatisticOneParam getDoctorInquiryData(DoctorStatisticParam param) {
        return db().select(DSL.count(INQUIRY_ORDER.ORDER_ID).as("inquiry_num"),DSL.sum(INQUIRY_ORDER.ORDER_AMOUNT).as("inquiry_money"))
            .from(INQUIRY_ORDER)
            .where(INQUIRY_ORDER.ORDER_STATUS.notIn(InquiryOrderConstant.ORDER_TO_PAID,InquiryOrderConstant.ORDER_CANCELED))
            .and(INQUIRY_ORDER.DOCTOR_ID.eq(param.getDoctorId()))
            .and(INQUIRY_ORDER.CREATE_TIME.ge(param.getStartTime()))
            .and(INQUIRY_ORDER.CREATE_TIME.le(param.getEndTime()))
            .fetchAnyInto(DoctorStatisticOneParam.class);
    }

    /**
     * 获取科室接诊统计数据
     * @param param
     * @return
     */
    public Integer getDoctorConsultationData(DoctorStatisticParam param) {
        return db().select(DSL.sum(DOCTOR.CONSULTATION_NUMBER).as("consultation_number"))
            .from(DOCTOR)
            .where(DOCTOR.ID.eq(param.getDoctorId()))
            .fetchAnyInto(Integer.class);
    }

    /**
     * 获取科室处方统计数据
     * @param param
     * @return
     */
    public DoctorStatisticOneParam getDoctorPrescriptionData(DoctorStatisticParam param) {
        return db().select(DSL.count(PRESCRIPTION.ID).as("prescription_num"),DSL.sum(PRESCRIPTION_ITEM.MEDICINE_PRICE).as("prescription_money"))
            .from(DOCTOR)
            .leftJoin(PRESCRIPTION ).on(PRESCRIPTION.DOCTOR_CODE.eq(DOCTOR.HOSPITAL_CODE))
            .leftJoin(PRESCRIPTION_ITEM).on(PRESCRIPTION_ITEM.POS_CODE.eq(PRESCRIPTION.POS_CODE))
            .where(DOCTOR.ID.eq(param.getDoctorId()))
//            .and(PRESCRIPTION.STATUS.eq(PrescriptionConstant.STATUS_PASS))
            .and(PRESCRIPTION.CREATE_TIME.ge(param.getStartTime()))
            .and(PRESCRIPTION.CREATE_TIME.le(param.getEndTime()))
            .fetchAnyInto(DoctorStatisticOneParam.class);
    }
}
