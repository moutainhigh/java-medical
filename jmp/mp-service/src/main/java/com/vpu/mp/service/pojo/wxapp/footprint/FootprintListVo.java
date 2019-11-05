package com.vpu.mp.service.pojo.wxapp.footprint;

import com.vpu.mp.service.pojo.wxapp.goods.goods.GoodsListMpVo;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

/**
 * 我的足迹列表
 * @author 孔德成
 * @date 2019/11/4 14:50
 */
@Getter
@Setter
public class FootprintListVo extends GoodsListMpVo {

    /**
     * 时间 yyyy-MM-dd
     */
    private Timestamp creatTime;

}
