package com.vpu.mp.service.foundation.data;

/**
 * 分销返利常量
 * @author 王帅
 */
public class DistributionConstant {
    /**
     * 分销等级1-5
     */
    public static Byte level_1 = 1;
    public static Byte level_2 = 2;
    public static Byte level_3 = 3;
    public static Byte level_4 = 4;
    public static Byte level_5 = 5;

    /**
     * 返利类型:1返利订单
     */
    public static Byte REBATE_ORDER = 1;

    /**
     * 返利等级
     * 0自购返利自己；1返利直接上级；2返利间件上级
     */
    public static Byte REBATE_LEVEL_0 = 0;
    public static Byte REBATE_LEVEL_1 = 1;
    public static Byte REBATE_LEVEL_2 = 2;

}