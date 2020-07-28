// pages2/awaitprescribe/awaitprescribe.js
var util = require('../../utils/util.js');
var app = getApp()
global.wxPage({

  /**
   * 页面的初始数据
   */
  data: {
    imageUrl: app.globalData.imageUrl,
    if_show_more: 0,
    page_info: []
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    if (!util.check_setting(options)) return;
    this.requestInfo();
  },
  requestInfo () {
    util.api('/api/wxapp/order/medical/get', res => {
      if(res.error == 0) {
        this.data.page_info = res.content[0];
        this.setData({
          page_info: this.data.page_info
        })
      } else {
        util.showModal('提示', res.message);
        return false
      }
    },{})
  },
  show_more () {
    this.data.if_show_more = this.data.if_show_more == 0 ? 1 : 0;
    this.setData({
      if_show_more: this.data.if_show_more
    })
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