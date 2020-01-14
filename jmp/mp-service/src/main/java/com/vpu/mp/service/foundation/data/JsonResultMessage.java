package com.vpu.mp.service.foundation.data;

/**
 * @author 新国
 */
public class JsonResultMessage {
    public static final String MSG_SUCCESS = "common.success";
    public static final String MSG_FAIL = "common.fail";
    public static final String MSG_PARAM_ERROR = "common.param.error";

    // 账号

	public static final String MSG_ACCOUNT_OR_PASSWORD_INCRRECT = "account.accountOrPassword.incrrect";
	public static final String MSG_ACCOUNT_MODILE_APPLIED = "account.mobile.applied";
	public static final String MSG_ACCOUNT_MODILE_REGISTERED = "account.mobile.registered";
	public static final String MSG_ACCOUNT_MODILE_NOT_NULL = "account.mobile.notNull";
	public static final String MSG_ACCOUNT_LOGIN_EXPIRED = "account.login.expired";
	public static final String MSG_ACCOUNT_ROLE__AUTH_INSUFFICIENT = "account.role.auth.insufficient";
	public static final String MSG_ACCOUNT_ROLE__SHOP_SELECT = "account.role.shop.select";
	public static final String MSG_ACCOUNT_NAME_NOT_NULL = "account.name.notNull";
	public static final String MSG_ACCOUNT_ISSUBLOGIN_NOT_NULL = "account.isSubLogin.notNull";
	public static final String MSG_ACCOUNT_SAME = "account.name.same";
	public static final String MSG_MOBILE_SAME = "account.mobile.same";
	public static final String MSG_ACCOUNT_SHOP_NULL = "account.shop.null";
	public static final String MSG_ACCOUNT_SHOP_EXPIRE = "account.shop.expire";
	public static final String MSG_ACCOUNT_SHOPAVATAR_NOT_NULL = "account.shopAvatar.notNull";
	public static final String MSG_ACCOUNT_ACCOUNTNAME_NOT_NULL = "account.accountName.notNull";
	public static final String MSG_ACCOUNT_PASSWD_NO_SAME = "account.passwd.noSame";
	public static final String MSG_ACCOUNT_OLD_PASSWD_ERROR = "account.account.oldPasswd.error";
	public static final String MSG_ACCOUNT_OLD_NEW_PASSWD_NO_SAME = "account.oldAndNew.passwd.noSame";
	public static final String MSG_ACCOUNT_PASSWD_NOT_NULL = "account.passwd.notNull";
	public static final String MSG_ACCOUNT_NEWPASSWD_NOT_NULL = "account.newpasswd.notNull";
	public static final String MSG_ACCOUNT_CONFNEWPASSWD_NOT_NULL = "account.confnewpasswd.notNull";
	public static final String MSG_ACCOUNT_PASSWD_LENGTH_LIMIT = "account.passwd.length.limit";
	public static final String MSG_ACCOUNT_USERNAME_NOT_NULL = "account.username.not.null";
	public static final String MSG_ACCOUNT_SHOPID_NOT_NULL = "account.shopId.not.null";
	public static final String MSG_ACCOUNT_PASSWD_ERROR = "account.passwd.error";
	public static final String MSG_CODE_ACCOUNT_SHOP_ROLE_INSUFFICIENT = "account.shop.role.insufficient";
	public static final String MSG_CODE_ACCOUNT_SHOP_ROLE_OCCUPY = "account.shop.role.occupy";
	public static final String MSG_CODE_ACCOUNT_ASSIGNED_ROLE = "account.assigned.role";
	public static final String MSG_CODE_ACCOUNT_SELECT_SHOP = "account.select.shop";
	public static final String MSG_CODE_NEED_PRIVILEGEPASS = "account.need.privilegePass";
	public static final String MSG_CODE_ACCOUNT_SYSID_IS_NULL = "account.sysId.is.null";
	public static final String MSG_CODE_ACCOUNT_VERSIN_NO_POWER = "account.version.no.power";
	public static final String MSG_ACCOUNT_SHOPTYPE_REGISTERED = "account.shoptype.notNull";
	public static final String MSG_ACCOUNT_SYTEM_LOGIN_EXPIRED = "system.account.login.expired";
	public static final String MSG_CODE_ACCOUNT_ENNAME_ISNULL = "enanme.isnull";

	// 图片

	public static final String MSG_IMGAE_UPLOAD_FAILED = "image.upload.failed";
	public static final String MSG_IMGAE_FORMAT_INVALID = "image.format.invalid";
	public static final String MSG_IMGAE_CROP_FAILED = "image.crop.failed";
	public static final String MSG_IMGAE_UPLOAD_GT_5M = "image.upload.gt5m";
	public static final String MSG_IMGAE_UPLOAD_EQ_WIDTH = "image.upload.eqWidth";
	public static final String MSG_IMGAE_UPLOAD_EQ_HEIGHT = "image.upload.eqHeight";

	public static final String MSG_IMAGE_CATEGORY_IMGCATID_NOT_NULL = "image.category.imgCatId.notNull";
	public static final String MSG_IMAGE_CATEGORY_IMGCATPARENTID_NOT_NULL = "image.category.imgCatParentId.notNull";
	public static final String MSG_IMAGE_CATEGORY_IMGCATNAME_NOT_NULL = "image.category.imgCatName.notNull";
	public static final String MSG_IMAGE_CATEGORY_IMGCATNAME_ROOT_NAME = "image.category.imgCatName.root.name";

	public static final String MSG_VIDEO_UPLOAD_FAILED = "video.upload.failed";
	public static final String MSG_VIDEO_FORMAT_INVALID = "video.format.invalid";
	public static final String MSG_VIDEO_CATEGORY_VIDEOCATID_NOT_NULL = "video.category.videoCatId.notNull";
	public static final String MSG_VIDEO_CATEGORY_VIDEOCATPARENTID_NOT_NULL = "video.category.videoCatParentId.notNull";
	public static final String MSG_VIDEO_CATEGORY_VIDEOCATNAME_NOT_NULL = "video.category.videoCatName.notNull";
	public static final String MSG_VIDEO_UPLOAD_GT_10M = "video.upload.gt10m";

	/**
	 * 商品
	 */
	public static final String GOODS_ID_IS_NULL = "goods.id.is.null";
    public static final String GOODS_NAME_EXIST = "goods.name.exist";
    public static final String GOODS_NAME_IS_NULL="goods.name.is.null";
    public static final String GOODS_SN_EXIST = "goods.sn.exist";
    public static final String GOODS_MAIN_IMG_IS_NULL="goods.main.img.is.null";
	/**
	 * 商品品牌
	 */
	public static final String GOODS_BRAND_NAME_EXIST = "goods.brand.name.exist";
	public static final String GOODS_BRAND_NAME_IS_NULL = "goods.brand.name.is.null";
	public static final String GOODS_BRAND_ID_IS_NULL = "goods.brand.id.is.null";
	public static final String GOODS_BRAND_CALSSIFY_NAME_EXIST = "goods.brand.classify.name.exist";
	public static final String GOODS_BRAND_ALSSIFY_NAME_IS_NULL = "goods.brand.classify.name.is.null";
	public static final String GOODS_BRAND_ALSSIFY_ID_IS_NULL = "goods.brand.classify.id.is.null";

	/**
	 * 商品分类
	 */
	public static final String GOODS_SORT_NAME_EXIST = "goods.sort.name.exist";
	public static final String GOODS_SORT_NAME_IS_NULL = "goods.sort.name.is.null";
	public static final String GOODS_SORT_ID_IS_NULL = "goods.sort.id.is.null";
	public static final String GOODS_RECOMMEND_SORT_CHILDREN_NOT_NULL="goods.recommend.sort.children.not.null";

	public static final String GOODS_LABEL_NAME_EXIST = "goods.label.name.exist";
	public static final String GOODS_LABEL_NOT_EXIST = "goods.label.not.exist";
	public static final String GOODS_LABEL_ID_NOT_NULL = "goods.label.id.notNull";
	public static final String GOODS_LABEL_NAME_NOT_NULL = "goods.label.name.notNull";

    /**
     * 商品规格
     */
	public static final String GOODS_SPEC_PRD_SN_EXIST = "goods.spec.prd.sn.exist";
	public static final String GOODS_SPEC_NAME_REPETITION = "goods.spec.name.repetition";
	public static final String GOODS_SPEC_VAL_REPETITION = "goods.spec.val.repetition";
	public static final String GOODS_SPEC_ATTRIBUTE_SPEC_K_V_CONFLICT="goods.spec.attribute.spec.k.v.conflict";

  public static final String GOODS_RECOMMEND_NAME_NOT_NULL = "goods.recommend.name.notNull";
  public static final String GOODS_RECOMMEND_TYPE_NOT_NULL = "goods.recommend.type.notNull";
  public static final String GOODS_RECOMMEND_NAME_EXIST = "goods.recommend.name.exist";
  public static final String GOODS_RECOMMEND_ID_NOT_EXIST = "goods.recommend.id.notexist";
  public static final String GOODS_RECOMMEND_NOT_EXIST = "goods.recommend.id.notexist";
  public static final String GOODS_RECOMMEND_CHOOSE_TYPE_NOT_NULL =
      "goods.recommend.choose_type.notNull";
  public static final String GOODS_RECOMMEND_NUMBER_NOT_NULL = "goods.recommend.number.notNull";
  public static final String GOODS_RECOMMEND_NO_RECOMMENDED_GOODS = "goods.recommend.no.recommended.goods";

    /**
     * 商品导出
     */
    public static final String GOODS_EXPORT_FILE_NAME = "goods.export.file_name";
    public static final String GOODS_EXPORT_COLUMN_CREATE_TIME = "goods.export.column.create_time";
    public static final String GOODS_EXPORT_COLUMN_CAT_NAME = "goods.export.column.cat_name";
    public static final String GOODS_EXPORT_COLUMN_SORT_NAME_PARENT = "goods.export.column.sort_name_parent";
    public static final String GOODS_EXPORT_COLUMN_SORT_NAME_CHILD = "goods.export.column.sort_name_child";
    public static final String GOODS_EXPORT_COLUMN_BRAND_NAME = "goods.export.column.brand_name";
    public static final String GOODS_EXPORT_COLUMN_GOODS_SN = "goods.export.column.goods_sn";
    public static final String GOODS_EXPORT_COLUMN_GOODS_NAME = "goods.export.column.goods_name";
    public static final String GOODS_EXPORT_COLUMN_PRD_DESC = "goods.export.column.prd_desc";
    public static final String GOODS_EXPORT_COLUMN_GOODS_AD = "goods.export.column.goods_ad";
    public static final String GOODS_EXPORT_COLUMN_PRD_SN = "goods.export.column.prd_sn";
    public static final String GOODS_EXPORT_COLUMN_PRD_NUMBER = "goods.export.column.prd_number";
    public static final String GOODS_EXPORT_COLUMN_PRD_COST_PRICE = "goods.export.column.prd_cost_price";
    public static final String GOODS_EXPORT_COLUMN_MARKET_PRICE = "goods.export.column.market_price";
    public static final String GOODS_EXPORT_COLUMN_SHOP_PRICE = "goods.export.column.shop_price";
    public static final String GOODS_EXPORT_COLUMN_IS_ON_SALE = "goods.export.column.is_on_sale";
    public static final String GOODS_EXPORT_COLUMN_LIMIT_BUY_NUMBER = "goods.export.column.limit_buy_number";
    public static final String GOODS_EXPORT_COLUMN_GOODS_WEIGHT = "goods.export.column.goods_weight";
    public static final String GOODS_EXPORT_COLUMN_UNIT = "goods.export.column.unit";
    public static final String GOODS_EXPORT_COLUMN_GOODS_IMG = "goods.export.column.goods_img";

    /**
     * 商品评价
     */
    public static final String GOODS_COMMENT_NO_PERMISSION = "goods.comment.no_permission";

    /**
     * 营销
     */
    public static final String DISTRIBUTOR_GROUP_NAME_EXIST = "distributor.group.name.exist";

    /**
     * 营销-砍价excel导出-发起砍价
     */
    public static final String STATUS_SUCCESS = "status.success";
    public static final String STATUS_FAIL = "status.fail";
    public static final String STATUS_IN_PROGRESS = "status.in_progress";
    public static final String BARGAIN_RECORD_LIST_FILENAME = "bargain.record.list.filename";
    public static final String BARGAIN_RECORD_LIST_ID = "bargain.record.list.id";
    public static final String BARGAIN_RECORD_LIST_GOODS_NAME = "bargain.record.list.goods_name";
    public static final String BARGAIN_RECORD_LIST_USERNAME= "bargain.record.list.username";
    public static final String BARGAIN_RECORD_LIST_MOBILE = "bargain.record.list.mobile";
    public static final String BARGAIN_RECORD_LIST_CREATE_TIME = "bargain.record.list.create_time";
    public static final String BARGAIN_RECORD_LIST_BARGAIN_MONEY = "bargain.record.list.bargain_money";
    public static final String BARGAIN_RECORD_LIST_SURPLUS_MONEY = "bargain.record.list.surplus_money";
    public static final String BARGAIN_RECORD_LIST_USER_NUMBER = "bargain.record.list.user_number";
    public static final String BARGAIN_RECORD_LIST_STATUS = "bargain.record.list.status";

    /**
     * 营销-砍价excel导出-帮忙砍价
     */
    public static final String BARGAIN_USER_LIST_FILENAME = "bargain.user.list.filename";
    public static final String BARGAIN_USER_LIST_ID = "bargain.user.list.id";
    public static final String BARGAIN_USER_LIST_USERNAME = "bargain.user.list.username";
    public static final String BARGAIN_USER_LIST_MOBILE = "bargain.user.list.mobile";
    public static final String BARGAIN_USER_LIST_CREATE_TIME = "bargain.user.list.create_time";
    public static final String BARGAIN_USER_LIST_BARGAIN_MONEY = "bargain.user.list.bargain_money";

    /**
     * 营销-优惠券礼包订单excel导出
     */
    public static final String COUPON_PACK_ORDER_FILENAME = "coupon.pack.order.filename";
    public static final String COUPON_PACK_ORDER_ORDER_SN = "coupon.pack.order.order_sn";
    public static final String COUPON_PACK_ORDER_MONEY_PAID = "coupon.pack.order.money_paid";
    public static final String COUPON_PACK_ORDER_USE_ACCOUNT = "coupon.pack.order.use_account";
    public static final String COUPON_PACK_ORDER_USE_SCORE = "coupon.pack.order.use_score";
    public static final String COUPON_PACK_ORDER_MEMBER_CARD_BALANCE = "coupon.pack.order.member_card_balance";
    public static final String COUPON_PACK_ORDER_USERNAME = "coupon.pack.order.username";
    public static final String COUPON_PACK_ORDER_MOBILE = "coupon.pack.order.mobile";
    public static final String COUPON_PACK_ORDER_CREATE_TIME = "coupon.pack.order.create_time";
    public static final String COUPON_PACK_ORDER_STATUS = "coupon.pack.order.order_status";



    /**
     * 营销-好友代付
     */
    public static final String INSTEAD_PAY_NOT_SET_PAY_WAY = "instead.pay.not.set.pay.way";
    public static final String INSTEAD_PAY_NOT_SET_SINGLE_PAY_MESSAGE = "instead.pay.not.set.single.pay.message";
    public static final String INSTEAD_PAY_SINGLE_PAY_MESSAGE_TOO_LONG = "instead.pay.single.pay.message.too.long";
    public static final String INSTEAD_PAY_NOT_SET_MULTIPLE_PAY_MESSAGE = "instead.pay.not.set.multiple.pay.message";
    public static final String INSTEAD_PAY_MULTIPLE_PAY_MESSAGE_TOO_LONG = "instead.pay.multiple.pay.message.too.long";
    public static final String INSTEAD_PAY_NEED_AT_LEAST_THREE_PAY_RATIO = "instead.pay.need.at.least.three.pay.ratio";
    public static final String INSTEAD_PAY_NEED_AT_LEAST_TWO_DOUBLE_PAY_RATIO = "instead.pay.need.at.least.two.double.pay.ratio";
    public static final String INSTEAD_PAY_VALUE_OVER_RANGE = "instead.pay.value.over.range";
    public static final String INSTEAD_PAY_STATUS_IS_NULL= "instead.pay.status.is.null";

	/**
	 * 营销-拼团
	 */
	public static final String GROUP_BUY_ADD_ACTIVITY_STOP_STATUS="group.buy.add.activity.stop.status";
	public static final String GROUP_BUY_ACTIVITY_GOODS_OVERLAPPING="group.buy.activity.goods.overlapping";
	public static final String GROUP_BUY_GROUPID_DOES_NOT_EXIST="group.buy.groupId.does.not.exist";
	public static final String GROUP_BUY_ACTIVITY_STATUS_DISABLE="group.buy.activity.status.disable";
	public static final String GROUP_BUY_ACTIVITY_STATUS_NOTSTART="group.buy.activity.status.not.start";
	public static final String GROUP_BUY_ACTIVITY_STATUS_END="group.buy.activity.status.end";
	public static final String GROUP_BUY_ACTIVITY_GROUP_STATUS_CANCEL="group.buy.activity.group.status.cancel";
	public static final String GROUP_BUY_ACTIVITY_GROUP_OPEN_LIMIT_MAX="group.buy.activity.group.open.limit.max";
	public static final String GROUP_BUY_ACTIVITY_GROUP_JOIN_LIMIT_MAX="group.buy.activity.group.join.limit.max";
	public static final String GROUP_BUY_ACTIVITY_GROUP_EMPLOEES_MAX="group.buy.activity.group.emploees.max";
	public static final String GROUP_BUY_ACTIVITY_GROUP_JOINING="group.buy.activity.group.joining";
    /**
     * 营销-秒杀
     */
    public static final String SECKILL_CONFLICTING_ACT_TIME="seckill.conflicting.act.time";

    public static final String SHARE_REWARD_COUPON_NUM_LIMIT = "share.reward.coupon.num.limit";

    /**
     * 营销-砍价
     */
    public static final String BARGAIN_CONFLICTING_ACT_TIME="bargain.conflicting.act.time";
    public static final String BARGAIN_NOT_YET_SUCCESSFUL="bargain.not.yet.successful";
    public static final String BARGAIN_RECORD_ORDERED="bargain.record.ordered";

	/**
	 *营销-我的奖品
	 */
	public static final String MY_PRIZE_ACTIVITY_RECEIVED="my.prize.activity.goods.received";
    public static final String MY_PRIZE_ACTIVITY_EXPIRED="my.prize.activity.goods.expired";
    /**拼团抽奖活动 */
    public static final String GROUP_DRAW_FAIL = "group.draw.fail";
	public static final String ACTIVITY_NOT_EXIST = "activity.not.exist";
	public static final String PRODUCT_NOT_EXIST = "product.not.exist";
	public static final String INFORMATION_NOT_EXIST = "information.not.exist";
	public static final String EVENT_IS_OVER = "event.is.over";
	public static final String EVENT_NOT_STARTED = "event_not_started";
	public static final String HAVE_UNPAID_ORDERS = "have.unpaid.orders";
	public static final String PARTICIPATED_IN_EVENT = "participated.in.event";
	public static final String PARTICIPANTS_IS_MAX = "participated.is.max";
	public static final String GROUP_UPPER_LIMIT = "group.upper.limit";
    
	/**
	 * 营销- 支付有礼
	 */
	public static final String PAY_AWARD_ACTIVITY_MESSAGE_MULTIPLE_UNCONDITIONAL = "pay.award.activity.message.multiple.unconditional";
    public static final String PAY_AWARD_ACTIVITY_MESSAGE_MULTIPLE_CONDITIONAL = "pay.award.activity.message.multiple.conditional";
    public static final String PAY_AWARD_ACTIVITY_MESSAGE_MULTIPLE_FINALLY_UNCONDITIONAL = "pay.award.activity.message.multiple.finally.unconditional";
    public static final String PAY_AWARD_ACTIVITY_MESSAGE_MULTIPLE_FINALLY_CONDITIONAL = "pay.award.activity.message.multiple.finally.conditional";
    public static final String PAY_AWARD_ACTIVITY_MESSAGE_ONCE_UNCONDITIONAL = "pay.award.activity.message.once.unconditional";
    public static final String PAY_AWARD_ACTIVITY_MESSAGE_ONCE_CONDITIONAL = "pay.award.activity.message.once.conditional";
    public static final String PAY_AWARD_ACTIVITY_MESSAGE_DESIGNATED_GOODS = "pay.award.activity.message.designated.goods";
    public static final String PAY_AWARD_ACTIVITY_MESSAGE_CONDITIONAL = "pay.award.activity.message.conditional";
    public static final String PAY_AWARD_ACTIVITY_MESSAGE_AMOUNT_GOODS = "pay.award.activity.message.amount.goods";
    public static final String PAY_AWARD_ACTIVITY_MESSAGE_AMOUNT_BALANCE = "pay.award.activity.message.amount.balance";
    public static final String PAY_AWARD_ACTIVITY_MESSAGE_AMOUNT_SCORE = "pay.award.activity.message.amount.score";
    public static final String PAY_AWARD_ACTIVITY_MESSAGE_AMOUNT_CUSTOM = "pay.award.activity.message.amount.custom";

    /**
     * 文章_分类
     */
    public static final String ARTICLE_CATEGORY_IS_EXIST = "api.code.article_category_is_exist";
    public static final String ARTICLE_CATEGORY_CATEGORYNAME_ISNULL = "api.code.article_category_categoryName_isNull";
    public static final String ARTICLE_CATEGORY_CATEGORYID_ISNULL = "api.code.article_category_categoryId_isNull";
    public static final String ARTICLE_TITLE_ISNULL = "api.code.article_title_isNull";
    public static final String ARTICLE_ARTICLEID_ISNULL = "api.code.article_articleId_isNull";
    public static final String ARTICLE_CATEGORY_UPDATE_FAILED = "api.code_article_category_update_failed";

	/**
	 * 小程序管理
	 */
	public static final String PAGE_CLASSIFICAIION_EXIST = "applets.page.classification.exist";
	public static final String PAGE_CLASSIFICAIION_INSERT_FAILED = "applets.page.classification.insert.failed";
	public static final String PAGE_CLASSIFICAIION_NOT_EXIST = "applets.page.classification.not.exist";
	public static final String PAGE_CLASSIFICATION_UPDATE_FAILED = "applets.page.classification.update.failed";
	public static final String PAGE_CLASSIFICATION_DELETE_FAILED = "applets.page.classification.delete.failed";
    public static final String CODE_APPLET_QR_CODE_GET_FAILED = "applets.qr.code.get.failed";

	public static final String DECORATE_BOTTOM_ISNOTJSON = "applets.bottom.is_not_json";
	public static final String DECORATE_STYLE_ISNOTJSON = "applets.style.is_not_json";
	public static final String DECORATE_STYLE_PARAM_UPDATE_ID_NULL = "applets.style.param_update_id_null";
	public static final String DECORATE_STYLE_PARAM_UPDATE_VALUE_NULL = "applets.style.param_update_value_null";
	public static final String DECORATE_URL_ILLEGAL = "applets.url.illegal";

	public static final String BINDING_MINI_NO_SAME = "binding.mini.no.same";
	public static final String BINDING_MINI_HAVEBIND = "binding.mini.havebind";

	public static final String WX_MA_APP_ID_NOT_AUTH = "wx.ma.app_id.not.auth";
	public static final String WX_MA_TEMPLATE_ID_NOT_NULL = "wx.ma.app_template_id.not.null";
	public static final String WX_MA_PACKAGE_VERSION_NOT_NULL = "wx.ma.package_version.not.null";
	public static final String WX_MA_NEED_AUTHORIZATION = "wx.ma.neew.authorization";
	public static final String WX_ERROR_EXCEPTION = "wx.error.exception";
	public static final String WX_MA_NEED_UPLOADCODE = "wx.ma.need.uploadcode";
	public static final String WX_MA_NEED_AUDITING_CODE_SUCCESS = "wx.ma.need.auditing.success";
	public static final String WX_MA_SHOP_HAS_NO_APP="wx.ma.shop.has.no.app";
	public static final String WX_MA_FEATURE_NOT_OPEN="wx.ma.feature.not.open";
	public static final String WX_MA_ISSUBMERCHANT_ISNULL = "wx.ma.isSubMerchant.is.null";
	public static final String WX_MA_TABLE_ISNULL = "wx.ma.table.is.null";
	public static final String WX_MP_NO_ACCESS = "wx.mp.no.access";
	public static final String WX_MA_HAVE_MP = "wx.ma.have.mp";
	public static final String WX_MP_NEED_CHOOSE_RIGHT = "wx.mp.need.choose.right";
	public static final String WX_NO_REQUIRED = "wx.no.request";
	public static final String WX_ONLY_ONE = "wx.only.one";
	public static final String WX_JOB_PROBLEM = "wx.job.problem";

    public static final String WX_9300529 = "wx.ma.account.already.bind";
    public static final String WX_9300530 = "wx.ma.biz_id.not.exist";
    public static final String WX_9300531 = "wx.ma.account.or.password.error";
    public static final String WX_9300532 = "wx.ma.under.review";
    public static final String SEARCHCFG_HOTWORDS_LIMIT = "searchcfg.hotwords.limit";
    public static final String SEARCHCFG_TITLECUSTOM_NOTNULL = "searchcfg.titleCustom.not.null";
	public static final String WX_GETQRCODE_FAIL = "wx.getqrcode.fail";
	public static final String WX_READQRCODE_FAIL = "wx.readqrcode.fail";
	public static final String WX_GETHEAD_FAIL = "wx.gethead.fail";
	public static final String WX_GETBG_FAIL =  "wx.getbg.fail";
	public static final String WX_SHARESHOP = "wx.share.shop";
	public static final String WX_SCAN_QRSHOP = "wx.scan.qrshop";

	/**
	 * 门店管理
	 */
	public static final String STORE_GROUP_NAME_EXIST = "store.group.name.exist";
	public static final String STORE_POS_SHOP_ID_EXIST = "store.pos.shop.id.exist";
    public static final String CODE_DATA_NOT_EXIST = "data.not.exist";
    public static final String CODE_STORE_NOT_EXIST = "store.not.exist";
    public static final String CODE_STORE_SERVICE_NOT_EXIST = "store.service.not.exist";
    public static final String CODE_JACKSON_DESERIALIZATION_FAILED = "jackson.deserialization.failed";
    public static final String CODE_JACKSON_SERIALIZATION_FAILED = "jackson.serialization.failed";
    public static final String CODE_STORE_ALREADY_DEL = "store.already.delete";
    public static final String CODE_USER_CARD_BALANCE_INSUFFICIENT = "user.card.balance.insufficient";
    public static final String CODE_SCORE_INSUFFICIENT = "score.insufficient";
    public static final String CODE_BALANCE_INSUFFICIENT = "balance.insufficient";
    public static final String CODE_AMOUNT_PAYABLE_CALCULATION_FAILED = "amount.payable.calculation.failed";
    public static final String CODE_DB_DATA_ABNORMAL = "db.data.abnormal";
    public static final String CODE_RESERVATION_UPPER_LIMIT = "reservation.upper.limit";
    public static final String CODE_DATA_ALREADY_EXIST = "data.already.exist";
    public static final String CODE_ORDER_AMOUNT_NOT_EQUALS_SERVICE_SUBSIST = "code.order.amount.not.equals.service.subsist";
    public static final String CODE_WX_LOGISTICS_API_CALL_FAILED = "wx.logistics.api.call.failed";

	/**
	 * 门店技师管理
	 */
	public static final String STORE_STORE_ID_NULL = "store.store.id.null";
	public static final String STORE_TECHNICIAN_NAME_NULL = "store.technician.name.null";
	public static final String STORE_TECHNICIAN_TELEPHONE_ILLEGAL = "store.tenchnician.telephone.illegal";
	public static final String STORE_TECHNICIAN_TELEPHONE_NULL = "store.tenchnician.telephone.null";

	/**
	 * 门店预约
	 */
	public static final String SERVICE_ORDER_VERIFY_CODE_ERROR = "store.service.order.verify.code.error";
	public static final String SERVICE_ORDER_VERIFY_BALANCE_IS_NULL = "store.service.order.verify.balance.is.null";
	public static final String SERVICE_ORDER_VERIFY_REASON_IS_NULL = "store.service.order.verify.reason.is.null";
	public static final String SERVICE_ORDER_VERIFY_INSUFFICIENT_BALANCE = "store.service.order.verify.insufficient.balance";
	public static final String SERVICE_ORDER_CANCEL_REASON_IS_NULL = "store.service.order.verify.cancel_reason.is.null";

    /**
     * 门店核销员列表导出列
     */
    public static final String STORE_VERIFIER_LIST_FILENAME = "store.verifier.list.file_name";
    public static final String STORE_VERIFIER_LIST_USER_ID = "store.verifier.list.user_id";
    public static final String STORE_VERIFIER_LIST_USERNAME = "store.verifier.list.username";
    public static final String STORE_VERIFIER_LIST_MOBILE = "store.verifier.list.mobile";
    public static final String STORE_VERIFIER_LIST_VERIFIER_ORDERS = "store.verifier.list.verify_orders";

	/**
	 * 基础配置
	 */
	public static final String CONFIG_PLEDGE_EXCEED = "config.pledge.numbers.exceed";
	public static final String CONFIG_PLEDGE_NAME_NULL = "config.pledge.name.null";
	public static final String CONFIG_PLEDGE_NAME_LENGTH = "config.pledge.name.length";
	public static final String CONFIG_PLEDGE_CONTENT_NULL = "config.pledge.content.null";
	public static final String CONFIG_PLEDGE_CONTENT_LENGTH = "config.pledge.content.length";
	public static final String CONFIG_PLEDGE_LOGO_NULL = "config.pledge.logo.null";

	public static final String AUTH_SHOP_NOT_EXIST = "config.auth.shop.appId.not.exist";
	public static final String ORDER_PROCESS_CONFIG_UDPATE_FAILED = "config.order.process.config.update.failed";
	public static final String WECAHT_PAY_CONFIG_UPDATE_DAILED = "config.wechat.pay.config.update.failed";
	public static final String RETURN_CONFIG_UPDATE_FAILED = "config.return.config.update.failed";
	public static final String PAYMENT_CONFIG_IS_NULL = "config.payment.config.is.null";
	public static final String ORDER_PROCESS_CONFIG_IS_NULL = "config.order.process.config.is.null";
    public static final String RETURN_CONFIG_SELECT_FAILED = "config.return.config.select.failed";
	public static final String WXPAY_CONFIG_IS_NULL = "wxpay.config.is.null";
	public static final String CONFIG_A_NUM_GREATER = "config.a.num.greater";
	public static final String CONFIG_B_NUM_GREATER = "config.b.num.greater";
	public static final String CODE_CONFIG_UPDATE_FAILED = "config update failed";

	/**
	 * 会员管理
	 */
	public static final String MSG_MEMBER_TAG_LENGTH_LIMIT = "member.tag.length.limit";
	public static final String MSG_MEMBER_TAG_NOT_NULL = "member.tag.notnull";
	public static final String MSG_MEMBER_TAG_NAME_EXIST = "member.tag.name.exists";
	public static final String MSG_MEMBER_TAG_ADD_SUCCESS = "member.tag.add.success";
	public static final String MSG_MEMBER_TAG_ID_NOT_NULL = "member.tag.id.notnull";

	public static final String MSG_MEMBER_NOT_EXIST = "member.not.exist";
	public static final String MSG_SCORE_NOT_SAME = "member.score.not.same";
	public static final String MSG_MEMBER_SCORE_ERROR = "member.score.error";
	public static final String MSG_MEMBER_SCORE_NOT_ENOUGH = "member.score.not.enough";
	public static final String MSG_MEMBER_SCORE_NOT_NULL = "member.score.not.null";
	public static final String MSG_MEMBER_SCORE_NOT_BE_NEGATIVE = "member.score.not.be.negative";

	/**
	 * 会员余额
	 */
	public static final String MSG_MEMBER_ACCOUNT_UPDATE_FAIL = "member.account.update.fail";
	public static final String MSG_MEMBER_CARD_ACCOUNT_UPDATE_FAIL = "member.card.account.update.fail";
	public static final String MSG_MEMBER_CARD_SURPLUS_UPDATE_FAIL = "member.card.surplus.update.fail";
	public static final String MSG_MEMBER_CARD_EXCHANGSURPLUS_UPDATE_FAIL = "member.card.exchangsurplus.update.fail";

	/**
	 * 会员卡
	 */

	public static final String MSG_MEMBER_CARD_RIGHTS_EMPTY = "member.card.rights.empty";
	public static final String MSG_MEMBER_CARD_ID_EMPTY = "member.card.id.empty";
	public static final String MSG_CARD_ACTIVATE_SUCCESS = "card.activate.success";
	public static final String MSG_MEMBER_CARD_DELETE = "member.card.delete";
	public static final String MSG_CARD_ACTIVATE_FAIL = "card.activate.fail";

	public static final String MSG_LIMIT_CARD_AVAIL_SEND_NONE="card.avail.send.none";
	public static final String MSG_LIMIT_CARD_AVAIL_SEND_ALL="card.avail.send.all";
	public static final String MSG_CARD_SEND_REPEAT="card.send.repeat";
	public static final String MSG_CARD_GRADE_NONE="card.grade.none";

	// 用户卡
	public static final String USER_CARD_NONE = "user.card.none";
	public static final String MSG_CARD_RECEIVE_FAIL = "card.receive.fail";
	public static final String MSG_CARD_RECEIVE_INVALID = "member.card.receive.invalid";
	public static final String MSG_CARD_RECEIVE_NOCODE  = "member.card.receive.nocode";
	public static final String MSG_CARD_RECEIVE_GENERATE  = "member.card.receive.generate";
	public static final String MSG_CARD_RECEIVE_ALREADYHAS  = "member.card.receive.alreadyHas";
	public static final String MSG_CARD_RECEIVE_PWD  = "member.card.receive.pwd";
	public static final String MSG_CARD_RECEIVE_GOTOLOOK  = "member.card.receive.gotolook";
	public static final String MSG_CARD_RECEIVE_VALIDPWD  = "member.card.receive.validpwd";
	public static final String MSG_CARD_RECEIVE_VALIDCODE  = "member.card.receive.validcode";
	public static final String CODE_CARD_NO = "code.card.no";

	//会员导入
	public static final String CODE_EXPLAIN_MUST = "code.expalin.must";
	public static final String CODE_NEED_ONE = "code.need.one";
	public static final String GET_TEMPLATE_NAME = "get.template.name";
	public static final String CODE_EXCEL_ERRO = "code.excel.name";
	public static final String EXPORT_TEMPLATE_NAME = "export.template.name";
	public static final String EXPORT_TEMPLATE_ACTIVE_NAME = "export.template.active.name";
	public static final String CODE_EXCEL_EXAMPLE_USERNAME = "example.username";
	public static final String CODE_EXCEL_EXAMPLE_SEX = "example.sex";
	public static final String CODE_EXCEL_EXAMPLE_PROVINCE = "examplepProvince";
	public static final String CODE_EXCEL_EXAMPLE_CITY = "example.city";
	public static final String CODE_EXCEL_EXAMPLE_DISTRICT = "example.district";
	public static final String CODE_EXCEL_EXAMPLE_MARRIAGE = "example.marriage";
	public static final String CODE_EXCEL_EXAMPLE_ADDRESS = "example.address";
	public static final String CODE_EXCEL_VOUCHER = "example.voucher";
	public static final String CODE_EXCEL_RANDOM = "example.random";
	public static final String CODE_EXCEL_OTHER = "example.other";
	public static final String CODE_EXCEL_NEED_MOBILE = "excel.need.mobile";
	public static final String CODE_EXCEL_SORRY = "excel.sorry";
	public static final String CODE_EXCEL_OK = "excel.ok";
	public static final String BATCHID_NOT_NULL = "batchId.not.null";

	/**
	 * 概览
	 */
	public static final String OVERVIEW_MALL_DATADEMONSTRATION_GET_FAILED = "overview.mall.datademonstration.get.failed";
	public static final String OVERVIEW_MALL_BING_UNBING_FAILED = "overview.mall.bind.unbind.failed";
	public static final String OVERVIEW_MALL_TODOITEM_GET_FAILED = "overview.mall.todoitem.get.failed";
	public static final String OVERVIEW_USER_ANALYSIS_RFM_NULL = "overview.user.analysis.rfm.null";
	public static final String OVERVIEW_YESTERDAY_ANALYSIS_DATA_NULL = "overview.yesterday.analysis.data.null";
    // 资产明细导出
    public static final String ASSETS_EXPORT_FILE_NAME = "assets.export.file_name";
    public static final String ASSETS_EXPORT_COLUMN_TRADE_TIME = "overview.asset.management.trade_time";
    public static final String ASSETS_EXPORT_COLUMN_TRADE_NUM = "overview.asset.management.trade_num";
    public static final String ASSETS_EXPORT_COLUMN_TRADE_TYPE = "overview.asset.management.trade_type";
    public static final String ASSETS_EXPORT_COLUMN_TRADE_FLOW = "overview.asset.management.trade_flow";
    public static final String ASSETS_EXPORT_COLUMN_TRADE_STATUS = "overview.asset.management.trade_status";
    public static final String ASSETS_EXPORT_COLUMN_TRADE_SN = "overview.asset.management.trade_sn";
    public static final String ASSETS_EXPORT_COLUMN_USERNAME = "overview.asset.management.username";
    public static final String ASSETS_EXPORT_COLUMN_REAL_NAME = "overview.asset.management.real_name";
    public static final String ASSETS_EXPORT_COLUMN_MOBILE = "overview.asset.management.mobile";

    /**
	 * 订单
	 */
    public static final String MSG_ORDER = "order";
    public static final String MSG_ORDER_ORDER_SN_NOT_NULL = "order.sn.not.null";
    public static final String MSG_ORDER_ORDER_ID_NOT_NULL = "order.id.not.null";
    public static final String MSG_ORDER_OPERATE_NO_INSTANCEOF = "order.operate.no.instanceof";
    public static final String MSG_ORDER_NOT_EXIST = "order.not.exist";
    public static final String MSG_ORDER_RETID_NOT_NULL = "order.retid.not.null";
    public static final String MSG_ORDER_RETURN_ORDER_SN_NOT_NULL = "order.return.order.sn.not.null";
    public static final String MSG_ORDER_REMARK_NOT_NULL = "order.remark.not.null";
    public static final String MSG_ORDER_REMARK_TYPE_NOT_NULL = "order.remark.type.not.null";
    public static final String MSG_ORDER_RETURN_WX_FAILL = "order.return.wx.fail";
    public static final String MSG_ORDER_RETURN_METHOD_REFLECT_ERROR = "order.return.method.reflect.error";
    public static final String MSG_ORDER_RETURN_AFTER_RETURNAMOUNT_GREAT_THAN_ZERO = "order.return.after.returnamount.great.than.zero";
    public static final String MSG_ORDER_RETURNING_RETURN_METHOD_ERROR = "order.returning.return.method.error";
    public static final String MSG_ORDER_RETURN_MANUAL_INCONSISTENT_AMOUNT = "order.return.manual.inconsistent.amount";
    public static final String MSG_ORDER_FINISH_RETURN_STATUS_ERROR = "order.finish.return.status.error";
    public static final String MSG_ORDER_RETURN_ROLLBACK_NO_MPEXCEPTION = "order.return.rollback.no.mpexception";
    public static final String MSG_ORDER_RETURN_MONEY_EXCEEDED = "order.return.money.exceeded";
    public static final String MSG_ORDER_RETURN_STATUS_NOT_SATISFIED = "order.return.status.not.satisfied";
    public static final String MSG_ORDER_RETURN_WXPAYREFUND_NO_RECORD = "order.return.wxpayrefund.no.record";
    public static final String MSG_ORDER_RETURN_WXPAYREFUND_ERROR = "order.return.wxpayrefund.error";
    public static final String MSG_ORDER_RETURN_NOT_SUPPORT_RETURN_TYPE = "order.return.not.support.return.type";
    public static final String MSG_ORDER_RETURN_NO_SELECT_GOODS = "order.return.no.select.goods";
    public static final String MSG_ORDER_RETURN_NOT_NULL_RETURNTYPE = "order.return.not.null.returntype";
    public static final String MSG_ORDER_RETURN_NOT_NULL_RETURNMONEY = "order.return.not.null.returnmoney";
    public static final String MSG_ORDER_RETURN_NOT_NULL_SHIPPINGFEE = "order.return.not.null.shippingfee";
    public static final String MSG_ORDER_RETURN_GOODS_RETURN_COMPLETED = "order.return.goods.return.completed";
    public static final String MSG_ORDER_RETURN_GOODS_RETURN_NUMBER_ERROR = "order.return.goods.return.number.error";
    public static final String MSG_ORDER_RETURN_GOODS_NO_CAN_RETURN = "order.return.goods.no.can.return";
    public static final String MSG_ORDER_RETURN_MANUAL_MONEY_ERROR = "order.return.manual.money.error";
    public static final String MSG_ORDER_RETURN_OPERATION_NOT_SUPPORTED_BECAUSE_STATUS_ERROR = "order.return.operation.not.supported.because.status.error";
    public static final String MSG_ORDER_RETURN_RETURN_SHIPPING_FEE_EXCESS = "order.return.return.shipping.fee.excess";
    public static final String MSG_ORDER_RETURN_RETURN_SHIPPING_FEE_NOT_ZERO = "order.return.return.shipping.fee.not.zero";
    public static final String MSG_ORDER_CANCEL_NOT_CANCEL = "order.cancel.not.cancel";
    public static final String MSG_ORDER_CANCEL_FAIL = "order.cancel.fail";
    public static final String MSG_ORDER_CLOSE_NOT_CLOSE = "order.close.not.close";
    public static final String MSG_ORDER_CLOSE_FAIL = "order.close.fail";
    public static final String MSG_ORDER_RETURN_RETURN_ORDER_NOT_EXIST = "order.return.return.order.not.exist";
    public static final String MSG_ORDER_VERIFY_OPERATION_NOT_SUPPORTED = "order.verify.operation.not.supported";
    public static final String MSG_ORDER_VERIFY_CODE_ERROR = "order.verify.code.error";
    public static final String MSG_ORDER_FINISH_OPERATION_NOT_SUPPORTED = "order.finish.operation.not.supported";
    public static final String MSG_ORDER_RECEIVE_OPERATION_NOT_SUPPORTED = "order.receive.operation.not.supported";
    public static final String MSG_ORDER_REMIND_OPERATION_NOT_SUPPORTED = "order.remind.operation.not.supported";
    public static final String MSG_ORDER_REMIND_OPERATION_LIMIT = "order.remind.operation.limit";
    public static final String MSG_ORDER_REMIND_OPERATION_LIMIT_TODAY = "order.remind.operation.limit.today";
    public static final String MSG_ORDER_VERIFY_IFCHECK_NOT_NULL = "order.verify.ifcheck.not.null";
    public static final String MSG_ORDER_EXTEND_RECEIVE_TIME_NOT_NULL = "order.extend.receive.time.not.null";
    public static final String MSG_ORDER_EXTEND_RECEIVE_ONLY_ONE = "order.extend.receive.only.one";
    public static final String MSG_ORDER_EXTEND_RECEIVE_NO_SHIPPED = "order.extend.receive.no.shipped";
    public static final String MSG_ORDER_EXTEND_RECEIVE_NOT_SUPPORTED = "order.extend.receive.not.supported";
    public static final String MSG_ORDER_EXTEND_RECEIVE_TIME_NOT_LT_AUTOTIME = "order.extend.receive.time.not.lt.autotime";
    public static final String MSG_ORDER_EXTEND_RECEIVE_NOW_AUTOTIME_INTERVAL_GT_TWO_DAYS = "order.extend.receive.now.autotime.interval.gt.two.days";
    public static final String MSG_ORDER_EXTEND_RECEIVE_ADMIN_SET_MORE_TIME = "order.extend.receive.admin.set.more.time";
    public static final String MSG_ORDER_DELETE_OPERATION_NOT_SUPPORTED = "order.delete.operation.not.supported";
    /**下单参数*/
    public static final String MSG_ORDER_GOODS_NOT_EXIST = "order.goods.not.exist";
    public static final String MSG_ORDER_GOODS_NO_SALE = "order.goods.no.sale";
    public static final String MSG_ORDER_GOODS_OUT_OF_STOCK = "order.goods.out.of.stock";
    public static final String MSG_ORDER_GOODS_NO_ZERO = "order.goods.no.zero";
    public static final String MSG_ORDER_CALCULATE_SHIPPING_FEE_ERROR = "order.calculate.shipping.fee.error";
    public static final String MSG_ORDER_PAY_WAY_NO_NULL = "order.pay.way.no.null";
    public static final String MSG_ORDER_ADDRESS_NO_NULL = "order.address.no.null";
    public static final String MSG_ORDER_AMOUNT_NO_NULL = "order.amount.no.null";
    public static final String MSG_ORDER_CARD_INVALID = "order.card.invalid";
    public static final String MSG_ORDER_COUPON_INVALID = "order.coupon.invalid";
    public static final String MSG_ORDER_DELIVER_TYPE_NO_NULL = "order.deliver.type.no.null";
    public static final String MSG_ORDER_SCORE_NOT_ENOUGH = "order.score.not.enough";
    public static final String MSG_ORDER_ACCOUNT_NOT_ENOUGH = "order.account.not.enough";
    public static final String MSG_ORDER_CARD_NOT_ENOUGH = "order.card.not.enough";
    public static final String MSG_ORDER_AMOUNT_CHANGE = "order.amount.change";
    public static final String MSG_ORDER_SCORE_LIMIT = "order.score.limit";
    public static final String MSG_ORDER_MCARD_TP_LIMIT_LIMIT = "order.mcard.tp.limit.limit";
    public static final String MSG_ORDER_DELIVER_TYPE_NO_SUPPORT = "order.deliver.type.no.support";
    public static final String MSG_ORDER_PAY_WAY_NO_SUPPORT_WX = "order.pay.way.no.support.wx";
    public static final String MSG_ORDER_PAY_WAY_NO_SUPPORT_COD = "order.pay.way.no.support.cod" ;
    public static final String MSG_ORDER_PAY_WAY_NO_SUPPORT_ACCOUNT = "order.pay.way.no.support.account";
    public static final String MSG_ORDER_PAY_WAY_NO_SUPPORT_SCORE = "order.pay.way.no.support.score";
    public static final String MSG_ORDER_PAY_WAY_NO_SUPPORT_CARD = "order.pay.way.no.support.card";
    public static final String MSG_ORDER_GOODS_NO_EXIST = "order.goods.no.exist";
    public static final String MSG_ORDER_GOODS_LOW_STOCK = "order.goods.low.stock";
    public static final String MSG_ORDER_GOODS_GET_LOCK_FAIL = "order.goods.get.lock.fail";
    public static final String MSG_ORDER_UPDATE_STOCK_FAIL = "order.update.stock.fail";
    public static final String MSG_ORDER_WXPAY_UNIFIEDORDER_FAIL = "order.wxpay.unifiedorder.fail";
    public static final String MSG_ORDER_DATABASE_ERROR = "order.database.error";
    public static final String MSG_ORDER_GOODS_LIMIT_MIN = "order.goods.limit.min";
    public static final String MSG_ORDER_GOODS_LIMIT_MAX = "order.goods.limit.max";
    public static final String MSG_ORDER_GIFT_GOODS_ZERO = "order.gift.goods.zero";
    public static final String MSG_ORDER_TOPAY_STATUS_NOT_WAIT_PAY = "order.topay.status.not.wait.pay";
    public static final String MSG_ORDER_TOPAY_BK_PAY_NOT_START = "order.topay.bk.pay.not.start";
    public static final String MSG_ORDER_TOPAY_EXPIRED = "order.topay.expired";
    /**订单支付*/
    public static final String MSG_ORDER_NOT_TO_WAIT_DELIVER = "order.not.to.wait.deliver";
    /**
     * 下单活动校验
     */
    public static final String MSG_ORDER_ACTIVITY_DISABLE = "order.activity.disable";
    public static final String MSG_ORDER_ACTIVITY_NO_START = "order.activity.no.start";
    public static final String MSG_ORDER_ACTIVITY_END = "order.activity.end";
    public static final String MSG_ORDER_ACTIVITY_NUMBER_LIMIT = "order.activity.number.limit";
    public static final String MSG_ORDER_ACTIVITY_GOODS_OUT_OF_STOCK = "order.activity.goods.out.of.stock";
    /**商品不支持预售*/
    public static final String MSG_ORDER_GOODS_NOT_SUPORT_PRESALE = "order.goods.not.suport.presale";
    /**订单发货*/
    public static final String MSG_ORDER_SHIPPING_SHIPPINGNO_NOT_NULL = "order.shipping.shippingno.not.null";
    public static final String MSG_ORDER_SHIPPING_SHIPPINGID_NOT_NULL = "order.shipping.shippingid.not.null";
    public static final String MSG_ORDER_SHIPPING_SHIPGOODS_NOT_NULL = "order.shipping.shipgoods.not.null";


    public static final String INVALID_MONEY_AMOUNT = "order.refund.invalid_money_amount";
	public static final String INVALID_ACCOUNT_OR_SCORE = "order.refund.invalid_account_or_score";
	public static final String INVALID_REFUND_AMOUNT = "order.refund.invalid_refund_amount";
	public static final String REFUND_ACCOUNT_LARGER_THAN_ACCOUNT_PAID = "order.refund.account_larger_than_paid";
	public static final String REFUND_SCORE_LARGER_THAN_SCORE_PAID = "order.refund.score_larger_than_paid";
    public static final String REFUND_REQUEST_PARAMETER_ERROR = "order.virtual.order.refund.param.error";

    /**
     * 订单状态
     */
    public static final String ORDER_STATUS_UNKNOWN = "order.status.unknown";
    public static final String ORDER_STATUS_WAIT_PAY = "order.status.wait_pay";
    public static final String ORDER_STATUS_CANCELLED = "order.status.cancelled";
    public static final String ORDER_STATUS_CLOSED = "order.status.closed";
    public static final String ORDER_STATUS_WAIT_DELIVERY = "order.status.delivery";
    public static final String ORDER_STATUS_SHIPPED = "order.status.shipped";
    public static final String ORDER_STATUS_RECEIVED = "order.status.received";
    public static final String ORDER_STATUS_FINISHED = "order.status.finished";
    public static final String ORDER_STATUS_RETURNING = "order.status.returning";
    public static final String ORDER_STATUS_RETURN_FINISHED = "order.status.return_finished";
    public static final String ORDER_STATUS_REFUNDING = "order.status.refunding";
    public static final String ORDER_STATUS_REFUND_FINISHED = "order.status.refund_finished";
    public static final String ORDER_STATUS_PIN_PAYED_GROUPING = "order.status.pin_payed_grouping";
    public static final String ORDER_STATUS_PIN_SUCCESS = "order.status.pin_success";
    public static final String ORDER_STATUS_GIVE_GIFT_FINISHED = "order.status.give_gift_finished";

    /**
     * 订单列表导出列
     */
    public static final String ORDER_EXPORT_FILE_NAME = "order.export.file_name";
    public static final String ORDER_EXPORT_COLUMN_ORDER_SN = "order.export.column.order_sn";
    public static final String ORDER_EXPORT_COLUMN_ORDER_STATUS_NAME = "order.export.column.order_status_name";
    public static final String ORDER_EXPORT_COLUMN_PAY_NAMES = "order.export.column.pay_names";
    public static final String ORDER_EXPORT_COLUMN_CREATE_TIME = "order.export.column.create_time";
    public static final String ORDER_EXPORT_COLUMN_PAY_TIME = "order.export.column.pay_time";
    public static final String ORDER_EXPORT_COLUMN_CLOSE_TIME = "order.export.column.close_time";
    public static final String ORDER_EXPORT_COLUMN_CANCELLED_TIME = "order.export.column.cancelled_time";
    public static final String ORDER_EXPORT_COLUMN_FINISHED_TIME = "order.export.column.finished_time";
    public static final String ORDER_EXPORT_COLUMN_IS_COD = "order.export.column.is_cod";
    public static final String ORDER_EXPORT_COLUMN_CONSIGNEE = "order.export.column.consignee";
    public static final String ORDER_EXPORT_COLUMN_MOBILE = "order.export.column.mobile";
    public static final String ORDER_EXPORT_COLUMN_COMPLETE_ADDRESS = "order.export.column.complete_address";
    public static final String ORDER_EXPORT_COLUMN_PROVINCE_NAME = "order.export.column.province_name";
    public static final String ORDER_EXPORT_COLUMN_CITY_NAME = "order.export.column.city_name";
    public static final String ORDER_EXPORT_COLUMN_DISTRICT_NAME = "order.export.column.district_name";
    public static final String ORDER_EXPORT_COLUMN_ZIPCODE = "order.export.column.zipcode";
    public static final String ORDER_EXPORT_COLUMN_USER_NAME = "order.export.column.user_name";
    public static final String ORDER_EXPORT_COLUMN_USER_MOBILE = "order.export.column.user_mobile";
    public static final String ORDER_EXPORT_COLUMN_IS_NEW = "order.export.column.is_new";
    public static final String ORDER_EXPORT_COLUMN_USER_SOURCE = "order.export.column.user_source";
    public static final String ORDER_EXPORT_COLUMN_USER_TAG = "order.export.column.user_tag";
    public static final String ORDER_EXPORT_COLUMN_ADD_MESSAGE = "order.export.column.add_message";
    public static final String ORDER_EXPORT_COLUMN_SHIPPING_TIME = "order.export.column.shipping_time";
    public static final String ORDER_EXPORT_COLUMN_SHIPPING_NAME = "order.export.column.shipping_name";
    public static final String ORDER_EXPORT_COLUMN_SHIPPING_NO = "order.export.column.shipping_no";
    public static final String ORDER_EXPORT_COLUMN_DELIVER_TYPE_NAME = "order.export.column.deliver_type_name";
    public static final String ORDER_EXPORT_COLUMN_CONFIRM_TIME = "order.export.column.confirm_time";
    public static final String ORDER_EXPORT_COLUMN_STORE_ID = "order.export.column.store_id";
    public static final String ORDER_EXPORT_COLUMN_STORE_NAME = "order.export.column.store_name";
    public static final String ORDER_EXPORT_COLUMN_GOODS_NAME = "order.export.column.goods_name";
    public static final String ORDER_EXPORT_COLUMN_PRODUCT_SN = "order.export.column.product_sn";
    public static final String ORDER_EXPORT_COLUMN_GOODS_NUMBER = "order.export.column.goods_number";
    public static final String ORDER_EXPORT_COLUMN_DISCOUNTED_GOODS_PRICE = "order.export.column.discounted_goods_price";
    public static final String ORDER_EXPORT_COLUMN_GOODS_ATTR = "order.export.column.goods_attr";
    public static final String ORDER_EXPORT_COLUMN_GOODS_PRICE = "order.export.column.goods_price";
    public static final String ORDER_EXPORT_COLUMN_MARKET_PRICE = "order.export.column.market_price";
    public static final String ORDER_EXPORT_COLUMN_GOODS_SN = "order.export.column.goods_sn";
    public static final String ORDER_EXPORT_COLUMN_GOODS_ID = "order.export.column.goods_id";
    public static final String ORDER_EXPORT_COLUMN_SEND_NUMBER = "order.export.column.send_number";
    public static final String ORDER_EXPORT_COLUMN_RETURN_NUMBER = "order.export.column.return_number";
    public static final String ORDER_EXPORT_COLUMN_SOURCE = "order.export.column.source";
    public static final String ORDER_EXPORT_COLUMN_PRD_COST_PRICE = "order.export.column.prd_cost_price";
    public static final String ORDER_EXPORT_COLUMN_PRD_WEIGHT = "order.export.column.prd_weight";
    public static final String ORDER_EXPORT_COLUMN_ORDER_AMOUNT = "order.export.column.order_amount";
    public static final String ORDER_EXPORT_COLUMN_DISCOUNT = "order.export.column.discount";
    public static final String ORDER_EXPORT_COLUMN_SHIPPING_FEE = "order.export.column.shipping_fee";
    public static final String ORDER_EXPORT_COLUMN_SCORE_DISCOUNT = "order.export.column.score_discount";
    public static final String ORDER_EXPORT_COLUMN_USE_ACCOUNT = "order.export.column.use_account";
    public static final String ORDER_EXPORT_COLUMN_MONEY_PAID = "order.export.column.money_paid";
    public static final String ORDER_EXPORT_COLUMN_MEMBER_CARD_BALANCE = "order.export.column.member_card_balance";
    public static final String ORDER_EXPORT_COLUMN_MEMBER_CARD_REDUCE = "order.export.column.member_card_reduce";
    public static final String ORDER_EXPORT_COLUMN_PROMOTION_REDUCE = "order.export.column.promotion_reduce";
    public static final String ORDER_EXPORT_COLUMN_RETURN_TIME = "order.export.column.return_time";
    public static final String ORDER_EXPORT_COLUMN_RETURN_FINISH_TIME = "order.export.column.return_finish_time";
    public static final String ORDER_EXPORT_COLUMN_RETURN_ORDER_MONEY = "order.export.column.return_order_money";
    public static final String ORDER_EXPORT_COLUMN_RETURN_SHIPPING_FEE = "order.export.column.return_shipping_fee";
    public static final String ORDER_EXPORT_COLUMN_SELLER_REMARK = "order.export.column.seller_remark";
    public static final String ORDER_EXPORT_COLUMN_ORDER_REAL_NAME = "order.export.column.order_real_name";
    public static final String ORDER_EXPORT_COLUMN_ORDER_CID = "order.export.column.order_cid";
    public static final String ORDER_EXPORT_COLUMN_CUSTOM = "order.export.column.custom";
    /**
     * 订单列表导出内容
     */
    public static final String ORDER_EXPORT_NEW_USER = "order.export.new_user";
    public static final String ORDER_EXPORT_REGULAR_USER = "order.export.regular_user";
    public static final String ORDER_EXPORT_PAY_TYPE_WXPAY = "pay.wxpay";
    public static final String ORDER_EXPORT_PAY_TYPE_SCORE = "pay.score";
    public static final String ORDER_EXPORT_PAY_TYPE_BALANCE = "pay.balance";
    public static final String ORDER_EXPORT_PAY_TYPE_COD = "pay.cod";
    public static final String ORDER_EXPORT_PAY_TYPE_MEMBER_CARD = "pay.member_card";
    public static final String YES = "yes";
    public static final String NO = "no";
    public static final String ORDER_EXPORT_GOODS_SOURCE_PLATFORM = "order.export.goods.source.platform";
    public static final String ORDER_EXPORT_GOODS_SOURCE_SELF_OPERATED = "order.export.goods.source.self_operated";
    public static final String ORDER_EXPORT_USER_SOURCE_ADMIN = "order.export.user.source.admin";
    public static final String ORDER_EXPORT_USER_SOURCE_UNKNOWN = "order.export.user.source.unknown";
    public static final String ORDER_EXPORT_USER_SOURCE_CHANNEL = "order.export.user.source.channel";
    /**
     * 下单必填信息的title
     */
    public static final String ORDER_MUST_ORDER_REAL_NAME = "order.must.order_real_name";
    public static final String ORDER_MUST_ORDER_CID = "order.must.order_cid";
    public static final String ORDER_MUST_CONSIGNEE_REAL_NAME = "order.must.consignee_real_name";
    public static final String ORDER_MUST_CONSIGNEE_CID = "order.must.consignee_cid";


	/**
	 * 虚拟订单
	 */
	public static final String ORDER_VIRTUAL_COUPONPACK_REFUND_SCORE = "order.virtual.couponpack.refund.score";

    /**
     * 开屏有礼
     */
    public static final String ACTIVITY_TIME_RANGE_CONFLICT = "activity.coupon.time_range_conflict";

    /**
     * 定金膨胀
     */
    public static final String PRESALE_ORDER_EXCEL = "presale.order.order_excel";
    public static final String PRESALE_ORDER_SN = "presale.order.order_sn";
    public static final String PRESALE_GOODS_NAME = "presale.order.goods_name";
    public static final String PRESALE_GOODS_AMOUNT = "presale.order.goods_amount";
    public static final String PRESALE_ORDER_TIME = "presale.order.create_time";
    public static final String PRESALE_CONSIGNEE_INFO = "presale.order.consignee_info";
    public static final String PRESALE_MONEY_PAID = "presale.order.money_paid";
    public static final String PRESALE_ORDER_STATUS = "presale.order.order_status";
    public static final String INCLUDING_SHIPPING_FEE = "presale.order.including_shipping_fee";

    /**
     * 加价购-换购订单
     */
    public static final String REDEMPTION_ORDER_EXCEL =  "market.increase.purchase.redemption.excel";
    public static final String REDEMPTION_ORDER_SN =  "market.increase.purchase.redemption.order_sn";
    public static final String REDEMPTION_MAIN_GOODS = "market.increase.purchase.redemption.main_goods";
    public static final String REDEMPTION_REDEMPTION_GOODS = "market.increase.purchase.redemption.redemption_goods";
    public static final String REDEMPTION_CREATE_TIME = "market.increase.purchase.redemption.create_time";
    public static final String REDEMPTION_RECEIVER_INFO = "market.increase.purchase.redemption.receiver_info";
    public static final String REDEMPTION_ORDER_STATUS = "market.increase.purchase.redemption.order_status_name";
    /**
     * 加价购-换购明细
     */
    public static final String REDEMPTION_DETAIL_EXCEL =  "market.increase.purchase.redemption.detail.excel";
    public static final String REDEMPTION_DETAIL_USER_ID =  "market.increase.purchase.redemption.detail.user_id";
    public static final String REDEMPTION_DETAIL_USERNAME =  "market.increase.purchase.redemption.detail.username";
    public static final String REDEMPTION_DETAIL_MOBILE = "market.increase.purchase.redemption.detail.mobile";
    public static final String REDEMPTION_DETAIL_ORDER_SN = "market.increase.purchase.redemption.detail.order_sn";
    public static final String REDEMPTION_DETAIL_CREATE_TIME = "market.increase.purchase.redemption.create_time";
    public static final String REDEMPTION_DETAIL_MAIN_GOODS_TOTAL_MONEY = "market.increase.purchase.redemption.detail.main_goods_total_money";
    public static final String REDEMPTION_DETAIL_REDEMPTION_NUM = "market.increase.purchase.redemption.detail.redemption_num";
    public static final String REDEMPTION_DETAIL_REDEMPTION_TOTAL_MONEY = "market.increase.purchase.redemption.detail.redemption_total_money";


    /**
     * WxAppCode
     */
	public static final String ERR_CODE_INVALID_SIGN = "invalid.credential";
	public static final String ERR_CODE_TOKEN_ERROR = "invalid.grant_type";
	public static final String ERR_CODE_EXCEPTION = "invalid.openid";
	public static final String ERR_CODE_OPERATION_FAILED = "invalid.media.type";
	public static final String ERR_CODE_LOGIN_FAILED = "login.failed";
	public static final String ERR_CODE_PAY_FAILED = "pay.failed";
	public static final String ERR_CODE_CODE_SING = "code.code.sign";
	public static final String ERR_CODE_HAVE_SING = "code.have.sign";
	public static final String ERR_CODE_CODE_SING_ERRO = "coed.sign.erro";

	/**
	 *  小程序购物车
	 */
	public static final String CART_GOODS_NO_LONGER_VALID ="cart.goods.no.longer.valid";
	public static final String CART_THERE_IS_STILL_INVENTORY ="cart.there.is.still.inventory";
	public static final String CART_MINIMUM_PURCHASE ="cart.minimum.purchase";
	public static final String CART_MAXIMUM_PURCHASE ="cart.maximum.purchase";

    /**
     *  微信支付
     */
    public static final String MSG_WX_PAY_PREPAY_ID_IS_NULL ="wx_pay_prepay_id_is_null";

    /**
     * 商品、活动分享图片文字内容
     */
    /** ￥ */
    public static final String WX_MA_PICTORIAL_MONEY_FLAG = "wx.ma.pictorial.money.flag";
    /** 神秘人 */
    public static final String WX_MA_DEFAULT_USER_NAME = "wx.ma.default.user.name";
    /** 逗号分隔符 */
    public static final String WX_MA_DOT = "wx.ma.dot";
    /** 元 */
    public static final String WX_MA_PICTORIAL_MONEY = "wx.ma.pictorial.money";
    /** 拼团相关 */
    /** 开团省 */
    public static final String WX_MA_GROUP_BUY_START_GROUP = "wx.ma.group.buy.start.group";
    /** 2人品仅需*/
    public static final String WX_MA_GROUP_BUY_DOC_PERSON_NUM = "wx.ma.group.buy.doc.person.num";
    /** 推荐给你 */
    public static final String WX_MA_GROUP_BUY_DOC_RECOMMEND_TO_YOU="wx.ma.group.buy.doc.recommend.to.you";
    /** 砍价 */
    public static final String  WX_MA_BARGAIN_DOC="wx.ma.bargain.doc";
    /** 砍走*/
    public static final String WX_MA_BARGAIN_TAKE = "wx.ma.bargain.take";

}
