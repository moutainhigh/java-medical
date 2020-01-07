var base = require("../mixins/base.js");
var fix_top = require("../../common/fix_top.js");
global.wxComponent({
  mixins: [base, fix_top],
  data: {
    marqueeDistance: 10, // 偏移距离
    countTime: '',
    windowWidth: '',
    shopContentWidth: ''
  },
  pageLifetimes: {
    hide: function () {
      console.log('触发删除定时器+++++++++++++++++++++++')
      console.log(this._timers)
      this.clearTimers();
    }
  },
  methods: {
    onPropChange (newVal, oldVal, changedPath) {
      newVal.fixed = false;
      newVal.cur_idx = `c_${newVal.cur_idx}`
      var m = this.data.m = newVal;

      //选择id
      console.log('触发')
      var that = this;
      this.getRect(".shop_content").then(function (rect) {
        console.log(rect)
        that.setData({
          marqueeDistance: rect.width
        })
        that.setData({
          shopContentWidth: rect.width
        })
        that.initAnimation(that.data.m.shop_text);
      });
      console.log(m, 'announce')
    },
    onShow () {
      this.clearTimers();
      this.initAnimation(this.data.m.shop_text);
    },
    initAnimation: function (shop_announce_Text) {
      var length = shop_announce_Text.length * 16   // 文字宽度
      var windowWidth = wx.getSystemInfoSync().windowWidth; // 屏幕宽度
      console.log(length, windowWidth)
      this.run(length, windowWidth)
    },
    run (length, windowWidth) {
      var that = this
      that.createTimer("interval", "shopAnnounce", function () {
        if (--that.data.marqueeDistance < -length) {
          that.setData({
            marqueeDistance: that.data.shopContentWidth
          })
          that.run(length)
        } else {
          that.clearTimers()
          that.setData({
            marqueeDistance: that.data.marqueeDistance - 1
          })
          that.run(length)
        }
      }, 20)
    },
    onPageScroll (e) {
      var _this = this;
      var m = this.data.m;
      if (m.announce_position === '1') {
        this.getRect(`#${m.cur_idx}`).then(function (rect) {
          var top = _this.getFixeTop();
          if (!m.fixed && rect.top <= top) {
            m.fixed = true;
            m.fix_height = rect.height;
            m.top = top
            _this.startFixed(rect.height);
            _this.$set();
          } else {
            if (m.fixed && rect.top > top) {
              m.fixed = false;
              _this.stopFixed();
              _this.$set();
            }
          }
        })
      }
    }
  }
});