<template>
  <div
    class="membershipCard modules"
    @mouseover="mouseOver"
  >
    <!--列表模块-->
    <div
      class="showModule"
      :class="activeBorder?'activeBorder':''"
    >
      <!--模块编辑区-->
      <div class="mapModule">
        <div class="mapTitle">
          <div class="titleIcon"><i class="el-icon-location"></i></div>
          <div class="titleWord">{{ $t('mapModule.mapAddress') }}</div>
        </div>
        <div
          v-show="data.map_show === 1"
          class="mapContent"
          id="mapContainer"
          ref="mapContainer"
        >

        </div>
      </div>
      <!--模块编辑区结束-->
      <div
        class="item_module_title"
        :style="hoverTips?'width:140px':''"
      >
        <span>地图模块</span>
      </div>
      <div class="item_operation">
        <img
          class="up_img"
          style="cursor:pointer;z-index:1000"
          :src="$imageHost+'/image/admin/new_shop_beautify/add_up_use.png'"
          @click.stop="handleToClickIcon(0)"
        >
        <img
          class="down_img"
          style="cursor:pointer;z-index:1000"
          :src="$imageHost+'/image/admin/new_shop_beautify/add_down.png'"
          @click.stop="handleToClickIcon(1)"
        >
        <img
          class="del_img"
          style="cursor:pointer;z-index:1000"
          :src="$imageHost+'/image/admin/new_shop_beautify/add_close.png'"
          @click.stop="handleToClickIcon(2)"
        >
      </div>
    </div>
    <!--放这里-->
    <div
      class="setHere activeSetHere"
      :class="activeSetHere?'middleModulesActive':''"
    >
      {{$t('commoditySearch.putItHere')}}
    </div>
  </div>
</template>
<!-- 腾讯地图 -->
<script charset="utf-8" src="https://map.qq.com/api/js?v=2.exp&key=YPOBZ-DNIKF-Y6KJM-NDW7D-VYIFZ-QEBIO"></script>
<script>
export default {
  props: {
    flag: Number, // 模块公共
    nowRightShowIndex: Number, // 模块公共
    middleHereFlag: Boolean, // 模块公共
    backData: Object // 模块公共
  },
  data () {
    return {
      activeBorder: false, // 模块公共
      activeSetHere: false, // 模块公共
      hoverTips: 'hoverTips', // 英文适配  模块公共
      // 模块私有
      data: {
        search_style: '1',
        search_font: '1',
        box_color: '',
        sort_bg_color: '',
        back_color: '',
        search_sort: ''
      },
      map: null
    }
  },
  watch: {
    nowRightShowIndex (newData) { // 模块公共
      if (this.flag === newData) {
        this.activeBorder = true
      } else {
        this.activeBorder = false
      }
    },
    activeSetHere (newData) { // 模块公共
      console.log(newData)
      if (newData) {
        this.$emit('middleDragData', this.flag)
      }
    },
    activeBorder (newData) { // 模块公共
      console.log(newData, this.index)
      if (newData) {
        this.$http.$emit('nowHightLightModules', this.flag)
      }
    },
    middleHereFlag (newData) { // 模块公共
      if (newData) {
        this.activeSetHere = true
      } else {
        this.activeSetHere = false
      }
    },
    // 右侧模块点击传回中间当前高亮模块的数据
    backData: { // 模块公共
      handler (newData) {
        if (newData) {
          this.data = newData
        }
        console.log(newData)

        this.$nextTick(() => {
          // 初始化地图
          this.initMap(this.data.latitude, this.data.longitude)
        })
      },
      immediate: true,
      deep: true
    }
  },
  mounted () {
    // 初始化语言
    this.langDefault() // 模块公共
    // 初始化数据
    this.defaultData() // 模块公共
  },
  methods: {
    // 加载地图
    initMap (latitude, longitude) {
      // 定义map变量 调用 qq.maps.Map() 构造函数   获取地图显示容器
      this.map = new qq.maps.Map(this.$refs.mapContainer, {
        center: new qq.maps.LatLng(latitude, longitude), // 地图的中心地理坐标。
        zoom: 13, // 地图的中心地理坐标。
        disableDefaultUI: true // 禁止所有控件
      })
    },

    defaultData () { // 模块公共
      // 点击各模块触发事件
      this.$http.$on('modulesClick', res => {
        console.log(this.flag, res)
        if (this.flag === res) {
          this.activeBorder = true
        } else {
          this.activeBorder = false
        }
        console.log(res)
      })
    },
    // 移上、移下、删除统一处理事件
    handleToClickIcon (flag) { // 模块公共
      console.log(flag)
      let obj = {
        direction: '',
        flag: this.flag
      }
      switch (flag) {
        case 0:
          obj.direction = 'up'
          break
        case 1:
          obj.direction = 'down'
          break
        case 2:
          obj.direction = 'delete'
          break
      }
      this.$emit('handleToClickIcon', obj)
    },
    // 模块划过
    mouseOver () { // 模块公共
      this.$emit('middleDragData', this.flag)
    }
  }
}
</script>
<style lang="scss" scoped>
@import "@/style/admin/decorationModules.scss"; // 模块公共

.mapModule {
  width: 100%;
  height: 235px;
  background: #fff;
  // background: rgb(238, 238, 238);
  .mapTitle {
    border-bottom: 2px dashed #7987aa;
    margin: 0 10px;
    overflow: hidden;
    .titleIcon {
      float: left;
      width: 30px;
      height: 30px;
      text-align: center;
      line-height: 30px;
      display: inline-block;
      font-size: 20px;
      color: #ccc;
      i {
        width: 100%;
        height: 100%;
      }
    }
    .titleWord {
      float: left;
      width: 225px;
      line-height: 30px;
      margin-left: 10px;
    }
  }
  .mapContent {
    width: 100%;
    height: 203px;
    background: #ccc;
  }
}
</style>
