/*
 * This file is generated by jOOQ.
 */
package com.vpu.jmd.table.main.tables;



import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import com.vpu.jmd.table.main.Indexes;
import com.vpu.jmd.table.main.MiniMain;
import com.vpu.jmd.table.main.tables.records.ThirdPartyServicesRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
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
public class ThirdPartyServices extends TableImpl<ThirdPartyServicesRecord> {

    private static final long serialVersionUID = 422953507;

    /**
     * The reference instance of <code>mini_main.b2c_third_party_services</code>
     */
    public static final ThirdPartyServices THIRD_PARTY_SERVICES = new ThirdPartyServices();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ThirdPartyServicesRecord> getRecordType() {
        return ThirdPartyServicesRecord.class;
    }

    /**
     * The column <code>mini_main.b2c_third_party_services.shop_id</code>. 店铺ID
     */
    public final TableField<ThirdPartyServicesRecord, Integer> SHOP_ID = createField("shop_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "店铺ID");

    /**
     * The column <code>mini_main.b2c_third_party_services.account_action</code>. 账号类型 1:主账号 2：子账号
     */
    public final TableField<ThirdPartyServicesRecord, Byte> ACCOUNT_ACTION = createField("account_action", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "账号类型 1:主账号 2：子账号");

    /**
     * The column <code>mini_main.b2c_third_party_services.account_id</code>. 账号ID
     */
    public final TableField<ThirdPartyServicesRecord, Integer> ACCOUNT_ID = createField("account_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "账号ID");

    /**
     * The column <code>mini_main.b2c_third_party_services.service_action</code>. 服务类型 1:订单提醒
     */
    public final TableField<ThirdPartyServicesRecord, Byte> SERVICE_ACTION = createField("service_action", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "服务类型 1:订单提醒");

    /**
     * The column <code>mini_main.b2c_third_party_services.service_detail</code>. 服务明细
     */
    public final TableField<ThirdPartyServicesRecord, String> SERVICE_DETAIL = createField("service_detail", org.jooq.impl.SQLDataType.CLOB, this, "服务明细");

    /**
     * The column <code>mini_main.b2c_third_party_services.add_time</code>. 操作时间
     */
    public final TableField<ThirdPartyServicesRecord, Timestamp> ADD_TIME = createField("add_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "操作时间");

    /**
     * Create a <code>mini_main.b2c_third_party_services</code> table reference
     */
    public ThirdPartyServices() {
        this(DSL.name("b2c_third_party_services"), null);
    }

    /**
     * Create an aliased <code>mini_main.b2c_third_party_services</code> table reference
     */
    public ThirdPartyServices(String alias) {
        this(DSL.name(alias), THIRD_PARTY_SERVICES);
    }

    /**
     * Create an aliased <code>mini_main.b2c_third_party_services</code> table reference
     */
    public ThirdPartyServices(Name alias) {
        this(alias, THIRD_PARTY_SERVICES);
    }

    private ThirdPartyServices(Name alias, Table<ThirdPartyServicesRecord> aliased) {
        this(alias, aliased, null);
    }

    private ThirdPartyServices(Name alias, Table<ThirdPartyServicesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ThirdPartyServices(Table<O> child, ForeignKey<O, ThirdPartyServicesRecord> key) {
        super(child, key, THIRD_PARTY_SERVICES);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return MiniMain.MINI_MAIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.THIRD_PARTY_SERVICES_ACCOUNT_ID, Indexes.THIRD_PARTY_SERVICES_ACCOUNT_TYPE, Indexes.THIRD_PARTY_SERVICES_SHOP_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThirdPartyServices as(String alias) {
        return new ThirdPartyServices(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThirdPartyServices as(Name alias) {
        return new ThirdPartyServices(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ThirdPartyServices rename(String name) {
        return new ThirdPartyServices(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ThirdPartyServices rename(Name name) {
        return new ThirdPartyServices(name, null);
    }
}