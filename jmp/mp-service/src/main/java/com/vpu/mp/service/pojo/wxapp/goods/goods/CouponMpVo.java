package com.vpu.mp.service.pojo.wxapp.goods.goods;

import lombok.Data;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * 优惠券
 * @author 李晓冰
 * @date 2019年11月08日
 */
@Data
public class CouponMpVo {
    /**优惠券类型voucher是减金额，discount打折*/
    private String actCode;
    /**优惠券面额*/
    private BigDecimal denomination;
    /**是否存在使用门槛 0否 1是*/
    private Byte useConsumeRestrict;
    /** 满多少可用*/
    private BigDecimal leastConsume;

    private Integer id;
    /**优惠券类型0普通，1分裂*/
    private Byte type;
    private String actName;
    private Timestamp startTime;
    private Timestamp endTime;
    /**优惠券使用时间类型 1领取后开始指定时间段内有效，0固定时间段有效*/
    private Byte validityType;
    private Integer validity;
    private Integer validityHour;
    private Integer validityMinute;
    /**是否使用积分*/
    private Byte useScore;
    /**积分兑换量*/
    private Integer scoreNumber;
    /**是否会员专享优惠券*/
    private Boolean isCardExclusive;
    /**当前用户是否可以领取*/
    private Boolean canFetch;
}
