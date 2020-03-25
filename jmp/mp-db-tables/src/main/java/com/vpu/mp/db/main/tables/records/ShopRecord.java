/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.main.tables.records;


import com.vpu.mp.db.main.tables.Shop;

import java.math.BigDecimal;
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
public class ShopRecord extends UpdatableRecordImpl<ShopRecord> {

    private static final long serialVersionUID = -1437751620;

    /**
     * Setter for <code>mini_main.b2c_shop.shop_id</code>. 店铺ID
     */
    public void setShopId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop.shop_id</code>. 店铺ID
     */
    public Integer getShopId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_main.b2c_shop.sys_id</code>.
     */
    public void setSysId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop.sys_id</code>.
     */
    public Integer getSysId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>mini_main.b2c_shop.mobile</code>.
     */
    public void setMobile(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop.mobile</code>.
     */
    public String getMobile() {
        return (String) get(2);
    }

    /**
     * Setter for <code>mini_main.b2c_shop.receive_mobile</code>.  接收通知手机号码
     */
    public void setReceiveMobile(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop.receive_mobile</code>.  接收通知手机号码
     */
    public String getReceiveMobile() {
        return (String) get(3);
    }

    /**
     * Setter for <code>mini_main.b2c_shop.shop_name</code>. 店铺名称
     */
    public void setShopName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop.shop_name</code>. 店铺名称
     */
    public String getShopName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>mini_main.b2c_shop.shop_avatar</code>. 店铺头像
     */
    public void setShopAvatar(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop.shop_avatar</code>. 店铺头像
     */
    public String getShopAvatar() {
        return (String) get(5);
    }

    /**
     * Setter for <code>mini_main.b2c_shop.shop_bg_path</code>. 店铺背景图片
     */
    public void setShopBgPath(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop.shop_bg_path</code>. 店铺背景图片
     */
    public String getShopBgPath() {
        return (String) get(6);
    }

    /**
     * Setter for <code>mini_main.b2c_shop.shop_phone</code>. 店铺客服电话
     */
    public void setShopPhone(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop.shop_phone</code>. 店铺客服电话
     */
    public String getShopPhone() {
        return (String) get(7);
    }

    /**
     * Setter for <code>mini_main.b2c_shop.shop_notice</code>. 店铺公告
     */
    public void setShopNotice(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop.shop_notice</code>. 店铺公告
     */
    public String getShopNotice() {
        return (String) get(8);
    }

    /**
     * Setter for <code>mini_main.b2c_shop.shop_wx</code>. 店铺客服微信
     */
    public void setShopWx(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop.shop_wx</code>. 店铺客服微信
     */
    public String getShopWx() {
        return (String) get(9);
    }

    /**
     * Setter for <code>mini_main.b2c_shop.shop_email</code>.
     */
    public void setShopEmail(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop.shop_email</code>.
     */
    public String getShopEmail() {
        return (String) get(10);
    }

    /**
     * Setter for <code>mini_main.b2c_shop.created</code>. 创建时间
     */
    public void setCreated(Timestamp value) {
        set(11, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop.created</code>. 创建时间
     */
    public Timestamp getCreated() {
        return (Timestamp) get(11);
    }

    /**
     * Setter for <code>mini_main.b2c_shop.is_enabled</code>. 是否可用
     */
    public void setIsEnabled(Byte value) {
        set(12, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop.is_enabled</code>. 是否可用
     */
    public Byte getIsEnabled() {
        return (Byte) get(12);
    }

    /**
     * Setter for <code>mini_main.b2c_shop.province_code</code>. 所在省
     */
    public void setProvinceCode(Integer value) {
        set(13, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop.province_code</code>. 所在省
     */
    public Integer getProvinceCode() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>mini_main.b2c_shop.province_name</code>.
     */
    public void setProvinceName(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop.province_name</code>.
     */
    public String getProvinceName() {
        return (String) get(14);
    }

    /**
     * Setter for <code>mini_main.b2c_shop.city_code</code>. 所在城市
     */
    public void setCityCode(Integer value) {
        set(15, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop.city_code</code>. 所在城市
     */
    public Integer getCityCode() {
        return (Integer) get(15);
    }

    /**
     * Setter for <code>mini_main.b2c_shop.city_name</code>.
     */
    public void setCityName(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop.city_name</code>.
     */
    public String getCityName() {
        return (String) get(16);
    }

    /**
     * Setter for <code>mini_main.b2c_shop.district_code</code>. 所在区县
     */
    public void setDistrictCode(Integer value) {
        set(17, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop.district_code</code>. 所在区县
     */
    public Integer getDistrictCode() {
        return (Integer) get(17);
    }

    /**
     * Setter for <code>mini_main.b2c_shop.district_name</code>.
     */
    public void setDistrictName(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop.district_name</code>.
     */
    public String getDistrictName() {
        return (String) get(18);
    }

    /**
     * Setter for <code>mini_main.b2c_shop.address</code>. 所在地址
     */
    public void setAddress(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop.address</code>. 所在地址
     */
    public String getAddress() {
        return (String) get(19);
    }

    /**
     * Setter for <code>mini_main.b2c_shop.complete_address</code>. 所在完整地址
     */
    public void setCompleteAddress(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop.complete_address</code>. 所在完整地址
     */
    public String getCompleteAddress() {
        return (String) get(20);
    }

    /**
     * Setter for <code>mini_main.b2c_shop.shop_sell_type</code>. 经营品类,254：其他
     */
    public void setShopSellType(Integer value) {
        set(21, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop.shop_sell_type</code>. 经营品类,254：其他
     */
    public Integer getShopSellType() {
        return (Integer) get(21);
    }

    /**
     * Setter for <code>mini_main.b2c_shop.shop_qq</code>. 店铺客服QQ
     */
    public void setShopQq(String value) {
        set(22, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop.shop_qq</code>. 店铺客服QQ
     */
    public String getShopQq() {
        return (String) get(22);
    }

    /**
     * Setter for <code>mini_main.b2c_shop.last_login_ip</code>. 上次登录IP
     */
    public void setLastLoginIp(String value) {
        set(23, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop.last_login_ip</code>. 上次登录IP
     */
    public String getLastLoginIp() {
        return (String) get(23);
    }

    /**
     * Setter for <code>mini_main.b2c_shop.state</code>. 0 入驻申请，1审核通过，2审核不通过
     */
    public void setState(Byte value) {
        set(24, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop.state</code>. 0 入驻申请，1审核通过，2审核不通过
     */
    public Byte getState() {
        return (Byte) get(24);
    }

    /**
     * Setter for <code>mini_main.b2c_shop.business_state</code>. 营业状态 0未营业 1营业
     */
    public void setBusinessState(Byte value) {
        set(25, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop.business_state</code>. 营业状态 0未营业 1营业
     */
    public Byte getBusinessState() {
        return (Byte) get(25);
    }

    /**
     * Setter for <code>mini_main.b2c_shop.manage_fee</code>. 平台管理费
     */
    public void setManageFee(BigDecimal value) {
        set(26, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop.manage_fee</code>. 平台管理费
     */
    public BigDecimal getManageFee() {
        return (BigDecimal) get(26);
    }

    /**
     * Setter for <code>mini_main.b2c_shop.surplus</code>. 余额
     */
    public void setSurplus(BigDecimal value) {
        set(27, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop.surplus</code>. 余额
     */
    public BigDecimal getSurplus() {
        return (BigDecimal) get(27);
    }

    /**
     * Setter for <code>mini_main.b2c_shop.db_config</code>. db config,json format
     */
    public void setDbConfig(String value) {
        set(28, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop.db_config</code>. db config,json format
     */
    public String getDbConfig() {
        return (String) get(28);
    }

    /**
     * Setter for <code>mini_main.b2c_shop.shop_type</code>. 店铺类型
     */
    public void setShopType(String value) {
        set(29, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop.shop_type</code>. 店铺类型
     */
    public String getShopType() {
        return (String) get(29);
    }

    /**
     * Setter for <code>mini_main.b2c_shop.version_config</code>. 店铺功能
     */
    public void setVersionConfig(String value) {
        set(30, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop.version_config</code>. 店铺功能
     */
    public String getVersionConfig() {
        return (String) get(30);
    }

    /**
     * Setter for <code>mini_main.b2c_shop.shop_flag</code>. 店铺标志：0店家，1欧派，2嗨购
     */
    public void setShopFlag(Byte value) {
        set(31, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop.shop_flag</code>. 店铺标志：0店家，1欧派，2嗨购
     */
    public Byte getShopFlag() {
        return (Byte) get(31);
    }

    /**
     * Setter for <code>mini_main.b2c_shop.member_key</code>. 欧派店铺标识
     */
    public void setMemberKey(String value) {
        set(32, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop.member_key</code>. 欧派店铺标识
     */
    public String getMemberKey() {
        return (String) get(32);
    }

    /**
     * Setter for <code>mini_main.b2c_shop.tenancy_name</code>. 欧派创思大屏租户名称
     */
    public void setTenancyName(String value) {
        set(33, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop.tenancy_name</code>. 欧派创思大屏租户名称
     */
    public String getTenancyName() {
        return (String) get(33);
    }

    /**
     * Setter for <code>mini_main.b2c_shop.user_name</code>. 欧派创思大屏用户名
     */
    public void setUserName(String value) {
        set(34, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop.user_name</code>. 欧派创思大屏用户名
     */
    public String getUserName() {
        return (String) get(34);
    }

    /**
     * Setter for <code>mini_main.b2c_shop.password</code>. 欧派创思大屏密码
     */
    public void setPassword(String value) {
        set(35, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop.password</code>. 欧派创思大屏密码
     */
    public String getPassword() {
        return (String) get(35);
    }

    /**
     * Setter for <code>mini_main.b2c_shop.sms_account</code>. 短信账号
     */
    public void setSmsAccount(String value) {
        set(36, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop.sms_account</code>. 短信账号
     */
    public String getSmsAccount() {
        return (String) get(36);
    }

    /**
     * Setter for <code>mini_main.b2c_shop.kuajinggou</code>. 跨境购
     */
    public void setKuajinggou(Byte value) {
        set(37, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop.kuajinggou</code>. 跨境购
     */
    public Byte getKuajinggou() {
        return (Byte) get(37);
    }

    /**
     * Setter for <code>mini_main.b2c_shop.order_real_name</code>. 下单实名制
     */
    public void setOrderRealName(Byte value) {
        set(38, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop.order_real_name</code>. 下单实名制
     */
    public Byte getOrderRealName() {
        return (Byte) get(38);
    }

    /**
     * Setter for <code>mini_main.b2c_shop.hid_bottom</code>. 是否隐藏底部 1是 
     */
    public void setHidBottom(Byte value) {
        set(39, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop.hid_bottom</code>. 是否隐藏底部 1是 
     */
    public Byte getHidBottom() {
        return (Byte) get(39);
    }

    /**
     * Setter for <code>mini_main.b2c_shop.logo</code>. 小程序logo
     */
    public void setLogo(String value) {
        set(40, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop.logo</code>. 小程序logo
     */
    public String getLogo() {
        return (String) get(40);
    }

    /**
     * Setter for <code>mini_main.b2c_shop.currency</code>. 币种
     */
    public void setCurrency(String value) {
        set(41, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop.currency</code>. 币种
     */
    public String getCurrency() {
        return (String) get(41);
    }

    /**
     * Setter for <code>mini_main.b2c_shop.shop_language</code>. 语言
     */
    public void setShopLanguage(String value) {
        set(42, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop.shop_language</code>. 语言
     */
    public String getShopLanguage() {
        return (String) get(42);
    }

    /**
     * Setter for <code>mini_main.b2c_shop.expire_time</code>. 到期时间
     */
    public void setExpireTime(Timestamp value) {
        set(43, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop.expire_time</code>. 到期时间
     */
    public Timestamp getExpireTime() {
        return (Timestamp) get(43);
    }

    /**
     * Setter for <code>mini_main.b2c_shop.store_clerk_privilege_list</code>. 门店店员权限列表
     */
    public void setStoreClerkPrivilegeList(String value) {
        set(44, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop.store_clerk_privilege_list</code>. 门店店员权限列表
     */
    public String getStoreClerkPrivilegeList() {
        return (String) get(44);
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
     * Create a detached ShopRecord
     */
    public ShopRecord() {
        super(Shop.SHOP);
    }

    /**
     * Create a detached, initialised ShopRecord
     */
    public ShopRecord(Integer shopId, Integer sysId, String mobile, String receiveMobile, String shopName, String shopAvatar, String shopBgPath, String shopPhone, String shopNotice, String shopWx, String shopEmail, Timestamp created, Byte isEnabled, Integer provinceCode, String provinceName, Integer cityCode, String cityName, Integer districtCode, String districtName, String address, String completeAddress, Integer shopSellType, String shopQq, String lastLoginIp, Byte state, Byte businessState, BigDecimal manageFee, BigDecimal surplus, String dbConfig, String shopType, String versionConfig, Byte shopFlag, String memberKey, String tenancyName, String userName, String password, String smsAccount, Byte kuajinggou, Byte orderRealName, Byte hidBottom, String logo, String currency, String shopLanguage, Timestamp expireTime, String storeClerkPrivilegeList) {
        super(Shop.SHOP);

        set(0, shopId);
        set(1, sysId);
        set(2, mobile);
        set(3, receiveMobile);
        set(4, shopName);
        set(5, shopAvatar);
        set(6, shopBgPath);
        set(7, shopPhone);
        set(8, shopNotice);
        set(9, shopWx);
        set(10, shopEmail);
        set(11, created);
        set(12, isEnabled);
        set(13, provinceCode);
        set(14, provinceName);
        set(15, cityCode);
        set(16, cityName);
        set(17, districtCode);
        set(18, districtName);
        set(19, address);
        set(20, completeAddress);
        set(21, shopSellType);
        set(22, shopQq);
        set(23, lastLoginIp);
        set(24, state);
        set(25, businessState);
        set(26, manageFee);
        set(27, surplus);
        set(28, dbConfig);
        set(29, shopType);
        set(30, versionConfig);
        set(31, shopFlag);
        set(32, memberKey);
        set(33, tenancyName);
        set(34, userName);
        set(35, password);
        set(36, smsAccount);
        set(37, kuajinggou);
        set(38, orderRealName);
        set(39, hidBottom);
        set(40, logo);
        set(41, currency);
        set(42, shopLanguage);
        set(43, expireTime);
        set(44, storeClerkPrivilegeList);
    }
}
