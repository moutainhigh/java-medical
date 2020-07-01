/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables;


import com.vpu.mp.db.shop.Indexes;
import com.vpu.mp.db.shop.Keys;
import com.vpu.mp.db.shop.MiniShop_471752;
import com.vpu.mp.db.shop.tables.records.DoctorRecord;

import java.sql.Date;
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
 * 医师表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Doctor extends TableImpl<DoctorRecord> {

    private static final long serialVersionUID = -120639535;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_doctor</code>
     */
    public static final Doctor DOCTOR = new Doctor();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DoctorRecord> getRecordType() {
        return DoctorRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_doctor.id</code>.
     */
    public final TableField<DoctorRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_doctor.account_id</code>. 医师子账号id
     */
    public final TableField<DoctorRecord, Integer> ACCOUNT_ID = createField("account_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "医师子账号id");

    /**
     * The column <code>mini_shop_471752.b2c_doctor.sex</code>. 0位置 1男 2 女
     */
    public final TableField<DoctorRecord, Byte> SEX = createField("sex", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "0位置 1男 2 女");

    /**
     * The column <code>mini_shop_471752.b2c_doctor.hospital_code</code>. 医师院内编号
     */
    public final TableField<DoctorRecord, String> HOSPITAL_CODE = createField("hospital_code", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "医师院内编号");

    /**
     * The column <code>mini_shop_471752.b2c_doctor.certificate_code</code>. 医师资格编码
     */
    public final TableField<DoctorRecord, String> CERTIFICATE_CODE = createField("certificate_code", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "医师资格编码");

    /**
     * The column <code>mini_shop_471752.b2c_doctor.professional_code</code>. 医师职业编码
     */
    public final TableField<DoctorRecord, String> PROFESSIONAL_CODE = createField("professional_code", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "医师职业编码");

    /**
     * The column <code>mini_shop_471752.b2c_doctor.register_time</code>. 注册时间
     */
    public final TableField<DoctorRecord, Date> REGISTER_TIME = createField("register_time", org.jooq.impl.SQLDataType.DATE, this, "注册时间");

    /**
     * The column <code>mini_shop_471752.b2c_doctor.register_hospital</code>. 注册医院
     */
    public final TableField<DoctorRecord, String> REGISTER_HOSPITAL = createField("register_hospital", org.jooq.impl.SQLDataType.VARCHAR(32), this, "注册医院");

    /**
     * The column <code>mini_shop_471752.b2c_doctor.mobile</code>. 手机号
     */
    public final TableField<DoctorRecord, String> MOBILE = createField("mobile", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "手机号");

    /**
     * The column <code>mini_shop_471752.b2c_doctor.department_id</code>. 科室id
     */
    public final TableField<DoctorRecord, Integer> DEPARTMENT_ID = createField("department_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "科室id");

    /**
     * The column <code>mini_shop_471752.b2c_doctor.title_id</code>. 职称id
     */
    public final TableField<DoctorRecord, Integer> TITLE_ID = createField("title_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "职称id");

    /**
     * The column <code>mini_shop_471752.b2c_doctor.status</code>. 是否启用 1启用 0禁用
     */
    public final TableField<DoctorRecord, Byte> STATUS = createField("status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "是否启用 1启用 0禁用");

    /**
     * The column <code>mini_shop_471752.b2c_doctor.is_delete</code>.
     */
    public final TableField<DoctorRecord, Byte> IS_DELETE = createField("is_delete", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_doctor.create_time</code>.
     */
    public final TableField<DoctorRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_doctor.update_time</code>. 最后修改时间
     */
    public final TableField<DoctorRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "最后修改时间");

    /**
     * Create a <code>mini_shop_471752.b2c_doctor</code> table reference
     */
    public Doctor() {
        this(DSL.name("b2c_doctor"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_doctor</code> table reference
     */
    public Doctor(String alias) {
        this(DSL.name(alias), DOCTOR);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_doctor</code> table reference
     */
    public Doctor(Name alias) {
        this(alias, DOCTOR);
    }

    private Doctor(Name alias, Table<DoctorRecord> aliased) {
        this(alias, aliased, null);
    }

    private Doctor(Name alias, Table<DoctorRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("医师表"));
    }

    public <O extends Record> Doctor(Table<O> child, ForeignKey<O, DoctorRecord> key) {
        super(child, key, DOCTOR);
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
        return Arrays.<Index>asList(Indexes.DOCTOR_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<DoctorRecord, Integer> getIdentity() {
        return Keys.IDENTITY_DOCTOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DoctorRecord> getPrimaryKey() {
        return Keys.KEY_B2C_DOCTOR_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DoctorRecord>> getKeys() {
        return Arrays.<UniqueKey<DoctorRecord>>asList(Keys.KEY_B2C_DOCTOR_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Doctor as(String alias) {
        return new Doctor(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Doctor as(Name alias) {
        return new Doctor(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Doctor rename(String name) {
        return new Doctor(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Doctor rename(Name name) {
        return new Doctor(name, null);
    }
}