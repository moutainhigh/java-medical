package com.vpu.mp.controller.wxapp;

import com.vpu.mp.service.foundation.data.JsonResult;
import com.vpu.mp.service.foundation.util.Util;
import com.vpu.mp.service.pojo.wxapp.goods.goodssort.GoodsSortMenuVo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 李晓冰
 * @date 2019年10月17日
 */
@RestController
public class WxAppGoodsBrandSortController extends WxAppBaseController{

    /**
     * 小程序商品分类页面初始化
     * @return
     */
    @PostMapping("/api/wxapp/sort/init")
    public JsonResult goodsSortPageInit(){
        logger().debug("进入/api/wxapp/sort/init");
        logger().debug("进入/api/wxapp/sort/init");
        logger().debug("进入/api/wxapp/sort/init");
        logger().debug("进入/api/wxapp/sort/init");
        logger().debug("进入/api/wxapp/sort/init");
        List<GoodsSortMenuVo> goodsSortMenuVos = shop().goodsMp.goodsBrandSortMp.goodsSortPageInit();
        logger().debug(Util.toJson(goodsSortMenuVos));
        logger().debug("返回/api/wxapp/sort/init");
        logger().debug("返回/api/wxapp/sort/init");
        logger().debug("返回/api/wxapp/sort/init");
        logger().debug("返回/api/wxapp/sort/init");
        return success(goodsSortMenuVos);
    }
}
