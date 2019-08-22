/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables.records;


import com.vpu.mp.db.shop.tables.VirtualOrder;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


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
public class VirtualOrderRecord extends UpdatableRecordImpl<VirtualOrderRecord> {

    private static final long serialVersionUID = -441607242;

    /**
     * Setter for <code>mini_shop_471752.b2c_virtual_order.order_id</code>. 订单id
     */
    public void setOrderId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_virtual_order.order_id</code>. 订单id
     */
    public Integer getOrderId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_virtual_order.order_sn</code>. 订单编号
     */
    public void setOrderSn(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_virtual_order.order_sn</code>. 订单编号
     */
    public String getOrderSn() {
        return (String) get(1);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_virtual_order.user_id</code>. 用户id
     */
    public void setUserId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_virtual_order.user_id</code>. 用户id
     */
    public Integer getUserId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_virtual_order.order_status</code>. 订单状态
     */
    public void setOrderStatus(Byte value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_virtual_order.order_status</code>. 订单状态
     */
    public Byte getOrderStatus() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_virtual_order.order_status_name</code>. 订单状态名称
     */
    public void setOrderStatusName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_virtual_order.order_status_name</code>. 订单状态名称
     */
    public String getOrderStatusName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_virtual_order.invoice_id</code>. 发票id
     */
    public void setInvoiceId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_virtual_order.invoice_id</code>. 发票id
     */
    public Integer getInvoiceId() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_virtual_order.invoice_detail</code>. 发票内容：json存储
     */
    public void setInvoiceDetail(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_virtual_order.invoice_detail</code>. 发票内容：json存储
     */
    public String getInvoiceDetail() {
        return (String) get(6);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_virtual_order.add_message</code>. 客户留言
     */
    public void setAddMessage(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_virtual_order.add_message</code>. 客户留言
     */
    public String getAddMessage() {
        return (String) get(7);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_virtual_order.pay_code</code>. 支付代号
     */
    public void setPayCode(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_virtual_order.pay_code</code>. 支付代号
     */
    public String getPayCode() {
        return (String) get(8);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_virtual_order.pay_name</code>. 支付名称
     */
    public void setPayName(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_virtual_order.pay_name</code>. 支付名称
     */
    public String getPayName() {
        return (String) get(9);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_virtual_order.prepay_id</code>. 微信支付id，用于发送模板消息
     */
    public void setPrepayId(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_virtual_order.prepay_id</code>. 微信支付id，用于发送模板消息
     */
    public String getPrepayId() {
        return (String) get(10);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_virtual_order.pay_sn</code>. 支付流水号
     */
    public void setPaySn(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_virtual_order.pay_sn</code>. 支付流水号
     */
    public String getPaySn() {
        return (String) get(11);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_virtual_order.money_paid</code>. 用户消费现金
     */
    public void setMoneyPaid(BigDecimal value) {
        set(12, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_virtual_order.money_paid</code>. 用户消费现金
     */
    public BigDecimal getMoneyPaid() {
        return (BigDecimal) get(12);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_virtual_order.use_account</code>. 用户消费余额
     */
    public void setUseAccount(BigDecimal value) {
        set(13, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_virtual_order.use_account</code>. 用户消费余额
     */
    public BigDecimal getUseAccount() {
        return (BigDecimal) get(13);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_virtual_order.use_score</code>. 用户消费积分
     */
    public void setUseScore(Integer value) {
        set(14, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_virtual_order.use_score</code>. 用户消费积分
     */
    public Integer getUseScore() {
        return (Integer) get(14);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_virtual_order.member_card_balance</code>. 会员卡消费金额
     */
    public void setMemberCardBalance(BigDecimal value) {
        set(15, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_virtual_order.member_card_balance</code>. 会员卡消费金额
     */
    public BigDecimal getMemberCardBalance() {
        return (BigDecimal) get(15);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_virtual_order.order_amount</code>. 订单总金额
     */
    public void setOrderAmount(BigDecimal value) {
        set(16, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_virtual_order.order_amount</code>. 订单总金额
     */
    public BigDecimal getOrderAmount() {
        return (BigDecimal) get(16);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_virtual_order.pay_time</code>. 支付时间
     */
    public void setPayTime(Timestamp value) {
        set(17, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_virtual_order.pay_time</code>. 支付时间
     */
    public Timestamp getPayTime() {
        return (Timestamp) get(17);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_virtual_order.seller_remark</code>. 卖家备注
     */
    public void setSellerRemark(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_virtual_order.seller_remark</code>. 卖家备注
     */
    public String getSellerRemark() {
        return (String) get(18);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_virtual_order.star_flag</code>. 标星订单：0 未标星 1 标星
     */
    public void setStarFlag(Byte value) {
        set(19, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_virtual_order.star_flag</code>. 标星订单：0 未标星 1 标星
     */
    public Byte getStarFlag() {
        return (Byte) get(19);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_virtual_order.del_flag</code>. 删除
     */
    public void setDelFlag(Byte value) {
        set(20, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_virtual_order.del_flag</code>. 删除
     */
    public Byte getDelFlag() {
        return (Byte) get(20);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_virtual_order.ali_trade_no</code>. 支付宝交易单号
     */
    public void setAliTradeNo(String value) {
        set(21, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_virtual_order.ali_trade_no</code>. 支付宝交易单号
     */
    public String getAliTradeNo() {
        return (String) get(21);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_virtual_order.return_flag</code>. 0:未申请退款，1：退款失败，2：退款成功
     */
    public void setReturnFlag(Byte value) {
        set(22, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_virtual_order.return_flag</code>. 0:未申请退款，1：退款失败，2：退款成功
     */
    public Byte getReturnFlag() {
        return (Byte) get(22);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_virtual_order.return_score</code>. 已退款积分
     */
    public void setReturnScore(Integer value) {
        set(23, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_virtual_order.return_score</code>. 已退款积分
     */
    public Integer getReturnScore() {
        return (Integer) get(23);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_virtual_order.return_account</code>. 已退款余额
     */
    public void setReturnAccount(BigDecimal value) {
        set(24, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_virtual_order.return_account</code>. 已退款余额
     */
    public BigDecimal getReturnAccount() {
        return (BigDecimal) get(24);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_virtual_order.return_money</code>. 已退款现金
     */
    public void setReturnMoney(BigDecimal value) {
        set(25, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_virtual_order.return_money</code>. 已退款现金
     */
    public BigDecimal getReturnMoney() {
        return (BigDecimal) get(25);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_virtual_order.return_card_balance</code>. 已退款会员卡余额
     */
    public void setReturnCardBalance(BigDecimal value) {
        set(26, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_virtual_order.return_card_balance</code>. 已退款会员卡余额
     */
    public BigDecimal getReturnCardBalance() {
        return (BigDecimal) get(26);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_virtual_order.return_time</code>. 退款时间
     */
    public void setReturnTime(Timestamp value) {
        set(27, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_virtual_order.return_time</code>. 退款时间
     */
    public Timestamp getReturnTime() {
        return (Timestamp) get(27);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_virtual_order.del_time</code>. 删除时间
     */
    public void setDelTime(Timestamp value) {
        set(28, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_virtual_order.del_time</code>. 删除时间
     */
    public Timestamp getDelTime() {
        return (Timestamp) get(28);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_virtual_order.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(29, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_virtual_order.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(29);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_virtual_order.update_time</code>. 最后修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(30, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_virtual_order.update_time</code>. 最后修改时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(30);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_virtual_order.goods_type</code>. 虚拟商品类别：0：会员卡，1：优惠券
     */
    public void setGoodsType(Byte value) {
        set(31, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_virtual_order.goods_type</code>. 虚拟商品类别：0：会员卡，1：优惠券
     */
    public Byte getGoodsType() {
        return (Byte) get(31);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_virtual_order.virtual_goods_id</code>. 虚拟商品id
     */
    public void setVirtualGoodsId(Integer value) {
        set(32, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_virtual_order.virtual_goods_id</code>. 虚拟商品id
     */
    public Integer getVirtualGoodsId() {
        return (Integer) get(32);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_virtual_order.card_no</code>. 下单使用的会员卡号
     */
    public void setCardNo(String value) {
        set(33, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_virtual_order.card_no</code>. 下单使用的会员卡号
     */
    public String getCardNo() {
        return (String) get(33);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_virtual_order.still_send_flag</code>. 优惠券礼包订单-退款后是否继续发放优惠劵，1：继续发放，0：停止发放
     */
    public void setStillSendFlag(Byte value) {
        set(34, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_virtual_order.still_send_flag</code>. 优惠券礼包订单-退款后是否继续发放优惠劵，1：继续发放，0：停止发放
     */
    public Byte getStillSendFlag() {
        return (Byte) get(34);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_virtual_order.access_mode</code>. 优惠券礼包订单-下单时的领取方式，0：现金购买，1：积分购买，2直接领取
     */
    public void setAccessMode(Byte value) {
        set(35, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_virtual_order.access_mode</code>. 优惠券礼包订单-下单时的领取方式，0：现金购买，1：积分购买，2直接领取
     */
    public Byte getAccessMode() {
        return (Byte) get(35);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached VirtualOrderRecord
     */
    public VirtualOrderRecord() {
        super(VirtualOrder.VIRTUAL_ORDER);
    }

    /**
     * Create a detached, initialised VirtualOrderRecord
     */
    public VirtualOrderRecord(Integer orderId, String orderSn, Integer userId, Byte orderStatus, String orderStatusName, Integer invoiceId, String invoiceDetail, String addMessage, String payCode, String payName, String prepayId, String paySn, BigDecimal moneyPaid, BigDecimal useAccount, Integer useScore, BigDecimal memberCardBalance, BigDecimal orderAmount, Timestamp payTime, String sellerRemark, Byte starFlag, Byte delFlag, String aliTradeNo, Byte returnFlag, Integer returnScore, BigDecimal returnAccount, BigDecimal returnMoney, BigDecimal returnCardBalance, Timestamp returnTime, Timestamp delTime, Timestamp createTime, Timestamp updateTime, Byte goodsType, Integer virtualGoodsId, String cardNo, Byte stillSendFlag, Byte accessMode) {
        super(VirtualOrder.VIRTUAL_ORDER);

        set(0, orderId);
        set(1, orderSn);
        set(2, userId);
        set(3, orderStatus);
        set(4, orderStatusName);
        set(5, invoiceId);
        set(6, invoiceDetail);
        set(7, addMessage);
        set(8, payCode);
        set(9, payName);
        set(10, prepayId);
        set(11, paySn);
        set(12, moneyPaid);
        set(13, useAccount);
        set(14, useScore);
        set(15, memberCardBalance);
        set(16, orderAmount);
        set(17, payTime);
        set(18, sellerRemark);
        set(19, starFlag);
        set(20, delFlag);
        set(21, aliTradeNo);
        set(22, returnFlag);
        set(23, returnScore);
        set(24, returnAccount);
        set(25, returnMoney);
        set(26, returnCardBalance);
        set(27, returnTime);
        set(28, delTime);
        set(29, createTime);
        set(30, updateTime);
        set(31, goodsType);
        set(32, virtualGoodsId);
        set(33, cardNo);
        set(34, stillSendFlag);
        set(35, accessMode);
    }
}
