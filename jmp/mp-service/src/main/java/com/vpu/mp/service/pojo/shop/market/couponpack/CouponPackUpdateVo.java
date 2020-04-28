package com.vpu.mp.service.pojo.shop.market.couponpack;

import lombok.Data;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

/**
 * @author: 王兵兵
 * @create: 2019-08-20 17:48
 **/
@Data
public class CouponPackUpdateVo {

    private Integer id;

    private String     actName;
    private Timestamp startTime;
    private Timestamp  endTime;

    /** 礼包名称 */
    private String     packName;

    /** 单用户领取限制次数，0不限制 */
    private Integer    limitGetTimes;

    /** 总数量 */
    private Integer    totalAmount;

    /** 获取方式，0：现金购买，1：积分购买，2直接领取 */
    private Byte       accessMode;

    /** 价格（现金或积分，直接领取时该值为0） */
    private BigDecimal accessCost;

    /**
     * 购物车是否展示，1是
     */
    private Byte showCart;

    /** 活动规则 */
    private String     actRule;

    /** 礼包内的优惠券内容及发放策略 */
    private List<CouponPackUpdateVoucherVo> couponPackVoucher;
}
