/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables;


import com.vpu.mp.db.shop.Indexes;
import com.vpu.mp.db.shop.Keys;
import com.vpu.mp.db.shop.MiniShop_471752;
import com.vpu.mp.db.shop.tables.records.UserGoodsRecordRecord;

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
public class UserGoodsRecord extends TableImpl<UserGoodsRecordRecord> {

    private static final long serialVersionUID = 2070503205;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_user_goods_record</code>
     */
    public static final UserGoodsRecord USER_GOODS_RECORD = new UserGoodsRecord();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserGoodsRecordRecord> getRecordType() {
        return UserGoodsRecordRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_user_goods_record.id</code>.
     */
    public final TableField<UserGoodsRecordRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_user_goods_record.user_id</code>. 用户id
     */
    public final TableField<UserGoodsRecordRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "用户id");

    /**
     * The column <code>mini_shop_471752.b2c_user_goods_record.goods_id</code>. 商品id
     */
    public final TableField<UserGoodsRecordRecord, Integer> GOODS_ID = createField("goods_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "商品id");

    /**
     * The column <code>mini_shop_471752.b2c_user_goods_record.active_id</code>. 活动id
     */
    public final TableField<UserGoodsRecordRecord, Integer> ACTIVE_ID = createField("active_id", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "活动id");

    /**
     * The column <code>mini_shop_471752.b2c_user_goods_record.active_type</code>. 活动类型
     */
    public final TableField<UserGoodsRecordRecord, Short> ACTIVE_TYPE = createField("active_type", org.jooq.impl.SQLDataType.SMALLINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.SMALLINT)), this, "活动类型");

    /**
     * The column <code>mini_shop_471752.b2c_user_goods_record.user_ip</code>. 用户ip
     */
    public final TableField<UserGoodsRecordRecord, String> USER_IP = createField("user_ip", org.jooq.impl.SQLDataType.VARCHAR(64), this, "用户ip");

    /**
     * The column <code>mini_shop_471752.b2c_user_goods_record.province_code</code>. 省
     */
    public final TableField<UserGoodsRecordRecord, String> PROVINCE_CODE = createField("province_code", org.jooq.impl.SQLDataType.VARCHAR(20), this, "省");

    /**
     * The column <code>mini_shop_471752.b2c_user_goods_record.province</code>. 省
     */
    public final TableField<UserGoodsRecordRecord, String> PROVINCE = createField("province", org.jooq.impl.SQLDataType.VARCHAR(20), this, "省");

    /**
     * The column <code>mini_shop_471752.b2c_user_goods_record.city_code</code>. 市
     */
    public final TableField<UserGoodsRecordRecord, String> CITY_CODE = createField("city_code", org.jooq.impl.SQLDataType.VARCHAR(20), this, "市");

    /**
     * The column <code>mini_shop_471752.b2c_user_goods_record.city</code>. 市
     */
    public final TableField<UserGoodsRecordRecord, String> CITY = createField("city", org.jooq.impl.SQLDataType.VARCHAR(20), this, "市");

    /**
     * The column <code>mini_shop_471752.b2c_user_goods_record.district_code</code>. 区
     */
    public final TableField<UserGoodsRecordRecord, String> DISTRICT_CODE = createField("district_code", org.jooq.impl.SQLDataType.VARCHAR(20), this, "区");

    /**
     * The column <code>mini_shop_471752.b2c_user_goods_record.district</code>. 区
     */
    public final TableField<UserGoodsRecordRecord, String> DISTRICT = createField("district", org.jooq.impl.SQLDataType.VARCHAR(20), this, "区");

    /**
     * The column <code>mini_shop_471752.b2c_user_goods_record.lat</code>. 经度
     */
    public final TableField<UserGoodsRecordRecord, String> LAT = createField("lat", org.jooq.impl.SQLDataType.VARCHAR(64), this, "经度");

    /**
     * The column <code>mini_shop_471752.b2c_user_goods_record.lng</code>. 纬度
     */
    public final TableField<UserGoodsRecordRecord, String> LNG = createField("lng", org.jooq.impl.SQLDataType.VARCHAR(64), this, "纬度");

    /**
     * The column <code>mini_shop_471752.b2c_user_goods_record.count</code>. 次数
     */
    public final TableField<UserGoodsRecordRecord, Short> COUNT = createField("count", org.jooq.impl.SQLDataType.SMALLINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.SMALLINT)), this, "次数");

    /**
     * The column <code>mini_shop_471752.b2c_user_goods_record.create_time</code>.
     */
    public final TableField<UserGoodsRecordRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_user_goods_record.update_time</code>. 最后修改时间
     */
    public final TableField<UserGoodsRecordRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "最后修改时间");

    /**
     * Create a <code>mini_shop_471752.b2c_user_goods_record</code> table reference
     */
    public UserGoodsRecord() {
        this(DSL.name("b2c_user_goods_record"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_user_goods_record</code> table reference
     */
    public UserGoodsRecord(String alias) {
        this(DSL.name(alias), USER_GOODS_RECORD);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_user_goods_record</code> table reference
     */
    public UserGoodsRecord(Name alias) {
        this(alias, USER_GOODS_RECORD);
    }

    private UserGoodsRecord(Name alias, Table<UserGoodsRecordRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserGoodsRecord(Name alias, Table<UserGoodsRecordRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> UserGoodsRecord(Table<O> child, ForeignKey<O, UserGoodsRecordRecord> key) {
        super(child, key, USER_GOODS_RECORD);
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
        return Arrays.<Index>asList(Indexes.USER_GOODS_RECORD_CREATE_TIME, Indexes.USER_GOODS_RECORD_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<UserGoodsRecordRecord, Long> getIdentity() {
        return Keys.IDENTITY_USER_GOODS_RECORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UserGoodsRecordRecord> getPrimaryKey() {
        return Keys.KEY_B2C_USER_GOODS_RECORD_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UserGoodsRecordRecord>> getKeys() {
        return Arrays.<UniqueKey<UserGoodsRecordRecord>>asList(Keys.KEY_B2C_USER_GOODS_RECORD_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserGoodsRecord as(String alias) {
        return new UserGoodsRecord(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserGoodsRecord as(Name alias) {
        return new UserGoodsRecord(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserGoodsRecord rename(String name) {
        return new UserGoodsRecord(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UserGoodsRecord rename(Name name) {
        return new UserGoodsRecord(name, null);
    }
}
