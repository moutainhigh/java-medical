/*
 * This file is generated by jOOQ.
 */
package com.vpu.jmd.table.main.tables.records;




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
public class SortRecord extends UpdatableRecordImpl<SortRecord> implements Record12<Integer, String, Short, Short, Byte, Timestamp, String, String, Short, Byte, String, String> {

    private static final long serialVersionUID = -507763614;

    /**
     * Setter for <code>mini_main.b2c_sort.sort_id</code>.
     */
    public void setSortId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_main.b2c_sort.sort_id</code>.
     */
    public Integer getSortId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_main.b2c_sort.sort_name</code>.
     */
    public void setSortName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_main.b2c_sort.sort_name</code>.
     */
    public String getSortName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>mini_main.b2c_sort.parent_id</code>.
     */
    public void setParentId(Short value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_main.b2c_sort.parent_id</code>.
     */
    public Short getParentId() {
        return (Short) get(2);
    }

    /**
     * Setter for <code>mini_main.b2c_sort.level</code>.
     */
    public void setLevel(Short value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_main.b2c_sort.level</code>.
     */
    public Short getLevel() {
        return (Short) get(3);
    }

    /**
     * Setter for <code>mini_main.b2c_sort.has_child</code>.
     */
    public void setHasChild(Byte value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_main.b2c_sort.has_child</code>.
     */
    public Byte getHasChild() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>mini_main.b2c_sort.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_main.b2c_sort.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>mini_main.b2c_sort.sort_img</code>. 一级分类是头图 其他为分类图标
     */
    public void setSortImg(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_main.b2c_sort.sort_img</code>. 一级分类是头图 其他为分类图标
     */
    public String getSortImg() {
        return (String) get(6);
    }

    /**
     * Setter for <code>mini_main.b2c_sort.img_link</code>. 图标或者头图链接
     */
    public void setImgLink(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>mini_main.b2c_sort.img_link</code>. 图标或者头图链接
     */
    public String getImgLink() {
        return (String) get(7);
    }

    /**
     * Setter for <code>mini_main.b2c_sort.first</code>. 优先级
     */
    public void setFirst(Short value) {
        set(8, value);
    }

    /**
     * Getter for <code>mini_main.b2c_sort.first</code>. 优先级
     */
    public Short getFirst() {
        return (Short) get(8);
    }

    /**
     * Setter for <code>mini_main.b2c_sort.type</code>. 0普通商家分类 1推荐分类
     */
    public void setType(Byte value) {
        set(9, value);
    }

    /**
     * Getter for <code>mini_main.b2c_sort.type</code>. 0普通商家分类 1推荐分类
     */
    public Byte getType() {
        return (Byte) get(9);
    }

    /**
     * Setter for <code>mini_main.b2c_sort.sort_desc</code>.
     */
    public void setSortDesc(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>mini_main.b2c_sort.sort_desc</code>.
     */
    public String getSortDesc() {
        return (String) get(10);
    }

    /**
     * Setter for <code>mini_main.b2c_sort.keywords</code>.
     */
    public void setKeywords(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>mini_main.b2c_sort.keywords</code>.
     */
    public String getKeywords() {
        return (String) get(11);
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
    public Row12<Integer, String, Short, Short, Byte, Timestamp, String, String, Short, Byte, String, String> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Integer, String, Short, Short, Byte, Timestamp, String, String, Short, Byte, String, String> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Sort.SORT.SORT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Sort.SORT.SORT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field3() {
        return Sort.SORT.PARENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field4() {
        return Sort.SORT.LEVEL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field5() {
        return Sort.SORT.HAS_CHILD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return Sort.SORT.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Sort.SORT.SORT_IMG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Sort.SORT.IMG_LINK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field9() {
        return Sort.SORT.FIRST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field10() {
        return Sort.SORT.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return Sort.SORT.SORT_DESC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return Sort.SORT.KEYWORDS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getSortId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getSortName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component3() {
        return getParentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component4() {
        return getLevel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component5() {
        return getHasChild();
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
    public String component7() {
        return getSortImg();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getImgLink();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component9() {
        return getFirst();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component10() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getSortDesc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getKeywords();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getSortId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getSortName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value3() {
        return getParentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value4() {
        return getLevel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value5() {
        return getHasChild();
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
    public String value7() {
        return getSortImg();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getImgLink();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value9() {
        return getFirst();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value10() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getSortDesc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getKeywords();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SortRecord value1(Integer value) {
        setSortId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SortRecord value2(String value) {
        setSortName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SortRecord value3(Short value) {
        setParentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SortRecord value4(Short value) {
        setLevel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SortRecord value5(Byte value) {
        setHasChild(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SortRecord value6(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SortRecord value7(String value) {
        setSortImg(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SortRecord value8(String value) {
        setImgLink(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SortRecord value9(Short value) {
        setFirst(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SortRecord value10(Byte value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SortRecord value11(String value) {
        setSortDesc(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SortRecord value12(String value) {
        setKeywords(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SortRecord values(Integer value1, String value2, Short value3, Short value4, Byte value5, Timestamp value6, String value7, String value8, Short value9, Byte value10, String value11, String value12) {
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
     * Create a detached SortRecord
     */
    public SortRecord() {
        super(Sort.SORT);
    }

    /**
     * Create a detached, initialised SortRecord
     */
    public SortRecord(Integer sortId, String sortName, Short parentId, Short level, Byte hasChild, Timestamp createTime, String sortImg, String imgLink, Short first, Byte type, String sortDesc, String keywords) {
        super(Sort.SORT);

        set(0, sortId);
        set(1, sortName);
        set(2, parentId);
        set(3, level);
        set(4, hasChild);
        set(5, createTime);
        set(6, sortImg);
        set(7, imgLink);
        set(8, first);
        set(9, type);
        set(10, sortDesc);
        set(11, keywords);
    }
}