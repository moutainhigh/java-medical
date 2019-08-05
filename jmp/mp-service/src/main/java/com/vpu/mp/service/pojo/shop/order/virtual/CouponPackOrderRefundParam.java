package com.vpu.mp.service.pojo.shop.order.virtual;

import java.math.BigDecimal;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author huangronggang
 * @date 2019年8月2日
 */
@Data
@NoArgsConstructor
public class CouponPackOrderRefundParam {
	
	/** 订单ID */
	private Integer orderId;
	/** 用户ID*/
	private Integer userId;
	
	/** 会员卡ID */
	private Integer cardId;
	
	/** 会员卡号 */
	private String cardNo;
	
	/** 订单号 */
	private String orderSn;
	
	/** 退积分 */
	private BigDecimal refundScore;
	/** 退现金 */
	private BigDecimal refundMoney;
	/** 退余额 */
	private BigDecimal refundAccount;
	/** 退会员卡余额 */
	private BigDecimal refundBalance;
	
	private Byte stillSendFlag=1;
}

