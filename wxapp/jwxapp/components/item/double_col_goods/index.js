global.wxComponent({
  /**
   * 组件的属性列表
   */
  properties: {
    goodsData: {
      type: Object,
      value: null,
      observer(val){
        console.log(val)
      }
    }
  },
  /**
   * 组件的初始数据
   */
  data: {},

  /**
   * 组件的方法列表
   */
  methods: {}
});
