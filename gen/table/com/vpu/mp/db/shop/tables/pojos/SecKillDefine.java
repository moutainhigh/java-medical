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
public class SecKillDefine implements Serializable {

    private static final long serialVersionUID = -366925556;

    private Integer   skId;
    private Integer   shopId;
    private Integer   goodsId;
    private String    name;
    private Short     limitAmount;
    private Short     limitPaytime;
    private Timestamp startTime;
    private Timestamp endTime;
    private Short     stock;
    private Short     saleNum;
    private Byte      delFlag;
    private Byte      status;
    private Byte      freeFreight;
    private Timestamp delTime;
    private Timestamp createTime;
    private Timestamp updateTime;
    private String    cardId;
    private String    shareConfig;

    public SecKillDefine() {}

    public SecKillDefine(SecKillDefine value) {
        this.skId = value.skId;
        this.shopId = value.shopId;
        this.goodsId = value.goodsId;
        this.name = value.name;
        this.limitAmount = value.limitAmount;
        this.limitPaytime = value.limitPaytime;
        this.startTime = value.startTime;
        this.endTime = value.endTime;
        this.stock = value.stock;
        this.saleNum = value.saleNum;
        this.delFlag = value.delFlag;
        this.status = value.status;
        this.freeFreight = value.freeFreight;
        this.delTime = value.delTime;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
        this.cardId = value.cardId;
        this.shareConfig = value.shareConfig;
    }

    public SecKillDefine(
        Integer   skId,
        Integer   shopId,
        Integer   goodsId,
        String    name,
        Short     limitAmount,
        Short     limitPaytime,
        Timestamp startTime,
        Timestamp endTime,
        Short     stock,
        Short     saleNum,
        Byte      delFlag,
        Byte      status,
        Byte      freeFreight,
        Timestamp delTime,
        Timestamp createTime,
        Timestamp updateTime,
        String    cardId,
        String    shareConfig
    ) {
        this.skId = skId;
        this.shopId = shopId;
        this.goodsId = goodsId;
        this.name = name;
        this.limitAmount = limitAmount;
        this.limitPaytime = limitPaytime;
        this.startTime = startTime;
        this.endTime = endTime;
        this.stock = stock;
        this.saleNum = saleNum;
        this.delFlag = delFlag;
        this.status = status;
        this.freeFreight = freeFreight;
        this.delTime = delTime;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.cardId = cardId;
        this.shareConfig = shareConfig;
    }

    public Integer getSkId() {
        return this.skId;
    }

    public void setSkId(Integer skId) {
        this.skId = skId;
    }

    public Integer getShopId() {
        return this.shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getGoodsId() {
        return this.goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Short getLimitAmount() {
        return this.limitAmount;
    }

    public void setLimitAmount(Short limitAmount) {
        this.limitAmount = limitAmount;
    }

    public Short getLimitPaytime() {
        return this.limitPaytime;
    }

    public void setLimitPaytime(Short limitPaytime) {
        this.limitPaytime = limitPaytime;
    }

    public Timestamp getStartTime() {
        return this.startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    public Timestamp getEndTime() {
        return this.endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    public Short getStock() {
        return this.stock;
    }

    public void setStock(Short stock) {
        this.stock = stock;
    }

    public Short getSaleNum() {
        return this.saleNum;
    }

    public void setSaleNum(Short saleNum) {
        this.saleNum = saleNum;
    }

    public Byte getDelFlag() {
        return this.delFlag;
    }

    public void setDelFlag(Byte delFlag) {
        this.delFlag = delFlag;
    }

    public Byte getStatus() {
        return this.status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Byte getFreeFreight() {
        return this.freeFreight;
    }

    public void setFreeFreight(Byte freeFreight) {
        this.freeFreight = freeFreight;
    }

    public Timestamp getDelTime() {
        return this.delTime;
    }

    public void setDelTime(Timestamp delTime) {
        this.delTime = delTime;
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

    public String getCardId() {
        return this.cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getShareConfig() {
        return this.shareConfig;
    }

    public void setShareConfig(String shareConfig) {
        this.shareConfig = shareConfig;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SecKillDefine (");

        sb.append(skId);
        sb.append(", ").append(shopId);
        sb.append(", ").append(goodsId);
        sb.append(", ").append(name);
        sb.append(", ").append(limitAmount);
        sb.append(", ").append(limitPaytime);
        sb.append(", ").append(startTime);
        sb.append(", ").append(endTime);
        sb.append(", ").append(stock);
        sb.append(", ").append(saleNum);
        sb.append(", ").append(delFlag);
        sb.append(", ").append(status);
        sb.append(", ").append(freeFreight);
        sb.append(", ").append(delTime);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);
        sb.append(", ").append(cardId);
        sb.append(", ").append(shareConfig);

        sb.append(")");
        return sb.toString();
    }
}
