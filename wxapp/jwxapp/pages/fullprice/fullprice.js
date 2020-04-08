// pages/fullprice/fullprice.js
var util = require('../../utils/util.js')
var app = getApp()

global.wxPage({
  /**
   * 页面的初始数据
   */
  data: {
    imageUrl: app.globalData.imageUrl,
    strategy_id: '', // 活动id
    searchText: "", // 搜索内容
    full_info: [], // 全部信息
    full_goods_info: [], // 商品列表
    full_change_info: [], // 已选商品列表
    al_goods_prices: '', // 金额
    all_goods_doc: "", // 金额提示
    is_load: 0,
    page: 1,
    last_page: 1,
    checkMode: true, // 换购商品弹窗
    can_del: 0, // 是否显示删除按钮 默认0 不显示
    showSpec: false, // 规格弹窗
    specParams: {} // 规格信息
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    if (!util.check_setting(options)) return;
    var that = this;
    that.setData({
      strategy_id: Number(options.strategy_id),
    })
    full_request(that);
  },

  // 搜索
  searchGoods: function (e) {
    var that = this;
    that.setData({
      searchText: e.detail.value
    })
    full_request(that);
  },

  // 跳转商品详情
  to_items: function (e) {
    var goods_id = e.currentTarget.dataset.goods_id;
    util.navigateTo({
      url: '/pages/item/item?gid=' + goods_id,
    })
  },

  // 加入购物车
  add_to_cart: function (e) {
    var that = this;
    var prdId = e.currentTarget.dataset.prd_id
    var goodsId = e.currentTarget.dataset.goods_id
    // 不可参与购买且会员列表不为空
    if (that.data.full_info.state == 4 && that.data.full_info.cardList.length == 1 && that.data.full_info.cardList[0].cardType == 2) {
      util.showModal("提示", '您当前的会员等级不满足，仅拥有' + that.data.full_info.cardList[0].cardName + '等级卡用户可购买此商品。可在"个人中心"查看会员卡权益');
      return false
    }
    // 不可参与购买跳转会员卡列表
    if (that.data.full_info.state == 4) {
      wx.showModal({
        title: '提示',
        content: '会员专享活动，开通会员即可参与！',
        cancelText: "取消",
        cancelColor: "#333333",
        confirmText: "开通会员",
        confirmColor: that.data.comColor,
        success(res) {
          if (res.confirm) {
            // util.navigateTo({
            //   url: '/pages/buycardlist/buycardlist?strategy_id=' + that.data.strategy_id + "&is_fullprice=" + strategy_id,
            // })
          }
        }
      })
      return false;
    }
    // 添加购物车
    if (prdId) {
      // 单规格
      util.api('/api/wxapp/cart/add', function (res) {
        if (res.error == 0) {
          util.toast_success('已加入购物车');
        } else {
          util.showModal("提示", res.message);
          return false;
        }
      }, {
          goodsNumber: 1,
          prdId: prdId,
          activityType: 21,
          activityId: that.data.strategy_id
        })
    } else {
      // 选择规格
      that.setData({
        showSpec: true,
        triggerButton: 'left'
      })
      that.requestGoodsInfo(goodsId)
    }
  },
  // 规格详情
  requestGoodsInfo(goodsId) {
    util.api('/api/wxapp/goods/detail', res => {
      if (res.error == 0) {
        let {
          goodsId,
          goodsNumber,
          defaultPrd,
          activity,
          products,
          limitBuyNum,
          limitMaxNum,
          goodsImgs
        } = res.content
        let specParams = {
          goodsId,
          goodsNumber,
          defaultPrd,
          activity,
          products,
          limitBuyNum,
          limitMaxNum,
          goodsImgs
        }
        this.setData({
          specParams
        })
      }
    }, {
        goodsId: goodsId,
        activityId: this.data.strategy_id,
        activityType: 21,
        userId: util.getCache('user_id'),
        lon: null,
        lat: null
      })
  },
  // 获取规格信息
  getProduct({
    detail: { prdNumber, limitBuyNum = null, limitMaxNum = null }
  }) {
    this.setData({
      limitInfo: {
        prdNumber,
        limitBuyNum,
        limitMaxNum
      }
    })
  },
  // 规格回调
  getProductData(e) {
    this.setData({
      product: e.detail,
      limitInfo: {
        prdNumber: e.detail.prdNumber,
        limitBuyNum: e.detail.limitBuyNum,
        limitMaxNum: e.detail.limitMaxNum,
        activityType: 7
      }
    })
  },
  // 数量回调
  getGoodsNum(e) {
    this.setData({
      productInfo: { ...this.data.product, goodsNum: e.detail.goodsNum }
    });
    console.log(this.data.productInfo)
  },
  // 关闭规格弹窗
  bindCloseSpec() {
    this.setData({
      showSpec: false,
      triggerButton: ''
    })
  },
  // 规格添加购物车
  addCart() {
    let { goodsNum: goodsNumber, prdId } = this.data.productInfo
    util.api("/api/wxapp/cart/add", res => {
      if (res.error == 0) {
        util.toast_success('已加入购物车');
        full_request(this)
      } else {
        util.showModal("提示", res.message);
        return false;
      }
      this.bindCloseSpec()
    }, {
        goodsNumber: goodsNumber,
        prdId: prdId,
        activityType: 21,
        activityId: this.data.strategy_id
      });
  },

  // 去开通会员
  to_member: function () {
    if (this.data.full_info.state == 4 && this.data.full_info.cardList.length == 1 && this.data.full_info.cardList[0].cardType == 2) {
      util.showModal("提示", '您当前的会员等级不满足，仅拥有' + this.data.full_info.cardList[0].cardName + '等级卡用户可购买此商品。可在"个人中心"查看会员卡权益');
      return false
    }
    // util.navigateTo({
    //   url: '/pages/buycardlist/buycardlist?strategy_id=' + that.data.strategy_id + "&is_fullprice=" + strategy_id,
    // })
  },

  // 查看已选商品列表
  showCheck: function (e) {
    var that = this;
    that.setData({
      checkMode: false
    });
    util.api('/api/wxapp/fullprice/checkedlist', function (res) {
      if (res.error == 0) {
        var full_change_info = res.content;
        full_change_info.count = 0;
        full_change_info.forEach(item => {
          item.is_zuida = 0
          if (item.prdNumber == 1) {
            item.is_zuixiao = 1
          } else {
            item.is_zuixiao = 0
          }
          item.count += item.prdNumber
        })
        // for (var i = 0; i < full_change_info.list.length; i++) {
        //   full_change_info.list[i].is_zuida = 0;
        //   if (full_change_info.list[i].goods_number == 1) {
        //     full_change_info.list[i].is_zuixiao = 1;
        //   } else {
        //     full_change_info.list[i].is_zuixiao = 0;
        //   }
        //   full_change_info.count += full_change_info.list[i].goods_number;
        // }
        that.setData({
          full_change_info: full_change_info,
          can_del: 0,
        })
      } else {
        util.showModal("提示", res.message);
        return false;
      }
    }, { strategyId: that.data.strategy_id });
  },

  // 跳转购物车
  go_to_cart: function () {
    util.navigateTo({ url: '/pages/cart/cart' })
  },

  // 关闭已选商品弹窗
  proActionChange: function () {
    this.setData({
      checkMode: true
    })
  },

  // 编辑已选商品
  to_del_goods: function () {
    var that = this;
    that.setData({
      can_del: that.data.can_del == 0 ? 1 : 0
    })
  },

  // 关闭已选商品弹窗
  closeCheck: function () {
    var that = this;
    full_request(that);
    that.setData({
      checkMode: true,
      can_del: 0
    });
  },

  // 删除已选商品
  to_del_geted: function (e) {
    var goods_num = e.currentTarget.dataset.goods_number;
    var cart_id = e.currentTarget.dataset.cart_id;
    var that = this;
    wx.showLoading({
      title: '删除中...',
    })
    // util.api("/api/wxapp/common/removegoods", function (res) {
    //   if (res.error == 0) {
    //     util.api('/api/wxapp/fullprice/checkedlist', function (res) {
    //       if (res.error == 0) {
    //         wx.hideLoading();
    //         var full_change_info = res.content;
    //         full_change_info.count = 0;

    //         for (var i = 0; i < full_change_info.list.length; i++) {
    //           full_change_info.list[i].is_zuida = 0;
    //           if (full_change_info.list[i].goods_number == 1) {
    //             full_change_info.list[i].is_zuixiao = 1;
    //           } else {
    //             full_change_info.list[i].is_zuixiao = 0;
    //           }
    //           full_change_info.count += full_change_info.list[i].goods_number;
    //         }

    //         if (full_change_info.count != 0) {
    //           that.setData({ can_del: 1 })
    //         } else {
    //           that.setData({ can_del: 0 })
    //         }

    //         that.setData({
    //           full_change_info: full_change_info
    //         })
    //       } else {
    //         util.showModal("提示", res.message, function () {
    //           util.jumpLink("pages/index/index", "redirectTo")
    //         }, false);
    //         return false;
    //       }
    //     }, { strategy_id: that.data.strategy_id });
    //   } else {
    //     util.showModal("提示", res.message, function () {
    //       util.jumpLink("pages/index/index", 'redirectTo')
    //     }, false);
    //     return false;
    //   }
    // }, {
    //     identity_id: '',
    //     param_id: cart_id,
    //     action: "strategy"
    //   })
  },

  // 已选商品数量-
  btn_del_al: function (e) {
    var that = this;
    var this_cheks = e.currentTarget.dataset.idnes;
    if (that.data.full_change_info.list[this_cheks].goods_number < 1) {
      that.data.full_change_info.list[this_cheks].is_zuixiao = 1;
      that.data.full_change_info.list[this_cheks].goods_number = 1;
      that.setData({
        full_change_info: that.data.full_change_info
      })
      return false;
    }
    that.data.full_change_info.list[this_cheks].goods_number = parseInt(that.data.full_change_info.list[this_cheks].goods_number) - 1;
    if (that.data.full_change_info.list[this_cheks].goods_number < 1) {
      that.data.full_change_info.list[this_cheks].goods_number = 1;
      that.data.full_change_info.list[this_cheks].is_zuixiao = 1;
      that.setData({
        full_change_info: that.data.full_change_info
      });
      return false;
    }
    // util.api('/api/wxapp/cart/addnew', function (res) {
    //   if (res.error == 0) {
    //     that.data.full_change_info.count -= 1;
    //     that.setData({
    //       full_change_info: full_change_info,
    //       al_goods_prices: res.content.full_price,
    //       all_goods_doc: res.content.change_doc,
    //     });
    //   } else if (res.error == 10) {
    //     util.showModal("提示", res.message, function () {
    //       that.data.full_change_info.list[this_cheks].is_zuixiao = 1;
    //       that.data.full_change_info.list[this_cheks].goods_number = parseInt(that.data.full_change_info.list[this_cheks].goods_number) + 1;
    //       that.setData({
    //         full_change_info: that.data.full_change_info,
    //         al_goods_prices: res.content.full_price,
    //         all_goods_doc: res.content.change_doc,
    //       });
    //     });
    //     return false;
    //   } else {
    //     util.showModal("提示", res.message);
    //     return false;
    //   }
    // }, { action: 2, btn_click: 0, identity_id: that.data.strategy_id, change_goods_number: 1, product_id: that.data.full_change_info.list[this_cheks].prd_id, prd_number: that.data.full_change_info.list[this_cheks].goods_number })
  },

  // 已选商品数量+
  btn_add_al: function (e) {
    var that = this;
    var this_chek = e.currentTarget.dataset.indexs;
    that.data.full_change_info.list[this_chek].goods_number = parseInt(that.data.full_change_info.list[this_chek].goods_number) + 1;
    if (that.data.full_change_info.list[this_chek].goods_number > 1) {
      that.data.full_change_info.list[this_chek].is_zuixiao = 0;
    }
    // util.api('/api/wxapp/cart/addnew', function (res) {
    //   if (res.error == 0) {
    //     that.data.full_change_info.count += 1;
    //     that.setData({
    //       full_change_info: that.data.full_change_info
    //     });
    //   } else if (res.error == 10) {
    //     util.showModal("提示", res.message, function () {
    //       that.data.full_change_info.list[this_chek].is_zuida = 1;
    //       that.data.full_change_info.list[this_chek].goods_number = parseInt(that.data.full_change_info.list[this_chek].goods_number) - 1;
    //       that.setData({
    //         full_change_info: that.data.full_change_info,
    //         al_goods_prices: res.content.full_price,
    //         all_goods_doc: res.content.change_doc,
    //       });
    //     });
    //     return false;
    //   } else {
    //     util.showModal("提示", res.message);
    //     return false;
    //   }
    // }, { action: 2, btn_click: 1, identity_id: that.data.strategy_id, change_goods_number: 1, product_id: that.data.full_change_info.list[this_chek].prd_id, prd_number: that.data.full_change_info.list[this_chek].goods_number })
  },

  // 自定义商品数量
  get_al_num: function (e) {
    var that = this;
    var this_goods_number = e.detail.value;
    var inp_check = e.currentTarget.dataset.idnes;
    that.data.full_change_info.list[inp_check].goods_number = this_goods_number;
    // util.api('/api/wxapp/cart/addnew', function (res) {
    //   if (res.error == 0) {
    //     that.data.full_change_info.count = 0;
    //     for (var i = 0; i < that.data.full_change_info.list.length; i++) {
    //       that.data.full_change_info.count += parseInt(that.data.full_change_info.list[i].goods_number);
    //     }
    //     that.setData({
    //       full_change_info: that.data.full_change_info,
    //       al_goods_prices: res.content.full_price,
    //       all_goods_doc: res.content.change_doc,
    //     });
    //   } else if (res.error == 10) {
    //     util.showModal("提示", res.message, function () {
    //       that.data.full_change_info.list[inp_check].is_zuida = 1;
    //       that.setData({
    //         full_change_info: that.data.full_change_info,
    //         al_goods_prices: res.content.full_price,
    //         all_goods_doc: res.content.change_doc,
    //       });
    //     });
    //     return false;
    //   } else {
    //     util.showModal("提示", res.message);
    //     return false;
    //   }
    // }, { action: 2, identity_id: that.data.strategy_id, change_goods_number: 1, product_id: that.data.full_change_info.list[inp_check].prd_id, prd_number: that.data.full_change_info.list[inp_check].goods_number })
  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom: function () {
    var that = this;
    if (that.data.page == that.data.last_page) {
      that.setData({
        is_load: 0
      })
      return;
    } else {
      that.setData({
        is_load: 1
      })
    }

    that.data.page = that.data.page + 1;
    util.api('/api/wxapp/fullprice/goodslist', function (res) {
      if (res.error == 0) {
        var full_info = res.content;
        var full_goods_info = [];
        var full_goods_r = [];
        full_goods_r = full_info.goods.dataList; // 商品列表
        var al_goods_prices = full_info.totalPrice; // 金额
        // 金额提示
        if (full_info.fullPriceDoc) {
          var all_goods_doc = ''
          if (full_info.fullPriceDoc.docType == 0) {
            all_goods_doc = '快选择商品参加活动吧'
          } else if (full_info.fullPriceDoc.docType == 1) {
            all_goods_doc = '下单立减' + full_info.fullPriceDoc.reduceMoney + '元'
          } else if (full_info.fullPriceDoc.docType == 2) {
            all_goods_doc = '再选' + full_info.fullPriceDoc.diffPrice + '元，即可减' + full_info.fullPriceDoc.reduceMoney + '元'
          } else if (full_info.fullPriceDoc.docType == 3) {
            all_goods_doc = '再选' + full_info.fullPriceDoc.diffPrice + '元，即可打' + full_info.fullPriceDoc.discount + '折'
          } else if (full_info.fullPriceDoc.docType == 4) {
            all_goods_doc = '再选' + full_info.fullPriceDoc.diffNumber + '件，即可减' + full_info.fullPriceDoc.reduceMoney + '元'
          } else if (full_info.fullPriceDoc.docType == 5) {
            all_goods_doc = '再选' + full_info.fullPriceDoc.diffNumber + '件，即可打' + full_info.fullPriceDoc.discount + '折'
          }
        }
        if (full_goods_r.length > 0) {
          full_goods_info = full_goods_r;

          that.setData({
            full_info: full_info, // 全部信息
            full_goods_info: that.data.full_goods_info.concat(full_goods_info), // 加载商品列表
            al_goods_prices: al_goods_prices, // 金额
            all_goods_doc: all_goods_doc // 金额提示
          })

        }

      } else {
        util.showModal("提示", res.message, function () {
          wx.navigateBack({

          })
        });
        return false;
      }
    }, { strategyId: that.data.strategy_id, currentPage: that.data.page, search: that.data.searchText, pageRows: 10 });
  }
})
function full_request(that) {
  util.api('/api/wxapp/fullprice/goodslist', function (res) {
    if (res.error == 0) {
      var full_info = res.content;
      that.data.last_page = full_info.goods.page.lastPage;
      var full_goods_info = [];
      var full_goods_r = [];
      full_goods_r = full_info.goods.dataList; // 商品列表
      var al_goods_prices = full_info.totalPrice; // 金额
      // 金额提示
      if (full_info.fullPriceDoc) {
        var all_goods_doc = ''
        if (full_info.fullPriceDoc.docType == 0) {
          all_goods_doc = '快选择商品参加活动吧'
        } else if (full_info.fullPriceDoc.docType == 1) {
          all_goods_doc = '下单立减' + full_info.fullPriceDoc.reduceMoney + '元'
        } else if (full_info.fullPriceDoc.docType == 2) {
          all_goods_doc = '再选' + full_info.fullPriceDoc.diffPrice + '元，即可减' + full_info.fullPriceDoc.reduceMoney + '元'
        } else if (full_info.fullPriceDoc.docType == 3) {
          all_goods_doc = '再选' + full_info.fullPriceDoc.diffPrice + '元，即可打' + full_info.fullPriceDoc.discount + '折'
        } else if (full_info.fullPriceDoc.docType == 4) {
          all_goods_doc = '再选' + full_info.fullPriceDoc.diffNumber + '件，即可减' + full_info.fullPriceDoc.reduceMoney + '元'
        } else if (full_info.fullPriceDoc.docType == 5) {
          all_goods_doc = '再选' + full_info.fullPriceDoc.diffNumber + '件，即可打' + full_info.fullPriceDoc.discount + '折'
        }
      }

      if (full_goods_r.length > 0) {
        full_goods_info = full_goods_r;

        // 是否存在限时降价活动
        var flag = full_goods_info.find((item, index) => {
          return item.goodsPriceAction == 2
        })
        if (flag != undefined) {
          full_info.is_show_reduce_doc = 1
        } else {
          full_info.is_show_reduce_doc = 0
        }

        that.setData({
          full_info: full_info, // 全部信息
          full_goods_info: full_goods_info, // 商品列表
          al_goods_prices: al_goods_prices, // 金额
          all_goods_doc: all_goods_doc // 金额提示
        })

      }
    } else {
      util.showModal("提示", res.message, function () {
        wx.navigateBack({

        })
      });
      return false;
    }
  }, { strategyId: that.data.strategy_id, currentPage: that.data.page, search: that.data.searchText, pageRows: 10 });
}
