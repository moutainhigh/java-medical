/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables;


import com.vpu.mp.db.shop.Indexes;
import com.vpu.mp.db.shop.Keys;
import com.vpu.mp.db.shop.MiniShop_471752;
import com.vpu.mp.db.shop.tables.records.CodeRecord;

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
public class Code extends TableImpl<CodeRecord> {

    private static final long serialVersionUID = 597515375;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_code</code>
     */
    public static final Code CODE = new Code();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CodeRecord> getRecordType() {
        return CodeRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_code.code_id</code>. 二维码id
     */
    public final TableField<CodeRecord, Integer> CODE_ID = createField("code_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "二维码id");

    /**
     * The column <code>mini_shop_471752.b2c_code.type</code>. 分类：1店铺，2商品，3服务，4会员卡，5优惠券
     */
    public final TableField<CodeRecord, Short> TYPE = createField("type", org.jooq.impl.SQLDataType.SMALLINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.SMALLINT)), this, "分类：1店铺，2商品，3服务，4会员卡，5优惠券");

    /**
     * The column <code>mini_shop_471752.b2c_code.param_id</code>. 对应的参数id
     */
    public final TableField<CodeRecord, String> PARAM_ID = createField("param_id", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "对应的参数id");

    /**
     * The column <code>mini_shop_471752.b2c_code.type_url</code>. type对应的app页面地址
     */
    public final TableField<CodeRecord, String> TYPE_URL = createField("type_url", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "type对应的app页面地址");

    /**
     * The column <code>mini_shop_471752.b2c_code.qrcode_img</code>. 二维码位置
     */
    public final TableField<CodeRecord, String> QRCODE_IMG = createField("qrcode_img", org.jooq.impl.SQLDataType.VARCHAR(200).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "二维码位置");

    /**
     * The column <code>mini_shop_471752.b2c_code.flag</code>. 标记位
     */
    public final TableField<CodeRecord, Byte> FLAG = createField("flag", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "标记位");

    /**
     * The column <code>mini_shop_471752.b2c_code.channel</code>. 渠道分享码
     */
    public final TableField<CodeRecord, String> CHANNEL = createField("channel", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "渠道分享码");

    /**
     * The column <code>mini_shop_471752.b2c_code.create_time</code>.
     */
    public final TableField<CodeRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_code.update_time</code>. 最后修改时间
     */
    public final TableField<CodeRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "最后修改时间");

    /**
     * Create a <code>mini_shop_471752.b2c_code</code> table reference
     */
    public Code() {
        this(DSL.name("b2c_code"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_code</code> table reference
     */
    public Code(String alias) {
        this(DSL.name(alias), CODE);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_code</code> table reference
     */
    public Code(Name alias) {
        this(alias, CODE);
    }

    private Code(Name alias, Table<CodeRecord> aliased) {
        this(alias, aliased, null);
    }

    private Code(Name alias, Table<CodeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Code(Table<O> child, ForeignKey<O, CodeRecord> key) {
        super(child, key, CODE);
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
        return Arrays.<Index>asList(Indexes.CODE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CodeRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CodeRecord> getPrimaryKey() {
        return Keys.KEY_B2C_CODE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CodeRecord>> getKeys() {
        return Arrays.<UniqueKey<CodeRecord>>asList(Keys.KEY_B2C_CODE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Code as(String alias) {
        return new Code(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Code as(Name alias) {
        return new Code(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Code rename(String name) {
        return new Code(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Code rename(Name name) {
        return new Code(name, null);
    }
}
