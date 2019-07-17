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
public class MpVisitPage implements Serializable {

    private static final long serialVersionUID = 394148701;

    private String    refDate;
    private String    pagePath;
    private Integer   pageVisitPv;
    private Integer   pageVisitUv;
    private Double    pageStaytimePv;
    private Integer   entrypagePv;
    private Integer   exitpagePv;
    private Integer   pageSharePv;
    private Integer   pageShareUv;
    private Timestamp createTime;
    private Timestamp updateTime;

    public MpVisitPage() {}

    public MpVisitPage(MpVisitPage value) {
        this.refDate = value.refDate;
        this.pagePath = value.pagePath;
        this.pageVisitPv = value.pageVisitPv;
        this.pageVisitUv = value.pageVisitUv;
        this.pageStaytimePv = value.pageStaytimePv;
        this.entrypagePv = value.entrypagePv;
        this.exitpagePv = value.exitpagePv;
        this.pageSharePv = value.pageSharePv;
        this.pageShareUv = value.pageShareUv;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
    }

    public MpVisitPage(
        String    refDate,
        String    pagePath,
        Integer   pageVisitPv,
        Integer   pageVisitUv,
        Double    pageStaytimePv,
        Integer   entrypagePv,
        Integer   exitpagePv,
        Integer   pageSharePv,
        Integer   pageShareUv,
        Timestamp createTime,
        Timestamp updateTime
    ) {
        this.refDate = refDate;
        this.pagePath = pagePath;
        this.pageVisitPv = pageVisitPv;
        this.pageVisitUv = pageVisitUv;
        this.pageStaytimePv = pageStaytimePv;
        this.entrypagePv = entrypagePv;
        this.exitpagePv = exitpagePv;
        this.pageSharePv = pageSharePv;
        this.pageShareUv = pageShareUv;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public String getRefDate() {
        return this.refDate;
    }

    public void setRefDate(String refDate) {
        this.refDate = refDate;
    }

    public String getPagePath() {
        return this.pagePath;
    }

    public void setPagePath(String pagePath) {
        this.pagePath = pagePath;
    }

    public Integer getPageVisitPv() {
        return this.pageVisitPv;
    }

    public void setPageVisitPv(Integer pageVisitPv) {
        this.pageVisitPv = pageVisitPv;
    }

    public Integer getPageVisitUv() {
        return this.pageVisitUv;
    }

    public void setPageVisitUv(Integer pageVisitUv) {
        this.pageVisitUv = pageVisitUv;
    }

    public Double getPageStaytimePv() {
        return this.pageStaytimePv;
    }

    public void setPageStaytimePv(Double pageStaytimePv) {
        this.pageStaytimePv = pageStaytimePv;
    }

    public Integer getEntrypagePv() {
        return this.entrypagePv;
    }

    public void setEntrypagePv(Integer entrypagePv) {
        this.entrypagePv = entrypagePv;
    }

    public Integer getExitpagePv() {
        return this.exitpagePv;
    }

    public void setExitpagePv(Integer exitpagePv) {
        this.exitpagePv = exitpagePv;
    }

    public Integer getPageSharePv() {
        return this.pageSharePv;
    }

    public void setPageSharePv(Integer pageSharePv) {
        this.pageSharePv = pageSharePv;
    }

    public Integer getPageShareUv() {
        return this.pageShareUv;
    }

    public void setPageShareUv(Integer pageShareUv) {
        this.pageShareUv = pageShareUv;
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
        StringBuilder sb = new StringBuilder("MpVisitPage (");

        sb.append(refDate);
        sb.append(", ").append(pagePath);
        sb.append(", ").append(pageVisitPv);
        sb.append(", ").append(pageVisitUv);
        sb.append(", ").append(pageStaytimePv);
        sb.append(", ").append(entrypagePv);
        sb.append(", ").append(exitpagePv);
        sb.append(", ").append(pageSharePv);
        sb.append(", ").append(pageShareUv);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);

        sb.append(")");
        return sb.toString();
    }
}
