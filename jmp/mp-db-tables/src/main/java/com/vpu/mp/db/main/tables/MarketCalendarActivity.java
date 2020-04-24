/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.main.tables;


import com.vpu.mp.db.main.Indexes;
import com.vpu.mp.db.main.Keys;
import com.vpu.mp.db.main.MiniMain;
import com.vpu.mp.db.main.tables.records.MarketCalendarActivityRecord;

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
public class MarketCalendarActivity extends TableImpl<MarketCalendarActivityRecord> {

    private static final long serialVersionUID = -785015115;

    /**
     * The reference instance of <code>mini_main.b2c_market_calendar_activity</code>
     */
    public static final MarketCalendarActivity MARKET_CALENDAR_ACTIVITY = new MarketCalendarActivity();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MarketCalendarActivityRecord> getRecordType() {
        return MarketCalendarActivityRecord.class;
    }

    /**
     * The column <code>mini_main.b2c_market_calendar_activity.id</code>.
     */
    public final TableField<MarketCalendarActivityRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_main.b2c_market_calendar_activity.calendar_id</code>. 营销日历Id
     */
    public final TableField<MarketCalendarActivityRecord, Integer> CALENDAR_ID = createField("calendar_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "营销日历Id");

    /**
     * The column <code>mini_main.b2c_market_calendar_activity.activity_type</code>. 具体营销活动类型
     */
    public final TableField<MarketCalendarActivityRecord, String> ACTIVITY_TYPE = createField("activity_type", org.jooq.impl.SQLDataType.VARCHAR(16).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "具体营销活动类型");

    /**
     * The column <code>mini_main.b2c_market_calendar_activity.shop_use_num</code>. 店铺使用累计数量
     */
    public final TableField<MarketCalendarActivityRecord, Integer> SHOP_USE_NUM = createField("shop_use_num", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "店铺使用累计数量");

    /**
     * The column <code>mini_main.b2c_market_calendar_activity.recommend_type</code>. 推荐类型：0站内文本，1外部链接
     */
    public final TableField<MarketCalendarActivityRecord, Byte> RECOMMEND_TYPE = createField("recommend_type", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "推荐类型：0站内文本，1外部链接");

    /**
     * The column <code>mini_main.b2c_market_calendar_activity.recommend_link</code>. 推荐链接
     */
    public final TableField<MarketCalendarActivityRecord, String> RECOMMEND_LINK = createField("recommend_link", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "推荐链接");

    /**
     * The column <code>mini_main.b2c_market_calendar_activity.del_flag</code>. 是否已删除：0否，1是
     */
    public final TableField<MarketCalendarActivityRecord, Byte> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "是否已删除：0否，1是");

    /**
     * The column <code>mini_main.b2c_market_calendar_activity.create_time</code>. 创建时间
     */
    public final TableField<MarketCalendarActivityRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>mini_main.b2c_market_calendar_activity.update_time</code>. 更新时间
     */
    public final TableField<MarketCalendarActivityRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "更新时间");

    /**
     * The column <code>mini_main.b2c_market_calendar_activity.shop_ids</code>. 使用该推荐活动的店铺id，逗号隔开
     */
    public final TableField<MarketCalendarActivityRecord, String> SHOP_IDS = createField("shop_ids", org.jooq.impl.SQLDataType.VARCHAR(500).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "使用该推荐活动的店铺id，逗号隔开");

    /**
     * The column <code>mini_main.b2c_market_calendar_activity.recommend_title</code>. 推荐标题
     */
    public final TableField<MarketCalendarActivityRecord, String> RECOMMEND_TITLE = createField("recommend_title", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "推荐标题");

    /**
     * Create a <code>mini_main.b2c_market_calendar_activity</code> table reference
     */
    public MarketCalendarActivity() {
        this(DSL.name("b2c_market_calendar_activity"), null);
    }

    /**
     * Create an aliased <code>mini_main.b2c_market_calendar_activity</code> table reference
     */
    public MarketCalendarActivity(String alias) {
        this(DSL.name(alias), MARKET_CALENDAR_ACTIVITY);
    }

    /**
     * Create an aliased <code>mini_main.b2c_market_calendar_activity</code> table reference
     */
    public MarketCalendarActivity(Name alias) {
        this(alias, MARKET_CALENDAR_ACTIVITY);
    }

    private MarketCalendarActivity(Name alias, Table<MarketCalendarActivityRecord> aliased) {
        this(alias, aliased, null);
    }

    private MarketCalendarActivity(Name alias, Table<MarketCalendarActivityRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> MarketCalendarActivity(Table<O> child, ForeignKey<O, MarketCalendarActivityRecord> key) {
        super(child, key, MARKET_CALENDAR_ACTIVITY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return MiniMain.MINI_MAIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.MARKET_CALENDAR_ACTIVITY_CALENDAR_ID, Indexes.MARKET_CALENDAR_ACTIVITY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<MarketCalendarActivityRecord, Integer> getIdentity() {
        return Keys.IDENTITY_MARKET_CALENDAR_ACTIVITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MarketCalendarActivityRecord> getPrimaryKey() {
        return Keys.KEY_B2C_MARKET_CALENDAR_ACTIVITY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MarketCalendarActivityRecord>> getKeys() {
        return Arrays.<UniqueKey<MarketCalendarActivityRecord>>asList(Keys.KEY_B2C_MARKET_CALENDAR_ACTIVITY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketCalendarActivity as(String alias) {
        return new MarketCalendarActivity(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketCalendarActivity as(Name alias) {
        return new MarketCalendarActivity(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MarketCalendarActivity rename(String name) {
        return new MarketCalendarActivity(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MarketCalendarActivity rename(Name name) {
        return new MarketCalendarActivity(name, null);
    }
}
