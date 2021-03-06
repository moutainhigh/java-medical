/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables;


import com.vpu.mp.db.shop.Indexes;
import com.vpu.mp.db.shop.Keys;
import com.vpu.mp.db.shop.MiniShop_471752;
import com.vpu.mp.db.shop.tables.records.CardUpgradeRecord;

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
public class CardUpgrade extends TableImpl<CardUpgradeRecord> {

    private static final long serialVersionUID = -216326688;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_card_upgrade</code>
     */
    public static final CardUpgrade CARD_UPGRADE = new CardUpgrade();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CardUpgradeRecord> getRecordType() {
        return CardUpgradeRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_card_upgrade.id</code>.
     */
    public final TableField<CardUpgradeRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_card_upgrade.user_id</code>. 用户id
     */
    public final TableField<CardUpgradeRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "用户id");

    /**
     * The column <code>mini_shop_471752.b2c_card_upgrade.old_card_id</code>. 升级前卡id
     */
    public final TableField<CardUpgradeRecord, Integer> OLD_CARD_ID = createField("old_card_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "升级前卡id");

    /**
     * The column <code>mini_shop_471752.b2c_card_upgrade.new_card_id</code>. 升级后卡id
     */
    public final TableField<CardUpgradeRecord, Integer> NEW_CARD_ID = createField("new_card_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "升级后卡id");

    /**
     * The column <code>mini_shop_471752.b2c_card_upgrade.old_grade</code>. 升级前卡等级
     */
    public final TableField<CardUpgradeRecord, String> OLD_GRADE = createField("old_grade", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "升级前卡等级");

    /**
     * The column <code>mini_shop_471752.b2c_card_upgrade.new_grade</code>. 升级后卡等级
     */
    public final TableField<CardUpgradeRecord, String> NEW_GRADE = createField("new_grade", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "升级后卡等级");

    /**
     * The column <code>mini_shop_471752.b2c_card_upgrade.old_card_name</code>.
     */
    public final TableField<CardUpgradeRecord, String> OLD_CARD_NAME = createField("old_card_name", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_card_upgrade.new_card_name</code>.
     */
    public final TableField<CardUpgradeRecord, String> NEW_CARD_NAME = createField("new_card_name", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_card_upgrade.grade_condition</code>. 条件
     */
    public final TableField<CardUpgradeRecord, String> GRADE_CONDITION = createField("grade_condition", org.jooq.impl.SQLDataType.VARCHAR(200).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "条件");

    /**
     * The column <code>mini_shop_471752.b2c_card_upgrade.operate</code>. 操作备注
     */
    public final TableField<CardUpgradeRecord, String> OPERATE = createField("operate", org.jooq.impl.SQLDataType.VARCHAR(200).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "操作备注");

    /**
     * The column <code>mini_shop_471752.b2c_card_upgrade.create_time</code>.
     */
    public final TableField<CardUpgradeRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_card_upgrade.update_time</code>. 最后修改时间
     */
    public final TableField<CardUpgradeRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "最后修改时间");

    /**
     * Create a <code>mini_shop_471752.b2c_card_upgrade</code> table reference
     */
    public CardUpgrade() {
        this(DSL.name("b2c_card_upgrade"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_card_upgrade</code> table reference
     */
    public CardUpgrade(String alias) {
        this(DSL.name(alias), CARD_UPGRADE);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_card_upgrade</code> table reference
     */
    public CardUpgrade(Name alias) {
        this(alias, CARD_UPGRADE);
    }

    private CardUpgrade(Name alias, Table<CardUpgradeRecord> aliased) {
        this(alias, aliased, null);
    }

    private CardUpgrade(Name alias, Table<CardUpgradeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> CardUpgrade(Table<O> child, ForeignKey<O, CardUpgradeRecord> key) {
        super(child, key, CARD_UPGRADE);
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
        return Arrays.<Index>asList(Indexes.CARD_UPGRADE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CardUpgradeRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CARD_UPGRADE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CardUpgradeRecord> getPrimaryKey() {
        return Keys.KEY_B2C_CARD_UPGRADE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CardUpgradeRecord>> getKeys() {
        return Arrays.<UniqueKey<CardUpgradeRecord>>asList(Keys.KEY_B2C_CARD_UPGRADE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CardUpgrade as(String alias) {
        return new CardUpgrade(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CardUpgrade as(Name alias) {
        return new CardUpgrade(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CardUpgrade rename(String name) {
        return new CardUpgrade(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CardUpgrade rename(Name name) {
        return new CardUpgrade(name, null);
    }
}
