<template>
  <div>
    <div class="top">
      <span>{{$t('selectLinks.marketingActivities')}}/ {{this.navText}}</span>
      <div v-if="nowIndex === 7">
        <span>优惠券类型：</span>
        <el-select
          v-model="couponType"
          size="small"
          style="width: 170px;"
          @change="couponTypeChange()"
        >
          <el-option
            v-for="(item, index) in typeList"
            :key="index"
            :value="item.value"
            :label="item.label"
          ></el-option>
        </el-select>
      </div>
    </div>
    <div class="content">
      <table width='100%'>
        <thead>
          <tr>
            <td>{{$t('selectLinks.name')}}</td>
            <td v-if="couponFlag">{{$t('selectLinks.type')}}</td>
            <td>{{$t('selectLinks.termOfValidity')}}</td>
            <td>{{$t('selectLinks.link')}}</td>
            <td>状态</td>
          </tr>
        </thead>
        <tbody v-if="tbodyFlag">
          <tr
            v-for="(item,index) in trList"
            :key="index"
            :class="clickIindex===index?'clickClass':''"
            @click="handleClick(index)"
          >
            <td>{{nowIndex===8?item.cardName:item.actName}}</td>
            <td v-if="couponFlag">{{item.type==='0'?'普通':item.type==='1'?'分裂':''}}</td>
            <td
              v-if="nowIndex!==8"
              class="link"
            >{{item.validityType===1?'自领取开始':''}}{{item.validityType===1&&item.validity?`${item.validity}天`:''}}{{item.validityType===1&&item.validityHour?`${item.validityHour}小时`:''}}{{item.validityType===1&&item.validityMinute?`${item.validityMinute}分钟`:''}}{{item.validityType===1?'内有效':(item.startTime+$t('selectLinks.to')+item.endTime)}}</td>
            <td
              v-if="nowIndex===8"
              class="link"
            >{{item.expireType===1?'自领取开始':''}}{{item.expireType===1&&item.dateType===2?`${item.receiveDay}月`:''}}{{item.expireType===1&&item.dateType===1?`${item.receiveDay}周`:''}}{{item.expireType===1&&item.dateType===0?`${item.receiveDay}日`:''}}{{item.expireType===1?'内有效':item.expireType===0?(item.startTime+$t('selectLinks.to')+item.endTime):'永久有效'}}</td>
            <td class="tb_decorate_a">
              {{path}}{{item.id}}
            </td>
            <td class="status">{{item.status===1?'进行中':item.status===2?'未开始':''}}</td>
          </tr>
        </tbody>

      </table>
      <div
        class="noData"
        v-if="!tbodyFlag"
      >
        <img :src="noImg">
        <span>{{$t('selectLinks.noDataAvailable')}}</span>
      </div>
    </div>
  </div>
</template>
<script>
import { mapGetters, mapActions } from 'vuex'
import { packListRequest, assessListRequest, cardListRequest, voucherListRequest, packageListRequest, mrkingListRequest, lotteryListRequest, pinListRequest, integrationListRequest, promoteListRequest, priceListRequest } from '@/api/admin/selectLinksApi/selectLinksApi'
export default {
  data () {
    return {
      nowIndex: null,
      trList: [],
      clickIindex: null,
      tbodyFlag: true,
      noImg: this.$imageHost + '/image/admin/no_data.png',
      navText: '',
      couponFlag: false, // 优惠券td flag
      path: '', //  显示和保存的路径
      couponType: 2,
      // 优惠券类型
      typeList: [{
        label: '全部',
        value: 2
      }, {
        label: '普通优惠券',
        value: 0
      }, {
        label: '分裂优惠券',
        value: 1
      }]
    }
  },
  computed: {
    ...mapGetters(['selectlinksIndex']),
    selectlinksIndex_ () {
      console.log(this.selectlinksIndex)
      return this.selectlinksIndex
    }
  },
  watch: {
    selectlinksIndex_: {
      handler (newData, oldData) {
        console.log(newData)
        if (newData.index === 7) {
          this.couponFlag = true
        } else {
          this.couponFlag = false
        }
        // 初始化数据
        this.defaultData(newData)
      },
      immediate: true
    }
  },
  mounted () {
    // 初始化语言
    this.langDefault()
  },
  methods: {
    ...mapActions(['choisePagePath']),
    defaultData (newData) {
      console.log(newData)
      this.nowIndex = newData.index
      this.clickIindex = null
      if (newData.levelIndex === 1) {
        this.navText = newData.navText
        switch (newData.index) {
          case 0:
            pinListRequest().then((res) => {
              if (res.error === 0) {
                if (!res.content.length) {
                  this.tbodyFlag = false
                } else {
                  this.tbodyFlag = true
                }
                this.path = 'pages/pinlotterylist/pinlotterylist?group_draw_id='
                this.trList = res.content
              } else if (res.error === -1) this.tbodyFlag = false
              console.log(res)
            })
            break
          case 1:
            integrationListRequest().then((res) => {
              if (res.error === 0) {
                if (!res.content.length) {
                  this.tbodyFlag = false
                } else {
                  this.tbodyFlag = true
                }
                this.path = 'pages1/pinintegration/pinintegration?pid='
                this.trList = res.content
              } else if (res.error === -1) this.tbodyFlag = false
              console.log(res)
            })
            break
          case 2:
            promoteListRequest().then((res) => {
              if (res.error === 0) {
                if (!res.content.length) {
                  this.tbodyFlag = false
                } else {
                  this.tbodyFlag = true
                }
                this.path = 'pages1/promoteinfo/promoteinfo?actCode='
                this.trList = res.content
                this.trList.forEach((item, index) => {
                  item.id = item.actCode
                })
              } else if (res.error === -1) this.tbodyFlag = false
              console.log(res)
            })
            break
          case 3:
            priceListRequest().then((res) => {
              if (res.error === 0) {
                if (!res.content.length) {
                  this.tbodyFlag = false
                } else {
                  this.tbodyFlag = true
                }
                this.path = 'pages/maingoodslist/maingoodslist?identity_id='
                this.trList = res.content
              } else if (res.error === -1) this.tbodyFlag = false
              console.log(res)
            })
            break
          case 4:
            lotteryListRequest().then((res) => {
              if (res.error === 0) {
                if (!res.content.length) {
                  this.tbodyFlag = false
                } else {
                  this.tbodyFlag = true
                }
                this.path = 'pages1/lottery/lottery?lotterySource=0&lotteryId='
                this.trList = res.content
              } else if (res.error === -1) this.tbodyFlag = false
              console.log(res)
            })
            break
          case 5:
            mrkingListRequest().then((res) => {
              if (res.error === 0) {
                if (!res.content.length) {
                  this.tbodyFlag = false
                } else {
                  this.tbodyFlag = true
                }
                this.path = 'pages1/lottery/lottery?lotterySource=0&lotteryId='
                this.trList = res.content
              } else if (res.error === -1) this.tbodyFlag = false
              console.log(res)
            })
            break
          case 6:
            packageListRequest().then((res) => {
              if (res.error === 0) {
                if (!res.content.length) {
                  this.tbodyFlag = false
                } else {
                  this.tbodyFlag = true
                }
                this.path = 'pages/packagesalelist/packagesalelist?package_id='
                this.trList = res.content
              } else if (res.error === -1) this.tbodyFlag = false
              console.log(res)
            })
            break
          case 7:
            voucherListRequest(this.couponType).then((res) => {
              if (res.error === 0) {
                if (!res.content.length) {
                  this.tbodyFlag = false
                } else {
                  this.tbodyFlag = true
                }
                this.path = 'pages/getCoupon/getCoupon?couponId='
                this.trList = res.content
              } else if (res.error === -1) this.tbodyFlag = false
              console.log(res)
            })
            break
          case 8:
            cardListRequest().then((res) => {
              if (res.error === 0) {
                if (!res.content.length) {
                  this.tbodyFlag = false
                } else {
                  this.tbodyFlag = true
                }
                this.path = 'pages/usercardinfo/usercardinfo?card_id='
                this.trList = res.content
              } else if (res.error === -1) this.tbodyFlag = false
              console.log(res)
            })
            break
          case 9:
            assessListRequest().then((res) => {
              if (res.error === 0) {
                if (!res.content.length) {
                  this.tbodyFlag = false
                } else {
                  this.tbodyFlag = true
                }
                this.path = 'pages2/assessstart/assessstart?assess_id='
                this.trList = res.content
              } else if (res.error === -1) this.tbodyFlag = false
              console.log(res)
            })
            break
          case 10:
            packListRequest().then((res) => {
              if (res.error === 0) {
                if (!res.content.length) {
                  this.tbodyFlag = false
                } else {
                  this.tbodyFlag = true
                }
                this.path = 'pages1/couponpackage/couponpackage?packId='
                this.trList = res.content
              } else if (res.error === -1) this.tbodyFlag = false
              console.log(res)
            })
        }
      }
      console.log(newData)
    },
    // 行选中高亮
    handleClick (index) {
      this.clickIindex = index
      let path = `${this.path}${this.trList[index].id}`
      this.$emit('handleToGetDetailData', this.trList[index])
      this.choisePagePath(path)
    },
    // 切换优惠券类型
    couponTypeChange () {
      voucherListRequest(this.couponType).then((res) => {
        if (res.error === 0) {
          if (!res.content.length) {
            this.tbodyFlag = false
          } else {
            this.tbodyFlag = true
          }
          this.path = 'pages/getCoupon/getCoupon?couponId='
          this.trList = res.content
        } else if (res.error === -1) this.tbodyFlag = false
        console.log(res)
      })
    }
  }
}
</script>
<style scoped>
.top {
  padding: 10px;
  font-size: 14px;
  color: #333;
  display: flex;
  justify-content: space-between;
  align-items: center;
}
.noData {
  height: 100px;
  display: flex;
  justify-content: center;
  align-items: center;
  /* width: 650px; */
  flex-direction: column;
  border: 1px solid #eee;
  margin-top: 10px;
}
.noData span {
  margin: 10px;
}
.top_container {
  padding-bottom: 10px;
}
.top_container {
  display: flex;
  justify-content: space-around;
}
.top_left {
  display: flex;
  align-items: center;
  /* margin-left: 7px; */
}
.top_middle {
  display: flex;
  align-items: center;
}

.clickClass {
  background-color: #eee !important;
}
.spanClass {
  display: block !important;
}
table {
  border: 1px solid #eff1f5;
  border-collapse: collapse;
  font-size: 14px;
  border-spacing: 0 0;
}
thead {
  display: table-header-group;
  vertical-align: middle;
  border-color: inherit;
}
thead td {
  background: #faf9f8;
  text-align: center;
  color: #333;
  padding: 8px 10px;
  vertical-align: middle !important;
}
thead td:nth-of-type(1) {
  width: 120px;
}
thead td:nth-of-type(2) {
  width: 175px;
}
tbody td {
  text-align: center;
  border: 1px solid #eff1f5;
  color: #666;
}
td {
  padding: 8px 10px;
  vertical-align: middle !important;
  text-align: center;
}
.status {
  width: 66px;
}
</style>
