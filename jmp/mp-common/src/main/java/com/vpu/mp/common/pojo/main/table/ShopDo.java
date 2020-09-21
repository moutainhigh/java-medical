/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.common.pojo.main.table;


import lombok.Data;

import javax.annotation.Generated;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * 店铺
 * @author 孔德成
 * @date 2020/8/26 15:31
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@Data
public class ShopDo implements Serializable {

    private static final long serialVersionUID = 1595164120;

    private Integer    shopId;
    private Integer    sysId;
    private String     mobile;
    private String     receiveMobile;
    private String     shopName;
    private String     shopAvatar;
    private String     shopBgPath;
    private String     shopPhone;
    private String     shopNotice;
    private String     shopWx;
    private String     shopEmail;
    private Timestamp  created;
    private Byte       isEnabled;
    private Integer    provinceCode;
    private String     provinceName;
    private Integer    cityCode;
    private String     cityName;
    private Integer    districtCode;
    private String     districtName;
    private String     address;
    private String     completeAddress;
    private Integer    shopSellType;
    private String     shopQq;
    private String     lastLoginIp;
    private Byte       state;
    private Byte       businessState;
    private BigDecimal manageFee;
    private BigDecimal surplus;
    private String     dbConfig;
    private String     shopType;
    private String     versionConfig;
    private Byte       shopFlag;
    private String     memberKey;
    private String     tenancyName;
    private String     userName;
    private String     password;
    private String     smsAccount;
    private Byte       kuajinggou;
    private Byte       orderRealName;
    private Byte       hidBottom;
    private String     logo;
    private String     currency;
    private String     shopLanguage;
    private Timestamp  expireTime;
    private String     storeClerkPrivilegeList;
    private String     publicityImg;
    private String     copywriting;
    private String     cachet;
}
