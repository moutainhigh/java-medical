/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.main.tables;


import com.vpu.mp.db.main.Indexes;
import com.vpu.mp.db.main.Keys;
import com.vpu.mp.db.main.MiniMain;
import com.vpu.mp.db.main.tables.records.ShopFreeExperienceRecord;

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
public class ShopFreeExperience extends TableImpl<ShopFreeExperienceRecord> {

    private static final long serialVersionUID = 2060634459;

    /**
     * The reference instance of <code>mini_main.b2c_shop_free_experience</code>
     */
    public static final ShopFreeExperience SHOP_FREE_EXPERIENCE = new ShopFreeExperience();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ShopFreeExperienceRecord> getRecordType() {
        return ShopFreeExperienceRecord.class;
    }

    /**
     * The column <code>mini_main.b2c_shop_free_experience.fe_id</code>.
     */
    public final TableField<ShopFreeExperienceRecord, Integer> FE_ID = createField("fe_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_main.b2c_shop_free_experience.company</code>. 公司
     */
    public final TableField<ShopFreeExperienceRecord, String> COMPANY = createField("company", org.jooq.impl.SQLDataType.VARCHAR(191).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "公司");

    /**
     * The column <code>mini_main.b2c_shop_free_experience.contact</code>. 联系人
     */
    public final TableField<ShopFreeExperienceRecord, String> CONTACT = createField("contact", org.jooq.impl.SQLDataType.VARCHAR(191).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "联系人");

    /**
     * The column <code>mini_main.b2c_shop_free_experience.mobile</code>. 电话
     */
    public final TableField<ShopFreeExperienceRecord, String> MOBILE = createField("mobile", org.jooq.impl.SQLDataType.VARCHAR(32).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "电话");

    /**
     * The column <code>mini_main.b2c_shop_free_experience.province_id</code>.
     */
    public final TableField<ShopFreeExperienceRecord, Integer> PROVINCE_ID = createField("province_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>mini_main.b2c_shop_free_experience.content</code>. 留言
     */
    public final TableField<ShopFreeExperienceRecord, String> CONTENT = createField("content", org.jooq.impl.SQLDataType.CLOB, this, "留言");

    /**
     * The column <code>mini_main.b2c_shop_free_experience.ask_time</code>. 申请时间
     */
    public final TableField<ShopFreeExperienceRecord, Timestamp> ASK_TIME = createField("ask_time", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "申请时间");

    /**
     * The column <code>mini_main.b2c_shop_free_experience.is_deal</code>. 1:已查看
     */
    public final TableField<ShopFreeExperienceRecord, Byte> IS_DEAL = createField("is_deal", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "1:已查看");

    /**
     * The column <code>mini_main.b2c_shop_free_experience.shop_id</code>. 开通店铺ID
     */
    public final TableField<ShopFreeExperienceRecord, Integer> SHOP_ID = createField("shop_id", org.jooq.impl.SQLDataType.INTEGER, this, "开通店铺ID");

    /**
     * The column <code>mini_main.b2c_shop_free_experience.desc</code>. 备注
     */
    public final TableField<ShopFreeExperienceRecord, String> DESC = createField("desc", org.jooq.impl.SQLDataType.CLOB, this, "备注");

    /**
     * The column <code>mini_main.b2c_shop_free_experience.source</code>. 来源shop_id
     */
    public final TableField<ShopFreeExperienceRecord, String> SOURCE = createField("source", org.jooq.impl.SQLDataType.VARCHAR(191).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "来源shop_id");

    /**
     * The column <code>mini_main.b2c_shop_free_experience.user_id</code>. 用户ID
     */
    public final TableField<ShopFreeExperienceRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER, this, "用户ID");

    /**
     * Create a <code>mini_main.b2c_shop_free_experience</code> table reference
     */
    public ShopFreeExperience() {
        this(DSL.name("b2c_shop_free_experience"), null);
    }

    /**
     * Create an aliased <code>mini_main.b2c_shop_free_experience</code> table reference
     */
    public ShopFreeExperience(String alias) {
        this(DSL.name(alias), SHOP_FREE_EXPERIENCE);
    }

    /**
     * Create an aliased <code>mini_main.b2c_shop_free_experience</code> table reference
     */
    public ShopFreeExperience(Name alias) {
        this(alias, SHOP_FREE_EXPERIENCE);
    }

    private ShopFreeExperience(Name alias, Table<ShopFreeExperienceRecord> aliased) {
        this(alias, aliased, null);
    }

    private ShopFreeExperience(Name alias, Table<ShopFreeExperienceRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ShopFreeExperience(Table<O> child, ForeignKey<O, ShopFreeExperienceRecord> key) {
        super(child, key, SHOP_FREE_EXPERIENCE);
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
        return Arrays.<Index>asList(Indexes.SHOP_FREE_EXPERIENCE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ShopFreeExperienceRecord, Integer> getIdentity() {
        return Keys.IDENTITY_SHOP_FREE_EXPERIENCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ShopFreeExperienceRecord> getPrimaryKey() {
        return Keys.KEY_B2C_SHOP_FREE_EXPERIENCE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ShopFreeExperienceRecord>> getKeys() {
        return Arrays.<UniqueKey<ShopFreeExperienceRecord>>asList(Keys.KEY_B2C_SHOP_FREE_EXPERIENCE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopFreeExperience as(String alias) {
        return new ShopFreeExperience(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopFreeExperience as(Name alias) {
        return new ShopFreeExperience(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ShopFreeExperience rename(String name) {
        return new ShopFreeExperience(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ShopFreeExperience rename(Name name) {
        return new ShopFreeExperience(name, null);
    }
}
