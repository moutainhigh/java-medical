/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables;


import com.vpu.mp.db.shop.Indexes;
import com.vpu.mp.db.shop.Keys;
import com.vpu.mp.db.shop.MiniShop_471752;
import com.vpu.mp.db.shop.tables.records.DistributorLevelRecordRecord;

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
public class DistributorLevelRecord extends TableImpl<DistributorLevelRecordRecord> {

    private static final long serialVersionUID = -497269379;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_distributor_level_record</code>
     */
    public static final DistributorLevelRecord DISTRIBUTOR_LEVEL_RECORD = new DistributorLevelRecord();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DistributorLevelRecordRecord> getRecordType() {
        return DistributorLevelRecordRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_distributor_level_record.id</code>.
     */
    public final TableField<DistributorLevelRecordRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_distributor_level_record.user_id</code>. 用户id
     */
    public final TableField<DistributorLevelRecordRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "用户id");

    /**
     * The column <code>mini_shop_471752.b2c_distributor_level_record.is_go_up</code>. 升降：0降，1升
     */
    public final TableField<DistributorLevelRecordRecord, Byte> IS_GO_UP = createField("is_go_up", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "升降：0降，1升");

    /**
     * The column <code>mini_shop_471752.b2c_distributor_level_record.old_level</code>. 旧等级
     */
    public final TableField<DistributorLevelRecordRecord, Byte> OLD_LEVEL = createField("old_level", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "旧等级");

    /**
     * The column <code>mini_shop_471752.b2c_distributor_level_record.old_level_name</code>. 旧等级名字
     */
    public final TableField<DistributorLevelRecordRecord, String> OLD_LEVEL_NAME = createField("old_level_name", org.jooq.impl.SQLDataType.VARCHAR(32), this, "旧等级名字");

    /**
     * The column <code>mini_shop_471752.b2c_distributor_level_record.new_level</code>. 新等级
     */
    public final TableField<DistributorLevelRecordRecord, Byte> NEW_LEVEL = createField("new_level", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "新等级");

    /**
     * The column <code>mini_shop_471752.b2c_distributor_level_record.new_level_name</code>. 新等级名字
     */
    public final TableField<DistributorLevelRecordRecord, String> NEW_LEVEL_NAME = createField("new_level_name", org.jooq.impl.SQLDataType.VARCHAR(32), this, "新等级名字");

    /**
     * The column <code>mini_shop_471752.b2c_distributor_level_record.update_note</code>. 更新备注
     */
    public final TableField<DistributorLevelRecordRecord, String> UPDATE_NOTE = createField("update_note", org.jooq.impl.SQLDataType.VARCHAR(120), this, "更新备注");

    /**
     * The column <code>mini_shop_471752.b2c_distributor_level_record.create_time</code>.
     */
    public final TableField<DistributorLevelRecordRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_distributor_level_record.update_time</code>. 最后修改时间
     */
    public final TableField<DistributorLevelRecordRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "最后修改时间");

    /**
     * Create a <code>mini_shop_471752.b2c_distributor_level_record</code> table reference
     */
    public DistributorLevelRecord() {
        this(DSL.name("b2c_distributor_level_record"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_distributor_level_record</code> table reference
     */
    public DistributorLevelRecord(String alias) {
        this(DSL.name(alias), DISTRIBUTOR_LEVEL_RECORD);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_distributor_level_record</code> table reference
     */
    public DistributorLevelRecord(Name alias) {
        this(alias, DISTRIBUTOR_LEVEL_RECORD);
    }

    private DistributorLevelRecord(Name alias, Table<DistributorLevelRecordRecord> aliased) {
        this(alias, aliased, null);
    }

    private DistributorLevelRecord(Name alias, Table<DistributorLevelRecordRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> DistributorLevelRecord(Table<O> child, ForeignKey<O, DistributorLevelRecordRecord> key) {
        super(child, key, DISTRIBUTOR_LEVEL_RECORD);
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
        return Arrays.<Index>asList(Indexes.DISTRIBUTOR_LEVEL_RECORD_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<DistributorLevelRecordRecord, Integer> getIdentity() {
        return Keys.IDENTITY_DISTRIBUTOR_LEVEL_RECORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DistributorLevelRecordRecord> getPrimaryKey() {
        return Keys.KEY_B2C_DISTRIBUTOR_LEVEL_RECORD_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DistributorLevelRecordRecord>> getKeys() {
        return Arrays.<UniqueKey<DistributorLevelRecordRecord>>asList(Keys.KEY_B2C_DISTRIBUTOR_LEVEL_RECORD_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DistributorLevelRecord as(String alias) {
        return new DistributorLevelRecord(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DistributorLevelRecord as(Name alias) {
        return new DistributorLevelRecord(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DistributorLevelRecord rename(String name) {
        return new DistributorLevelRecord(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DistributorLevelRecord rename(Name name) {
        return new DistributorLevelRecord(name, null);
    }
}
