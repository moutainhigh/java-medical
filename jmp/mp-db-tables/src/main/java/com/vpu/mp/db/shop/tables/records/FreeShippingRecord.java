/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables.records;


import com.vpu.mp.db.shop.tables.FreeShipping;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record15;
import org.jooq.Row15;
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
public class FreeShippingRecord extends UpdatableRecordImpl<FreeShippingRecord> implements Record15<Integer, String, Byte, Timestamp, Timestamp, Byte, String, String, String, Byte, Timestamp, Timestamp, Byte, Timestamp, Byte> {

    private static final long serialVersionUID = -2090370931;

    /**
     * Setter for <code>mini_shop_4748160.b2c_free_shipping.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_shop_4748160.b2c_free_shipping.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_shop_4748160.b2c_free_shipping.name</code>. 活动名称
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_shop_4748160.b2c_free_shipping.name</code>. 活动名称
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>mini_shop_4748160.b2c_free_shipping.expire_type</code>. 0:固定日期 1：永久有效
     */
    public void setExpireType(Byte value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_shop_4748160.b2c_free_shipping.expire_type</code>. 0:固定日期 1：永久有效
     */
    public Byte getExpireType() {
        return (Byte) get(2);
    }

    /**
     * Setter for <code>mini_shop_4748160.b2c_free_shipping.start_time</code>. 开始时间
     */
    public void setStartTime(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_shop_4748160.b2c_free_shipping.start_time</code>. 开始时间
     */
    public Timestamp getStartTime() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>mini_shop_4748160.b2c_free_shipping.end_time</code>. 结束时间
     */
    public void setEndTime(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_shop_4748160.b2c_free_shipping.end_time</code>. 结束时间
     */
    public Timestamp getEndTime() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>mini_shop_4748160.b2c_free_shipping.type</code>. 条件 1全部 0部分
     */
    public void setType(Byte value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_shop_4748160.b2c_free_shipping.type</code>. 条件 1全部 0部分
     */
    public Byte getType() {
        return (Byte) get(5);
    }

    /**
     * Setter for <code>mini_shop_4748160.b2c_free_shipping.recommend_goods_id</code>. 指定商品可用
     */
    public void setRecommendGoodsId(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_shop_4748160.b2c_free_shipping.recommend_goods_id</code>. 指定商品可用
     */
    public String getRecommendGoodsId() {
        return (String) get(6);
    }

    /**
     * Setter for <code>mini_shop_4748160.b2c_free_shipping.recommend_cat_id</code>. 指定分类可用
     */
    public void setRecommendCatId(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>mini_shop_4748160.b2c_free_shipping.recommend_cat_id</code>. 指定分类可用
     */
    public String getRecommendCatId() {
        return (String) get(7);
    }

    /**
     * Setter for <code>mini_shop_4748160.b2c_free_shipping.recommend_sort_id</code>. 指定商家分类可用
     */
    public void setRecommendSortId(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>mini_shop_4748160.b2c_free_shipping.recommend_sort_id</code>. 指定商家分类可用
     */
    public String getRecommendSortId() {
        return (String) get(8);
    }

    /**
     * Setter for <code>mini_shop_4748160.b2c_free_shipping.status</code>. 1停用
     */
    public void setStatus(Byte value) {
        set(9, value);
    }

    /**
     * Getter for <code>mini_shop_4748160.b2c_free_shipping.status</code>. 1停用
     */
    public Byte getStatus() {
        return (Byte) get(9);
    }

    /**
     * Setter for <code>mini_shop_4748160.b2c_free_shipping.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(10, value);
    }

    /**
     * Getter for <code>mini_shop_4748160.b2c_free_shipping.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>mini_shop_4748160.b2c_free_shipping.update_time</code>. 最后修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(11, value);
    }

    /**
     * Getter for <code>mini_shop_4748160.b2c_free_shipping.update_time</code>. 最后修改时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(11);
    }

    /**
     * Setter for <code>mini_shop_4748160.b2c_free_shipping.del_flag</code>. 1删除
     */
    public void setDelFlag(Byte value) {
        set(12, value);
    }

    /**
     * Getter for <code>mini_shop_4748160.b2c_free_shipping.del_flag</code>. 1删除
     */
    public Byte getDelFlag() {
        return (Byte) get(12);
    }

    /**
     * Setter for <code>mini_shop_4748160.b2c_free_shipping.del_time</code>.
     */
    public void setDelTime(Timestamp value) {
        set(13, value);
    }

    /**
     * Getter for <code>mini_shop_4748160.b2c_free_shipping.del_time</code>.
     */
    public Timestamp getDelTime() {
        return (Timestamp) get(13);
    }

    /**
     * Setter for <code>mini_shop_4748160.b2c_free_shipping.level</code>. 优先级 默认0
     */
    public void setLevel(Byte value) {
        set(14, value);
    }

    /**
     * Getter for <code>mini_shop_4748160.b2c_free_shipping.level</code>. 优先级 默认0
     */
    public Byte getLevel() {
        return (Byte) get(14);
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
    // Record15 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<Integer, String, Byte, Timestamp, Timestamp, Byte, String, String, String, Byte, Timestamp, Timestamp, Byte, Timestamp, Byte> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<Integer, String, Byte, Timestamp, Timestamp, Byte, String, String, String, Byte, Timestamp, Timestamp, Byte, Timestamp, Byte> valuesRow() {
        return (Row15) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return FreeShipping.FREE_SHIPPING.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return FreeShipping.FREE_SHIPPING.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field3() {
        return FreeShipping.FREE_SHIPPING.EXPIRE_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return FreeShipping.FREE_SHIPPING.START_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return FreeShipping.FREE_SHIPPING.END_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field6() {
        return FreeShipping.FREE_SHIPPING.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return FreeShipping.FREE_SHIPPING.RECOMMEND_GOODS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return FreeShipping.FREE_SHIPPING.RECOMMEND_CAT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return FreeShipping.FREE_SHIPPING.RECOMMEND_SORT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field10() {
        return FreeShipping.FREE_SHIPPING.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return FreeShipping.FREE_SHIPPING.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return FreeShipping.FREE_SHIPPING.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field13() {
        return FreeShipping.FREE_SHIPPING.DEL_FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field14() {
        return FreeShipping.FREE_SHIPPING.DEL_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field15() {
        return FreeShipping.FREE_SHIPPING.LEVEL;
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
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component3() {
        return getExpireType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getStartTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getEndTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component6() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getRecommendGoodsId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getRecommendCatId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getRecommendSortId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component10() {
        return getStatus();
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
    public Byte component13() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component14() {
        return getDelTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component15() {
        return getLevel();
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
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value3() {
        return getExpireType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getStartTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getEndTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value6() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getRecommendGoodsId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getRecommendCatId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getRecommendSortId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value10() {
        return getStatus();
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
    public Byte value13() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value14() {
        return getDelTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value15() {
        return getLevel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FreeShippingRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FreeShippingRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FreeShippingRecord value3(Byte value) {
        setExpireType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FreeShippingRecord value4(Timestamp value) {
        setStartTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FreeShippingRecord value5(Timestamp value) {
        setEndTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FreeShippingRecord value6(Byte value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FreeShippingRecord value7(String value) {
        setRecommendGoodsId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FreeShippingRecord value8(String value) {
        setRecommendCatId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FreeShippingRecord value9(String value) {
        setRecommendSortId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FreeShippingRecord value10(Byte value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FreeShippingRecord value11(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FreeShippingRecord value12(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FreeShippingRecord value13(Byte value) {
        setDelFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FreeShippingRecord value14(Timestamp value) {
        setDelTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FreeShippingRecord value15(Byte value) {
        setLevel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FreeShippingRecord values(Integer value1, String value2, Byte value3, Timestamp value4, Timestamp value5, Byte value6, String value7, String value8, String value9, Byte value10, Timestamp value11, Timestamp value12, Byte value13, Timestamp value14, Byte value15) {
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
        value14(value14);
        value15(value15);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FreeShippingRecord
     */
    public FreeShippingRecord() {
        super(FreeShipping.FREE_SHIPPING);
    }

    /**
     * Create a detached, initialised FreeShippingRecord
     */
    public FreeShippingRecord(Integer id, String name, Byte expireType, Timestamp startTime, Timestamp endTime, Byte type, String recommendGoodsId, String recommendCatId, String recommendSortId, Byte status, Timestamp createTime, Timestamp updateTime, Byte delFlag, Timestamp delTime, Byte level) {
        super(FreeShipping.FREE_SHIPPING);

        set(0, id);
        set(1, name);
        set(2, expireType);
        set(3, startTime);
        set(4, endTime);
        set(5, type);
        set(6, recommendGoodsId);
        set(7, recommendCatId);
        set(8, recommendSortId);
        set(9, status);
        set(10, createTime);
        set(11, updateTime);
        set(12, delFlag);
        set(13, delTime);
        set(14, level);
    }
}
