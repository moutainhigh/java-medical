/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables.records;


import com.vpu.mp.db.shop.tables.StoreOrderSummaryTrend;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 门店数据概览
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StoreOrderSummaryTrendRecord extends UpdatableRecordImpl<StoreOrderSummaryTrendRecord> implements Record10<Integer, Date, Byte, Integer, Integer, BigDecimal, Integer, Integer, Integer, Timestamp> {

    private static final long serialVersionUID = 145908278;

    /**
     * Setter for <code>mini_shop_471752.b2c_store_order_summary_trend.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store_order_summary_trend.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_store_order_summary_trend.ref_date</code>. 2018-09-04
     */
    public void setRefDate(Date value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store_order_summary_trend.ref_date</code>. 2018-09-04
     */
    public Date getRefDate() {
        return (Date) get(1);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_store_order_summary_trend.type</code>. 1,7,30,90
     */
    public void setType(Byte value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store_order_summary_trend.type</code>. 1,7,30,90
     */
    public Byte getType() {
        return (Byte) get(2);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_store_order_summary_trend.store_id</code>. 门店ID
     */
    public void setStoreId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store_order_summary_trend.store_id</code>. 门店ID
     */
    public Integer getStoreId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_store_order_summary_trend.order_pay_user_num</code>. 付款人数
     */
    public void setOrderPayUserNum(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store_order_summary_trend.order_pay_user_num</code>. 付款人数
     */
    public Integer getOrderPayUserNum() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_store_order_summary_trend.total_paid_money</code>. 消费金额
     */
    public void setTotalPaidMoney(BigDecimal value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store_order_summary_trend.total_paid_money</code>. 消费金额
     */
    public BigDecimal getTotalPaidMoney() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_store_order_summary_trend.order_pay_num</code>. 成交订单数
     */
    public void setOrderPayNum(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store_order_summary_trend.order_pay_num</code>. 成交订单数
     */
    public Integer getOrderPayNum() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_store_order_summary_trend.order_num</code>. 下单数
     */
    public void setOrderNum(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store_order_summary_trend.order_num</code>. 下单数
     */
    public Integer getOrderNum() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_store_order_summary_trend.order_user_num</code>. 下单人数
     */
    public void setOrderUserNum(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store_order_summary_trend.order_user_num</code>. 下单人数
     */
    public Integer getOrderUserNum() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_store_order_summary_trend.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store_order_summary_trend.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(9);
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
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, Date, Byte, Integer, Integer, BigDecimal, Integer, Integer, Integer, Timestamp> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, Date, Byte, Integer, Integer, BigDecimal, Integer, Integer, Integer, Timestamp> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return StoreOrderSummaryTrend.STORE_ORDER_SUMMARY_TREND.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field2() {
        return StoreOrderSummaryTrend.STORE_ORDER_SUMMARY_TREND.REF_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field3() {
        return StoreOrderSummaryTrend.STORE_ORDER_SUMMARY_TREND.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return StoreOrderSummaryTrend.STORE_ORDER_SUMMARY_TREND.STORE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return StoreOrderSummaryTrend.STORE_ORDER_SUMMARY_TREND.ORDER_PAY_USER_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field6() {
        return StoreOrderSummaryTrend.STORE_ORDER_SUMMARY_TREND.TOTAL_PAID_MONEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return StoreOrderSummaryTrend.STORE_ORDER_SUMMARY_TREND.ORDER_PAY_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return StoreOrderSummaryTrend.STORE_ORDER_SUMMARY_TREND.ORDER_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return StoreOrderSummaryTrend.STORE_ORDER_SUMMARY_TREND.ORDER_USER_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return StoreOrderSummaryTrend.STORE_ORDER_SUMMARY_TREND.CREATE_TIME;
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
    public Date component2() {
        return getRefDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component3() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getStoreId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getOrderPayUserNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component6() {
        return getTotalPaidMoney();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getOrderPayNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getOrderNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component9() {
        return getOrderUserNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component10() {
        return getCreateTime();
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
    public Date value2() {
        return getRefDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value3() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getStoreId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getOrderPayUserNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value6() {
        return getTotalPaidMoney();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getOrderPayNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getOrderNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getOrderUserNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value10() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StoreOrderSummaryTrendRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StoreOrderSummaryTrendRecord value2(Date value) {
        setRefDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StoreOrderSummaryTrendRecord value3(Byte value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StoreOrderSummaryTrendRecord value4(Integer value) {
        setStoreId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StoreOrderSummaryTrendRecord value5(Integer value) {
        setOrderPayUserNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StoreOrderSummaryTrendRecord value6(BigDecimal value) {
        setTotalPaidMoney(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StoreOrderSummaryTrendRecord value7(Integer value) {
        setOrderPayNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StoreOrderSummaryTrendRecord value8(Integer value) {
        setOrderNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StoreOrderSummaryTrendRecord value9(Integer value) {
        setOrderUserNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StoreOrderSummaryTrendRecord value10(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StoreOrderSummaryTrendRecord values(Integer value1, Date value2, Byte value3, Integer value4, Integer value5, BigDecimal value6, Integer value7, Integer value8, Integer value9, Timestamp value10) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached StoreOrderSummaryTrendRecord
     */
    public StoreOrderSummaryTrendRecord() {
        super(StoreOrderSummaryTrend.STORE_ORDER_SUMMARY_TREND);
    }

    /**
     * Create a detached, initialised StoreOrderSummaryTrendRecord
     */
    public StoreOrderSummaryTrendRecord(Integer id, Date refDate, Byte type, Integer storeId, Integer orderPayUserNum, BigDecimal totalPaidMoney, Integer orderPayNum, Integer orderNum, Integer orderUserNum, Timestamp createTime) {
        super(StoreOrderSummaryTrend.STORE_ORDER_SUMMARY_TREND);

        set(0, id);
        set(1, refDate);
        set(2, type);
        set(3, storeId);
        set(4, orderPayUserNum);
        set(5, totalPaidMoney);
        set(6, orderPayNum);
        set(7, orderNum);
        set(8, orderUserNum);
        set(9, createTime);
    }
}