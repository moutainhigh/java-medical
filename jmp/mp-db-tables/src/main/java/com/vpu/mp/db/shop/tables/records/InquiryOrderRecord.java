/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables.records;


import com.vpu.mp.db.shop.tables.InquiryOrder;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 问诊订单表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InquiryOrderRecord extends UpdatableRecordImpl<InquiryOrderRecord> {

    private static final long serialVersionUID = -361164524;

    /**
     * Setter for <code>mini_shop_471752.b2c_inquiry_order.order_id</code>. 订单id
     */
    public void setOrderId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_inquiry_order.order_id</code>. 订单id
     */
    public Integer getOrderId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_inquiry_order.order_sn</code>. 订单编号
     */
    public void setOrderSn(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_inquiry_order.order_sn</code>. 订单编号
     */
    public String getOrderSn() {
        return (String) get(1);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_inquiry_order.user_id</code>. 用户id
     */
    public void setUserId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_inquiry_order.user_id</code>. 用户id
     */
    public Integer getUserId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_inquiry_order.order_status</code>. 订单状态0待付款  1待接诊 2已取消 3已完成
     */
    public void setOrderStatus(Byte value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_inquiry_order.order_status</code>. 订单状态0待付款  1待接诊 2已取消 3已完成
     */
    public Byte getOrderStatus() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_inquiry_order.doctor_id</code>. 医师id
     */
    public void setDoctorId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_inquiry_order.doctor_id</code>. 医师id
     */
    public Integer getDoctorId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_inquiry_order.doctor_name</code>. 医师名称
     */
    public void setDoctorName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_inquiry_order.doctor_name</code>. 医师名称
     */
    public String getDoctorName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_inquiry_order.department_id</code>. 科室id
     */
    public void setDepartmentId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_inquiry_order.department_id</code>. 科室id
     */
    public Integer getDepartmentId() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_inquiry_order.department_name</code>. 医师科室
     */
    public void setDepartmentName(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_inquiry_order.department_name</code>. 医师科室
     */
    public String getDepartmentName() {
        return (String) get(7);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_inquiry_order.patient_id</code>. 患者id
     */
    public void setPatientId(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_inquiry_order.patient_id</code>. 患者id
     */
    public Integer getPatientId() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_inquiry_order.patient_mobile</code>. 患者手机号码
     */
    public void setPatientMobile(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_inquiry_order.patient_mobile</code>. 患者手机号码
     */
    public String getPatientMobile() {
        return (String) get(9);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_inquiry_order.patient_name</code>. 患者名称
     */
    public void setPatientName(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_inquiry_order.patient_name</code>. 患者名称
     */
    public String getPatientName() {
        return (String) get(10);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_inquiry_order.patient_sex</code>. 性别 0：未知 1：男 2：女
     */
    public void setPatientSex(Byte value) {
        set(11, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_inquiry_order.patient_sex</code>. 性别 0：未知 1：男 2：女
     */
    public Byte getPatientSex() {
        return (Byte) get(11);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_inquiry_order.patient_identity_code</code>. 证件号码
     */
    public void setPatientIdentityCode(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_inquiry_order.patient_identity_code</code>. 证件号码
     */
    public String getPatientIdentityCode() {
        return (String) get(12);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_inquiry_order.patient_identity_type</code>. 证件类型: 1：身份证 2：军人证 3：护照 4：社保卡
     */
    public void setPatientIdentityType(Byte value) {
        set(13, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_inquiry_order.patient_identity_type</code>. 证件类型: 1：身份证 2：军人证 3：护照 4：社保卡
     */
    public Byte getPatientIdentityType() {
        return (Byte) get(13);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_inquiry_order.pay_code</code>. 支付代号
     */
    public void setPayCode(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_inquiry_order.pay_code</code>. 支付代号
     */
    public String getPayCode() {
        return (String) get(14);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_inquiry_order.pay_name</code>. 支付名称
     */
    public void setPayName(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_inquiry_order.pay_name</code>. 支付名称
     */
    public String getPayName() {
        return (String) get(15);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_inquiry_order.pay_sn</code>. 支付流水号
     */
    public void setPaySn(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_inquiry_order.pay_sn</code>. 支付流水号
     */
    public String getPaySn() {
        return (String) get(16);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_inquiry_order.prepay_id</code>. 微信支付id，用于发送模板消息
     */
    public void setPrepayId(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_inquiry_order.prepay_id</code>. 微信支付id，用于发送模板消息
     */
    public String getPrepayId() {
        return (String) get(17);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_inquiry_order.order_amount</code>. 订单总金额
     */
    public void setOrderAmount(BigDecimal value) {
        set(18, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_inquiry_order.order_amount</code>. 订单总金额
     */
    public BigDecimal getOrderAmount() {
        return (BigDecimal) get(18);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_inquiry_order.pay_time</code>. 支付时间
     */
    public void setPayTime(Timestamp value) {
        set(19, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_inquiry_order.pay_time</code>. 支付时间
     */
    public Timestamp getPayTime() {
        return (Timestamp) get(19);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_inquiry_order.cancelled_time</code>. 取消时间
     */
    public void setCancelledTime(Timestamp value) {
        set(20, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_inquiry_order.cancelled_time</code>. 取消时间
     */
    public Timestamp getCancelledTime() {
        return (Timestamp) get(20);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_inquiry_order.finished_time</code>. 订单完成时间
     */
    public void setFinishedTime(Timestamp value) {
        set(21, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_inquiry_order.finished_time</code>. 订单完成时间
     */
    public Timestamp getFinishedTime() {
        return (Timestamp) get(21);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_inquiry_order.description_disease</code>. 病情描述
     */
    public void setDescriptionDisease(String value) {
        set(22, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_inquiry_order.description_disease</code>. 病情描述
     */
    public String getDescriptionDisease() {
        return (String) get(22);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_inquiry_order.image_url</code>. 病情描述image
     */
    public void setImageUrl(String value) {
        set(23, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_inquiry_order.image_url</code>. 病情描述image
     */
    public String getImageUrl() {
        return (String) get(23);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_inquiry_order.is_delete</code>. 删除
     */
    public void setIsDelete(Byte value) {
        set(24, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_inquiry_order.is_delete</code>. 删除
     */
    public Byte getIsDelete() {
        return (Byte) get(24);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_inquiry_order.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(25, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_inquiry_order.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(25);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_inquiry_order.update_time</code>. 最后修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(26, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_inquiry_order.update_time</code>. 最后修改时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(26);
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
     * Create a detached InquiryOrderRecord
     */
    public InquiryOrderRecord() {
        super(InquiryOrder.INQUIRY_ORDER);
    }

    /**
     * Create a detached, initialised InquiryOrderRecord
     */
    public InquiryOrderRecord(Integer orderId, String orderSn, Integer userId, Byte orderStatus, Integer doctorId, String doctorName, Integer departmentId, String departmentName, Integer patientId, String patientMobile, String patientName, Byte patientSex, String patientIdentityCode, Byte patientIdentityType, String payCode, String payName, String paySn, String prepayId, BigDecimal orderAmount, Timestamp payTime, Timestamp cancelledTime, Timestamp finishedTime, String descriptionDisease, String imageUrl, Byte isDelete, Timestamp createTime, Timestamp updateTime) {
        super(InquiryOrder.INQUIRY_ORDER);

        set(0, orderId);
        set(1, orderSn);
        set(2, userId);
        set(3, orderStatus);
        set(4, doctorId);
        set(5, doctorName);
        set(6, departmentId);
        set(7, departmentName);
        set(8, patientId);
        set(9, patientMobile);
        set(10, patientName);
        set(11, patientSex);
        set(12, patientIdentityCode);
        set(13, patientIdentityType);
        set(14, payCode);
        set(15, payName);
        set(16, paySn);
        set(17, prepayId);
        set(18, orderAmount);
        set(19, payTime);
        set(20, cancelledTime);
        set(21, finishedTime);
        set(22, descriptionDisease);
        set(23, imageUrl);
        set(24, isDelete);
        set(25, createTime);
        set(26, updateTime);
    }
}
