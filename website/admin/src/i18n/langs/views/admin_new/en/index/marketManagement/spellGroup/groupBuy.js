export const en = {
  // Check
  activityNameRequiredRules: 'Please enter the event name',
  goodsIdRequireRules: 'Please select the event product',
  validityDateRules: 'Please select time',
  LimitAmountRequireRules: 'Please fill in the number of people',
  joinLimitRequireRules: 'Please fill in the tour limit',
  openLimitRequireRules: 'Please fill in the opening limit',
  lengthMax20: '1 to 20 characters in length',
  // 新用户明细
  invitePeople: 'Inviters',
  newUserId: 'New user id',
  newUserNickname: 'New user nickname',
  newUserMobile: 'New user phone number',
  registrationTime: 'Registration time',
  // 活动效果数据
  number: 'number',
  legendData: [
    'total amount paid for activities ',
    'total discount amount ',
    'cost-effectiveness ratio ',
    'number of new transactions ',
    'number of experienced households'
  ],
  oldNumberUsers: 'oldNumberUsers ',
  oldNumberUsersComment: 'number of users who have paid in the store,',
  numberNewTransactions: 'number of new transactions ',
  numberNewTransactionsComment: 'activities in order for the first time the number of users',
  costBenefitRatio: 'cost-benefit ratio',
  costBenefitRatioComment: 'the benefit total amount/the benefit actual amount of the activity',
  totalDiscountAmount: 'total amount of event discount (yuan)',
  totalDiscountAmountComment: 'activities discount total amount',
  totalAmountPaid: 'totalAmountPaid for activity ',
  totalAmountPaidComment: 'total amount of actual payment for activity order (including account balance, membership card balance and WeChat payment, excluding refund part)',
  screeningDates: 'screeningDates ',
  selectTime: 'select start time ',

  // 订单详情
  paymentAmount: 'Pay amount',
  buyerName: 'Next single name',
  shippingAddress: 'receiving address',
  orderTime: 'Time to place an order',
  consigneeInfo: 'Receipt Information',
  consigneeMobile: 'Recipient phone number',
  consigneeName: 'Recipient Name',
  orderStatus: 'Order Status',
  orderStatusArr: {
    null: 'all orders',
    0: 'Pending payment',
    1: 'Order Cancel',
    2: 'Order closed',
    3: 'Pending delivery / pending write-off',
    4: 'shipped',
    5: 'Received / already raised',
    6: 'Order completed',
    7: 'Returns',
    8: 'Return completed',
    9: 'Refund in',
    10: 'Refund completed',
    11: 'Picture in the group',
    12: 'has become a group',
    13: 'Gift completion'
  },
  // 添加拼团活动
  groupBuyActivity: 'groupon Activity',
  groupBuyActivityComment: 'The switch is turned off by default. When the switch is turned on, the user can apply for a store distributor. The distributor invites the user to register to generate an order, and the purchaser invites a commission reward. When the switch is turned off, the mobile terminal personal center "distribution center" menu is hidden, the user places an order, the inviter no longer generates a commission reward, the system distribution mechanism is closed, and the invitation no longer records the invitation relationship.',
  selectGoods: 'Select goods',
  goodsName: 'Goods Name',
  commanderDiscounts: 'commander Discounts',
  commanderDiscountsComment1: 'After opening the group leader (opening group) discount, the head will enjoy more favorable prices, which will help increase the opening rate and group rate.',
  commanderDiscountsComment2: ' The head of the group can also enjoy the group leader\'s discount. To avoid unnecessary losses, please set it carefully.',
  discountsOption: 'Offer settings',
  goodsNmaeProduct: 'Product specifications',
  originalPrice: 'Original price',
  groupBuyPrice: 'Fighting price',
  commanderPrice: 'commander Price',
  originalStock: 'Original stock',
  groupBuyStock: 'groupon Stock',
  noData: 'No Data',
  moreSettings: 'More Settings：',
  activitySharing: 'Activity Sharing',

  batchOption: 'Batch setting',
  orderGoodsNum: 'Order quantity',
  orderGoodsNumComment1: 'The minimum number of purchases for a single order',
  orderGoodsNumComment2: 'The largest number of purchase orders for a single order',
  orderGoodsNumComment3: 'Please fill in a positive integer, do not fill in or 0 to indicate no limit',
  jian: 'Piece',
  joinLimit: 'jion Limit',
  joinLimitComment1: 'Maximum participation per person',
  joinLimitComment2: 'Secondary group ',
  joinLimitComment3: 'The default is 0, 0 means no limit. Limit only the number of groups that participate in other users',
  openLimit: 'Open group limit',
  openLimitComment1: 'Maximize per person',
  openLimitComment2: 'The default is 0, 0 means no limit. Limit only the number of open groups for the same user',
  openIsDefault: 'Open the default group',
  openIsDefaultComment: 'After opening the default group, the number of people who are not full within 24 hours, the system will simulate the "anonymous buyer" to fill the number, so that the group will be a group. You only need to ship the real buyer who has paid for the group. Proposed to open reasonably to increase the group rate',
  shippingOption: 'Shipping setting',
  beginNum: 'Initialize to the number of clusters',
  beginNumComment: 'The initial order number of active goods will be displayed at the applet end. Active commodity group quantity = active initial group quantity + actual group quantity, if not filled in, it means 0',
  freeShipping: 'free shipping',
  shippingOptionComment: 'Use original product shipping template',
  consolationPrize: 'Encouragement Award',
  consolationPrizeComment1: 'After the buyer fails to fight, the group will give a certain reward, which can enhance the buyer\'s repurchase.',
  consolationPrizeComment2: 'Add up to 5 coupons, expired and disabled coupons cannot be added',
  addCoupon: 'add Coupon',
  // 拼团活动
  activityName: 'activityName',
  activtiyLevel: 'priority',
  activtiyLevelComment: 'To distinguish the priority of different activities, please fill in a positive integer. The higher the value, the higher the priority',
  activityType: 'activityType',
  addActivity: 'addActivity',
  editActivity: 'editActivity',
  goodsNumber: 'groupGoods',
  validDate: 'validDate',
  startDate: 'start Date',
  endDate: 'end Date',
  activityStatus: 'activityStatus',
  limitAmount: 'limitAmount',
  grouponOrderNum: 'grouponOrderNum',
  grouponType: [
    {
      value: 1,
      label: 'generalGroupon'
    }, {
      value: 2,
      label: 'OldUserGroupon'
    }
  ],
  option: 'option',
  edit: 'edit',
  share: 'share',
  disable: 'disable',
  enabled: 'enabled',
  delete: 'delete',
  grouponDetailList: 'grouponDetailList',
  grouponOrderlist: 'grouponOrderlist',
  newUserList: 'newUserList',
  returnFailOrder: 'returnFailOrder',
  activityInfo: 'activityInfo',
  tabInfo: [{
    title: 'all',
    name: '0'
  }, {
    title: 'in Progress',
    name: '1'
  }, {
    title: 'NotStarted',
    name: '2'
  }, {
    title: 'overdue',
    name: '3'
  }, {
    title: 'Disable',
    name: '4'
  }],
  userMobileNumber: 'user mobile',
  mobileNumber: 'mobile number',
  userNickname: 'user nickname',
  nickname: 'nickname',
  grouponState: 'groupon status',
  commanderName: 'commander name',
  groupId: 'groupId',
  commanderMobile: 'commander mobile',
  username: 'user name',
  mobile: 'user  mobile',
  isDefault: 'default finish',
  orderSn: 'orderSn',
  startTime: 'startTime',
  endTime: 'endTime',
  searchDataText: 'search',
  stateOptions: [{
    value: null,
    label: 'All'
  },
  {
    value: 0,
    label: 'In the group'
  }, {
    value: 1,
    label: 'Has been grouped'
  }, {
    value: 2,
    label: 'Ungrouped'
  }],
  changeStatusComment: 'This operation will enable the activity, do you want to continue?',
  deleteComment: 'TThis operation will delete the activity, will it continue?',
  confirm: 'OK',
  cancel: 'Cancel',
  cancelMessage: 'Cancelled',
  moreConfigure: 'Expand more configurations',
  packUpConfigure: 'Fold up more configurations',
  to: 'to'
}
