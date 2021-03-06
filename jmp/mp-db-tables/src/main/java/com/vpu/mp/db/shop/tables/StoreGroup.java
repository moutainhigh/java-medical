/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables;


import com.vpu.mp.db.shop.Indexes;
import com.vpu.mp.db.shop.Keys;
import com.vpu.mp.db.shop.MiniShop_471752;
import com.vpu.mp.db.shop.tables.records.StoreGroupRecord;

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
public class StoreGroup extends TableImpl<StoreGroupRecord> {

    private static final long serialVersionUID = -1857251793;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_store_group</code>
     */
    public static final StoreGroup STORE_GROUP = new StoreGroup();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StoreGroupRecord> getRecordType() {
        return StoreGroupRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_store_group.group_id</code>.
     */
    public final TableField<StoreGroupRecord, Integer> GROUP_ID = createField("group_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_store_group.group_name</code>.
     */
    public final TableField<StoreGroupRecord, String> GROUP_NAME = createField("group_name", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_store_group.create_time</code>.
     */
    public final TableField<StoreGroupRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_store_group.update_time</code>. 最后修改时间
     */
    public final TableField<StoreGroupRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "最后修改时间");

    /**
     * Create a <code>mini_shop_471752.b2c_store_group</code> table reference
     */
    public StoreGroup() {
        this(DSL.name("b2c_store_group"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_store_group</code> table reference
     */
    public StoreGroup(String alias) {
        this(DSL.name(alias), STORE_GROUP);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_store_group</code> table reference
     */
    public StoreGroup(Name alias) {
        this(alias, STORE_GROUP);
    }

    private StoreGroup(Name alias, Table<StoreGroupRecord> aliased) {
        this(alias, aliased, null);
    }

    private StoreGroup(Name alias, Table<StoreGroupRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> StoreGroup(Table<O> child, ForeignKey<O, StoreGroupRecord> key) {
        super(child, key, STORE_GROUP);
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
        return Arrays.<Index>asList(Indexes.STORE_GROUP_GROUP_NAME, Indexes.STORE_GROUP_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<StoreGroupRecord, Integer> getIdentity() {
        return Keys.IDENTITY_STORE_GROUP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<StoreGroupRecord> getPrimaryKey() {
        return Keys.KEY_B2C_STORE_GROUP_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<StoreGroupRecord>> getKeys() {
        return Arrays.<UniqueKey<StoreGroupRecord>>asList(Keys.KEY_B2C_STORE_GROUP_PRIMARY, Keys.KEY_B2C_STORE_GROUP_GROUP_NAME);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StoreGroup as(String alias) {
        return new StoreGroup(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StoreGroup as(Name alias) {
        return new StoreGroup(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public StoreGroup rename(String name) {
        return new StoreGroup(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public StoreGroup rename(Name name) {
        return new StoreGroup(name, null);
    }
}
