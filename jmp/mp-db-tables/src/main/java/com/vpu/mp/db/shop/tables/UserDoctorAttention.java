/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables;


import com.vpu.mp.db.shop.Indexes;
import com.vpu.mp.db.shop.Keys;
import com.vpu.mp.db.shop.MiniShop_471752;
import com.vpu.mp.db.shop.tables.records.UserDoctorAttentionRecord;

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
 * 用户关注医师
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserDoctorAttention extends TableImpl<UserDoctorAttentionRecord> {

    private static final long serialVersionUID = 1818423621;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_user_doctor_attention</code>
     */
    public static final UserDoctorAttention USER_DOCTOR_ATTENTION = new UserDoctorAttention();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserDoctorAttentionRecord> getRecordType() {
        return UserDoctorAttentionRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_user_doctor_attention.id</code>.
     */
    public final TableField<UserDoctorAttentionRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_user_doctor_attention.user_id</code>. 用户ID
     */
    public final TableField<UserDoctorAttentionRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "用户ID");

    /**
     * The column <code>mini_shop_471752.b2c_user_doctor_attention.doctor_id</code>. 医师ID
     */
    public final TableField<UserDoctorAttentionRecord, Integer> DOCTOR_ID = createField("doctor_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "医师ID");

    /**
     * The column <code>mini_shop_471752.b2c_user_doctor_attention.is_delete</code>.
     */
    public final TableField<UserDoctorAttentionRecord, Byte> IS_DELETE = createField("is_delete", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_user_doctor_attention.create_time</code>.
     */
    public final TableField<UserDoctorAttentionRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_user_doctor_attention.update_time</code>. 最后修改时间
     */
    public final TableField<UserDoctorAttentionRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "最后修改时间");

    /**
     * Create a <code>mini_shop_471752.b2c_user_doctor_attention</code> table reference
     */
    public UserDoctorAttention() {
        this(DSL.name("b2c_user_doctor_attention"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_user_doctor_attention</code> table reference
     */
    public UserDoctorAttention(String alias) {
        this(DSL.name(alias), USER_DOCTOR_ATTENTION);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_user_doctor_attention</code> table reference
     */
    public UserDoctorAttention(Name alias) {
        this(alias, USER_DOCTOR_ATTENTION);
    }

    private UserDoctorAttention(Name alias, Table<UserDoctorAttentionRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserDoctorAttention(Name alias, Table<UserDoctorAttentionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("用户关注医师"));
    }

    public <O extends Record> UserDoctorAttention(Table<O> child, ForeignKey<O, UserDoctorAttentionRecord> key) {
        super(child, key, USER_DOCTOR_ATTENTION);
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
        return Arrays.<Index>asList(Indexes.USER_DOCTOR_ATTENTION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<UserDoctorAttentionRecord, Integer> getIdentity() {
        return Keys.IDENTITY_USER_DOCTOR_ATTENTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UserDoctorAttentionRecord> getPrimaryKey() {
        return Keys.KEY_B2C_USER_DOCTOR_ATTENTION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UserDoctorAttentionRecord>> getKeys() {
        return Arrays.<UniqueKey<UserDoctorAttentionRecord>>asList(Keys.KEY_B2C_USER_DOCTOR_ATTENTION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserDoctorAttention as(String alias) {
        return new UserDoctorAttention(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserDoctorAttention as(Name alias) {
        return new UserDoctorAttention(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserDoctorAttention rename(String name) {
        return new UserDoctorAttention(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UserDoctorAttention rename(Name name) {
        return new UserDoctorAttention(name, null);
    }
}
