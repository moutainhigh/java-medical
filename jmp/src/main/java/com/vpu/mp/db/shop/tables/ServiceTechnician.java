/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables;


import com.vpu.mp.db.shop.Indexes;
import com.vpu.mp.db.shop.Keys;
import com.vpu.mp.db.shop.MiniShop_471752;
import com.vpu.mp.db.shop.tables.records.ServiceTechnicianRecord;

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
public class ServiceTechnician extends TableImpl<ServiceTechnicianRecord> {

    private static final long serialVersionUID = -174700952;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_service_technician</code>
     */
    public static final ServiceTechnician SERVICE_TECHNICIAN = new ServiceTechnician();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ServiceTechnicianRecord> getRecordType() {
        return ServiceTechnicianRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_service_technician.id</code>. 技师id
     */
    public final TableField<ServiceTechnicianRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "技师id");

    /**
     * The column <code>mini_shop_471752.b2c_service_technician.store_id</code>.
     */
    public final TableField<ServiceTechnicianRecord, Integer> STORE_ID = createField("store_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_service_technician.technician_name</code>. 技师名称
     */
    public final TableField<ServiceTechnicianRecord, String> TECHNICIAN_NAME = createField("technician_name", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "技师名称");

    /**
     * The column <code>mini_shop_471752.b2c_service_technician.technician_mobile</code>. 技师电话
     */
    public final TableField<ServiceTechnicianRecord, String> TECHNICIAN_MOBILE = createField("technician_mobile", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "技师电话");

    /**
     * The column <code>mini_shop_471752.b2c_service_technician.bg_img_path</code>. 技师头像地址
     */
    public final TableField<ServiceTechnicianRecord, String> BG_IMG_PATH = createField("bg_img_path", org.jooq.impl.SQLDataType.VARCHAR(191).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "技师头像地址");

    /**
     * The column <code>mini_shop_471752.b2c_service_technician.technician_introduce</code>. 技师简介
     */
    public final TableField<ServiceTechnicianRecord, String> TECHNICIAN_INTRODUCE = createField("technician_introduce", org.jooq.impl.SQLDataType.VARCHAR(200).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "技师简介");

    /**
     * The column <code>mini_shop_471752.b2c_service_technician.group_id</code>. 技师分组
     */
    public final TableField<ServiceTechnicianRecord, Short> GROUP_ID = createField("group_id", org.jooq.impl.SQLDataType.SMALLINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.SMALLINT)), this, "技师分组");

    /**
     * The column <code>mini_shop_471752.b2c_service_technician.service_type</code>. 技师服务项目：0所有，1部分
     */
    public final TableField<ServiceTechnicianRecord, Byte> SERVICE_TYPE = createField("service_type", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "技师服务项目：0所有，1部分");

    /**
     * The column <code>mini_shop_471752.b2c_service_technician.service_list</code>. 当type=0是服务项目详情：array()
     */
    public final TableField<ServiceTechnicianRecord, String> SERVICE_LIST = createField("service_list", org.jooq.impl.SQLDataType.VARCHAR(191).nullable(false).defaultValue(org.jooq.impl.DSL.inline("{}", org.jooq.impl.SQLDataType.VARCHAR)), this, "当type=0是服务项目详情：array()");

    /**
     * The column <code>mini_shop_471752.b2c_service_technician.remarks</code>. 备注
     */
    public final TableField<ServiceTechnicianRecord, String> REMARKS = createField("remarks", org.jooq.impl.SQLDataType.VARCHAR(1024).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "备注");

    /**
     * The column <code>mini_shop_471752.b2c_service_technician.del_flag</code>. 0正常，1删除
     */
    public final TableField<ServiceTechnicianRecord, Byte> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "0正常，1删除");

    /**
     * The column <code>mini_shop_471752.b2c_service_technician.create_time</code>.
     */
    public final TableField<ServiceTechnicianRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_service_technician.update_time</code>. 最后修改时间
     */
    public final TableField<ServiceTechnicianRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "最后修改时间");

    /**
     * Create a <code>mini_shop_471752.b2c_service_technician</code> table reference
     */
    public ServiceTechnician() {
        this(DSL.name("b2c_service_technician"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_service_technician</code> table reference
     */
    public ServiceTechnician(String alias) {
        this(DSL.name(alias), SERVICE_TECHNICIAN);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_service_technician</code> table reference
     */
    public ServiceTechnician(Name alias) {
        this(alias, SERVICE_TECHNICIAN);
    }

    private ServiceTechnician(Name alias, Table<ServiceTechnicianRecord> aliased) {
        this(alias, aliased, null);
    }

    private ServiceTechnician(Name alias, Table<ServiceTechnicianRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ServiceTechnician(Table<O> child, ForeignKey<O, ServiceTechnicianRecord> key) {
        super(child, key, SERVICE_TECHNICIAN);
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
        return Arrays.<Index>asList(Indexes.SERVICE_TECHNICIAN_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ServiceTechnicianRecord, Integer> getIdentity() {
        return Keys.IDENTITY_SERVICE_TECHNICIAN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ServiceTechnicianRecord> getPrimaryKey() {
        return Keys.KEY_B2C_SERVICE_TECHNICIAN_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ServiceTechnicianRecord>> getKeys() {
        return Arrays.<UniqueKey<ServiceTechnicianRecord>>asList(Keys.KEY_B2C_SERVICE_TECHNICIAN_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceTechnician as(String alias) {
        return new ServiceTechnician(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceTechnician as(Name alias) {
        return new ServiceTechnician(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ServiceTechnician rename(String name) {
        return new ServiceTechnician(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ServiceTechnician rename(Name name) {
        return new ServiceTechnician(name, null);
    }
}
