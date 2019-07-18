package com.vpu.mp.controller.admin;

import com.vpu.mp.service.foundation.JsonResult;
import com.vpu.mp.service.foundation.JsonResultCode;
import com.vpu.mp.service.foundation.JsonResultMessage;
import com.vpu.mp.service.foundation.PageResult;
import com.vpu.mp.service.pojo.saas.article.ArticleListQueryParam;
import com.vpu.mp.service.pojo.saas.article.ArticleParam;
import com.vpu.mp.service.pojo.saas.article.ArticleVo;
import com.vpu.mp.service.pojo.shop.overview.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author:liufei
 * @Date:2019/7/15
 * @Description: 商城概览
 */
@RestController
public class AdminMallOverviewController extends AdminBaseController {

    /**
     * 数据展示
     * @param param
     * @return
     */
    @PostMapping("/api/admin/malloverview/datademonstration")
    public JsonResult dataDemonstration(@RequestBody @Validated DataDemonstrationParam param) {
        DataDemonstrationVo vo = shop().mallOverview.dataDemonstration(param);
        return vo != null ? success(vo) : fail(JsonResultMessage.OVERVIEW_MALL_DATADEMONSTRATION_GET_FAILED);
    }

    /**
     * 绑定解绑
     * @param param
     * @return
     */
    @PostMapping("/api/admin/malloverview/bindUnBindOfficial")
    public JsonResult bindUnBindOfficial(@RequestBody @Validated BindUnBindOfficialParam param){
        return saas.overviewService.bindUnBindOfficial(param) > 0 ? success() : fail(JsonResultMessage.OVERVIEW_MALL_BING_UNBING_FAILED);
    }

    /**
     * 代办事项
     * @return
     */
    @PostMapping("/api/admin/malloverview/toDoItem")
    public JsonResult toDoItem(){
        ToDoItemVo vo = shop().mallOverview.toDoItem();
        return vo!=null ? success(vo) : fail(JsonResultMessage.OVERVIEW_MALL_TODOITEM_GET_FAILED);
    }

    /**
     * 获取店铺基本信息,店铺到期时间，店铺版本名称
     * @param param
     * @return
     */
    @Autowired
    public ShopBaseInfoVo shopBaseInfoVo;
    @PostMapping("/api/admin/malloverview/getShopBaseInfo")
    public JsonResult getShopBaseInfo(@RequestBody @Validated ShopBaseInfoParam param){
        shopBaseInfoVo = saas.overviewService.getShopBaseInfo(param.getShopId());
        return shopBaseInfoVo !=null ? success(shopBaseInfoVo) : fail();
    }

    /**
     * 获取指定数量的公告,用于首页展示，只显示title和time
     * @param param
     * @return
     */
    @PostMapping("/api/admin/malloverview/getFixedAnnouncement")
    public JsonResult getFixedAnnouncement(@RequestBody @Validated FixedAnnouncementParam param){
        List<FixedAnnouncementVo> vo = saas.overviewService.getFixedAnnouncement(param);
        return vo!=null ? success(vo) : fail();
    }

    /**
     * 获取分页公告列表
     * @param param
     * @return
     */
    @PostMapping("/api/admin/malloverview/getAnnouncementList")
    public JsonResult getAnnouncementList(@RequestBody ArticleListQueryParam param){
        PageResult<ArticleVo> pageList = saas.article.getPageList(param);
        return success(pageList);
    }

    /**
     * 根据id获取公告详情
     * @param article
     * @return
     */
    @PostMapping("/api/admin/malloverview/getAnnouncementDetail")
    public JsonResult getAnnouncementDetail(@RequestBody ArticleParam article){
        if(null == article.getArticleId()) {
            return fail(JsonResultCode.CODE_ARTICLE_ARTICLEID_ISNULL);
        }
        return success(saas.article.get(article.getArticleId()));
    }

    /**
     * 店铺助手
     * @return
     */
    @Autowired
    private ShopAssistantVo vo;

    @PostMapping("/api/admin/malloverview/shopAssistant")
    public JsonResult shopAssistant(@RequestBody @Validated ShopAssistantParam param){
//        ShopAssistantVo vo = new ShopAssistantVo();
        saas.overviewService.shopAssistant(param,vo);
        shop().mallOverview.shopAssistant(param,vo);
        return vo!=null ? success(vo) : fail();
    }

    @Autowired
    private OverviewVo overviewVo;

    /**
     * 商城概览页面综合调用接口
     * @param param
     * @return
     */
    @PostMapping("/api/admin/malloverview/allOverview")
    public JsonResult allOverview(@RequestBody @Validated OverviewParam param){
        //基本信息
        overviewVo.setShopBaseInfoVo(saas.overviewService.getShopBaseInfo(param.getShopBaseInfoParam().getShopId()));
        //公告信息
        overviewVo.setAnnouncementVoList(saas.overviewService.getFixedAnnouncement(param.getFixedAnnouncementParam()));
        //数据展示
        overviewVo.setDataDemonstrationVo(shop().mallOverview.dataDemonstration(param.getDataDemonstrationParam()));
        //代办事项
        overviewVo.setToDoItemVo(shop().mallOverview.toDoItem());
        //店铺助手
        shopAssistant(param.getShopAssistantParam());
        overviewVo.setShopAssistantVo(vo);
        return success(overviewVo);
    }
}
