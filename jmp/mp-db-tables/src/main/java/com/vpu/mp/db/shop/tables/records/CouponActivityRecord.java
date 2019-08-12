/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables.records;


import com.vpu.mp.db.shop.tables.CouponActivity;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record16;
import org.jooq.Row16;
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
public class CouponActivityRecord extends UpdatableRecordImpl<CouponActivityRecord> implements Record16<Integer, Byte, Byte, String, String, Byte, Timestamp, Timestamp, String, Byte, Byte, Timestamp, Timestamp, Timestamp, String, String> {

    private static final long serialVersionUID = 520757513;

    /**
     * Setter for <code>mini_shop_471752.b2c_coupon_activity.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_coupon_activity.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_coupon_activity.activity_action</code>. 活动类型：1：活动送券 2：大转盘抽奖 3：跳转自定义链接
     */
    public void setActivityAction(Byte value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_coupon_activity.activity_action</code>. 活动类型：1：活动送券 2：大转盘抽奖 3：跳转自定义链接
     */
    public Byte getActivityAction() {
        return (Byte) get(1);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_coupon_activity.action</code>. 针对用户群体： 1: 新用户 2: 全部用户
     */
    public void setAction(Byte value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_coupon_activity.action</code>. 针对用户群体： 1: 新用户 2: 全部用户
     */
    public Byte getAction() {
        return (Byte) get(2);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_coupon_activity.name</code>. 活动名称
     */
    public void setName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_coupon_activity.name</code>. 活动名称
     */
    public String getName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_coupon_activity.title</code>. 宣传语
     */
    public void setTitle(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_coupon_activity.title</code>. 宣传语
     */
    public String getTitle() {
        return (String) get(4);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_coupon_activity.bg_action</code>. 背景图
     */
    public void setBgAction(Byte value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_coupon_activity.bg_action</code>. 背景图
     */
    public Byte getBgAction() {
        return (Byte) get(5);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_coupon_activity.start_date</code>. 有效期-起始
     */
    public void setStartDate(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_coupon_activity.start_date</code>. 有效期-起始
     */
    public Timestamp getStartDate() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_coupon_activity.end_date</code>. 有效期-结束
     */
    public void setEndDate(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_coupon_activity.end_date</code>. 有效期-结束
     */
    public Timestamp getEndDate() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_coupon_activity.mrking_voucher_id</code>. 活动优惠券，逗号分隔
     */
    public void setMrkingVoucherId(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_coupon_activity.mrking_voucher_id</code>. 活动优惠券，逗号分隔
     */
    public String getMrkingVoucherId() {
        return (String) get(8);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_coupon_activity.status</code>. 状态： 1: 正常 0: 关闭
     */
    public void setStatus(Byte value) {
        set(9, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_coupon_activity.status</code>. 状态： 1: 正常 0: 关闭
     */
    public Byte getStatus() {
        return (Byte) get(9);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_coupon_activity.del_flag</code>.
     */
    public void setDelFlag(Byte value) {
        set(10, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_coupon_activity.del_flag</code>.
     */
    public Byte getDelFlag() {
        return (Byte) get(10);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_coupon_activity.del_time</code>.
     */
    public void setDelTime(Timestamp value) {
        set(11, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_coupon_activity.del_time</code>.
     */
    public Timestamp getDelTime() {
        return (Timestamp) get(11);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_coupon_activity.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(12, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_coupon_activity.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(12);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_coupon_activity.update_time</code>. 最后修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(13, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_coupon_activity.update_time</code>. 最后修改时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(13);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_coupon_activity.customize_img_path</code>. 活动有礼跳转活动图片路径
     */
    public void setCustomizeImgPath(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_coupon_activity.customize_img_path</code>. 活动有礼跳转活动图片路径
     */
    public String getCustomizeImgPath() {
        return (String) get(14);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_coupon_activity.customize_url</code>. 活动有礼跳转活动链接
     */
    public void setCustomizeUrl(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_coupon_activity.customize_url</code>. 活动有礼跳转活动链接
     */
    public String getCustomizeUrl() {
        return (String) get(15);
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
    // Record16 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<Integer, Byte, Byte, String, String, Byte, Timestamp, Timestamp, String, Byte, Byte, Timestamp, Timestamp, Timestamp, String, String> fieldsRow() {
        return (Row16) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<Integer, Byte, Byte, String, String, Byte, Timestamp, Timestamp, String, Byte, Byte, Timestamp, Timestamp, Timestamp, String, String> valuesRow() {
        return (Row16) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return CouponActivity.COUPON_ACTIVITY.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field2() {
        return CouponActivity.COUPON_ACTIVITY.ACTIVITY_ACTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field3() {
        return CouponActivity.COUPON_ACTIVITY.ACTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return CouponActivity.COUPON_ACTIVITY.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return CouponActivity.COUPON_ACTIVITY.TITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field6() {
        return CouponActivity.COUPON_ACTIVITY.BG_ACTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return CouponActivity.COUPON_ACTIVITY.START_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return CouponActivity.COUPON_ACTIVITY.END_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return CouponActivity.COUPON_ACTIVITY.MRKING_VOUCHER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field10() {
        return CouponActivity.COUPON_ACTIVITY.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field11() {
        return CouponActivity.COUPON_ACTIVITY.DEL_FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return CouponActivity.COUPON_ACTIVITY.DEL_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field13() {
        return CouponActivity.COUPON_ACTIVITY.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field14() {
        return CouponActivity.COUPON_ACTIVITY.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return CouponActivity.COUPON_ACTIVITY.CUSTOMIZE_IMG_PATH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return CouponActivity.COUPON_ACTIVITY.CUSTOMIZE_URL;
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
    public Byte component2() {
        return getActivityAction();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component3() {
        return getAction();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component6() {
        return getBgAction();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component7() {
        return getStartDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component8() {
        return getEndDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getMrkingVoucherId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component10() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component11() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component12() {
        return getDelTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component13() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component14() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getCustomizeImgPath();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component16() {
        return getCustomizeUrl();
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
    public Byte value2() {
        return getActivityAction();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value3() {
        return getAction();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value6() {
        return getBgAction();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getStartDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getEndDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getMrkingVoucherId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value10() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value11() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value12() {
        return getDelTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value13() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value14() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getCustomizeImgPath();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getCustomizeUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CouponActivityRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CouponActivityRecord value2(Byte value) {
        setActivityAction(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CouponActivityRecord value3(Byte value) {
        setAction(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CouponActivityRecord value4(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CouponActivityRecord value5(String value) {
        setTitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CouponActivityRecord value6(Byte value) {
        setBgAction(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CouponActivityRecord value7(Timestamp value) {
        setStartDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CouponActivityRecord value8(Timestamp value) {
        setEndDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CouponActivityRecord value9(String value) {
        setMrkingVoucherId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CouponActivityRecord value10(Byte value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CouponActivityRecord value11(Byte value) {
        setDelFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CouponActivityRecord value12(Timestamp value) {
        setDelTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CouponActivityRecord value13(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CouponActivityRecord value14(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CouponActivityRecord value15(String value) {
        setCustomizeImgPath(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CouponActivityRecord value16(String value) {
        setCustomizeUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CouponActivityRecord values(Integer value1, Byte value2, Byte value3, String value4, String value5, Byte value6, Timestamp value7, Timestamp value8, String value9, Byte value10, Byte value11, Timestamp value12, Timestamp value13, Timestamp value14, String value15, String value16) {
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
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CouponActivityRecord
     */
    public CouponActivityRecord() {
        super(CouponActivity.COUPON_ACTIVITY);
    }

    /**
     * Create a detached, initialised CouponActivityRecord
     */
    public CouponActivityRecord(Integer id, Byte activityAction, Byte action, String name, String title, Byte bgAction, Timestamp startDate, Timestamp endDate, String mrkingVoucherId, Byte status, Byte delFlag, Timestamp delTime, Timestamp createTime, Timestamp updateTime, String customizeImgPath, String customizeUrl) {
        super(CouponActivity.COUPON_ACTIVITY);

        set(0, id);
        set(1, activityAction);
        set(2, action);
        set(3, name);
        set(4, title);
        set(5, bgAction);
        set(6, startDate);
        set(7, endDate);
        set(8, mrkingVoucherId);
        set(9, status);
        set(10, delFlag);
        set(11, delTime);
        set(12, createTime);
        set(13, updateTime);
        set(14, customizeImgPath);
        set(15, customizeUrl);
    }
}
