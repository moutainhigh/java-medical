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
public class BrandClassify implements Serializable {

    private static final long serialVersionUID = 499579884;

    private Integer   classifyId;
    private String    classifyName;
    private Short     first;
    private Byte      delFlag;
    private Timestamp createTime;
    private Timestamp updateTime;

    public BrandClassify() {}

    public BrandClassify(BrandClassify value) {
        this.classifyId = value.classifyId;
        this.classifyName = value.classifyName;
        this.first = value.first;
        this.delFlag = value.delFlag;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
    }

    public BrandClassify(
        Integer   classifyId,
        String    classifyName,
        Short     first,
        Byte      delFlag,
        Timestamp createTime,
        Timestamp updateTime
    ) {
        this.classifyId = classifyId;
        this.classifyName = classifyName;
        this.first = first;
        this.delFlag = delFlag;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Integer getClassifyId() {
        return this.classifyId;
    }

    public void setClassifyId(Integer classifyId) {
        this.classifyId = classifyId;
    }

    public String getClassifyName() {
        return this.classifyName;
    }

    public void setClassifyName(String classifyName) {
        this.classifyName = classifyName;
    }

    public Short getFirst() {
        return this.first;
    }

    public void setFirst(Short first) {
        this.first = first;
    }

    public Byte getDelFlag() {
        return this.delFlag;
    }

    public void setDelFlag(Byte delFlag) {
        this.delFlag = delFlag;
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
        StringBuilder sb = new StringBuilder("BrandClassify (");

        sb.append(classifyId);
        sb.append(", ").append(classifyName);
        sb.append(", ").append(first);
        sb.append(", ").append(delFlag);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);

        sb.append(")");
        return sb.toString();
    }
}
