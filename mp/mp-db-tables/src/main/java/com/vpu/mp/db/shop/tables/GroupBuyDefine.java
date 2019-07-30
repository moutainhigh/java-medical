/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables;


import com.vpu.mp.db.shop.Indexes;
import com.vpu.mp.db.shop.Keys;
import com.vpu.mp.db.shop.MiniShop_471752;
import com.vpu.mp.db.shop.tables.records.GroupBuyDefineRecord;

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
public class GroupBuyDefine extends TableImpl<GroupBuyDefineRecord> {

    private static final long serialVersionUID = -1123030414;

    /**
     * The reference instance of <code>mini_shop_4748160.b2c_group_buy_define</code>
     */
    public static final GroupBuyDefine GROUP_BUY_DEFINE = new GroupBuyDefine();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GroupBuyDefineRecord> getRecordType() {
        return GroupBuyDefineRecord.class;
    }

    /**
     * The column <code>mini_shop_4748160.b2c_group_buy_define.id</code>.
     */
    public final TableField<GroupBuyDefineRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_4748160.b2c_group_buy_define.shop_id</code>. 店铺id
     */
    public final TableField<GroupBuyDefineRecord, Integer> SHOP_ID = createField("shop_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "店铺id");

    /**
     * The column <code>mini_shop_4748160.b2c_group_buy_define.goods_id</code>. 商品id
     */
    public final TableField<GroupBuyDefineRecord, Integer> GOODS_ID = createField("goods_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "商品id");

    /**
     * The column <code>mini_shop_4748160.b2c_group_buy_define.name</code>. 活动名称
     */
    public final TableField<GroupBuyDefineRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "活动名称");

    /**
     * The column <code>mini_shop_4748160.b2c_group_buy_define.limit_amount</code>. 成团人数
     */
    public final TableField<GroupBuyDefineRecord, Short> LIMIT_AMOUNT = createField("limit_amount", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "成团人数");

    /**
     * The column <code>mini_shop_4748160.b2c_group_buy_define.join_limit</code>. 参团限制
     */
    public final TableField<GroupBuyDefineRecord, Short> JOIN_LIMIT = createField("join_limit", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "参团限制");

    /**
     * The column <code>mini_shop_4748160.b2c_group_buy_define.open_limit</code>. 开团限制
     */
    public final TableField<GroupBuyDefineRecord, Short> OPEN_LIMIT = createField("open_limit", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "开团限制");

    /**
     * The column <code>mini_shop_4748160.b2c_group_buy_define.is_default</code>. 默认成团
     */
    public final TableField<GroupBuyDefineRecord, Byte> IS_DEFAULT = createField("is_default", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "默认成团");

    /**
     * The column <code>mini_shop_4748160.b2c_group_buy_define.start_time</code>. 开始时间
     */
    public final TableField<GroupBuyDefineRecord, Timestamp> START_TIME = createField("start_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "开始时间");

    /**
     * The column <code>mini_shop_4748160.b2c_group_buy_define.end_time</code>. 结束时间
     */
    public final TableField<GroupBuyDefineRecord, Timestamp> END_TIME = createField("end_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "结束时间");

    /**
     * The column <code>mini_shop_4748160.b2c_group_buy_define.stock</code>. 总库存
     */
    public final TableField<GroupBuyDefineRecord, Short> STOCK = createField("stock", org.jooq.impl.SQLDataType.SMALLINT.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.SMALLINT)), this, "总库存");

    /**
     * The column <code>mini_shop_4748160.b2c_group_buy_define.sale_num</code>. 销量
     */
    public final TableField<GroupBuyDefineRecord, Short> SALE_NUM = createField("sale_num", org.jooq.impl.SQLDataType.SMALLINT.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.SMALLINT)), this, "销量");

    /**
     * The column <code>mini_shop_4748160.b2c_group_buy_define.del_flag</code>.
     */
    public final TableField<GroupBuyDefineRecord, Byte> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>mini_shop_4748160.b2c_group_buy_define.status</code>. 状态： 1：启用  0： 禁用
     */
    public final TableField<GroupBuyDefineRecord, Byte> STATUS = createField("status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "状态： 1：启用  0： 禁用");

    /**
     * The column <code>mini_shop_4748160.b2c_group_buy_define.del_time</code>.
     */
    public final TableField<GroupBuyDefineRecord, Integer> DEL_TIME = createField("del_time", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>mini_shop_4748160.b2c_group_buy_define.activity_type</code>. 活动类型：1：普通拼团，2：老带新团
     */
    public final TableField<GroupBuyDefineRecord, Byte> ACTIVITY_TYPE = createField("activity_type", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "活动类型：1：普通拼团，2：老带新团");

    /**
     * The column <code>mini_shop_4748160.b2c_group_buy_define.is_grouper_cheap</code>. 是否开启团长优惠：0：不开启，1：开启
     */
    public final TableField<GroupBuyDefineRecord, Byte> IS_GROUPER_CHEAP = createField("is_grouper_cheap", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "是否开启团长优惠：0：不开启，1：开启");

    /**
     * The column <code>mini_shop_4748160.b2c_group_buy_define.reward_coupon_id</code>. 拼团失败发放优惠券
     */
    public final TableField<GroupBuyDefineRecord, String> REWARD_COUPON_ID = createField("reward_coupon_id", org.jooq.impl.SQLDataType.VARCHAR(200), this, "拼团失败发放优惠券");

    /**
     * The column <code>mini_shop_4748160.b2c_group_buy_define.share_config</code>. 分享设置
     */
    public final TableField<GroupBuyDefineRecord, String> SHARE_CONFIG = createField("share_config", org.jooq.impl.SQLDataType.CLOB, this, "分享设置");

    /**
     * The column <code>mini_shop_4748160.b2c_group_buy_define.create_time</code>.
     */
    public final TableField<GroupBuyDefineRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mini_shop_4748160.b2c_group_buy_define.update_time</code>. 最后修改时间
     */
    public final TableField<GroupBuyDefineRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "最后修改时间");

    /**
     * Create a <code>mini_shop_4748160.b2c_group_buy_define</code> table reference
     */
    public GroupBuyDefine() {
        this(DSL.name("b2c_group_buy_define"), null);
    }

    /**
     * Create an aliased <code>mini_shop_4748160.b2c_group_buy_define</code> table reference
     */
    public GroupBuyDefine(String alias) {
        this(DSL.name(alias), GROUP_BUY_DEFINE);
    }

    /**
     * Create an aliased <code>mini_shop_4748160.b2c_group_buy_define</code> table reference
     */
    public GroupBuyDefine(Name alias) {
        this(alias, GROUP_BUY_DEFINE);
    }

    private GroupBuyDefine(Name alias, Table<GroupBuyDefineRecord> aliased) {
        this(alias, aliased, null);
    }

    private GroupBuyDefine(Name alias, Table<GroupBuyDefineRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> GroupBuyDefine(Table<O> child, ForeignKey<O, GroupBuyDefineRecord> key) {
        super(child, key, GROUP_BUY_DEFINE);
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
        return Arrays.<Index>asList(Indexes.GROUP_BUY_DEFINE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<GroupBuyDefineRecord, Integer> getIdentity() {
        return Keys.IDENTITY_GROUP_BUY_DEFINE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<GroupBuyDefineRecord> getPrimaryKey() {
        return Keys.KEY_B2C_GROUP_BUY_DEFINE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<GroupBuyDefineRecord>> getKeys() {
        return Arrays.<UniqueKey<GroupBuyDefineRecord>>asList(Keys.KEY_B2C_GROUP_BUY_DEFINE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GroupBuyDefine as(String alias) {
        return new GroupBuyDefine(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GroupBuyDefine as(Name alias) {
        return new GroupBuyDefine(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public GroupBuyDefine rename(String name) {
        return new GroupBuyDefine(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public GroupBuyDefine rename(Name name) {
        return new GroupBuyDefine(name, null);
    }
}
