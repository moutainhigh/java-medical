package com.vpu.mp.service.shop.order.action;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vpu.mp.service.foundation.data.JsonResultCode;
import com.vpu.mp.service.foundation.service.ShopBaseService;
import com.vpu.mp.service.pojo.shop.order.OrderConstant;
import com.vpu.mp.service.pojo.shop.order.OrderListInfoVo;
import com.vpu.mp.service.pojo.shop.order.write.operate.OrderOperateQueryParam;
import com.vpu.mp.service.pojo.shop.order.write.operate.OrderServiceCode;
import com.vpu.mp.service.pojo.shop.order.write.operate.refund.RefundVo;
import com.vpu.mp.service.pojo.shop.order.write.operate.refund.RefundVo.RefundVoGoods;
import com.vpu.mp.service.pojo.shop.order.write.operate.refund.money.RefundMoneyParam;
import com.vpu.mp.service.shop.order.action.base.IorderOperate;
import com.vpu.mp.service.shop.order.action.base.OrderOperationJudgment;
import com.vpu.mp.service.shop.order.goods.OrderGoodsService;
import com.vpu.mp.service.shop.order.info.OrderInfoService;
import com.vpu.mp.service.shop.order.refund.ReturnOrderService;
import com.vpu.mp.service.shop.order.refund.goods.ReturnOrderGoodsService;
import com.vpu.mp.service.shop.order.refund.record.RefundAmountRecordService;

@Component 
public class ReturnService extends ShopBaseService implements IorderOperate {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private OrderInfoService orderInfo;
	@Autowired
	private RefundAmountRecordService refundAmountRecord;
	@Autowired
	private ReturnOrderService returnOrder;
	@Autowired
	private OrderGoodsService orderGoods;
	@Autowired
	private ReturnOrderGoodsService returnOrderGoods;
	
	@Override
	public OrderServiceCode getServiceCode() {
		return OrderServiceCode.MP_REFUND_MONEY_APPLY;
	}
	
	/**
	 * 退款、退货查询
	 * @param SellerRemarkParam,isMp(T小程序端/F后台手工退款)
	 * @return RefundVo
	 */
	@Override
	public JsonResultCode execute(Object obj) {
		if(obj instanceof RefundMoneyParam) {
			return JsonResultCode.CODE_ORDER_OPERATE_NO_INSTANCEOF;
		}
		RefundMoneyParam param = (RefundMoneyParam)obj;	
		/**
		 * 校验_状态、数量、
		 */
		transaction(()->{
			//insert b2c_order_action
			
			//insert b2c_return_order
			
			//insert b2c_return_order_goods
			
			//insert b2c_return_status_change
			
			//update b2c_order_info
			
			//update b2c_order_goods
			
		});
		return null;
	}

	@Override
	public Object query(OrderOperateQueryParam param) {
		Boolean isMp = param.getIsMp();
		RefundVo vo = new RefundVo();
		logger.info("获取可退款、退货信息参数为:" + param.toString());
		//获取当前订单
		OrderListInfoVo currentOrder = orderInfo.getByOrderId(param.getOrderId(),OrderListInfoVo.class);
		//退款校验
		if(OrderOperationJudgment.isReturnMoney(currentOrder, isMp)) {
			vo.getReturnType()[0] = true;
		}
		//退货校验
		if(OrderOperationJudgment.isReturnGoods(currentOrder , isMp)) {
			vo.getReturnType()[1] = true;
		}
		//后台退运费校验
		if(!isMp) {
			//获取已退运费
			BigDecimal returnShipingFee = returnOrder.getReturnShipingFee(currentOrder.getOrderSn());
			//后台退运费
			if(OrderOperationJudgment.adminIsReturnShipingFee(currentOrder , returnShipingFee)){
				vo.getReturnType()[2] = true;
			}
		}
		
		//无可退类型则返回
		if(vo.isReturn(isMp).equals(Boolean.FALSE)) {
			return vo;
		}
		//是否为主订单
		Boolean isMain = orderInfo.isMainOrder(currentOrder);
		//如果该订单为主订单则查询子订单
		List<OrderListInfoVo> subOrders = orderInfo.getChildOrders(currentOrder , isMain);
		List<String> cOrderSns = subOrders.stream().map(OrderListInfoVo::getOrderSn).collect(Collectors.toList());
		//当前订单最终支付金额(包含运费)
		final BigDecimal amount = orderInfo.getOrderFinalAmount(currentOrder , Boolean.TRUE);
		//如果当前订单为子订单,把订单中金额与用户信息替换为主订单的信息
		orderInfo.replaceOrderInfo(currentOrder);	
		//初始化订单sn数组
		List<String> sns = new ArrayList<String>(subOrders.size() + 1);
		sns.add(currentOrder.getOrderSn());
		if(subOrders.size() > 0) {
			sns.addAll(cOrderSns);
		}
		//退款数据汇总(该汇总信息会在'构造优先级退款信息'复用)
		LinkedHashMap<String, BigDecimal> returnAmountMap = refundAmountRecord.getReturnAmountMap(sns , currentOrder);	
		//构造优先级退款信息
		Map<String, BigDecimal> canReturn = orderInfo.getCanReturn(currentOrder , amount , returnAmountMap);
		//查询订单下商品(如果为主订单则包含子订单商品)
		Map<String, List<RefundVoGoods>> goods = orderGoods.getByOrderSns(sns);
		//计算子订单商品数量(主订单返回的map->size=0)
		HashMap<Integer, Integer> subOrderGoodsSum = orderGoods.countSubOrderGoods(goods,currentOrder,isMain);
		//查询该订单退货中的商品
		Map<Integer, Integer> refundingGoods = returnOrderGoods.getRefundingGoods(param.getOrderSn());
		//设置可退商品行信息
		Iterator<RefundVoGoods> currentGoods = goods.get(currentOrder.getOrderSn()).iterator();
		while (currentGoods.hasNext()) {
			RefundVoGoods oneGoods = (RefundVoGoods) currentGoods.next();
			//主订单需要减去子订单的商品数量
			if(isMain) {
				//总数 = 总数 - 子订单数量
				oneGoods.setTotal((oneGoods.getGoodsNumber() - ((subOrderGoodsSum.get(oneGoods.getProductId())) == null ? 0 : subOrderGoodsSum.get(oneGoods.getProductId()))));
			}
			//已提交=退中+退完成
			Integer submitted = (refundingGoods.get(oneGoods.getProductId()) == null ? 0 : refundingGoods.get(oneGoods.getProductId())) + oneGoods.getReturnNumber();
			oneGoods.setSubmitted(submitted);
			// 可退
			Integer returnable = oneGoods.getTotal() - oneGoods.getSubmitted();
			oneGoods.setReturnable(returnable);
			//处理前后端不同逻辑
			if(isMp) {
				if(oneGoods.getReturnable() <= 0) {
					//前端可退数量为0不展示
					currentGoods.remove();
				}
			}else {
				//后台商家配置的不可退款的可退
				oneGoods.setIsCanReturn(OrderConstant.IS_CAN_RETURN_Y);
			}
		}
		vo.setRefundGoods(goods.get(currentOrder.getOrderSn()));
		vo.setReturnAmountMap(canReturn);
		logger.info("获取可发货信息完成");
		return vo;
	}

}
