/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables;


import com.vpu.mp.db.shop.Indexes;
import com.vpu.mp.db.shop.Keys;
import com.vpu.mp.db.shop.MiniShop_471752;
import com.vpu.mp.db.shop.tables.records.CardOrderRecord;

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
 * 会员卡订单表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CardOrder extends TableImpl<CardOrderRecord> {

    private static final long serialVersionUID = 1680586282;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_card_order</code>
     */
    public static final CardOrder CARD_ORDER = new CardOrder();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CardOrderRecord> getRecordType() {
        return CardOrderRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_card_order.order_id</code>. 订单id
     */
    public final TableField<CardOrderRecord, Integer> ORDER_ID = createField("order_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "订单id");

    /**
     * The column <code>mini_shop_471752.b2c_card_order.card_id</code>. 会云卡id
     */
    public final TableField<CardOrderRecord, Integer> CARD_ID = createField("card_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "会云卡id");

    /**
     * The column <code>mini_shop_471752.b2c_card_order.card_no</code>. 会员卡NO
     */
    public final TableField<CardOrderRecord, String> CARD_NO = createField("card_no", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false).defaultValue(DSL.inline("'0'", org.jooq.impl.SQLDataType.VARCHAR)), this, "会员卡NO");

    /**
     * The column <code>mini_shop_471752.b2c_card_order.order_sn</code>. 订单编号
     */
    public final TableField<CardOrderRecord, String> ORDER_SN = createField("order_sn", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false).defaultValue(DSL.inline("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "订单编号");

    /**
     * The column <code>mini_shop_471752.b2c_card_order.user_id</code>. 用户id
     */
    public final TableField<CardOrderRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "用户id");

    /**
     * The column <code>mini_shop_471752.b2c_card_order.order_status</code>. 订单状态
     */
    public final TableField<CardOrderRecord, Byte> ORDER_STATUS = createField("order_status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "订单状态");

    /**
     * The column <code>mini_shop_471752.b2c_card_order.invoice_id</code>. 发票id
     */
    public final TableField<CardOrderRecord, Integer> INVOICE_ID = createField("invoice_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "发票id");

    /**
     * The column <code>mini_shop_471752.b2c_card_order.invoice_detail</code>. 发票内容：json存储
     */
    public final TableField<CardOrderRecord, String> INVOICE_DETAIL = createField("invoice_detail", org.jooq.impl.SQLDataType.CLOB.defaultValue(DSL.inline("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "发票内容：json存储");

    /**
     * The column <code>mini_shop_471752.b2c_card_order.add_message</code>. 客户留言
     */
    public final TableField<CardOrderRecord, String> ADD_MESSAGE = createField("add_message", org.jooq.impl.SQLDataType.VARCHAR(191).defaultValue(DSL.inline("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "客户留言");

    /**
     * The column <code>mini_shop_471752.b2c_card_order.pay_code</code>. 支付代号
     */
    public final TableField<CardOrderRecord, String> PAY_CODE = createField("pay_code", org.jooq.impl.SQLDataType.VARCHAR(30).defaultValue(DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "支付代号");

    /**
     * The column <code>mini_shop_471752.b2c_card_order.pay_name</code>. 支付名称
     */
    public final TableField<CardOrderRecord, String> PAY_NAME = createField("pay_name", org.jooq.impl.SQLDataType.VARCHAR(120).defaultValue(DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "支付名称");

    /**
     * The column <code>mini_shop_471752.b2c_card_order.prepay_id</code>. 微信支付Id，用于发送模板消息
     */
    public final TableField<CardOrderRecord, String> PREPAY_ID = createField("prepay_id", org.jooq.impl.SQLDataType.VARCHAR(191).defaultValue(DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "微信支付Id，用于发送模板消息");

    /**
     * The column <code>mini_shop_471752.b2c_card_order.pay_sn</code>. 支付流水号
     */
    public final TableField<CardOrderRecord, String> PAY_SN = createField("pay_sn", org.jooq.impl.SQLDataType.VARCHAR(32).defaultValue(DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "支付流水号");

    /**
     * The column <code>mini_shop_471752.b2c_card_order.money_paid</code>. 订单应付金额
     */
    public final TableField<CardOrderRecord, BigDecimal> MONEY_PAID = createField("money_paid", org.jooq.impl.SQLDataType.DECIMAL(10, 2).defaultValue(DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "订单应付金额");

    /**
     * The column <code>mini_shop_471752.b2c_card_order.use_account</code>. 用户消费余额
     */
    public final TableField<CardOrderRecord, BigDecimal> USE_ACCOUNT = createField("use_account", org.jooq.impl.SQLDataType.DECIMAL(10, 2).defaultValue(DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "用户消费余额");

    /**
     * The column <code>mini_shop_471752.b2c_card_order.use_score</code>. 用户消费余额
     */
    public final TableField<CardOrderRecord, BigDecimal> USE_SCORE = createField("use_score", org.jooq.impl.SQLDataType.DECIMAL(10, 2).defaultValue(DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "用户消费余额");

    /**
     * The column <code>mini_shop_471752.b2c_card_order.order_amount</code>. 订单总金额
     */
    public final TableField<CardOrderRecord, BigDecimal> ORDER_AMOUNT = createField("order_amount", org.jooq.impl.SQLDataType.DECIMAL(10, 2).defaultValue(DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "订单总金额");

    /**
     * The column <code>mini_shop_471752.b2c_card_order.add_time</code>. 订单提交时间
     */
    public final TableField<CardOrderRecord, Timestamp> ADD_TIME = createField("add_time", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(DSL.field("current_timestamp()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "订单提交时间");

    /**
     * The column <code>mini_shop_471752.b2c_card_order.pay_time</code>. 支付时间
     */
    public final TableField<CardOrderRecord, Timestamp> PAY_TIME = createField("pay_time", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(DSL.inline("NULL", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "支付时间");

    /**
     * The column <code>mini_shop_471752.b2c_card_order.seller_remark</code>. 卖家备注
     */
    public final TableField<CardOrderRecord, String> SELLER_REMARK = createField("seller_remark", org.jooq.impl.SQLDataType.VARCHAR(512).defaultValue(DSL.inline("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "卖家备注");

    /**
     * The column <code>mini_shop_471752.b2c_card_order.star_flag</code>. 标星订单：0 未标星 1 标星
     */
    public final TableField<CardOrderRecord, Byte> STAR_FLAG = createField("star_flag", org.jooq.impl.SQLDataType.TINYINT.defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "标星订单：0 未标星 1 标星");

    /**
     * The column <code>mini_shop_471752.b2c_card_order.del_flag</code>. 删除
     */
    public final TableField<CardOrderRecord, Byte> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.TINYINT.defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "删除");

    /**
     * The column <code>mini_shop_471752.b2c_card_order.ali_trade_no</code>. 支付宝交易单号
     */
    public final TableField<CardOrderRecord, String> ALI_TRADE_NO = createField("ali_trade_no", org.jooq.impl.SQLDataType.VARCHAR(60).defaultValue(DSL.inline("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "支付宝交易单号");

    /**
     * The column <code>mini_shop_471752.b2c_card_order.order_status_name</code>. 订单状态名称
     */
    public final TableField<CardOrderRecord, String> ORDER_STATUS_NAME = createField("order_status_name", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false).defaultValue(DSL.inline("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "订单状态名称");

    /**
     * The column <code>mini_shop_471752.b2c_card_order.return_flag</code>. 0:未申请退款，1：退款失败，2：退款成功
     */
    public final TableField<CardOrderRecord, Byte> RETURN_FLAG = createField("return_flag", org.jooq.impl.SQLDataType.TINYINT.defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "0:未申请退款，1：退款失败，2：退款成功");

    /**
     * The column <code>mini_shop_471752.b2c_card_order.return_score</code>. 积分抵扣金额
     */
    public final TableField<CardOrderRecord, BigDecimal> RETURN_SCORE = createField("return_score", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false).defaultValue(DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "积分抵扣金额");

    /**
     * The column <code>mini_shop_471752.b2c_card_order.return_account</code>. 退款余额
     */
    public final TableField<CardOrderRecord, BigDecimal> RETURN_ACCOUNT = createField("return_account", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false).defaultValue(DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "退款余额");

    /**
     * The column <code>mini_shop_471752.b2c_card_order.return_money</code>. 退款余额
     */
    public final TableField<CardOrderRecord, BigDecimal> RETURN_MONEY = createField("return_money", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false).defaultValue(DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "退款余额");

    /**
     * The column <code>mini_shop_471752.b2c_card_order.return_time</code>. 订单退款时间
     */
    public final TableField<CardOrderRecord, Timestamp> RETURN_TIME = createField("return_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(DSL.field("current_timestamp()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "订单退款时间");

    /**
     * The column <code>mini_shop_471752.b2c_card_order.order_action</code>. 订单类型：1 会员卡订单 2 优惠券订单
     */
    public final TableField<CardOrderRecord, Byte> ORDER_ACTION = createField("order_action", org.jooq.impl.SQLDataType.TINYINT.defaultValue(DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "订单类型：1 会员卡订单 2 优惠券订单");

    /**
     * The column <code>mini_shop_471752.b2c_card_order.member_card_balance</code>. 会员卡消费
     */
    public final TableField<CardOrderRecord, BigDecimal> MEMBER_CARD_BALANCE = createField("member_card_balance", org.jooq.impl.SQLDataType.DECIMAL(10, 2).defaultValue(DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "会员卡消费");

    /**
     * The column <code>mini_shop_471752.b2c_card_order.return_card_balance</code>. 会员卡退款
     */
    public final TableField<CardOrderRecord, BigDecimal> RETURN_CARD_BALANCE = createField("return_card_balance", org.jooq.impl.SQLDataType.DECIMAL(10, 2).defaultValue(DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "会员卡退款");

    /**
     * The column <code>mini_shop_471752.b2c_card_order.still_send_flag</code>. 退款完成厚是否继续发放优惠券（优惠礼包订单） 1：继续发放，0：停止发放
     */
    public final TableField<CardOrderRecord, Byte> STILL_SEND_FLAG = createField("still_send_flag", org.jooq.impl.SQLDataType.TINYINT.defaultValue(DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "退款完成厚是否继续发放优惠券（优惠礼包订单） 1：继续发放，0：停止发放");

    /**
     * The column <code>mini_shop_471752.b2c_card_order.score_proportion</code>. 积分比例
     */
    public final TableField<CardOrderRecord, Integer> SCORE_PROPORTION = createField("score_proportion", org.jooq.impl.SQLDataType.INTEGER.defaultValue(DSL.inline("100", org.jooq.impl.SQLDataType.INTEGER)), this, "积分比例");

    /**
     * The column <code>mini_shop_471752.b2c_card_order.create_time</code>. 创建时间
     */
    public final TableField<CardOrderRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(DSL.field("current_timestamp()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>mini_shop_471752.b2c_card_order.update_time</code>. 更新时间
     */
    public final TableField<CardOrderRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(DSL.field("current_timestamp()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "更新时间");

    /**
     * Create a <code>mini_shop_471752.b2c_card_order</code> table reference
     */
    public CardOrder() {
        this(DSL.name("b2c_card_order"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_card_order</code> table reference
     */
    public CardOrder(String alias) {
        this(DSL.name(alias), CARD_ORDER);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_card_order</code> table reference
     */
    public CardOrder(Name alias) {
        this(alias, CARD_ORDER);
    }

    private CardOrder(Name alias, Table<CardOrderRecord> aliased) {
        this(alias, aliased, null);
    }

    private CardOrder(Name alias, Table<CardOrderRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("会员卡订单表"));
    }

    public <O extends Record> CardOrder(Table<O> child, ForeignKey<O, CardOrderRecord> key) {
        super(child, key, CARD_ORDER);
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
        return Arrays.<Index>asList(Indexes.CARD_ORDER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CardOrderRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CARD_ORDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CardOrderRecord> getPrimaryKey() {
        return Keys.KEY_B2C_CARD_ORDER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CardOrderRecord>> getKeys() {
        return Arrays.<UniqueKey<CardOrderRecord>>asList(Keys.KEY_B2C_CARD_ORDER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CardOrder as(String alias) {
        return new CardOrder(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CardOrder as(Name alias) {
        return new CardOrder(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CardOrder rename(String name) {
        return new CardOrder(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CardOrder rename(Name name) {
        return new CardOrder(name, null);
    }
}