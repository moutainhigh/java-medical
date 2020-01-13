export const cn = {
  // 添加编辑活动页面
  thanksParticipation: '谢谢参与',
  firstPrize: '一等奖',
  secondPrize: '二等奖',
  thirdPrize: '三等奖',
  fourthPrize: '四等奖',
  lotteryIsSet: '抽奖设置',
  lotteryIsSetTips1: '不同等级分别设置不同的奖项、每个奖项的份数和中奖概率，四个等级中奖概率之和小于等于100%。',
  lotteryIsSetTips2: '例如：一等奖1份，中奖概率为2%；二等奖2份，中奖概率为3%；三等奖3份，中奖概率为4%；四等奖4份，中奖概率为5%。则用户A抽奖时，中奖概率为（2%+3%+4%+5%）=14%。',
  prizeRate: '中奖概率',
  selectPrize: '选择奖品',
  prizeType: [
    [1, '积分'],
    [2, '用户余额'],
    [3, '优惠券'],
    [4, '赠品'],
    [5, '自定义']
  ],
  presentExp: '赠送积分',
  presentExpTips: '请填写积分数',
  giveTheBalance: '赠送余额',
  giveTheBalanceTips: '赠送余额',
  coupons: '优惠券',
  couponsTips: '优惠券可用库存{0}份数',
  refreshs: '刷新',
  make: '新建',
  givinggifts: '赠送赠品',
  giftValidity: '赠品有效期',
  giftValidityTips1: '天',
  giftValidityTips2: '中奖用户需在有效期内领取，过期后将无法领取',
  selectGoods: '选择商品',
  goodsName: '商品名称',
  goodsPrice: '价格',
  goodsNum: '库存',
  goodsOptions: '操作',
  goodsRemove: '删除',
  custom: '自定义',
  customTips: '请填写自定义文字',
  prizeNumber: '奖品份数',
  prizeNumberTips1: '请填写奖品数',
  prizeNumberTips2: '份',
  prizeNumberTips3: '奖品份数限制中奖人数，中奖人数达到奖品份数，则后续抽奖用户不再中奖',
  prizeNumberTips4: '份数为空则不设此奖项，即该奖项中奖概率为0',
  save: '保存',
  modification: '修改',
  empty: '清空',
  uploadChartForNoWinning: '上传未中奖图标',
  uploadChartForWinning: '上传中奖图标',
  uploadChartForNoWinningTips: '仅支持jpg/png/尺寸80*80 不超过1M',
  iconDescribe: 'icon描述',
  iconDescribeTips: '最多可填写4个字',
  rulesSetting: '规则设置',
  freePrizeDraw: '免费抽奖',
  freePizeTimes: '用户可免费抽奖几次',
  nullUnrestricted: '为空表示不限制',
  shareTheLuckyDraw: '分享抽奖',
  allow: '允许',
  notAllow: '不允许',
  shareTheLuckyDrawTips: '用户无免费抽奖机会时可通过分享给好友获得抽奖机会',
  shareTheLuckyDrawTips1: '分享最多获得',
  shareTheLuckyDrawTips2: '次抽奖机会',
  payLuckyDraw: '付费抽奖',
  payLuckyDrawTips1: '用户无法通过分享获取抽奖机会时可通过消耗积分获得抽奖机会',
  payLuckyDrawTips2: '每次抽奖消耗积分',
  payLuckyDrawTips3: '用户每次参与需要消耗积分数',
  payLuckyDrawTips4: '付费最多获取',
  payLuckyDrawTips5: '次抽奖机会',
  noWinningBonusPoints: '未中奖赠送积分',
  nullIsNoPoints: '为空表示不赠送积分',
  noWinningBonusPointsTips: '仅送给未中奖用户',
  publicityInfo: '50积分',
  get: '获得',
  immediatelyDraw: '立即抽奖',
  activityRules: '活动规则',
  activityValidity: '活动有效期',
  to: '至',
  activityDescription: '活动说明',
  activityInformation: '活动信息',
  effectiveTime: '生效时间',
  supportUpTo10Words: '最多支持10个字',
  selectDateTime: '选择日期时间',
  expirationTime: '过期时间',
  pleaseEnterContent: '请输入内容',
  luckyWhee: '幸运大转盘',
  // 活动列表页
  addActivity: '添加抽奖活动',
  activityName: '活动名称',
  dateValidity: '有效期',
  activityStatus: '活动状态',
  joinNumber: '参与人次',
  awardNumber: '中奖人次',
  option: '操作',
  edit: '设置',
  share: '分享',
  disable: '停用',
  enabled: '启用',
  delete: '删除',
  detailList: '抽奖明细',
  newUserList: '获取新用户明细',
  tabInfo: [{
    title: '全部抽奖活动',
    name: '0'
  }, {
    title: '进行中',
    name: '1'
  }, {
    title: '未开始',
    name: '2'
  }, {
    title: '已过期',
    name: '3'
  }, {
    title: '已停用',
    name: '4'
  }],
  changeStatusComment: '此操作将启用该活动, 是否继续?',
  deleteLuckDrawComment: '此操作将删除该活动, 是否继续?',
  confirm: '确定',
  cancel: '取消',
  cancelMessage: '已取消',
  // 抽奖明细列表
  mobile: '手机号',
  userName: '用户名',
  lotterySource: '抽奖来源',
  chanceSource: '抽奖次数来源',
  lotteryGrade: '中奖等级',
  createTime: '创建时间',
  lotteryPrize: '奖品',
  luckSourceList: [
    [null, '全部'],
    [0, '分享'],
    [1, '开屏有礼'],
    [2, '支付有礼']
  ],
  chanceSourceList: [
    [null, '全部'],
    [0, '免费'],
    [1, '分享'],
    [2, '积分']
  ],
  lotteryGradeList: [
    [null, '全部'],
    [0, '未中奖'],
    [1, '一等奖'],
    [2, '二等奖'],
    [3, '三等奖'],
    [4, '四等奖']
  ],
  query: '查询',
  // 新用户明细
  invitePeople: '邀请人',
  newUserId: '新用户id',
  newUserNickname: '新用户昵称',
  newUserMobile: '新用户手机号',
  registrationTime: '注册时间',
  userNickname: '用户昵称',
  validName: '请填写活动名称！',
  validStartTime: '请填写生效时间！',
  validEndTime: '请填写过期时间！',
  validDesc: '请填写活动说明！',
  validTime: '结束时间必须大于开始时间',
  validScore: '请填写赠送积分',
  validBounsAmount: '请填写赠送金额',
  validCoupon: '请选择优惠券',
  validGivea: '请选择赠品'
}
