/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables;


import com.vpu.mp.db.shop.Indexes;
import com.vpu.mp.db.shop.Keys;
import com.vpu.mp.db.shop.MiniShop_471752;
import com.vpu.mp.db.shop.tables.records.RebatePriceRecordRecord;

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
public class RebatePriceRecord extends TableImpl<RebatePriceRecordRecord> {

    private static final long serialVersionUID = -1662944159;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_rebate_price_record</code>
     */
    public static final RebatePriceRecord REBATE_PRICE_RECORD = new RebatePriceRecord();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RebatePriceRecordRecord> getRecordType() {
        return RebatePriceRecordRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_rebate_price_record.id</code>.
     */
    public final TableField<RebatePriceRecordRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_rebate_price_record.user_id</code>. 用户id
     */
    public final TableField<RebatePriceRecordRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "用户id");

    /**
     * The column <code>mini_shop_471752.b2c_rebate_price_record.data_sign</code>. md5(rebate_data)
     */
    public final TableField<RebatePriceRecordRecord, String> DATA_SIGN = createField("data_sign", org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "md5(rebate_data)");

    /**
     * The column <code>mini_shop_471752.b2c_rebate_price_record.rebate_data</code>. 分享内容
     */
    public final TableField<RebatePriceRecordRecord, String> REBATE_DATA = createField("rebate_data", org.jooq.impl.SQLDataType.CLOB, this, "分享内容");

    /**
     * The column <code>mini_shop_471752.b2c_rebate_price_record.create_time</code>.
     */
    public final TableField<RebatePriceRecordRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_rebate_price_record.update_time</code>. 最后修改时间
     */
    public final TableField<RebatePriceRecordRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "最后修改时间");

    /**
     * Create a <code>mini_shop_471752.b2c_rebate_price_record</code> table reference
     */
    public RebatePriceRecord() {
        this(DSL.name("b2c_rebate_price_record"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_rebate_price_record</code> table reference
     */
    public RebatePriceRecord(String alias) {
        this(DSL.name(alias), REBATE_PRICE_RECORD);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_rebate_price_record</code> table reference
     */
    public RebatePriceRecord(Name alias) {
        this(alias, REBATE_PRICE_RECORD);
    }

    private RebatePriceRecord(Name alias, Table<RebatePriceRecordRecord> aliased) {
        this(alias, aliased, null);
    }

    private RebatePriceRecord(Name alias, Table<RebatePriceRecordRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> RebatePriceRecord(Table<O> child, ForeignKey<O, RebatePriceRecordRecord> key) {
        super(child, key, REBATE_PRICE_RECORD);
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
        return Arrays.<Index>asList(Indexes.REBATE_PRICE_RECORD_PRIMARY, Indexes.REBATE_PRICE_RECORD_USER_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<RebatePriceRecordRecord, Integer> getIdentity() {
        return Keys.IDENTITY_REBATE_PRICE_RECORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<RebatePriceRecordRecord> getPrimaryKey() {
        return Keys.KEY_B2C_REBATE_PRICE_RECORD_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<RebatePriceRecordRecord>> getKeys() {
        return Arrays.<UniqueKey<RebatePriceRecordRecord>>asList(Keys.KEY_B2C_REBATE_PRICE_RECORD_PRIMARY, Keys.KEY_B2C_REBATE_PRICE_RECORD_USER_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RebatePriceRecord as(String alias) {
        return new RebatePriceRecord(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RebatePriceRecord as(Name alias) {
        return new RebatePriceRecord(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public RebatePriceRecord rename(String name) {
        return new RebatePriceRecord(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RebatePriceRecord rename(Name name) {
        return new RebatePriceRecord(name, null);
    }
}
