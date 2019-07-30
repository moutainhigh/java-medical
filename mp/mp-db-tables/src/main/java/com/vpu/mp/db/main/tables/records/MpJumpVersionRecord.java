/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.main.tables.records;


import com.vpu.mp.db.main.tables.MpJumpVersion;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
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
public class MpJumpVersionRecord extends UpdatableRecordImpl<MpJumpVersionRecord> implements Record5<Integer, String, Byte, Timestamp, Timestamp> {

    private static final long serialVersionUID = -703979716;

    /**
     * Setter for <code>mini_main.b2c_mp_jump_version.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_main.b2c_mp_jump_version.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_main.b2c_mp_jump_version.shop_id</code>.
     */
    public void setShopId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_main.b2c_mp_jump_version.shop_id</code>.
     */
    public String getShopId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>mini_main.b2c_mp_jump_version.flag</code>. 0:申请中，1:已提交
     */
    public void setFlag(Byte value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_main.b2c_mp_jump_version.flag</code>. 0:申请中，1:已提交
     */
    public Byte getFlag() {
        return (Byte) get(2);
    }

    /**
     * Setter for <code>mini_main.b2c_mp_jump_version.add_time</code>.
     */
    public void setAddTime(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_main.b2c_mp_jump_version.add_time</code>.
     */
    public Timestamp getAddTime() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>mini_main.b2c_mp_jump_version.update_time</code>.
     */
    public void setUpdateTime(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_main.b2c_mp_jump_version.update_time</code>.
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(4);
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
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, Byte, Timestamp, Timestamp> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, Byte, Timestamp, Timestamp> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return MpJumpVersion.MP_JUMP_VERSION.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return MpJumpVersion.MP_JUMP_VERSION.SHOP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field3() {
        return MpJumpVersion.MP_JUMP_VERSION.FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return MpJumpVersion.MP_JUMP_VERSION.ADD_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return MpJumpVersion.MP_JUMP_VERSION.UPDATE_TIME;
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
    public String component2() {
        return getShopId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component3() {
        return getFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getAddTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
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
    public String value2() {
        return getShopId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value3() {
        return getFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getAddTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpJumpVersionRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpJumpVersionRecord value2(String value) {
        setShopId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpJumpVersionRecord value3(Byte value) {
        setFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpJumpVersionRecord value4(Timestamp value) {
        setAddTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpJumpVersionRecord value5(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpJumpVersionRecord values(Integer value1, String value2, Byte value3, Timestamp value4, Timestamp value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MpJumpVersionRecord
     */
    public MpJumpVersionRecord() {
        super(MpJumpVersion.MP_JUMP_VERSION);
    }

    /**
     * Create a detached, initialised MpJumpVersionRecord
     */
    public MpJumpVersionRecord(Integer id, String shopId, Byte flag, Timestamp addTime, Timestamp updateTime) {
        super(MpJumpVersion.MP_JUMP_VERSION);

        set(0, id);
        set(1, shopId);
        set(2, flag);
        set(3, addTime);
        set(4, updateTime);
    }
}
