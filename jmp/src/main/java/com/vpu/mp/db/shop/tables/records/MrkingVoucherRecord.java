/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables.records;


import com.vpu.mp.db.shop.tables.MrkingVoucher;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MrkingVoucherRecord extends UpdatableRecordImpl<MrkingVoucherRecord> {

    private static final long serialVersionUID = -1682472655;

    /**
     * Setter for <code>jmini_shop_471752.b2c_mrking_voucher.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>jmini_shop_471752.b2c_mrking_voucher.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>jmini_shop_471752.b2c_mrking_voucher.shop_id</code>. 店铺id
     */
    public void setShopId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>jmini_shop_471752.b2c_mrking_voucher.shop_id</code>. 店铺id
     */
    public Integer getShopId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>jmini_shop_471752.b2c_mrking_voucher.act_code</code>.
     */
    public void setActCode(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>jmini_shop_471752.b2c_mrking_voucher.act_code</code>.
     */
    public String getActCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>jmini_shop_471752.b2c_mrking_voucher.act_name</code>.
     */
    public void setActName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>jmini_shop_471752.b2c_mrking_voucher.act_name</code>.
     */
    public String getActName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>jmini_shop_471752.b2c_mrking_voucher.start_time</code>.
     */
    public void setStartTime(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>jmini_shop_471752.b2c_mrking_voucher.start_time</code>.
     */
    public Timestamp getStartTime() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>jmini_shop_471752.b2c_mrking_voucher.end_time</code>.
     */
    public void setEndTime(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>jmini_shop_471752.b2c_mrking_voucher.end_time</code>.
     */
    public Timestamp getEndTime() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>jmini_shop_471752.b2c_mrking_voucher.denomination</code>. 面额
     */
    public void setDenomination(BigDecimal value) {
        set(6, value);
    }

    /**
     * Getter for <code>jmini_shop_471752.b2c_mrking_voucher.denomination</code>. 面额
     */
    public BigDecimal getDenomination() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>jmini_shop_471752.b2c_mrking_voucher.total_amount</code>. 发行量
     */
    public void setTotalAmount(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>jmini_shop_471752.b2c_mrking_voucher.total_amount</code>. 发行量
     */
    public Integer getTotalAmount() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>jmini_shop_471752.b2c_mrking_voucher.surplus</code>.
     */
    public void setSurplus(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>jmini_shop_471752.b2c_mrking_voucher.surplus</code>.
     */
    public Integer getSurplus() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>jmini_shop_471752.b2c_mrking_voucher.remain_amount</code>.
     */
    public void setRemainAmount(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>jmini_shop_471752.b2c_mrking_voucher.remain_amount</code>.
     */
    public Integer getRemainAmount() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>jmini_shop_471752.b2c_mrking_voucher.use_consume_restrict</code>. 使用限制
     */
    public void setUseConsumeRestrict(Byte value) {
        set(10, value);
    }

    /**
     * Getter for <code>jmini_shop_471752.b2c_mrking_voucher.use_consume_restrict</code>. 使用限制
     */
    public Byte getUseConsumeRestrict() {
        return (Byte) get(10);
    }

    /**
     * Setter for <code>jmini_shop_471752.b2c_mrking_voucher.least_consume</code>. 满多少可用
     */
    public void setLeastConsume(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>jmini_shop_471752.b2c_mrking_voucher.least_consume</code>. 满多少可用
     */
    public Integer getLeastConsume() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>jmini_shop_471752.b2c_mrking_voucher.use_explain</code>.
     */
    public void setUseExplain(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>jmini_shop_471752.b2c_mrking_voucher.use_explain</code>.
     */
    public String getUseExplain() {
        return (String) get(12);
    }

    /**
     * Setter for <code>jmini_shop_471752.b2c_mrking_voucher.enabled</code>.
     */
    public void setEnabled(Byte value) {
        set(13, value);
    }

    /**
     * Getter for <code>jmini_shop_471752.b2c_mrking_voucher.enabled</code>.
     */
    public Byte getEnabled() {
        return (Byte) get(13);
    }

    /**
     * Setter for <code>jmini_shop_471752.b2c_mrking_voucher.is_random</code>. 是否需要积分兑换
     */
    public void setIsRandom(Byte value) {
        set(14, value);
    }

    /**
     * Getter for <code>jmini_shop_471752.b2c_mrking_voucher.is_random</code>. 是否需要积分兑换
     */
    public Byte getIsRandom() {
        return (Byte) get(14);
    }

    /**
     * Setter for <code>jmini_shop_471752.b2c_mrking_voucher.receive_per_person</code>. 每人限领张数
     */
    public void setReceivePerPerson(Short value) {
        set(15, value);
    }

    /**
     * Getter for <code>jmini_shop_471752.b2c_mrking_voucher.receive_per_person</code>. 每人限领张数
     */
    public Short getReceivePerPerson() {
        return (Short) get(15);
    }

    /**
     * Setter for <code>jmini_shop_471752.b2c_mrking_voucher.suit_goods</code>. 0:全店通用,1:指定店铺
     */
    public void setSuitGoods(Byte value) {
        set(16, value);
    }

    /**
     * Getter for <code>jmini_shop_471752.b2c_mrking_voucher.suit_goods</code>. 0:全店通用,1:指定店铺
     */
    public Byte getSuitGoods() {
        return (Byte) get(16);
    }

    /**
     * Setter for <code>jmini_shop_471752.b2c_mrking_voucher.together_used</code>. 是否与其他优惠券同时使用
     */
    public void setTogetherUsed(Byte value) {
        set(17, value);
    }

    /**
     * Getter for <code>jmini_shop_471752.b2c_mrking_voucher.together_used</code>. 是否与其他优惠券同时使用
     */
    public Byte getTogetherUsed() {
        return (Byte) get(17);
    }

    /**
     * Setter for <code>jmini_shop_471752.b2c_mrking_voucher.permit_share</code>. 是否允许分享优惠券链接
     */
    public void setPermitShare(Byte value) {
        set(18, value);
    }

    /**
     * Getter for <code>jmini_shop_471752.b2c_mrking_voucher.permit_share</code>. 是否允许分享优惠券链接
     */
    public Byte getPermitShare() {
        return (Byte) get(18);
    }

    /**
     * Setter for <code>jmini_shop_471752.b2c_mrking_voucher.remind_owner</code>. 是否到期前提醒用户
     */
    public void setRemindOwner(Byte value) {
        set(19, value);
    }

    /**
     * Getter for <code>jmini_shop_471752.b2c_mrking_voucher.remind_owner</code>. 是否到期前提醒用户
     */
    public Byte getRemindOwner() {
        return (Byte) get(19);
    }

    /**
     * Setter for <code>jmini_shop_471752.b2c_mrking_voucher.giveout_amount</code>. 发放优惠券数量
     */
    public void setGiveoutAmount(Short value) {
        set(20, value);
    }

    /**
     * Getter for <code>jmini_shop_471752.b2c_mrking_voucher.giveout_amount</code>. 发放优惠券数量
     */
    public Short getGiveoutAmount() {
        return (Short) get(20);
    }

    /**
     * Setter for <code>jmini_shop_471752.b2c_mrking_voucher.giveout_person</code>. 发放优惠券人数
     */
    public void setGiveoutPerson(Short value) {
        set(21, value);
    }

    /**
     * Getter for <code>jmini_shop_471752.b2c_mrking_voucher.giveout_person</code>. 发放优惠券人数
     */
    public Short getGiveoutPerson() {
        return (Short) get(21);
    }

    /**
     * Setter for <code>jmini_shop_471752.b2c_mrking_voucher.receive_amount</code>. 领取优惠券数量
     */
    public void setReceiveAmount(Short value) {
        set(22, value);
    }

    /**
     * Getter for <code>jmini_shop_471752.b2c_mrking_voucher.receive_amount</code>. 领取优惠券数量
     */
    public Short getReceiveAmount() {
        return (Short) get(22);
    }

    /**
     * Setter for <code>jmini_shop_471752.b2c_mrking_voucher.receive_person</code>. 领取优惠券人数
     */
    public void setReceivePerson(Short value) {
        set(23, value);
    }

    /**
     * Getter for <code>jmini_shop_471752.b2c_mrking_voucher.receive_person</code>. 领取优惠券人数
     */
    public Short getReceivePerson() {
        return (Short) get(23);
    }

    /**
     * Setter for <code>jmini_shop_471752.b2c_mrking_voucher.used_amount</code>. 已使用优惠券数量
     */
    public void setUsedAmount(Short value) {
        set(24, value);
    }

    /**
     * Getter for <code>jmini_shop_471752.b2c_mrking_voucher.used_amount</code>. 已使用优惠券数量
     */
    public Short getUsedAmount() {
        return (Short) get(24);
    }

    /**
     * Setter for <code>jmini_shop_471752.b2c_mrking_voucher.alias_code</code>. 唯一活动代码
     */
    public void setAliasCode(String value) {
        set(25, value);
    }

    /**
     * Getter for <code>jmini_shop_471752.b2c_mrking_voucher.alias_code</code>. 唯一活动代码
     */
    public String getAliasCode() {
        return (String) get(25);
    }

    /**
     * Setter for <code>jmini_shop_471752.b2c_mrking_voucher.validation_code</code>. 领取码
     */
    public void setValidationCode(String value) {
        set(26, value);
    }

    /**
     * Getter for <code>jmini_shop_471752.b2c_mrking_voucher.validation_code</code>. 领取码
     */
    public String getValidationCode() {
        return (String) get(26);
    }

    /**
     * Setter for <code>jmini_shop_471752.b2c_mrking_voucher.recommend_goods_id</code>. 指定商品可用
     */
    public void setRecommendGoodsId(String value) {
        set(27, value);
    }

    /**
     * Getter for <code>jmini_shop_471752.b2c_mrking_voucher.recommend_goods_id</code>. 指定商品可用
     */
    public String getRecommendGoodsId() {
        return (String) get(27);
    }

    /**
     * Setter for <code>jmini_shop_471752.b2c_mrking_voucher.recommend_cat_id</code>. 指定平台可用
     */
    public void setRecommendCatId(String value) {
        set(28, value);
    }

    /**
     * Getter for <code>jmini_shop_471752.b2c_mrking_voucher.recommend_cat_id</code>. 指定平台可用
     */
    public String getRecommendCatId() {
        return (String) get(28);
    }

    /**
     * Setter for <code>jmini_shop_471752.b2c_mrking_voucher.recommend_sort_id</code>. 指定商家分类可用
     */
    public void setRecommendSortId(String value) {
        set(29, value);
    }

    /**
     * Getter for <code>jmini_shop_471752.b2c_mrking_voucher.recommend_sort_id</code>. 指定商家分类可用
     */
    public String getRecommendSortId() {
        return (String) get(29);
    }

    /**
     * Setter for <code>jmini_shop_471752.b2c_mrking_voucher.validity</code>. 优惠券有效天数
     */
    public void setValidity(Integer value) {
        set(30, value);
    }

    /**
     * Getter for <code>jmini_shop_471752.b2c_mrking_voucher.validity</code>. 优惠券有效天数
     */
    public Integer getValidity() {
        return (Integer) get(30);
    }

    /**
     * Setter for <code>jmini_shop_471752.b2c_mrking_voucher.del_flag</code>. 1为删除状态
     */
    public void setDelFlag(Byte value) {
        set(31, value);
    }

    /**
     * Getter for <code>jmini_shop_471752.b2c_mrking_voucher.del_flag</code>. 1为删除状态
     */
    public Byte getDelFlag() {
        return (Byte) get(31);
    }

    /**
     * Setter for <code>jmini_shop_471752.b2c_mrking_voucher.action</code>. 1:系統创建 2：来自crm
     */
    public void setAction(Byte value) {
        set(32, value);
    }

    /**
     * Getter for <code>jmini_shop_471752.b2c_mrking_voucher.action</code>. 1:系統创建 2：来自crm
     */
    public Byte getAction() {
        return (Byte) get(32);
    }

    /**
     * Setter for <code>jmini_shop_471752.b2c_mrking_voucher.identity_id</code>. 关联外部优惠券规则唯一码
     */
    public void setIdentityId(String value) {
        set(33, value);
    }

    /**
     * Getter for <code>jmini_shop_471752.b2c_mrking_voucher.identity_id</code>. 关联外部优惠券规则唯一码
     */
    public String getIdentityId() {
        return (String) get(33);
    }

    /**
     * Setter for <code>jmini_shop_471752.b2c_mrking_voucher.recommend_product_id</code>. 关联商品规格
     */
    public void setRecommendProductId(String value) {
        set(34, value);
    }

    /**
     * Getter for <code>jmini_shop_471752.b2c_mrking_voucher.recommend_product_id</code>. 关联商品规格
     */
    public String getRecommendProductId() {
        return (String) get(34);
    }

    /**
     * Setter for <code>jmini_shop_471752.b2c_mrking_voucher.use_score</code>. 是否可以积分兑换
     */
    public void setUseScore(Byte value) {
        set(35, value);
    }

    /**
     * Getter for <code>jmini_shop_471752.b2c_mrking_voucher.use_score</code>. 是否可以积分兑换
     */
    public Byte getUseScore() {
        return (Byte) get(35);
    }

    /**
     * Setter for <code>jmini_shop_471752.b2c_mrking_voucher.score_number</code>. 需要积分数
     */
    public void setScoreNumber(Integer value) {
        set(36, value);
    }

    /**
     * Getter for <code>jmini_shop_471752.b2c_mrking_voucher.score_number</code>. 需要积分数
     */
    public Integer getScoreNumber() {
        return (Integer) get(36);
    }

    /**
     * Setter for <code>jmini_shop_471752.b2c_mrking_voucher.card_id</code>. 专属会员卡
     */
    public void setCardId(String value) {
        set(37, value);
    }

    /**
     * Getter for <code>jmini_shop_471752.b2c_mrking_voucher.card_id</code>. 专属会员卡
     */
    public String getCardId() {
        return (String) get(37);
    }

    /**
     * Setter for <code>jmini_shop_471752.b2c_mrking_voucher.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(38, value);
    }

    /**
     * Getter for <code>jmini_shop_471752.b2c_mrking_voucher.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(38);
    }

    /**
     * Setter for <code>jmini_shop_471752.b2c_mrking_voucher.update_time</code>. 最后修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(39, value);
    }

    /**
     * Getter for <code>jmini_shop_471752.b2c_mrking_voucher.update_time</code>. 最后修改时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(39);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MrkingVoucherRecord
     */
    public MrkingVoucherRecord() {
        super(MrkingVoucher.MRKING_VOUCHER);
    }

    /**
     * Create a detached, initialised MrkingVoucherRecord
     */
    public MrkingVoucherRecord(Integer id, Integer shopId, String actCode, String actName, Timestamp startTime, Timestamp endTime, BigDecimal denomination, Integer totalAmount, Integer surplus, Integer remainAmount, Byte useConsumeRestrict, Integer leastConsume, String useExplain, Byte enabled, Byte isRandom, Short receivePerPerson, Byte suitGoods, Byte togetherUsed, Byte permitShare, Byte remindOwner, Short giveoutAmount, Short giveoutPerson, Short receiveAmount, Short receivePerson, Short usedAmount, String aliasCode, String validationCode, String recommendGoodsId, String recommendCatId, String recommendSortId, Integer validity, Byte delFlag, Byte action, String identityId, String recommendProductId, Byte useScore, Integer scoreNumber, String cardId, Timestamp createTime, Timestamp updateTime) {
        super(MrkingVoucher.MRKING_VOUCHER);

        set(0, id);
        set(1, shopId);
        set(2, actCode);
        set(3, actName);
        set(4, startTime);
        set(5, endTime);
        set(6, denomination);
        set(7, totalAmount);
        set(8, surplus);
        set(9, remainAmount);
        set(10, useConsumeRestrict);
        set(11, leastConsume);
        set(12, useExplain);
        set(13, enabled);
        set(14, isRandom);
        set(15, receivePerPerson);
        set(16, suitGoods);
        set(17, togetherUsed);
        set(18, permitShare);
        set(19, remindOwner);
        set(20, giveoutAmount);
        set(21, giveoutPerson);
        set(22, receiveAmount);
        set(23, receivePerson);
        set(24, usedAmount);
        set(25, aliasCode);
        set(26, validationCode);
        set(27, recommendGoodsId);
        set(28, recommendCatId);
        set(29, recommendSortId);
        set(30, validity);
        set(31, delFlag);
        set(32, action);
        set(33, identityId);
        set(34, recommendProductId);
        set(35, useScore);
        set(36, scoreNumber);
        set(37, cardId);
        set(38, createTime);
        set(39, updateTime);
    }
}
