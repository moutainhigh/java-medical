/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables.records;


import com.vpu.mp.db.shop.tables.RebatePriceRecord;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class RebatePriceRecordRecord extends UpdatableRecordImpl<RebatePriceRecordRecord> implements Record6<Integer, Integer, String, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = -742355370;

    /**
     * Setter for <code>mini_shop_471752.b2c_rebate_price_record.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_rebate_price_record.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_rebate_price_record.user_id</code>. 用户id
     */
    public void setUserId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_rebate_price_record.user_id</code>. 用户id
     */
    public Integer getUserId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_rebate_price_record.data_sign</code>. md5(rebate_data)
     */
    public void setDataSign(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_rebate_price_record.data_sign</code>. md5(rebate_data)
     */
    public String getDataSign() {
        return (String) get(2);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_rebate_price_record.rebate_data</code>. 分享内容
     */
    public void setRebateData(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_rebate_price_record.rebate_data</code>. 分享内容
     */
    public String getRebateData() {
        return (String) get(3);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_rebate_price_record.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_rebate_price_record.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_rebate_price_record.update_time</code>. 最后修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_rebate_price_record.update_time</code>. 最后修改时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, String, String, Timestamp, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, String, String, Timestamp, Timestamp> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return RebatePriceRecord.REBATE_PRICE_RECORD.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return RebatePriceRecord.REBATE_PRICE_RECORD.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return RebatePriceRecord.REBATE_PRICE_RECORD.DATA_SIGN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return RebatePriceRecord.REBATE_PRICE_RECORD.REBATE_DATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return RebatePriceRecord.REBATE_PRICE_RECORD.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return RebatePriceRecord.REBATE_PRICE_RECORD.UPDATE_TIME;
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
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getDataSign();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getRebateData();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
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
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getDataSign();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getRebateData();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RebatePriceRecordRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RebatePriceRecordRecord value2(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RebatePriceRecordRecord value3(String value) {
        setDataSign(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RebatePriceRecordRecord value4(String value) {
        setRebateData(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RebatePriceRecordRecord value5(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RebatePriceRecordRecord value6(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RebatePriceRecordRecord values(Integer value1, Integer value2, String value3, String value4, Timestamp value5, Timestamp value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RebatePriceRecordRecord
     */
    public RebatePriceRecordRecord() {
        super(RebatePriceRecord.REBATE_PRICE_RECORD);
    }

    /**
     * Create a detached, initialised RebatePriceRecordRecord
     */
    public RebatePriceRecordRecord(Integer id, Integer userId, String dataSign, String rebateData, Timestamp createTime, Timestamp updateTime) {
        super(RebatePriceRecord.REBATE_PRICE_RECORD);

        set(0, id);
        set(1, userId);
        set(2, dataSign);
        set(3, rebateData);
        set(4, createTime);
        set(5, updateTime);
    }
}
