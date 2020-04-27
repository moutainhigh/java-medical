package com.vpu.mp.controller.wxapp;

import com.vpu.mp.db.shop.tables.records.GroupDrawRecord;
import com.vpu.mp.db.shop.tables.records.ShopCfgRecord;
import com.vpu.mp.service.foundation.data.JsonResult;
import com.vpu.mp.service.foundation.data.JsonResultCode;
import com.vpu.mp.service.foundation.util.Util;
import com.vpu.mp.service.pojo.shop.market.groupbuy.param.GroupBuyIdParam;
import com.vpu.mp.service.pojo.shop.market.groupdraw.GroupActivityCopyWriting;
import com.vpu.mp.service.pojo.shop.market.integration.GroupInteMaVo;
import com.vpu.mp.service.pojo.shop.member.score.CheckSignVo;
import com.vpu.mp.service.pojo.wxapp.goods.groupDraw.GroupDrawVo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.Map;
/**
 * 
 * @author zhaojianqiang
 *
 * 2019年10月17日 上午11:27:00
 */
@RestController
public class HelpController extends HelpBaseController {
	
	
	private Logger log=LoggerFactory.getLogger(this.getClass());
	
	/**
	 * 服务条款
	 * @param shop_id
	 * @param user_id
	 * @return
	 */
	@GetMapping("/api/wxapp/score/scoreDocument")
	public JsonResult scoreDocument(@RequestParam Integer shop_id, @RequestParam Integer user_id) {
		log.info("查询积分说明");
		checkId();
		ShopCfgRecord scoreNum = saas.getShopApp(shop_id).userCard.scoreService.score.getScoreNum("score_document");
		if(scoreNum!=null) {
			log.info("设置查询积分说明");
			String v = scoreNum.getV();
			Map parseJson = Util.parseJson(v, Map.class);
			Object object = parseJson.get("document");
			return success(object);
		}
		log.info("未设置查询积分说明");
		return fail();
	}

	
	/**
	 * 签到帮助页
	 * @param shop_id
	 * @param user_id
	 * @param sign_rule
	 * @return
	 */
	@GetMapping("/api/wxapp/sign/help")
	public JsonResult getSignHelp(@RequestParam Integer shop_id, @RequestParam Integer user_id) {
		log.info("进入签到帮助页");
		checkId();
		CheckSignVo sCheckSignVo = saas.getShopApp(shop_id).userCard.scoreService.checkSignInScore(user_id);
		return success(sCheckSignVo);
	}
	
	/**
	 * 组团瓜分积分活动说明
	 * @param shop_id
	 * @param pid
	 * @return
	 */
	@GetMapping("/api/wxapp/pinintegration/help")
	public JsonResult getGroupInfo(@RequestParam Integer shop_id,@RequestParam Integer pid) {
		log.info("进入组团瓜分积分活动说明");
		checkId();
		GroupInteMaVo vo = saas.getShopApp(shop_id).groupIntegration.getActivityCopywriting(pid);
		if(vo==null) {
			return fail();
		}else {
			return success(vo);			
		}
		
	}

    /**
     * 查询服务条款配置
     *
     * @return 服务条款配置内容
     */
    @GetMapping("/api/wxapp/order/termsofservice")
    public JsonResult getTermsOfService(@RequestParam Integer shopId) {
        try {
            return success(saas.getShopApp(shopId).trade.getTermsOfService());
        } catch (IOException e) {
            log.error("服务条款配置内容错误", e);
            return fail();
        }
    }
    
    /**
     * 拼团抽奖服务条款
     * @param shopId
     * @param group_draw_id
     * @return
     */
    @GetMapping("/api/wxapp/groupDraw/help")
    public JsonResult getTempGroupDraw(@RequestParam Integer shopId,@RequestParam Integer groupDrawId) {
		GroupDrawRecord record = saas.getShopApp(shopId).groupDraw.getById(groupDrawId);
		if (record == null) {
			// 活动不存在或没有可参与的活动商品
			return fail(JsonResultCode.GROUP_DRAW_FAIL);
		}
		String activityCopywriting = record.getActivityCopywriting();
		GroupActivityCopyWriting json=null;
		if(!StringUtils.isEmpty(activityCopywriting)){
			json = Util.parseJson(activityCopywriting, GroupActivityCopyWriting.class);		
		}
		return success(json);
    }
	/**
	 * 获取拼团说明
	 * @param id id
	 * @return 拼团说明
	 */
	@GetMapping("/api/wxapp/groupbuy/copywriting")
	public JsonResult getActivityCopywriting(@RequestParam Integer shopId,@RequestParam Integer id){
		String activityCopywriting = saas.getShopApp(shopId).groupBuy.getActivityCopywriting(id);
		return success(activityCopywriting);
	}

}
