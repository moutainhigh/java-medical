/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables;


import com.vpu.mp.db.shop.Indexes;
import com.vpu.mp.db.shop.Keys;
import com.vpu.mp.db.shop.MiniShop_471752;
import com.vpu.mp.db.shop.tables.records.MpDailyVisitRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

;


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
public class MpDailyVisit extends TableImpl<MpDailyVisitRecord> {

    private static final long serialVersionUID = -1214582571;

    /**
     * The reference instance of <code>jmini_shop_666666.b2c_mp_daily_visit</code>
     */
    public static final MpDailyVisit MP_DAILY_VISIT = new MpDailyVisit();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MpDailyVisitRecord> getRecordType() {
        return MpDailyVisitRecord.class;
    }

    /**
     * The column <code>jmini_shop_666666.b2c_mp_daily_visit.ref_date</code>. 时间： 如： "20180313"
     */
    public final TableField<MpDailyVisitRecord, String> REF_DATE = createField("ref_date", org.jooq.impl.SQLDataType.CHAR(8).nullable(false), this, "时间： 如： \"20180313\"");

    /**
     * The column <code>jmini_shop_666666.b2c_mp_daily_visit.session_cnt</code>. 打开次数
     */
    public final TableField<MpDailyVisitRecord, Integer> SESSION_CNT = createField("session_cnt", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "打开次数");

    /**
     * The column <code>jmini_shop_666666.b2c_mp_daily_visit.visit_pv</code>. 访问次数
     */
    public final TableField<MpDailyVisitRecord, Integer> VISIT_PV = createField("visit_pv", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "访问次数");

    /**
     * The column <code>jmini_shop_666666.b2c_mp_daily_visit.visit_uv</code>. 访问人数
     */
    public final TableField<MpDailyVisitRecord, Integer> VISIT_UV = createField("visit_uv", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "访问人数");

    /**
     * The column <code>jmini_shop_666666.b2c_mp_daily_visit.visit_uv_new</code>. 新用户数
     */
    public final TableField<MpDailyVisitRecord, Integer> VISIT_UV_NEW = createField("visit_uv_new", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "新用户数");

    /**
     * The column <code>jmini_shop_666666.b2c_mp_daily_visit.stay_time_uv</code>. 人均停留时长 (浮点型，单位：秒)
     */
    public final TableField<MpDailyVisitRecord, Double> STAY_TIME_UV = createField("stay_time_uv", org.jooq.impl.SQLDataType.FLOAT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.FLOAT)), this, "人均停留时长 (浮点型，单位：秒)");

    /**
     * The column <code>jmini_shop_666666.b2c_mp_daily_visit.stay_time_session</code>. 次均停留时长 (浮点型，单位：秒)
     */
    public final TableField<MpDailyVisitRecord, Double> STAY_TIME_SESSION = createField("stay_time_session", org.jooq.impl.SQLDataType.FLOAT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.FLOAT)), this, "次均停留时长 (浮点型，单位：秒)");

    /**
     * The column <code>jmini_shop_666666.b2c_mp_daily_visit.visit_depth</code>. 平均访问深度 (浮点型)
     */
    public final TableField<MpDailyVisitRecord, Double> VISIT_DEPTH = createField("visit_depth", org.jooq.impl.SQLDataType.FLOAT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.FLOAT)), this, "平均访问深度 (浮点型)");

    /**
     * The column <code>jmini_shop_666666.b2c_mp_daily_visit.create_time</code>. 添加时间
     */
    public final TableField<MpDailyVisitRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "添加时间");

    /**
     * The column <code>jmini_shop_666666.b2c_mp_daily_visit.id</code>.
     */
    public final TableField<MpDailyVisitRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * Create a <code>jmini_shop_666666.b2c_mp_daily_visit</code> table reference
     */
    public MpDailyVisit() {
        this(DSL.name("b2c_mp_daily_visit"), null);
    }

    /**
     * Create an aliased <code>jmini_shop_666666.b2c_mp_daily_visit</code> table reference
     */
    public MpDailyVisit(String alias) {
        this(DSL.name(alias), MP_DAILY_VISIT);
    }

    /**
     * Create an aliased <code>jmini_shop_666666.b2c_mp_daily_visit</code> table reference
     */
    public MpDailyVisit(Name alias) {
        this(alias, MP_DAILY_VISIT);
    }

    private MpDailyVisit(Name alias, Table<MpDailyVisitRecord> aliased) {
        this(alias, aliased, null);
    }

    private MpDailyVisit(Name alias, Table<MpDailyVisitRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> MpDailyVisit(Table<O> child, ForeignKey<O, MpDailyVisitRecord> key) {
        super(child, key, MP_DAILY_VISIT);
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
        return Arrays.<Index>asList(Indexes.MP_DAILY_VISIT_PRIMARY, Indexes.MP_DAILY_VISIT_REF_DATE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<MpDailyVisitRecord, Integer> getIdentity() {
        return Keys.IDENTITY_MP_DAILY_VISIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MpDailyVisitRecord> getPrimaryKey() {
        return Keys.KEY_B2C_MP_DAILY_VISIT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MpDailyVisitRecord>> getKeys() {
        return Arrays.<UniqueKey<MpDailyVisitRecord>>asList(Keys.KEY_B2C_MP_DAILY_VISIT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpDailyVisit as(String alias) {
        return new MpDailyVisit(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpDailyVisit as(Name alias) {
        return new MpDailyVisit(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MpDailyVisit rename(String name) {
        return new MpDailyVisit(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MpDailyVisit rename(Name name) {
        return new MpDailyVisit(name, null);
    }
}
