/*
 * This file is generated by jOOQ.
 */
package com.vpu.jmd.table.main.tables.records;



import java.sql.Timestamp;

import javax.annotation.Generated;

import com.vpu.jmd.table.main.tables.Category;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
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
public class CategoryRecord extends UpdatableRecordImpl<CategoryRecord> implements Record10<Integer, String, String, String, Integer, Short, Byte, Timestamp, String, Short> {

    private static final long serialVersionUID = -1726893039;

    /**
     * Setter for <code>mini_main.b2c_category.cat_id</code>.
     */
    public void setCatId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_main.b2c_category.cat_id</code>.
     */
    public Integer getCatId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_main.b2c_category.cat_name</code>. 分类名称
     */
    public void setCatName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_main.b2c_category.cat_name</code>. 分类名称
     */
    public String getCatName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>mini_main.b2c_category.keywords</code>. 关键词
     */
    public void setKeywords(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_main.b2c_category.keywords</code>. 关键词
     */
    public String getKeywords() {
        return (String) get(2);
    }

    /**
     * Setter for <code>mini_main.b2c_category.cat_desc</code>. 分类描述
     */
    public void setCatDesc(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_main.b2c_category.cat_desc</code>. 分类描述
     */
    public String getCatDesc() {
        return (String) get(3);
    }

    /**
     * Setter for <code>mini_main.b2c_category.parent_id</code>. 父ID
     */
    public void setParentId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_main.b2c_category.parent_id</code>. 父ID
     */
    public Integer getParentId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>mini_main.b2c_category.level</code>. 层级
     */
    public void setLevel(Short value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_main.b2c_category.level</code>. 层级
     */
    public Short getLevel() {
        return (Short) get(5);
    }

    /**
     * Setter for <code>mini_main.b2c_category.has_child</code>. 是否是子节点
     */
    public void setHasChild(Byte value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_main.b2c_category.has_child</code>. 是否是子节点
     */
    public Byte getHasChild() {
        return (Byte) get(6);
    }

    /**
     * Setter for <code>mini_main.b2c_category.create_time</code>. 添加时间
     */
    public void setCreateTime(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>mini_main.b2c_category.create_time</code>. 添加时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>mini_main.b2c_category.cat_img</code>. 分类图标
     */
    public void setCatImg(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>mini_main.b2c_category.cat_img</code>. 分类图标
     */
    public String getCatImg() {
        return (String) get(8);
    }

    /**
     * Setter for <code>mini_main.b2c_category.first</code>. 优先级
     */
    public void setFirst(Short value) {
        set(9, value);
    }

    /**
     * Getter for <code>mini_main.b2c_category.first</code>. 优先级
     */
    public Short getFirst() {
        return (Short) get(9);
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
    public Row10<Integer, String, String, String, Integer, Short, Byte, Timestamp, String, Short> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, String, String, String, Integer, Short, Byte, Timestamp, String, Short> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Category.CATEGORY.CAT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Category.CATEGORY.CAT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Category.CATEGORY.KEYWORDS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Category.CATEGORY.CAT_DESC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return Category.CATEGORY.PARENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field6() {
        return Category.CATEGORY.LEVEL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field7() {
        return Category.CATEGORY.HAS_CHILD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return Category.CATEGORY.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return Category.CATEGORY.CAT_IMG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field10() {
        return Category.CATEGORY.FIRST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getCatId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getCatName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getKeywords();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getCatDesc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getParentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component6() {
        return getLevel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component7() {
        return getHasChild();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component8() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getCatImg();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component10() {
        return getFirst();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getCatId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getCatName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getKeywords();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getCatDesc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getParentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value6() {
        return getLevel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value7() {
        return getHasChild();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getCatImg();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value10() {
        return getFirst();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CategoryRecord value1(Integer value) {
        setCatId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CategoryRecord value2(String value) {
        setCatName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CategoryRecord value3(String value) {
        setKeywords(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CategoryRecord value4(String value) {
        setCatDesc(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CategoryRecord value5(Integer value) {
        setParentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CategoryRecord value6(Short value) {
        setLevel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CategoryRecord value7(Byte value) {
        setHasChild(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CategoryRecord value8(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CategoryRecord value9(String value) {
        setCatImg(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CategoryRecord value10(Short value) {
        setFirst(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CategoryRecord values(Integer value1, String value2, String value3, String value4, Integer value5, Short value6, Byte value7, Timestamp value8, String value9, Short value10) {
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
     * Create a detached CategoryRecord
     */
    public CategoryRecord() {
        super(Category.CATEGORY);
    }

    /**
     * Create a detached, initialised CategoryRecord
     */
    public CategoryRecord(Integer catId, String catName, String keywords, String catDesc, Integer parentId, Short level, Byte hasChild, Timestamp createTime, String catImg, Short first) {
        super(Category.CATEGORY);

        set(0, catId);
        set(1, catName);
        set(2, keywords);
        set(3, catDesc);
        set(4, parentId);
        set(5, level);
        set(6, hasChild);
        set(7, createTime);
        set(8, catImg);
        set(9, first);
    }
}