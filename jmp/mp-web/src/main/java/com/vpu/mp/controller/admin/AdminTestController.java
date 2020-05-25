package com.vpu.mp.controller.admin;

import com.beust.jcommander.internal.Maps;
import com.vpu.mp.service.foundation.data.JsonResult;
import com.vpu.mp.service.foundation.jedis.JedisManager;
import com.vpu.mp.service.foundation.util.Util;
import com.vpu.mp.service.pojo.saas.schedule.TaskJobsConstant.TaskJobEnum;
import com.vpu.mp.service.pojo.shop.market.message.RabbitMessageParam;
import com.vpu.mp.service.pojo.shop.market.message.RabbitParamConstant;
import com.vpu.mp.service.pojo.shop.official.message.MpTemplateConfig;
import com.vpu.mp.service.pojo.shop.official.message.MpTemplateData;
import com.vpu.mp.service.pojo.shop.user.message.MaSubscribeData;
import com.vpu.mp.service.pojo.shop.user.message.MaTemplateData;
import com.vpu.mp.service.pojo.wxapp.login.WxAppSessionUser;
import com.vpu.mp.service.pojo.wxapp.subscribe.TemplateVo;
import com.vpu.mp.service.shop.member.AddressService;
import com.vpu.mp.service.shop.task.wechat.WechatTaskService;
import com.vpu.mp.service.shop.user.message.SubscribeMessageService;
import com.vpu.mp.service.shop.user.message.maConfig.SubcribeTemplateCategory;
import com.vpu.mp.service.wechat.OpenPlatform;
import com.vpu.mp.service.wechat.bean.open.WxOpenMaSubScribeGeKeywordResult;
import com.vpu.mp.service.wechat.bean.open.WxOpenMaSubScribeGetCategoryResult;
import com.vpu.mp.service.wechat.bean.open.WxOpenMaSubScribeGetTemplateListResult;
import com.vpu.mp.service.wechat.bean.open.WxOpenMaSubScribeGetTemplateTitleResult;
import com.vpu.mp.service.wechat.bean.open.WxOpenMaSubscribeAddTemplateResult;
import me.chanjar.weixin.common.error.WxErrorException;
import me.chanjar.weixin.open.bean.result.WxOpenResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/**
 * 
 * @author lixinguo
 *
 */
@RestController
public class AdminTestController extends AdminBaseController {

	@Autowired
	protected OpenPlatform open;
	@Autowired
	private SubscribeMessageService subservice;

	@Autowired
    private WechatTaskService wechatTaskService;

    @Autowired
    protected JedisManager redis;

    @Autowired
    protected AddressService address;

	@RequestMapping(value = "/api/admin/test/addtemplate")
	public JsonResult addtemplate() throws Exception {
		String appId = "wxbb38922409fdaa24";
		String tid = "1116";
		int[] kidList = { 1, 2, 3 };
		String sceneDesc = "模板描述";
		WxOpenMaSubscribeAddTemplateResult result = open.getMaExtService().addTemplate(appId, tid, kidList, sceneDesc);
		return success(result);
	}

	@RequestMapping(value = "/api/admin/test/deltemplate")
	public JsonResult deltemplate() throws Exception {
		String appId = "wxbb38922409fdaa24";
		String priTmplId = this.request.getParameter("priTmplId");
		WxOpenResult result = open.getMaExtService().delTemplate(appId, priTmplId);
		return success(result);
	}
	
	@RequestMapping(value = "/api/admin/test/getCategory")
	public JsonResult getCategory() throws Exception {
		String appId = "wxbb38922409fdaa24";
		WxOpenMaSubScribeGetCategoryResult result = open.getMaExtService().getTemplateCategory(appId);
		return success(result);
	}
	
	@RequestMapping(value = "/api/admin/test/getKeywords")
	public JsonResult getPubTemplateKeyWordsById() throws Exception {
		String appId = "wxbb38922409fdaa24";
		String tid = this.request.getParameter("tid");
		WxOpenMaSubScribeGeKeywordResult result = open.getMaExtService().getPubTemplateKeyWordsById(appId, tid);
		return success(result);
	}
	
	@RequestMapping(value = "/api/admin/test/getTitleList")
	public JsonResult getPubTemplateTitleList() throws Exception {
		String appId = "wxbb38922409fdaa24";
		String ids = this.request.getParameter("ids");
		int start = 0;
		int limit =30;
		WxOpenMaSubScribeGetTemplateTitleResult result = open.getMaExtService().getPubTemplateTitleList(appId, ids, start, limit);
		return success(result);
	}

	@RequestMapping(value = "/api/admin/test/getTemplateList")
	public JsonResult getTemplateList() throws Exception {
		String appId = "wxbb38922409fdaa24";
		WxOpenMaSubScribeGetTemplateListResult result = open.getMaExtService().getTemplateList(appId);
		return success(result);
	}
		
//	@RequestMapping(value = "/api/admin/test/send")
//	public JsonResult send() throws Exception {
//		String appId = "wxbb38922409fdaa24";
//		String toUser =  this.request.getParameter("toUser");
//		String templateId =  this.request.getParameter("templateId");
//		String page= this.request.getParameter("page");
//		
//		Map<String, Map<String, String>> data = new LinkedHashMap<>();
//		Map<String, String> v1 = new LinkedHashMap<>();
//		v1.put("value", "活动内容");
//		data.put("thing1", v1);
//		
//		Map<String, String> v2 = new LinkedHashMap<>();
//		v2.put("value", "活动地址");
//		data.put("thing6", v2);
//		
//		WxOpenResult result = open.getMaExtService().sendTemplate(appId, toUser, templateId, page, data);
//		return success(result);
//	}
//	
	
	@RequestMapping(value = "/api/admin/test/sendTest")
	public JsonResult testSend() {
		String[][] data = new String[][] { { "金坷垃抽奖" }, { Util.getdate("yyyy-MM-dd HH:mm:ss") }, { "获得一车金坷垃" } };
		String[][] data2 = new String[][] { { "金色传说测试" }, { "传说" }, { Util.getdate("yyyy-MM-dd HH:mm:ss")}};
		Boolean sendMessage=false;
		MaSubscribeData build = MaSubscribeData.builder().data307(data).build();
		MaSubscribeData build2 = MaSubscribeData.builder().data307(data2).build();
		try {
			 sendMessage = subservice.sendMessage(195, SubcribeTemplateCategory.DRAW_RESULT, build, null);
			 sendMessage = subservice.sendMessage(195,  SubcribeTemplateCategory.INVITE_SUCCESS, build2, null);
		} catch (WxErrorException e) {
			
			e.printStackTrace();
		}
		return success(sendMessage);
		
	}
	
	@RequestMapping(value = "/api/admin/test/getNeedTemplateId")
	public JsonResult getNeedTemplateId() {
		String[] data = { SubcribeTemplateCategory.DRAW_RESULT, SubcribeTemplateCategory.INVITE_SUCCESS};
		TemplateVo[] templateId = {};
		try {
			templateId = subservice.getTemplateId(data);
		} catch (WxErrorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return success(templateId);

	}
	
	
	@RequestMapping(value = "/api/admin/test/sendTestByMq/{id}")
	public JsonResult testSendByMq(@PathVariable Integer id) {
		String[][] data2 = new String[][] { { "金坷垃抽奖" }, { Util.getdate("yyyy-MM-dd HH:mm:ss") }, { "获得一车金坷垃" } };
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(id);
		MaSubscribeData data=MaSubscribeData.builder().data307(data2).build();
		RabbitMessageParam param = RabbitMessageParam.builder()
				.maTemplateData(
						MaTemplateData.builder().config(SubcribeTemplateCategory.DRAW_RESULT).data(data).build())
				.page(null).shopId(adminAuth.user().getLoginShopId())
				.userIdList(arrayList)
				.type(RabbitParamConstant.Type.LOTTERY_TEAM).build();
		saas.taskJobMainService.dispatchImmediately(param, RabbitMessageParam.class.getName(), adminAuth.user().getLoginShopId(), TaskJobEnum.SEND_MESSAGE.getExecutionType());		
		String[][] data3 = new String[][] { { "金色传说测试" }, { "传说" }, { Util.getdate("yyyy-MM-dd HH:mm:ss")}};
		return success();
		
	}
	
	/**
	 * 小程序公众号一起发。小程序失败的，让公众号发
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/api/admin/test/sendMaAndMpByMq/{id}")
	public JsonResult testRecord(@PathVariable Integer id) {
		logger().info("混合发送");
		String page="/page/test/test";
		//小程序数据
		String[][] maData = new String[][] { { "金坷垃抽奖" }, { Util.getdate("yyyy-MM-dd HH:mm:ss") }, { "获得一车金坷垃" } };
		//公众号数据
		String[][] mpData = new String[][] { { "尊敬的用户，您的优惠券", "#173177" }, { "", "#173177" }, { "测测测测名字", "#173177" },
				{ Util.getdate("yyyy-MM-dd HH:mm:ss"), "#173177" }, { "", "#173177" } };
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(id);
		MaSubscribeData data = MaSubscribeData.builder().data307(maData).build();
		RabbitMessageParam param = RabbitMessageParam.builder()
				.maTemplateData(
						MaTemplateData.builder().config(SubcribeTemplateCategory.DRAW_RESULT).data(data).build())
				.mpTemplateData(MpTemplateData.builder().config(MpTemplateConfig.COUPON_EXPIRE).data(mpData).build())
				.page(page).shopId(adminAuth.user().getLoginShopId()).userIdList(arrayList)
				.type(RabbitParamConstant.Type.LOTTERY_TEAM).build();
		//想混合发RabbitParamConstant选小程序的
		saas.taskJobMainService.dispatchImmediately(param, RabbitMessageParam.class.getName(),
				adminAuth.user().getLoginShopId(), TaskJobEnum.SEND_MESSAGE.getExecutionType());
		logger().info("混合发送发出");
		return success();
	}
	@RequestMapping(value = "/api/admin/test/testDrew")
	public JsonResult testDrew() {
		saas.getShopApp(8984736).groupDraw.groupDrawUser.dealOpenGroupDraw();
		return null;

	}
    @RequestMapping(value = "/api/admin/test/testWxData")
    public JsonResult testWxData() {
        saas.getShopApp(245547).shopTaskService.wechatTaskService.test();
        return null;

    }
    
    @RequestMapping(value = "/api/admin/test/testPin")
    public JsonResult testGroup() {
        saas.getShopApp(8984736).groupIntegration.updateState();
        return null;

    }

    
    
    @RequestMapping(value = "/api/admin/test/live")
    public JsonResult testLive() {
    	logger().info("直播列表导入测试");
        //List<WxMaLiveRoomInfo> getliveinfo = saas.getShopApp(245547).liveService.getliveinfo();
        //saas.getShopApp(245547).liveService.getLiveList();
        logger().info("直播列表导入测试结束");
        return success();

    }
    
    @RequestMapping(value = "/api/admin/test/sendOrderMsg")
    public JsonResult testSendOrderMsg() {
//    	OrderInfoRecord order = saas.getShopApp(245547).member.order.getOrderByOrderSn("P202004092146259689");
//    	thirdPartyMsgServices.thirdPartService(order);
		return success();
    }
    
    @RequestMapping(value = "/api/admin/test/expiring")
    public JsonResult expiringCouponNotify() {
    	logger().info("卡券到期提醒测试");
    	saas.getShopApp(shopId()).shopTaskService.maMpScheduleTaskService.expiringCouponNotify();
		return success();
    }

    @RequestMapping(value = "/test/redis/getKeys")
    public JsonResult getKeys() {
        logger().info("redis");
        Set<String> keys = redis.keys("WXAPP*");
        Map<Object, Object> objectObjectMap = Maps.newHashMap();
        Integer shopId = Integer.valueOf(request.getHeader("V-ShopId"));
        keys.forEach(
            x->{
                WxAppSessionUser wxAppSessionUser = Util.parseJson(redis.get(x), WxAppSessionUser.class);
                if(wxAppSessionUser != null && shopId.equals(wxAppSessionUser.getShopId())) {
                    Integer addressId = saas.getShopApp(shopId).addressService.randomOne(wxAppSessionUser.getUserId());
                    if(addressId != null) {
                        objectObjectMap.put(x, addressId);
                    }
                }
            }
        );
        return success(objectObjectMap);
    }
}
