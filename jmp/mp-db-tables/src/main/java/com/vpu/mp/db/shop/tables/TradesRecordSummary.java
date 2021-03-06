/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables;


import com.vpu.mp.db.shop.Indexes;
import com.vpu.mp.db.shop.Keys;
import com.vpu.mp.db.shop.MiniShop_471752;
import com.vpu.mp.db.shop.tables.records.TradesRecordSummaryRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;


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
public class TradesRecordSummary extends TableImpl<TradesRecordSummaryRecord> {

    private static final long serialVersionUID = -347245466;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_trades_record_summary</code>
     */
    public static final TradesRecordSummary TRADES_RECORD_SUMMARY = new TradesRecordSummary();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TradesRecordSummaryRecord> getRecordType() {
        return TradesRecordSummaryRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_trades_record_summary.id</code>.
     */
    public final TableField<TradesRecordSummaryRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_trades_record_summary.ref_date</code>. 2018-09-04
     */
    public final TableField<TradesRecordSummaryRecord, Date> REF_DATE = createField("ref_date", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "2018-09-04");

    /**
     * The column <code>mini_shop_471752.b2c_trades_record_summary.type</code>. 统计类型：1,7,30
     */
    public final TableField<TradesRecordSummaryRecord, Byte> TYPE = createField("type", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "统计类型：1,7,30");

    /**
     * The column <code>mini_shop_471752.b2c_trades_record_summary.income_total_money</code>. 总现金收入
     */
    public final TableField<TradesRecordSummaryRecord, BigDecimal> INCOME_TOTAL_MONEY = createField("income_total_money", org.jooq.impl.SQLDataType.DECIMAL(12, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "总现金收入");

    /**
     * The column <code>mini_shop_471752.b2c_trades_record_summary.outgo_money</code>. 现金支出
     */
    public final TableField<TradesRecordSummaryRecord, BigDecimal> OUTGO_MONEY = createField("outgo_money", org.jooq.impl.SQLDataType.DECIMAL(12, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "现金支出");

    /**
     * The column <code>mini_shop_471752.b2c_trades_record_summary.income_real_money</code>. 净现金收入
     */
    public final TableField<TradesRecordSummaryRecord, BigDecimal> INCOME_REAL_MONEY = createField("income_real_money", org.jooq.impl.SQLDataType.DECIMAL(12, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "净现金收入");

    /**
     * The column <code>mini_shop_471752.b2c_trades_record_summary.income_total_score</code>. 总积分收入
     */
    public final TableField<TradesRecordSummaryRecord, BigDecimal> INCOME_TOTAL_SCORE = createField("income_total_score", org.jooq.impl.SQLDataType.DECIMAL(12, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "总积分收入");

    /**
     * The column <code>mini_shop_471752.b2c_trades_record_summary.outgo_score</code>. 积分支出
     */
    public final TableField<TradesRecordSummaryRecord, BigDecimal> OUTGO_SCORE = createField("outgo_score", org.jooq.impl.SQLDataType.DECIMAL(12, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "积分支出");

    /**
     * The column <code>mini_shop_471752.b2c_trades_record_summary.income_real_score</code>. 净积分收入
     */
    public final TableField<TradesRecordSummaryRecord, BigDecimal> INCOME_REAL_SCORE = createField("income_real_score", org.jooq.impl.SQLDataType.DECIMAL(12, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "净积分收入");

    /**
     * The column <code>mini_shop_471752.b2c_trades_record_summary.create_time</code>.
     */
    public final TableField<TradesRecordSummaryRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_trades_record_summary.update_time</code>. 最后修改时间
     */
    public final TableField<TradesRecordSummaryRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "最后修改时间");

    /**
     * Create a <code>mini_shop_471752.b2c_trades_record_summary</code> table reference
     */
    public TradesRecordSummary() {
        this(DSL.name("b2c_trades_record_summary"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_trades_record_summary</code> table reference
     */
    public TradesRecordSummary(String alias) {
        this(DSL.name(alias), TRADES_RECORD_SUMMARY);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_trades_record_summary</code> table reference
     */
    public TradesRecordSummary(Name alias) {
        this(alias, TRADES_RECORD_SUMMARY);
    }

    private TradesRecordSummary(Name alias, Table<TradesRecordSummaryRecord> aliased) {
        this(alias, aliased, null);
    }

    private TradesRecordSummary(Name alias, Table<TradesRecordSummaryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> TradesRecordSummary(Table<O> child, ForeignKey<O, TradesRecordSummaryRecord> key) {
        super(child, key, TRADES_RECORD_SUMMARY);
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
        return Arrays.<Index>asList(Indexes.TRADES_RECORD_SUMMARY_DATE_TYPE, Indexes.TRADES_RECORD_SUMMARY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TradesRecordSummaryRecord, Integer> getIdentity() {
        return Keys.IDENTITY_TRADES_RECORD_SUMMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TradesRecordSummaryRecord> getPrimaryKey() {
        return Keys.KEY_B2C_TRADES_RECORD_SUMMARY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TradesRecordSummaryRecord>> getKeys() {
        return Arrays.<UniqueKey<TradesRecordSummaryRecord>>asList(Keys.KEY_B2C_TRADES_RECORD_SUMMARY_PRIMARY, Keys.KEY_B2C_TRADES_RECORD_SUMMARY_DATE_TYPE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TradesRecordSummary as(String alias) {
        return new TradesRecordSummary(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TradesRecordSummary as(Name alias) {
        return new TradesRecordSummary(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TradesRecordSummary rename(String name) {
        return new TradesRecordSummary(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TradesRecordSummary rename(Name name) {
        return new TradesRecordSummary(name, null);
    }
}
