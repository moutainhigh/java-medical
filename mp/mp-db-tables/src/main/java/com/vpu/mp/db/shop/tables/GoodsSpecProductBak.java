/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables;


import com.vpu.mp.db.shop.Indexes;
import com.vpu.mp.db.shop.Keys;
import com.vpu.mp.db.shop.MiniShop_471752;
import com.vpu.mp.db.shop.tables.records.GoodsSpecProductBakRecord;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class GoodsSpecProductBak extends TableImpl<GoodsSpecProductBakRecord> {

    private static final long serialVersionUID = 1848635176;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_goods_spec_product_bak</code>
     */
    public static final GoodsSpecProductBak GOODS_SPEC_PRODUCT_BAK = new GoodsSpecProductBak();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GoodsSpecProductBakRecord> getRecordType() {
        return GoodsSpecProductBakRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_goods_spec_product_bak.prd_bak_id</code>.
     */
    public final TableField<GoodsSpecProductBakRecord, Integer> PRD_BAK_ID = createField("prd_bak_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_goods_spec_product_bak.del_time</code>.
     */
    public final TableField<GoodsSpecProductBakRecord, Timestamp> DEL_TIME = createField("del_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_goods_spec_product_bak.prd_id</code>.
     */
    public final TableField<GoodsSpecProductBakRecord, Integer> PRD_ID = createField("prd_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_goods_spec_product_bak.shop_id</code>.
     */
    public final TableField<GoodsSpecProductBakRecord, Integer> SHOP_ID = createField("shop_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_goods_spec_product_bak.goods_id</code>.
     */
    public final TableField<GoodsSpecProductBakRecord, Integer> GOODS_ID = createField("goods_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_goods_spec_product_bak.prd_price</code>.
     */
    public final TableField<GoodsSpecProductBakRecord, BigDecimal> PRD_PRICE = createField("prd_price", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_goods_spec_product_bak.prd_market_price</code>. 市场价
     */
    public final TableField<GoodsSpecProductBakRecord, BigDecimal> PRD_MARKET_PRICE = createField("prd_market_price", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "市场价");

    /**
     * The column <code>mini_shop_471752.b2c_goods_spec_product_bak.prd_cost_price</code>. 成本价
     */
    public final TableField<GoodsSpecProductBakRecord, BigDecimal> PRD_COST_PRICE = createField("prd_cost_price", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "成本价");

    /**
     * The column <code>mini_shop_471752.b2c_goods_spec_product_bak.prd_number</code>. 当前规格组合产品库存
     */
    public final TableField<GoodsSpecProductBakRecord, Integer> PRD_NUMBER = createField("prd_number", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "当前规格组合产品库存");

    /**
     * The column <code>mini_shop_471752.b2c_goods_spec_product_bak.prd_sn</code>. 商家编码
     */
    public final TableField<GoodsSpecProductBakRecord, String> PRD_SN = createField("prd_sn", org.jooq.impl.SQLDataType.VARCHAR(65).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "商家编码");

    /**
     * The column <code>mini_shop_471752.b2c_goods_spec_product_bak.prd_codes</code>. 商品条码
     */
    public final TableField<GoodsSpecProductBakRecord, String> PRD_CODES = createField("prd_codes", org.jooq.impl.SQLDataType.VARCHAR(500).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "商品条码");

    /**
     * The column <code>mini_shop_471752.b2c_goods_spec_product_bak.prd_specs</code>.
     */
    public final TableField<GoodsSpecProductBakRecord, String> PRD_SPECS = createField("prd_specs", org.jooq.impl.SQLDataType.VARCHAR(1024).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_goods_spec_product_bak.prd_desc</code>. 规格描述，格式例子：颜色:红色 尺码:s
     */
    public final TableField<GoodsSpecProductBakRecord, String> PRD_DESC = createField("prd_desc", org.jooq.impl.SQLDataType.VARCHAR(1024).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "规格描述，格式例子：颜色:红色 尺码:s");

    /**
     * The column <code>mini_shop_471752.b2c_goods_spec_product_bak.del_flag</code>.
     */
    public final TableField<GoodsSpecProductBakRecord, Byte> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_goods_spec_product_bak.self_flag</code>. 1:商家自己添加商品，其他没用
     */
    public final TableField<GoodsSpecProductBakRecord, Byte> SELF_FLAG = createField("self_flag", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "1:商家自己添加商品，其他没用");

    /**
     * The column <code>mini_shop_471752.b2c_goods_spec_product_bak.low_shop_price</code>. 最低售出价格
     */
    public final TableField<GoodsSpecProductBakRecord, String> LOW_SHOP_PRICE = createField("low_shop_price", org.jooq.impl.SQLDataType.VARCHAR(1024).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.VARCHAR)), this, "最低售出价格");

    /**
     * The column <code>mini_shop_471752.b2c_goods_spec_product_bak.prd_img</code>. 图片地址
     */
    public final TableField<GoodsSpecProductBakRecord, String> PRD_IMG = createField("prd_img", org.jooq.impl.SQLDataType.VARCHAR(1024).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "图片地址");

    /**
     * The column <code>mini_shop_471752.b2c_goods_spec_product_bak.price_flag</code>. 0:商家未改价，1：商家改价，2：批量改价，3：毛利改价
     */
    public final TableField<GoodsSpecProductBakRecord, Byte> PRICE_FLAG = createField("price_flag", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "0:商家未改价，1：商家改价，2：批量改价，3：毛利改价");

    /**
     * The column <code>mini_shop_471752.b2c_goods_spec_product_bak.create_time</code>. 规格记录在原表内的添加时间
     */
    public final TableField<GoodsSpecProductBakRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0000-00-00 00:00:00", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "规格记录在原表内的添加时间");

    /**
     * The column <code>mini_shop_471752.b2c_goods_spec_product_bak.update_time</code>. 规格记录在原表内的最后修改时间
     */
    public final TableField<GoodsSpecProductBakRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0000-00-00 00:00:00", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "规格记录在原表内的最后修改时间");

    /**
     * Create a <code>mini_shop_471752.b2c_goods_spec_product_bak</code> table reference
     */
    public GoodsSpecProductBak() {
        this(DSL.name("b2c_goods_spec_product_bak"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_goods_spec_product_bak</code> table reference
     */
    public GoodsSpecProductBak(String alias) {
        this(DSL.name(alias), GOODS_SPEC_PRODUCT_BAK);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_goods_spec_product_bak</code> table reference
     */
    public GoodsSpecProductBak(Name alias) {
        this(alias, GOODS_SPEC_PRODUCT_BAK);
    }

    private GoodsSpecProductBak(Name alias, Table<GoodsSpecProductBakRecord> aliased) {
        this(alias, aliased, null);
    }

    private GoodsSpecProductBak(Name alias, Table<GoodsSpecProductBakRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> GoodsSpecProductBak(Table<O> child, ForeignKey<O, GoodsSpecProductBakRecord> key) {
        super(child, key, GOODS_SPEC_PRODUCT_BAK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return MiniShop_471752.MINI_SHOP_471752;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.GOODS_SPEC_PRODUCT_BAK_GSP_GOODS_CODES, Indexes.GOODS_SPEC_PRODUCT_BAK_GSP_GOODS_ID, Indexes.GOODS_SPEC_PRODUCT_BAK_GSP_PRD_SN, Indexes.GOODS_SPEC_PRODUCT_BAK_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<GoodsSpecProductBakRecord, Integer> getIdentity() {
        return Keys.IDENTITY_GOODS_SPEC_PRODUCT_BAK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<GoodsSpecProductBakRecord> getPrimaryKey() {
        return Keys.KEY_B2C_GOODS_SPEC_PRODUCT_BAK_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<GoodsSpecProductBakRecord>> getKeys() {
        return Arrays.<UniqueKey<GoodsSpecProductBakRecord>>asList(Keys.KEY_B2C_GOODS_SPEC_PRODUCT_BAK_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GoodsSpecProductBak as(String alias) {
        return new GoodsSpecProductBak(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GoodsSpecProductBak as(Name alias) {
        return new GoodsSpecProductBak(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public GoodsSpecProductBak rename(String name) {
        return new GoodsSpecProductBak(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public GoodsSpecProductBak rename(Name name) {
        return new GoodsSpecProductBak(name, null);
    }
}
