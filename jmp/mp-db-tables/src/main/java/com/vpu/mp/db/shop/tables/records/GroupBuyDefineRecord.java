/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables.records;


import com.vpu.mp.db.shop.tables.GroupBuyDefine;

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
public class GroupBuyDefineRecord extends UpdatableRecordImpl<GroupBuyDefineRecord> {

    private static final long serialVersionUID = -889258493;

    /**
     * Setter for <code>mini_shop_4748160.b2c_group_buy_define.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_shop_4748160.b2c_group_buy_define.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_shop_4748160.b2c_group_buy_define.goods_id</code>. 商品id
     */
    public void setGoodsId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_shop_4748160.b2c_group_buy_define.goods_id</code>. 商品id
     */
    public String getGoodsId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>mini_shop_4748160.b2c_group_buy_define.name</code>. 活动名称
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_shop_4748160.b2c_group_buy_define.name</code>. 活动名称
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>mini_shop_4748160.b2c_group_buy_define.limit_amount</code>. 成团人数 不小于2人
     */
    public void setLimitAmount(Short value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_shop_4748160.b2c_group_buy_define.limit_amount</code>. 成团人数 不小于2人
     */
    public Short getLimitAmount() {
        return (Short) get(3);
    }

    /**
     * Setter for <code>mini_shop_4748160.b2c_group_buy_define.join_limit</code>. 参团限制 0不限制
     */
    public void setJoinLimit(Short value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_shop_4748160.b2c_group_buy_define.join_limit</code>. 参团限制 0不限制
     */
    public Short getJoinLimit() {
        return (Short) get(4);
    }

    /**
     * Setter for <code>mini_shop_4748160.b2c_group_buy_define.open_limit</code>. 开团限制 0不限制
     */
    public void setOpenLimit(Short value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_shop_4748160.b2c_group_buy_define.open_limit</code>. 开团限制 0不限制
     */
    public Short getOpenLimit() {
        return (Short) get(5);
    }

    /**
     * Setter for <code>mini_shop_4748160.b2c_group_buy_define.limit_buy_num</code>. 最少购买数 0不限制
     */
    public void setLimitBuyNum(Short value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_shop_4748160.b2c_group_buy_define.limit_buy_num</code>. 最少购买数 0不限制
     */
    public Short getLimitBuyNum() {
        return (Short) get(6);
    }

    /**
     * Setter for <code>mini_shop_4748160.b2c_group_buy_define.limit_max_num</code>. 最多购买数 0不限制
     */
    public void setLimitMaxNum(Short value) {
        set(7, value);
    }

    /**
     * Getter for <code>mini_shop_4748160.b2c_group_buy_define.limit_max_num</code>. 最多购买数 0不限制
     */
    public Short getLimitMaxNum() {
        return (Short) get(7);
    }

    /**
     * Setter for <code>mini_shop_4748160.b2c_group_buy_define.start_time</code>. 开始时间
     */
    public void setStartTime(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>mini_shop_4748160.b2c_group_buy_define.start_time</code>. 开始时间
     */
    public Timestamp getStartTime() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>mini_shop_4748160.b2c_group_buy_define.end_time</code>. 结束时间
     */
    public void setEndTime(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>mini_shop_4748160.b2c_group_buy_define.end_time</code>. 结束时间
     */
    public Timestamp getEndTime() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>mini_shop_4748160.b2c_group_buy_define.stock</code>. 总库存
     */
    public void setStock(Short value) {
        set(10, value);
    }

    /**
     * Getter for <code>mini_shop_4748160.b2c_group_buy_define.stock</code>. 总库存
     */
    public Short getStock() {
        return (Short) get(10);
    }

    /**
     * Setter for <code>mini_shop_4748160.b2c_group_buy_define.sale_num</code>. 销量
     */
    public void setSaleNum(Short value) {
        set(11, value);
    }

    /**
     * Getter for <code>mini_shop_4748160.b2c_group_buy_define.sale_num</code>. 销量
     */
    public Short getSaleNum() {
        return (Short) get(11);
    }

    /**
     * Setter for <code>mini_shop_4748160.b2c_group_buy_define.is_default</code>. 默认成团 
     */
    public void setIsDefault(Byte value) {
        set(12, value);
    }

    /**
     * Getter for <code>mini_shop_4748160.b2c_group_buy_define.is_default</code>. 默认成团 
     */
    public Byte getIsDefault() {
        return (Byte) get(12);
    }

    /**
     * Setter for <code>mini_shop_4748160.b2c_group_buy_define.activity_type</code>. 活动类型：1：普通拼团，2：老带新团
     */
    public void setActivityType(Byte value) {
        set(13, value);
    }

    /**
     * Getter for <code>mini_shop_4748160.b2c_group_buy_define.activity_type</code>. 活动类型：1：普通拼团，2：老带新团
     */
    public Byte getActivityType() {
        return (Byte) get(13);
    }

    /**
     * Setter for <code>mini_shop_4748160.b2c_group_buy_define.is_grouper_cheap</code>. 是否开启团长优惠：0：不开启，1：开启
     */
    public void setIsGrouperCheap(Byte value) {
        set(14, value);
    }

    /**
     * Getter for <code>mini_shop_4748160.b2c_group_buy_define.is_grouper_cheap</code>. 是否开启团长优惠：0：不开启，1：开启
     */
    public Byte getIsGrouperCheap() {
        return (Byte) get(14);
    }

    /**
     * Setter for <code>mini_shop_4748160.b2c_group_buy_define.shipping_type</code>. 运费类型 1免运费 2自定义
     */
    public void setShippingType(Byte value) {
        set(15, value);
    }

    /**
     * Getter for <code>mini_shop_4748160.b2c_group_buy_define.shipping_type</code>. 运费类型 1免运费 2自定义
     */
    public Byte getShippingType() {
        return (Byte) get(15);
    }

    /**
     * Setter for <code>mini_shop_4748160.b2c_group_buy_define.reward_coupon_id</code>. 拼团失败发放优惠券
     */
    public void setRewardCouponId(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>mini_shop_4748160.b2c_group_buy_define.reward_coupon_id</code>. 拼团失败发放优惠券
     */
    public String getRewardCouponId() {
        return (String) get(16);
    }

    /**
     * Setter for <code>mini_shop_4748160.b2c_group_buy_define.share_config</code>. 分享设置
     */
    public void setShareConfig(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>mini_shop_4748160.b2c_group_buy_define.share_config</code>. 分享设置
     */
    public String getShareConfig() {
        return (String) get(17);
    }

    /**
     * Setter for <code>mini_shop_4748160.b2c_group_buy_define.status</code>. 状态： 1：启用  0： 禁用 2 代表已无库存
     */
    public void setStatus(Byte value) {
        set(18, value);
    }

    /**
     * Getter for <code>mini_shop_4748160.b2c_group_buy_define.status</code>. 状态： 1：启用  0： 禁用 2 代表已无库存
     */
    public Byte getStatus() {
        return (Byte) get(18);
    }

    /**
     * Setter for <code>mini_shop_4748160.b2c_group_buy_define.del_flag</code>.
     */
    public void setDelFlag(Byte value) {
        set(19, value);
    }

    /**
     * Getter for <code>mini_shop_4748160.b2c_group_buy_define.del_flag</code>.
     */
    public Byte getDelFlag() {
        return (Byte) get(19);
    }

    /**
     * Setter for <code>mini_shop_4748160.b2c_group_buy_define.del_time</code>.
     */
    public void setDelTime(Integer value) {
        set(20, value);
    }

    /**
     * Getter for <code>mini_shop_4748160.b2c_group_buy_define.del_time</code>.
     */
    public Integer getDelTime() {
        return (Integer) get(20);
    }

    /**
     * Setter for <code>mini_shop_4748160.b2c_group_buy_define.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(21, value);
    }

    /**
     * Getter for <code>mini_shop_4748160.b2c_group_buy_define.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(21);
    }

    /**
     * Setter for <code>mini_shop_4748160.b2c_group_buy_define.update_time</code>. 最后修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(22, value);
    }

    /**
     * Getter for <code>mini_shop_4748160.b2c_group_buy_define.update_time</code>. 最后修改时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(22);
    }

    /**
     * Setter for <code>mini_shop_4748160.b2c_group_buy_define.level</code>. 优先级
     */
    public void setLevel(Integer value) {
        set(23, value);
    }

    /**
     * Getter for <code>mini_shop_4748160.b2c_group_buy_define.level</code>. 优先级
     */
    public Integer getLevel() {
        return (Integer) get(23);
    }

    /**
     * Setter for <code>mini_shop_4748160.b2c_group_buy_define.begin_num</code>. 初始成团数
     */
    public void setBeginNum(Integer value) {
        set(24, value);
    }

    /**
     * Getter for <code>mini_shop_4748160.b2c_group_buy_define.begin_num</code>. 初始成团数
     */
    public Integer getBeginNum() {
        return (Integer) get(24);
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
     * Create a detached GroupBuyDefineRecord
     */
    public GroupBuyDefineRecord() {
        super(GroupBuyDefine.GROUP_BUY_DEFINE);
    }

    /**
     * Create a detached, initialised GroupBuyDefineRecord
     */
    public GroupBuyDefineRecord(Integer id, String goodsId, String name, Short limitAmount, Short joinLimit, Short openLimit, Short limitBuyNum, Short limitMaxNum, Timestamp startTime, Timestamp endTime, Short stock, Short saleNum, Byte isDefault, Byte activityType, Byte isGrouperCheap, Byte shippingType, String rewardCouponId, String shareConfig, Byte status, Byte delFlag, Integer delTime, Timestamp createTime, Timestamp updateTime, Integer level, Integer beginNum) {
        super(GroupBuyDefine.GROUP_BUY_DEFINE);

        set(0, id);
        set(1, goodsId);
        set(2, name);
        set(3, limitAmount);
        set(4, joinLimit);
        set(5, openLimit);
        set(6, limitBuyNum);
        set(7, limitMaxNum);
        set(8, startTime);
        set(9, endTime);
        set(10, stock);
        set(11, saleNum);
        set(12, isDefault);
        set(13, activityType);
        set(14, isGrouperCheap);
        set(15, shippingType);
        set(16, rewardCouponId);
        set(17, shareConfig);
        set(18, status);
        set(19, delFlag);
        set(20, delTime);
        set(21, createTime);
        set(22, updateTime);
        set(23, level);
        set(24, beginNum);
    }
}
