package com.vpu.mp.service.shop.market.payaward;

import com.vpu.mp.db.shop.tables.records.*;
import com.vpu.mp.service.foundation.data.BaseConstant;
import com.vpu.mp.service.foundation.data.DelFlag;
import com.vpu.mp.service.foundation.data.JsonResultMessage;
import com.vpu.mp.service.foundation.jedis.JedisManager;
import com.vpu.mp.service.foundation.service.ShopBaseService;
import com.vpu.mp.service.foundation.util.PageResult;
import com.vpu.mp.service.foundation.util.Util;
import com.vpu.mp.service.pojo.shop.coupon.CouponView;
import com.vpu.mp.service.pojo.shop.goods.spec.ProductSmallInfoVo;
import com.vpu.mp.service.pojo.shop.market.payaward.*;
import com.vpu.mp.service.pojo.shop.market.payaward.record.PayAwardRecordListParam;
import com.vpu.mp.service.pojo.shop.market.payaward.record.PayAwardRecordListVo;
import com.vpu.mp.service.pojo.wxapp.goods.goods.detail.promotion.PayAwardPromotion;
import com.vpu.mp.service.shop.coupon.CouponService;
import com.vpu.mp.service.shop.goods.GoodsService;
import com.vpu.mp.service.shop.market.lottery.LotteryService;
import com.vpu.mp.service.shop.market.prize.PrizeRecordService;
import org.apache.commons.lang3.StringUtils;
import org.jooq.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.*;
import java.util.stream.Collectors;

import static com.vpu.mp.db.shop.Tables.PAY_AWARD;
import static com.vpu.mp.db.shop.Tables.PAY_AWARD_PRIZE;
import static com.vpu.mp.service.foundation.data.BaseConstant.*;
import static com.vpu.mp.service.pojo.shop.market.payaward.PayAwardConstant.*;

/**
 * 支付有礼
 *
 * @author 孔德成
 * @date 2019/8/12 17:57
 * @update 2019-10-31 13:52:13
 */
@Service
public class PayAwardService extends ShopBaseService {
    private static final String MESSAGE = "messages";


    @Autowired
    PayAwardRecordService payAwardRecordService;
    @Autowired
    private CouponService couponService;
    @Autowired
    private GoodsService goodsService;
    @Autowired
    private LotteryService lotteryService;
    @Autowired
    private JedisManager jedisManager;
    @Autowired
    private PrizeRecordService prizeRecordService;

    /**指定时间段*/
    private static final Byte POINT_TIME = 0;
    /**永久时间*/
    private static final Byte FOREVER_TIME = 1;
    /**全部商品*/
    private static final Integer ALL_GOODS = 1;

    /**
     * 添加
     *
     * @param param 参数
     */
    public Boolean addPayAward(PayAwardParam param) {
        PayAwardRecord payAward = db().newRecord(PAY_AWARD, param);
        payAward.setAwardList(null);
        payAward.setStatus(ACTIVITY_STATUS_NORMAL);
        payAward.setId(null);
        payAward.insert();
        savePayAwardPrize(param, payAward, true);
        payAward.setAwardList(Util.toJsonNotNull(param.getAwardList()));

        return true;
    }

    /**
     * 保存
     *
     * @param param
     * @param payAward
     * @return
     */
    private List<Integer> savePayAwardPrize(PayAwardParam param, PayAwardRecord payAward, Boolean addFlag) {
        List<Integer> list = new ArrayList<>();
        for (PayAwardPrizeParam awardBo : param.getAwardList()) {
            PayAwardPrizeRecord payAwardPrizeRecord = db().newRecord(PAY_AWARD_PRIZE);
            awardBo.setSendNum(null);
            payAwardPrizeRecord.setPayAwardId(payAward.getId());
            if (Objects.nonNull(awardBo.getCouponIds())) {
                payAwardPrizeRecord.setCouponIds(Util.listToString(awardBo.getCouponIds()));
            }
            if (awardBo.getAccountNumber() != null) {
                payAwardPrizeRecord.setAccount(awardBo.getAccountNumber());
            }
            if (awardBo.getScoreNumber() != null) {
                payAwardPrizeRecord.setScoreNumber(awardBo.getScoreNumber() == null ? 0 : awardBo.getScoreNumber());
            }
            if (awardBo.getGiftType() != null) {
                payAwardPrizeRecord.setGiftType(awardBo.getGiftType());
            }
            if (awardBo.getLotteryId() != null) {
                payAwardPrizeRecord.setLotteryId(Optional.ofNullable(awardBo.getLotteryId()).orElse(0));
            }
            if (awardBo.getProductId() != null) {
                payAwardPrizeRecord.setProductId(Optional.ofNullable(awardBo.getProductId()).orElse(0));
            }
            if (awardBo.getKeepDays() != null) {
                payAwardPrizeRecord.setKeepDays(Optional.ofNullable(awardBo.getKeepDays()).orElse(0));
            }
            if (awardBo.getCustomImage() != null) {
                payAwardPrizeRecord.setCustomImage(Optional.ofNullable(awardBo.getCustomImage()).orElse(""));
            }
            if (awardBo.getCustomImage() != null) {
                payAwardPrizeRecord.setCustomLink(Optional.ofNullable(awardBo.getCustomLink()).orElse(""));
            }
            if (awardBo.getAwardNumber() != null) {
                payAwardPrizeRecord.setAwardNumber(Optional.ofNullable(awardBo.getAwardNumber()).orElse(0));
            }
            if (addFlag || awardBo.getId() == null) {
                payAwardPrizeRecord.setId(null);
                payAwardPrizeRecord.store();
            } else {
                payAwardPrizeRecord.setId(awardBo.getId());
                payAwardPrizeRecord.update();
            }
            list.add(payAwardPrizeRecord.getId());
        }
        return list;
    }

    /**
     * 获取当前进行的活动
     *
     * @return
     */
    public PayAwardRecord getNowPayAward() {
        Timestamp nowTime = new Timestamp(System.currentTimeMillis());
        PayAwardRecord record = db().selectFrom(PAY_AWARD)
            .where(PAY_AWARD.STATUS.eq(ACTIVITY_STATUS_NORMAL))
            .and(PAY_AWARD.START_TIME.ge(nowTime))
            .and(PAY_AWARD.END_TIME.le(nowTime))
            .fetchOne();
        return record;
    }

    /**
     * 删除
     *
     * @param id 活动id
     */
    public void deletePayAward(Integer id) {
        db().update(PAY_AWARD).set(PAY_AWARD.DEL_FLAG, DelFlag.DISABLE_VALUE).where(PAY_AWARD.ID.eq(id)).execute();
    }

    /**
     * 更新
     *
     * @param param 参数
     */
    public Boolean updatePayAward(PayAwardParam param) {
        if (param.getId() != null) {
            PayAwardRecord payAward = db().newRecord(PAY_AWARD, param);
            List<Integer> payAwardPrizeIds = savePayAwardPrize(param, payAward, false);
            payAward.setAwardList(null);
            payAward.update();
            db().delete(PAY_AWARD_PRIZE).where(PAY_AWARD_PRIZE.ID.notIn(payAwardPrizeIds)).and(PAY_AWARD_PRIZE.PAY_AWARD_ID.eq(payAward.getId())).execute();
            Set<String> keys = jedisManager.keys(REDIS_PAY_AWARD + "*");
            jedisManager.delete(keys);
            return true;
        }
        return false;
    }

    /**
     * 根据id获取活动
     *
     * @param id
     * @return
     */
    public PayAwardVo getPayAwardId(Integer id) {
        PayAwardRecord record = db().selectFrom(PAY_AWARD).where(PAY_AWARD.ID.eq(id)).fetchOne();
        return recordToPayAwardVo(record);
    }

    /**
     * PayAwardRecord转PayAwardVo
     *
     * @param record PayAwardRecord
     * @return PayAwardVo
     */
    private PayAwardVo recordToPayAwardVo(PayAwardRecord record) {
        if (record == null) {
            return null;
        }
        PayAwardVo payAwardVo = record.into(PayAwardVo.class);
        List<PayAwardContentBo> awardContentList = getPayAwardPrizeToBo(record.getId());
        payAwardVo.setAwardContentList(awardContentList);
        return payAwardVo;
    }

    /**
     * 查询活动奖励
     *
     * @param payAwardId
     * @return
     */
    private List<PayAwardContentBo> getPayAwardPrizeToBo(Integer payAwardId) {
        Result<PayAwardPrizeRecord> fetch = db().selectFrom(PAY_AWARD_PRIZE).where(PAY_AWARD_PRIZE.PAY_AWARD_ID.eq(payAwardId)).fetch();
        List<PayAwardContentBo> awardContentList = new ArrayList<>();
        fetch.forEach(awardPrize -> {
            PayAwardContentBo payAwardBo = awardPrize.into(PayAwardContentBo.class);
            payAwardBo.setAccountNumber(awardPrize.getAccount());
            if (awardPrize.getGiftType().equals(GIVE_TYPE_ORDINARY_COUPON) || awardPrize.getGiftType().equals(GIVE_TYPE_SPLIT_COUPON)) {
                List<CouponView> couponViewByIds = couponService.getCouponViewByIds(Util.stringToList(awardPrize.getCouponIds()));
                payAwardBo.setCouponView(couponViewByIds);
            } else if (awardPrize.getGiftType().equals(GIVE_TYPE_GOODS)) {
                ProductSmallInfoVo product = goodsService.getProductVoInfoByProductId(awardPrize.getProductId());
                payAwardBo.setProduct(product);
            }
            awardContentList.add(payAwardBo);
        });
        return awardContentList;
    }


    /**
     * 获取支付有礼列表
     *
     * @param param
     * @return
     */
    public PageResult<PayAwardListVo> getPayAwardList(PayAwardListParam param) {
        Timestamp nowTime = new Timestamp(System.currentTimeMillis());
        SelectConditionStep<? extends Record> select = db()
            .select(PAY_AWARD.ID, PAY_AWARD.ACTIVITY_NAMES, PAY_AWARD.TIME_TYPE, PAY_AWARD.START_TIME,
                PAY_AWARD.END_TIME, PAY_AWARD.ACT_FIRST, PAY_AWARD.STATUS, PAY_AWARD.AWARD_LIST,
                PAY_AWARD.GOODS_AREA_TYPE, PAY_AWARD.MIN_PAY_MONEY)
            .from(PAY_AWARD)
            .where(PAY_AWARD.DEL_FLAG.eq(DelFlag.NORMAL_VALUE));
        switch (param.getNavType()) {
            case BaseConstant.NAVBAR_TYPE_ONGOING:
                select.and(PAY_AWARD.TIME_TYPE.eq(ACTIVITY_IS_FOREVER).or(
                    PAY_AWARD.TIME_TYPE.eq(ACTIVITY_NOT_FOREVER)
                        .and(PAY_AWARD.START_TIME.lt(nowTime))
                        .and(PAY_AWARD.END_TIME.gt(nowTime))))
                    .and(PAY_AWARD.STATUS.eq(ACTIVITY_STATUS_NORMAL));
                break;
            case BaseConstant.NAVBAR_TYPE_NOT_STARTED:
                select.and(PAY_AWARD.STATUS.eq(ACTIVITY_STATUS_NORMAL))
                    .and(PAY_AWARD.TIME_TYPE.eq(ACTIVITY_NOT_FOREVER))
                    .and(PAY_AWARD.START_TIME.gt(nowTime));
                break;
            case BaseConstant.NAVBAR_TYPE_FINISHED:
                select.and(PAY_AWARD.STATUS.eq(ACTIVITY_STATUS_NORMAL))
                    .and(PAY_AWARD.TIME_TYPE.eq(ACTIVITY_NOT_FOREVER))
                    .and(PAY_AWARD.END_TIME.lt(nowTime));
                break;
            case BaseConstant.NAVBAR_TYPE_DISABLED:
                select.and(PAY_AWARD.STATUS.eq(ACTIVITY_STATUS_DISABLE));
                break;
            default:
        }
        select.orderBy(PAY_AWARD.ACT_FIRST.desc(), PAY_AWARD.CREATE_TIME.desc());
        PageResult<PayAwardListVo> pageResult = getPageResult(select, param.getCurrentPage(), param.getPageRows(), PayAwardListVo.class);
        pageResult.getDataList().forEach(payAward -> {
            List<PayAwardContentBo> payAwardPrizeToBo = getPayAwardPrizeToBo(payAward.getId());
            payAward.setAwardContentList(payAwardPrizeToBo);
            payAward.setCurrentState(Util.getActStatus(payAward.getStatus(), payAward.getStartTime(), payAward.getEndTime(), payAward.getTimeType()));
        });
        return pageResult;
    }

    /**
     * 停用启用
     *
     * @param param
     */
    public void changeStatus(PayAwardIdParam param) {
        PayAwardRecord record = db().newRecord(PAY_AWARD);
        record.setId(param.getId());
        record.refresh();
        if (ACTIVITY_STATUS_NORMAL.equals(record.getStatus())) {
            record.setStatus(ACTIVITY_STATUS_DISABLE);
        } else {
            record.setStatus(ACTIVITY_STATUS_NORMAL);
        }
        record.update();
    }

    /**
     * 支付有礼列表
     *
     * @param param
     * @return
     */
    public PageResult<PayAwardRecordListVo> getPayRewardRecordList(PayAwardRecordListParam param) {
        return payAwardRecordService.getPayRewardRecordList(param);

    }

    /**
     * 获取正在进行中的活动
     *
     * @param date
     * @return
     */
    public PayAwardVo getGoingPayAward(Timestamp date) {
        PayAwardRecord record = db().selectFrom(PAY_AWARD)
            .where(PAY_AWARD.DEL_FLAG.eq(DelFlag.NORMAL_VALUE))
            .and(PAY_AWARD.STATUS.eq(ACTIVITY_STATUS_NORMAL))
            .and(
                PAY_AWARD.TIME_TYPE.eq(ACTIVITY_IS_FOREVER)
                    .or(
                        PAY_AWARD.TIME_TYPE.eq(ACTIVITY_NOT_FOREVER)
                            .and(PAY_AWARD.START_TIME.le(date))
                            .and(PAY_AWARD.END_TIME.gt(date))
                    )
            ).orderBy(PAY_AWARD.ACT_FIRST.desc(), PAY_AWARD.CREATE_TIME.desc())
            .limit(0, 1)
            .fetchOne();
        return recordToPayAwardVo(record);
    }

    /**
     * 获取活动
     *
     * @param payAwardId
     * @return
     */
    public PayAwardVo getPayAwardById(Integer payAwardId) {
        PayAwardRecord payAwardRecord = db().selectFrom(PAY_AWARD).where(PAY_AWARD.ID.eq(payAwardId)).fetchOne();
        return recordToPayAwardVo(payAwardRecord);
    }


    /**
     * 获取订单的支付有礼活动
     *
     * @param orderSn
     * @param lang
     */
    public PayAwardOrderVo getOrderPayAward(String orderSn, String lang) {
        //查询orderSN支付有礼活动记录
        PayAwardRecordRecord payAwardRecord = payAwardRecordService.getPayAwardRecordByOrderSn(orderSn);
        if (payAwardRecord == null) {
            logger().info("订单orderSn:{},没有参与支付有礼活动", orderSn);
            return null;
        }
        PayAwardRecord payAward = db().selectFrom(PAY_AWARD).where(PAY_AWARD.ID.eq(payAwardRecord.getAwardId())).fetchOne();
        Result<PayAwardPrizeRecord> payAwardPrizeRecords = db().selectFrom(PAY_AWARD_PRIZE).where(PAY_AWARD_PRIZE.PAY_AWARD_ID.eq(payAwardRecord.getAwardId())).fetch();
        PayAwardPrizeRecord payAwardPrizeRecord = payAwardPrizeRecords.get(payAwardRecord.getAwardTimes());
        PayAwardPrizeVo prizeVo = new PayAwardPrizeVo();
        prizeVo.setGiftType(payAwardRecord.getGiftType());
        if (payAwardRecord.getSendData() == null) {

        }
        switch (payAwardRecord.getGiftType()) {
            case GIVE_TYPE_NO_PRIZE:
                logger().info("无奖励");
                break;
            case GIVE_TYPE_ORDINARY_COUPON:
                logger().info("优惠卷");
            case GIVE_TYPE_SPLIT_COUPON:
                logger().info("分裂优惠卷");
                //已发的优惠卷
                List<CouponView> couponViews = couponService.getCouponViewByIds(Util.stringToList(payAwardRecord.getSendData()));
                if (couponViews.size() > 0) {
                    prizeVo.setCouponView(couponViews);
                }
                break;
            case GIVE_TYPE_LOTTERY:
                logger().info("幸运大抽奖");
                prizeVo.setLotteryId(Integer.parseInt(payAwardRecord.getAwardData()));
                break;
            case GIVE_TYPE_BALANCE:
                logger().info("余额");
                prizeVo.setAccount(new BigDecimal(payAwardRecord.getSendData()));
                break;
            case GIVE_TYPE_GOODS:
                logger().info("奖品");
                PrizeRecordRecord prizeRecordRecord = prizeRecordService.getById(Integer.valueOf(payAwardRecord.getSendData()));
                ProductSmallInfoVo product = goodsService.getProductVoInfoByProductId(prizeRecordRecord.getPrdId());
                prizeVo.setProduct(product);
                prizeVo.setProductId(Integer.parseInt(payAwardRecord.getAwardData()));
                prizeVo.setKeepDays(payAwardRecord.getKeepDays());
                prizeVo.setPrizeId(Integer.parseInt(payAwardRecord.getSendData()));
                break;
            case GIVE_TYPE_SCORE:
                logger().info("积分");
                prizeVo.setScoreNumber(Integer.parseInt(payAwardRecord.getAwardData()));
                break;
            case GIVE_TYPE_CUSTOM:
                logger().info("自定义");
                PayAwardContentBo payAwardContentBo = Util.parseJson(payAwardRecord.getAwardData(), PayAwardContentBo.class);
                if (payAwardContentBo != null) {
                    prizeVo.setCustomImage(payAwardContentBo.getCustomImage());
                    prizeVo.setCustomLink(payAwardContentBo.getCustomLink());
                }
                break;
            default:
        }
        String payAwardMessage = getPayAwardMessage(payAward, payAwardPrizeRecords, payAwardRecord, lang);
        PayAwardOrderVo payAwardOrderVo = new PayAwardOrderVo();
        payAwardOrderVo.setPayAwardPrize(prizeVo);
        payAwardOrderVo.setPayAwardSize(payAwardPrizeRecords.size());
        payAwardOrderVo.setMessage(payAwardMessage);
        payAwardOrderVo.setCurrentAwardTimes(payAwardRecord.getAwardTimes() + 1);
        return payAwardOrderVo;
    }

    /**
     * @param payAward
     * @param payAwardPrizeList
     * @return
     */
    public String getPayAwardMessage(PayAwardRecord payAward, List<PayAwardPrizeRecord> payAwardPrizeList, PayAwardRecordRecord payAwardRecord, String lang) {
        int size = payAwardPrizeList.size();
        Integer joinAwardCount = jedisManager.getIncrValueAndSave(REDIS_PAY_AWARD_JOIN_COUNT + payAward.getId() + "," + payAwardRecord.getUserId(), 60000,
            () -> payAwardRecordService.getJoinAwardCount(payAwardRecord.getUserId(), payAward.getId()).toString()).intValue();
        logger().info("用户:{},参与次数:{}", payAwardRecord.getUserId(), joinAwardCount);
        int circleTimes = (joinAwardCount + 1) / size;
        logger().info("循环次数:{}", circleTimes);
        if (payAward.getLimitTimes() > 0 && payAward.getLimitTimes() <= circleTimes) {
            jedisManager.delete(REDIS_PAY_AWARD_JOIN_COUNT + payAward.getId() + "," + payAwardRecord.getUserId());
            logger().info("参与次数到达上限:{}", payAward.getLimitTimes());
            return "";
        }
        if (size == 1) {
            logger().debug("单次");
            String payAwardPrizeName = getPayAwardPrizeName(payAwardPrizeList.get(0), lang);
            if (payAward.getGoodsAreaType().equals(BaseConstant.GOODS_AREA_TYPE_ALL.intValue())) {
                if (payAward.getMinPayMoney().compareTo(BigDecimal.ZERO) == 0) {
                    logger().debug("单次不限制");
                    return Util.translateMessage(lang, JsonResultMessage.PAY_AWARD_ACTIVITY_MESSAGE_ONCE_UNCONDITIONAL, MESSAGE, new Object[]{payAwardPrizeName});
                } else {
                    logger().debug("单次限制-最少金额");
                    String limitAmount = Util.translateMessage(lang, JsonResultMessage.PAY_AWARD_ACTIVITY_MESSAGE_AMOUNT_GOODS, MESSAGE, new Object[]{payAward.getMinPayMoney()});
                    return Util.translateMessage(lang, JsonResultMessage.PAY_AWARD_ACTIVITY_MESSAGE_ONCE_CONDITIONAL, MESSAGE, new Object[]{limitAmount, payAwardPrizeName});
                }
            } else {
                logger().debug("单次限制");
                String limitGoods = Util.translateMessage(lang, JsonResultMessage.PAY_AWARD_ACTIVITY_MESSAGE_DESIGNATED_GOODS, MESSAGE);
                if (payAward.getMinPayMoney().compareTo(BigDecimal.ZERO) == 0) {
                    logger().debug("单次限制-指定商品");
                    return Util.translateMessage(lang, JsonResultMessage.PAY_AWARD_ACTIVITY_MESSAGE_ONCE_CONDITIONAL, MESSAGE, new Object[]{limitGoods, payAwardPrizeName});
                } else {
                    String limitAmount = Util.translateMessage(lang, JsonResultMessage.PAY_AWARD_ACTIVITY_MESSAGE_AMOUNT_GOODS, MESSAGE, new Object[]{payAward.getMinPayMoney()});
                    logger().debug("单次限制-指定商品,最少金额");
                    limitGoods = limitGoods + Util.translateMessage(lang, JsonResultMessage.PAY_AWARD_ACTIVITY_MESSAGE_CONDITIONAL, MESSAGE);
                    limitGoods = limitGoods + limitAmount;
                    return Util.translateMessage(lang, JsonResultMessage.PAY_AWARD_ACTIVITY_MESSAGE_ONCE_CONDITIONAL, MESSAGE, new Object[]{limitGoods, payAwardPrizeName});
                }
            }
        } else if (size > 1) {
            logger().debug("多次");
            int count = 0;
            for (PayAwardPrizeRecord payAwardPrize : payAwardPrizeList) {
                count++;
                if (payAwardPrize.getGiftType() != GIVE_TYPE_NO_PRIZE) {

                    break;
                }
            }
            if (count == size) {
                String payAwardPrizeName = getPayAwardPrizeName(payAwardPrizeList.get(count - 1), lang);
                logger().debug("最后一次奖励");
                if (payAward.getGoodsAreaType().equals(BaseConstant.GOODS_AREA_TYPE_ALL.intValue())) {
                    if (payAward.getMinPayMoney().compareTo(BigDecimal.ZERO) == 0) {
                        logger().debug("多次不限制");
                        return Util.translateMessage(lang, JsonResultMessage.PAY_AWARD_ACTIVITY_MESSAGE_MULTIPLE_FINALLY_UNCONDITIONAL, MESSAGE, new Object[]{size, payAwardPrizeName});
                    } else {
                        String limitAmount = Util.translateMessage(lang, JsonResultMessage.PAY_AWARD_ACTIVITY_MESSAGE_AMOUNT_GOODS, MESSAGE, new Object[]{payAward.getMinPayMoney()});
                        logger().debug("多次限制-最少金额");
                        return Util.translateMessage(lang, JsonResultMessage.PAY_AWARD_ACTIVITY_MESSAGE_MULTIPLE_FINALLY_CONDITIONAL, MESSAGE, new Object[]{size, limitAmount, payAwardPrizeName});
                    }
                } else {
                    logger().debug("多次限制");
                    String limitGoods = Util.translateMessage(lang, JsonResultMessage.PAY_AWARD_ACTIVITY_MESSAGE_DESIGNATED_GOODS, MESSAGE);
                    if (payAward.getMinPayMoney().compareTo(BigDecimal.ZERO) == 0) {
                        logger().debug("多次限制-指定商品");
                        return Util.translateMessage(lang, JsonResultMessage.PAY_AWARD_ACTIVITY_MESSAGE_MULTIPLE_FINALLY_CONDITIONAL, MESSAGE, new Object[]{size, limitGoods, payAwardPrizeName});
                    } else {
                        logger().debug("多次限制-指定商品,最少金额");
                        String limitAmount = Util.translateMessage(lang, JsonResultMessage.PAY_AWARD_ACTIVITY_MESSAGE_AMOUNT_GOODS, MESSAGE, new Object[]{payAward.getMinPayMoney()});
                        limitGoods = limitGoods + Util.translateMessage(lang, JsonResultMessage.PAY_AWARD_ACTIVITY_MESSAGE_CONDITIONAL, MESSAGE) + limitAmount;
                        return Util.translateMessage(lang, JsonResultMessage.PAY_AWARD_ACTIVITY_MESSAGE_MULTIPLE_FINALLY_CONDITIONAL, MESSAGE, new Object[]{size, limitGoods, payAwardPrizeName});
                    }
                }
            } else {
                if ((payAwardRecord.getAwardTimes() + 1) >= count) {
                    //最近下一次奖品
                    count = 0;
                    for (PayAwardPrizeRecord payAwardPrize : payAwardPrizeList) {
                        count++;
                        if (payAwardPrize.getGiftType() != GIVE_TYPE_NO_PRIZE && count > (payAwardRecord.getAwardTimes() + 1)) {
                            break;
                        }
                    }
                }
                String payAwardPrizeName = getPayAwardPrizeName(payAwardPrizeList.get(count - 1), lang);
                if (payAward.getGoodsAreaType().equals(BaseConstant.GOODS_AREA_TYPE_ALL.intValue())) {
                    if (payAward.getMinPayMoney().compareTo(BigDecimal.ZERO) == 0) {
                        logger().debug("多次不限制");
                        return Util.translateMessage(lang, JsonResultMessage.PAY_AWARD_ACTIVITY_MESSAGE_MULTIPLE_UNCONDITIONAL, MESSAGE, new Object[]{count, payAwardPrizeName});
                    } else {
                        logger().debug("多次限制-最少金额");
                        String limitAmount = Util.translateMessage(lang, JsonResultMessage.PAY_AWARD_ACTIVITY_MESSAGE_AMOUNT_GOODS, MESSAGE, payAward.getMinPayMoney());
                        return Util.translateMessage(lang, JsonResultMessage.PAY_AWARD_ACTIVITY_MESSAGE_MULTIPLE_CONDITIONAL, MESSAGE, new Object[]{count, limitAmount, payAwardPrizeName});
                    }
                } else {
                    logger().debug("多次限制");
                    String limitGoods = Util.translateMessage(lang, JsonResultMessage.PAY_AWARD_ACTIVITY_MESSAGE_DESIGNATED_GOODS, MESSAGE);
                    if (payAward.getMinPayMoney().compareTo(BigDecimal.ZERO) == 0) {
                        logger().debug("多次限制-指定商品");
                        return Util.translateMessage(lang, JsonResultMessage.PAY_AWARD_ACTIVITY_MESSAGE_MULTIPLE_CONDITIONAL, MESSAGE, new Object[]{count, limitGoods, payAwardPrizeName});
                    } else {
                        logger().debug("多次限制-指定商品,最少金额");
                        String limitAmount = Util.translateMessage(lang, JsonResultMessage.PAY_AWARD_ACTIVITY_MESSAGE_AMOUNT_GOODS, MESSAGE, payAward.getMinPayMoney());
                        limitGoods = limitGoods + Util.translateMessage(lang, JsonResultMessage.PAY_AWARD_ACTIVITY_MESSAGE_CONDITIONAL, MESSAGE) + limitAmount;
                        return Util.translateMessage(lang, JsonResultMessage.PAY_AWARD_ACTIVITY_MESSAGE_MULTIPLE_CONDITIONAL, MESSAGE, new Object[]{count, limitGoods, payAwardPrizeName});
                    }
                }
            }
        }
        return "";
    }

    /**
     * @param payAwardPrize
     * @param lang
     * @return
     */
    public String getPayAwardPrizeName(PayAwardPrizeRecord payAwardPrize, String lang) {
        String prizeName = "";
        switch (payAwardPrize.getGiftType()) {
            case GIVE_TYPE_NO_PRIZE:
                logger().info("无奖励");
                break;
            case GIVE_TYPE_ORDINARY_COUPON:
                logger().info("优惠卷");
            case GIVE_TYPE_SPLIT_COUPON:
                logger().info("分裂优惠卷");
                List<CouponView> couponViews = couponService.getCouponViewByIds(Util.stringToList(payAwardPrize.getCouponIds()));
                prizeName = couponViews.stream().map(CouponView::getActName).collect(Collectors.joining(";"));
                break;
            case GIVE_TYPE_LOTTERY:
                logger().info("幸运大抽奖");
                LotteryRecord lottery = lotteryService.getLotteryById(payAwardPrize.getLotteryId());
                prizeName = lottery.getLotteryName();
                break;
            case GIVE_TYPE_BALANCE:
                logger().info("余额");
                prizeName = Util.translateMessage(lang, JsonResultMessage.PAY_AWARD_ACTIVITY_MESSAGE_AMOUNT_BALANCE, MESSAGE);
                prizeName += payAwardPrize.getAccount().toString();
                break;
            case GIVE_TYPE_GOODS:
                logger().info("奖品");
                ProductSmallInfoVo productSmallInfoVo = goodsService.getProductVoInfoByProductId(payAwardPrize.getProductId());
                prizeName = productSmallInfoVo.getGoodsName();
                break;
            case GIVE_TYPE_SCORE:
                logger().info("积分");
                prizeName = Util.translateMessage(lang, JsonResultMessage.PAY_AWARD_ACTIVITY_MESSAGE_AMOUNT_SCORE, MESSAGE);
                prizeName += payAwardPrize.getScoreNumber();
                break;
            case GIVE_TYPE_CUSTOM:
                logger().info("自定义");
                prizeName = Util.translateMessage(lang, JsonResultMessage.PAY_AWARD_ACTIVITY_MESSAGE_AMOUNT_CUSTOM, MESSAGE);
                break;
            default:
        }
        return prizeName;
    }

    /**
     * 小程序-商品详情-支付有礼促销信息
     * @param goodsId 商品ID
     * @param catId 平台分类ID
     * @param sortId 商家分类ID
     * @param now 限制时间
     * @return 支付有礼促销信息 null:无有效活动
     */
    public PayAwardPromotion getPayAwardPromotionInfo(Integer goodsId, Integer catId, Integer sortId,Timestamp now) {
        Condition condition = PAY_AWARD.DEL_FLAG.eq(DelFlag.NORMAL_VALUE).and(PAY_AWARD.STATUS.eq(BaseConstant.ACTIVITY_STATUS_NORMAL))
            .and(PAY_AWARD.TIME_TYPE.eq(FOREVER_TIME).or(PAY_AWARD.TIME_TYPE.eq(POINT_TIME).and(PAY_AWARD.START_TIME.le(now)).and(PAY_AWARD.END_TIME.ge(now))));

        Record6<Integer, Integer, BigDecimal, String, String, String> record6 = db().select(PAY_AWARD.ID, PAY_AWARD.GOODS_AREA_TYPE, PAY_AWARD.MIN_PAY_MONEY, PAY_AWARD.GOODS_IDS, PAY_AWARD.GOODS_SORT_IDS, PAY_AWARD.GOODS_CAT_IDS)
            .from(PAY_AWARD).where(condition).orderBy(PAY_AWARD.ACT_FIRST.desc(), PAY_AWARD.CREATE_TIME.desc()).fetchAny();

        if (record6 == null) {
            return null;
        }

        Boolean isAll = ALL_GOODS.equals(record6.get(PAY_AWARD.GOODS_AREA_TYPE));
        if (!isAll) {
            List<Integer> goodsIds=StringUtils.isBlank(record6.get(PAY_AWARD.GOODS_IDS))?new ArrayList<>(0):Arrays.stream(record6.get(PAY_AWARD.GOODS_IDS).split(",")).map(Integer::parseInt).collect(Collectors.toList());
            List<Integer> catIds=StringUtils.isBlank(record6.get(PAY_AWARD.GOODS_CAT_IDS))?new ArrayList<>(0):Arrays.stream(record6.get(PAY_AWARD.GOODS_CAT_IDS).split(",")).map(Integer::parseInt).collect(Collectors.toList());
            List<Integer> sortIds=StringUtils.isBlank(record6.get(PAY_AWARD.GOODS_SORT_IDS))?new ArrayList<>(0):Arrays.stream(record6.get(PAY_AWARD.GOODS_SORT_IDS).split(",")).map(Integer::parseInt).collect(Collectors.toList());
            if (!goodsIds.contains(goodsId) && !catIds.contains(catId) && !sortIds.contains(sortId)) {
                return null;
            }
        }

        PayAwardPromotion promotion = new PayAwardPromotion();
        promotion.setPromotionId(record6.get(PAY_AWARD.ID));
        promotion.setGoodsAreaType(record6.get(PAY_AWARD.GOODS_AREA_TYPE));
        promotion.setMinPayMoney(record6.get(PAY_AWARD.MIN_PAY_MONEY));
        return promotion;
    }

}
