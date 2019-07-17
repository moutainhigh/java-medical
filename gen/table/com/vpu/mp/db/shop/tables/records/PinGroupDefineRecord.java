/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables.records;


import com.vpu.mp.db.shop.tables.PinGroupDefine;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record21;
import org.jooq.Row21;
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
public class PinGroupDefineRecord extends UpdatableRecordImpl<PinGroupDefineRecord> implements Record21<Integer, Integer, Integer, String, Short, Short, Short, Byte, Timestamp, Timestamp, Short, Short, Byte, Byte, Integer, Byte, Byte, String, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = 1952389950;

    /**
     * Setter for <code>mini_shop_471752.b2c_pin_group_define.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_pin_group_define.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_pin_group_define.shop_id</code>. 店铺id
     */
    public void setShopId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_pin_group_define.shop_id</code>. 店铺id
     */
    public Integer getShopId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_pin_group_define.goods_id</code>. 商品id
     */
    public void setGoodsId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_pin_group_define.goods_id</code>. 商品id
     */
    public Integer getGoodsId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_pin_group_define.name</code>. 活动名称
     */
    public void setName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_pin_group_define.name</code>. 活动名称
     */
    public String getName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_pin_group_define.limit_amount</code>. 成团人数
     */
    public void setLimitAmount(Short value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_pin_group_define.limit_amount</code>. 成团人数
     */
    public Short getLimitAmount() {
        return (Short) get(4);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_pin_group_define.join_limit</code>. 参团限制
     */
    public void setJoinLimit(Short value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_pin_group_define.join_limit</code>. 参团限制
     */
    public Short getJoinLimit() {
        return (Short) get(5);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_pin_group_define.open_limit</code>. 开团限制
     */
    public void setOpenLimit(Short value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_pin_group_define.open_limit</code>. 开团限制
     */
    public Short getOpenLimit() {
        return (Short) get(6);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_pin_group_define.is_default</code>. 默认成团
     */
    public void setIsDefault(Byte value) {
        set(7, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_pin_group_define.is_default</code>. 默认成团
     */
    public Byte getIsDefault() {
        return (Byte) get(7);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_pin_group_define.start_time</code>. 开始时间
     */
    public void setStartTime(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_pin_group_define.start_time</code>. 开始时间
     */
    public Timestamp getStartTime() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_pin_group_define.end_time</code>. 结束时间
     */
    public void setEndTime(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_pin_group_define.end_time</code>. 结束时间
     */
    public Timestamp getEndTime() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_pin_group_define.stock</code>. 总库存
     */
    public void setStock(Short value) {
        set(10, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_pin_group_define.stock</code>. 总库存
     */
    public Short getStock() {
        return (Short) get(10);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_pin_group_define.sale_num</code>. 销量
     */
    public void setSaleNum(Short value) {
        set(11, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_pin_group_define.sale_num</code>. 销量
     */
    public Short getSaleNum() {
        return (Short) get(11);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_pin_group_define.del_flag</code>.
     */
    public void setDelFlag(Byte value) {
        set(12, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_pin_group_define.del_flag</code>.
     */
    public Byte getDelFlag() {
        return (Byte) get(12);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_pin_group_define.status</code>. 状态： 1：启用  0： 禁用
     */
    public void setStatus(Byte value) {
        set(13, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_pin_group_define.status</code>. 状态： 1：启用  0： 禁用
     */
    public Byte getStatus() {
        return (Byte) get(13);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_pin_group_define.del_time</code>.
     */
    public void setDelTime(Integer value) {
        set(14, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_pin_group_define.del_time</code>.
     */
    public Integer getDelTime() {
        return (Integer) get(14);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_pin_group_define.activity_type</code>. 活动类型：1：普通拼团，2：老带新团
     */
    public void setActivityType(Byte value) {
        set(15, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_pin_group_define.activity_type</code>. 活动类型：1：普通拼团，2：老带新团
     */
    public Byte getActivityType() {
        return (Byte) get(15);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_pin_group_define.is_grouper_cheap</code>. 是否开启团长优惠：0：不开启，1：开启
     */
    public void setIsGrouperCheap(Byte value) {
        set(16, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_pin_group_define.is_grouper_cheap</code>. 是否开启团长优惠：0：不开启，1：开启
     */
    public Byte getIsGrouperCheap() {
        return (Byte) get(16);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_pin_group_define.reward_coupon_id</code>. 拼团失败发放优惠券
     */
    public void setRewardCouponId(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_pin_group_define.reward_coupon_id</code>. 拼团失败发放优惠券
     */
    public String getRewardCouponId() {
        return (String) get(17);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_pin_group_define.share_config</code>. 分享设置
     */
    public void setShareConfig(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_pin_group_define.share_config</code>. 分享设置
     */
    public String getShareConfig() {
        return (String) get(18);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_pin_group_define.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(19, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_pin_group_define.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(19);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_pin_group_define.update_time</code>. 最后修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(20, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_pin_group_define.update_time</code>. 最后修改时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(20);
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
    // Record21 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row21<Integer, Integer, Integer, String, Short, Short, Short, Byte, Timestamp, Timestamp, Short, Short, Byte, Byte, Integer, Byte, Byte, String, String, Timestamp, Timestamp> fieldsRow() {
        return (Row21) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row21<Integer, Integer, Integer, String, Short, Short, Short, Byte, Timestamp, Timestamp, Short, Short, Byte, Byte, Integer, Byte, Byte, String, String, Timestamp, Timestamp> valuesRow() {
        return (Row21) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return PinGroupDefine.PIN_GROUP_DEFINE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return PinGroupDefine.PIN_GROUP_DEFINE.SHOP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return PinGroupDefine.PIN_GROUP_DEFINE.GOODS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return PinGroupDefine.PIN_GROUP_DEFINE.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field5() {
        return PinGroupDefine.PIN_GROUP_DEFINE.LIMIT_AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field6() {
        return PinGroupDefine.PIN_GROUP_DEFINE.JOIN_LIMIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field7() {
        return PinGroupDefine.PIN_GROUP_DEFINE.OPEN_LIMIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field8() {
        return PinGroupDefine.PIN_GROUP_DEFINE.IS_DEFAULT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return PinGroupDefine.PIN_GROUP_DEFINE.START_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return PinGroupDefine.PIN_GROUP_DEFINE.END_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field11() {
        return PinGroupDefine.PIN_GROUP_DEFINE.STOCK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field12() {
        return PinGroupDefine.PIN_GROUP_DEFINE.SALE_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field13() {
        return PinGroupDefine.PIN_GROUP_DEFINE.DEL_FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field14() {
        return PinGroupDefine.PIN_GROUP_DEFINE.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field15() {
        return PinGroupDefine.PIN_GROUP_DEFINE.DEL_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field16() {
        return PinGroupDefine.PIN_GROUP_DEFINE.ACTIVITY_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field17() {
        return PinGroupDefine.PIN_GROUP_DEFINE.IS_GROUPER_CHEAP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field18() {
        return PinGroupDefine.PIN_GROUP_DEFINE.REWARD_COUPON_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field19() {
        return PinGroupDefine.PIN_GROUP_DEFINE.SHARE_CONFIG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field20() {
        return PinGroupDefine.PIN_GROUP_DEFINE.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field21() {
        return PinGroupDefine.PIN_GROUP_DEFINE.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getShopId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getGoodsId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component5() {
        return getLimitAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component6() {
        return getJoinLimit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component7() {
        return getOpenLimit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component8() {
        return getIsDefault();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component9() {
        return getStartTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component10() {
        return getEndTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component11() {
        return getStock();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component12() {
        return getSaleNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component13() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component14() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component15() {
        return getDelTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component16() {
        return getActivityType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component17() {
        return getIsGrouperCheap();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component18() {
        return getRewardCouponId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component19() {
        return getShareConfig();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component20() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component21() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getShopId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getGoodsId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value5() {
        return getLimitAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value6() {
        return getJoinLimit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value7() {
        return getOpenLimit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value8() {
        return getIsDefault();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getStartTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value10() {
        return getEndTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value11() {
        return getStock();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value12() {
        return getSaleNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value13() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value14() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value15() {
        return getDelTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value16() {
        return getActivityType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value17() {
        return getIsGrouperCheap();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value18() {
        return getRewardCouponId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value19() {
        return getShareConfig();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value20() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value21() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PinGroupDefineRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PinGroupDefineRecord value2(Integer value) {
        setShopId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PinGroupDefineRecord value3(Integer value) {
        setGoodsId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PinGroupDefineRecord value4(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PinGroupDefineRecord value5(Short value) {
        setLimitAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PinGroupDefineRecord value6(Short value) {
        setJoinLimit(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PinGroupDefineRecord value7(Short value) {
        setOpenLimit(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PinGroupDefineRecord value8(Byte value) {
        setIsDefault(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PinGroupDefineRecord value9(Timestamp value) {
        setStartTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PinGroupDefineRecord value10(Timestamp value) {
        setEndTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PinGroupDefineRecord value11(Short value) {
        setStock(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PinGroupDefineRecord value12(Short value) {
        setSaleNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PinGroupDefineRecord value13(Byte value) {
        setDelFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PinGroupDefineRecord value14(Byte value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PinGroupDefineRecord value15(Integer value) {
        setDelTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PinGroupDefineRecord value16(Byte value) {
        setActivityType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PinGroupDefineRecord value17(Byte value) {
        setIsGrouperCheap(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PinGroupDefineRecord value18(String value) {
        setRewardCouponId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PinGroupDefineRecord value19(String value) {
        setShareConfig(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PinGroupDefineRecord value20(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PinGroupDefineRecord value21(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PinGroupDefineRecord values(Integer value1, Integer value2, Integer value3, String value4, Short value5, Short value6, Short value7, Byte value8, Timestamp value9, Timestamp value10, Short value11, Short value12, Byte value13, Byte value14, Integer value15, Byte value16, Byte value17, String value18, String value19, Timestamp value20, Timestamp value21) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        value21(value21);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PinGroupDefineRecord
     */
    public PinGroupDefineRecord() {
        super(PinGroupDefine.PIN_GROUP_DEFINE);
    }

    /**
     * Create a detached, initialised PinGroupDefineRecord
     */
    public PinGroupDefineRecord(Integer id, Integer shopId, Integer goodsId, String name, Short limitAmount, Short joinLimit, Short openLimit, Byte isDefault, Timestamp startTime, Timestamp endTime, Short stock, Short saleNum, Byte delFlag, Byte status, Integer delTime, Byte activityType, Byte isGrouperCheap, String rewardCouponId, String shareConfig, Timestamp createTime, Timestamp updateTime) {
        super(PinGroupDefine.PIN_GROUP_DEFINE);

        set(0, id);
        set(1, shopId);
        set(2, goodsId);
        set(3, name);
        set(4, limitAmount);
        set(5, joinLimit);
        set(6, openLimit);
        set(7, isDefault);
        set(8, startTime);
        set(9, endTime);
        set(10, stock);
        set(11, saleNum);
        set(12, delFlag);
        set(13, status);
        set(14, delTime);
        set(15, activityType);
        set(16, isGrouperCheap);
        set(17, rewardCouponId);
        set(18, shareConfig);
        set(19, createTime);
        set(20, updateTime);
    }
}
