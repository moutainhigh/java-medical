/*
 * This file is generated by jOOQ.
 */
package com.vpu.jmd.table.main.tables.records;




import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
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
public class ShopRenewRecord extends UpdatableRecordImpl<ShopRenewRecord> implements Record13<Integer, Integer, Integer, String, BigDecimal, Timestamp, Timestamp, Integer, String, Byte, String, Byte, String> {

    private static final long serialVersionUID = -2079029746;

    /**
     * Setter for <code>mini_main.b2c_shop_renew.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_renew.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_renew.shop_id</code>. 店铺ID
     */
    public void setShopId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_renew.shop_id</code>. 店铺ID
     */
    public Integer getShopId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_renew.sys_id</code>.
     */
    public void setSysId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_renew.sys_id</code>.
     */
    public Integer getSysId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_renew.mobile</code>.
     */
    public void setMobile(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_renew.mobile</code>.
     */
    public String getMobile() {
        return (String) get(3);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_renew.renew_money</code>. 店铺续费金额
     */
    public void setRenewMoney(BigDecimal value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_renew.renew_money</code>. 店铺续费金额
     */
    public BigDecimal getRenewMoney() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_renew.renew_date</code>. 店铺续费日期
     */
    public void setRenewDate(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_renew.renew_date</code>. 店铺续费日期
     */
    public Timestamp getRenewDate() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_renew.expire_time</code>. 到期时间
     */
    public void setExpireTime(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_renew.expire_time</code>. 到期时间
     */
    public Timestamp getExpireTime() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_renew.operator</code>. 操作员ID,主账号是0，子账号ID
     */
    public void setOperator(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_renew.operator</code>. 操作员ID,主账号是0，子账号ID
     */
    public Integer getOperator() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_renew.renew_desc</code>. 说明
     */
    public void setRenewDesc(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_renew.renew_desc</code>. 说明
     */
    public String getRenewDesc() {
        return (String) get(8);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_renew.renew_type</code>. 续费类型：1续费，2试用，3赠送，4退款
     */
    public void setRenewType(Byte value) {
        set(9, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_renew.renew_type</code>. 续费类型：1续费，2试用，3赠送，4退款
     */
    public Byte getRenewType() {
        return (Byte) get(9);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_renew.renew_duration</code>. 时长：字符串逗号隔开
     */
    public void setRenewDuration(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_renew.renew_duration</code>. 时长：字符串逗号隔开
     */
    public String getRenewDuration() {
        return (String) get(10);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_renew.send_type</code>. 赠送类型：0无，1时间，2功能
     */
    public void setSendType(Byte value) {
        set(11, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_renew.send_type</code>. 赠送类型：0无，1时间，2功能
     */
    public Byte getSendType() {
        return (Byte) get(11);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_renew.send_content</code>. 赠送内容：字符串逗号隔开
     */
    public void setSendContent(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_renew.send_content</code>. 赠送内容：字符串逗号隔开
     */
    public String getSendContent() {
        return (String) get(12);
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
    // Record13 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Integer, Integer, Integer, String, BigDecimal, Timestamp, Timestamp, Integer, String, Byte, String, Byte, String> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Integer, Integer, Integer, String, BigDecimal, Timestamp, Timestamp, Integer, String, Byte, String, Byte, String> valuesRow() {
        return (Row13) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ShopRenew.SHOP_RENEW.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ShopRenew.SHOP_RENEW.SHOP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return ShopRenew.SHOP_RENEW.SYS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ShopRenew.SHOP_RENEW.MOBILE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field5() {
        return ShopRenew.SHOP_RENEW.RENEW_MONEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return ShopRenew.SHOP_RENEW.RENEW_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return ShopRenew.SHOP_RENEW.EXPIRE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return ShopRenew.SHOP_RENEW.OPERATOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return ShopRenew.SHOP_RENEW.RENEW_DESC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field10() {
        return ShopRenew.SHOP_RENEW.RENEW_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return ShopRenew.SHOP_RENEW.RENEW_DURATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field12() {
        return ShopRenew.SHOP_RENEW.SEND_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return ShopRenew.SHOP_RENEW.SEND_CONTENT;
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
        return getSysId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getMobile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component5() {
        return getRenewMoney();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
        return getRenewDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component7() {
        return getExpireTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getOperator();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getRenewDesc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component10() {
        return getRenewType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getRenewDuration();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component12() {
        return getSendType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getSendContent();
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
        return getSysId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getMobile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value5() {
        return getRenewMoney();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getRenewDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getExpireTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getOperator();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getRenewDesc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value10() {
        return getRenewType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getRenewDuration();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value12() {
        return getSendType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getSendContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopRenewRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopRenewRecord value2(Integer value) {
        setShopId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopRenewRecord value3(Integer value) {
        setSysId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopRenewRecord value4(String value) {
        setMobile(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopRenewRecord value5(BigDecimal value) {
        setRenewMoney(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopRenewRecord value6(Timestamp value) {
        setRenewDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopRenewRecord value7(Timestamp value) {
        setExpireTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopRenewRecord value8(Integer value) {
        setOperator(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopRenewRecord value9(String value) {
        setRenewDesc(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopRenewRecord value10(Byte value) {
        setRenewType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopRenewRecord value11(String value) {
        setRenewDuration(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopRenewRecord value12(Byte value) {
        setSendType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopRenewRecord value13(String value) {
        setSendContent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopRenewRecord values(Integer value1, Integer value2, Integer value3, String value4, BigDecimal value5, Timestamp value6, Timestamp value7, Integer value8, String value9, Byte value10, String value11, Byte value12, String value13) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ShopRenewRecord
     */
    public ShopRenewRecord() {
        super(ShopRenew.SHOP_RENEW);
    }

    /**
     * Create a detached, initialised ShopRenewRecord
     */
    public ShopRenewRecord(Integer id, Integer shopId, Integer sysId, String mobile, BigDecimal renewMoney, Timestamp renewDate, Timestamp expireTime, Integer operator, String renewDesc, Byte renewType, String renewDuration, Byte sendType, String sendContent) {
        super(ShopRenew.SHOP_RENEW);

        set(0, id);
        set(1, shopId);
        set(2, sysId);
        set(3, mobile);
        set(4, renewMoney);
        set(5, renewDate);
        set(6, expireTime);
        set(7, operator);
        set(8, renewDesc);
        set(9, renewType);
        set(10, renewDuration);
        set(11, sendType);
        set(12, sendContent);
    }
}