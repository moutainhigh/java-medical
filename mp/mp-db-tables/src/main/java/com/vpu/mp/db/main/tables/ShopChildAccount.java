/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.main.tables;


import com.vpu.mp.db.main.Indexes;
import com.vpu.mp.db.main.Keys;
import com.vpu.mp.db.main.MiniMain;
import com.vpu.mp.db.main.tables.records.ShopChildAccountRecord;

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
public class ShopChildAccount extends TableImpl<ShopChildAccountRecord> {

    private static final long serialVersionUID = -1299462068;

    /**
     * The reference instance of <code>mini_main.b2c_shop_child_account</code>
     */
    public static final ShopChildAccount SHOP_CHILD_ACCOUNT = new ShopChildAccount();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ShopChildAccountRecord> getRecordType() {
        return ShopChildAccountRecord.class;
    }

    /**
     * The column <code>mini_main.b2c_shop_child_account.account_id</code>.
     */
    public final TableField<ShopChildAccountRecord, Integer> ACCOUNT_ID = createField("account_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_main.b2c_shop_child_account.sys_id</code>. 主账户ID
     */
    public final TableField<ShopChildAccountRecord, Integer> SYS_ID = createField("sys_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "主账户ID");

    /**
     * The column <code>mini_main.b2c_shop_child_account.account_name</code>. 子账号用户名
     */
    public final TableField<ShopChildAccountRecord, String> ACCOUNT_NAME = createField("account_name", org.jooq.impl.SQLDataType.VARCHAR(191).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "子账号用户名");

    /**
     * The column <code>mini_main.b2c_shop_child_account.account_pwd</code>. 子账号密码
     */
    public final TableField<ShopChildAccountRecord, String> ACCOUNT_PWD = createField("account_pwd", org.jooq.impl.SQLDataType.VARCHAR(40).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "子账号密码");

    /**
     * The column <code>mini_main.b2c_shop_child_account.create_time</code>.
     */
    public final TableField<ShopChildAccountRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mini_main.b2c_shop_child_account.mobile</code>. 手机号
     */
    public final TableField<ShopChildAccountRecord, String> MOBILE = createField("mobile", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "手机号");

    /**
     * The column <code>mini_main.b2c_shop_child_account.backlog</code>. 待办事项列表
     */
    public final TableField<ShopChildAccountRecord, String> BACKLOG = createField("backlog", org.jooq.impl.SQLDataType.CLOB, this, "待办事项列表");

    /**
     * The column <code>mini_main.b2c_shop_child_account.official_open_id</code>. 公众号openid
     */
    public final TableField<ShopChildAccountRecord, String> OFFICIAL_OPEN_ID = createField("official_open_id", org.jooq.impl.SQLDataType.VARCHAR(128), this, "公众号openid");

    /**
     * The column <code>mini_main.b2c_shop_child_account.is_bind</code>. 是否已绑定
     */
    public final TableField<ShopChildAccountRecord, Byte> IS_BIND = createField("is_bind", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "是否已绑定");

    /**
     * Create a <code>mini_main.b2c_shop_child_account</code> table reference
     */
    public ShopChildAccount() {
        this(DSL.name("b2c_shop_child_account"), null);
    }

    /**
     * Create an aliased <code>mini_main.b2c_shop_child_account</code> table reference
     */
    public ShopChildAccount(String alias) {
        this(DSL.name(alias), SHOP_CHILD_ACCOUNT);
    }

    /**
     * Create an aliased <code>mini_main.b2c_shop_child_account</code> table reference
     */
    public ShopChildAccount(Name alias) {
        this(alias, SHOP_CHILD_ACCOUNT);
    }

    private ShopChildAccount(Name alias, Table<ShopChildAccountRecord> aliased) {
        this(alias, aliased, null);
    }

    private ShopChildAccount(Name alias, Table<ShopChildAccountRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ShopChildAccount(Table<O> child, ForeignKey<O, ShopChildAccountRecord> key) {
        super(child, key, SHOP_CHILD_ACCOUNT);
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
        return Arrays.<Index>asList(Indexes.SHOP_CHILD_ACCOUNT_PRIMARY, Indexes.SHOP_CHILD_ACCOUNT_SYS_ID, Indexes.SHOP_CHILD_ACCOUNT_SYS_ID_2);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ShopChildAccountRecord, Integer> getIdentity() {
        return Keys.IDENTITY_SHOP_CHILD_ACCOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ShopChildAccountRecord> getPrimaryKey() {
        return Keys.KEY_B2C_SHOP_CHILD_ACCOUNT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ShopChildAccountRecord>> getKeys() {
        return Arrays.<UniqueKey<ShopChildAccountRecord>>asList(Keys.KEY_B2C_SHOP_CHILD_ACCOUNT_PRIMARY, Keys.KEY_B2C_SHOP_CHILD_ACCOUNT_SYS_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopChildAccount as(String alias) {
        return new ShopChildAccount(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopChildAccount as(Name alias) {
        return new ShopChildAccount(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ShopChildAccount rename(String name) {
        return new ShopChildAccount(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ShopChildAccount rename(Name name) {
        return new ShopChildAccount(name, null);
    }
}
