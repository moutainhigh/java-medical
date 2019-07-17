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
public class Channel implements Serializable {

    private static final long serialVersionUID = 238350244;

    private Integer   id;
    private Integer   pageId;
    private Integer   goodsId;
    private String    channelName;
    private Byte      sourceType;
    private String    share;
    private Byte      delFlag;
    private Timestamp delTime;
    private Timestamp createTime;
    private Timestamp updateTime;

    public Channel() {}

    public Channel(Channel value) {
        this.id = value.id;
        this.pageId = value.pageId;
        this.goodsId = value.goodsId;
        this.channelName = value.channelName;
        this.sourceType = value.sourceType;
        this.share = value.share;
        this.delFlag = value.delFlag;
        this.delTime = value.delTime;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
    }

    public Channel(
        Integer   id,
        Integer   pageId,
        Integer   goodsId,
        String    channelName,
        Byte      sourceType,
        String    share,
        Byte      delFlag,
        Timestamp delTime,
        Timestamp createTime,
        Timestamp updateTime
    ) {
        this.id = id;
        this.pageId = pageId;
        this.goodsId = goodsId;
        this.channelName = channelName;
        this.sourceType = sourceType;
        this.share = share;
        this.delFlag = delFlag;
        this.delTime = delTime;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPageId() {
        return this.pageId;
    }

    public void setPageId(Integer pageId) {
        this.pageId = pageId;
    }

    public Integer getGoodsId() {
        return this.goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getChannelName() {
        return this.channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public Byte getSourceType() {
        return this.sourceType;
    }

    public void setSourceType(Byte sourceType) {
        this.sourceType = sourceType;
    }

    public String getShare() {
        return this.share;
    }

    public void setShare(String share) {
        this.share = share;
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
        StringBuilder sb = new StringBuilder("Channel (");

        sb.append(id);
        sb.append(", ").append(pageId);
        sb.append(", ").append(goodsId);
        sb.append(", ").append(channelName);
        sb.append(", ").append(sourceType);
        sb.append(", ").append(share);
        sb.append(", ").append(delFlag);
        sb.append(", ").append(delTime);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);

        sb.append(")");
        return sb.toString();
    }
}
