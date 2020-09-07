package com.vpu.mp.service.saas.shop;

import static com.vpu.mp.db.main.tables.Shop.SHOP;
import static com.vpu.mp.db.main.tables.ThirdPartyServices.THIRD_PARTY_SERVICES;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import com.vpu.mp.service.pojo.shop.store.account.StoreAccountEditParam;
import com.vpu.mp.service.pojo.shop.store.account.StoreAccountVo;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.vpu.mp.common.foundation.util.DateUtils;
import com.vpu.mp.db.main.tables.records.MpOfficialAccountUserRecord;
import com.vpu.mp.db.main.tables.records.ShopAccountRecord;
import com.vpu.mp.db.main.tables.records.ShopRecord;
import com.vpu.mp.db.main.tables.records.ThirdPartyServicesRecord;
import com.vpu.mp.db.shop.tables.records.OrderInfoRecord;
import com.vpu.mp.db.shop.tables.records.UserRecord;
import com.vpu.mp.service.foundation.service.MainBaseService;
import com.vpu.mp.service.pojo.saas.schedule.TaskJobsConstant.TaskJobEnum;
import com.vpu.mp.service.pojo.saas.shop.ShopChildAccountPojo;
import com.vpu.mp.service.pojo.saas.shop.officeaccount.CanSendVo;
import com.vpu.mp.service.pojo.shop.market.message.RabbitMessageParam;
import com.vpu.mp.service.pojo.shop.market.message.RabbitParamConstant;
import com.vpu.mp.service.pojo.shop.message.MpTemplateConfig;
import com.vpu.mp.service.pojo.shop.message.MpTemplateData;
import com.vpu.mp.service.saas.shop.official.MpOfficialAccountUserService;

/**
 * 概况绑定公众号发送消息功能
 *
 * @author zhaojianqiang 2020年4月13日下午2:39:06
 */
@Service
public class ThirdPartyMsgServices extends MainBaseService {
	public static final Byte BIND = 1;
	public static final Byte NOBIND = 0;
	public static final Byte ONE = 1;
	public static final Byte TWO = 2;
	public static final Byte THREE = 3;

	@Value(value = "${official.appId}")
	private String bindAppId;

	@Autowired
	private ShopAccountService account;

	@Autowired
	private ShopChildAccountService subAccount;

	@Autowired
	private MpOfficialAccountUserService mpOfficialAccountUserService;

	/**
	 * 发送订单消息
	 * @param order
	 */
	public void thirdPartService(OrderInfoRecord order) {
		try {
			CanSendVo canService = isCanService(order.getShopId(),order.getStoreId());
			if (canService.getCanSend()) {
				sendMsg(canService, order);
			}
		} catch (Exception e) {
			logger().info(e.getMessage(),e);
		}

	}

	private void sendMsg(CanSendVo param, OrderInfoRecord order) {
		ShopAccountRecord accountInfo = param.getAccountInfo();
		List<String> bindOpenId = new ArrayList<String>();
		List<ShopChildAccountPojo> subccountList = param.getSubccountList();
		List<StoreAccountVo> storeAccountList = param.getStoreAccountList();
		if (accountInfo != null && accountInfo.getIsBind().equals(BIND)
				&& !bindOpenId.contains(accountInfo.getOfficialOpenId())) {
			bindOpenId.add(accountInfo.getOfficialOpenId());
			logger().info("主账户发送");
			sendSingleMessage(order, accountInfo.getOfficialOpenId(),ONE,accountInfo.getSysId());
		}

		for (ShopChildAccountPojo account : subccountList) {
			logger().info("子账户发送");
			sendSingleMessage(order, account.getOfficialOpenId(),TWO,account.getAccountId());
		}

        for (StoreAccountVo storeAccount : storeAccountList) {
            logger().info("子账户发送");
            sendSingleMessage(order, storeAccount.getOfficialOpenId(),THREE,storeAccount.getAccountId());
        }
	}

	private boolean sendSingleMessage(OrderInfoRecord order, String officialOpenId,Byte accountAction,Integer accountId) {
		MpOfficialAccountUserRecord userAccount = mpOfficialAccountUserService.getUser(bindAppId, officialOpenId);
		if (userAccount == null) {
			return false;
		}
		Integer mpTempleType = RabbitParamConstant.Type.MP_TEMPLE_TYP_NO;
		List<Integer> userIdList = new ArrayList<Integer>();
		if (StringUtils.isEmpty(userAccount.getUnionid())) {
			logger().info("没有登录过小程序");
			com.vpu.mp.db.shop.tables.records.MpOfficialAccountUserRecord user = saas
					.getShopApp(order.getShopId()).officialAccountUser.getUser(bindAppId, userAccount.getOpenid());
			userIdList.add(user.getRecId());
			mpTempleType = RabbitParamConstant.Type.MP_TEMPLE_TYPE_NO_USER;
		} else {
			logger().info("登录过小程序");
			UserRecord user = saas.getShopApp(order.getShopId()).user.getUserByUnionId(userAccount.getUnionid());
			userIdList.add(user.getUserId());
		}
		String goodsName = saas.getShopApp(order.getShopId()).messageTemplateService.orderPayService
				.getGoodsNameForPay(order.getOrderSn());
		BigDecimal money = order.getScoreDiscount().add(order.getUseAccount()).add(order.getMoneyPaid())
				.add(order.getMemberCardBalance());
		DecimalFormat df1 = new DecimalFormat("0.00");
		String formatMoney = df1.format(money);
		UserRecord userRecord = saas.getShopApp(order.getShopId()).user.getUserByUserId(order.getUserId());
		String userName = userRecord.getUsername();
		String page = "pages/orderinfo/orderinfo?orderSn=" + order.getOrderSn();
		String[][] data = new String[][] { { "店铺新订单成交通知", "#173177" }, { formatMoney, "#173177" },
				{ goodsName, "#173177" }, { order.getOrderSn(), "#173177" }, { userName, "#173177" } };
		RabbitMessageParam sendParam = RabbitMessageParam.builder()
				.mpTemplateData(MpTemplateData.builder().config(MpTemplateConfig.NEW_ORDER_REMIND).data(data).build())
				.page(page).shopId(order.getShopId()).userIdList(userIdList).type(mpTempleType).build();
		logger().info("准备发");
		saas.taskJobMainService.dispatchImmediately(sendParam, RabbitMessageParam.class.getName(), order.getShopId(),
				TaskJobEnum.SEND_MESSAGE.getExecutionType());
		ThirdPartyServicesRecord newRecord = db().newRecord(THIRD_PARTY_SERVICES);
		newRecord.setShopId(order.getShopId());
		newRecord.setAccountAction(accountAction);
		newRecord.setAccountId(accountId);
		newRecord.setServiceDetail(order.getOrderSn());
		newRecord.setAddTime(DateUtils.getSqlTimestamp());
		int insert = newRecord.insert();
		logger().info("插入结果 "+insert);
		return true;
	}

	private CanSendVo isCanService(Integer shopId,Integer storeId) {
		CanSendVo vo = new CanSendVo();
		boolean canSend = false;
		ShopRecord shop = db().selectFrom(SHOP).where(SHOP.SHOP_ID.eq(shopId)).fetchAny();
		if (shop == null) {
			return vo;
		}
		ShopAccountRecord shopAccount = account.getAccountInfoForId(shop.getSysId());
		if (shopAccount.getIsBind().equals(BIND)) {
			canSend = true;
		}
		List<ShopChildAccountPojo> subAccountList = subAccount.getAccountByBindThird(shop.getSysId());
		if (subAccountList.size() > 0) {
			canSend = true;
		}
		List<StoreAccountVo> storeAccountList = saas.shop.storeAccount.getStoreAccountByBindThird(shopId,storeId);
        if (storeAccountList.size() > 0) {
            canSend = true;
        }
		if (canSend) {
			List<Integer> list = db().select(DSL.count(THIRD_PARTY_SERVICES.ACCOUNT_ID)).from(THIRD_PARTY_SERVICES)
					.where(THIRD_PARTY_SERVICES.SHOP_ID.eq(shopId)
							.and(dateFormat(THIRD_PARTY_SERVICES.ADD_TIME, DateUtils.DATE_MYSQL_SIMPLE)
									.eq(DateUtils.dateFormat(DateUtils.DATE_FORMAT_SIMPLE))))
					.groupBy(THIRD_PARTY_SERVICES.ACCOUNT_ACTION, THIRD_PARTY_SERVICES.ACCOUNT_ID,
							THIRD_PARTY_SERVICES.SERVICE_ACTION)
					.having(DSL.count(THIRD_PARTY_SERVICES.ACCOUNT_ID).ge(5)).fetchInto(Integer.class);
			logger().info(""+list);
			if(list.size()==0) {
				canSend = true;
			}else {
				canSend = false;
			}
		}
		vo = new CanSendVo(canSend, shopAccount, subAccountList,storeAccountList);
		return vo;
	}
}
