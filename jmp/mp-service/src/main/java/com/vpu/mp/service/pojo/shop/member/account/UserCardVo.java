package com.vpu.mp.service.pojo.shop.member.account;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.vpu.mp.service.pojo.shop.goods.goods.GoodsSmallVo;
import com.vpu.mp.service.pojo.shop.store.store.StoreBasicVo;

import lombok.Data;
@Data
public class UserCardVo {
	private Integer userId;
	private Integer cardId;
	private Byte uflag;
	private String cardNo;
	private Timestamp expireTime;
	private Byte isDefault;
	private BigDecimal money;
	private Integer surplus;
	private Integer exchangSurplus;
	private Timestamp activationTime;
	private Timestamp uCreateTime;
	
	
	private Integer id;
	private String cardName;
	private Byte cardType;
	private Byte bgType;
	private String bgColor;
	private String bgImg;
	private BigDecimal discount;
	private Integer sorce;
	private String buyScore;
	private Byte expireType;
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private Timestamp startTime;
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private Timestamp endTime;
	private Integer receiveDay;
	private Byte dateType;
	private Byte activation;
	private String receiveCode;
	private String desc;
	private String mobile;
	private Timestamp createTime;
	private Timestamp updateTime;
	private Byte flag;
	private Integer sendMoney;
	private String chargeMoney;
	private Integer useTime;
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private String storeList;
	private Integer count;
	private Byte delFlag;
	private String grade;
	private String gradeCondition;
	private String activationCfg;
	private Byte examine;
	private String discountGoodsId;
	private String discountCatId;
	private String discountSortId;
	private Byte discountIsAll;
	private Byte isPay;
	private Byte payType;
	private BigDecimal payFee;
	private Byte payOwnGood;
	private Byte receiveAction;
	private Byte isExchang;
	private Byte storeUseSwitch;
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private String exchangGoods;
	private Byte exchangFreight;
	private Integer exchangCount;
	private Integer stock;
	private Integer limit;
	private String discountBrandId;
	private Byte sendCouponSwitch;
	private Byte sendCouponType;
	private String sendCouponIds;
	
	// 用户是否有此卡
	private Boolean isGet;
	// 卡是否可用  1 可用，-1不可用
	private Integer status;
	@JsonProperty("startTime")
	private LocalDate startDate;
	@JsonProperty("endTime")
	private LocalDate endDate;
	// 头像
	private String shopAvatar;
	// 累积消费
	private BigDecimal paidAmount;
	// 累积积分
	private Integer scoreAmount;
	private Byte bindMobile;
	private List<GoodsSmallVo> goodsList;
	// 门店信息
	private List<StoreBasicVo> storeInfoList;
	// 优惠券礼包
	private UserCardCouponPack couponPack;
	// 升级进度
	private NextGradeCardVo next;
	private Timestamp buyTime;
	private WxAppCardExamineVo isExamine;
}
