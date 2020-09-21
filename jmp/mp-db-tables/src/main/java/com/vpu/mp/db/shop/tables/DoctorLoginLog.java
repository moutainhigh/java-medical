/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables;


import com.vpu.mp.db.shop.Indexes;
import com.vpu.mp.db.shop.Keys;
import com.vpu.mp.db.shop.MiniShop_471752;
import com.vpu.mp.db.shop.tables.records.DoctorLoginLogRecord;

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
 * 医师登录记录
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DoctorLoginLog extends TableImpl<DoctorLoginLogRecord> {

    private static final long serialVersionUID = 567283072;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_doctor_login_log</code>
     */
    public static final DoctorLoginLog DOCTOR_LOGIN_LOG = new DoctorLoginLog();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DoctorLoginLogRecord> getRecordType() {
        return DoctorLoginLogRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_doctor_login_log.id</code>.
     */
    public final TableField<DoctorLoginLogRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_doctor_login_log.doctor_id</code>. 医师ID
     */
    public final TableField<DoctorLoginLogRecord, Integer> DOCTOR_ID = createField("doctor_id", org.jooq.impl.SQLDataType.INTEGER, this, "医师ID");

    /**
     * The column <code>mini_shop_471752.b2c_doctor_login_log.user_id</code>. 用户ID
     */
    public final TableField<DoctorLoginLogRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER, this, "用户ID");

    /**
     * The column <code>mini_shop_471752.b2c_doctor_login_log.ip</code>. 用户登录ip
     */
    public final TableField<DoctorLoginLogRecord, String> IP = createField("ip", org.jooq.impl.SQLDataType.VARCHAR(64), this, "用户登录ip");

    /**
     * The column <code>mini_shop_471752.b2c_doctor_login_log.lat</code>. 经度
     */
    public final TableField<DoctorLoginLogRecord, String> LAT = createField("lat", org.jooq.impl.SQLDataType.VARCHAR(64), this, "经度");

    /**
     * The column <code>mini_shop_471752.b2c_doctor_login_log.lng</code>. 纬度
     */
    public final TableField<DoctorLoginLogRecord, String> LNG = createField("lng", org.jooq.impl.SQLDataType.VARCHAR(64), this, "纬度");

    /**
     * The column <code>mini_shop_471752.b2c_doctor_login_log.update_time</code>. 更新时间
     */
    public final TableField<DoctorLoginLogRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "更新时间");

    /**
     * The column <code>mini_shop_471752.b2c_doctor_login_log.create_time</code>. 添加时间
     */
    public final TableField<DoctorLoginLogRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "添加时间");

    /**
     * Create a <code>mini_shop_471752.b2c_doctor_login_log</code> table reference
     */
    public DoctorLoginLog() {
        this(DSL.name("b2c_doctor_login_log"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_doctor_login_log</code> table reference
     */
    public DoctorLoginLog(String alias) {
        this(DSL.name(alias), DOCTOR_LOGIN_LOG);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_doctor_login_log</code> table reference
     */
    public DoctorLoginLog(Name alias) {
        this(alias, DOCTOR_LOGIN_LOG);
    }

    private DoctorLoginLog(Name alias, Table<DoctorLoginLogRecord> aliased) {
        this(alias, aliased, null);
    }

    private DoctorLoginLog(Name alias, Table<DoctorLoginLogRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("医师登录记录"));
    }

    public <O extends Record> DoctorLoginLog(Table<O> child, ForeignKey<O, DoctorLoginLogRecord> key) {
        super(child, key, DOCTOR_LOGIN_LOG);
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
        return Arrays.<Index>asList(Indexes.DOCTOR_LOGIN_LOG_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<DoctorLoginLogRecord, Integer> getIdentity() {
        return Keys.IDENTITY_DOCTOR_LOGIN_LOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DoctorLoginLogRecord> getPrimaryKey() {
        return Keys.KEY_B2C_DOCTOR_LOGIN_LOG_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DoctorLoginLogRecord>> getKeys() {
        return Arrays.<UniqueKey<DoctorLoginLogRecord>>asList(Keys.KEY_B2C_DOCTOR_LOGIN_LOG_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DoctorLoginLog as(String alias) {
        return new DoctorLoginLog(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DoctorLoginLog as(Name alias) {
        return new DoctorLoginLog(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DoctorLoginLog rename(String name) {
        return new DoctorLoginLog(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DoctorLoginLog rename(Name name) {
        return new DoctorLoginLog(name, null);
    }
}