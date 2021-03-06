package com.vpu.mp.service.pojo.shop.market.reduceprice;

import com.vpu.mp.service.pojo.shop.config.PictorialShareConfig;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

/**
 * @author: 王兵兵
 * @create: 2019-08-13 16:39
 **/
@Data
public class ReducePriceAddParam {

    /** 活动名称 */
    @NotNull
    private String name;

    /** 活动开始时间 */
    @NotNull
    private Timestamp startTime;

    /** 活动结束时间 */
    @NotNull
    private Timestamp endTime;

    /** 限购数量 */
    @NotNull
    private Integer limitAmount;

    /** 改价的商品数组 */
    @NotNull
    @Size(min=1)
    private ReducePriceGoodsAddParam[] reducePriceGoodsAddParams;

    /** 周期类型：1:每天 2:每月 3:每周 */
    private Byte periodAction;

    /** 时间段字符串 格式：09:00@12:00 */
    private String pointTime;

    /** 每月第几日（单选）；每周第几天（多选，@符隔开）；*/
    private String extendTime;

    /** 批量打几折 */
    private Byte batchDiscount;

    /** 批量减多少 */
    private BigDecimal batchReduce;

    /** 批量折后价 */
    private BigDecimal batchFinalPrice;

    /** 是否批量取整 */
    private Byte isBatchInteger;

    /** 超限购买设置标记，1禁止超限购买，0超限全部恢复原价 */
    private Byte limitFlag;

    /** 优先级 */
    private Byte first;

    /** 分享设置 */
    @NotNull
    private PictorialShareConfig shareConfig;

    /**
     * 预告时间：-1：立刻预告；0：不预告；大于0：开始前预告小时数
     */
    private Integer preTime;
    /**
     * 是否给参加活动的用户打标签，1是
     */
    private Byte activityTag;
    /**
     * 参加活动打标签id列表
     */
    private List<Integer> activityTagId;
}
