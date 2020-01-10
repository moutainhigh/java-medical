/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
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
public class BargainRecord implements Serializable {

    private static final long serialVersionUID = 1647508778;

    private Integer    id;
    private Integer    userId;
    private Integer    bargainId;
    private Integer    goodsId;
    private Integer    prdId;
    private BigDecimal goodsPrice;
    private BigDecimal bargainMoney;
    private Integer    userNumber;
    private Byte       status;
    private Integer    isOrdered;
    private String     orderSn;
    private Timestamp  createTime;
    private Timestamp  updateTime;
    private Byte       delFlag;
    private Timestamp  delTime;

    public BargainRecord() {}

    public BargainRecord(BargainRecord value) {
        this.id = value.id;
        this.userId = value.userId;
        this.bargainId = value.bargainId;
        this.goodsId = value.goodsId;
        this.prdId = value.prdId;
        this.goodsPrice = value.goodsPrice;
        this.bargainMoney = value.bargainMoney;
        this.userNumber = value.userNumber;
        this.status = value.status;
        this.isOrdered = value.isOrdered;
        this.orderSn = value.orderSn;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
        this.delFlag = value.delFlag;
        this.delTime = value.delTime;
    }

    public BargainRecord(
        Integer    id,
        Integer    userId,
        Integer    bargainId,
        Integer    goodsId,
        Integer    prdId,
        BigDecimal goodsPrice,
        BigDecimal bargainMoney,
        Integer    userNumber,
        Byte       status,
        Integer    isOrdered,
        String     orderSn,
        Timestamp  createTime,
        Timestamp  updateTime,
        Byte       delFlag,
        Timestamp  delTime
    ) {
        this.id = id;
        this.userId = userId;
        this.bargainId = bargainId;
        this.goodsId = goodsId;
        this.prdId = prdId;
        this.goodsPrice = goodsPrice;
        this.bargainMoney = bargainMoney;
        this.userNumber = userNumber;
        this.status = status;
        this.isOrdered = isOrdered;
        this.orderSn = orderSn;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.delFlag = delFlag;
        this.delTime = delTime;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getBargainId() {
        return this.bargainId;
    }

    public void setBargainId(Integer bargainId) {
        this.bargainId = bargainId;
    }

    public Integer getGoodsId() {
        return this.goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getPrdId() {
        return this.prdId;
    }

    public void setPrdId(Integer prdId) {
        this.prdId = prdId;
    }

    public BigDecimal getGoodsPrice() {
        return this.goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public BigDecimal getBargainMoney() {
        return this.bargainMoney;
    }

    public void setBargainMoney(BigDecimal bargainMoney) {
        this.bargainMoney = bargainMoney;
    }

    public Integer getUserNumber() {
        return this.userNumber;
    }

    public void setUserNumber(Integer userNumber) {
        this.userNumber = userNumber;
    }

    public Byte getStatus() {
        return this.status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Integer getIsOrdered() {
        return this.isOrdered;
    }

    public void setIsOrdered(Integer isOrdered) {
        this.isOrdered = isOrdered;
    }

    public String getOrderSn() {
        return this.orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
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

    public Byte getDelFlag() {
        return this.delFlag;
    }

    public void setDelFlag(Byte delFlag) {
        this.delFlag = delFlag;
    }

    public Timestamp getDelTime() {
        return this.delTime;
    }

    public void setDelTime(Timestamp delTime) {
        this.delTime = delTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("BargainRecord (");

        sb.append(id);
        sb.append(", ").append(userId);
        sb.append(", ").append(bargainId);
        sb.append(", ").append(goodsId);
        sb.append(", ").append(prdId);
        sb.append(", ").append(goodsPrice);
        sb.append(", ").append(bargainMoney);
        sb.append(", ").append(userNumber);
        sb.append(", ").append(status);
        sb.append(", ").append(isOrdered);
        sb.append(", ").append(orderSn);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);
        sb.append(", ").append(delFlag);
        sb.append(", ").append(delTime);

        sb.append(")");
        return sb.toString();
    }
}
