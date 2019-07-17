/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables;


import com.vpu.mp.db.shop.Indexes;
import com.vpu.mp.db.shop.Keys;
import com.vpu.mp.db.shop.MiniShop_471752;
import com.vpu.mp.db.shop.tables.records.ReturnOrderRecord;

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
public class ReturnOrder extends TableImpl<ReturnOrderRecord> {

    private static final long serialVersionUID = 42570126;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_return_order</code>
     */
    public static final ReturnOrder RETURN_ORDER = new ReturnOrder();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ReturnOrderRecord> getRecordType() {
        return ReturnOrderRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_return_order.ret_id</code>.
     */
    public final TableField<ReturnOrderRecord, Integer> RET_ID = createField("ret_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_return_order.order_id</code>.
     */
    public final TableField<ReturnOrderRecord, Integer> ORDER_ID = createField("order_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_return_order.order_sn</code>.
     */
    public final TableField<ReturnOrderRecord, String> ORDER_SN = createField("order_sn", org.jooq.impl.SQLDataType.VARCHAR(30).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_return_order.return_order_sn</code>. 退款单号
     */
    public final TableField<ReturnOrderRecord, String> RETURN_ORDER_SN = createField("return_order_sn", org.jooq.impl.SQLDataType.VARCHAR(30).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "退款单号");

    /**
     * The column <code>mini_shop_471752.b2c_return_order.shop_id</code>. 店铺id
     */
    public final TableField<ReturnOrderRecord, Integer> SHOP_ID = createField("shop_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "店铺id");

    /**
     * The column <code>mini_shop_471752.b2c_return_order.user_id</code>.
     */
    public final TableField<ReturnOrderRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_return_order.goods_id</code>.
     */
    public final TableField<ReturnOrderRecord, Integer> GOODS_ID = createField("goods_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_return_order.refund_status</code>. 1是审核中，2是通过审核，3退货没通过审核，4买家提交物流 或 仅退款申请，5：退款退货成功，6是拒绝退款退货
     */
    public final TableField<ReturnOrderRecord, Byte> REFUND_STATUS = createField("refund_status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "1是审核中，2是通过审核，3退货没通过审核，4买家提交物流 或 仅退款申请，5：退款退货成功，6是拒绝退款退货");

    /**
     * The column <code>mini_shop_471752.b2c_return_order.money</code>. 退款商品金额
     */
    public final TableField<ReturnOrderRecord, BigDecimal> MONEY = createField("money", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "退款商品金额");

    /**
     * The column <code>mini_shop_471752.b2c_return_order.shipping_fee</code>. 退运费金额
     */
    public final TableField<ReturnOrderRecord, BigDecimal> SHIPPING_FEE = createField("shipping_fee", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "退运费金额");

    /**
     * The column <code>mini_shop_471752.b2c_return_order.return_type</code>. 退款类型,0:只退款，1:退货又退款
     */
    public final TableField<ReturnOrderRecord, Byte> RETURN_TYPE = createField("return_type", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "退款类型,0:只退款，1:退货又退款");

    /**
     * The column <code>mini_shop_471752.b2c_return_order.reason</code>. 退款理由
     */
    public final TableField<ReturnOrderRecord, String> REASON = createField("reason", org.jooq.impl.SQLDataType.VARCHAR(191).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "退款理由");

    /**
     * The column <code>mini_shop_471752.b2c_return_order.return_desc</code>. 退款说明
     */
    public final TableField<ReturnOrderRecord, String> RETURN_DESC = createField("return_desc", org.jooq.impl.SQLDataType.CLOB, this, "退款说明");

    /**
     * The column <code>mini_shop_471752.b2c_return_order.shipping_type</code>. 快递类型
     */
    public final TableField<ReturnOrderRecord, String> SHIPPING_TYPE = createField("shipping_type", org.jooq.impl.SQLDataType.VARCHAR(191).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "快递类型");

    /**
     * The column <code>mini_shop_471752.b2c_return_order.shipping_no</code>. 快递单号
     */
    public final TableField<ReturnOrderRecord, String> SHIPPING_NO = createField("shipping_no", org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "快递单号");

    /**
     * The column <code>mini_shop_471752.b2c_return_order.goods_images</code>. 商品图片
     */
    public final TableField<ReturnOrderRecord, String> GOODS_IMAGES = createField("goods_images", org.jooq.impl.SQLDataType.CLOB, this, "商品图片");

    /**
     * The column <code>mini_shop_471752.b2c_return_order.voucher_images</code>. 凭证图片
     */
    public final TableField<ReturnOrderRecord, String> VOUCHER_IMAGES = createField("voucher_images", org.jooq.impl.SQLDataType.CLOB, this, "凭证图片");

    /**
     * The column <code>mini_shop_471752.b2c_return_order.phone</code>. 电话号码
     */
    public final TableField<ReturnOrderRecord, String> PHONE = createField("phone", org.jooq.impl.SQLDataType.VARCHAR(12).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "电话号码");

    /**
     * The column <code>mini_shop_471752.b2c_return_order.apply_time</code>. 退货且退货提交审核时间，对应refund_status=1
     */
    public final TableField<ReturnOrderRecord, Timestamp> APPLY_TIME = createField("apply_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "退货且退货提交审核时间，对应refund_status=1");

    /**
     * The column <code>mini_shop_471752.b2c_return_order.apply_pass_time</code>. 审核通过时间，对应refund_status=2
     */
    public final TableField<ReturnOrderRecord, Timestamp> APPLY_PASS_TIME = createField("apply_pass_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "审核通过时间，对应refund_status=2");

    /**
     * The column <code>mini_shop_471752.b2c_return_order.apply_not_pass_time</code>. 审核未通过时间，对应refund_status=3
     */
    public final TableField<ReturnOrderRecord, Timestamp> APPLY_NOT_PASS_TIME = createField("apply_not_pass_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "审核未通过时间，对应refund_status=3");

    /**
     * The column <code>mini_shop_471752.b2c_return_order.shipping_or_refund_time</code>. 只退款时为退款申请时间，退货又退款时为提交物流信息时间，对应refund_status=4
     */
    public final TableField<ReturnOrderRecord, Timestamp> SHIPPING_OR_REFUND_TIME = createField("shipping_or_refund_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "只退款时为退款申请时间，退货又退款时为提交物流信息时间，对应refund_status=4");

    /**
     * The column <code>mini_shop_471752.b2c_return_order.refund_success_time</code>. 退款成功时间，对应refund_status=5
     */
    public final TableField<ReturnOrderRecord, Timestamp> REFUND_SUCCESS_TIME = createField("refund_success_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "退款成功时间，对应refund_status=5");

    /**
     * The column <code>mini_shop_471752.b2c_return_order.refund_refuse_time</code>. 退款拒绝时间，对应refund_status=6
     */
    public final TableField<ReturnOrderRecord, Timestamp> REFUND_REFUSE_TIME = createField("refund_refuse_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "退款拒绝时间，对应refund_status=6");

    /**
     * The column <code>mini_shop_471752.b2c_return_order.refund_cancel_time</code>. 退款撤销时间，对应refund_status=7
     */
    public final TableField<ReturnOrderRecord, Timestamp> REFUND_CANCEL_TIME = createField("refund_cancel_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "退款撤销时间，对应refund_status=7");

    /**
     * The column <code>mini_shop_471752.b2c_return_order.apply_not_pass_reason</code>. 审核未通过原因
     */
    public final TableField<ReturnOrderRecord, String> APPLY_NOT_PASS_REASON = createField("apply_not_pass_reason", org.jooq.impl.SQLDataType.VARCHAR(1000), this, "审核未通过原因");

    /**
     * The column <code>mini_shop_471752.b2c_return_order.refund_refuse_reason</code>. 退款拒绝原因
     */
    public final TableField<ReturnOrderRecord, String> REFUND_REFUSE_REASON = createField("refund_refuse_reason", org.jooq.impl.SQLDataType.VARCHAR(1000), this, "退款拒绝原因");

    /**
     * The column <code>mini_shop_471752.b2c_return_order.return_address</code>. 退货地址
     */
    public final TableField<ReturnOrderRecord, String> RETURN_ADDRESS = createField("return_address", org.jooq.impl.SQLDataType.VARCHAR(1000).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "退货地址");

    /**
     * The column <code>mini_shop_471752.b2c_return_order.merchant_telephone</code>. 商家电话
     */
    public final TableField<ReturnOrderRecord, String> MERCHANT_TELEPHONE = createField("merchant_telephone", org.jooq.impl.SQLDataType.VARCHAR(12).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "商家电话");

    /**
     * The column <code>mini_shop_471752.b2c_return_order.consignee</code>. 收货人
     */
    public final TableField<ReturnOrderRecord, String> CONSIGNEE = createField("consignee", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "收货人");

    /**
     * The column <code>mini_shop_471752.b2c_return_order.zip_code</code>. 邮编
     */
    public final TableField<ReturnOrderRecord, String> ZIP_CODE = createField("zip_code", org.jooq.impl.SQLDataType.VARCHAR(10).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "邮编");

    /**
     * The column <code>mini_shop_471752.b2c_return_order.create_time</code>.
     */
    public final TableField<ReturnOrderRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_return_order.update_time</code>. 最后修改时间
     */
    public final TableField<ReturnOrderRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "最后修改时间");

    /**
     * Create a <code>mini_shop_471752.b2c_return_order</code> table reference
     */
    public ReturnOrder() {
        this(DSL.name("b2c_return_order"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_return_order</code> table reference
     */
    public ReturnOrder(String alias) {
        this(DSL.name(alias), RETURN_ORDER);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_return_order</code> table reference
     */
    public ReturnOrder(Name alias) {
        this(alias, RETURN_ORDER);
    }

    private ReturnOrder(Name alias, Table<ReturnOrderRecord> aliased) {
        this(alias, aliased, null);
    }

    private ReturnOrder(Name alias, Table<ReturnOrderRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ReturnOrder(Table<O> child, ForeignKey<O, ReturnOrderRecord> key) {
        super(child, key, RETURN_ORDER);
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
        return Arrays.<Index>asList(Indexes.RETURN_ORDER_ORDER_SN, Indexes.RETURN_ORDER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ReturnOrderRecord, Integer> getIdentity() {
        return Keys.IDENTITY_RETURN_ORDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ReturnOrderRecord> getPrimaryKey() {
        return Keys.KEY_B2C_RETURN_ORDER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ReturnOrderRecord>> getKeys() {
        return Arrays.<UniqueKey<ReturnOrderRecord>>asList(Keys.KEY_B2C_RETURN_ORDER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReturnOrder as(String alias) {
        return new ReturnOrder(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReturnOrder as(Name alias) {
        return new ReturnOrder(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ReturnOrder rename(String name) {
        return new ReturnOrder(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ReturnOrder rename(Name name) {
        return new ReturnOrder(name, null);
    }
}
