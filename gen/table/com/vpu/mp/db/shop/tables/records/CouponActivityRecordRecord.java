/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables.records;


import com.vpu.mp.db.shop.tables.CouponActivityRecord;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
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
public class CouponActivityRecordRecord extends UpdatableRecordImpl<CouponActivityRecordRecord> implements Record7<Integer, Integer, Integer, Timestamp, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = -1701679593;

    /**
     * Setter for <code>mini_shop_471752.b2c_coupon_activity_record.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_coupon_activity_record.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_coupon_activity_record.activity_id</code>. 活动id
     */
    public void setActivityId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_coupon_activity_record.activity_id</code>. 活动id
     */
    public Integer getActivityId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_coupon_activity_record.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_coupon_activity_record.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_coupon_activity_record.receive_time</code>. 领取时间
     */
    public void setReceiveTime(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_coupon_activity_record.receive_time</code>. 领取时间
     */
    public Timestamp getReceiveTime() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_coupon_activity_record.mrking_voucher_id</code>. 已领取的优惠券
     */
    public void setMrkingVoucherId(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_coupon_activity_record.mrking_voucher_id</code>. 已领取的优惠券
     */
    public String getMrkingVoucherId() {
        return (String) get(4);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_coupon_activity_record.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_coupon_activity_record.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_coupon_activity_record.update_time</code>. 最后修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_coupon_activity_record.update_time</code>. 最后修改时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(6);
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
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, Integer, Timestamp, String, Timestamp, Timestamp> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, Integer, Timestamp, String, Timestamp, Timestamp> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return CouponActivityRecord.COUPON_ACTIVITY_RECORD.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return CouponActivityRecord.COUPON_ACTIVITY_RECORD.ACTIVITY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return CouponActivityRecord.COUPON_ACTIVITY_RECORD.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return CouponActivityRecord.COUPON_ACTIVITY_RECORD.RECEIVE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return CouponActivityRecord.COUPON_ACTIVITY_RECORD.MRKING_VOUCHER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return CouponActivityRecord.COUPON_ACTIVITY_RECORD.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return CouponActivityRecord.COUPON_ACTIVITY_RECORD.UPDATE_TIME;
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
        return getActivityId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getReceiveTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getMrkingVoucherId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component7() {
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
        return getActivityId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getReceiveTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getMrkingVoucherId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CouponActivityRecordRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CouponActivityRecordRecord value2(Integer value) {
        setActivityId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CouponActivityRecordRecord value3(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CouponActivityRecordRecord value4(Timestamp value) {
        setReceiveTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CouponActivityRecordRecord value5(String value) {
        setMrkingVoucherId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CouponActivityRecordRecord value6(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CouponActivityRecordRecord value7(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CouponActivityRecordRecord values(Integer value1, Integer value2, Integer value3, Timestamp value4, String value5, Timestamp value6, Timestamp value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CouponActivityRecordRecord
     */
    public CouponActivityRecordRecord() {
        super(CouponActivityRecord.COUPON_ACTIVITY_RECORD);
    }

    /**
     * Create a detached, initialised CouponActivityRecordRecord
     */
    public CouponActivityRecordRecord(Integer id, Integer activityId, Integer userId, Timestamp receiveTime, String mrkingVoucherId, Timestamp createTime, Timestamp updateTime) {
        super(CouponActivityRecord.COUPON_ACTIVITY_RECORD);

        set(0, id);
        set(1, activityId);
        set(2, userId);
        set(3, receiveTime);
        set(4, mrkingVoucherId);
        set(5, createTime);
        set(6, updateTime);
    }
}
