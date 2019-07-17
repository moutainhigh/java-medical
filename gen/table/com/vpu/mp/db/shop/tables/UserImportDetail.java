/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables;


import com.vpu.mp.db.shop.Indexes;
import com.vpu.mp.db.shop.Keys;
import com.vpu.mp.db.shop.MiniShop_471752;
import com.vpu.mp.db.shop.tables.records.UserImportDetailRecord;

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
public class UserImportDetail extends TableImpl<UserImportDetailRecord> {

    private static final long serialVersionUID = 876905434;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_user_import_detail</code>
     */
    public static final UserImportDetail USER_IMPORT_DETAIL = new UserImportDetail();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserImportDetailRecord> getRecordType() {
        return UserImportDetailRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_user_import_detail.id</code>.
     */
    public final TableField<UserImportDetailRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_user_import_detail.batch_id</code>. 主表id
     */
    public final TableField<UserImportDetailRecord, Integer> BATCH_ID = createField("batch_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "主表id");

    /**
     * The column <code>mini_shop_471752.b2c_user_import_detail.mobile</code>. 手机号
     */
    public final TableField<UserImportDetailRecord, String> MOBILE = createField("mobile", org.jooq.impl.SQLDataType.VARCHAR(15), this, "手机号");

    /**
     * The column <code>mini_shop_471752.b2c_user_import_detail.name</code>. 姓名
     */
    public final TableField<UserImportDetailRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(50), this, "姓名");

    /**
     * The column <code>mini_shop_471752.b2c_user_import_detail.invite_user_mobile</code>. 邀请人手机号
     */
    public final TableField<UserImportDetailRecord, String> INVITE_USER_MOBILE = createField("invite_user_mobile", org.jooq.impl.SQLDataType.VARCHAR(15), this, "邀请人手机号");

    /**
     * The column <code>mini_shop_471752.b2c_user_import_detail.score</code>. 积分
     */
    public final TableField<UserImportDetailRecord, Integer> SCORE = createField("score", org.jooq.impl.SQLDataType.INTEGER, this, "积分");

    /**
     * The column <code>mini_shop_471752.b2c_user_import_detail.sex</code>. 性别： 女f 男m
     */
    public final TableField<UserImportDetailRecord, String> SEX = createField("sex", org.jooq.impl.SQLDataType.CHAR(5), this, "性别： 女f 男m");

    /**
     * The column <code>mini_shop_471752.b2c_user_import_detail.birthday</code>. 生日
     */
    public final TableField<UserImportDetailRecord, String> BIRTHDAY = createField("birthday", org.jooq.impl.SQLDataType.VARCHAR(15), this, "生日");

    /**
     * The column <code>mini_shop_471752.b2c_user_import_detail.province</code>. 省
     */
    public final TableField<UserImportDetailRecord, String> PROVINCE = createField("province", org.jooq.impl.SQLDataType.VARCHAR(10), this, "省");

    /**
     * The column <code>mini_shop_471752.b2c_user_import_detail.city</code>. 市
     */
    public final TableField<UserImportDetailRecord, String> CITY = createField("city", org.jooq.impl.SQLDataType.VARCHAR(10), this, "市");

    /**
     * The column <code>mini_shop_471752.b2c_user_import_detail.district</code>. 区
     */
    public final TableField<UserImportDetailRecord, String> DISTRICT = createField("district", org.jooq.impl.SQLDataType.VARCHAR(10), this, "区");

    /**
     * The column <code>mini_shop_471752.b2c_user_import_detail.address</code>. 地址
     */
    public final TableField<UserImportDetailRecord, String> ADDRESS = createField("address", org.jooq.impl.SQLDataType.VARCHAR(100), this, "地址");

    /**
     * The column <code>mini_shop_471752.b2c_user_import_detail.id_number</code>. 身份证号
     */
    public final TableField<UserImportDetailRecord, String> ID_NUMBER = createField("id_number", org.jooq.impl.SQLDataType.VARCHAR(18), this, "身份证号");

    /**
     * The column <code>mini_shop_471752.b2c_user_import_detail.education</code>. 教育程度
     */
    public final TableField<UserImportDetailRecord, String> EDUCATION = createField("education", org.jooq.impl.SQLDataType.VARCHAR(50), this, "教育程度");

    /**
     * The column <code>mini_shop_471752.b2c_user_import_detail.industry</code>. 所在行业
     */
    public final TableField<UserImportDetailRecord, String> INDUSTRY = createField("industry", org.jooq.impl.SQLDataType.VARCHAR(50), this, "所在行业");

    /**
     * The column <code>mini_shop_471752.b2c_user_import_detail.marriage</code>. 婚姻状况
     */
    public final TableField<UserImportDetailRecord, String> MARRIAGE = createField("marriage", org.jooq.impl.SQLDataType.VARCHAR(50), this, "婚姻状况");

    /**
     * The column <code>mini_shop_471752.b2c_user_import_detail.income</code>. 月收入
     */
    public final TableField<UserImportDetailRecord, BigDecimal> INCOME = createField("income", org.jooq.impl.SQLDataType.DECIMAL(10, 2), this, "月收入");

    /**
     * The column <code>mini_shop_471752.b2c_user_import_detail.error_msg</code>. 错误内容
     */
    public final TableField<UserImportDetailRecord, String> ERROR_MSG = createField("error_msg", org.jooq.impl.SQLDataType.VARCHAR(100), this, "错误内容");

    /**
     * The column <code>mini_shop_471752.b2c_user_import_detail.card_id</code>. 会员卡id
     */
    public final TableField<UserImportDetailRecord, String> CARD_ID = createField("card_id", org.jooq.impl.SQLDataType.VARCHAR(100), this, "会员卡id");

    /**
     * The column <code>mini_shop_471752.b2c_user_import_detail.is_activate</code>. 是否已激活
     */
    public final TableField<UserImportDetailRecord, Byte> IS_ACTIVATE = createField("is_activate", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "是否已激活");

    /**
     * The column <code>mini_shop_471752.b2c_user_import_detail.create_time</code>.
     */
    public final TableField<UserImportDetailRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_user_import_detail.update_time</code>. 最后修改时间
     */
    public final TableField<UserImportDetailRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "最后修改时间");

    /**
     * Create a <code>mini_shop_471752.b2c_user_import_detail</code> table reference
     */
    public UserImportDetail() {
        this(DSL.name("b2c_user_import_detail"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_user_import_detail</code> table reference
     */
    public UserImportDetail(String alias) {
        this(DSL.name(alias), USER_IMPORT_DETAIL);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_user_import_detail</code> table reference
     */
    public UserImportDetail(Name alias) {
        this(alias, USER_IMPORT_DETAIL);
    }

    private UserImportDetail(Name alias, Table<UserImportDetailRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserImportDetail(Name alias, Table<UserImportDetailRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> UserImportDetail(Table<O> child, ForeignKey<O, UserImportDetailRecord> key) {
        super(child, key, USER_IMPORT_DETAIL);
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
        return Arrays.<Index>asList(Indexes.USER_IMPORT_DETAIL_BATCH_ID, Indexes.USER_IMPORT_DETAIL_MOBILE, Indexes.USER_IMPORT_DETAIL_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<UserImportDetailRecord, Integer> getIdentity() {
        return Keys.IDENTITY_USER_IMPORT_DETAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UserImportDetailRecord> getPrimaryKey() {
        return Keys.KEY_B2C_USER_IMPORT_DETAIL_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UserImportDetailRecord>> getKeys() {
        return Arrays.<UniqueKey<UserImportDetailRecord>>asList(Keys.KEY_B2C_USER_IMPORT_DETAIL_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserImportDetail as(String alias) {
        return new UserImportDetail(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserImportDetail as(Name alias) {
        return new UserImportDetail(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserImportDetail rename(String name) {
        return new UserImportDetail(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UserImportDetail rename(Name name) {
        return new UserImportDetail(name, null);
    }
}
