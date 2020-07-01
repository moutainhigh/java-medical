/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables;


import com.vpu.mp.db.shop.Indexes;
import com.vpu.mp.db.shop.Keys;
import com.vpu.mp.db.shop.MiniShop_471752;
import com.vpu.mp.db.shop.tables.records.GoodsMedicalInfoRecord;

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
 * 商品辅助信息表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GoodsMedicalInfo extends TableImpl<GoodsMedicalInfoRecord> {

    private static final long serialVersionUID = 1540856140;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_goods_medical_info</code>
     */
    public static final GoodsMedicalInfo GOODS_MEDICAL_INFO = new GoodsMedicalInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GoodsMedicalInfoRecord> getRecordType() {
        return GoodsMedicalInfoRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_goods_medical_info.id</code>. 商品额外信息id
     */
    public final TableField<GoodsMedicalInfoRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "商品额外信息id");

    /**
     * The column <code>mini_shop_471752.b2c_goods_medical_info.goods_id</code>. 商品id
     */
    public final TableField<GoodsMedicalInfoRecord, Integer> GOODS_ID = createField("goods_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "商品id");

    /**
     * The column <code>mini_shop_471752.b2c_goods_medical_info.goods_common_name</code>. 通用名
     */
    public final TableField<GoodsMedicalInfoRecord, String> GOODS_COMMON_NAME = createField("goods_common_name", org.jooq.impl.SQLDataType.VARCHAR(512).nullable(false).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "通用名");

    /**
     * The column <code>mini_shop_471752.b2c_goods_medical_info.goods_alias_name</code>. 别名
     */
    public final TableField<GoodsMedicalInfoRecord, String> GOODS_ALIAS_NAME = createField("goods_alias_name", org.jooq.impl.SQLDataType.VARCHAR(512).nullable(false).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "别名");

    /**
     * The column <code>mini_shop_471752.b2c_goods_medical_info.goods_quality_ratio</code>. 规格系数，通用名和规格系数确定一个药品
     */
    public final TableField<GoodsMedicalInfoRecord, String> GOODS_QUALITY_RATIO = createField("goods_quality_ratio", org.jooq.impl.SQLDataType.VARCHAR(512).nullable(false).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "规格系数，通用名和规格系数确定一个药品");

    /**
     * The column <code>mini_shop_471752.b2c_goods_medical_info.is_medical</code>. 是否药品
     */
    public final TableField<GoodsMedicalInfoRecord, Byte> IS_MEDICAL = createField("is_medical", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "是否药品");

    /**
     * The column <code>mini_shop_471752.b2c_goods_medical_info.is_rx</code>. 是否处方药,rx处方药 otc非处方药
     */
    public final TableField<GoodsMedicalInfoRecord, Byte> IS_RX = createField("is_rx", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "是否处方药,rx处方药 otc非处方药");

    /**
     * The column <code>mini_shop_471752.b2c_goods_medical_info.insurance_flag</code>. 医保类型 1:甲 2:乙 3:丙 4:科研
     */
    public final TableField<GoodsMedicalInfoRecord, Byte> INSURANCE_FLAG = createField("insurance_flag", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "医保类型 1:甲 2:乙 3:丙 4:科研");

    /**
     * The column <code>mini_shop_471752.b2c_goods_medical_info.insurance_code</code>. 医保编码
     */
    public final TableField<GoodsMedicalInfoRecord, String> INSURANCE_CODE = createField("insurance_code", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "医保编码");

    /**
     * The column <code>mini_shop_471752.b2c_goods_medical_info.insurance_database_name</code>. 医保库内名称
     */
    public final TableField<GoodsMedicalInfoRecord, String> INSURANCE_DATABASE_NAME = createField("insurance_database_name", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "医保库内名称");

    /**
     * The column <code>mini_shop_471752.b2c_goods_medical_info.goods_basic_unit</code>. 商品基本单位
     */
    public final TableField<GoodsMedicalInfoRecord, String> GOODS_BASIC_UNIT = createField("goods_basic_unit", org.jooq.impl.SQLDataType.VARCHAR(32).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "商品基本单位");

    /**
     * The column <code>mini_shop_471752.b2c_goods_medical_info.goods_package_unit</code>. 商品包装单位
     */
    public final TableField<GoodsMedicalInfoRecord, String> GOODS_PACKAGE_UNIT = createField("goods_package_unit", org.jooq.impl.SQLDataType.VARCHAR(32).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "商品包装单位");

    /**
     * The column <code>mini_shop_471752.b2c_goods_medical_info.goods_unit_convert_factor</code>. 整包转换系数
     */
    public final TableField<GoodsMedicalInfoRecord, Integer> GOODS_UNIT_CONVERT_FACTOR = createField("goods_unit_convert_factor", org.jooq.impl.SQLDataType.INTEGER.defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "整包转换系数");

    /**
     * The column <code>mini_shop_471752.b2c_goods_medical_info.goods_equivalent_quantity</code>. 等效量
     */
    public final TableField<GoodsMedicalInfoRecord, Integer> GOODS_EQUIVALENT_QUANTITY = createField("goods_equivalent_quantity", org.jooq.impl.SQLDataType.INTEGER.defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "等效量");

    /**
     * The column <code>mini_shop_471752.b2c_goods_medical_info.goods_equivalent_unit</code>. 等销量单位
     */
    public final TableField<GoodsMedicalInfoRecord, String> GOODS_EQUIVALENT_UNIT = createField("goods_equivalent_unit", org.jooq.impl.SQLDataType.VARCHAR(32).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "等销量单位");

    /**
     * The column <code>mini_shop_471752.b2c_goods_medical_info.goods_composition</code>. 药品成分
     */
    public final TableField<GoodsMedicalInfoRecord, String> GOODS_COMPOSITION = createField("goods_composition", org.jooq.impl.SQLDataType.VARCHAR(512), this, "药品成分");

    /**
     * The column <code>mini_shop_471752.b2c_goods_medical_info.goods_characters</code>. 药品性状
     */
    public final TableField<GoodsMedicalInfoRecord, String> GOODS_CHARACTERS = createField("goods_characters", org.jooq.impl.SQLDataType.VARCHAR(512), this, "药品性状");

    /**
     * The column <code>mini_shop_471752.b2c_goods_medical_info.goods_function</code>. 功能主治
     */
    public final TableField<GoodsMedicalInfoRecord, String> GOODS_FUNCTION = createField("goods_function", org.jooq.impl.SQLDataType.VARCHAR(512), this, "功能主治");

    /**
     * The column <code>mini_shop_471752.b2c_goods_medical_info.goods_use_method</code>. 用法用量
     */
    public final TableField<GoodsMedicalInfoRecord, String> GOODS_USE_METHOD = createField("goods_use_method", org.jooq.impl.SQLDataType.VARCHAR(512), this, "用法用量");

    /**
     * The column <code>mini_shop_471752.b2c_goods_medical_info.goods_adverse_reaction</code>. 不良反应
     */
    public final TableField<GoodsMedicalInfoRecord, String> GOODS_ADVERSE_REACTION = createField("goods_adverse_reaction", org.jooq.impl.SQLDataType.VARCHAR(512), this, "不良反应");

    /**
     * The column <code>mini_shop_471752.b2c_goods_medical_info.goods_taboos</code>. 药品禁忌
     */
    public final TableField<GoodsMedicalInfoRecord, String> GOODS_TABOOS = createField("goods_taboos", org.jooq.impl.SQLDataType.VARCHAR(512), this, "药品禁忌");

    /**
     * The column <code>mini_shop_471752.b2c_goods_medical_info.goods_notice_event</code>. 注意事项
     */
    public final TableField<GoodsMedicalInfoRecord, String> GOODS_NOTICE_EVENT = createField("goods_notice_event", org.jooq.impl.SQLDataType.VARCHAR(2048), this, "注意事项");

    /**
     * The column <code>mini_shop_471752.b2c_goods_medical_info.goods_interaction</code>. 相互作用
     */
    public final TableField<GoodsMedicalInfoRecord, String> GOODS_INTERACTION = createField("goods_interaction", org.jooq.impl.SQLDataType.VARCHAR(1024), this, "相互作用");

    /**
     * The column <code>mini_shop_471752.b2c_goods_medical_info.goods_store_method</code>. 贮藏方法
     */
    public final TableField<GoodsMedicalInfoRecord, String> GOODS_STORE_METHOD = createField("goods_store_method", org.jooq.impl.SQLDataType.VARCHAR(512), this, "贮藏方法");

    /**
     * The column <code>mini_shop_471752.b2c_goods_medical_info.goods_package_method</code>. 药品包装
     */
    public final TableField<GoodsMedicalInfoRecord, String> GOODS_PACKAGE_METHOD = createField("goods_package_method", org.jooq.impl.SQLDataType.VARCHAR(512), this, "药品包装");

    /**
     * The column <code>mini_shop_471752.b2c_goods_medical_info.goods_valid_time</code>. 有效期
     */
    public final TableField<GoodsMedicalInfoRecord, String> GOODS_VALID_TIME = createField("goods_valid_time", org.jooq.impl.SQLDataType.VARCHAR(128), this, "有效期");

    /**
     * The column <code>mini_shop_471752.b2c_goods_medical_info.goods_approval_number</code>. 批准文号
     */
    public final TableField<GoodsMedicalInfoRecord, String> GOODS_APPROVAL_NUMBER = createField("goods_approval_number", org.jooq.impl.SQLDataType.VARCHAR(128), this, "批准文号");

    /**
     * The column <code>mini_shop_471752.b2c_goods_medical_info.goods_production_enterprise</code>. 生产企业
     */
    public final TableField<GoodsMedicalInfoRecord, String> GOODS_PRODUCTION_ENTERPRISE = createField("goods_production_enterprise", org.jooq.impl.SQLDataType.VARCHAR(512), this, "生产企业");

    /**
     * Create a <code>mini_shop_471752.b2c_goods_medical_info</code> table reference
     */
    public GoodsMedicalInfo() {
        this(DSL.name("b2c_goods_medical_info"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_goods_medical_info</code> table reference
     */
    public GoodsMedicalInfo(String alias) {
        this(DSL.name(alias), GOODS_MEDICAL_INFO);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_goods_medical_info</code> table reference
     */
    public GoodsMedicalInfo(Name alias) {
        this(alias, GOODS_MEDICAL_INFO);
    }

    private GoodsMedicalInfo(Name alias, Table<GoodsMedicalInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private GoodsMedicalInfo(Name alias, Table<GoodsMedicalInfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("商品辅助信息表"));
    }

    public <O extends Record> GoodsMedicalInfo(Table<O> child, ForeignKey<O, GoodsMedicalInfoRecord> key) {
        super(child, key, GOODS_MEDICAL_INFO);
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
        return Arrays.<Index>asList(Indexes.GOODS_MEDICAL_INFO_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<GoodsMedicalInfoRecord, Integer> getIdentity() {
        return Keys.IDENTITY_GOODS_MEDICAL_INFO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<GoodsMedicalInfoRecord> getPrimaryKey() {
        return Keys.KEY_B2C_GOODS_MEDICAL_INFO_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<GoodsMedicalInfoRecord>> getKeys() {
        return Arrays.<UniqueKey<GoodsMedicalInfoRecord>>asList(Keys.KEY_B2C_GOODS_MEDICAL_INFO_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GoodsMedicalInfo as(String alias) {
        return new GoodsMedicalInfo(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GoodsMedicalInfo as(Name alias) {
        return new GoodsMedicalInfo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public GoodsMedicalInfo rename(String name) {
        return new GoodsMedicalInfo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public GoodsMedicalInfo rename(Name name) {
        return new GoodsMedicalInfo(name, null);
    }
}
