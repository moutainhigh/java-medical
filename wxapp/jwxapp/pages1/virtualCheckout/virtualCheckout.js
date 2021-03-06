const util = require("../../utils/util.js");
global.wxPage({

  /**
   * 页面的初始数据
   */
  data: {
    imageUrl: util.getImageUrl(""),
    showBalanceDialog:false,
    showScoreDialog:false,
    showCardBalanceDialog:false,
    showCardDialog:false,
    cardBalanceStatus:0,
    balanceStatus:0,
    scoreStatus:0,
    chooseCardNo:0,
    usePayInfo: {
      moneyPaid: 0, //订单可支付的金额
      useCardBalance: 0, //已使用的会员卡余额
      useBalance: 0, //已使用的余额
      useScore: 0 //已使用的积分
    },
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    this.setData({
      options
    })
    if(options.packId) this.requestPackageData()
    if(options.cardId) this.requestCardData()
  },
  requestPackageData(){
    this.setData({
      page_name:this.$t("page1.virtualCheckout.title")
    })
    let {packId} = this.data.options
    let cardNo = this.data.chooseCardNo
    util.api(`/api/wxapp/coupon/pack/order`,res=>{
      if(res.error === 0){
        this.setData({
          ...res.content,
        })
        this.getIsScore(res.content)
        this.setCouponData(res.content)
        this.defaultInput(res.content)
      }
    },{
      packId,
      cardNo
    })
  },
  requestCardData(){
    let {cardId} = this.data.options
    util.api(`/api/wxapp/card/buy/clearing`,res=>{
      if(res.error === 0){
        console.log(res)
        this.setData({
          ...res.content,
          cardBgStyle:this.getCardBg(res.content.cardInfo),
          cardTypeName:this.getTypeName(res.content.cardInfo.cardType),
          cardExpireTime:this.getCardExpireTime(res.content.cardInfo),
          cardPrice:this.getCardPrice(res.content)
        })
        this.getIsScore(res.content)
        this.defaultInput(res.content)
      }
    },{
      cardId
    })
  },
   // 获取会员卡背景
   getCardBg (cardItem) {
    switch (cardItem.bgType) {
      case 0:
        return `background-color:${cardItem.bgColor};`;
      case 1:
        return `background:url('${cardItem.bgImg}') no-repeat top left / 100% 100%;`;
    }
  },
  // 获取卡类型
  getTypeName (cardType) {
    switch (cardType) {
      case 0:
        return '普通卡';
      case 1:
        return '限次卡';
      case 2:
        return '等级卡';
    }
  },
  // 获取卡价格
  getCardPrice(info){
    return info.cardInfo.payType === 0 ? '￥' + info.orderAmount : info.orderPayScore + '积分'
  },
  // 获取会员卡过期时间
  getCardExpireTime (cardItem) {
    if (cardItem.expireType === 1) {
      // 从领取之日起
      let reDateType = ['日', '周', '月']
      let i = cardItem.dateType === null ? 0 : Number(cardItem.dateType)
      return `自领取之日起${cardItem.receiveDay}${reDateType[i]}内有效`

    }
    if (cardItem.cardType === 2) return null
    if (cardItem.expireType === 2) return `永久有效`
    return `${cardItem.startTime} 至 ${cardItem.endTime}`
  },
  getIsScore(actInfo){
    if(this.data.options.packId){
      if(actInfo.packInfo.accessMode === 1){
        this.setData({
          isScorePay:true,
          orderPayScore:actInfo.packInfo.accessCost
        })
        return
      }
    }
    if(this.data.options.cardId){
      if(this.data.cardInfo.payType === 1){
        this.setData({
          isScorePay:true,
          orderPayScore:actInfo.orderPayScore
        })
        return
      }
    }
    this.setData({
      isScorePay:false
    })
  },
  setCouponData({orderGoods}){
    this.resetPackDoc(orderGoods)
    this.setData({
      couponData:orderGoods
    })
  },
  resetPackDoc(packList){
    packList.forEach(item=>{
      let packDoc = '';
      if(item.immediatelyGrantAmount){
        packDoc = `领取后立即发放${item.immediatelyGrantAmount}张`
      }
      if(item.timingEvery && item.timingAmount){
        let timingUnit = item.timingUnit === 1 ? '周' : (item.timingUnit === 2 ? '月' : '天');
        packDoc = packDoc ? packDoc+'，' : '';
        packDoc += `领取后每${item.timingEvery}${timingUnit}发放${item.timingAmount}张`
      }
      item.packDoc = packDoc
    })
  },
  // 默认填充
  defaultInput(orderInfo) {
    let {
      balanceFirst,
      account,
      cardFirst,
      moneyPaid,
    } = orderInfo
    if ( cardFirst === 1 && this.data.memberCardInfo &&  this.data.memberCardInfo.money > 0 && !this.data.isScorePay) {
      let useCardBalance = moneyPaid - this.data.memberCardInfo.money > 0 ? this.data.memberCardInfo.money : moneyPaid
      moneyPaid -= useCardBalance
      this.setData({
        'usePayInfo.useCardBalance': useCardBalance,
        cardBalanceStatus: useCardBalance > 0 ? 1 : 0
      })
    } else {
      this.setData({
        'usePayInfo.useCardBalance': 0,
        cardBalanceStatus: 0
      })
    }
    console.log(balanceFirst,account)
    if ( balanceFirst === 1 && account > 0 && !this.data.isScorePay) {
      let useBalance = moneyPaid - account > 0 ? account : moneyPaid
      moneyPaid -= useBalance
      this.setData({
        'usePayInfo.useBalance': useBalance,
        balanceStatus: useBalance > 0 ? 1 : 0
      })
    } else {
      this.setData({
        'usePayInfo.useBalance': 0,
        balanceStatus: 0
      })
    }
    this.getPayMoney()
  },
  // 选择会员卡事件
  selectCardTap() {
    this.setData({
      showCardDialog: true
    })
  },
  // 会员卡余额支付事件
  cardBalanceTap() {
    if (this.data.cardBalanceStatus) {
      this.setData({
        cardBalanceStatus: 0,
        showCardBalanceDialog: false,
        'usePayInfo.useCardBalance': 0
      })
    } else {
      this.setData({
        showCardBalanceDialog: true
      })
    }
    this.getPayMoney()
  },
  // 余额支付事件
  balanceTap() {
    if (this.data.balanceStatus) {
      this.setData({
        balanceStatus: 0,
        showBalanceDialog: false,
        'usePayInfo.useBalance': 0
      })
    } else {
      this.setData({
        showBalanceDialog: true
      })
    }
    this.getPayMoney()
  },
  //获取应付总金额
  getPayMoney() {
    let moneyPaid = this.data.moneyPaid,
        useBalance = this.data.usePayInfo.useBalance,
        useCardBalance = this.data.usePayInfo.useCardBalance
    let floatNum = parseFloat(moneyPaid - useCardBalance - useBalance).toFixed(3)
    floatNum = parseFloat(floatNum.substring(0, floatNum.length - 1))
    this.setData({
      'usePayInfo.moneyPaid': floatNum
    })
  },
  // 获得输入的余额数
  getInputBalance(data) {
    this.setData({
      'usePayInfo.useBalance': data.detail,
      balanceStatus: 1
    })
    this.getPayMoney()
  },
  // 获取输入的会员卡余额数
  getInputCardBalance(data) {
    this.setData({
      'usePayInfo.useCardBalance': data.detail,
      cardBalanceStatus: 1
    })
    this.getPayMoney()
  },
  // 得到选择后的会员卡
  getSelectCard(data) {
    if (data.detail) {
      this.setData({
        chooseCardNo: data.detail
      })
    } else {
      this.setData({
        chooseCardNo:null
      })
    }
    if(this.data.options.packId) this.requestPackageData()
  },
  // 关闭弹窗
  closeDialog(target) {
    switch (target.detail) {
      case 'balance':
        this.setData({
          showBalanceDialog: false
        })
        break
      default:
        this.setData({
          showCardBalanceDialog: false
        })
        break
    }
  },
  // 提交订单
  confirmOrder(){
    let score = this.data.score
    if(score < this.data.orderPayScore){
      util.showModal('提示','您可用积分不足')
      return false
    }
    let params = {
      orderAmount:this.data.isScorePay ? null : this.data.orderAmount,
      scoreDiscount:this.data.isScorePay ? this.data.orderPayScore : 0,
      memberCardBalance:this.data.usePayInfo.useCardBalance,
      accountDiscount:this.data.usePayInfo.useBalance,
      cardNo: !this.data.isScorePay && this.data.usePayInfo.useCardBalance ? this.data.memberCardNo : null,
      invoiceId:0,
      invoiceDetail:null
    }
    if(this.data.options.packId){
      params.packId = this.data.options.packId
    }
    if(this.data.options.cardId){
      params.cardId = this.data.options.cardId
      params.moneyPaid = !this.data.isScorePay ? this.data.usePayInfo.moneyPaid : 0
    }
    if(this.data.isScorePay){
      this.setData({
        'usePayInfo.useScore':this.data.orderPayScore
      })
    }
    let apiStr = this.data.options.packId ? `/api/wxapp/coupon/pack/checkout` : `/api/wxapp/card/buy/pay`
    util.api(apiStr,res=>{
      if(this.data.options.packId) this.couponPackageAfter(res)
      if(this.data.options.cardId) this.cardAfter(res)
    },{
      ...params
    })
  },
  //整合参数
  getUrlParams(obj) {
    return Object.keys(obj).reduce((UrlStr, item, index) => {
      if (index !== 0) UrlStr += `&`
      return (UrlStr += `${item}=${obj[item]}`)
    }, '?')
  },
  // 优惠券礼包结算
  couponPackageAfter(res){
    if(res.error === 0 && res.content){
      wx.requestPayment({
        timeStamp: res.content.timeStamp,
        nonceStr: res.content.nonceStr,
        package: res.content.package,
        signType: 'MD5',
        paySign: res.content.paySign,
        success: res => {
          util.toast_success('支付成功',()=>{
            util.jumpLink(
              `pages1/payment/payment${this.getUrlParams({
                goodsType:2,
                useInfo: JSON.stringify({ ...this.data.usePayInfo })
              })}`,
              'redirectTo'
            )
          })
        },
        fail: res => {
          console.log(res)
        },
        complete: res => {}
      })
    } else if (res.error === 0 && !res.content){
      util.toast_success('支付成功',()=>{
        util.jumpLink(
          `pages1/payment/payment${this.getUrlParams({
            goodsType:2,
            useInfo: JSON.stringify({ ...this.data.usePayInfo })
          })}`,
          'redirectTo'
        )
      })
    } else {
      util.showModal('提示',res.message)
    }
  },
  cardAfter(res){
    if(res.error === 0 && res.content && res.content.package){
      let orderSn = res.content.orderSn
      wx.requestPayment({
        timeStamp: res.content.timeStamp,
        nonceStr: res.content.nonceStr,
        package: res.content.package,
        signType: 'MD5',
        paySign: res.content.paySign,
        success: res => {
          util.toast_success('支付成功',()=>{
            util.api('/api/wxapp/card/order/getcardno',info=>{
              util.jumpLink(
              `pages1/payment/payment${this.getUrlParams({
                goodsType:3,
                cardNo:info.content.cardNo || null,
                useInfo: JSON.stringify({ ...this.data.usePayInfo })
                })}`,
                'redirectTo'
              )
            },{orderSn})
            
          })
        },
        fail: res => {
          console.log(res)
        },
        complete: res => {}
      })
    } else if (res.error === 0 && res.content){
      util.toast_success('支付成功',()=>{
        util.jumpLink(
          `pages1/payment/payment${this.getUrlParams({
            goodsType:3,
            cardNo: res.content.cardSn,
            useInfo: JSON.stringify({ ...this.data.usePayInfo })
          })}`,
          'redirectTo'
        )
      })
    } else {
      util.showModal('提示',res.message)
    }
  },
  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function () {

  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow: function () {

  },
  goCouponSearch(e){
    let {couponId:actId} = e.currentTarget.dataset
    util.jumpLink(`/pages/search/search${util.getUrlParams({
      pageFrom:20,
      outerPageParam:JSON.stringify({
        actId
      })
    })}`)
  },
  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide: function () {

  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload: function () {

  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh: function () {

  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom: function () {

  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function () {

  }
})