package com.vpu.mp.service.pojo.wxapp.goods.goods.detail.promotion;

import com.vpu.mp.service.foundation.data.BaseConstant;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 支付有礼促销活动
 * @author 李晓冰
 * @date 2020年01月13日
 */
@Data
public class PayAwardPromotion extends PromotionBase {
    public PayAwardPromotion() {
        super.promotionType = BaseConstant.ACTIVITY_TYPE_PAY_AWARD;
    }
    /**0全部 1指定商品*/
    private Integer goodsAreaType;
    /**最少支付金额 0表示不限制*/
    private BigDecimal minPayMoney;
}
