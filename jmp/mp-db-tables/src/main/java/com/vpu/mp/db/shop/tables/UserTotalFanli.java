/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables;


import com.vpu.mp.db.shop.Indexes;
import com.vpu.mp.db.shop.Keys;
import com.vpu.mp.db.shop.MiniShop_471752;
import com.vpu.mp.db.shop.tables.records.UserTotalFanliRecord;

import java.math.BigDecimal;
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
public class UserTotalFanli extends TableImpl<UserTotalFanliRecord> {

    private static final long serialVersionUID = 1457073364;

    /**
     * The reference instance of <code>jmini_shop_471752.b2c_user_total_fanli</code>
     */
    public static final UserTotalFanli USER_TOTAL_FANLI = new UserTotalFanli();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserTotalFanliRecord> getRecordType() {
        return UserTotalFanliRecord.class;
    }

    /**
     * The column <code>jmini_shop_471752.b2c_user_total_fanli.id</code>.
     */
    public final TableField<UserTotalFanliRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>jmini_shop_471752.b2c_user_total_fanli.user_id</code>. 会员id
     */
    public final TableField<UserTotalFanliRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "会员id");

    /**
     * The column <code>jmini_shop_471752.b2c_user_total_fanli.mobile</code>. 会员手机号
     */
    public final TableField<UserTotalFanliRecord, String> MOBILE = createField("mobile", org.jooq.impl.SQLDataType.VARCHAR(16).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "会员手机号");

    /**
     * The column <code>jmini_shop_471752.b2c_user_total_fanli.sublayer_number</code>. 子层分销员数量
     */
    public final TableField<UserTotalFanliRecord, Integer> SUBLAYER_NUMBER = createField("sublayer_number", org.jooq.impl.SQLDataType.INTEGER.defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "子层分销员数量");

    /**
     * The column <code>jmini_shop_471752.b2c_user_total_fanli.total_money</code>. 累计获得佣金数
     */
    public final TableField<UserTotalFanliRecord, BigDecimal> TOTAL_MONEY = createField("total_money", org.jooq.impl.SQLDataType.DECIMAL(10, 2).defaultValue(DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "累计获得佣金数");

    /**
     * The column <code>jmini_shop_471752.b2c_user_total_fanli.can_money</code>. 可用佣金余额
     */
    public final TableField<UserTotalFanliRecord, BigDecimal> CAN_MONEY = createField("can_money", org.jooq.impl.SQLDataType.DECIMAL(10, 2).defaultValue(DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "可用佣金余额");

    /**
     * The column <code>jmini_shop_471752.b2c_user_total_fanli.blocked</code>. 冻结佣金余额
     */
    public final TableField<UserTotalFanliRecord, BigDecimal> BLOCKED = createField("blocked", org.jooq.impl.SQLDataType.DECIMAL(10, 2).defaultValue(DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "冻结佣金余额");

    /**
     * The column <code>jmini_shop_471752.b2c_user_total_fanli.create_time</code>.
     */
    public final TableField<UserTotalFanliRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>jmini_shop_471752.b2c_user_total_fanli.update_time</code>. 最后修改时间
     */
    public final TableField<UserTotalFanliRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "最后修改时间");

    /**
     * The column <code>jmini_shop_471752.b2c_user_total_fanli.final_money</code>. 总返利金额，total_money为提现后金额
     */
    public final TableField<UserTotalFanliRecord, BigDecimal> FINAL_MONEY = createField("final_money", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false).defaultValue(DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "总返利金额，total_money为提现后金额");

    /**
     * Create a <code>jmini_shop_471752.b2c_user_total_fanli</code> table reference
     */
    public UserTotalFanli() {
        this(DSL.name("b2c_user_total_fanli"), null);
    }

    /**
     * Create an aliased <code>jmini_shop_471752.b2c_user_total_fanli</code> table reference
     */
    public UserTotalFanli(String alias) {
        this(DSL.name(alias), USER_TOTAL_FANLI);
    }

    /**
     * Create an aliased <code>jmini_shop_471752.b2c_user_total_fanli</code> table reference
     */
    public UserTotalFanli(Name alias) {
        this(alias, USER_TOTAL_FANLI);
    }

    private UserTotalFanli(Name alias, Table<UserTotalFanliRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserTotalFanli(Name alias, Table<UserTotalFanliRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> UserTotalFanli(Table<O> child, ForeignKey<O, UserTotalFanliRecord> key) {
        super(child, key, USER_TOTAL_FANLI);
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
        return Arrays.<Index>asList(Indexes.USER_TOTAL_FANLI_PRIMARY, Indexes.USER_TOTAL_FANLI_USER_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<UserTotalFanliRecord, Integer> getIdentity() {
        return Keys.IDENTITY_USER_TOTAL_FANLI;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UserTotalFanliRecord> getPrimaryKey() {
        return Keys.KEY_B2C_USER_TOTAL_FANLI_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UserTotalFanliRecord>> getKeys() {
        return Arrays.<UniqueKey<UserTotalFanliRecord>>asList(Keys.KEY_B2C_USER_TOTAL_FANLI_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserTotalFanli as(String alias) {
        return new UserTotalFanli(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserTotalFanli as(Name alias) {
        return new UserTotalFanli(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserTotalFanli rename(String name) {
        return new UserTotalFanli(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UserTotalFanli rename(Name name) {
        return new UserTotalFanli(name, null);
    }
}
