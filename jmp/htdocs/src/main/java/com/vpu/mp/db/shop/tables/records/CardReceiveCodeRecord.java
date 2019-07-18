/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables.records;


import com.vpu.mp.db.shop.tables.CardReceiveCode;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record14;
import org.jooq.Row14;
import org.jooq.impl.UpdatableRecordImpl;


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
public class CardReceiveCodeRecord extends UpdatableRecordImpl<CardReceiveCodeRecord> implements Record14<Integer, Integer, Integer, Integer, String, String, String, Integer, Timestamp, String, Byte, Timestamp, Timestamp, Timestamp> {

    private static final long serialVersionUID = -1379224730;

    /**
     * Setter for <code>mini_shop_471752.b2c_card_receive_code.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_card_receive_code.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_card_receive_code.card_id</code>. 卡号id
     */
    public void setCardId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_card_receive_code.card_id</code>. 卡号id
     */
    public Integer getCardId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_card_receive_code.batch_id</code>. 批次id
     */
    public void setBatchId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_card_receive_code.batch_id</code>. 批次id
     */
    public Integer getBatchId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_card_receive_code.group_id</code>. 分组id
     */
    public void setGroupId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_card_receive_code.group_id</code>. 分组id
     */
    public Integer getGroupId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_card_receive_code.code</code>. 领取码
     */
    public void setCode(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_card_receive_code.code</code>. 领取码
     */
    public String getCode() {
        return (String) get(4);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_card_receive_code.card_no</code>. 卡号
     */
    public void setCardNo(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_card_receive_code.card_no</code>. 卡号
     */
    public String getCardNo() {
        return (String) get(5);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_card_receive_code.card_pwd</code>. 卡密码
     */
    public void setCardPwd(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_card_receive_code.card_pwd</code>. 卡密码
     */
    public String getCardPwd() {
        return (String) get(6);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_card_receive_code.user_id</code>. 领取人
     */
    public void setUserId(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_card_receive_code.user_id</code>. 领取人
     */
    public Integer getUserId() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_card_receive_code.receive_time</code>. 领取时间
     */
    public void setReceiveTime(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_card_receive_code.receive_time</code>. 领取时间
     */
    public Timestamp getReceiveTime() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_card_receive_code.error_msg</code>. 错误说明
     */
    public void setErrorMsg(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_card_receive_code.error_msg</code>. 错误说明
     */
    public String getErrorMsg() {
        return (String) get(9);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_card_receive_code.del_flag</code>.
     */
    public void setDelFlag(Byte value) {
        set(10, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_card_receive_code.del_flag</code>.
     */
    public Byte getDelFlag() {
        return (Byte) get(10);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_card_receive_code.del_time</code>. 删除时间
     */
    public void setDelTime(Timestamp value) {
        set(11, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_card_receive_code.del_time</code>. 删除时间
     */
    public Timestamp getDelTime() {
        return (Timestamp) get(11);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_card_receive_code.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(12, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_card_receive_code.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(12);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_card_receive_code.update_time</code>. 最后修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(13, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_card_receive_code.update_time</code>. 最后修改时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(13);
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
    // Record14 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<Integer, Integer, Integer, Integer, String, String, String, Integer, Timestamp, String, Byte, Timestamp, Timestamp, Timestamp> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<Integer, Integer, Integer, Integer, String, String, String, Integer, Timestamp, String, Byte, Timestamp, Timestamp, Timestamp> valuesRow() {
        return (Row14) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return CardReceiveCode.CARD_RECEIVE_CODE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return CardReceiveCode.CARD_RECEIVE_CODE.CARD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return CardReceiveCode.CARD_RECEIVE_CODE.BATCH_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return CardReceiveCode.CARD_RECEIVE_CODE.GROUP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return CardReceiveCode.CARD_RECEIVE_CODE.CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return CardReceiveCode.CARD_RECEIVE_CODE.CARD_NO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return CardReceiveCode.CARD_RECEIVE_CODE.CARD_PWD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return CardReceiveCode.CARD_RECEIVE_CODE.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return CardReceiveCode.CARD_RECEIVE_CODE.RECEIVE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return CardReceiveCode.CARD_RECEIVE_CODE.ERROR_MSG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field11() {
        return CardReceiveCode.CARD_RECEIVE_CODE.DEL_FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return CardReceiveCode.CARD_RECEIVE_CODE.DEL_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field13() {
        return CardReceiveCode.CARD_RECEIVE_CODE.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field14() {
        return CardReceiveCode.CARD_RECEIVE_CODE.UPDATE_TIME;
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
    public Integer component2() {
        return getCardId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getBatchId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getGroupId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getCardNo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getCardPwd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component9() {
        return getReceiveTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getErrorMsg();
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
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getCardId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getBatchId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getGroupId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getCardNo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getCardPwd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getReceiveTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getErrorMsg();
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
    public CardReceiveCodeRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CardReceiveCodeRecord value2(Integer value) {
        setCardId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CardReceiveCodeRecord value3(Integer value) {
        setBatchId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CardReceiveCodeRecord value4(Integer value) {
        setGroupId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CardReceiveCodeRecord value5(String value) {
        setCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CardReceiveCodeRecord value6(String value) {
        setCardNo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CardReceiveCodeRecord value7(String value) {
        setCardPwd(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CardReceiveCodeRecord value8(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CardReceiveCodeRecord value9(Timestamp value) {
        setReceiveTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CardReceiveCodeRecord value10(String value) {
        setErrorMsg(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CardReceiveCodeRecord value11(Byte value) {
        setDelFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CardReceiveCodeRecord value12(Timestamp value) {
        setDelTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CardReceiveCodeRecord value13(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CardReceiveCodeRecord value14(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CardReceiveCodeRecord values(Integer value1, Integer value2, Integer value3, Integer value4, String value5, String value6, String value7, Integer value8, Timestamp value9, String value10, Byte value11, Timestamp value12, Timestamp value13, Timestamp value14) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CardReceiveCodeRecord
     */
    public CardReceiveCodeRecord() {
        super(CardReceiveCode.CARD_RECEIVE_CODE);
    }

    /**
     * Create a detached, initialised CardReceiveCodeRecord
     */
    public CardReceiveCodeRecord(Integer id, Integer cardId, Integer batchId, Integer groupId, String code, String cardNo, String cardPwd, Integer userId, Timestamp receiveTime, String errorMsg, Byte delFlag, Timestamp delTime, Timestamp createTime, Timestamp updateTime) {
        super(CardReceiveCode.CARD_RECEIVE_CODE);

        set(0, id);
        set(1, cardId);
        set(2, batchId);
        set(3, groupId);
        set(4, code);
        set(5, cardNo);
        set(6, cardPwd);
        set(7, userId);
        set(8, receiveTime);
        set(9, errorMsg);
        set(10, delFlag);
        set(11, delTime);
        set(12, createTime);
        set(13, updateTime);
    }
}
