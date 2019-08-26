package com.vpu.mp.service.shop.order.record;

import static com.vpu.mp.db.shop.tables.OrderAction.ORDER_ACTION;

import org.springframework.stereotype.Service;

import com.vpu.mp.db.shop.tables.OrderAction;
import com.vpu.mp.db.shop.tables.records.OrderActionRecord;
import com.vpu.mp.db.shop.tables.records.OrderInfoRecord;
import com.vpu.mp.service.foundation.service.ShopBaseService;
import com.vpu.mp.service.pojo.shop.order.OrderInfoVo;
import com.vpu.mp.service.pojo.shop.order.write.operate.OrderOperateQueryParam;;

/**
 * 	订单状态变化记录
 * @author 王帅
 *
 */
@Service
public class OrderActionService extends ShopBaseService{
	public final OrderAction TABLE = ORDER_ACTION;
	
	public void addRecord(OrderInfoVo order , OrderOperateQueryParam param, byte beforeStatus ,String desc) {
		OrderActionRecord record = db().newRecord(TABLE);
		record.setOrderId(order.getOrderId());
		record.setOrderSn(order.getOrderSn());
		record.setShopId(getShopId());
		record.setUserId(order.getUserId());
		record.setOrderStatus(beforeStatus);
		record.setActionUser(param.getAdminInfo().getSysId()+param.getAdminInfo().getUserName());
		record.setActionNote(desc);
		record.insert();
	}
	
	public void addRecord(OrderInfoRecord order , OrderOperateQueryParam param, byte beforeStatus ,String desc) {
		OrderActionRecord record = db().newRecord(TABLE);
		record.setOrderId(order.getOrderId());
		record.setOrderSn(order.getOrderSn());
		record.setShopId(getShopId());
		record.setUserId(order.getUserId());
		record.setOrderStatus(beforeStatus);
		record.setActionUser(param.getAdminInfo().getSysId()+param.getAdminInfo().getUserName());
		record.setActionNote(desc);
		record.insert();
	}
}
