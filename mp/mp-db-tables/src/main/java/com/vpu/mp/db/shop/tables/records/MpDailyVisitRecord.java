/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables.records;


import com.vpu.mp.db.shop.tables.MpDailyVisit;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;


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
public class MpDailyVisitRecord extends UpdatableRecordImpl<MpDailyVisitRecord> implements Record11<Integer, String, Integer, Integer, Integer, Integer, Double, Double, Double, Timestamp, Timestamp> {

    private static final long serialVersionUID = -1815099145;

    /**
     * Setter for <code>jmini_shop_4748160.b2c_mp_daily_visit.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>jmini_shop_4748160.b2c_mp_daily_visit.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>jmini_shop_4748160.b2c_mp_daily_visit.ref_date</code>. 时间： 如： "20180313"
     */
    public void setRefDate(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>jmini_shop_4748160.b2c_mp_daily_visit.ref_date</code>. 时间： 如： "20180313"
     */
    public String getRefDate() {
        return (String) get(1);
    }

    /**
     * Setter for <code>jmini_shop_4748160.b2c_mp_daily_visit.session_cnt</code>. 打开次数
     */
    public void setSessionCnt(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>jmini_shop_4748160.b2c_mp_daily_visit.session_cnt</code>. 打开次数
     */
    public Integer getSessionCnt() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>jmini_shop_4748160.b2c_mp_daily_visit.visit_pv</code>. 访问次数
     */
    public void setVisitPv(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>jmini_shop_4748160.b2c_mp_daily_visit.visit_pv</code>. 访问次数
     */
    public Integer getVisitPv() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>jmini_shop_4748160.b2c_mp_daily_visit.visit_uv</code>. 访问人数
     */
    public void setVisitUv(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>jmini_shop_4748160.b2c_mp_daily_visit.visit_uv</code>. 访问人数
     */
    public Integer getVisitUv() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>jmini_shop_4748160.b2c_mp_daily_visit.visit_uv_new</code>. 新用户数
     */
    public void setVisitUvNew(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>jmini_shop_4748160.b2c_mp_daily_visit.visit_uv_new</code>. 新用户数
     */
    public Integer getVisitUvNew() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>jmini_shop_4748160.b2c_mp_daily_visit.stay_time_uv</code>. 人均停留时长 (浮点型，单位：秒)
     */
    public void setStayTimeUv(Double value) {
        set(6, value);
    }

    /**
     * Getter for <code>jmini_shop_4748160.b2c_mp_daily_visit.stay_time_uv</code>. 人均停留时长 (浮点型，单位：秒)
     */
    public Double getStayTimeUv() {
        return (Double) get(6);
    }

    /**
     * Setter for <code>jmini_shop_4748160.b2c_mp_daily_visit.stay_time_session</code>. 次均停留时长 (浮点型，单位：秒)
     */
    public void setStayTimeSession(Double value) {
        set(7, value);
    }

    /**
     * Getter for <code>jmini_shop_4748160.b2c_mp_daily_visit.stay_time_session</code>. 次均停留时长 (浮点型，单位：秒)
     */
    public Double getStayTimeSession() {
        return (Double) get(7);
    }

    /**
     * Setter for <code>jmini_shop_4748160.b2c_mp_daily_visit.visit_depth</code>. 平均访问深度 (浮点型)
     */
    public void setVisitDepth(Double value) {
        set(8, value);
    }

    /**
     * Getter for <code>jmini_shop_4748160.b2c_mp_daily_visit.visit_depth</code>. 平均访问深度 (浮点型)
     */
    public Double getVisitDepth() {
        return (Double) get(8);
    }

    /**
     * Setter for <code>jmini_shop_4748160.b2c_mp_daily_visit.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>jmini_shop_4748160.b2c_mp_daily_visit.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>jmini_shop_4748160.b2c_mp_daily_visit.update_time</code>. 最后修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(10, value);
    }

    /**
     * Getter for <code>jmini_shop_4748160.b2c_mp_daily_visit.update_time</code>. 最后修改时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(10);
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
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Integer, String, Integer, Integer, Integer, Integer, Double, Double, Double, Timestamp, Timestamp> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Integer, String, Integer, Integer, Integer, Integer, Double, Double, Double, Timestamp, Timestamp> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return MpDailyVisit.MP_DAILY_VISIT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return MpDailyVisit.MP_DAILY_VISIT.REF_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return MpDailyVisit.MP_DAILY_VISIT.SESSION_CNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return MpDailyVisit.MP_DAILY_VISIT.VISIT_PV;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return MpDailyVisit.MP_DAILY_VISIT.VISIT_UV;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return MpDailyVisit.MP_DAILY_VISIT.VISIT_UV_NEW;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field7() {
        return MpDailyVisit.MP_DAILY_VISIT.STAY_TIME_UV;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field8() {
        return MpDailyVisit.MP_DAILY_VISIT.STAY_TIME_SESSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field9() {
        return MpDailyVisit.MP_DAILY_VISIT.VISIT_DEPTH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return MpDailyVisit.MP_DAILY_VISIT.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return MpDailyVisit.MP_DAILY_VISIT.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getRefDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getSessionCnt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getVisitPv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getVisitUv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getVisitUvNew();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component7() {
        return getStayTimeUv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component8() {
        return getStayTimeSession();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component9() {
        return getVisitDepth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component10() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component11() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getRefDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getSessionCnt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getVisitPv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getVisitUv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getVisitUvNew();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value7() {
        return getStayTimeUv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value8() {
        return getStayTimeSession();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value9() {
        return getVisitDepth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value10() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpDailyVisitRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpDailyVisitRecord value2(String value) {
        setRefDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpDailyVisitRecord value3(Integer value) {
        setSessionCnt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpDailyVisitRecord value4(Integer value) {
        setVisitPv(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpDailyVisitRecord value5(Integer value) {
        setVisitUv(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpDailyVisitRecord value6(Integer value) {
        setVisitUvNew(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpDailyVisitRecord value7(Double value) {
        setStayTimeUv(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpDailyVisitRecord value8(Double value) {
        setStayTimeSession(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpDailyVisitRecord value9(Double value) {
        setVisitDepth(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpDailyVisitRecord value10(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpDailyVisitRecord value11(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpDailyVisitRecord values(Integer value1, String value2, Integer value3, Integer value4, Integer value5, Integer value6, Double value7, Double value8, Double value9, Timestamp value10, Timestamp value11) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MpDailyVisitRecord
     */
    public MpDailyVisitRecord() {
        super(MpDailyVisit.MP_DAILY_VISIT);
    }

    /**
     * Create a detached, initialised MpDailyVisitRecord
     */
    public MpDailyVisitRecord(Integer id, String refDate, Integer sessionCnt, Integer visitPv, Integer visitUv, Integer visitUvNew, Double stayTimeUv, Double stayTimeSession, Double visitDepth, Timestamp createTime, Timestamp updateTime) {
        super(MpDailyVisit.MP_DAILY_VISIT);

        set(0, id);
        set(1, refDate);
        set(2, sessionCnt);
        set(3, visitPv);
        set(4, visitUv);
        set(5, visitUvNew);
        set(6, stayTimeUv);
        set(7, stayTimeSession);
        set(8, visitDepth);
        set(9, createTime);
        set(10, updateTime);
    }
}
