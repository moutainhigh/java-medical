/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables;


import com.vpu.mp.db.shop.Indexes;
import com.vpu.mp.db.shop.Keys;
import com.vpu.mp.db.shop.MiniShop_471752;
import com.vpu.mp.db.shop.tables.records.OrderMedicalHistoryRecord;

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
 * 患者订单历史病例表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OrderMedicalHistory extends TableImpl<OrderMedicalHistoryRecord> {

    private static final long serialVersionUID = -1139368520;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_order_medical_history</code>
     */
    public static final OrderMedicalHistory ORDER_MEDICAL_HISTORY = new OrderMedicalHistory();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OrderMedicalHistoryRecord> getRecordType() {
        return OrderMedicalHistoryRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_order_medical_history.id</code>.
     */
    public final TableField<OrderMedicalHistoryRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_order_medical_history.order_id</code>. 订单id
     */
    public final TableField<OrderMedicalHistoryRecord, Integer> ORDER_ID = createField("order_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "订单id");

    /**
     * The column <code>mini_shop_471752.b2c_order_medical_history.patient_id</code>. 患者id
     */
    public final TableField<OrderMedicalHistoryRecord, Integer> PATIENT_ID = createField("patient_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "患者id");

    /**
     * The column <code>mini_shop_471752.b2c_order_medical_history.patient_name</code>. 患者姓名
     */
    public final TableField<OrderMedicalHistoryRecord, String> PATIENT_NAME = createField("patient_name", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "患者姓名");

    /**
     * The column <code>mini_shop_471752.b2c_order_medical_history.sex</code>. 0男1女
     */
    public final TableField<OrderMedicalHistoryRecord, Byte> SEX = createField("sex", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "0男1女");

    /**
     * The column <code>mini_shop_471752.b2c_order_medical_history.age</code>. 年龄
     */
    public final TableField<OrderMedicalHistoryRecord, Integer> AGE = createField("age", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "年龄");

    /**
     * The column <code>mini_shop_471752.b2c_order_medical_history.patient_complain</code>. 患者主诉
     */
    public final TableField<OrderMedicalHistoryRecord, String> PATIENT_COMPLAIN = createField("patient_complain", org.jooq.impl.SQLDataType.VARCHAR(512).nullable(false).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "患者主诉");

    /**
     * The column <code>mini_shop_471752.b2c_order_medical_history.disease_history</code>. 历史诊断
     */
    public final TableField<OrderMedicalHistoryRecord, String> DISEASE_HISTORY = createField("disease_history", org.jooq.impl.SQLDataType.VARCHAR(1000).nullable(false).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "历史诊断");

    /**
     * The column <code>mini_shop_471752.b2c_order_medical_history.allergy_history</code>. 过敏史
     */
    public final TableField<OrderMedicalHistoryRecord, String> ALLERGY_HISTORY = createField("allergy_history", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "过敏史");

    /**
     * The column <code>mini_shop_471752.b2c_order_medical_history.family_disease_history</code>. 家族病史
     */
    public final TableField<OrderMedicalHistoryRecord, String> FAMILY_DISEASE_HISTORY = createField("family_disease_history", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "家族病史");

    /**
     * The column <code>mini_shop_471752.b2c_order_medical_history.describe</code>. 自我描述
     */
    public final TableField<OrderMedicalHistoryRecord, String> DESCRIBE = createField("describe", org.jooq.impl.SQLDataType.VARCHAR(512).nullable(false).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "自我描述");

    /**
     * The column <code>mini_shop_471752.b2c_order_medical_history.gestation_type</code>. 妊娠哺乳状态:0:未知，1：无，2：备孕中，3：怀孕中，4：正在哺乳
     */
    public final TableField<OrderMedicalHistoryRecord, Byte> GESTATION_TYPE = createField("gestation_type", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "妊娠哺乳状态:0:未知，1：无，2：备孕中，3：怀孕中，4：正在哺乳");

    /**
     * The column <code>mini_shop_471752.b2c_order_medical_history.kidney_function_ok</code>. 肾功能:0:未知，1：正常，2：异常
     */
    public final TableField<OrderMedicalHistoryRecord, Byte> KIDNEY_FUNCTION_OK = createField("kidney_function_ok", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "肾功能:0:未知，1：正常，2：异常");

    /**
     * The column <code>mini_shop_471752.b2c_order_medical_history.liver_function_ok</code>. 肝功能:0:未知，1：正常，2：异常
     */
    public final TableField<OrderMedicalHistoryRecord, Byte> LIVER_FUNCTION_OK = createField("liver_function_ok", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "肝功能:0:未知，1：正常，2：异常");

    /**
     * The column <code>mini_shop_471752.b2c_order_medical_history.images_list</code>. 图片地址
     */
    public final TableField<OrderMedicalHistoryRecord, String> IMAGES_LIST = createField("images_list", org.jooq.impl.SQLDataType.VARCHAR(512).nullable(false).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "图片地址");

    /**
     * The column <code>mini_shop_471752.b2c_order_medical_history.is_delete</code>. 删除
     */
    public final TableField<OrderMedicalHistoryRecord, Byte> IS_DELETE = createField("is_delete", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "删除");

    /**
     * The column <code>mini_shop_471752.b2c_order_medical_history.create_time</code>.
     */
    public final TableField<OrderMedicalHistoryRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_order_medical_history.update_time</code>. 最后修改时间
     */
    public final TableField<OrderMedicalHistoryRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "最后修改时间");

    /**
     * Create a <code>mini_shop_471752.b2c_order_medical_history</code> table reference
     */
    public OrderMedicalHistory() {
        this(DSL.name("b2c_order_medical_history"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_order_medical_history</code> table reference
     */
    public OrderMedicalHistory(String alias) {
        this(DSL.name(alias), ORDER_MEDICAL_HISTORY);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_order_medical_history</code> table reference
     */
    public OrderMedicalHistory(Name alias) {
        this(alias, ORDER_MEDICAL_HISTORY);
    }

    private OrderMedicalHistory(Name alias, Table<OrderMedicalHistoryRecord> aliased) {
        this(alias, aliased, null);
    }

    private OrderMedicalHistory(Name alias, Table<OrderMedicalHistoryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("患者订单历史病例表"));
    }

    public <O extends Record> OrderMedicalHistory(Table<O> child, ForeignKey<O, OrderMedicalHistoryRecord> key) {
        super(child, key, ORDER_MEDICAL_HISTORY);
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
        return Arrays.<Index>asList(Indexes.ORDER_MEDICAL_HISTORY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<OrderMedicalHistoryRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ORDER_MEDICAL_HISTORY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<OrderMedicalHistoryRecord> getPrimaryKey() {
        return Keys.KEY_B2C_ORDER_MEDICAL_HISTORY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<OrderMedicalHistoryRecord>> getKeys() {
        return Arrays.<UniqueKey<OrderMedicalHistoryRecord>>asList(Keys.KEY_B2C_ORDER_MEDICAL_HISTORY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderMedicalHistory as(String alias) {
        return new OrderMedicalHistory(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderMedicalHistory as(Name alias) {
        return new OrderMedicalHistory(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public OrderMedicalHistory rename(String name) {
        return new OrderMedicalHistory(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public OrderMedicalHistory rename(Name name) {
        return new OrderMedicalHistory(name, null);
    }
}
