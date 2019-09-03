/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables.records;


import com.vpu.mp.db.shop.tables.Tag;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
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
public class TagRecord extends UpdatableRecordImpl<TagRecord> implements Record4<Integer, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = 176140277;

    /**
     * Setter for <code>jmini_shop_444801.b2c_tag.tag_id</code>.
     */
    public void setTagId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>jmini_shop_444801.b2c_tag.tag_id</code>.
     */
    public Integer getTagId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>jmini_shop_444801.b2c_tag.tag_name</code>.
     */
    public void setTagName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>jmini_shop_444801.b2c_tag.tag_name</code>.
     */
    public String getTagName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>jmini_shop_444801.b2c_tag.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>jmini_shop_444801.b2c_tag.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>jmini_shop_444801.b2c_tag.update_time</code>. 最后修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>jmini_shop_444801.b2c_tag.update_time</code>. 最后修改时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(3);
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
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, Timestamp, Timestamp> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, Timestamp, Timestamp> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Tag.TAG.TAG_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Tag.TAG.TAG_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return Tag.TAG.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return Tag.TAG.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getTagId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getTagName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component3() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getTagId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getTagName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TagRecord value1(Integer value) {
        setTagId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TagRecord value2(String value) {
        setTagName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TagRecord value3(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TagRecord value4(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TagRecord values(Integer value1, String value2, Timestamp value3, Timestamp value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TagRecord
     */
    public TagRecord() {
        super(Tag.TAG);
    }

    /**
     * Create a detached, initialised TagRecord
     */
    public TagRecord(Integer tagId, String tagName, Timestamp createTime, Timestamp updateTime) {
        super(Tag.TAG);

        set(0, tagId);
        set(1, tagName);
        set(2, createTime);
        set(3, updateTime);
    }
}
