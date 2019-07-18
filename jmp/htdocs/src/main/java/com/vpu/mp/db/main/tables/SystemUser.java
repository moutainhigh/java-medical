/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.main.tables;


import com.vpu.mp.db.main.Indexes;
import com.vpu.mp.db.main.Keys;
import com.vpu.mp.db.main.MiniMain;
import com.vpu.mp.db.main.tables.records.SystemUserRecord;

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
public class SystemUser extends TableImpl<SystemUserRecord> {

    private static final long serialVersionUID = 941264839;

    /**
     * The reference instance of <code>mini_main.b2c_system_user</code>
     */
    public static final SystemUser SYSTEM_USER = new SystemUser();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SystemUserRecord> getRecordType() {
        return SystemUserRecord.class;
    }

    /**
     * The column <code>mini_main.b2c_system_user.system_user_id</code>.
     */
    public final TableField<SystemUserRecord, Integer> SYSTEM_USER_ID = createField("system_user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_main.b2c_system_user.user_name</code>.
     */
    public final TableField<SystemUserRecord, String> USER_NAME = createField("user_name", org.jooq.impl.SQLDataType.VARCHAR(60).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mini_main.b2c_system_user.password</code>.
     */
    public final TableField<SystemUserRecord, String> PASSWORD = createField("password", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mini_main.b2c_system_user.mobile</code>.
     */
    public final TableField<SystemUserRecord, String> MOBILE = createField("mobile", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mini_main.b2c_system_user.receive_mobile</code>.  接收通知手机号码
     */
    public final TableField<SystemUserRecord, String> RECEIVE_MOBILE = createField("receive_mobile", org.jooq.impl.SQLDataType.VARCHAR(32).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, " 接收通知手机号码");

    /**
     * The column <code>mini_main.b2c_system_user.created</code>. 创建时间
     */
    public final TableField<SystemUserRecord, Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>mini_main.b2c_system_user.is_enabled</code>. 是否可用
     */
    public final TableField<SystemUserRecord, Byte> IS_ENABLED = createField("is_enabled", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "是否可用");

    /**
     * The column <code>mini_main.b2c_system_user.last_login_ip</code>. 上次登录IP
     */
    public final TableField<SystemUserRecord, String> LAST_LOGIN_IP = createField("last_login_ip", org.jooq.impl.SQLDataType.VARCHAR(40).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "上次登录IP");

    /**
     * Create a <code>mini_main.b2c_system_user</code> table reference
     */
    public SystemUser() {
        this(DSL.name("b2c_system_user"), null);
    }

    /**
     * Create an aliased <code>mini_main.b2c_system_user</code> table reference
     */
    public SystemUser(String alias) {
        this(DSL.name(alias), SYSTEM_USER);
    }

    /**
     * Create an aliased <code>mini_main.b2c_system_user</code> table reference
     */
    public SystemUser(Name alias) {
        this(alias, SYSTEM_USER);
    }

    private SystemUser(Name alias, Table<SystemUserRecord> aliased) {
        this(alias, aliased, null);
    }

    private SystemUser(Name alias, Table<SystemUserRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> SystemUser(Table<O> child, ForeignKey<O, SystemUserRecord> key) {
        super(child, key, SYSTEM_USER);
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
        return Arrays.<Index>asList(Indexes.SYSTEM_USER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<SystemUserRecord, Integer> getIdentity() {
        return Keys.IDENTITY_SYSTEM_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SystemUserRecord> getPrimaryKey() {
        return Keys.KEY_B2C_SYSTEM_USER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SystemUserRecord>> getKeys() {
        return Arrays.<UniqueKey<SystemUserRecord>>asList(Keys.KEY_B2C_SYSTEM_USER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SystemUser as(String alias) {
        return new SystemUser(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SystemUser as(Name alias) {
        return new SystemUser(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SystemUser rename(String name) {
        return new SystemUser(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SystemUser rename(Name name) {
        return new SystemUser(name, null);
    }
}
