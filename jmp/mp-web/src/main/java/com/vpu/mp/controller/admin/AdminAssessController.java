package com.vpu.mp.controller.admin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vpu.mp.service.foundation.data.JsonResult;
import com.vpu.mp.service.foundation.util.PageResult;
import com.vpu.mp.service.pojo.shop.assess.AssessActivityListParam;
import com.vpu.mp.service.pojo.shop.assess.AssessActivityListVo;
import com.vpu.mp.service.pojo.shop.assess.AssessActivityOneParam;
import com.vpu.mp.service.pojo.shop.assess.AssessResultOneParam;
import com.vpu.mp.service.pojo.shop.assess.AssessTopicOneParam;
import com.vpu.mp.service.shop.ShopApplication;

/**
 * 测评活动
 * @author 常乐
 * 2019年8月15日
 */
@RestController
//@RequestMapping("/api")
public class AdminAssessController extends AdminBaseController{
	@Override
    protected ShopApplication shop() {
        return saas.getShopApp(471752);
    }
	/**
	 * 测评活动列表
	 * @param param
	 * @return
	 */
	@PostMapping("/admin/assess/activity/list")
	public JsonResult assessActivitList(@RequestBody AssessActivityListParam param) {
		 PageResult<AssessActivityListVo> activityList = shop().assess.getActivityList(param);
		 return this.success(activityList);
	}
	
	/**
	 * 获取一条测评活动信息
	 * @param assessId
	 * @return
	 */
	@GetMapping("/admin/assess/activity/one")
	public JsonResult getOneAssessInfo(Integer assessId) {
		AssessActivityOneParam info = shop().assess.getOneInfo(assessId);
		return this.success(info);
	}
	
	/**
	 * 编辑保存活动信息
	 * @param param
	 * @return
	 */
	@PostMapping("/admin/assess/activity/save")
	public JsonResult saveAssessActivity(@RequestBody AssessActivityOneParam param) {
		int res = shop().assess.saveAssess(param);
		return this.success(res);
	}
	
	/**
	 * 添加测评活动
	 * @param param
	 * @return
	 */
	@PostMapping("/admin/assess/activity/add")
	public JsonResult addAssessActivity(@RequestBody AssessActivityOneParam param) {
		int res = shop().assess.addAssess(param);
		return this.success(res);
	}
	
	/**
	 * 停用测评活动
	 * @param assessId
	 * @return
	 */
	@GetMapping("/admin/assess/activity/pause")
	public JsonResult pauseAssessActivity(Integer assessId) {
		int res = shop().assess.pauseAssess(assessId);
		return this.success(res);
	}
	
	/**
	 * 启用测评活动
	 * @param assessId
	 * @return
	 */
	@GetMapping("/admin/assess/activity/open")
	public JsonResult openAssessActivity(Integer assessId) {
		int res = shop().assess.openAssess(assessId);
		return this.success(res);
	}
	
	/**
	 * 发布活动
	 * @param assessId
	 * @return
	 */
	@GetMapping("/admin/assess/activity/publish")
	public JsonResult publishAssessActivity(Integer assessId) {
		int res = shop().assess.publishAssess(assessId);
		return this.success(res);
	}
	
	/**
	 * 添加测评题目
	 * @param param
	 * @return
	 */
	@PostMapping("/admin/assess/topic/add")
	public JsonResult addAssessTopic(@RequestBody AssessTopicOneParam param) {
		int res = shop().assess.addAssessTopic(param);
		return this.success(res);
	}
	
	/**
	 * 获取测评题目单条信息
	 * @param id
	 * @return
	 */
	@GetMapping("/admin/assess/topic/one")
	public JsonResult getAssessTopicOne(Integer id) {
		AssessTopicOneParam res = shop().assess.getAssessTopicOne(id);
		return this.success(res);
	}
	
	/**
	 * 测评题目编辑保存
	 * @param param
	 * @return
	 */
	@PostMapping("/admin/assess/topic/save")
	public JsonResult saveAssessTopic(@RequestBody AssessTopicOneParam param) {
		int res = shop().assess.saveAssessTopic(param);
		return this.success(res);
	}
	
	/**
	 * 删除测评题目
	 * @param id
	 * @return
	 */
	@GetMapping("/admin/assess/topic/delete")
	public JsonResult delAssessTopic(Integer id) {
		int res = shop().assess.delAssessTopic(id);
		return this.success(res);
	}
	
	/**
	 * 添加测评结果
	 * @param param
	 * @return
	 */
	@PostMapping("/admin/assess/result/add")
	public JsonResult addAssessResult(@RequestBody AssessResultOneParam param) {
		int res = shop().assess.addAssessResult(param);
		return this.success(res);
	}
}
