/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.main.tables.records;


import com.vpu.mp.db.main.tables.ShopAccount;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Record1;
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
public class ShopAccountRecord extends UpdatableRecordImpl<ShopAccountRecord> {

    private static final long serialVersionUID = -1282601044;

    /**
     * Setter for <code>mini_main.b2c_shop_account.sys_id</code>. 店铺ID
     */
    public void setSysId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_account.sys_id</code>. 店铺ID
     */
    public Integer getSysId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_account.user_name</code>. 用户名
     */
    public void setUserName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_account.user_name</code>. 用户名
     */
    public String getUserName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_account.password</code>. 密码
     */
    public void setPassword(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_account.password</code>. 密码
     */
    public String getPassword() {
        return (String) get(2);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_account.state</code>. 1 入驻申请，2审核通过，3审核不通过,4已禁用
     */
    public void setState(Byte value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_account.state</code>. 1 入驻申请，2审核通过，3审核不通过,4已禁用
     */
    public Byte getState() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_account.business_state</code>. 营业状态 0未营业 1营业
     */
    public void setBusinessState(Byte value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_account.business_state</code>. 营业状态 0未营业 1营业
     */
    public Byte getBusinessState() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_account.shop_grade</code>. 店铺等级：4旗舰店、3精品店、2专营店、1普通店
     */
    public void setShopGrade(Byte value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_account.shop_grade</code>. 店铺等级：4旗舰店、3精品店、2专营店、1普通店
     */
    public Byte getShopGrade() {
        return (Byte) get(5);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_account.max_sku_num</code>. 最大上传sku数量，不同等级不同数量，管理员可修改
     */
    public void setMaxSkuNum(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_account.max_sku_num</code>. 最大上传sku数量，不同等级不同数量，管理员可修改
     */
    public Integer getMaxSkuNum() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_account.max_shop_num</code>. 最多小程序数量，不同等级不同数量，管理员可修改
     */
    public void setMaxShopNum(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_account.max_shop_num</code>. 最多小程序数量，不同等级不同数量，管理员可修改
     */
    public Integer getMaxShopNum() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_account.add_time</code>. 创建时间
     */
    public void setAddTime(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_account.add_time</code>. 创建时间
     */
    public Timestamp getAddTime() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_account.buy_time</code>. 首次续费时间
     */
    public void setBuyTime(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_account.buy_time</code>. 首次续费时间
     */
    public Timestamp getBuyTime() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_account.end_time</code>. 到期时间
     */
    public void setEndTime(Timestamp value) {
        set(10, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_account.end_time</code>. 到期时间
     */
    public Timestamp getEndTime() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_account.last_login_shop_id</code>. 上次登录店铺ID
     */
    public void setLastLoginShopId(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_account.last_login_shop_id</code>. 上次登录店铺ID
     */
    public Integer getLastLoginShopId() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_account.mobile</code>. 店铺账户的手机号
     */
    public void setMobile(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_account.mobile</code>. 店铺账户的手机号
     */
    public String getMobile() {
        return (String) get(12);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_account.account_name</code>. 账户昵称
     */
    public void setAccountName(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_account.account_name</code>. 账户昵称
     */
    public String getAccountName() {
        return (String) get(13);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_account.shop_avatar</code>. 账户头像
     */
    public void setShopAvatar(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_account.shop_avatar</code>. 账户头像
     */
    public String getShopAvatar() {
        return (String) get(14);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_account.company</code>. 公司名称
     */
    public void setCompany(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_account.company</code>. 公司名称
     */
    public String getCompany() {
        return (String) get(15);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_account.salesperson</code>. 销售员
     */
    public void setSalesperson(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_account.salesperson</code>. 销售员
     */
    public String getSalesperson() {
        return (String) get(16);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_account.province_code</code>. 省
     */
    public void setProvinceCode(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_account.province_code</code>. 省
     */
    public String getProvinceCode() {
        return (String) get(17);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_account.city_code</code>. 市
     */
    public void setCityCode(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_account.city_code</code>. 市
     */
    public String getCityCode() {
        return (String) get(18);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_account.district_code</code>. 区
     */
    public void setDistrictCode(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_account.district_code</code>. 区
     */
    public String getDistrictCode() {
        return (String) get(19);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_account.address</code>. 详细地址
     */
    public void setAddress(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_account.address</code>. 详细地址
     */
    public String getAddress() {
        return (String) get(20);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_account.base_sale</code>. 初始销量配置开关：0关闭，1开启
     */
    public void setBaseSale(Byte value) {
        set(21, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_account.base_sale</code>. 初始销量配置开关：0关闭，1开启
     */
    public Byte getBaseSale() {
        return (Byte) get(21);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_account.backlog</code>. 待办事项列表
     */
    public void setBacklog(String value) {
        set(22, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_account.backlog</code>. 待办事项列表
     */
    public String getBacklog() {
        return (String) get(22);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_account.add_comment_switch</code>. 商户自己添加评论开关：0关闭，1开启
     */
    public void setAddCommentSwitch(Byte value) {
        set(23, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_account.add_comment_switch</code>. 商户自己添加评论开关：0关闭，1开启
     */
    public Byte getAddCommentSwitch() {
        return (Byte) get(23);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_account.official_open_id</code>. 公众号openid
     */
    public void setOfficialOpenId(String value) {
        set(24, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_account.official_open_id</code>. 公众号openid
     */
    public String getOfficialOpenId() {
        return (String) get(24);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_account.is_bind</code>. 是否已绑定
     */
    public void setIsBind(Byte value) {
        set(25, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_account.is_bind</code>. 是否已绑定
     */
    public Byte getIsBind() {
        return (Byte) get(25);
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
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ShopAccountRecord
     */
    public ShopAccountRecord() {
        super(ShopAccount.SHOP_ACCOUNT);
    }

    /**
     * Create a detached, initialised ShopAccountRecord
     */
    public ShopAccountRecord(Integer sysId, String userName, String password, Byte state, Byte businessState, Byte shopGrade, Integer maxSkuNum, Integer maxShopNum, Timestamp addTime, Timestamp buyTime, Timestamp endTime, Integer lastLoginShopId, String mobile, String accountName, String shopAvatar, String company, String salesperson, String provinceCode, String cityCode, String districtCode, String address, Byte baseSale, String backlog, Byte addCommentSwitch, String officialOpenId, Byte isBind) {
        super(ShopAccount.SHOP_ACCOUNT);

        set(0, sysId);
        set(1, userName);
        set(2, password);
        set(3, state);
        set(4, businessState);
        set(5, shopGrade);
        set(6, maxSkuNum);
        set(7, maxShopNum);
        set(8, addTime);
        set(9, buyTime);
        set(10, endTime);
        set(11, lastLoginShopId);
        set(12, mobile);
        set(13, accountName);
        set(14, shopAvatar);
        set(15, company);
        set(16, salesperson);
        set(17, provinceCode);
        set(18, cityCode);
        set(19, districtCode);
        set(20, address);
        set(21, baseSale);
        set(22, backlog);
        set(23, addCommentSwitch);
        set(24, officialOpenId);
        set(25, isBind);
    }
}
