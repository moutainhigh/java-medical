/*
 * This file is generated by jOOQ.
 */
package com.vpu.jmd.table.main.tables.records;




import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
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
public class SystemUserRecord extends UpdatableRecordImpl<SystemUserRecord> implements Record8<Integer, String, String, String, String, Timestamp, Byte, String> {

    private static final long serialVersionUID = 329812110;

    /**
     * Setter for <code>mini_main.b2c_system_user.system_user_id</code>.
     */
    public void setSystemUserId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_main.b2c_system_user.system_user_id</code>.
     */
    public Integer getSystemUserId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_main.b2c_system_user.user_name</code>.
     */
    public void setUserName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_main.b2c_system_user.user_name</code>.
     */
    public String getUserName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>mini_main.b2c_system_user.password</code>.
     */
    public void setPassword(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_main.b2c_system_user.password</code>.
     */
    public String getPassword() {
        return (String) get(2);
    }

    /**
     * Setter for <code>mini_main.b2c_system_user.mobile</code>.
     */
    public void setMobile(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_main.b2c_system_user.mobile</code>.
     */
    public String getMobile() {
        return (String) get(3);
    }

    /**
     * Setter for <code>mini_main.b2c_system_user.receive_mobile</code>.  接收通知手机号码
     */
    public void setReceiveMobile(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_main.b2c_system_user.receive_mobile</code>.  接收通知手机号码
     */
    public String getReceiveMobile() {
        return (String) get(4);
    }

    /**
     * Setter for <code>mini_main.b2c_system_user.created</code>. 创建时间
     */
    public void setCreated(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_main.b2c_system_user.created</code>. 创建时间
     */
    public Timestamp getCreated() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>mini_main.b2c_system_user.is_enabled</code>. 是否可用
     */
    public void setIsEnabled(Byte value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_main.b2c_system_user.is_enabled</code>. 是否可用
     */
    public Byte getIsEnabled() {
        return (Byte) get(6);
    }

    /**
     * Setter for <code>mini_main.b2c_system_user.last_login_ip</code>. 上次登录IP
     */
    public void setLastLoginIp(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>mini_main.b2c_system_user.last_login_ip</code>. 上次登录IP
     */
    public String getLastLoginIp() {
        return (String) get(7);
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
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, String, String, String, String, Timestamp, Byte, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, String, String, String, String, Timestamp, Byte, String> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return SystemUser.SYSTEM_USER.SYSTEM_USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return SystemUser.SYSTEM_USER.USER_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return SystemUser.SYSTEM_USER.PASSWORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return SystemUser.SYSTEM_USER.MOBILE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return SystemUser.SYSTEM_USER.RECEIVE_MOBILE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return SystemUser.SYSTEM_USER.CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field7() {
        return SystemUser.SYSTEM_USER.IS_ENABLED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return SystemUser.SYSTEM_USER.LAST_LOGIN_IP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getSystemUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getUserName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getPassword();
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
    public String component5() {
        return getReceiveMobile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component7() {
        return getIsEnabled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getLastLoginIp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getSystemUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getUserName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPassword();
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
    public String value5() {
        return getReceiveMobile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value7() {
        return getIsEnabled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getLastLoginIp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SystemUserRecord value1(Integer value) {
        setSystemUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SystemUserRecord value2(String value) {
        setUserName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SystemUserRecord value3(String value) {
        setPassword(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SystemUserRecord value4(String value) {
        setMobile(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SystemUserRecord value5(String value) {
        setReceiveMobile(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SystemUserRecord value6(Timestamp value) {
        setCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SystemUserRecord value7(Byte value) {
        setIsEnabled(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SystemUserRecord value8(String value) {
        setLastLoginIp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SystemUserRecord values(Integer value1, String value2, String value3, String value4, String value5, Timestamp value6, Byte value7, String value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SystemUserRecord
     */
    public SystemUserRecord() {
        super(SystemUser.SYSTEM_USER);
    }

    /**
     * Create a detached, initialised SystemUserRecord
     */
    public SystemUserRecord(Integer systemUserId, String userName, String password, String mobile, String receiveMobile, Timestamp created, Byte isEnabled, String lastLoginIp) {
        super(SystemUser.SYSTEM_USER);

        set(0, systemUserId);
        set(1, userName);
        set(2, password);
        set(3, mobile);
        set(4, receiveMobile);
        set(5, created);
        set(6, isEnabled);
        set(7, lastLoginIp);
    }
}