/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


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
public class PartOrderGoodsShip implements Serializable {

    private static final long serialVersionUID = 1928576327;

    private Integer   recId;
    private Integer   shopId;
    private Integer   orderGoodsId;
    private String    orderSn;
    private String    batchNo;
    private Integer   goodsId;
    private String    goodsName;
    private Integer   productId;
    private Short     sendNumber;
    private String    goodsAttr;
    private String    shippingNo;
    private String    shippingName;
    private Byte      shippingId;
    private Timestamp shippingTime;
    private Timestamp confirmTime;
    private Timestamp createTime;
    private Timestamp updateTime;

    public PartOrderGoodsShip() {}

    public PartOrderGoodsShip(PartOrderGoodsShip value) {
        this.recId = value.recId;
        this.shopId = value.shopId;
        this.orderGoodsId = value.orderGoodsId;
        this.orderSn = value.orderSn;
        this.batchNo = value.batchNo;
        this.goodsId = value.goodsId;
        this.goodsName = value.goodsName;
        this.productId = value.productId;
        this.sendNumber = value.sendNumber;
        this.goodsAttr = value.goodsAttr;
        this.shippingNo = value.shippingNo;
        this.shippingName = value.shippingName;
        this.shippingId = value.shippingId;
        this.shippingTime = value.shippingTime;
        this.confirmTime = value.confirmTime;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
    }

    public PartOrderGoodsShip(
        Integer   recId,
        Integer   shopId,
        Integer   orderGoodsId,
        String    orderSn,
        String    batchNo,
        Integer   goodsId,
        String    goodsName,
        Integer   productId,
        Short     sendNumber,
        String    goodsAttr,
        String    shippingNo,
        String    shippingName,
        Byte      shippingId,
        Timestamp shippingTime,
        Timestamp confirmTime,
        Timestamp createTime,
        Timestamp updateTime
    ) {
        this.recId = recId;
        this.shopId = shopId;
        this.orderGoodsId = orderGoodsId;
        this.orderSn = orderSn;
        this.batchNo = batchNo;
        this.goodsId = goodsId;
        this.goodsName = goodsName;
        this.productId = productId;
        this.sendNumber = sendNumber;
        this.goodsAttr = goodsAttr;
        this.shippingNo = shippingNo;
        this.shippingName = shippingName;
        this.shippingId = shippingId;
        this.shippingTime = shippingTime;
        this.confirmTime = confirmTime;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Integer getRecId() {
        return this.recId;
    }

    public void setRecId(Integer recId) {
        this.recId = recId;
    }

    public Integer getShopId() {
        return this.shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getOrderGoodsId() {
        return this.orderGoodsId;
    }

    public void setOrderGoodsId(Integer orderGoodsId) {
        this.orderGoodsId = orderGoodsId;
    }

    public String getOrderSn() {
        return this.orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public String getBatchNo() {
        return this.batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public Integer getGoodsId() {
        return this.goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return this.goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Integer getProductId() {
        return this.productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Short getSendNumber() {
        return this.sendNumber;
    }

    public void setSendNumber(Short sendNumber) {
        this.sendNumber = sendNumber;
    }

    public String getGoodsAttr() {
        return this.goodsAttr;
    }

    public void setGoodsAttr(String goodsAttr) {
        this.goodsAttr = goodsAttr;
    }

    public String getShippingNo() {
        return this.shippingNo;
    }

    public void setShippingNo(String shippingNo) {
        this.shippingNo = shippingNo;
    }

    public String getShippingName() {
        return this.shippingName;
    }

    public void setShippingName(String shippingName) {
        this.shippingName = shippingName;
    }

    public Byte getShippingId() {
        return this.shippingId;
    }

    public void setShippingId(Byte shippingId) {
        this.shippingId = shippingId;
    }

    public Timestamp getShippingTime() {
        return this.shippingTime;
    }

    public void setShippingTime(Timestamp shippingTime) {
        this.shippingTime = shippingTime;
    }

    public Timestamp getConfirmTime() {
        return this.confirmTime;
    }

    public void setConfirmTime(Timestamp confirmTime) {
        this.confirmTime = confirmTime;
    }

    public Timestamp getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PartOrderGoodsShip (");

        sb.append(recId);
        sb.append(", ").append(shopId);
        sb.append(", ").append(orderGoodsId);
        sb.append(", ").append(orderSn);
        sb.append(", ").append(batchNo);
        sb.append(", ").append(goodsId);
        sb.append(", ").append(goodsName);
        sb.append(", ").append(productId);
        sb.append(", ").append(sendNumber);
        sb.append(", ").append(goodsAttr);
        sb.append(", ").append(shippingNo);
        sb.append(", ").append(shippingName);
        sb.append(", ").append(shippingId);
        sb.append(", ").append(shippingTime);
        sb.append(", ").append(confirmTime);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);

        sb.append(")");
        return sb.toString();
    }
}
