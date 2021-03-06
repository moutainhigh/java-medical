package com.vpu.mp.controller.admin;

import com.vpu.mp.common.foundation.data.JsonResult;
import com.vpu.mp.service.pojo.shop.config.pledge.group.UpdateGroup;
import com.vpu.mp.service.pojo.shop.market.coopen.CoopenIdParam;
import com.vpu.mp.service.pojo.shop.market.coopen.CoopenIssueListParam;
import com.vpu.mp.service.pojo.shop.market.coopen.CoopenListParam;
import com.vpu.mp.service.pojo.shop.market.coopen.CoopenParam;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 *  开屏有礼
 * @author 孔德成
 * @date 2019/11/22 14:10
 */
@RestController
@RequestMapping("/api/admin/market/coopen")
public class AdminCoopenContorller extends  AdminBaseController {


    /**
     * 活动列表
     */
    @PostMapping("/list")
    public JsonResult getPageList(@RequestBody @Valid  CoopenListParam param) {
        return success(shop().coopen.getPageList(param));
    }

    /**
     * 停用活动
     */
    @PostMapping("/disable")
    public JsonResult disableActivity(@RequestBody @Valid CoopenIdParam param) {
        shop().coopen.disableActivity(param.getId());
        return success();
    }

    /**
     * 启用活动
     */
    @PostMapping("/enable")
    public JsonResult enableActivity(@RequestBody @Valid CoopenIdParam param) {
        shop().coopen.enableActivity(param.getId());
        return success();
    }

    /**
     * 删除活动
     */
    @PostMapping("/delete")
    public JsonResult deleteActivity(@RequestBody @Valid CoopenIdParam param) {
        shop().coopen.deleteActivity(param.getId());
        return success();
    }

    /**
     * 创建活动
     */
    @PostMapping("/add")
    public JsonResult addActivity(@RequestBody @Valid CoopenParam param) {
        shop().coopen.addActivity(param);
        return success();
    }

    /**
     * 活动修改 - 明细
     */
    @PostMapping("/detail")
    public JsonResult getActivityDetail(@RequestBody @Valid CoopenIdParam param) {
        return success(shop().coopen.getActivityDetail(param.getId()));
    }

    /**
     * 活动修改 - 更新
     */
    @PostMapping("/update")
    public JsonResult updateActivity(@RequestBody @Validated(UpdateGroup.class) CoopenParam param) {
        shop().coopen.updateActivity(param);
        return success();
    }

    /**
     * 发放明细
     */
    @PostMapping("/issuelist")
    public JsonResult issueDetail(@RequestBody @Valid CoopenIssueListParam param) {
        return success(shop().coopenRecord.getIssuePageList(param));
    }
}
