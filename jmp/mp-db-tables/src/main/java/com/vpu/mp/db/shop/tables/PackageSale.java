/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables;


import com.vpu.mp.db.shop.Keys;
import com.vpu.mp.db.shop.MiniShop_471752;
import com.vpu.mp.db.shop.tables.records.PackageSaleRecord;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
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
public class PackageSale extends TableImpl<PackageSaleRecord> {

    private static final long serialVersionUID = 1035373142;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_package_sale</code>
     */
    public static final PackageSale PACKAGE_SALE = new PackageSale();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PackageSaleRecord> getRecordType() {
        return PackageSaleRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_package_sale.id</code>.
     */
    public final TableField<PackageSaleRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_package_sale.package_name</code>. 名称
     */
    public final TableField<PackageSaleRecord, String> PACKAGE_NAME = createField("package_name", org.jooq.impl.SQLDataType.VARCHAR(120), this, "名称");

    /**
     * The column <code>mini_shop_471752.b2c_package_sale.start_time</code>. 开始时间
     */
    public final TableField<PackageSaleRecord, Timestamp> START_TIME = createField("start_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "开始时间");

    /**
     * The column <code>mini_shop_471752.b2c_package_sale.end_time</code>. 结束时间
     */
    public final TableField<PackageSaleRecord, Timestamp> END_TIME = createField("end_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "结束时间");

    /**
     * The column <code>mini_shop_471752.b2c_package_sale.total_money</code>. 结算总价格
     */
    public final TableField<PackageSaleRecord, BigDecimal> TOTAL_MONEY = createField("total_money", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false).defaultValue(DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "结算总价格");

    /**
     * The column <code>mini_shop_471752.b2c_package_sale.goods_group_1</code>. 分组一，1启用
     */
    public final TableField<PackageSaleRecord, Byte> GOODS_GROUP_1 = createField("goods_group_1", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "分组一，1启用");

    /**
     * The column <code>mini_shop_471752.b2c_package_sale.group_name_1</code>. 分组名称
     */
    public final TableField<PackageSaleRecord, String> GROUP_NAME_1 = createField("group_name_1", org.jooq.impl.SQLDataType.VARCHAR(20), this, "分组名称");

    /**
     * The column <code>mini_shop_471752.b2c_package_sale.goods_number_1</code>. 分组商品数
     */
    public final TableField<PackageSaleRecord, Integer> GOODS_NUMBER_1 = createField("goods_number_1", org.jooq.impl.SQLDataType.INTEGER.defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "分组商品数");

    /**
     * The column <code>mini_shop_471752.b2c_package_sale.goods_ids_1</code>. 分组goodsids
     */
    public final TableField<PackageSaleRecord, String> GOODS_IDS_1 = createField("goods_ids_1", org.jooq.impl.SQLDataType.CLOB, this, "分组goodsids");

    /**
     * The column <code>mini_shop_471752.b2c_package_sale.cat_ids_1</code>. 分组平台分类id
     */
    public final TableField<PackageSaleRecord, String> CAT_IDS_1 = createField("cat_ids_1", org.jooq.impl.SQLDataType.CLOB, this, "分组平台分类id");

    /**
     * The column <code>mini_shop_471752.b2c_package_sale.sort_ids_1</code>. 分组商家分类id
     */
    public final TableField<PackageSaleRecord, String> SORT_IDS_1 = createField("sort_ids_1", org.jooq.impl.SQLDataType.CLOB, this, "分组商家分类id");

    /**
     * The column <code>mini_shop_471752.b2c_package_sale.goods_group_2</code>. 分组二，1启用
     */
    public final TableField<PackageSaleRecord, Byte> GOODS_GROUP_2 = createField("goods_group_2", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "分组二，1启用");

    /**
     * The column <code>mini_shop_471752.b2c_package_sale.group_name_2</code>. 分组名称
     */
    public final TableField<PackageSaleRecord, String> GROUP_NAME_2 = createField("group_name_2", org.jooq.impl.SQLDataType.VARCHAR(20), this, "分组名称");

    /**
     * The column <code>mini_shop_471752.b2c_package_sale.goods_number_2</code>. 分组商品数
     */
    public final TableField<PackageSaleRecord, Integer> GOODS_NUMBER_2 = createField("goods_number_2", org.jooq.impl.SQLDataType.INTEGER.defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "分组商品数");

    /**
     * The column <code>mini_shop_471752.b2c_package_sale.goods_ids_2</code>. 分组goodsids
     */
    public final TableField<PackageSaleRecord, String> GOODS_IDS_2 = createField("goods_ids_2", org.jooq.impl.SQLDataType.CLOB, this, "分组goodsids");

    /**
     * The column <code>mini_shop_471752.b2c_package_sale.cat_ids_2</code>. 分组平台分类id
     */
    public final TableField<PackageSaleRecord, String> CAT_IDS_2 = createField("cat_ids_2", org.jooq.impl.SQLDataType.CLOB, this, "分组平台分类id");

    /**
     * The column <code>mini_shop_471752.b2c_package_sale.sort_ids_2</code>. 分组商家分类id
     */
    public final TableField<PackageSaleRecord, String> SORT_IDS_2 = createField("sort_ids_2", org.jooq.impl.SQLDataType.CLOB, this, "分组商家分类id");

    /**
     * The column <code>mini_shop_471752.b2c_package_sale.goods_group_3</code>. 分组三，1启用
     */
    public final TableField<PackageSaleRecord, Byte> GOODS_GROUP_3 = createField("goods_group_3", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "分组三，1启用");

    /**
     * The column <code>mini_shop_471752.b2c_package_sale.group_name_3</code>. 分组名称
     */
    public final TableField<PackageSaleRecord, String> GROUP_NAME_3 = createField("group_name_3", org.jooq.impl.SQLDataType.VARCHAR(20), this, "分组名称");

    /**
     * The column <code>mini_shop_471752.b2c_package_sale.goods_number_3</code>. 分组商品数
     */
    public final TableField<PackageSaleRecord, Integer> GOODS_NUMBER_3 = createField("goods_number_3", org.jooq.impl.SQLDataType.INTEGER.defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "分组商品数");

    /**
     * The column <code>mini_shop_471752.b2c_package_sale.goods_ids_3</code>. 分组goodsids
     */
    public final TableField<PackageSaleRecord, String> GOODS_IDS_3 = createField("goods_ids_3", org.jooq.impl.SQLDataType.CLOB, this, "分组goodsids");

    /**
     * The column <code>mini_shop_471752.b2c_package_sale.cat_ids_3</code>. 分组平台分类id
     */
    public final TableField<PackageSaleRecord, String> CAT_IDS_3 = createField("cat_ids_3", org.jooq.impl.SQLDataType.CLOB, this, "分组平台分类id");

    /**
     * The column <code>mini_shop_471752.b2c_package_sale.sort_ids_3</code>. 分组商家分类id
     */
    public final TableField<PackageSaleRecord, String> SORT_IDS_3 = createField("sort_ids_3", org.jooq.impl.SQLDataType.CLOB, this, "分组商家分类id");

    /**
     * The column <code>mini_shop_471752.b2c_package_sale.status</code>. 活动状态1启用
     */
    public final TableField<PackageSaleRecord, Byte> STATUS = createField("status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "活动状态1启用");

    /**
     * The column <code>mini_shop_471752.b2c_package_sale.del_flag</code>. 删除状态
     */
    public final TableField<PackageSaleRecord, Byte> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "删除状态");

    /**
     * The column <code>mini_shop_471752.b2c_package_sale.create_time</code>.
     */
    public final TableField<PackageSaleRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_package_sale.update_time</code>. 最后修改时间
     */
    public final TableField<PackageSaleRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "最后修改时间");

    /**
     * The column <code>mini_shop_471752.b2c_package_sale.package_type</code>. 活动类型0金额1折扣
     */
    public final TableField<PackageSaleRecord, Byte> PACKAGE_TYPE = createField("package_type", org.jooq.impl.SQLDataType.TINYINT.defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "活动类型0金额1折扣");

    /**
     * The column <code>mini_shop_471752.b2c_package_sale.total_ratio</code>. 结算比例
     */
    public final TableField<PackageSaleRecord, BigDecimal> TOTAL_RATIO = createField("total_ratio", org.jooq.impl.SQLDataType.DECIMAL(4, 2).defaultValue(DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "结算比例");

    /**
     * Create a <code>mini_shop_471752.b2c_package_sale</code> table reference
     */
    public PackageSale() {
        this(DSL.name("b2c_package_sale"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_package_sale</code> table reference
     */
    public PackageSale(String alias) {
        this(DSL.name(alias), PACKAGE_SALE);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_package_sale</code> table reference
     */
    public PackageSale(Name alias) {
        this(alias, PACKAGE_SALE);
    }

    private PackageSale(Name alias, Table<PackageSaleRecord> aliased) {
        this(alias, aliased, null);
    }

    private PackageSale(Name alias, Table<PackageSaleRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PackageSale(Table<O> child, ForeignKey<O, PackageSaleRecord> key) {
        super(child, key, PACKAGE_SALE);
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
    public Identity<PackageSaleRecord, Integer> getIdentity() {
        return Keys.IDENTITY_PACKAGE_SALE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PackageSaleRecord> getPrimaryKey() {
        return Keys.KEY_B2C_PACKAGE_SALE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PackageSaleRecord>> getKeys() {
        return Arrays.<UniqueKey<PackageSaleRecord>>asList(Keys.KEY_B2C_PACKAGE_SALE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PackageSale as(String alias) {
        return new PackageSale(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PackageSale as(Name alias) {
        return new PackageSale(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PackageSale rename(String name) {
        return new PackageSale(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PackageSale rename(Name name) {
        return new PackageSale(name, null);
    }
}
