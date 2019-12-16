/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables.records;


import com.vpu.mp.db.shop.tables.CartBackups;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record18;
import org.jooq.Row18;
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
public class CartBackupsRecord extends UpdatableRecordImpl<CartBackupsRecord> implements Record18<Integer, Integer, Integer, Integer, String, String, String, Integer, String, BigDecimal, Byte, Short, BigDecimal, Byte, Integer, Byte, Timestamp, Timestamp> {

    private static final long serialVersionUID = -394285136;

    /**
     * Setter for <code>mini_shop_4748160.b2c_cart_backups.cart_id</code>.
     */
    public void setCartId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_shop_4748160.b2c_cart_backups.cart_id</code>.
     */
    public Integer getCartId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_shop_4748160.b2c_cart_backups.store_id</code>. 门店id
     */
    public void setStoreId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_shop_4748160.b2c_cart_backups.store_id</code>. 门店id
     */
    public Integer getStoreId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>mini_shop_4748160.b2c_cart_backups.user_id</code>. 用户id
     */
    public void setUserId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_shop_4748160.b2c_cart_backups.user_id</code>. 用户id
     */
    public Integer getUserId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>mini_shop_4748160.b2c_cart_backups.goods_id</code>. 商品id
     */
    public void setGoodsId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_shop_4748160.b2c_cart_backups.goods_id</code>. 商品id
     */
    public Integer getGoodsId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>mini_shop_4748160.b2c_cart_backups.goods_sn</code>. 商品sn
     */
    public void setGoodsSn(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_shop_4748160.b2c_cart_backups.goods_sn</code>. 商品sn
     */
    public String getGoodsSn() {
        return (String) get(4);
    }

    /**
     * Setter for <code>mini_shop_4748160.b2c_cart_backups.goods_name</code>. 商品名称
     */
    public void setGoodsName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_shop_4748160.b2c_cart_backups.goods_name</code>. 商品名称
     */
    public String getGoodsName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>mini_shop_4748160.b2c_cart_backups.goods_specs</code>. 例如,颜色:黑色
     */
    public void setGoodsSpecs(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_shop_4748160.b2c_cart_backups.goods_specs</code>. 例如,颜色:黑色
     */
    public String getGoodsSpecs() {
        return (String) get(6);
    }

    /**
     * Setter for <code>mini_shop_4748160.b2c_cart_backups.product_id</code>. 规格产品id
     */
    public void setProductId(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>mini_shop_4748160.b2c_cart_backups.product_id</code>. 规格产品id
     */
    public Integer getProductId() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>mini_shop_4748160.b2c_cart_backups.prd_sn</code>. 规格sn
     */
    public void setPrdSn(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>mini_shop_4748160.b2c_cart_backups.prd_sn</code>. 规格sn
     */
    public String getPrdSn() {
        return (String) get(8);
    }

    /**
     * Setter for <code>mini_shop_4748160.b2c_cart_backups.goods_price</code>. 商品价格
     */
    public void setGoodsPrice(BigDecimal value) {
        set(9, value);
    }

    /**
     * Getter for <code>mini_shop_4748160.b2c_cart_backups.goods_price</code>. 商品价格
     */
    public BigDecimal getGoodsPrice() {
        return (BigDecimal) get(9);
    }

    /**
     * Setter for <code>mini_shop_4748160.b2c_cart_backups.is_checked</code>. 是否选中
     */
    public void setIsChecked(Byte value) {
        set(10, value);
    }

    /**
     * Getter for <code>mini_shop_4748160.b2c_cart_backups.is_checked</code>. 是否选中
     */
    public Byte getIsChecked() {
        return (Byte) get(10);
    }

    /**
     * Setter for <code>mini_shop_4748160.b2c_cart_backups.cart_number</code>. 数量
     */
    public void setCartNumber(Short value) {
        set(11, value);
    }

    /**
     * Getter for <code>mini_shop_4748160.b2c_cart_backups.cart_number</code>. 数量
     */
    public Short getCartNumber() {
        return (Short) get(11);
    }

    /**
     * Setter for <code>mini_shop_4748160.b2c_cart_backups.original_price</code>. 加入购物车时的价格
     */
    public void setOriginalPrice(BigDecimal value) {
        set(12, value);
    }

    /**
     * Getter for <code>mini_shop_4748160.b2c_cart_backups.original_price</code>. 加入购物车时的价格
     */
    public BigDecimal getOriginalPrice() {
        return (BigDecimal) get(12);
    }

    /**
     * Setter for <code>mini_shop_4748160.b2c_cart_backups.type</code>. 类型 0 普通 
     */
    public void setType(Byte value) {
        set(13, value);
    }

    /**
     * Getter for <code>mini_shop_4748160.b2c_cart_backups.type</code>. 类型 0 普通 
     */
    public Byte getType() {
        return (Byte) get(13);
    }

    /**
     * Setter for <code>mini_shop_4748160.b2c_cart_backups.extend_id</code>. 扩展字段:对应type的类型 
     */
    public void setExtendId(Integer value) {
        set(14, value);
    }

    /**
     * Getter for <code>mini_shop_4748160.b2c_cart_backups.extend_id</code>. 扩展字段:对应type的类型 
     */
    public Integer getExtendId() {
        return (Integer) get(14);
    }

    /**
     * Setter for <code>mini_shop_4748160.b2c_cart_backups.data_type</code>. 0下单 1用户删除 2商品失效9
     */
    public void setDataType(Byte value) {
        set(15, value);
    }

    /**
     * Getter for <code>mini_shop_4748160.b2c_cart_backups.data_type</code>. 0下单 1用户删除 2商品失效9
     */
    public Byte getDataType() {
        return (Byte) get(15);
    }

    /**
     * Setter for <code>mini_shop_4748160.b2c_cart_backups.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(16, value);
    }

    /**
     * Getter for <code>mini_shop_4748160.b2c_cart_backups.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(16);
    }

    /**
     * Setter for <code>mini_shop_4748160.b2c_cart_backups.update_time</code>. 最后修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(17, value);
    }

    /**
     * Getter for <code>mini_shop_4748160.b2c_cart_backups.update_time</code>. 最后修改时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(17);
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
    // Record18 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row18<Integer, Integer, Integer, Integer, String, String, String, Integer, String, BigDecimal, Byte, Short, BigDecimal, Byte, Integer, Byte, Timestamp, Timestamp> fieldsRow() {
        return (Row18) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row18<Integer, Integer, Integer, Integer, String, String, String, Integer, String, BigDecimal, Byte, Short, BigDecimal, Byte, Integer, Byte, Timestamp, Timestamp> valuesRow() {
        return (Row18) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return CartBackups.CART_BACKUPS.CART_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return CartBackups.CART_BACKUPS.STORE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return CartBackups.CART_BACKUPS.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return CartBackups.CART_BACKUPS.GOODS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return CartBackups.CART_BACKUPS.GOODS_SN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return CartBackups.CART_BACKUPS.GOODS_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return CartBackups.CART_BACKUPS.GOODS_SPECS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return CartBackups.CART_BACKUPS.PRODUCT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return CartBackups.CART_BACKUPS.PRD_SN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field10() {
        return CartBackups.CART_BACKUPS.GOODS_PRICE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field11() {
        return CartBackups.CART_BACKUPS.IS_CHECKED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field12() {
        return CartBackups.CART_BACKUPS.CART_NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field13() {
        return CartBackups.CART_BACKUPS.ORIGINAL_PRICE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field14() {
        return CartBackups.CART_BACKUPS.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field15() {
        return CartBackups.CART_BACKUPS.EXTEND_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field16() {
        return CartBackups.CART_BACKUPS.DATA_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field17() {
        return CartBackups.CART_BACKUPS.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field18() {
        return CartBackups.CART_BACKUPS.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getCartId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getStoreId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getGoodsId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getGoodsSn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getGoodsName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getGoodsSpecs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getProductId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getPrdSn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component10() {
        return getGoodsPrice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component11() {
        return getIsChecked();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component12() {
        return getCartNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component13() {
        return getOriginalPrice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component14() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component15() {
        return getExtendId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component16() {
        return getDataType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component17() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component18() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getCartId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getStoreId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getGoodsId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getGoodsSn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getGoodsName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getGoodsSpecs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getProductId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getPrdSn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value10() {
        return getGoodsPrice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value11() {
        return getIsChecked();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value12() {
        return getCartNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value13() {
        return getOriginalPrice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value14() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value15() {
        return getExtendId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value16() {
        return getDataType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value17() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value18() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CartBackupsRecord value1(Integer value) {
        setCartId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CartBackupsRecord value2(Integer value) {
        setStoreId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CartBackupsRecord value3(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CartBackupsRecord value4(Integer value) {
        setGoodsId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CartBackupsRecord value5(String value) {
        setGoodsSn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CartBackupsRecord value6(String value) {
        setGoodsName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CartBackupsRecord value7(String value) {
        setGoodsSpecs(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CartBackupsRecord value8(Integer value) {
        setProductId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CartBackupsRecord value9(String value) {
        setPrdSn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CartBackupsRecord value10(BigDecimal value) {
        setGoodsPrice(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CartBackupsRecord value11(Byte value) {
        setIsChecked(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CartBackupsRecord value12(Short value) {
        setCartNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CartBackupsRecord value13(BigDecimal value) {
        setOriginalPrice(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CartBackupsRecord value14(Byte value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CartBackupsRecord value15(Integer value) {
        setExtendId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CartBackupsRecord value16(Byte value) {
        setDataType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CartBackupsRecord value17(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CartBackupsRecord value18(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CartBackupsRecord values(Integer value1, Integer value2, Integer value3, Integer value4, String value5, String value6, String value7, Integer value8, String value9, BigDecimal value10, Byte value11, Short value12, BigDecimal value13, Byte value14, Integer value15, Byte value16, Timestamp value17, Timestamp value18) {
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
        value16(value16);
        value17(value17);
        value18(value18);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CartBackupsRecord
     */
    public CartBackupsRecord() {
        super(CartBackups.CART_BACKUPS);
    }

    /**
     * Create a detached, initialised CartBackupsRecord
     */
    public CartBackupsRecord(Integer cartId, Integer storeId, Integer userId, Integer goodsId, String goodsSn, String goodsName, String goodsSpecs, Integer productId, String prdSn, BigDecimal goodsPrice, Byte isChecked, Short cartNumber, BigDecimal originalPrice, Byte type, Integer extendId, Byte dataType, Timestamp createTime, Timestamp updateTime) {
        super(CartBackups.CART_BACKUPS);

        set(0, cartId);
        set(1, storeId);
        set(2, userId);
        set(3, goodsId);
        set(4, goodsSn);
        set(5, goodsName);
        set(6, goodsSpecs);
        set(7, productId);
        set(8, prdSn);
        set(9, goodsPrice);
        set(10, isChecked);
        set(11, cartNumber);
        set(12, originalPrice);
        set(13, type);
        set(14, extendId);
        set(15, dataType);
        set(16, createTime);
        set(17, updateTime);
    }
}
