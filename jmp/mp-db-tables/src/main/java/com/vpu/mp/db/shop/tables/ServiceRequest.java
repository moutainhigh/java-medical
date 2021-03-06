/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables;


import com.vpu.mp.db.shop.Indexes;
import com.vpu.mp.db.shop.Keys;
import com.vpu.mp.db.shop.MiniShop_471752;
import com.vpu.mp.db.shop.tables.records.ServiceRequestRecord;

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
public class ServiceRequest extends TableImpl<ServiceRequestRecord> {

    private static final long serialVersionUID = -1860899530;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_service_request</code>
     */
    public static final ServiceRequest SERVICE_REQUEST = new ServiceRequest();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ServiceRequestRecord> getRecordType() {
        return ServiceRequestRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_service_request.id</code>.
     */
    public final TableField<ServiceRequestRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_service_request.request_id</code>. 请求requestid
     */
    public final TableField<ServiceRequestRecord, String> REQUEST_ID = createField("request_id", org.jooq.impl.SQLDataType.VARCHAR(50), this, "请求requestid");

    /**
     * The column <code>mini_shop_471752.b2c_service_request.service_name</code>. 服务名
     */
    public final TableField<ServiceRequestRecord, String> SERVICE_NAME = createField("service_name", org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "服务名");

    /**
     * The column <code>mini_shop_471752.b2c_service_request.request_content</code>. 请求内容
     */
    public final TableField<ServiceRequestRecord, String> REQUEST_CONTENT = createField("request_content", org.jooq.impl.SQLDataType.CLOB, this, "请求内容");

    /**
     * The column <code>mini_shop_471752.b2c_service_request.request_time</code>. 请求时间
     */
    public final TableField<ServiceRequestRecord, Timestamp> REQUEST_TIME = createField("request_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "请求时间");

    /**
     * The column <code>mini_shop_471752.b2c_service_request.response_time</code>. 响应时间
     */
    public final TableField<ServiceRequestRecord, Timestamp> RESPONSE_TIME = createField("response_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "响应时间");

    /**
     * The column <code>mini_shop_471752.b2c_service_request.response_content</code>. 响应内容
     */
    public final TableField<ServiceRequestRecord, String> RESPONSE_CONTENT = createField("response_content", org.jooq.impl.SQLDataType.CLOB, this, "响应内容");

    /**
     * The column <code>mini_shop_471752.b2c_service_request.ip</code>. 请求ip
     */
    public final TableField<ServiceRequestRecord, String> IP = createField("ip", org.jooq.impl.SQLDataType.VARCHAR(100), this, "请求ip");

    /**
     * The column <code>mini_shop_471752.b2c_service_request.create_time</code>.
     */
    public final TableField<ServiceRequestRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_service_request.update_time</code>. 最后修改时间
     */
    public final TableField<ServiceRequestRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "最后修改时间");

    /**
     * Create a <code>mini_shop_471752.b2c_service_request</code> table reference
     */
    public ServiceRequest() {
        this(DSL.name("b2c_service_request"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_service_request</code> table reference
     */
    public ServiceRequest(String alias) {
        this(DSL.name(alias), SERVICE_REQUEST);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_service_request</code> table reference
     */
    public ServiceRequest(Name alias) {
        this(alias, SERVICE_REQUEST);
    }

    private ServiceRequest(Name alias, Table<ServiceRequestRecord> aliased) {
        this(alias, aliased, null);
    }

    private ServiceRequest(Name alias, Table<ServiceRequestRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ServiceRequest(Table<O> child, ForeignKey<O, ServiceRequestRecord> key) {
        super(child, key, SERVICE_REQUEST);
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
        return Arrays.<Index>asList(Indexes.SERVICE_REQUEST_PRIMARY, Indexes.SERVICE_REQUEST_REQUEST_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ServiceRequestRecord, Long> getIdentity() {
        return Keys.IDENTITY_SERVICE_REQUEST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ServiceRequestRecord> getPrimaryKey() {
        return Keys.KEY_B2C_SERVICE_REQUEST_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ServiceRequestRecord>> getKeys() {
        return Arrays.<UniqueKey<ServiceRequestRecord>>asList(Keys.KEY_B2C_SERVICE_REQUEST_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceRequest as(String alias) {
        return new ServiceRequest(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceRequest as(Name alias) {
        return new ServiceRequest(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ServiceRequest rename(String name) {
        return new ServiceRequest(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ServiceRequest rename(Name name) {
        return new ServiceRequest(name, null);
    }
}
