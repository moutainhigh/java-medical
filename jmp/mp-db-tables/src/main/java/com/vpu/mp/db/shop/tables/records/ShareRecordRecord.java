/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables.records;


import com.vpu.mp.db.shop.tables.ShareRecord;

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
public class ShareRecordRecord extends UpdatableRecordImpl<ShareRecordRecord> implements Record7<Integer, Integer, Integer, Integer, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = 1568458072;

    /**
     * Setter for <code>mini_shop_471752.b2c_share_record.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_share_record.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_share_record.activity_id</code>. 活动id或商品id
     */
    public void setActivityId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_share_record.activity_id</code>. 活动id或商品id
     */
    public Integer getActivityId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_share_record.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_share_record.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_share_record.activity_type</code>. 活动类型
     */
    public void setActivityType(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_share_record.activity_type</code>. 活动类型
     */
    public Integer getActivityType() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_share_record.count</code>. 次数
     */
    public void setCount(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_share_record.count</code>. 次数
     */
    public Integer getCount() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_share_record.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_share_record.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_share_record.update_time</code>. 最后修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_share_record.update_time</code>. 最后修改时间
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
    public Row7<Integer, Integer, Integer, Integer, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, Integer, Integer, Integer, Timestamp, Timestamp> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ShareRecord.SHARE_RECORD.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ShareRecord.SHARE_RECORD.ACTIVITY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return ShareRecord.SHARE_RECORD.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return ShareRecord.SHARE_RECORD.ACTIVITY_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return ShareRecord.SHARE_RECORD.COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return ShareRecord.SHARE_RECORD.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return ShareRecord.SHARE_RECORD.UPDATE_TIME;
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
    public Integer component4() {
        return getActivityType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getCount();
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
    public Integer value4() {
        return getActivityType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getCount();
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
    public ShareRecordRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShareRecordRecord value2(Integer value) {
        setActivityId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShareRecordRecord value3(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShareRecordRecord value4(Integer value) {
        setActivityType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShareRecordRecord value5(Integer value) {
        setCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShareRecordRecord value6(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShareRecordRecord value7(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShareRecordRecord values(Integer value1, Integer value2, Integer value3, Integer value4, Integer value5, Timestamp value6, Timestamp value7) {
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
     * Create a detached ShareRecordRecord
     */
    public ShareRecordRecord() {
        super(ShareRecord.SHARE_RECORD);
    }

    /**
     * Create a detached, initialised ShareRecordRecord
     */
    public ShareRecordRecord(Integer id, Integer activityId, Integer userId, Integer activityType, Integer count, Timestamp createTime, Timestamp updateTime) {
        super(ShareRecord.SHARE_RECORD);

        set(0, id);
        set(1, activityId);
        set(2, userId);
        set(3, activityType);
        set(4, count);
        set(5, createTime);
        set(6, updateTime);
    }
}
