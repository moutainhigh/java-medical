package com.vpu.mp.service.shop.activity.processor;

import com.vpu.mp.service.foundation.data.BaseConstant;
import com.vpu.mp.service.foundation.exception.MpException;
import com.vpu.mp.service.foundation.util.DateUtil;
import com.vpu.mp.service.foundation.util.Util;
import com.vpu.mp.service.pojo.shop.goods.GoodsConstant;
import com.vpu.mp.service.pojo.shop.market.seckill.SeckillProductBo;
import com.vpu.mp.service.pojo.shop.order.OrderConstant;
import com.vpu.mp.service.pojo.wxapp.cart.list.CartActivityInfo;
import com.vpu.mp.service.pojo.wxapp.cart.list.WxAppCartBo;
import com.vpu.mp.service.pojo.wxapp.cart.list.WxAppCartGoods;
import com.vpu.mp.service.pojo.wxapp.goods.goods.GoodsActivityBaseMp;
import com.vpu.mp.service.pojo.wxapp.goods.goods.activity.GoodsDetailCapsuleParam;
import com.vpu.mp.service.pojo.wxapp.goods.goods.activity.GoodsDetailMpBo;
import com.vpu.mp.service.pojo.wxapp.goods.goods.activity.GoodsListMpBo;
import com.vpu.mp.service.pojo.wxapp.order.OrderBeforeParam;
import com.vpu.mp.service.pojo.wxapp.order.OrderBeforeVo;
import com.vpu.mp.service.shop.activity.dao.SecKillProcessorDao;
import lombok.extern.slf4j.Slf4j;
import org.jooq.Record;
import org.jooq.Record3;
import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.vpu.mp.db.shop.tables.SecKillDefine.SEC_KILL_DEFINE;
import static com.vpu.mp.db.shop.tables.SecKillProductDefine.SEC_KILL_PRODUCT_DEFINE;

/**
 * 秒杀
 * @author 李晓冰
 * @date 2019年11月01日
 * 秒杀
 */
@Service
@Slf4j
public class SecKillProcessor implements ActivityGoodsListProcessor,GoodsDetailProcessor,ActivityCartListStrategy ,ProcessorPriority,OrderBeforeProcessor,OrderCreatePayBeforeProcessor{
    @Autowired
    SecKillProcessorDao secKillProcessorDao;
    /*****处理器优先级*****/
    @Override
    public Byte getPriority() {
        return GoodsConstant.ACTIVITY_SEC_KILL_PRIORITY;
    }
    /*****************商品列表处理*******************/
    @Override
    public void processForList(List<GoodsListMpBo> capsules, Integer userId) {
        List<GoodsListMpBo> availableCapsules = capsules.stream().filter(x -> BaseConstant.ACTIVITY_TYPE_SEC_KILL.equals(x.getActivityType())).collect(Collectors.toList());
        List<Integer> goodsIds = availableCapsules.stream().map(GoodsListMpBo::getGoodsId).collect(Collectors.toList());
        Map<Integer, List<Record3<Integer, Integer, BigDecimal>>> goodsSecKillListInfo = secKillProcessorDao.getGoodsSecKillListInfo(goodsIds, DateUtil.getLocalDateTime());

        availableCapsules.forEach(capsule->{
            if (goodsSecKillListInfo.get(capsule.getGoodsId()) == null) {
                return;
            }
            Record3<Integer, Integer, BigDecimal> record3 = goodsSecKillListInfo.get(capsule.getGoodsId()).get(0);

            capsule.setRealPrice(record3.get(SEC_KILL_PRODUCT_DEFINE.SEC_KILL_PRICE));
            GoodsActivityBaseMp activity = new GoodsActivityBaseMp();
            activity.setActivityId(record3.get(SEC_KILL_DEFINE.SK_ID));
            activity.setActivityType(BaseConstant.ACTIVITY_TYPE_SEC_KILL);
            capsule.getGoodsActivities().add(activity);
            capsule.getProcessedTypes().add(BaseConstant.ACTIVITY_TYPE_SEC_KILL);
        });
    }

    /**
     * 商品详情页-秒杀
     * @param
     */
    @Override
    public void processGoodsDetail(GoodsDetailMpBo capsule, GoodsDetailCapsuleParam param) {
        if(param.getActivityId() != null && param.getActivityType().equals(BaseConstant.ACTIVITY_TYPE_SEC_KILL)){
            //处理之前capsule中需要有商品的基本信息
            capsule.setActivity(secKillProcessorDao.getDetailSeckillInfo(param.getActivityId(),param.getUserId(),capsule.getGoodsNumber()));
        }
    }
    //*********************************购物车********************************

    /**
     * 购物车-秒杀
     * @param cartBo 业务数据类
     */
    @Override
    public void doCartOperation(WxAppCartBo cartBo) {
        log.info("SecKillProcessor->WxAppCartBo:"+ Util.toJson(cartBo));
        //秒杀商品
        List<Integer> secProductList = cartBo.getCartGoodsList().stream()
                .filter(goods -> BaseConstant.ACTIVITY_TYPE_SEC_KILL.equals(goods.getGoodsType()))
                .map(WxAppCartGoods::getPrdId).collect(Collectors.toList());
        //查询商品的秒杀活动,获取活动id
        Result<? extends Record> secKillInfoList = secKillProcessorDao.getSecKillInfoList(secProductList, cartBo.getDate());
        if (secKillInfoList!=null&&secKillInfoList.size()>0){
            Map<Integer, SeckillProductBo> seckillProductBoMap = secKillInfoList.intoMap(SEC_KILL_PRODUCT_DEFINE.PRODUCT_ID,SeckillProductBo.class);
            cartBo.getCartGoodsList().forEach(goods->{
                SeckillProductBo productBo = seckillProductBoMap.get(goods.getPrdId());
                CartActivityInfo seckillProductInfo =new CartActivityInfo();
                seckillProductInfo.setActivityType(BaseConstant.ACTIVITY_TYPE_SEC_KILL);
                seckillProductInfo.setActivityId(productBo.getSkId());
                seckillProductInfo.setSecKillPrice(productBo.getSecKillPrice());
                goods.getCartActivityInfos().add(seckillProductInfo);
            });
        }
    }

    /**
     * 下单时的秒杀处理
     * @param order
     */
    @Override
    public void processPayBefore(OrderBeforeVo order) throws MpException {
        if(order.getActivityId() != null && order.getActivityType() != null && BaseConstant.ACTIVITY_TYPE_SEC_KILL.equals(order.getActivityType())){
            secKillProcessorDao.processSeckillStock(order);
        }
    }

    /**
     * 订单确认页-秒杀下单处理
     * @param orderBeforeParam
     */
    @Override
    public void processOrderBefore(OrderBeforeParam orderBeforeParam, OrderBeforeVo vo) {
        secKillProcessorDao.setOrderPrdSeckillPrice(orderBeforeParam,vo);
        //这些营销不允许使用积分支付
        vo.setScoreMaxDiscount(BigDecimal.ZERO);
        vo.getPaymentList().remove(OrderConstant.PAY_CODE_SCORE_PAY);
    }
}
