/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables;


import com.vpu.mp.db.shop.Indexes;
import com.vpu.mp.db.shop.Keys;
import com.vpu.mp.db.shop.MiniShop_471752;
import com.vpu.mp.db.shop.tables.records.UserCollectionRecord;

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
public class UserCollection extends TableImpl<UserCollectionRecord> {

    private static final long serialVersionUID = 1354396376;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_user_collection</code>
     */
    public static final UserCollection USER_COLLECTION = new UserCollection();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserCollectionRecord> getRecordType() {
        return UserCollectionRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_user_collection.id</code>.
     */
    public final TableField<UserCollectionRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_user_collection.user_id</code>.
     */
    public final TableField<UserCollectionRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_user_collection.username</code>.
     */
    public final TableField<UserCollectionRecord, String> USERNAME = createField("username", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_user_collection.goods_id</code>.
     */
    public final TableField<UserCollectionRecord, Integer> GOODS_ID = createField("goods_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_user_collection.shop_id</code>. 店铺id
     */
    public final TableField<UserCollectionRecord, Integer> SHOP_ID = createField("shop_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "店铺id");

    /**
     * The column <code>mini_shop_471752.b2c_user_collection.collect_price</code>. 收藏时价格
     */
    public final TableField<UserCollectionRecord, BigDecimal> COLLECT_PRICE = createField("collect_price", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "收藏时价格");

    /**
     * The column <code>mini_shop_471752.b2c_user_collection.create_time</code>.
     */
    public final TableField<UserCollectionRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_user_collection.update_time</code>. 最后修改时间
     */
    public final TableField<UserCollectionRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "最后修改时间");

    /**
     * Create a <code>mini_shop_471752.b2c_user_collection</code> table reference
     */
    public UserCollection() {
        this(DSL.name("b2c_user_collection"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_user_collection</code> table reference
     */
    public UserCollection(String alias) {
        this(DSL.name(alias), USER_COLLECTION);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_user_collection</code> table reference
     */
    public UserCollection(Name alias) {
        this(alias, USER_COLLECTION);
    }

    private UserCollection(Name alias, Table<UserCollectionRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserCollection(Name alias, Table<UserCollectionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> UserCollection(Table<O> child, ForeignKey<O, UserCollectionRecord> key) {
        super(child, key, USER_COLLECTION);
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
        return Arrays.<Index>asList(Indexes.USER_COLLECTION_GOODS_ID, Indexes.USER_COLLECTION_PRIMARY, Indexes.USER_COLLECTION_SHOP_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<UserCollectionRecord, Integer> getIdentity() {
        return Keys.IDENTITY_USER_COLLECTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UserCollectionRecord> getPrimaryKey() {
        return Keys.KEY_B2C_USER_COLLECTION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UserCollectionRecord>> getKeys() {
        return Arrays.<UniqueKey<UserCollectionRecord>>asList(Keys.KEY_B2C_USER_COLLECTION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserCollection as(String alias) {
        return new UserCollection(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserCollection as(Name alias) {
        return new UserCollection(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserCollection rename(String name) {
        return new UserCollection(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UserCollection rename(Name name) {
        return new UserCollection(name, null);
    }
}
