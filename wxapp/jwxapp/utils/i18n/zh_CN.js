var navigation = require("./components/navigation.js")
var order = require("./pages/order.js")
var checkout = require("./pages/checkout.js")
var comment = require('./page1/commentCn.js')
var store = require('./pages/store.js')
var bargain = require('./pages/bargain.js') // 砍价
var afterSale = require('./page1/afterSale.js') // 售后中心
var fight = require('./page1/fight.js') // 拼团
var reserve = require('./page1/reserve.js') // 预约
var usercenter = require('./page1/usercenter.js') // 个人中心
var pinlottery = require('./page1/pinlottery.js') // 拼团抽奖
var coupon = require('./pages/coupon.js') // 优惠券
var cart = require('./pages/cart.js') // 购物车
var promote = require('./page1/promote.js') // 好友助力
var pinintegration = require('./page1/pinintegration.js') // 瓜分积分
var decorate = require('./components/decorate/decorate.js')
var item = require('./pages/item.js')
var search = require('./page1/search.js') //搜索页
var virtualCheckout = require('./page1/virtualCheckout.js') //虚拟商品结算
var actPage = require('./page1/actPage.js') //活动商品页
var history = require('./page1/history.js') //购买历史，我的足迹
var goodsComment = require('./page1/goodsComment.js') //商品评价详情
var aftersaleorder = require('./page1/aftersaleorder') // 售后中心
var usercardgoods = require('./page1/usercardgoods') // 兑换商品
var zh_CN = {
  "common": {
    "info": {
      "loading": "加载中",
      "loadingFailed": "加载失败",
      "title": "信息提示",
      "ok": "确定",
      "cancel": "取消",
      "openSetting": "打开设置页面",
      "albumOpenAuthority": "需要获取您的相册权限，请到小程序的设置页面打开授权",
      "clearingCacheForSave": "正在清理缓存，请重新保存",
      "uploading": "上传中",
      "uploadFailed": "上传失败",
      "updateTip": "更新提示",
      "newVersionReadyWhetherRestartApp": "新版本已经准备好，是否重启应用？",
      "tip": "提示"
    },
    "video": {
      "sizeGt10M": "视频大于10M",
      "durationGt3Minites": "视频超过3分钟"
    }
  },
  "components": {
    "navigation": navigation,
    'decorate': decorate
  },
  "pages": {
    "bottom": {
      "shopDisabled": "该店铺已禁用",
      "shopExpired": "该店铺已过期",
      "shopClosed": "该店铺已停业",
      "disableLogin": "您已被禁止登录",
      "contactMerchant": "联系商家",
    },
    "store": Object.assign({}, {
      "searchGoods": "搜索商品",
      "noClassification": "暂无分类",
      "leftMenuA": "全部品牌",
      "leftMenuB": "推荐品牌",
      "leftMenuC": "推荐分类"
    }, store),
    "order": order,
    "checkout": checkout,
    "item": item,
    "coupon": coupon,
    "bargain": bargain,
    "cart": cart
  },
  "page1": {
    "comment": comment,
    "afterSale": afterSale,
    "fight": fight,
    "reserve": reserve,
    "usercenter": usercenter,
    'pinlottery': pinlottery,
    'promote': promote,
    'pinintegration': pinintegration,
    'search': search,
    'virtualCheckout': virtualCheckout,
    'actPage': actPage,
    "history": history,
    "goodsComment": goodsComment,
    "aftersaleorder": aftersaleorder,
    "usercardgoods": usercardgoods
  },
  "page2": {

  }
}
module.exports = zh_CN;