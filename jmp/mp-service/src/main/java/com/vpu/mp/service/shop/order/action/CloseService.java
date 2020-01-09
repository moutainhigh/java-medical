package com.vpu.mp.service.shop.order.action;

import com.vpu.mp.db.shop.tables.records.OrderInfoRecord;
import com.vpu.mp.service.foundation.data.JsonResultCode;
import com.vpu.mp.service.foundation.exception.MpException;
import com.vpu.mp.service.foundation.service.ShopBaseService;
import com.vpu.mp.service.foundation.util.BigDecimalUtil;
import com.vpu.mp.service.foundation.util.BigDecimalUtil.BigDecimalPlus;
import com.vpu.mp.service.foundation.util.BigDecimalUtil.Operator;
import com.vpu.mp.service.pojo.shop.member.card.CardConstant;
import com.vpu.mp.service.pojo.shop.member.data.AccountData;
import com.vpu.mp.service.pojo.shop.member.data.ScoreData;
import com.vpu.mp.service.pojo.shop.member.data.UserCardData;
import com.vpu.mp.service.pojo.shop.operation.RecordContentTemplate;
import com.vpu.mp.service.pojo.shop.operation.RecordTradeEnum;
import com.vpu.mp.service.pojo.shop.operation.RemarkTemplate;
import com.vpu.mp.service.pojo.shop.operation.TradeOptParam;
import com.vpu.mp.service.pojo.shop.order.OrderConstant;
import com.vpu.mp.service.pojo.shop.order.OrderInfoVo;
import com.vpu.mp.service.pojo.shop.order.write.operate.OrderOperateQueryParam;
import com.vpu.mp.service.pojo.shop.order.write.operate.OrderServiceCode;
import com.vpu.mp.service.shop.operation.RecordAdminActionService;
import com.vpu.mp.service.shop.operation.RecordTradeService;
import com.vpu.mp.service.shop.order.action.base.ExecuteResult;
import com.vpu.mp.service.shop.order.action.base.IorderOperate;
import com.vpu.mp.service.shop.order.action.base.OrderOperationJudgment;
import com.vpu.mp.service.shop.order.info.OrderInfoService;
import com.vpu.mp.service.shop.order.record.OrderActionService;
import com.vpu.mp.service.shop.order.refund.ReturnMethodService;
import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Arrays;

/**
 * 	订单关闭、
 * @author 王帅
 *
 */
@Component
public class CloseService extends ShopBaseService implements IorderOperate<OrderOperateQueryParam,OrderOperateQueryParam> {

	@Autowired
	private OrderInfoService orderInfo;

	@Autowired
	private RecordTradeService recordMemberTrade;

	@Autowired
	public RecordAdminActionService record;

	@Autowired
	private OrderActionService orderAction;

    @Autowired
    private ReturnMethodService returnMethod;

	@Override
	public OrderServiceCode getServiceCode() {
		return OrderServiceCode.CLOSE;
	}

    @Override
	public Object query(OrderOperateQueryParam param) throws MpException {
		return null;
	}



    @Override
	public ExecuteResult execute(OrderOperateQueryParam param) {

		OrderInfoVo order = orderInfo.getByOrderId(param.getOrderId(), OrderInfoVo.class);
		if(order == null) {
			return ExecuteResult.create(JsonResultCode.CODE_ORDER_NOT_EXIST, null);
		}
		if(!OrderOperationJudgment.mpIsClose(order)) {
            logger().error("该订单不能关闭");
			return ExecuteResult.create(JsonResultCode.CODE_ORDER_CLOSE_NOT_CLOSE, null);
		}
		try {
			transaction(()->{
				returnOrder(order);
				//TODO 好友代付退
				orderInfo.setOrderstatus(order.getOrderSn(), OrderConstant.ORDER_CLOSED);
				//操作记录

			});
		} catch (Exception e) {
			return ExecuteResult.create(JsonResultCode.CODE_ORDER_CLOSE_FAIL, null);
		}
		//订单状态记录
		orderAction.addRecord(order, param, order.getOrderStatus() , "商家关闭订单");
		//操作记录
		record.insertRecord(Arrays.asList(new Integer[] { RecordContentTemplate.ORDER_CLOSE.code }), new String[] {param.getOrderSn()});
		return null;
	}

	public void returnOrder(OrderInfoVo order) throws MpException {
	    if(order.getOrderPayWay().equals(OrderConstant.PAY_WAY_DEPOSIT)){
	        //预售订单特殊处理
            if(order.getBkReturnType() != null && order.getBkReturnType().equals(OrderConstant.BK_RETURN_TYPE_Y)){
                //设置了自动退款
                if(BigDecimalUtil.compareTo(order.getMoneyPaid(), null) > 0) {
                    returnMethod.refundMoneyPaid(order,0,order.getMoneyPaid());
                }
            }
        }
        if(BigDecimalUtil.compareTo(order.getScoreDiscount(), null) > 0) {
            //积分
            refundScoreDiscount(order, order.getScoreDiscount());
        }
        if(BigDecimalUtil.compareTo(order.getUseAccount(), null) > 0) {
            refundUseAccount(order, order.getUseAccount());
            //余额
        }
        if(BigDecimalUtil.compareTo(order.getMemberCardBalance(), null) > 0) {
            //卡余额
            refundMemberCardBalance(order, order.getMemberCardBalance());
        }
	}
	/**
	 * 	退会员卡余额
	 * @param order
	 * @param money
	 * @throws MpException
	 */
	public void refundMemberCardBalance(OrderInfoVo order , BigDecimal money) throws MpException {
		if(BigDecimalUtil.compareTo(money, null) == 0) {
			return;
		}
		/**
		 * 交易记录信息
		 */
		TradeOptParam tradeOpt = TradeOptParam
				.builder()
				.adminUserId(0)
				.tradeType(RecordTradeEnum.TYPE_CRASH_MCARD_ACCOUNT_REFUND.val())
				.tradeFlow(RecordTradeEnum.TRADE_FLOW_OUT.val())
				.build();
		UserCardData userCardData = UserCardData.newBuilder().
		userId(order.getUserId()).
		cardId(order.getCardId()).
		cardNo(order.getCardNo()).
		money(money).
		reason("订单关闭，订单会员卡余额支付退款").
		//普通会员卡
		type(CardConstant.MCARD_TP_NORMAL).
		orderSn(order.getOrderSn()).
		tradeOpt(tradeOpt).build();
		//调用退会员卡接口
		recordMemberTrade.updateUserEconomicData(userCardData);
	}

	/**
	 * 	退余额
	 * @param order
	 * @param money
	 * @throws MpException
	 */
	public void refundUseAccount(OrderInfoVo order , BigDecimal money) throws MpException {
		if(BigDecimalUtil.compareTo(money, null) == 0) {
			return;
		}
		AccountData accountData = AccountData.newBuilder().
		userId(order.getUserId()).
		orderSn(order.getOrderSn()).
		//退款金额
		amount(money).
		remarkCode(RemarkTemplate.ORDER_CLOSE.code).
		remarkData(order.getOrderSn()).
		//remark("订单关闭："+order.getOrderSn()+"余额退款").
		payment(order.getPayCode()).
		//支付类型
		isPaid(RecordTradeEnum.UACCOUNT_RECHARGE.val()).
		//后台处理时为操作人id为0
		adminUser(0).
		//用户余额退款
		tradeType(RecordTradeEnum.TYPE_CRASH_MACCOUNT_REFUND.val()).
		//资金流量-支出
		tradeFlow(RecordTradeEnum.TRADE_FLOW_OUT.val()).build();
		//调用退余额接口
		recordMemberTrade.updateUserEconomicData(accountData);
	}

	/**
	 * 	积分退款
	 * @param order
	 * @param money
	 * @return
	 * @throws MpException
	 */
	public void refundScoreDiscount(OrderInfoVo order , BigDecimal money) throws MpException {
		if(BigDecimalUtil.compareTo(money, null) == 0) {
			return;
		}
		//金额换算成积分
		Integer score = BigDecimalUtil.multiplyOrDivide(
				BigDecimalPlus.create(new BigDecimal(OrderConstant.TUAN_FEN_RATIO), Operator.multiply),
				BigDecimalPlus.create(money,null)
				).intValue();

		ScoreData scoreData = ScoreData.newBuilder().
		userId(order.getUserId()).
		orderSn(order.getOrderSn()).
		//退款积分
		score(score).
		remarkCode(RemarkTemplate.ORDER_CLOSE_SCORE_ACCOUNT.code).
		remarkData(order.getOrderSn()).
		//remark("订单关闭："+order.getOrderSn()+"退款，退积分：score").
		//后台处理时为操作人id为0
		adminUser(0).
		//用户余额充值
		tradeType(RecordTradeEnum.TYPE_CRASH_POWER_MACCOUNT.val()).
		//资金流量-支出
		tradeFlow(RecordTradeEnum.TRADE_FLOW_OUT.val()).
		//积分变动是否来自退款
		isFromRefund(RecordTradeEnum.IS_FROM_REFUND_Y.val()).build();
		//调用退积分接口
		recordMemberTrade.updateUserEconomicData(scoreData);
	}

    /**
     * 自动任务关闭订单
     */
	public void autoCloseOrders(){
        Result<OrderInfoRecord> orders = orderInfo.getCanAutoCloseOrders();
        orders.forEach(order->{
            OrderOperateQueryParam param = new OrderOperateQueryParam();
            param.setAction(Integer.valueOf(OrderServiceCode.CLOSE.ordinal()).byteValue());
            param.setIsMp(OrderConstant.IS_MP_AUTO);
            param.setOrderId(order.getOrderId());
            param.setOrderSn(order.getOrderSn());
            ExecuteResult result = execute(param);
            if(result == null || result.isSuccess()) {
                //TODO 退优惠券
                logger().info("订单自动任务,关闭订单成功,orderSn:{}", order.getOrderSn());
            }else {
                logger().error("订单自动任务,关闭订单失败,orderSn:{},错误信息{}{}", order.getOrderSn(), result.getErrorCode().toString() , result.getErrorParam());
            }
        });
    }
}
