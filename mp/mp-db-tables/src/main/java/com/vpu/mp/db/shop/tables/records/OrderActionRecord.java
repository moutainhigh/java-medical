/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables.records;


import com.vpu.mp.db.shop.tables.OrderAction;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
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
public class OrderActionRecord extends UpdatableRecordImpl<OrderActionRecord> implements Record12<Integer, Integer, Integer, String, String, Integer, String, String, Byte, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = -769733852;

    /**
     * Setter for <code>mini_shop_471752.b2c_order_action.action_id</code>.
     */
    public void setActionId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_order_action.action_id</code>.
     */
    public Integer getActionId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_order_action.shop_id</code>. 店铺id
     */
    public void setShopId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_order_action.shop_id</code>. 店铺id
     */
    public Integer getShopId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_order_action.order_id</code>.
     */
    public void setOrderId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_order_action.order_id</code>.
     */
    public Integer getOrderId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_order_action.order_sn</code>.
     */
    public void setOrderSn(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_order_action.order_sn</code>.
     */
    public String getOrderSn() {
        return (String) get(3);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_order_action.action_user</code>.
     */
    public void setActionUser(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_order_action.action_user</code>.
     */
    public String getActionUser() {
        return (String) get(4);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_order_action.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_order_action.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_order_action.user_cid</code>.
     */
    public void setUserCid(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_order_action.user_cid</code>.
     */
    public String getUserCid() {
        return (String) get(6);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_order_action.user_openid</code>.
     */
    public void setUserOpenid(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_order_action.user_openid</code>.
     */
    public String getUserOpenid() {
        return (String) get(7);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_order_action.order_status</code>.
     */
    public void setOrderStatus(Byte value) {
        set(8, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_order_action.order_status</code>.
     */
    public Byte getOrderStatus() {
        return (Byte) get(8);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_order_action.action_note</code>.
     */
    public void setActionNote(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_order_action.action_note</code>.
     */
    public String getActionNote() {
        return (String) get(9);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_order_action.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(10, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_order_action.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_order_action.update_time</code>. 最后修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(11, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_order_action.update_time</code>. 最后修改时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(11);
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
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Integer, Integer, Integer, String, String, Integer, String, String, Byte, String, Timestamp, Timestamp> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Integer, Integer, Integer, String, String, Integer, String, String, Byte, String, Timestamp, Timestamp> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return OrderAction.ORDER_ACTION.ACTION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return OrderAction.ORDER_ACTION.SHOP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return OrderAction.ORDER_ACTION.ORDER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return OrderAction.ORDER_ACTION.ORDER_SN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return OrderAction.ORDER_ACTION.ACTION_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return OrderAction.ORDER_ACTION.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return OrderAction.ORDER_ACTION.USER_CID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return OrderAction.ORDER_ACTION.USER_OPENID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field9() {
        return OrderAction.ORDER_ACTION.ORDER_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return OrderAction.ORDER_ACTION.ACTION_NOTE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return OrderAction.ORDER_ACTION.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return OrderAction.ORDER_ACTION.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getActionId();
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
        return getOrderId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getOrderSn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getActionUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getUserCid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getUserOpenid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component9() {
        return getOrderStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getActionNote();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component11() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component12() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getActionId();
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
        return getOrderId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getOrderSn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getActionUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getUserCid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getUserOpenid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value9() {
        return getOrderStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getActionNote();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value12() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderActionRecord value1(Integer value) {
        setActionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderActionRecord value2(Integer value) {
        setShopId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderActionRecord value3(Integer value) {
        setOrderId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderActionRecord value4(String value) {
        setOrderSn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderActionRecord value5(String value) {
        setActionUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderActionRecord value6(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderActionRecord value7(String value) {
        setUserCid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderActionRecord value8(String value) {
        setUserOpenid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderActionRecord value9(Byte value) {
        setOrderStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderActionRecord value10(String value) {
        setActionNote(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderActionRecord value11(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderActionRecord value12(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderActionRecord values(Integer value1, Integer value2, Integer value3, String value4, String value5, Integer value6, String value7, String value8, Byte value9, String value10, Timestamp value11, Timestamp value12) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached OrderActionRecord
     */
    public OrderActionRecord() {
        super(OrderAction.ORDER_ACTION);
    }

    /**
     * Create a detached, initialised OrderActionRecord
     */
    public OrderActionRecord(Integer actionId, Integer shopId, Integer orderId, String orderSn, String actionUser, Integer userId, String userCid, String userOpenid, Byte orderStatus, String actionNote, Timestamp createTime, Timestamp updateTime) {
        super(OrderAction.ORDER_ACTION);

        set(0, actionId);
        set(1, shopId);
        set(2, orderId);
        set(3, orderSn);
        set(4, actionUser);
        set(5, userId);
        set(6, userCid);
        set(7, userOpenid);
        set(8, orderStatus);
        set(9, actionNote);
        set(10, createTime);
        set(11, updateTime);
    }
}
