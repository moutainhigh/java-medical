/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables;


import com.vpu.mp.db.shop.Indexes;
import com.vpu.mp.db.shop.Keys;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import com.vpu.mp.db.shop.MiniShop_471752;
import com.vpu.mp.db.shop.tables.records.DistributorGroupRecord;
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
 * 分销员分组表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DistributorGroup extends TableImpl<DistributorGroupRecord> {

    private static final long serialVersionUID = -1008922579;

    /**
     * The reference instance of <code>jmini_shop_471752.b2c_distributor_group</code>
     */
    public static final DistributorGroup DISTRIBUTOR_GROUP = new DistributorGroup();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DistributorGroupRecord> getRecordType() {
        return DistributorGroupRecord.class;
    }

    /**
     * The column <code>jmini_shop_471752.b2c_distributor_group.id</code>. 分组id
     */
    public final TableField<DistributorGroupRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "分组id");

    /**
     * The column <code>jmini_shop_471752.b2c_distributor_group.group_name</code>. 分组名字
     */
    public final TableField<DistributorGroupRecord, String> GROUP_NAME = createField("group_name", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false), this, "分组名字");

    /**
     * The column <code>jmini_shop_471752.b2c_distributor_group.is_default</code>. 是否为默认
     */
    public final TableField<DistributorGroupRecord, Byte> IS_DEFAULT = createField("is_default", org.jooq.impl.SQLDataType.TINYINT.defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "是否为默认");

    /**
     * The column <code>jmini_shop_471752.b2c_distributor_group.del_flag</code>. 是否删除
     */
    public final TableField<DistributorGroupRecord, Byte> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.TINYINT.defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "是否删除");

    /**
     * The column <code>jmini_shop_471752.b2c_distributor_group.del_time</code>. 删除时间
     */
    public final TableField<DistributorGroupRecord, Timestamp> DEL_TIME = createField("del_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(DSL.inline("0000-00-00 00:00:00", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "删除时间");

    /**
     * The column <code>jmini_shop_471752.b2c_distributor_group.create_time</code>.
     */
    public final TableField<DistributorGroupRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>jmini_shop_471752.b2c_distributor_group.update_time</code>. 最后修改时间
     */
    public final TableField<DistributorGroupRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "最后修改时间");

    /**
     * The column <code>jmini_shop_471752.b2c_distributor_group.can_select</code>. 支持用户选择 1：支持；0：不支持
     */
    public final TableField<DistributorGroupRecord, Byte> CAN_SELECT = createField("can_select", org.jooq.impl.SQLDataType.TINYINT.defaultValue(DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "支持用户选择 1：支持；0：不支持");

    /**
     * Create a <code>jmini_shop_471752.b2c_distributor_group</code> table reference
     */
    public DistributorGroup() {
        this(DSL.name("b2c_distributor_group"), null);
    }

    /**
     * Create an aliased <code>jmini_shop_471752.b2c_distributor_group</code> table reference
     */
    public DistributorGroup(String alias) {
        this(DSL.name(alias), DISTRIBUTOR_GROUP);
    }

    /**
     * Create an aliased <code>jmini_shop_471752.b2c_distributor_group</code> table reference
     */
    public DistributorGroup(Name alias) {
        this(alias, DISTRIBUTOR_GROUP);
    }

    private DistributorGroup(Name alias, Table<DistributorGroupRecord> aliased) {
        this(alias, aliased, null);
    }

    private DistributorGroup(Name alias, Table<DistributorGroupRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("分销员分组表"));
    }

    public <O extends Record> DistributorGroup(Table<O> child, ForeignKey<O, DistributorGroupRecord> key) {
        super(child, key, DISTRIBUTOR_GROUP);
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
        return Arrays.<Index>asList(Indexes.DISTRIBUTOR_GROUP_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<DistributorGroupRecord, Integer> getIdentity() {
        return Keys.IDENTITY_DISTRIBUTOR_GROUP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DistributorGroupRecord> getPrimaryKey() {
        return Keys.KEY_B2C_DISTRIBUTOR_GROUP_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DistributorGroupRecord>> getKeys() {
        return Arrays.<UniqueKey<DistributorGroupRecord>>asList(Keys.KEY_B2C_DISTRIBUTOR_GROUP_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DistributorGroup as(String alias) {
        return new DistributorGroup(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DistributorGroup as(Name alias) {
        return new DistributorGroup(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DistributorGroup rename(String name) {
        return new DistributorGroup(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DistributorGroup rename(Name name) {
        return new DistributorGroup(name, null);
    }
}
