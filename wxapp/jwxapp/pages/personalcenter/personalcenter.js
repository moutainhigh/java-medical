// pages/personalcenter/personalcenter.js
var util = require("../../utils/util.js");

global.wxPage({

  /**
   * 页面的初始数据
   */
  data: {
    tabIndex: 'usercenter',
    options: {},
    clerkImagePath:{}
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (option) {
    if (option && option.tabIndex) {
      let tabIndex = this.data.tabIndex
      if (Number(option.tabIndex) === 2 || option.tabIndex.indexOf('address') > -1) {
        tabIndex = 'address'
      }
      this.setData({
        tabIndex: tabIndex
      })
    }
    this.setData({
      options: option
    })
  },

  /**
   * 切换tab框
   */
  handleChangeNav (e) {
    let id = e.currentTarget.dataset.id
    this.setData({
      tabIndex: id
    })
  },

  /**
   * 微信导入回调
   */
  refreshList () {
    this.initData()
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