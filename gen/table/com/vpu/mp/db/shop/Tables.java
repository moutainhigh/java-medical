/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop;


import com.vpu.mp.db.shop.tables.*;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in mini_shop_471752
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>mini_shop_471752.b2c_assess_activity</code>.
     */
    public static final AssessActivity ASSESS_ACTIVITY = com.vpu.mp.db.shop.tables.AssessActivity.ASSESS_ACTIVITY;

    /**
     * The table <code>mini_shop_471752.b2c_assess_record</code>.
     */
    public static final AssessRecord ASSESS_RECORD = com.vpu.mp.db.shop.tables.AssessRecord.ASSESS_RECORD;

    /**
     * The table <code>mini_shop_471752.b2c_assess_result</code>.
     */
    public static final AssessResult ASSESS_RESULT = com.vpu.mp.db.shop.tables.AssessResult.ASSESS_RESULT;

    /**
     * The table <code>mini_shop_471752.b2c_assess_topic</code>.
     */
    public static final AssessTopic ASSESS_TOPIC = com.vpu.mp.db.shop.tables.AssessTopic.ASSESS_TOPIC;

    /**
     * The table <code>mini_shop_471752.b2c_assess_topic_record</code>.
     */
    public static final AssessTopicRecord ASSESS_TOPIC_RECORD = com.vpu.mp.db.shop.tables.AssessTopicRecord.ASSESS_TOPIC_RECORD;

    /**
     * The table <code>mini_shop_471752.b2c_bargain</code>.
     */
    public static final Bargain BARGAIN = com.vpu.mp.db.shop.tables.Bargain.BARGAIN;

    /**
     * The table <code>mini_shop_471752.b2c_bargain_record</code>.
     */
    public static final BargainRecord BARGAIN_RECORD = com.vpu.mp.db.shop.tables.BargainRecord.BARGAIN_RECORD;

    /**
     * The table <code>mini_shop_471752.b2c_bargain_user_list</code>.
     */
    public static final BargainUserList BARGAIN_USER_LIST = com.vpu.mp.db.shop.tables.BargainUserList.BARGAIN_USER_LIST;

    /**
     * The table <code>mini_shop_471752.b2c_batch_price</code>.
     */
    public static final BatchPrice BATCH_PRICE = com.vpu.mp.db.shop.tables.BatchPrice.BATCH_PRICE;

    /**
     * The table <code>mini_shop_471752.b2c_batch_profit</code>.
     */
    public static final BatchProfit BATCH_PROFIT = com.vpu.mp.db.shop.tables.BatchProfit.BATCH_PROFIT;

    /**
     * The table <code>mini_shop_471752.b2c_brand_classify</code>.
     */
    public static final BrandClassify BRAND_CLASSIFY = com.vpu.mp.db.shop.tables.BrandClassify.BRAND_CLASSIFY;

    /**
     * The table <code>mini_shop_471752.b2c_card_batch</code>.
     */
    public static final CardBatch CARD_BATCH = com.vpu.mp.db.shop.tables.CardBatch.CARD_BATCH;

    /**
     * The table <code>mini_shop_471752.b2c_card_consumer</code>.
     */
    public static final CardConsumer CARD_CONSUMER = com.vpu.mp.db.shop.tables.CardConsumer.CARD_CONSUMER;

    /**
     * The table <code>mini_shop_471752.b2c_card_examine</code>.
     */
    public static final CardExamine CARD_EXAMINE = com.vpu.mp.db.shop.tables.CardExamine.CARD_EXAMINE;

    /**
     * The table <code>mini_shop_471752.b2c_card_order</code>.
     */
    public static final CardOrder CARD_ORDER = com.vpu.mp.db.shop.tables.CardOrder.CARD_ORDER;

    /**
     * The table <code>mini_shop_471752.b2c_card_receive_code</code>.
     */
    public static final CardReceiveCode CARD_RECEIVE_CODE = com.vpu.mp.db.shop.tables.CardReceiveCode.CARD_RECEIVE_CODE;

    /**
     * The table <code>mini_shop_471752.b2c_card_upgrade</code>.
     */
    public static final CardUpgrade CARD_UPGRADE = com.vpu.mp.db.shop.tables.CardUpgrade.CARD_UPGRADE;

    /**
     * The table <code>mini_shop_471752.b2c_cart</code>.
     */
    public static final Cart CART = com.vpu.mp.db.shop.tables.Cart.CART;

    /**
     * The table <code>mini_shop_471752.b2c_channel</code>.
     */
    public static final Channel CHANNEL = com.vpu.mp.db.shop.tables.Channel.CHANNEL;

    /**
     * The table <code>mini_shop_471752.b2c_channel_record</code>.
     */
    public static final ChannelRecord CHANNEL_RECORD = com.vpu.mp.db.shop.tables.ChannelRecord.CHANNEL_RECORD;

    /**
     * The table <code>mini_shop_471752.b2c_channel_statistical</code>.
     */
    public static final ChannelStatistical CHANNEL_STATISTICAL = com.vpu.mp.db.shop.tables.ChannelStatistical.CHANNEL_STATISTICAL;

    /**
     * The table <code>mini_shop_471752.b2c_charge_money</code>.
     */
    public static final ChargeMoney CHARGE_MONEY = com.vpu.mp.db.shop.tables.ChargeMoney.CHARGE_MONEY;

    /**
     * The table <code>mini_shop_471752.b2c_code</code>.
     */
    public static final Code CODE = com.vpu.mp.db.shop.tables.Code.CODE;

    /**
     * The table <code>mini_shop_471752.b2c_comment_goods</code>.
     */
    public static final CommentGoods COMMENT_GOODS = com.vpu.mp.db.shop.tables.CommentGoods.COMMENT_GOODS;

    /**
     * The table <code>mini_shop_471752.b2c_comment_goods_answer</code>.
     */
    public static final CommentGoodsAnswer COMMENT_GOODS_ANSWER = com.vpu.mp.db.shop.tables.CommentGoodsAnswer.COMMENT_GOODS_ANSWER;

    /**
     * The table <code>mini_shop_471752.b2c_comment_service</code>.
     */
    public static final CommentService COMMENT_SERVICE = com.vpu.mp.db.shop.tables.CommentService.COMMENT_SERVICE;

    /**
     * The table <code>mini_shop_471752.b2c_coupon_activity</code>.
     */
    public static final CouponActivity COUPON_ACTIVITY = com.vpu.mp.db.shop.tables.CouponActivity.COUPON_ACTIVITY;

    /**
     * The table <code>mini_shop_471752.b2c_coupon_activity_record</code>.
     */
    public static final CouponActivityRecord COUPON_ACTIVITY_RECORD = com.vpu.mp.db.shop.tables.CouponActivityRecord.COUPON_ACTIVITY_RECORD;

    /**
     * The table <code>mini_shop_471752.b2c_coupon_pack</code>.
     */
    public static final CouponPack COUPON_PACK = com.vpu.mp.db.shop.tables.CouponPack.COUPON_PACK;

    /**
     * The table <code>mini_shop_471752.b2c_coupon_payreward_record</code>.
     */
    public static final CouponPayrewardRecord COUPON_PAYREWARD_RECORD = com.vpu.mp.db.shop.tables.CouponPayrewardRecord.COUPON_PAYREWARD_RECORD;

    /**
     * The table <code>mini_shop_471752.b2c_customer_avail_coupons</code>.
     */
    public static final CustomerAvailCoupons CUSTOMER_AVAIL_COUPONS = com.vpu.mp.db.shop.tables.CustomerAvailCoupons.CUSTOMER_AVAIL_COUPONS;

    /**
     * The table <code>mini_shop_471752.b2c_decorate_link</code>.
     */
    public static final DecorateLink DECORATE_LINK = com.vpu.mp.db.shop.tables.DecorateLink.DECORATE_LINK;

    /**
     * The table <code>mini_shop_471752.b2c_deliver_fee_template</code>.
     */
    public static final DeliverFeeTemplate DELIVER_FEE_TEMPLATE = com.vpu.mp.db.shop.tables.DeliverFeeTemplate.DELIVER_FEE_TEMPLATE;

    /**
     * The table <code>mini_shop_471752.b2c_distribution_order</code>.
     */
    public static final DistributionOrder DISTRIBUTION_ORDER = com.vpu.mp.db.shop.tables.DistributionOrder.DISTRIBUTION_ORDER;

    /**
     * The table <code>mini_shop_471752.b2c_distribution_strategy</code>.
     */
    public static final DistributionStrategy DISTRIBUTION_STRATEGY = com.vpu.mp.db.shop.tables.DistributionStrategy.DISTRIBUTION_STRATEGY;

    /**
     * The table <code>mini_shop_471752.b2c_distribution_tag</code>.
     */
    public static final DistributionTag DISTRIBUTION_TAG = com.vpu.mp.db.shop.tables.DistributionTag.DISTRIBUTION_TAG;

    /**
     * The table <code>mini_shop_471752.b2c_distribution_withdraw</code>.
     */
    public static final DistributionWithdraw DISTRIBUTION_WITHDRAW = com.vpu.mp.db.shop.tables.DistributionWithdraw.DISTRIBUTION_WITHDRAW;

    /**
     * The table <code>mini_shop_471752.b2c_distributor_apply</code>.
     */
    public static final DistributorApply DISTRIBUTOR_APPLY = com.vpu.mp.db.shop.tables.DistributorApply.DISTRIBUTOR_APPLY;

    /**
     * The table <code>mini_shop_471752.b2c_distributor_group</code>.
     */
    public static final DistributorGroup DISTRIBUTOR_GROUP = com.vpu.mp.db.shop.tables.DistributorGroup.DISTRIBUTOR_GROUP;

    /**
     * The table <code>mini_shop_471752.b2c_distributor_level</code>.
     */
    public static final DistributorLevel DISTRIBUTOR_LEVEL = com.vpu.mp.db.shop.tables.DistributorLevel.DISTRIBUTOR_LEVEL;

    /**
     * The table <code>mini_shop_471752.b2c_distributor_level_record</code>.
     */
    public static final DistributorLevelRecord DISTRIBUTOR_LEVEL_RECORD = com.vpu.mp.db.shop.tables.DistributorLevelRecord.DISTRIBUTOR_LEVEL_RECORD;

    /**
     * The table <code>mini_shop_471752.b2c_fanli_goods_statistics</code>.
     */
    public static final FanliGoodsStatistics FANLI_GOODS_STATISTICS = com.vpu.mp.db.shop.tables.FanliGoodsStatistics.FANLI_GOODS_STATISTICS;

    /**
     * The table <code>mini_shop_471752.b2c_footprint_record</code>.
     */
    public static final FootprintRecord FOOTPRINT_RECORD = com.vpu.mp.db.shop.tables.FootprintRecord.FOOTPRINT_RECORD;

    /**
     * The table <code>mini_shop_471752.b2c_form_page</code>.
     */
    public static final FormPage FORM_PAGE = com.vpu.mp.db.shop.tables.FormPage.FORM_PAGE;

    /**
     * The table <code>mini_shop_471752.b2c_form_submit_details</code>.
     */
    public static final FormSubmitDetails FORM_SUBMIT_DETAILS = com.vpu.mp.db.shop.tables.FormSubmitDetails.FORM_SUBMIT_DETAILS;

    /**
     * The table <code>mini_shop_471752.b2c_form_submit_list</code>.
     */
    public static final FormSubmitList FORM_SUBMIT_LIST = com.vpu.mp.db.shop.tables.FormSubmitList.FORM_SUBMIT_LIST;

    /**
     * The table <code>mini_shop_471752.b2c_friend_promote_activity</code>.
     */
    public static final FriendPromoteActivity FRIEND_PROMOTE_ACTIVITY = com.vpu.mp.db.shop.tables.FriendPromoteActivity.FRIEND_PROMOTE_ACTIVITY;

    /**
     * The table <code>mini_shop_471752.b2c_friend_promote_detail</code>.
     */
    public static final FriendPromoteDetail FRIEND_PROMOTE_DETAIL = com.vpu.mp.db.shop.tables.FriendPromoteDetail.FRIEND_PROMOTE_DETAIL;

    /**
     * The table <code>mini_shop_471752.b2c_friend_promote_launch</code>.
     */
    public static final FriendPromoteLaunch FRIEND_PROMOTE_LAUNCH = com.vpu.mp.db.shop.tables.FriendPromoteLaunch.FRIEND_PROMOTE_LAUNCH;

    /**
     * The table <code>mini_shop_471752.b2c_friend_promote_times</code>.
     */
    public static final FriendPromoteTimes FRIEND_PROMOTE_TIMES = com.vpu.mp.db.shop.tables.FriendPromoteTimes.FRIEND_PROMOTE_TIMES;

    /**
     * The table <code>mini_shop_471752.b2c_gift</code>.
     */
    public static final Gift GIFT = com.vpu.mp.db.shop.tables.Gift.GIFT;

    /**
     * The table <code>mini_shop_471752.b2c_gift_product</code>.
     */
    public static final GiftProduct GIFT_PRODUCT = com.vpu.mp.db.shop.tables.GiftProduct.GIFT_PRODUCT;

    /**
     * The table <code>mini_shop_471752.b2c_give_voucher</code>.
     */
    public static final GiveVoucher GIVE_VOUCHER = com.vpu.mp.db.shop.tables.GiveVoucher.GIVE_VOUCHER;

    /**
     * The table <code>mini_shop_471752.b2c_goods</code>.
     */
    public static final Goods GOODS = com.vpu.mp.db.shop.tables.Goods.GOODS;

    /**
     * The table <code>mini_shop_471752.b2c_goods_bak</code>.
     */
    public static final GoodsBak GOODS_BAK = com.vpu.mp.db.shop.tables.GoodsBak.GOODS_BAK;

    /**
     * The table <code>mini_shop_471752.b2c_goods_brand</code>.
     */
    public static final GoodsBrand GOODS_BRAND = com.vpu.mp.db.shop.tables.GoodsBrand.GOODS_BRAND;

    /**
     * The table <code>mini_shop_471752.b2c_goods_card_couple</code>.
     */
    public static final GoodsCardCouple GOODS_CARD_COUPLE = com.vpu.mp.db.shop.tables.GoodsCardCouple.GOODS_CARD_COUPLE;

    /**
     * The table <code>mini_shop_471752.b2c_goods_img</code>.
     */
    public static final GoodsImg GOODS_IMG = com.vpu.mp.db.shop.tables.GoodsImg.GOODS_IMG;

    /**
     * The table <code>mini_shop_471752.b2c_goods_import</code>.
     */
    public static final GoodsImport GOODS_IMPORT = com.vpu.mp.db.shop.tables.GoodsImport.GOODS_IMPORT;

    /**
     * The table <code>mini_shop_471752.b2c_goods_import_detail</code>.
     */
    public static final GoodsImportDetail GOODS_IMPORT_DETAIL = com.vpu.mp.db.shop.tables.GoodsImportDetail.GOODS_IMPORT_DETAIL;

    /**
     * The table <code>mini_shop_471752.b2c_goods_label</code>.
     */
    public static final GoodsLabel GOODS_LABEL = com.vpu.mp.db.shop.tables.GoodsLabel.GOODS_LABEL;

    /**
     * The table <code>mini_shop_471752.b2c_goods_label_couple</code>.
     */
    public static final GoodsLabelCouple GOODS_LABEL_COUPLE = com.vpu.mp.db.shop.tables.GoodsLabelCouple.GOODS_LABEL_COUPLE;

    /**
     * The table <code>mini_shop_471752.b2c_goods_opai_spec</code>.
     */
    public static final GoodsOpaiSpec GOODS_OPAI_SPEC = com.vpu.mp.db.shop.tables.GoodsOpaiSpec.GOODS_OPAI_SPEC;

    /**
     * The table <code>mini_shop_471752.b2c_goods_rebate_price</code>.
     */
    public static final GoodsRebatePrice GOODS_REBATE_PRICE = com.vpu.mp.db.shop.tables.GoodsRebatePrice.GOODS_REBATE_PRICE;

    /**
     * The table <code>mini_shop_471752.b2c_goods_spec_product</code>.
     */
    public static final GoodsSpecProduct GOODS_SPEC_PRODUCT = com.vpu.mp.db.shop.tables.GoodsSpecProduct.GOODS_SPEC_PRODUCT;

    /**
     * The table <code>mini_shop_471752.b2c_goods_spec_product_bak</code>.
     */
    public static final GoodsSpecProductBak GOODS_SPEC_PRODUCT_BAK = com.vpu.mp.db.shop.tables.GoodsSpecProductBak.GOODS_SPEC_PRODUCT_BAK;

    /**
     * The table <code>mini_shop_471752.b2c_goods_summary</code>.
     */
    public static final GoodsSummary GOODS_SUMMARY = com.vpu.mp.db.shop.tables.GoodsSummary.GOODS_SUMMARY;

    /**
     * The table <code>mini_shop_471752.b2c_goods_user_summary</code>.
     */
    public static final GoodsUserSummary GOODS_USER_SUMMARY = com.vpu.mp.db.shop.tables.GoodsUserSummary.GOODS_USER_SUMMARY;

    /**
     * The table <code>mini_shop_471752.b2c_grade_prd</code>.
     */
    public static final GradePrd GRADE_PRD = com.vpu.mp.db.shop.tables.GradePrd.GRADE_PRD;

    /**
     * The table <code>mini_shop_471752.b2c_group_draw</code>.
     */
    public static final GroupDraw GROUP_DRAW = com.vpu.mp.db.shop.tables.GroupDraw.GROUP_DRAW;

    /**
     * The table <code>mini_shop_471752.b2c_group_draw_invite</code>.
     */
    public static final GroupDrawInvite GROUP_DRAW_INVITE = com.vpu.mp.db.shop.tables.GroupDrawInvite.GROUP_DRAW_INVITE;

    /**
     * The table <code>mini_shop_471752.b2c_income_outcome_detail</code>.
     */
    public static final IncomeOutcomeDetail INCOME_OUTCOME_DETAIL = com.vpu.mp.db.shop.tables.IncomeOutcomeDetail.INCOME_OUTCOME_DETAIL;

    /**
     * The table <code>mini_shop_471752.b2c_index_foot_record</code>.
     */
    public static final IndexFootRecord INDEX_FOOT_RECORD = com.vpu.mp.db.shop.tables.IndexFootRecord.INDEX_FOOT_RECORD;

    /**
     * The table <code>mini_shop_471752.b2c_integral_mall_define</code>.
     */
    public static final IntegralMallDefine INTEGRAL_MALL_DEFINE = com.vpu.mp.db.shop.tables.IntegralMallDefine.INTEGRAL_MALL_DEFINE;

    /**
     * The table <code>mini_shop_471752.b2c_integral_mall_product</code>.
     */
    public static final IntegralMallProduct INTEGRAL_MALL_PRODUCT = com.vpu.mp.db.shop.tables.IntegralMallProduct.INTEGRAL_MALL_PRODUCT;

    /**
     * The table <code>mini_shop_471752.b2c_integral_mall_record</code>.
     */
    public static final IntegralMallRecord INTEGRAL_MALL_RECORD = com.vpu.mp.db.shop.tables.IntegralMallRecord.INTEGRAL_MALL_RECORD;

    /**
     * The table <code>mini_shop_471752.b2c_invoice</code>.
     */
    public static final Invoice INVOICE = com.vpu.mp.db.shop.tables.Invoice.INVOICE;

    /**
     * The table <code>mini_shop_471752.b2c_join_draw_list</code>.
     */
    public static final JoinDrawList JOIN_DRAW_LIST = com.vpu.mp.db.shop.tables.JoinDrawList.JOIN_DRAW_LIST;

    /**
     * The table <code>mini_shop_471752.b2c_join_group_list</code>.
     */
    public static final JoinGroupList JOIN_GROUP_LIST = com.vpu.mp.db.shop.tables.JoinGroupList.JOIN_GROUP_LIST;

    /**
     * The table <code>mini_shop_471752.b2c_lottery</code>.
     */
    public static final Lottery LOTTERY = com.vpu.mp.db.shop.tables.Lottery.LOTTERY;

    /**
     * The table <code>mini_shop_471752.b2c_lottery_record</code>.
     */
    public static final LotteryRecord LOTTERY_RECORD = com.vpu.mp.db.shop.tables.LotteryRecord.LOTTERY_RECORD;

    /**
     * The table <code>mini_shop_471752.b2c_lottery_share</code>.
     */
    public static final LotteryShare LOTTERY_SHARE = com.vpu.mp.db.shop.tables.LotteryShare.LOTTERY_SHARE;

    /**
     * The table <code>mini_shop_471752.b2c_member_card</code>.
     */
    public static final MemberCard MEMBER_CARD = com.vpu.mp.db.shop.tables.MemberCard.MEMBER_CARD;

    /**
     * The table <code>mini_shop_471752.b2c_message_template</code>.
     */
    public static final MessageTemplate MESSAGE_TEMPLATE = com.vpu.mp.db.shop.tables.MessageTemplate.MESSAGE_TEMPLATE;

    /**
     * The table <code>mini_shop_471752.b2c_mp_daily_retain</code>.
     */
    public static final MpDailyRetain MP_DAILY_RETAIN = com.vpu.mp.db.shop.tables.MpDailyRetain.MP_DAILY_RETAIN;

    /**
     * The table <code>mini_shop_471752.b2c_mp_daily_visit</code>.
     */
    public static final MpDailyVisit MP_DAILY_VISIT = com.vpu.mp.db.shop.tables.MpDailyVisit.MP_DAILY_VISIT;

    /**
     * The table <code>mini_shop_471752.b2c_mp_distribution_visit</code>.
     */
    public static final MpDistributionVisit MP_DISTRIBUTION_VISIT = com.vpu.mp.db.shop.tables.MpDistributionVisit.MP_DISTRIBUTION_VISIT;

    /**
     * The table <code>mini_shop_471752.b2c_mp_jump</code>.
     */
    public static final MpJump MP_JUMP = com.vpu.mp.db.shop.tables.MpJump.MP_JUMP;

    /**
     * The table <code>mini_shop_471752.b2c_mp_jump_usable</code>.
     */
    public static final MpJumpUsable MP_JUMP_USABLE = com.vpu.mp.db.shop.tables.MpJumpUsable.MP_JUMP_USABLE;

    /**
     * The table <code>mini_shop_471752.b2c_mp_monthly_retain</code>.
     */
    public static final MpMonthlyRetain MP_MONTHLY_RETAIN = com.vpu.mp.db.shop.tables.MpMonthlyRetain.MP_MONTHLY_RETAIN;

    /**
     * The table <code>mini_shop_471752.b2c_mp_monthly_visit</code>.
     */
    public static final MpMonthlyVisit MP_MONTHLY_VISIT = com.vpu.mp.db.shop.tables.MpMonthlyVisit.MP_MONTHLY_VISIT;

    /**
     * The table <code>mini_shop_471752.b2c_mp_scene_record</code>.
     */
    public static final MpSceneRecord MP_SCENE_RECORD = com.vpu.mp.db.shop.tables.MpSceneRecord.MP_SCENE_RECORD;

    /**
     * The table <code>mini_shop_471752.b2c_mp_summary_trend</code>.
     */
    public static final MpSummaryTrend MP_SUMMARY_TREND = com.vpu.mp.db.shop.tables.MpSummaryTrend.MP_SUMMARY_TREND;

    /**
     * The table <code>mini_shop_471752.b2c_mp_template_form_id</code>.
     */
    public static final MpTemplateFormId MP_TEMPLATE_FORM_ID = com.vpu.mp.db.shop.tables.MpTemplateFormId.MP_TEMPLATE_FORM_ID;

    /**
     * The table <code>mini_shop_471752.b2c_mp_user_portrait</code>.
     */
    public static final MpUserPortrait MP_USER_PORTRAIT = com.vpu.mp.db.shop.tables.MpUserPortrait.MP_USER_PORTRAIT;

    /**
     * The table <code>mini_shop_471752.b2c_mp_visit_page</code>.
     */
    public static final MpVisitPage MP_VISIT_PAGE = com.vpu.mp.db.shop.tables.MpVisitPage.MP_VISIT_PAGE;

    /**
     * The table <code>mini_shop_471752.b2c_mp_weekly_retain</code>.
     */
    public static final MpWeeklyRetain MP_WEEKLY_RETAIN = com.vpu.mp.db.shop.tables.MpWeeklyRetain.MP_WEEKLY_RETAIN;

    /**
     * The table <code>mini_shop_471752.b2c_mp_weekly_visit</code>.
     */
    public static final MpWeeklyVisit MP_WEEKLY_VISIT = com.vpu.mp.db.shop.tables.MpWeeklyVisit.MP_WEEKLY_VISIT;

    /**
     * The table <code>mini_shop_471752.b2c_mrking_strategy</code>.
     */
    public static final MrkingStrategy MRKING_STRATEGY = com.vpu.mp.db.shop.tables.MrkingStrategy.MRKING_STRATEGY;

    /**
     * The table <code>mini_shop_471752.b2c_mrking_strategy_condition</code>.
     */
    public static final MrkingStrategyCondition MRKING_STRATEGY_CONDITION = com.vpu.mp.db.shop.tables.MrkingStrategyCondition.MRKING_STRATEGY_CONDITION;

    /**
     * The table <code>mini_shop_471752.b2c_mrking_voucher</code>.
     */
    public static final MrkingVoucher MRKING_VOUCHER = com.vpu.mp.db.shop.tables.MrkingVoucher.MRKING_VOUCHER;

    /**
     * The table <code>mini_shop_471752.b2c_order_action</code>.
     */
    public static final OrderAction ORDER_ACTION = com.vpu.mp.db.shop.tables.OrderAction.ORDER_ACTION;

    /**
     * The table <code>mini_shop_471752.b2c_order_goods</code>.
     */
    public static final OrderGoods ORDER_GOODS = com.vpu.mp.db.shop.tables.OrderGoods.ORDER_GOODS;

    /**
     * The table <code>mini_shop_471752.b2c_order_goods_rebate</code>.
     */
    public static final OrderGoodsRebate ORDER_GOODS_REBATE = com.vpu.mp.db.shop.tables.OrderGoodsRebate.ORDER_GOODS_REBATE;

    /**
     * The table <code>mini_shop_471752.b2c_order_info</code>.
     */
    public static final OrderInfo ORDER_INFO = com.vpu.mp.db.shop.tables.OrderInfo.ORDER_INFO;

    /**
     * The table <code>mini_shop_471752.b2c_order_must</code>.
     */
    public static final OrderMust ORDER_MUST = com.vpu.mp.db.shop.tables.OrderMust.ORDER_MUST;

    /**
     * The table <code>mini_shop_471752.b2c_order_refund_record</code>.
     */
    public static final OrderRefundRecord ORDER_REFUND_RECORD = com.vpu.mp.db.shop.tables.OrderRefundRecord.ORDER_REFUND_RECORD;

    /**
     * The table <code>mini_shop_471752.b2c_order_verifier</code>.
     */
    public static final OrderVerifier ORDER_VERIFIER = com.vpu.mp.db.shop.tables.OrderVerifier.ORDER_VERIFIER;

    /**
     * The table <code>mini_shop_471752.b2c_package_goods_cart</code>.
     */
    public static final PackageGoodsCart PACKAGE_GOODS_CART = com.vpu.mp.db.shop.tables.PackageGoodsCart.PACKAGE_GOODS_CART;

    /**
     * The table <code>mini_shop_471752.b2c_package_sale</code>.
     */
    public static final PackageSale PACKAGE_SALE = com.vpu.mp.db.shop.tables.PackageSale.PACKAGE_SALE;

    /**
     * The table <code>mini_shop_471752.b2c_page_classification</code>.
     */
    public static final PageClassification PAGE_CLASSIFICATION = com.vpu.mp.db.shop.tables.PageClassification.PAGE_CLASSIFICATION;

    /**
     * The table <code>mini_shop_471752.b2c_part_order_goods_ship</code>.
     */
    public static final PartOrderGoodsShip PART_ORDER_GOODS_SHIP = com.vpu.mp.db.shop.tables.PartOrderGoodsShip.PART_ORDER_GOODS_SHIP;

    /**
     * The table <code>mini_shop_471752.b2c_payment</code>.
     */
    public static final Payment PAYMENT = com.vpu.mp.db.shop.tables.Payment.PAYMENT;

    /**
     * The table <code>mini_shop_471752.b2c_payment_record</code>.
     */
    public static final PaymentRecord PAYMENT_RECORD = com.vpu.mp.db.shop.tables.PaymentRecord.PAYMENT_RECORD;

    /**
     * The table <code>mini_shop_471752.b2c_pictorial</code>.
     */
    public static final Pictorial PICTORIAL = com.vpu.mp.db.shop.tables.Pictorial.PICTORIAL;

    /**
     * The table <code>mini_shop_471752.b2c_pin_group_define</code>.
     */
    public static final PinGroupDefine PIN_GROUP_DEFINE = com.vpu.mp.db.shop.tables.PinGroupDefine.PIN_GROUP_DEFINE;

    /**
     * The table <code>mini_shop_471752.b2c_pin_group_list</code>.
     */
    public static final PinGroupList PIN_GROUP_LIST = com.vpu.mp.db.shop.tables.PinGroupList.PIN_GROUP_LIST;

    /**
     * The table <code>mini_shop_471752.b2c_pin_group_product_define</code>.
     */
    public static final PinGroupProductDefine PIN_GROUP_PRODUCT_DEFINE = com.vpu.mp.db.shop.tables.PinGroupProductDefine.PIN_GROUP_PRODUCT_DEFINE;

    /**
     * The table <code>mini_shop_471752.b2c_pin_integration_define</code>.
     */
    public static final PinIntegrationDefine PIN_INTEGRATION_DEFINE = com.vpu.mp.db.shop.tables.PinIntegrationDefine.PIN_INTEGRATION_DEFINE;

    /**
     * The table <code>mini_shop_471752.b2c_pin_integration_list</code>.
     */
    public static final PinIntegrationList PIN_INTEGRATION_LIST = com.vpu.mp.db.shop.tables.PinIntegrationList.PIN_INTEGRATION_LIST;

    /**
     * The table <code>mini_shop_471752.b2c_pledge</code>.
     */
    public static final Pledge PLEDGE = com.vpu.mp.db.shop.tables.Pledge.PLEDGE;

    /**
     * The table <code>mini_shop_471752.b2c_presale</code>.
     */
    public static final Presale PRESALE = com.vpu.mp.db.shop.tables.Presale.PRESALE;

    /**
     * The table <code>mini_shop_471752.b2c_presale_product</code>.
     */
    public static final PresaleProduct PRESALE_PRODUCT = com.vpu.mp.db.shop.tables.PresaleProduct.PRESALE_PRODUCT;

    /**
     * The table <code>mini_shop_471752.b2c_purchase_price_define</code>.
     */
    public static final PurchasePriceDefine PURCHASE_PRICE_DEFINE = com.vpu.mp.db.shop.tables.PurchasePriceDefine.PURCHASE_PRICE_DEFINE;

    /**
     * The table <code>mini_shop_471752.b2c_purchase_price_rule</code>.
     */
    public static final PurchasePriceRule PURCHASE_PRICE_RULE = com.vpu.mp.db.shop.tables.PurchasePriceRule.PURCHASE_PRICE_RULE;

    /**
     * The table <code>mini_shop_471752.b2c_rebate_price_record</code>.
     */
    public static final RebatePriceRecord REBATE_PRICE_RECORD = com.vpu.mp.db.shop.tables.RebatePriceRecord.REBATE_PRICE_RECORD;

    /**
     * The table <code>mini_shop_471752.b2c_recommend_goods</code>.
     */
    public static final RecommendGoods RECOMMEND_GOODS = com.vpu.mp.db.shop.tables.RecommendGoods.RECOMMEND_GOODS;

    /**
     * The table <code>mini_shop_471752.b2c_record_admin_action</code>.
     */
    public static final RecordAdminAction RECORD_ADMIN_ACTION = com.vpu.mp.db.shop.tables.RecordAdminAction.RECORD_ADMIN_ACTION;

    /**
     * The table <code>mini_shop_471752.b2c_reduce_price</code>.
     */
    public static final ReducePrice REDUCE_PRICE = com.vpu.mp.db.shop.tables.ReducePrice.REDUCE_PRICE;

    /**
     * The table <code>mini_shop_471752.b2c_reduce_price_goods</code>.
     */
    public static final ReducePriceGoods REDUCE_PRICE_GOODS = com.vpu.mp.db.shop.tables.ReducePriceGoods.REDUCE_PRICE_GOODS;

    /**
     * The table <code>mini_shop_471752.b2c_reduce_price_product</code>.
     */
    public static final ReducePriceProduct REDUCE_PRICE_PRODUCT = com.vpu.mp.db.shop.tables.ReducePriceProduct.REDUCE_PRICE_PRODUCT;

    /**
     * The table <code>mini_shop_471752.b2c_refund_amount_record</code>.
     */
    public static final RefundAmountRecord REFUND_AMOUNT_RECORD = com.vpu.mp.db.shop.tables.RefundAmountRecord.REFUND_AMOUNT_RECORD;

    /**
     * The table <code>mini_shop_471752.b2c_refund_card_record</code>.
     */
    public static final RefundCardRecord REFUND_CARD_RECORD = com.vpu.mp.db.shop.tables.RefundCardRecord.REFUND_CARD_RECORD;

    /**
     * The table <code>mini_shop_471752.b2c_return_order</code>.
     */
    public static final ReturnOrder RETURN_ORDER = com.vpu.mp.db.shop.tables.ReturnOrder.RETURN_ORDER;

    /**
     * The table <code>mini_shop_471752.b2c_return_order_goods</code>.
     */
    public static final ReturnOrderGoods RETURN_ORDER_GOODS = com.vpu.mp.db.shop.tables.ReturnOrderGoods.RETURN_ORDER_GOODS;

    /**
     * The table <code>mini_shop_471752.b2c_return_status_change</code>.
     */
    public static final ReturnStatusChange RETURN_STATUS_CHANGE = com.vpu.mp.db.shop.tables.ReturnStatusChange.RETURN_STATUS_CHANGE;

    /**
     * The table <code>mini_shop_471752.b2c_search_history</code>.
     */
    public static final SearchHistory SEARCH_HISTORY = com.vpu.mp.db.shop.tables.SearchHistory.SEARCH_HISTORY;

    /**
     * The table <code>mini_shop_471752.b2c_sec_kill_define</code>.
     */
    public static final SecKillDefine SEC_KILL_DEFINE = com.vpu.mp.db.shop.tables.SecKillDefine.SEC_KILL_DEFINE;

    /**
     * The table <code>mini_shop_471752.b2c_sec_kill_list</code>.
     */
    public static final SecKillList SEC_KILL_LIST = com.vpu.mp.db.shop.tables.SecKillList.SEC_KILL_LIST;

    /**
     * The table <code>mini_shop_471752.b2c_sec_kill_product_define</code>.
     */
    public static final SecKillProductDefine SEC_KILL_PRODUCT_DEFINE = com.vpu.mp.db.shop.tables.SecKillProductDefine.SEC_KILL_PRODUCT_DEFINE;

    /**
     * The table <code>mini_shop_471752.b2c_service_message_record</code>.
     */
    public static final ServiceMessageRecord SERVICE_MESSAGE_RECORD = com.vpu.mp.db.shop.tables.ServiceMessageRecord.SERVICE_MESSAGE_RECORD;

    /**
     * The table <code>mini_shop_471752.b2c_service_order</code>.
     */
    public static final ServiceOrder SERVICE_ORDER = com.vpu.mp.db.shop.tables.ServiceOrder.SERVICE_ORDER;

    /**
     * The table <code>mini_shop_471752.b2c_service_request</code>.
     */
    public static final ServiceRequest SERVICE_REQUEST = com.vpu.mp.db.shop.tables.ServiceRequest.SERVICE_REQUEST;

    /**
     * The table <code>mini_shop_471752.b2c_service_schedule</code>.
     */
    public static final ServiceSchedule SERVICE_SCHEDULE = com.vpu.mp.db.shop.tables.ServiceSchedule.SERVICE_SCHEDULE;

    /**
     * The table <code>mini_shop_471752.b2c_service_technician</code>.
     */
    public static final ServiceTechnician SERVICE_TECHNICIAN = com.vpu.mp.db.shop.tables.ServiceTechnician.SERVICE_TECHNICIAN;

    /**
     * The table <code>mini_shop_471752.b2c_service_technician_group</code>.
     */
    public static final ServiceTechnicianGroup SERVICE_TECHNICIAN_GROUP = com.vpu.mp.db.shop.tables.ServiceTechnicianGroup.SERVICE_TECHNICIAN_GROUP;

    /**
     * The table <code>mini_shop_471752.b2c_service_technician_schedule</code>.
     */
    public static final ServiceTechnicianSchedule SERVICE_TECHNICIAN_SCHEDULE = com.vpu.mp.db.shop.tables.ServiceTechnicianSchedule.SERVICE_TECHNICIAN_SCHEDULE;

    /**
     * The table <code>mini_shop_471752.b2c_share_record</code>.
     */
    public static final ShareRecord SHARE_RECORD = com.vpu.mp.db.shop.tables.ShareRecord.SHARE_RECORD;

    /**
     * The table <code>mini_shop_471752.b2c_share_split</code>.
     */
    public static final ShareSplit SHARE_SPLIT = com.vpu.mp.db.shop.tables.ShareSplit.SHARE_SPLIT;

    /**
     * The table <code>mini_shop_471752.b2c_shipping</code>.
     */
    public static final Shipping SHIPPING = com.vpu.mp.db.shop.tables.Shipping.SHIPPING;

    /**
     * The table <code>mini_shop_471752.b2c_shop_cfg</code>.
     */
    public static final ShopCfg SHOP_CFG = com.vpu.mp.db.shop.tables.ShopCfg.SHOP_CFG;

    /**
     * The table <code>mini_shop_471752.b2c_sms_send_record</code>.
     */
    public static final SmsSendRecord SMS_SEND_RECORD = com.vpu.mp.db.shop.tables.SmsSendRecord.SMS_SEND_RECORD;

    /**
     * The table <code>mini_shop_471752.b2c_sort</code>.
     */
    public static final Sort SORT = com.vpu.mp.db.shop.tables.Sort.SORT;

    /**
     * The table <code>mini_shop_471752.b2c_spec</code>.
     */
    public static final Spec SPEC = com.vpu.mp.db.shop.tables.Spec.SPEC;

    /**
     * The table <code>mini_shop_471752.b2c_spec_vals</code>.
     */
    public static final SpecVals SPEC_VALS = com.vpu.mp.db.shop.tables.SpecVals.SPEC_VALS;

    /**
     * The table <code>mini_shop_471752.b2c_store</code>.
     */
    public static final Store STORE = com.vpu.mp.db.shop.tables.Store.STORE;

    /**
     * The table <code>mini_shop_471752.b2c_store_goods</code>.
     */
    public static final StoreGoods STORE_GOODS = com.vpu.mp.db.shop.tables.StoreGoods.STORE_GOODS;

    /**
     * The table <code>mini_shop_471752.b2c_store_group</code>.
     */
    public static final StoreGroup STORE_GROUP = com.vpu.mp.db.shop.tables.StoreGroup.STORE_GROUP;

    /**
     * The table <code>mini_shop_471752.b2c_store_order</code>.
     */
    public static final StoreOrder STORE_ORDER = com.vpu.mp.db.shop.tables.StoreOrder.STORE_ORDER;

    /**
     * The table <code>mini_shop_471752.b2c_store_service</code>.
     */
    public static final StoreService STORE_SERVICE = com.vpu.mp.db.shop.tables.StoreService.STORE_SERVICE;

    /**
     * The table <code>mini_shop_471752.b2c_store_service_category</code>.
     */
    public static final StoreServiceCategory STORE_SERVICE_CATEGORY = com.vpu.mp.db.shop.tables.StoreServiceCategory.STORE_SERVICE_CATEGORY;

    /**
     * The table <code>mini_shop_471752.b2c_sub_order_info</code>.
     */
    public static final SubOrderInfo SUB_ORDER_INFO = com.vpu.mp.db.shop.tables.SubOrderInfo.SUB_ORDER_INFO;

    /**
     * The table <code>mini_shop_471752.b2c_tag</code>.
     */
    public static final Tag TAG = com.vpu.mp.db.shop.tables.Tag.TAG;

    /**
     * The table <code>mini_shop_471752.b2c_template_config</code>.
     */
    public static final TemplateConfig TEMPLATE_CONFIG = com.vpu.mp.db.shop.tables.TemplateConfig.TEMPLATE_CONFIG;

    /**
     * The table <code>mini_shop_471752.b2c_trades</code>.
     */
    public static final Trades TRADES = com.vpu.mp.db.shop.tables.Trades.TRADES;

    /**
     * The table <code>mini_shop_471752.b2c_trades_record</code>.
     */
    public static final TradesRecord TRADES_RECORD = com.vpu.mp.db.shop.tables.TradesRecord.TRADES_RECORD;

    /**
     * The table <code>mini_shop_471752.b2c_trades_record_summary</code>.
     */
    public static final TradesRecordSummary TRADES_RECORD_SUMMARY = com.vpu.mp.db.shop.tables.TradesRecordSummary.TRADES_RECORD_SUMMARY;

    /**
     * The table <code>mini_shop_471752.b2c_uploaded_image</code>.
     */
    public static final UploadedImage UPLOADED_IMAGE = com.vpu.mp.db.shop.tables.UploadedImage.UPLOADED_IMAGE;

    /**
     * The table <code>mini_shop_471752.b2c_uploaded_image_category</code>.
     */
    public static final UploadedImageCategory UPLOADED_IMAGE_CATEGORY = com.vpu.mp.db.shop.tables.UploadedImageCategory.UPLOADED_IMAGE_CATEGORY;

    /**
     * The table <code>mini_shop_471752.b2c_uploaded_video</code>.
     */
    public static final UploadedVideo UPLOADED_VIDEO = com.vpu.mp.db.shop.tables.UploadedVideo.UPLOADED_VIDEO;

    /**
     * The table <code>mini_shop_471752.b2c_user</code>.
     */
    public static final User USER = com.vpu.mp.db.shop.tables.User.USER;

    /**
     * The table <code>mini_shop_471752.b2c_user_account</code>.
     */
    public static final UserAccount USER_ACCOUNT = com.vpu.mp.db.shop.tables.UserAccount.USER_ACCOUNT;

    /**
     * The table <code>mini_shop_471752.b2c_user_address</code>.
     */
    public static final UserAddress USER_ADDRESS = com.vpu.mp.db.shop.tables.UserAddress.USER_ADDRESS;

    /**
     * The table <code>mini_shop_471752.b2c_user_card</code>.
     */
    public static final UserCard USER_CARD = com.vpu.mp.db.shop.tables.UserCard.USER_CARD;

    /**
     * The table <code>mini_shop_471752.b2c_user_cart_record</code>.
     */
    public static final UserCartRecord USER_CART_RECORD = com.vpu.mp.db.shop.tables.UserCartRecord.USER_CART_RECORD;

    /**
     * The table <code>mini_shop_471752.b2c_user_collection</code>.
     */
    public static final UserCollection USER_COLLECTION = com.vpu.mp.db.shop.tables.UserCollection.USER_COLLECTION;

    /**
     * The table <code>mini_shop_471752.b2c_user_detail</code>.
     */
    public static final UserDetail USER_DETAIL = com.vpu.mp.db.shop.tables.UserDetail.USER_DETAIL;

    /**
     * The table <code>mini_shop_471752.b2c_user_explain</code>.
     */
    public static final UserExplain USER_EXPLAIN = com.vpu.mp.db.shop.tables.UserExplain.USER_EXPLAIN;

    /**
     * The table <code>mini_shop_471752.b2c_user_fanli_statistics</code>.
     */
    public static final UserFanliStatistics USER_FANLI_STATISTICS = com.vpu.mp.db.shop.tables.UserFanliStatistics.USER_FANLI_STATISTICS;

    /**
     * The table <code>mini_shop_471752.b2c_user_goods_record</code>.
     */
    public static final UserGoodsRecord USER_GOODS_RECORD = com.vpu.mp.db.shop.tables.UserGoodsRecord.USER_GOODS_RECORD;

    /**
     * The table <code>mini_shop_471752.b2c_user_import</code>.
     */
    public static final UserImport USER_IMPORT = com.vpu.mp.db.shop.tables.UserImport.USER_IMPORT;

    /**
     * The table <code>mini_shop_471752.b2c_user_import_detail</code>.
     */
    public static final UserImportDetail USER_IMPORT_DETAIL = com.vpu.mp.db.shop.tables.UserImportDetail.USER_IMPORT_DETAIL;

    /**
     * The table <code>mini_shop_471752.b2c_user_login_record</code>.
     */
    public static final UserLoginRecord USER_LOGIN_RECORD = com.vpu.mp.db.shop.tables.UserLoginRecord.USER_LOGIN_RECORD;

    /**
     * The table <code>mini_shop_471752.b2c_user_rebate_price</code>.
     */
    public static final UserRebatePrice USER_REBATE_PRICE = com.vpu.mp.db.shop.tables.UserRebatePrice.USER_REBATE_PRICE;

    /**
     * The table <code>mini_shop_471752.b2c_user_score</code>.
     */
    public static final UserScore USER_SCORE = com.vpu.mp.db.shop.tables.UserScore.USER_SCORE;

    /**
     * The table <code>mini_shop_471752.b2c_user_score_set</code>.
     */
    public static final UserScoreSet USER_SCORE_SET = com.vpu.mp.db.shop.tables.UserScoreSet.USER_SCORE_SET;

    /**
     * The table <code>mini_shop_471752.b2c_user_summary_trend</code>.
     */
    public static final UserSummaryTrend USER_SUMMARY_TREND = com.vpu.mp.db.shop.tables.UserSummaryTrend.USER_SUMMARY_TREND;

    /**
     * The table <code>mini_shop_471752.b2c_user_tag</code>.
     */
    public static final UserTag USER_TAG = com.vpu.mp.db.shop.tables.UserTag.USER_TAG;

    /**
     * The table <code>mini_shop_471752.b2c_user_total_fanli</code>.
     */
    public static final UserTotalFanli USER_TOTAL_FANLI = com.vpu.mp.db.shop.tables.UserTotalFanli.USER_TOTAL_FANLI;

    /**
     * The table <code>mini_shop_471752.b2c_wxp_unlimit_code</code>.
     */
    public static final WxpUnlimitCode WXP_UNLIMIT_CODE = com.vpu.mp.db.shop.tables.WxpUnlimitCode.WXP_UNLIMIT_CODE;

    /**
     * The table <code>mini_shop_471752.b2c_wxp_unlimit_scene</code>.
     */
    public static final WxpUnlimitScene WXP_UNLIMIT_SCENE = com.vpu.mp.db.shop.tables.WxpUnlimitScene.WXP_UNLIMIT_SCENE;

    /**
     * The table <code>mini_shop_471752.b2c_wx_shopping_recommend</code>.
     */
    public static final WxShoppingRecommend WX_SHOPPING_RECOMMEND = com.vpu.mp.db.shop.tables.WxShoppingRecommend.WX_SHOPPING_RECOMMEND;

    /**
     * The table <code>mini_shop_471752.b2c_xcx_customer_page</code>.
     */
    public static final XcxCustomerPage XCX_CUSTOMER_PAGE = com.vpu.mp.db.shop.tables.XcxCustomerPage.XCX_CUSTOMER_PAGE;
}
