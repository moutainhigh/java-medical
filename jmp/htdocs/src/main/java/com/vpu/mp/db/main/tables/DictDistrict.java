/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.main.tables;


import com.vpu.mp.db.main.Indexes;
import com.vpu.mp.db.main.Keys;
import com.vpu.mp.db.main.MiniMain;
import com.vpu.mp.db.main.tables.records.DictDistrictRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class DictDistrict extends TableImpl<DictDistrictRecord> {

    private static final long serialVersionUID = -767337060;

    /**
     * The reference instance of <code>mini_main.b2c_dict_district</code>
     */
    public static final DictDistrict DICT_DISTRICT = new DictDistrict();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DictDistrictRecord> getRecordType() {
        return DictDistrictRecord.class;
    }

    /**
     * The column <code>mini_main.b2c_dict_district.district_id</code>.
     */
    public final TableField<DictDistrictRecord, Integer> DISTRICT_ID = createField("district_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>mini_main.b2c_dict_district.name</code>.
     */
    public final TableField<DictDistrictRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(40).nullable(false), this, "");

    /**
     * The column <code>mini_main.b2c_dict_district.city_id</code>.
     */
    public final TableField<DictDistrictRecord, Integer> CITY_ID = createField("city_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>mini_main.b2c_dict_district.postcode</code>.
     */
    public final TableField<DictDistrictRecord, String> POSTCODE = createField("postcode", org.jooq.impl.SQLDataType.VARCHAR(20).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mini_main.b2c_dict_district.pinyin</code>.
     */
    public final TableField<DictDistrictRecord, String> PINYIN = createField("pinyin", org.jooq.impl.SQLDataType.VARCHAR(60).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mini_main.b2c_dict_district.modified</code>.
     */
    public final TableField<DictDistrictRecord, Timestamp> MODIFIED = createField("modified", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>mini_main.b2c_dict_district</code> table reference
     */
    public DictDistrict() {
        this(DSL.name("b2c_dict_district"), null);
    }

    /**
     * Create an aliased <code>mini_main.b2c_dict_district</code> table reference
     */
    public DictDistrict(String alias) {
        this(DSL.name(alias), DICT_DISTRICT);
    }

    /**
     * Create an aliased <code>mini_main.b2c_dict_district</code> table reference
     */
    public DictDistrict(Name alias) {
        this(alias, DICT_DISTRICT);
    }

    private DictDistrict(Name alias, Table<DictDistrictRecord> aliased) {
        this(alias, aliased, null);
    }

    private DictDistrict(Name alias, Table<DictDistrictRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> DictDistrict(Table<O> child, ForeignKey<O, DictDistrictRecord> key) {
        super(child, key, DICT_DISTRICT);
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
        return Arrays.<Index>asList(Indexes.DICT_DISTRICT_CITY_ID, Indexes.DICT_DISTRICT_IX_DICT_DISTRICT_MODIFIED, Indexes.DICT_DISTRICT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DictDistrictRecord> getPrimaryKey() {
        return Keys.KEY_B2C_DICT_DISTRICT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DictDistrictRecord>> getKeys() {
        return Arrays.<UniqueKey<DictDistrictRecord>>asList(Keys.KEY_B2C_DICT_DISTRICT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictDistrict as(String alias) {
        return new DictDistrict(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictDistrict as(Name alias) {
        return new DictDistrict(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DictDistrict rename(String name) {
        return new DictDistrict(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DictDistrict rename(Name name) {
        return new DictDistrict(name, null);
    }
}
