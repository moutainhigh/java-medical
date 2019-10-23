package com.vpu.mp.service.shop.order.action;

import java.sql.Timestamp;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vpu.mp.service.foundation.data.JsonResultCode;
import com.vpu.mp.service.foundation.exception.MpException;
import com.vpu.mp.service.foundation.service.ShopBaseService;
import com.vpu.mp.service.pojo.shop.operation.RecordContentTemplate;
import com.vpu.mp.service.pojo.shop.order.OrderConstant;
import com.vpu.mp.service.pojo.shop.order.mp.order.OrderInfoMpVo;
import com.vpu.mp.service.pojo.shop.order.write.operate.OrderOperateQueryParam;
import com.vpu.mp.service.pojo.shop.order.write.operate.OrderServiceCode;
import com.vpu.mp.service.pojo.shop.order.write.operate.extend.ExtendReceiveParam;
import com.vpu.mp.service.shop.operation.RecordAdminActionService;
import com.vpu.mp.service.shop.order.OrderReadService;
import com.vpu.mp.service.shop.order.action.base.IorderOperate;
import com.vpu.mp.service.shop.order.action.base.OrderOperationJudgment;
import com.vpu.mp.service.shop.order.info.OrderInfoService;

/**
 * 	延长收货时间
 * @author 王帅
 *
 */

@Component
public class ExtendReceiveService extends ShopBaseService implements IorderOperate{
	
	@Autowired
	private OrderInfoService orderInfo;
	
	@Autowired
	public RecordAdminActionService record;
	
	@Autowired
	private OrderReadService orderRead;
	/**仅仅商家延长收货*/
	public static byte OPERATION_ONLY_ADMIN = 1;
	/**买家操作后商家操作*/
	public static byte OPERATION_ALL = 2;
	/**买家操作*/
	public static byte OPERATION_MP = 3;
	
	@Override
	public OrderServiceCode getServiceCode() {
		return OrderServiceCode.EXTEND_RECEIVE;
	}

	@Override
	public Object query(OrderOperateQueryParam param) throws MpException {
		return null;
	}
	
	@Override
	public JsonResultCode execute(Object obj) {
		logger().info("订单延长收货时间开始,参数为:{}",obj.toString());
		//TODO 延长收货
		if(!(obj instanceof OrderOperateQueryParam)) {
			return JsonResultCode.CODE_ORDER_OPERATE_NO_INSTANCEOF;
		}
		OrderOperateQueryParam param = (OrderOperateQueryParam)obj;
		//后台输入延长时间
		Timestamp extendTime = null;
		if(param.getIsMp() == OrderConstant.IS_MP_ADMIN) {
			extendTime = ((ExtendReceiveParam)obj).getExtendTime();
		}
		OrderInfoMpVo order = orderInfo.getByOrderId(param.getOrderId(), OrderInfoMpVo.class);
		if(order == null) {
			return JsonResultCode.CODE_ORDER_NOT_EXIST;
		}
		if(order.getOrderStatus() == OrderConstant.ORDER_SHIPPED) {
			//已发货订单才可以延迟收货时间
			return JsonResultCode.CODE_ORDER_EXTEND_RECEIVE_NO_SHIPPED;
		}
		//店铺配置延长收货天数
		int extendReceiveDays = orderRead.getExtendReceiveDays();
		if(extendReceiveDays == 0) {
			//不可以延长收货(商家配置时间为0)
			return JsonResultCode.CODE_ORDER_EXTEND_RECEIVE_NOT_SUPPORTED;
		}
		if(order.getExtendReceiveAction() > OPERATION_ONLY_ADMIN && param.getIsMp() == OrderConstant.IS_MP_Y) {
			//买家仅一次机会
			return JsonResultCode.CODE_ORDER_EXTEND_RECEIVE_ONLY_ONE;
		}
		//自动收货时间
		Instant autoReceive = order.getShippingTime().toInstant().plusSeconds(Duration.ofDays(order.getReturnDaysCfg()).getSeconds());
		if(param.getIsMp() == OrderConstant.IS_MP_ADMIN) {
			if(extendTime.getTime() < autoReceive.toEpochMilli()) {}
			//延长收货时间不能小于自动收货时间
			return JsonResultCode.CODE_ORDER_EXTEND_RECEIVE_TIME_NOT_LT_AUTOTIME;
		}
		//mp申请时间
		long mpApplyTime = 0;
		if(param.getIsMp() == OrderConstant.IS_MP_Y) {
			if(!OrderOperationJudgment.isExtendReceive(order, extendReceiveDays)) {
				//据自动确认收货时间大于2天，不可延长收货
				return JsonResultCode.CODE_ORDER_EXTEND_RECEIVE_NOW_AUTOTIME_INTERVAL_GT_TWO_DAYS;
			}
			mpApplyTime = autoReceive.plusSeconds(Duration.ofDays(extendReceiveDays).getSeconds()).toEpochMilli();
			if(order.getExtendReceiveAction() > 0 && order.getExtendReceiveTime().getTime() > mpApplyTime) {
				//商家已操作更长的收货时间，请勿再操作
				return JsonResultCode.CODE_ORDER_EXTEND_RECEIVE_ADMIN_SET_MORE_TIME;
			}
		}
		//最终延长时间
		extendTime = param.getIsMp() == OrderConstant.IS_MP_Y ? new Timestamp(mpApplyTime) : extendTime;
		
		if(param.getIsMp() == OrderConstant.IS_MP_ADMIN) {
			//商家操作
			if(order.getExtendReceiveAction() > OPERATION_ONLY_ADMIN) {
				//买家延迟过
				order.setExtendReceiveAction(OPERATION_ALL);
			}else {
				//仅仅商家操作过
				order.setExtendReceiveAction(OPERATION_ONLY_ADMIN);
			}
		}else if(param.getIsMp() == OrderConstant.IS_MP_Y) {
			//买家操作
			order.setExtendReceiveAction(OPERATION_MP);
		}
		//调用方法
		orderInfo.extendReceive(order);
		//TODO 发送通知
		//操作记录
		record.insertRecord(Arrays.asList(new Integer[] { RecordContentTemplate.ORDER_EXTEND_RECEIVE.code }), new String[] {param.getOrderSn()});
		logger().info("订单延长收货时间结束,时间修改为:{}->{}",order.getExtendReceiveTime(),extendTime);
		return null;
	}

}
