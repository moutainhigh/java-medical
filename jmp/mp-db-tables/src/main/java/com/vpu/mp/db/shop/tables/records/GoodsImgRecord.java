/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables.records;


import com.vpu.mp.db.shop.tables.GoodsImg;

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
public class GoodsImgRecord extends UpdatableRecordImpl<GoodsImgRecord> implements Record6<Integer, Integer, String, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = 503659869;

    /**
     * Setter for <code>mini_shop_471752.b2c_goods_img.img_id</code>.
     */
    public void setImgId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_goods_img.img_id</code>.
     */
    public Integer getImgId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_goods_img.goods_id</code>.
     */
    public void setGoodsId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_goods_img.goods_id</code>.
     */
    public Integer getGoodsId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_goods_img.img_url</code>.
     */
    public void setImgUrl(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_goods_img.img_url</code>.
     */
    public String getImgUrl() {
        return (String) get(2);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_goods_img.img_desc</code>.
     */
    public void setImgDesc(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_goods_img.img_desc</code>.
     */
    public String getImgDesc() {
        return (String) get(3);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_goods_img.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_goods_img.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_goods_img.update_time</code>. 最后修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_goods_img.update_time</code>. 最后修改时间
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
        return GoodsImg.GOODS_IMG.IMG_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return GoodsImg.GOODS_IMG.GOODS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return GoodsImg.GOODS_IMG.IMG_URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return GoodsImg.GOODS_IMG.IMG_DESC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return GoodsImg.GOODS_IMG.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return GoodsImg.GOODS_IMG.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getImgId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getGoodsId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getImgUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getImgDesc();
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
        return getImgId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getGoodsId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getImgUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getImgDesc();
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
    public GoodsImgRecord value1(Integer value) {
        setImgId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GoodsImgRecord value2(Integer value) {
        setGoodsId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GoodsImgRecord value3(String value) {
        setImgUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GoodsImgRecord value4(String value) {
        setImgDesc(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GoodsImgRecord value5(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GoodsImgRecord value6(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GoodsImgRecord values(Integer value1, Integer value2, String value3, String value4, Timestamp value5, Timestamp value6) {
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
     * Create a detached GoodsImgRecord
     */
    public GoodsImgRecord() {
        super(GoodsImg.GOODS_IMG);
    }

    /**
     * Create a detached, initialised GoodsImgRecord
     */
    public GoodsImgRecord(Integer imgId, Integer goodsId, String imgUrl, String imgDesc, Timestamp createTime, Timestamp updateTime) {
        super(GoodsImg.GOODS_IMG);

        set(0, imgId);
        set(1, goodsId);
        set(2, imgUrl);
        set(3, imgDesc);
        set(4, createTime);
        set(5, updateTime);
    }
}
