const routes = [
  // 营销管理系列子路由
  {
    path: '/admin/home/main/first_market_manage',
    name: 'first_market_manage',
    meta: {
      crumbTitle: 'router.market_manage',
      meta: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/firstMarketManage'
      )
  },
  // 表单统计home页
  {
    path: '/admin/home/main/formStatisticsHome',
    name: 'form_decoration',
    meta: {
      crumbTitle: 'router.form_decoration',
      meta: 'first_market_manage',
      category: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/formStatistics/formStatisticsHome'
      )
  },
  // 表单统计 反馈统计页面
  {
    path: '/admin/home/main/feedbackStatistics',
    name: 'feedbackStatistics',
    meta: {
      crumbTitle: 'router.feedbackStatistics',
      meta: 'first_market_manage',
      category: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/formStatistics/feedbackStatistics'
      )
  },
  // 表单统计 反馈列表页面
  {
    path: '/admin/home/main/feedbackList',
    name: 'feedbackList',
    meta: {
      crumbTitle: 'router.feedbackList',
      meta: 'first_market_manage',
      category: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/formStatistics/feedbackList'
      )
  },
  // 表单统计 反馈详细页面
  {
    path: '/admin/home/main/feedbackDetails',
    name: 'feedbackDetails',
    meta: {
      crumbTitle: 'router.feedbackDetails',
      meta: 'first_market_manage',
      category: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/formStatistics/feedbackDetails'
      )
  },
  // 表单装修主页
  {
    path: '/admin/home/main/formDecorationHome',
    name: 'formDecorationHome',
    meta: {
      crumbTitle: 'router.formDecorationHome',
      meta: 'first_market_manage',
      category: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/formStatistics/formDecoration/formDecorationHome'
      )
  },
  // 分享有礼活动
  {
    path: '/admin/home/main/sharePoliteList',
    name: 'share_award',
    meta: {
      crumbTitle: 'router.share_award',
      meta: 'first_market_manage',
      category: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/sharePolite/sharePoliteList'
      )
  },
  // 分享有礼活动-添加
  {
    path: '/admin/home/main/sharePolite/add',
    name: 'share_polite_add',
    meta: {
      crumbTitle: 'router.share_polite_add',
      meta: 'first_market_manage',
      category: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/sharePolite/addSharePolite'
      )
  },
  // 分享有礼活动-领取明细
  {
    path: '/admin/home/main/sharePoliteDetail',
    name: 'share_polite_detail',
    meta: {
      crumbTitle: 'router.share_polite_detail',
      meta: 'first_market_manage',
      category: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/sharePolite/sharePoliteDetail'
      )
  },
  // 砍价
  {
    path: '/admin/home/main/bargain',
    name: 'kanjia',
    meta: {
      crumbTitle: 'router.kanjia',
      meta: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/bargain/bargainIndex'
      )
  },
  // 添加砍价活动
  {
    path: '/admin/home/main/bargain/add',
    name: 'bargain_activity',
    meta: {
      crumbTitle: 'router.bargain_activity',
      meta: 'first_market_manage',
      category: 'kanjia'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/bargain/addBargainAct'
      )
  },
  // 砍价订单列表
  {
    path: '/admin/home/main/bargain/orderList',
    name: 'bargain_order_list',
    meta: {
      crumbTitle: 'router.bargain_order_list',
      meta: 'first_market_manage',
      category: 'kanjia'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/bargain/bargainOrderList'
      )
  },
  // 砍价 - 获取新用户明细
  {
    path: '/admin/home/main/bargain/getNewUserList',
    name: ' bargain_get_newuser_detail',
    meta: {
      crumbTitle: 'router.bargain_get_newuser_detail',
      meta: 'first_market_manage',
      category: 'kanjia'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/bargain/newUserDetail'
      )
  },
  // 砍价 - 查看发起砍价用户
  {
    path: '/admin/home/main/bargain/bargainingUser',
    name: 'bargain_bargain_user',
    meta: {
      crumbTitle: 'router.bargain_bargain_user',
      meta: 'first_market_manage',
      category: 'kanjia'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/bargain/viewBargainUser'
      )
  },
  // 砍价 - 效果数据
  {
    path: '/admin/home/main/bargain/effectData',
    name: 'bargain_effect_data',
    meta: {
      crumbTitle: 'router.bargain_effect_data',
      meta: 'first_market_manage',
      category: 'kanjia'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/bargain/activityEffectData'
      )
  },
  // 砍价 - 帮忙砍价用户列表
  {
    path: '/admin/home/main/bargain/record/detail',
    name: 'bargain_record_detail',
    meta: {
      crumbTitle: 'router.bargain_record_detail',
      meta: 'first_market_manage',
      category: 'kanjia'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/bargain/recordDetail'
      )
  },
  // 多人拼团
  {
    path: '/admin/home/main/spellGroup',
    name: 'pin_group',
    meta: {
      crumbTitle: 'router.pin_group',
      meta: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/spellGroup/spellGroup'
      )
  },
  // 多人拼团详情列表
  {
    path: '/admin/home/main/spellGroup/detailList',
    name: 'pin_group_detailList',
    meta: {
      crumbTitle: 'router.pin_group_detailList',
      meta: 'first_market_manage',
      category: 'pin_group'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/spellGroup/groupBuyDetailList'
      )
  },
  // 多人拼团 拼团订单
  {
    path: '/admin/home/main/spellGroup/orderList',
    name: 'pin_group_orderList',
    meta: {
      crumbTitle: 'router.pin_group_orderList',
      meta: 'first_market_manage',
      category: 'pin_group'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/spellGroup/groupBuyOrderList'
      )
  },
  // 多人拼团  获取新用户明细
  {
    path: '/admin/home/main/spellGroup/newUserDetail',
    name: ' pin_group_newUserDetail',
    meta: {
      crumbTitle: 'router.pin_group_newUserDetail',
      meta: 'first_market_manage',
      category: 'pin_group'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/spellGroup/newUserDetail'
      )
  },
  // 多人拼团  拼团退款失败订单
  {
    path: '/admin/home/main/spellGroup/refundFailureOrder/:pintStatus/:activityId',
    name: ' pin_group_refundFailureOrder',
    meta: {
      crumbTitle: 'router.pin_group_refundFailureOrder',
      meta: 'first_market_manage',
      category: 'pin_group'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_trade_manageL/orders/orderList'
      )
  },
  // 多人拼团  活动效果数据
  {
    path: '/admin/home/main/spellGroup/activityEffectData',
    name: ' pin_group_activityEffectData',
    meta: {
      crumbTitle: 'router.pin_group_activityEffectData',
      meta: 'first_market_manage',
      category: 'pin_group'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/spellGroup/activityEffectData'
      )
  },
  // 分销
  {
    path: '/admin/home/main/distribution',
    name: 'distribution_info',
    meta: {
      crumbTitle: 'router.distribution_info',
      meta: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/distribution/distribution'
      )
  },
  // 分销-返利提现审核
  {
    path: '/admin/home/main/withdrawDepositCheck',
    name: 'distribution_info_withdrawDeposit',
    meta: {
      crumbTitle: 'router.distribution_info',
      meta: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/distribution/withdrawDepositCheck'
      )
  },
  // 分销-推广文案
  {
    path: '/admin/home/main/distribution/copyWriting',
    name: 'distribution_info_copyWriting',
    meta: {
      crumbTitle: 'router.distribution_copyWriting',
      meta: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/distribution/copyWriting'
      )
  },
  // 分销-分销员列表-分销员已邀请/下级的用户
  {
    path: '/admin/home/main/distribution/inviteUserList',
    name: 'distribution_info_inviteUser',
    meta: {
      crumbTitle: 'router.distribution_inviteUser',
      meta: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/distribution/inviteUserList'
      )
  },
  // 分销-分销员列表-间接邀请的用户
  {
    path: '/admin/home/main/distribution/indirectUserList',
    name: 'distribution_info_indirectUser',
    meta: {
      crumbTitle: 'router.distribution_indirectUser',
      meta: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/distribution/indirectUserList'
      )
  },
  // 分销-佣金统计
  {
    path: '/admin/home/main/distribution/moneyStatistics',
    name: 'distribution_info_moneyStatistics',
    meta: {
      crumbTitle: 'router.distribution_info',
      meta: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/distribution/moneyStatistics'
      )
  },
  // 分销-返利提现详情
  {
    path: '/admin/home/main/distribution/withdraw/detail',
    name: 'distribution_info_withdrawDetail',
    meta: {
      crumbTitle: 'router.distribution_info',
      meta: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/distribution/withdrawDetail'
      )
  },
  // 分销-商品返利详情
  {
    path: '/admin/home/main/distribution/goodsReturnStaticticsDetail',
    name: 'distribution_info_goodsStatictics',
    meta: {
      crumbTitle: 'router.distribution_info',
      meta: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/distribution/goodsReturnStaticticsDetail'
      )
  },
  // 组团瓜分积分
  {
    path: '/admin/home/main/groupIntegration',
    name: 'pin_integration',
    meta: {
      crumbTitle: 'router.pin_integration',
      meta: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/groupIntegration/groupIntegrationList'
      )
  },
  // 普通优惠券
  {
    path: '/admin/home/main/ordinaryCoupon',
    name: 'ordinary_coupon',
    meta: {
      crumbTitle: 'router.ordinary_coupon',
      meta: 'first_market_manage',
      category: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/ordinaryCoupon/ordinaryCoupon'
      )
  },
  // 优惠券礼包
  {
    path: '/admin/home/main/couponPackage',
    name: 'coupon_package',
    meta: {
      crumbTitle: 'router.coupon_Package',
      meta: 'first_market_manage',
      category: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/couponPackage/couponPackage'
      )
  },
  // 添加优惠券礼包
  {
    path: '/admin/home/main/couponPackage/add',
    name: 'coupon_Package_add',
    meta: {
      crumbTitle: 'router.coupon_Package_add',
      meta: 'first_market_manage',
      category: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/couponPackage/addCouponPackage'
      )
  },
  // 优惠券礼包-领取明细
  {
    path: '/admin/home/main/couponPackage/receiveDetails',
    name: 'coupon_Package_receive_details',
    meta: {
      crumbTitle: 'router.coupon_Package_receive_details',
      meta: 'first_market_manage',
      category: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/couponPackage/couponPackageReceiveDetails'
      )
  },
  // 优惠券礼包-订单明细
  {
    path: '/admin/home/main/couponPackage/orderDetails',
    name: 'coupon_Package_order_details',
    meta: {
      crumbTitle: 'router.coupon_Package_order_details',
      meta: 'first_market_manage',
      category: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/couponPackage/couponPackageOrderDetails'
      )
  },
  // 限时降价
  {
    path: '/admin/home/main/reduce',
    name: 'reduce_price',
    meta: {
      crumbTitle: 'router.reduce',
      meta: 'first_market_manage',
      category: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/reducePrice/reduce'
      )
  },
  // 添加限时降价
  {
    path: '/admin/home/main/reduce/add',
    name: 'reduce_price_add',
    meta: {
      crumbTitle: 'router.reduce',
      meta: 'first_market_manage',
      category: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/reducePrice/addReduce'
      )
  },
  // 限时降价-订单列表
  {
    path: '/admin/home/main/reduce/orderList',
    name: 'reduce_price_order',
    meta: {
      crumbTitle: 'router.reduce_order_list',
      meta: 'first_market_manage',
      category: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/reducePrice/reduceOrderList'
      )
  },
  // 限时降价-活动数据
  {
    path: '/admin/home/main/reduce/reduceEffect',
    name: 'reduce_price_effect',
    meta: {
      crumbTitle: 'router.reduceEffect',
      meta: 'first_market_manage',
      category: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/reducePrice/reduceEffect'
      )
  },
  // 好友助力
  {
    path: '/admin/home/main/friendHelp',
    name: 'promote',
    meta: {
      crumbTitle: 'router.promote',
      meta: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/friendHelp/friendHelp'
      )
  },
  // 添加好友助力活动
  {
    path: '/admin/home/main/addHelpAct/:id',
    name: 'promote_activity',
    meta: {
      crumbTitle: 'router.promote_activity',
      meta: 'first_market_manage',
      category: 'promote'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/friendHelp/addHelpAct'
      )
  },
  // 好友助力领取明细
  {
    path: '/admin/home/main/friendHelp/receiveDetails/:id',
    name: 'promote_receive_details',
    meta: {
      crumbTitle: 'router.promote_receive_details',
      meta: 'first_market_manage',
      category: 'promote'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/friendHelp/receiveDetails'
      )
  },
  // 好友助力发起明细
  {
    path: '/admin/home/main/friendHelp/launchDetails/:id',
    name: 'promote_launch_details',
    meta: {
      crumbTitle: 'router.promote_launch_details',
      meta: 'first_market_manage',
      category: 'promote'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/friendHelp/launchDetails'
      )
  },
  // 好友助力参与明细
  {
    path: '/admin/home/main/friendHelp/participateDetails/:id/:launchId',
    name: 'promote_participate_details',
    meta: {
      crumbTitle: 'router.promote_participate_details',
      meta: 'first_market_manage',
      category: 'promote'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/friendHelp/participateDetails'
      )
  },
  // 好友助力活动效果
  {
    path: '/admin/home/main/friendHelp/effectData/:id',
    name: 'promote_effect_data',
    meta: {
      crumbTitle: 'router.promote_effect_data',
      meta: 'first_market_manage',
      category: 'promote'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/friendHelp/effectData'
      )
  },
  // 添加优惠券活动
  {
    path: '/admin/home/main/addyCoupon',
    name: 'add_coupon',
    meta: {
      crumbTitle: 'router.ordinaryCoupon',
      meta: 'first_market_manage',
      category: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/ordinaryCoupon/addCoupon'
      )
  },
  // 普通优惠券领取明细
  {
    path: '/admin/home/main/ordinaryCoupon/receiveDetails',
    name: 'ordinary_coupon_receive_details',
    meta: {
      crumbTitle: 'router.ordinary_coupon_receive_details',
      meta: 'first_market_manage',
      category: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/ordinaryCoupon/couponReceiveDetails'
      )
  },
  // 分裂优惠券领取用户明细
  {
    path: '/admin/home/main/ordinaryCoupon/userDetail',
    name: 'ordinary_coupon_user_detail',
    meta: {
      crumbTitle: 'router.ordinary_coupon_user_detail',
      meta: 'first_market_manage',
      category: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/ordinaryCoupon/userDetail'
      )
  },
  // 拼团抽奖活动
  {
    path: '/admin/home/main/lotteryDraw',
    name: 'group_draw',
    meta: {
      crumbTitle: 'router.group_draw',
      meta: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/lotteryDraw/lotteryDraw'
      )
  },
  // 拼团抽奖 活动订单
  {
    path: '/admin/home/main/lotteryDraw/orderList',
    name: 'group_draw_order',
    meta: {
      crumbTitle: 'router.group_order',
      meta: 'first_market_manage',
      category: 'group_draw'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/lotteryDraw/lotteryOrderList'
      )
  },
  // 拼团抽奖 参与用户
  {
    path: '/admin/home/main/lotteryDraw/userList',
    name: 'group_draw_user',
    meta: {
      crumbTitle: 'router.group_user',
      meta: 'first_market_manage',
      category: 'group_draw'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/lotteryDraw/lotteryUserList'
      )
  },
  // 拼团抽奖 用户明细
  {
    path: '/admin/home/main/lotteryDraw/detailList',
    name: 'group_draw_detail',
    meta: {
      crumbTitle: 'router.group_user_detail',
      meta: 'first_market_manage',
      category: 'group_draw'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/lotteryDraw/lotteryDetailList'
      )
  },
  // 拼团抽奖 开团明细
  {
    path: '/admin/home/main/lotteryDraw/groupList',
    name: 'group_draw_group',
    meta: {
      crumbTitle: 'router.group_detail',
      meta: 'first_market_manage',
      category: 'group_draw'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/lotteryDraw/lotteryGroupList'
      )
  },
  // 拼团抽奖 活动效果数据
  {
    path: '/admin/home/main/lotteryDraw/lotteryEffect',
    name: 'group_draw_effect',
    meta: {
      crumbTitle: 'router.group_effect',
      meta: 'first_market_manage',
      category: 'group_draw'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/lotteryDraw/lotteryEffect'
      )
  },
  // 幸运大抽奖活动
  {
    path: '/admin/home/main/luckyDraw',
    name: 'lottery_activity',
    meta: {
      crumbTitle: 'router.lottery_activity',
      meta: 'first_market_manage',
      category: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/luckyDraw/luckyDraw'
      ),
    children: [{
      path: '/admin/home/main/luckyDraw/luckyDrawAdd',
      name: 'lucky_draw_add',
      meta: {
        crumbTitle: 'router.lottery_activity',
        meta: 'first_market_manage',
        category: 'lottery_activity'
      },
      component: () =>
        import(
          '@/view/admin/index/leftNavComponents/first_market_manage/luckyDraw/luckyDrawAdd'
        )
    }]
  },
  // 幸运大抽奖活动--详情页面
  {
    path: '/admin/home/main/luckyDraw/detailList',
    name: 'lottery_activity_detail',
    meta: {
      crumbTitle: 'router.lottery_activity_detail',
      meta: 'first_market_manage',
      category: 'lottery_activity'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/luckyDraw/luckyDrawDetailList'
      )
  },
  // 幸运大抽奖活动 -- 获取新用户明细
  {
    path: '/admin/home/main/luckyDraw/newUserList',
    name: 'lottery_activity_newUserList',
    meta: {
      crumbTitle: 'router.lottery_activity_newUserList',
      meta: 'first_market_manage',
      category: 'lottery_activity'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/luckyDraw/newUserList'
      )
  },
  // 好友代付
  {
    path: '/admin/home/main/friendPay',
    name: 'insteadpay',
    meta: {
      crumbTitle: 'router.insteadpay',
      meta: 'first_market_manage',
      category: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/friendPay/friendPay'
      )
  },
  // 赠品
  {
    path: '/admin/home/main/gift',
    name: 'gift',
    meta: {
      crumbTitle: 'router.gift',
      meta: 'first_market_manage',
      category: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/gift/gift'
      )
  },
  // 创建赠品活动
  {
    path: '/admin/home/main/gift/add',
    name: 'gift_add_view',
    meta: {
      crumbTitle: 'router.gift_add',
      meta: 'first_market_manage',
      category: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/gift/addGift'
      )
  },
  // 修改赠品活动
  {
    path: '/admin/home/main/gift/add/:id',
    name: 'gift_edit_view',
    meta: {
      crumbTitle: 'router.gift_edit',
      meta: 'first_market_manage',
      category: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/gift/addGift'
      )
  },
  // 赠送明细
  {
    path: '/admin/home/main/gift/giftDetail/:id',
    name: 'gift_detail_view',
    meta: {
      crumbTitle: 'router.gift_detail',
      meta: 'first_market_manage',
      category: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/gift/giftDetail.vue'
      )
  },
  // 瓜分积分活动
  {
    path: '/admin/home/main/integration/list',
    name: 'pin_integration',
    meta: {
      crumbTitle: 'router.pin_integration',
      meta: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/groupIntegration/groupIntegrationList'
      )
  },
  // 创建瓜分积分活动
  {
    path: '/admin/home/main/integration/add',
    name: 'group_integration_add',
    meta: {
      crumbTitle: 'router.pin_integration_add',
      meta: 'first_market_manage',
      category: 'pin_integration'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/groupIntegration/groupIntegrationAdd'
      )
  },

  // 瓜分积分活动--参与用户明细
  {
    path: '/admin/home/main/integration/detail/:id',
    name: 'group_integration_detail',
    meta: {
      crumbTitle: 'router.pin_integration_detail',
      meta: 'first_market_manage',
      category: 'pin_integration'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/groupIntegration/groupIntegrationDetail'
      )
  },
  // 瓜分积分活动--活动效果数据
  {
    path: '/admin/home/main/integration/analysis/:id',
    name: 'group_integration_analysis',
    meta: {
      crumbTitle: 'router.pin_integration_analysis',
      meta: 'first_market_manage',
      category: 'pin_integration'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/groupIntegration/groupIntegrationAnalysis'
      )
  },
  // 瓜分积分活动--成团明细
  {
    path: '/admin/home/main/integration/success/:id',
    name: 'group_integration_success',
    meta: {
      crumbTitle: 'router.pin_integration_success',
      meta: 'first_market_manage',
      category: 'pin_integration'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/groupIntegration/groupIntegrationSuccess'
      )
  },
  // 打包一口价活动
  {
    path: '/admin/home/main/packsale/list',
    name: 'package',
    meta: {
      crumbTitle: 'router.package',
      meta: 'first_market_manage',
      category: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/packagePrice/packagePriceList'
      )
  },
  // 打包一口价活动-参与明细
  {
    path: '/admin/home/main/packsale/detail/:id',
    name: 'package_price_detail',
    meta: {
      crumbTitle: 'router.package_price_detail',
      meta: 'first_market_manage',
      category: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/packagePrice/packagePriceDetail'
      )
  },
  // 打包一口价活动-查看活动订单
  {
    path: '/admin/home/main/packsale/order/:id',
    name: 'package_price_order',
    meta: {
      crumbTitle: 'router.package_price_order',
      meta: 'first_market_manage',
      category: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/packagePrice/packagePriceActivityOrder'
      )
  },
  // 开屏有礼
  {
    path: '/admin/home/main/openScreen/list',
    name: 'market_gifted',
    meta: {
      crumbTitle: 'router.open_screen',
      meta: 'first_market_manage',
      category: 'market_gifted'
    },
    component: () => import('@/view/admin/index/leftNavComponents/first_market_manage/openScreen/openScreenList')
  },
  // 开屏有礼添加
  {
    path: '/admin/home/main/openScreen/add',
    name: 'open_screen_add',
    meta: {
      crumbTitle: ['router.open_screen_add', 'router.open_screen_edit'],
      meta: 'first_market_manage',
      category: 'market_gifted'
    },
    component: () => import('@/view/admin/index/leftNavComponents/first_market_manage/openScreen/openScreenAdd')
  },
  // 开屏有礼活动明细
  {
    path: '/admin/home/main/openScreen/detail',
    name: 'open_screen_detail',
    meta: {
      crumbTitle: 'router.open_screen_detail',
      meta: 'first_market_manage',
      category: 'market_gifted'
    },
    component: () => import('@/view/admin/index/leftNavComponents/first_market_manage/openScreen/openScreenDetail')
  },
  // 评价有礼
  {
    path: '/admin/home/main/evaluationGift/list',
    name: 'comment_gift',
    meta: {
      crumbTitle: 'router.comment_gift',
      meta: 'first_market_manage',
      category: 'first_market_manage'
    },
    component: () => import('@/view/admin/index/leftNavComponents/first_market_manage/evaluationGift/evaluationGiftList')
  },
  // 首单特惠
  {
    path: '/admin/home/main/firstSpecial/list',
    name: 'first_special',
    meta: {
      crumbTitle: 'router.first_special',
      meta: 'first_market_manage',
      category: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/firstSpecial/firstSpecialList'
      )
  },
  // 首单特惠-活动订单明细
  {
    path: '/admin/home/main/firstSpecial/orderList',
    name: 'first_special_order',
    meta: {
      crumbTitle: 'router.first_special_order',
      meta: 'first_market_manage',
      category: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/firstSpecial/firstSpecialOrderList'
      )
  },
  // 首单特惠-新增/编辑
  {
    path: '/admin/home/main/firstSpecial/add',
    name: 'first_special_add',
    meta: {
      crumbTitle: 'router.first_special_add',
      meta: 'first_market_manage',
      category: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/firstSpecial/firstSpecialAdd'
      )
  },
  // 定金膨胀
  {
    path: '/admin/home/main/presale',
    name: 'presale',
    meta: {
      crumbTitle: 'router.presale',
      meta: 'first_market_manage',
      category: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/preSale/preSale'
      )
  },
  // 定金膨胀 - 创建活动
  {
    path: '/admin/home/main/presale/add',
    name: 'presale_add_view',
    meta: {
      crumbTitle: 'router.presale_add',
      meta: 'first_market_manage',
      category: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/preSale/preSaleAdd'
      )
  },
  // 定金膨胀 - 修改活动
  {
    path: '/admin/home/main/presale/edit/:id',
    name: 'presale_edit_view',
    meta: {
      crumbTitle: 'router.presale_edit',
      meta: 'first_market_manage',
      category: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/preSale/preSaleAdd'
      )
  },
  // 定金膨胀 - 订单明细
  {
    path: '/admin/home/main/presale/order_detail/:id',
    name: 'presale_order_detail_view',
    meta: {
      crumbTitle: 'router.presale_order_detail',
      meta: 'first_market_manage',
      category: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/preSale/preSaleOrderDetail'
      )
  },
  // 定金膨胀 - 活动明细
  {
    path: '/admin/home/main/presale/detail/:id',
    name: 'presale_detail_view',
    meta: {
      crumbTitle: 'router.presale_detail',
      meta: 'first_market_manage',
      category: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/preSale/preSaleDetail'
      )
  },
  // 秒杀
  {
    path: '/admin/home/main/seckill',
    name: 'sec_kill',
    meta: {
      crumbTitle: 'router.seckill',
      meta: 'first_market_manage',
      category: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/seckill/seckill'
      )
  },
  // 秒杀-添加
  {
    path: '/admin/home/main/seckill/add',
    name: 'sec_kill_add',
    meta: {
      crumbTitle: 'router.addSeckill',
      meta: 'first_market_manage',
      category: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/seckill/seckillAdd'
      )
  },
  // 秒杀 秒杀订单
  {
    path: '/admin/home/main/seckill/orderList',
    name: 'sec_kill_order',
    meta: {
      crumbTitle: 'router.orderSeckill',
      meta: 'first_market_manage',
      category: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/seckill/seckillOrderList'
      )
  },
  // 秒杀 用户明细
  {
    path: '/admin/home/main/seckill/detailList',
    name: 'sec_kill_detail',
    meta: {
      crumbTitle: 'router.detailSeckill',
      meta: 'first_market_manage',
      category: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/seckill/seckillDetailList'
      )
  },
  // 秒杀 秒杀用户
  {
    path: '/admin/home/main/seckill/userList',
    name: 'sec_kill_user',
    meta: {
      crumbTitle: 'router.userSeckill',
      meta: 'first_market_manage',
      category: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/seckill/seckillUserList'
      )
  },
  // 秒杀 活动效果数据
  {
    path: '/admin/home/main/seckill/seckillEffect',
    name: 'sec_kill_effect',
    meta: {
      crumbTitle: 'router.resultSeckill',
      meta: 'first_market_manage',
      category: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/seckill/seckillEffect'
      )
  },
  // 满包邮
  {
    path: '/admin/home/main/shipping',
    name: 'free_ship',
    meta: {
      crumbTitle: 'router.shipping',
      meta: 'first_market_manage',
      category: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/shipping/shipping'
      )
  },
  // 加价购活动
  {
    path: '/api/admin/market/addPriceBuy/list',
    name: 'purchase_price',
    meta: {
      crumbTitle: 'router.purchase_price',
      meta: 'first_market_manage',
      category: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/increasePurchase/purchaseList'
      )
  },
  // 添加加价购活动
  {
    path: '/api/admin/market/addPriceBuy/add',
    name: 'add_increase_purchase',
    meta: {
      crumbTitle: 'router.add_increase_purchase',
      meta: 'first_market_manage',
      category: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/increasePurchase/addPurchase'
      )
  },
  // 编辑加价购活动
  {
    path: '/api/admin/market/addPriceBuy/edit/:id',
    name: 'edit_increase_purchase',
    meta: {
      crumbTitle: 'router.edit_increase_purchase',
      meta: 'first_market_manage',
      category: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/increasePurchase/editPurchase'
      )
  },

  // 加价购活动 换购订单
  {
    path: '/api/admin/market/addPriceBuy/redemptionOrder',
    name: 'purchase_redemption_order',
    meta: {
      crumbTitle: 'router.purchase_redemption_order',
      meta: 'first_market_manage',
      category: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/increasePurchase/redemptionOrder'
      )
  },
  // 加价购活动 换购明细
  {
    path: '/api/admin/market/addPriceBuy/redemptionDetail',
    name: 'purchase_redemption_detail',
    meta: {
      crumbTitle: 'router.purchase_redemption_detail',
      meta: 'first_market_manage',
      category: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/increasePurchase/redemptionDetail'
      )
  },
  // 营销管理/留存复购/消息推送
  {
    path: '/admin/market/messagePush',
    redirect: '/admin/market/messagePush/all',
    // name: 'message_push',
    name: 'business_template_message',
    meta: {
      crumbTitle: 'router.message_push',
      meta: 'first_market_manage',
      category: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/messagePush/messagePush'
      ),
    children: [
      // 营销管理/留存复购/推送统计
      {
        path: '/admin/market/messagePush/pushStatistics',
        name: 'push_statistics',
        meta: {
          crumbTitle: 'router.message_push',
          meta: 'first_market_manage',
          category: 'first_market_manage'
        },
        component: () =>
          import(
            '@/view/admin/index/leftNavComponents/first_market_manage/messagePush/messagePushStatistics'
          )
      },
      {
        path: '/admin/market/messagePush/all',
        name: 'all_message_push',
        meta: {
          crumbTitle: 'router.message_push',
          meta: 'first_market_manage',
          category: 'first_market_manage'
        },
        component: () =>
          import(
            '@/view/admin/index/leftNavComponents/first_market_manage/messagePush/allMessagePush'
          )
      }
    ]
  },
  // 营销管理/留存复购/消息推送/查看消息模板
  {
    path: '/admin/market/messagePush/detail',
    name: 'template_detail',
    meta: {
      crumbTitle: 'router.template_detail',
      meta: 'first_market_manage',
      category: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/messagePush/viewMessageTemplate'
      )
  },
  // 营销管理/留存复购/消息推送/添加消息模板
  {
    path: '/admin/market/messagePush/addMessage',
    name: 'add_message',
    meta: {
      crumbTitle: 'router.add_message_push',
      meta: 'first_market_manage',
      category: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/messagePush/addMessagePush'
      )
  },
  // 营销管理/留存复购/消息推送/发送记录
  {
    path: '/admin/market/messagePush/sendRecord',
    name: 'send_record',
    meta: {
      crumbTitle: 'router.send_record',
      meta: 'first_market_manage',
      category: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/messagePush/sendRecord'
      )
  },
  // 定向发券
  {
    path: '/admin/home/main/couponGive',
    name: 'market_act_give',
    meta: {
      crumbTitle: 'router.couponGive',
      meta: 'first_market_manage',
      category: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/couponGive/couponGiveList'
      )
  },
  // 我要送礼
  {
    path: '/admin/home/main/giveGift/:tabSwitch',
    name: 'giveGift',
    meta: {
      crumbTitle: 'router.giveGift',
      meta: 'first_market_manage',
      category: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/giveGift/giveGift'
      )
  },
  // 我要送礼 送礼明细
  {
    path: '/admin/home/main/giveGift/detail/:activityName/:id',
    name: 'giveGift_details',
    meta: {
      crumbTitle: 'router.giveGift_details',
      meta: 'first_market_manage',
      category: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/giveGift/giveGiftDetailList'
      )
  },
  // 我要送礼 收礼列表
  {
    path: '/admin/home/main/giveGift/receive/:id',
    name: 'giveGift_receive',
    meta: {
      crumbTitle: 'router.giveGift_receive',
      meta: 'first_market_manage',
      category: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/giveGift/giveGiftReceiveList'
      )
  },
  // 定向发券/领取明细
  {
    path: '/admin/home/main/couponGive/receiveDetails/:id/:couponId',
    name: 'couponGive_receive_details',
    meta: {
      crumbTitle: 'router.couponGive_receive_details',
      meta: 'first_market_manage',
      category: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/couponGive/receiveDetails'
      )
  },
  // 定向发券/添加发券活动
  {
    path: '/admin/home/main/couponGive/grantCoupons',
    name: 'couponGive_grant_coupons',
    meta: {
      crumbTitle: 'router.couponGive_grant_coupons',
      meta: 'first_market_manage',
      category: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/couponGive/grantCoupons'
      )
  },
  // 收藏有礼
  {
    path: '/admin/home/main/collectGift',
    name: 'collectGift',
    meta: {
      crumbTitle: 'router.collectGift',
      meta: 'first_market_manage',
      category: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/collectGift/collectGift'
      )
  },
  // 微信好物圈
  {
    path: '/admin/home/main/wechateGoodsCicle',
    name: 'wechateGoodsCicle',
    meta: {
      crumbTitle: 'router.wechateGoodsCicle',
      meta: 'first_market_manage',
      category: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/wechateGoodsCicle/wechateGoodsCicle'
      )
  },
  // 积分兑换
  {
    path: '/admin/home/main/integralExchangeHome',
    name: 'integral_convert',
    meta: {
      crumbTitle: 'router.integral_convert',
      meta: 'first_market_manage',
      category: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/integralExchange/integralExchangeHome'
      )
  },
  // 积分兑换子页面--- 查看积分兑换订单
  {
    path: '/admin/home/main/pointsExchangeOrder',
    name: 'pointsExchangeOrder',
    meta: {
      crumbTitle: 'router.integral_convert',
      meta: 'first_market_manage',
      category: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/integralExchange/subPages/pointsExchangeOrder'
      )
  },
  // 积分兑换子页面--- 积分兑换用户列表
  {
    path: '/admin/home/main/pointsUserList',
    name: 'pointsUserList',
    meta: {
      crumbTitle: 'router.pointsUserList',
      meta: 'first_market_manage',
      category: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/integralExchange/subPages/pointsUserList'
      )
  },
  // 积分兑换子页面--- 获取新用户明细
  {
    path: '/admin/home/main/newUserDetails',
    name: 'newUserDetails',
    meta: {
      crumbTitle: 'router.integral_convert',
      meta: 'first_market_manage',
      category: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/integralExchange/subPages/newUserDetails'
      )
  },
  // 支付有礼
  {
    path: '/admin/home/main/payReward',
    name: 'payreward',
    meta: {
      crumbTitle: 'router.payreward',
      meta: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/payReward/payReward'
      )
  },
  // 支付有礼 - 添加支付有礼活动
  {
    path: '/admin/home/main/addPayRewardAct',
    name: 'addPayRewardAct',
    meta: {
      crumbTitle: 'router.addPayRewardAct',
      meta: 'first_market_manage',
      category: 'payreward'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/payReward/addPayRewardAct'
      )
  },
  // 支付有礼 - 活动明细页面
  {
    path: '/admin/home/main/PayRewardActDetails',
    name: 'activityDetails',
    meta: {
      crumbTitle: 'router.activityDetails',
      meta: 'first_market_manage',
      category: 'payreward'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/payReward/activityDetails'
      )
  },
  // 满折满减 - 列表明细页面
  {
    path: '/admin/home/main/fullDiscountFullCut',
    name: 'full_cut',
    meta: {
      crumbTitle: 'router.full_cut',
      meta: 'first_market_manage',
      category: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/fullDiscountFullCut/fullCut'
      )
  },
  // 满折满减 - 添加满折满减活动
  {
    path: '/admin/home/main/fullCutActivity',
    name: 'fullCutActivity',
    meta: {
      crumbTitle: 'router.fullCutActivity',
      meta: 'first_market_manage',
      category: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/fullDiscountFullCut/fullCutAdd'
      )
  },
  // 满折满减 查看满折满减订单
  {
    path: '/admin/home/main/fullCut/order',
    name: 'fullCutOrder',
    meta: {
      crumbTitle: 'router.fullCutOrder',
      meta: 'first_market_manage',
      category: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/fullDiscountFullCut/fullCutOrder'
      )
  },
  // 满折满减 查看满折满减统计
  {
    path: '/admin/home/main/fullCut/statistics',
    name: 'fullCutStatistics',
    meta: {
      crumbTitle: 'router.fullCutStatistics',
      meta: 'first_market_manage',
      category: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/fullDiscountFullCut/fullCutStatistics'
      )
  },
  // 直播
  {
    path: '/admin/home/main/live',
    name: 'live_broadcast',
    meta: {
      crumbTitle: 'router.live_broadcast',
      meta: 'first_market_manage',
      category: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/live/live'
      )
  },
  // 渠道页面分析
  {
    path: '/admin/home/main/channel',
    name: 'channel',
    meta: {
      crumbTitle: 'router.channel',
      meta: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/channelPage/channelPage'
      )
  },
  // 渠道页面分析 - 商品数据统计
  {
    path: '/admin/home/main/channel/statistical',
    name: 'channelStatistical',
    meta: {
      crumbTitle: 'router.channel',
      meta: 'first_market_manage'
    },
    component: () =>
      import(
        '@/view/admin/index/leftNavComponents/first_market_manage/channelPage/channelDataQuery'
      )
  }
]
export default routes
