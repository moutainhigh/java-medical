/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables;


import com.vpu.mp.db.shop.Indexes;
import com.vpu.mp.db.shop.Keys;
import com.vpu.mp.db.shop.MiniShop_471752;
import com.vpu.mp.db.shop.tables.records.AssessResultRecord;

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
public class AssessResult extends TableImpl<AssessResultRecord> {

    private static final long serialVersionUID = 204107855;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_assess_result</code>
     */
    public static final AssessResult ASSESS_RESULT = new AssessResult();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AssessResultRecord> getRecordType() {
        return AssessResultRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_assess_result.id</code>.
     */
    public final TableField<AssessResultRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_assess_result.shop_id</code>. 店铺ID
     */
    public final TableField<AssessResultRecord, Integer> SHOP_ID = createField("shop_id", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "店铺ID");

    /**
     * The column <code>mini_shop_471752.b2c_assess_result.assess_id</code>. 测评活动ID
     */
    public final TableField<AssessResultRecord, Integer> ASSESS_ID = createField("assess_id", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "测评活动ID");

    /**
     * The column <code>mini_shop_471752.b2c_assess_result.result</code>. 测试结果
     */
    public final TableField<AssessResultRecord, String> RESULT = createField("result", org.jooq.impl.SQLDataType.VARCHAR(200).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "测试结果");

    /**
     * The column <code>mini_shop_471752.b2c_assess_result.min_point</code>. 结果分值区间起始值
     */
    public final TableField<AssessResultRecord, Integer> MIN_POINT = createField("min_point", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "结果分值区间起始值");

    /**
     * The column <code>mini_shop_471752.b2c_assess_result.max_point</code>. 结果分值区间终值
     */
    public final TableField<AssessResultRecord, Integer> MAX_POINT = createField("max_point", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "结果分值区间终值");

    /**
     * The column <code>mini_shop_471752.b2c_assess_result.result_img_path</code>. 测试结果图片路径
     */
    public final TableField<AssessResultRecord, String> RESULT_IMG_PATH = createField("result_img_path", org.jooq.impl.SQLDataType.VARCHAR(200).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "测试结果图片路径");

    /**
     * The column <code>mini_shop_471752.b2c_assess_result.result_desc</code>. 测试结果描述
     */
    public final TableField<AssessResultRecord, String> RESULT_DESC = createField("result_desc", org.jooq.impl.SQLDataType.VARCHAR(500).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "测试结果描述");

    /**
     * The column <code>mini_shop_471752.b2c_assess_result.reward_type</code>. 奖励类型：0不设置，1优惠券，2奖品，3积分，4余额，5自定义
     */
    public final TableField<AssessResultRecord, Byte> REWARD_TYPE = createField("reward_type", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "奖励类型：0不设置，1优惠券，2奖品，3积分，4余额，5自定义");

    /**
     * The column <code>mini_shop_471752.b2c_assess_result.reward_info</code>. 奖励内容
     */
    public final TableField<AssessResultRecord, String> REWARD_INFO = createField("reward_info", org.jooq.impl.SQLDataType.VARCHAR(300).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "奖励内容");

    /**
     * The column <code>mini_shop_471752.b2c_assess_result.reward_limit_type</code>. 领奖限制类型：0无限制，1分享好友领奖品，2填写信息领奖品
     */
    public final TableField<AssessResultRecord, Byte> REWARD_LIMIT_TYPE = createField("reward_limit_type", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "领奖限制类型：0无限制，1分享好友领奖品，2填写信息领奖品");

    /**
     * The column <code>mini_shop_471752.b2c_assess_result.reward_limit_condition</code>. 领奖限制条件,多选字符串逗号隔开：1真实姓名，2手机号，3身份证号码，4性别，5生日，6婚姻状况，7教育程度，8所在行业，9所在地
     */
    public final TableField<AssessResultRecord, String> REWARD_LIMIT_CONDITION = createField("reward_limit_condition", org.jooq.impl.SQLDataType.VARCHAR(32).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "领奖限制条件,多选字符串逗号隔开：1真实姓名，2手机号，3身份证号码，4性别，5生日，6婚姻状况，7教育程度，8所在行业，9所在地");

    /**
     * The column <code>mini_shop_471752.b2c_assess_result.bg_type</code>. 结果页背景类型：0默认，1自定义
     */
    public final TableField<AssessResultRecord, Byte> BG_TYPE = createField("bg_type", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "结果页背景类型：0默认，1自定义");

    /**
     * The column <code>mini_shop_471752.b2c_assess_result.bg_img_path</code>. 结果页背景图片路径
     */
    public final TableField<AssessResultRecord, String> BG_IMG_PATH = createField("bg_img_path", org.jooq.impl.SQLDataType.VARCHAR(132).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "结果页背景图片路径");

    /**
     * The column <code>mini_shop_471752.b2c_assess_result.create_time</code>.
     */
    public final TableField<AssessResultRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_assess_result.update_time</code>. 最后修改时间
     */
    public final TableField<AssessResultRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "最后修改时间");

    /**
     * The column <code>mini_shop_471752.b2c_assess_result.del_flag</code>. 删除标识：0未删除，1已删除
     */
    public final TableField<AssessResultRecord, Byte> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "删除标识：0未删除，1已删除");

    /**
     * Create a <code>mini_shop_471752.b2c_assess_result</code> table reference
     */
    public AssessResult() {
        this(DSL.name("b2c_assess_result"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_assess_result</code> table reference
     */
    public AssessResult(String alias) {
        this(DSL.name(alias), ASSESS_RESULT);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_assess_result</code> table reference
     */
    public AssessResult(Name alias) {
        this(alias, ASSESS_RESULT);
    }

    private AssessResult(Name alias, Table<AssessResultRecord> aliased) {
        this(alias, aliased, null);
    }

    private AssessResult(Name alias, Table<AssessResultRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> AssessResult(Table<O> child, ForeignKey<O, AssessResultRecord> key) {
        super(child, key, ASSESS_RESULT);
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
        return Arrays.<Index>asList(Indexes.ASSESS_RESULT_ASSESS_ID, Indexes.ASSESS_RESULT_PRIMARY, Indexes.ASSESS_RESULT_SHOP_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<AssessResultRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ASSESS_RESULT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AssessResultRecord> getPrimaryKey() {
        return Keys.KEY_B2C_ASSESS_RESULT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AssessResultRecord>> getKeys() {
        return Arrays.<UniqueKey<AssessResultRecord>>asList(Keys.KEY_B2C_ASSESS_RESULT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssessResult as(String alias) {
        return new AssessResult(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssessResult as(Name alias) {
        return new AssessResult(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AssessResult rename(String name) {
        return new AssessResult(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AssessResult rename(Name name) {
        return new AssessResult(name, null);
    }
}
