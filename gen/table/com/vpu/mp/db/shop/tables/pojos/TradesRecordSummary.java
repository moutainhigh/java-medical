/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
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
public class TradesRecordSummary implements Serializable {

    private static final long serialVersionUID = 652536206;

    private Integer    id;
    private Byte       type;
    private BigDecimal incomeTotalMoney;
    private BigDecimal outgoMoney;
    private BigDecimal incomeRealMoney;
    private BigDecimal incomeTotalScore;
    private BigDecimal outgoScore;
    private BigDecimal incomeRealScore;
    private Date       refDate;
    private Timestamp  createTime;
    private Timestamp  updateTime;

    public TradesRecordSummary() {}

    public TradesRecordSummary(TradesRecordSummary value) {
        this.id = value.id;
        this.type = value.type;
        this.incomeTotalMoney = value.incomeTotalMoney;
        this.outgoMoney = value.outgoMoney;
        this.incomeRealMoney = value.incomeRealMoney;
        this.incomeTotalScore = value.incomeTotalScore;
        this.outgoScore = value.outgoScore;
        this.incomeRealScore = value.incomeRealScore;
        this.refDate = value.refDate;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
    }

    public TradesRecordSummary(
        Integer    id,
        Byte       type,
        BigDecimal incomeTotalMoney,
        BigDecimal outgoMoney,
        BigDecimal incomeRealMoney,
        BigDecimal incomeTotalScore,
        BigDecimal outgoScore,
        BigDecimal incomeRealScore,
        Date       refDate,
        Timestamp  createTime,
        Timestamp  updateTime
    ) {
        this.id = id;
        this.type = type;
        this.incomeTotalMoney = incomeTotalMoney;
        this.outgoMoney = outgoMoney;
        this.incomeRealMoney = incomeRealMoney;
        this.incomeTotalScore = incomeTotalScore;
        this.outgoScore = outgoScore;
        this.incomeRealScore = incomeRealScore;
        this.refDate = refDate;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Byte getType() {
        return this.type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public BigDecimal getIncomeTotalMoney() {
        return this.incomeTotalMoney;
    }

    public void setIncomeTotalMoney(BigDecimal incomeTotalMoney) {
        this.incomeTotalMoney = incomeTotalMoney;
    }

    public BigDecimal getOutgoMoney() {
        return this.outgoMoney;
    }

    public void setOutgoMoney(BigDecimal outgoMoney) {
        this.outgoMoney = outgoMoney;
    }

    public BigDecimal getIncomeRealMoney() {
        return this.incomeRealMoney;
    }

    public void setIncomeRealMoney(BigDecimal incomeRealMoney) {
        this.incomeRealMoney = incomeRealMoney;
    }

    public BigDecimal getIncomeTotalScore() {
        return this.incomeTotalScore;
    }

    public void setIncomeTotalScore(BigDecimal incomeTotalScore) {
        this.incomeTotalScore = incomeTotalScore;
    }

    public BigDecimal getOutgoScore() {
        return this.outgoScore;
    }

    public void setOutgoScore(BigDecimal outgoScore) {
        this.outgoScore = outgoScore;
    }

    public BigDecimal getIncomeRealScore() {
        return this.incomeRealScore;
    }

    public void setIncomeRealScore(BigDecimal incomeRealScore) {
        this.incomeRealScore = incomeRealScore;
    }

    public Date getRefDate() {
        return this.refDate;
    }

    public void setRefDate(Date refDate) {
        this.refDate = refDate;
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
        StringBuilder sb = new StringBuilder("TradesRecordSummary (");

        sb.append(id);
        sb.append(", ").append(type);
        sb.append(", ").append(incomeTotalMoney);
        sb.append(", ").append(outgoMoney);
        sb.append(", ").append(incomeRealMoney);
        sb.append(", ").append(incomeTotalScore);
        sb.append(", ").append(outgoScore);
        sb.append(", ").append(incomeRealScore);
        sb.append(", ").append(refDate);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);

        sb.append(")");
        return sb.toString();
    }
}
