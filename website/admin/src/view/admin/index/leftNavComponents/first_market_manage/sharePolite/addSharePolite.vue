<!--
****
** 添加分享有礼活动页面
****
-->
<template>
  <div class="bottomNavigationContent">
    <div class="bottomNavigationContent_main">

      <!-- 左侧轮播图内容-->
      <div class="cententLleft">
        <div class="cententLleft_title"></div>
        <div id="slider">
          <div class="scroll">
            <swiper :options="swiperOption">
              <swiper-slide>
                <div class="advan_li_left">
                  <img
                    :src="imageUrlData[0].image_1"
                    alt=""
                  >
                </div>
              </swiper-slide>
              <swiper-slide>
                <div class="advan_li_left">
                  <img
                    :src="imageUrlData[1].image_2"
                    alt=""
                  >
                </div>
              </swiper-slide>
              <div
                class="swiper-pagination"
                slot="pagination"
              ></div> <!-- 标页码 -->
            </swiper>
          </div>
        </div>
      </div>

      <!-- 右侧内容部分 -->
      <section class="right_main">
        <el-form
          :model="param"
          ref="param"
          label-position="right"
          label-width="100px"
          :rules="fieldValidation"
        >

          <!-- 活动信息部分 -->
          <div class="contentRight">
            <div class="actInfo">{{$t('adSharePolite.activityInfo')}}</div>
            <el-form-item
              :label="$t('adSharePolite.activityName')+'：'"
              prop="name"
            >
              <el-input
                size="small"
                style="width:200px"
                v-model="param.name"
                :placeholder="$t('adSharePolite.namelimit')"
                maxlength="10"
                show-word-limit
              ></el-input>
            </el-form-item>
            <br>

            <!-- 时间选择 -->
            <el-form-item
              :label="$t('adSharePolite.validityPeriod')+'：'"
              prop="isForever"
            >
              <el-radio-group v-model="param.isForever">
                <el-form-item>
                  <el-radio :label=0>{{$t('adSharePolite.fixTime')}}</el-radio>
                  <el-radio
                    :label=1
                    style="margin-left:50px;"
                  >{{$t('adSharePolite.forever')}}</el-radio>
                </el-form-item>
                <el-form-item
                  prop="effectiveDate"
                  ref="effectiveDate"
                >
                  <el-date-picker
                    v-if="this.param.isForever == 0"
                    v-model="param.effectiveDate"
                    style="width: 380px;"
                    type="datetimerange"
                    :range-separator=" $t('marketCommon.to') "
                    :start-placeholder="$t('marketCommon.startTime')"
                    :end-placeholder="$t('marketCommon.endTime')"
                    value-format="yyyy-MM-dd HH:mm:ss"
                    :default-time="['00:00:00', '23:59:59']"
                    size="small"
                    align="center"
                  >
                  </el-date-picker>
                </el-form-item>
                <br>
              </el-radio-group>
            </el-form-item>

            <!-- 优先级 -->
            <el-form-item
              :label="$t('adSharePolite.priority')+'：'"
              prop="priority"
            >
              <el-input
                size="small"
                style="width:200px"
                v-model.number="param.priority"
              ></el-input>
              <div class="tips">{{$t('adSharePolite.priorityComment')}}</div>
            </el-form-item>
            <br>
            <el-form-item
              :label="$t('adSharePolite.condition')+'：'"
              prop="condition"
            >
              <span>{{$t('adSharePolite.conditionInfo')}}</span>
              <el-radio-group v-model="param.condition">
                <el-radio :label=1>{{$t('adSharePolite.allGoods')}}</el-radio>
                <el-radio :label=2>{{$t('adSharePolite.specifyGoods')}}</el-radio>
                <el-radio :label=3>{{$t('adSharePolite.pvLessGoods')}}</el-radio>
              </el-radio-group>
            </el-form-item>

            <!-- 触发条件 -->
            <el-form-item
              prop="goodsIds"
              ref="goodsIds"
              v-if="param.condition == 2"
            >
              <div
                @click="showChoosingGoods"
                class="add_btn specify_goods"
              >{{$t('adSharePolite.chooseGoods')}}</div>
              <span
                @click="onlyShowChoosingGoods"
                style="color: #e4393c"
              >{{$t('adSharePolite.alreadyChoose')}}{{selectGoods}}{{$t('adSharePolite.goods')}}</span>
            </el-form-item>
            <el-form-item
              prop="goodsPv"
              ref="goodsPv"
              v-if="param.condition == 3"
            >
              <div style="margin-left:60px;">
                <span>{{$t('adSharePolite.pvInFact')}}</span>
                <el-input
                  size="small"
                  style="width:70px"
                  v-model.number="param.goodsPv"
                  placeholder="0"
                ></el-input> {{$t('adSharePolite.pvGoods')}}
              </div>
            </el-form-item>
          </div>

          <!-- 分享奖励部分 -->
          <div
            class="contentRight"
            style="margin-top:10px;"
          >
            <div style="display:flex;border-bottom:1px solid #e5e5e5;">
              <div class="actInfo">{{$t('adSharePolite.shareReward')}}</div>
              <div style="display:flex">
                <span style="width: 120px">{{$t('adSharePolite.limitRule')}}</span>
                <span
                  class="addRules"
                  @click="addItem()"
                >{{$t('adSharePolite.addRule')}}</span>
              </div>
            </div>

            <div style="padding: 10px 0">
              <el-checkbox v-model="param.visitFirst">{{$t('adSharePolite.visitNew')}}</el-checkbox>
            </div>

            <section
              v-for="(item,index) in param.shareRules"
              :key="index"
              class="rules_part"
              style="display: flex;"
            >
              <div style="margin-top: 10px;width:25px">{{ (index+1)+$t('adSharePolite.level') }}</div>
              <div>
                <!-- 邀请满几人 -->
                <el-form-item
                  :label="$t('adSharePolite.invite')"
                  label-width="90px"
                  :prop="`shareRules[${index}].invite_num`"
                  :rules="[
                    {required: true, validator: (rule, value, callback) => {validatePersonNumber(rule, value, callback, item.invite_num)}, trigger: ['blur','change']}
                  ]"
                >
                  <el-input
                    size="small"
                    style="width:60px"
                    v-model="item.invite_num"
                    placeholder="0"
                  ></el-input> {{$t('adSharePolite.person')}} <span style="color:#999">{{$t('adSharePolite.invireNum')}}</span>
                  <i
                    v-if="index>0"
                    class="el-icon-delete"
                    style="color:#409eff;cursor:pointer;font-size:18px;margin-left:185px"
                    @click="deleteItem(index)"
                  ></i>
                </el-form-item>

                <!-- 可获得 -->
                <el-form-item
                  :label="$t('adSharePolite.reward')+'：'"
                  label-width="110px"
                  :prop="`shareRules[${index}].reward_type`"
                  ref="reward_type"
                  style="margin-top:10px"
                >
                  <el-radio-group v-model="item.reward_type">
                    <el-radio :label="1">{{$t('adSharePolite.socre')}}</el-radio>
                    <el-radio
                      :label=2
                      style="margin: 0 20px"
                    >{{$t('adSharePolite.coupon')}}</el-radio>
                    <el-radio :label=3>{{$t('adSharePolite.lottery')}}</el-radio>
                  </el-radio-group>
                </el-form-item>

                <!-- 积分 -->
                <el-form-item
                  v-if="item.reward_type == 1"
                  :label="$t('adSharePolite.socre')+'：'"
                  :prop="`shareRules[${index}].score`"
                  ref="rewardScore"
                  label-width="110px"
                  inline-message=true
                  style="padding: 0 0 10px;margin-top:10px"
                  :rules="[
                    { required: true, validator: (rule,value, callback)=>(validateIntegral(rule, value, callback, item.score)), trigger:['blur', 'change']}
                  ]"
                >
                  <el-input
                    v-model.number="item.score"
                    size="small"
                    style="width: 150px"
                    placeholder="0"
                  ></el-input>
                </el-form-item>

                <!-- 积分 - 奖品份数 -->
                <el-form-item
                  :prop="`shareRules[${index}].score_num`"
                  ref="score_num"
                  :label="$t('adSharePolite.rewwardNum')+'：'"
                  label-width="110px"
                  v-if="item.reward_type == 1"
                  style="margin-top:10px"
                  :rules="[
                    {required: true, validator:(rule, value, callback) =>{ validateScoreNumber(rule, value, callback, item.score_num)}, trigger: 'blur'}
                  ]"
                >
                  <el-input
                    size="small"
                    style="width:150px"
                    v-model.number="item.score_num"
                    placeholder="0"
                  ></el-input>
                  {{$t('adSharePolite.number')}}
                </el-form-item>

                <!-- 优惠券 -->
                <el-form-item
                  :prop="`shareRules[${index}].coupon_name`"
                  v-if="item.reward_type == '2'"
                  :label="$t('adSharePolite.coupon')+'：'"
                  label-width="110px"
                  style="margin-top:10px"
                  :rules="[
                    {required: true, validator:(rule, value, callback) =>  { validatedSelectCoupon(rule, value, callback, item.coupon_name,item.couponStock)}, trigger:['blur', 'change']}
                  ]"
                >
                  <el-button
                    @click="handleToCallDialog(item,index)"
                    style="padding:5px"
                  >{{$t('adSharePolite.addCoupon')}}</el-button>
                  <el-link
                    type="primary"
                    :underline="false"
                    @click="refreshCoupn(item,index)"
                    style="margin:0 5px;"
                  >{{$t('adSharePolite.refresh')}}
                  </el-link>
                  |
                  <el-link
                    type="primary"
                    :underline="false"
                    @click="jumpToAddCoupon"
                    style="margin:0 5px;"
                  >{{$t('adSharePolite.createLabel')}}</el-link>
                  |
                  <el-link
                    type="primary"
                    :underline="false"
                    @click="jumpToOrdinaryCoupon"
                    style="margin:0 5px;"
                  >{{$t('adSharePolite.manageLabel')}}</el-link>
                  <el-row>
                    <el-col :offset="4">
                      <el-input
                        size="small"
                        style="width: 140px;"
                        v-model="item.coupon_name"
                        :disabled="true"
                        class="coupon-name"
                      ></el-input>
                      <span style="color:#606266">{{$t('adSharePolite.couponStock')}}</span>
                      <el-input
                        size="small"
                        style="width:80px"
                        v-model.number="item.couponStock"
                        :disabled="true"
                        class="coupon-name"
                      ></el-input>
                      {{$t('adSharePolite.number')}}
                    </el-col>
                  </el-row>
                </el-form-item>

                <!-- 优惠券 - 奖品份数 -->
                <el-form-item
                  :prop="`shareRules[${index}].coupon_num`"
                  ref="coupon_num"
                  :label="$t('adSharePolite.rewwardNum')+'：'"
                  label-width="110px"
                  style="margin-top:20px"
                  v-if="item.reward_type === 2"
                  :rules="[
                    {required: true, validator:(rule, value, callback) =>{ validateCouponNumber(rule, value, callback, item.coupon_num, item.couponStock)}, trigger: 'blur'}
                  ]"
                >
                  <el-input
                    size="small"
                    style="width:150px"
                    v-model.number="item.coupon_num"
                    placeholder="0"
                  ></el-input>
                  {{$t('adSharePolite.number')}}
                </el-form-item>

                <!-- 幸运大抽奖 -->
                <el-form-item
                  :prop="`shareRules[${index}].lottery`"
                  ref="rewardLottery"
                  v-if="item.reward_type == 3"
                  :label="$t('adSharePolite.lottery')+'：'"
                  label-width="110px"
                  style="padding:0 0 10px;margin-top: 10px"
                  :rules="[
                    {required: true, validator:(rule, value, callback) =>{ validatelottery(rule, value, callback, item.lottery)}, trigger: ['blur','change']}
                  ]"
                >
                  <el-select
                    v-model="item.lottery"
                    placeholder="请选择"
                    size="small"
                    style="width:150px"
                  >
                    <el-option
                      v-for="items in lotteryOption"
                      :key="items.id"
                      :label="items.lotteryName"
                      :value="items.id"
                    ></el-option>
                  </el-select>
                  <el-link
                    type="primary"
                    :underline="false"
                    @click="refreshLuckyDraw(index)"
                    style="margin:0 5px;"
                  >{{$t('adSharePolite.refresh')}}
                  </el-link>
                  |
                  <el-link
                    type="primary"
                    :underline="false"
                    @click="toAddLuckyDrawActivity"
                    style="margin:0 5px;"
                  >{{$t('adSharePolite.createLabel')}}</el-link>
                  |
                  <el-link
                    type="primary"
                    :underline="false"
                    @click="toLuckyDrawList"
                    style="margin:0 5px;"
                  >{{$t('adSharePolite.manageLabel')}}</el-link>
                </el-form-item>

                <!-- 幸运大抽奖 - 奖品份数 -->
                <el-form-item
                  ref="lottery_num"
                  :prop="`shareRules[${index}].lottery_num`"
                  :label="$t('adSharePolite.rewwardNum')+'：'"
                  label-width="110px"
                  v-if="item.reward_type == 3"
                  style="margin-top: 10px"
                  :rules="[
                    {required: true, validator:(rule, value, callback) =>{ validateRewardNumber(rule, value, callback, item.lottery_num)}, trigger: ['blur', 'change']}
                  ]"
                >
                  <el-input
                    size="small"
                    style="width:150px"
                    v-model.number="item.lottery_num"
                    placeholder="0"
                  ></el-input>
                  {{$t('adSharePolite.number')}}
                </el-form-item>
              </div>

            </section>
          </div>

        </el-form>
      </section>

      <!--保存-->
      <div class="footer">
        <div
          class="save"
          @click="add"
        >{{$t('marketCommon.save')}}</div>
      </div>
    </div>

    <!--添加商品弹窗-->
    <choosingGoods
      @result="choosingGoodsResult"
      :chooseGoodsBack="goodIdList"
      :tuneUpChooseGoods="tuneUpChooseGoods"
      :onlyShowChooseGoods="isOnlyShowChooseGoods"
    />
    <!--添加优惠券弹窗-->
    <addCouponDialog
      :singleElection="true"
      :tuneUpCoupon="tuneUpCoupon"
      @handleToCheck="handleToCheck"
      :couponBack.sync="couponIdList"
      ref="templateRefresh"
      :type="0"
    />
  </div>
</template>
<script>
import 'swiper/dist/css/swiper.css'
import vueSwiper from 'vue-awesome-swiper'
import Vue from 'vue'
import { mapActions } from 'vuex'
import { addShareReward, getShareRewardInfo, updateShareReward } from '@/api/admin/marketManage/sharePolite.js'
import { isGoingAct } from '@/api/admin/marketManage/payReward.js'
// import { getAllCoupon } from '@/api/admin/marketManage/evaluationGift.js'
import choosingGoods from '@/components/admin/choosingGoods'
import addCouponDialog from '@/components/admin/addCouponDialog'
import { coupondetail } from '@/api/admin/marketManage/couponList.js'
Vue.use(vueSwiper)
export default {
  components: {
    choosingGoods,
    addCouponDialog
  },
  data () {
    // 自定义表单字段验证
    // 有效期验证
    var checkValidityPeriod = (rule, value, callback) => {
      if (this.param.isForever === 0) {
        if (this.param.effectiveDate === null || this.param.effectiveDate === '') {
          return callback(new Error(this.$t('adSharePolite.pleaseChooseFixedDate')))
        } else {
          // 移除该表单项的校验结果
          this.$refs.effectiveDate.clearValidate()
          callback()
        }
      } else {
        // 对该表单项进行重置，将其值重置为初始值并移除校验结果
        this.$refs.effectiveDate.resetField()
        callback()
      }
    }
    // 优先级验证
    var validatorPriority = (rule, value, callback) => {
      var re = /^[1-9]\d*$/
      if (!value) {
        callback(new Error('请输入优先级'))
      } else if (!re.test(value)) {
        callback(new Error('请填写正整数'))
      } else {
        callback()
      }
    }
    // 有效期切换验证
    var switchForever = (rule, value, callback) => {
      if (this.param.isForever === 1) {
        this.$refs.effectiveDate.resetField()
      }
      callback()
    }
    // 触发条件切换验证
    var switchCondition = (rule, value, callback) => {
      callback()
    }
    // 触发条件验证
    var checkConditionId = (rule, value, callback) => {
      if (this.param.condition === 2) {
        if (value === null || value === '' || value === 0) {
          return callback(new Error(this.$t('adSharePolite.pleaseAtLeastChooseOne')))
        } else {
          callback()
        }
      }
    }
    var checkConditionPv = (rule, value, callback) => {
      var re = /^[0-9]*[1-9][0-9]*$/
      if (value === null || value === 0 || value === '') {
        return callback(new Error(this.$t('adSharePolite.pleaseInputPV')))
      } else if (!re.test(value)) {
        callback(new Error('请输入正整数'))
      }
      if (!Number.isInteger(value)) {
        return callback(new Error(this.$t('adSharePolite.PVMsutBeNumber')))
      } else {
        callback()
      }
    }
    return {
      tuneUpCoupon: false,
      tuneUpChooseGoods: false,
      swiperOption: {
        loop: true,
        autoplay: {
          delay: 3000, // 自动切换的时间间隔，单位ms
          stopOnLastSlide: false, // 当切换到最后一个slide时停止自动切换
          disableOnInteraction: false, // 用户操作swiper之后，是否禁止autoplay。
          waitForTransition: true // 等待过渡完毕。自动切换会在slide过渡完毕后才开始计时。
        },
        // 分页器设置
        pagination: {
          el: '.swiper-pagination',
          clickable: true
        }
      },
      imageUrlData: [
        { image_1: this.$imageHost + '/image/admin/share_pop1.jpg' },
        { image_2: this.$imageHost + '/image/admin/share_pop2.jpg' }
      ],
      // 添加和更新页面共用一个，此标识用于区别这两个操作，弹窗添加成功(标识为0)，更新成功(标识为1)
      flag: 0,
      lotteryOption: [],
      value: '',
      // 已选择商品件数
      selectGoods: 0,
      index: 0,
      param: {
        id: this.$route.params.id,
        name: '',
        effectiveDate: '',
        startTime: null,
        endTime: null,
        isForever: 1,
        priority: '',
        condition: 1,
        goodsIds: '',
        goodsPv: '',
        visitFirst: false,
        shareRules: [
          {
            invite_num: '', // 邀请数量
            reward_type: 1, // 奖励类型
            score: '', // 积分
            coupon: '', // 优惠券
            lottery: '', // 幸运大抽奖
            score_num: '', // 积分数量
            coupon_num: '', // 优惠券数量
            lottery_num: '', // 幸运大抽奖数量
            couponStock: '', // 优惠券可用库存
            coupon_name: '' // 优惠券名字
          }
        ],
        firstRule: null,
        secondRule: null,
        thirdRule: null,
        firstAwardNum: 0,
        secondAwardNum: 0,
        thirdAwardNum: 0
      },
      goodIdList: [],
      isOnlyShowChooseGoods: false,
      couponIdList: [], // 优惠券
      // 表单字段校验
      fieldValidation: {
        // 活动名称
        name: [
          { required: true, message: this.$t('adSharePolite.pleaseInputActivityName'), trigger: 'blur' },
          { min: 1, max: 10, message: this.$t('adSharePolite.lengthLimit'), trigger: 'blur' }
        ],
        // 有效期切换
        isForever: [
          { required: true, validator: switchForever, trigger: 'change' }
        ],
        // 日期选择
        effectiveDate: [
          { type: 'date', required: true, validator: checkValidityPeriod, trigger: ['blur', 'change'] }
        ],
        // 优先级
        priority: [
          { required: true, validator: validatorPriority, trigger: 'blur' }
        ],
        // 触发条件切换
        condition: [
          { required: true, validator: switchCondition, trigger: 'change' }
        ],
        // 商品选择
        goodsIds: [
          { required: true, validator: checkConditionId, trigger: ['blur', 'change'] }
        ],
        // 访问量输入
        goodsPv: [
          { required: true, validator: checkConditionPv, trigger: 'blur' }
        ]
      }
    }
  },
  mounted () {
    this.initForm()
    this.getIsGonigLotteryActivity()
  },
  methods: {
    ...mapActions(['transmitEditGoodsId']),
    // 选择优惠券弹窗
    handleToCallDialog (item, index) {
      this.index = index
      let arr = []
      arr.push(Number(item.coupon))
      this.couponIdList = arr
      this.$nextTick(() => {
        this.tuneUpCoupon = !this.tuneUpCoupon
      })
    },
    // 优惠券回调
    handleToCheck (data) {
      console.log('优惠券', data)
      let arr = []
      let stock = []
      let name = []
      data.forEach(item => {
        name.push(item.actName)
        arr.push(item.id)
        if (item.surplus === 0) {
          stock.push('不限制')
        } else {
          stock.push(item.surplus)
        }
      })
      this.param.shareRules[this.index].coupon_name = name.toString()
      this.param.shareRules[this.index].coupon = arr.toString()
      this.param.shareRules[this.index].couponStock = stock.toString()
      this.$forceUpdate()
    },
    // 选择商品弹窗
    showChoosingGoods () {
      this.isOnlyShowChooseGoods = false
      this.tuneUpChooseGoods = !this.tuneUpChooseGoods
    },
    // 初始化商品弹窗部分商品
    onlyShowChoosingGoods () {
      this.isOnlyShowChooseGoods = true
      this.tuneUpChooseGoods = !this.tuneUpChooseGoods
    },
    //  获取商品ids
    choosingGoodsResult (ids) {
      console.log('ids--', ids)
      this.param.goodsIds = ids.toString()
      this.goodIdList = ids
      this.selectGoods = ids.length
    },
    addItem () {
      let obj = {
        invite_num: '', // 邀请数量
        reward_type: 1, // 奖励类型
        score: '', // 积分
        coupon: '', // 优惠券
        lottery: '', // 幸运大抽奖
        score_num: '', // 积分数量
        coupon_num: '', // 优惠券数量
        lottery_num: '', // 幸运大抽奖数量
        couponStock: '', // 优惠券可用库存
        coupon_name: '' // 优惠券名字
      }
      if (this.param.shareRules.length < 3) {
        this.param.shareRules.push(obj)
      } else {
        this.$message.warning('最多可添加3个规则！')
      }
    },
    deleteItem (index) {
      console.log(this.param.shareRules)
      this.param.shareRules.splice(index, 1)
      console.log(index)
    },
    add () {
      // 分享规则处理逻辑
      this.param.shareRules.map((item, index) => {
        switch (this.param.shareRules.length) {
          case 0:
            break
          case 1:
            this.param.firstRule = this.param.shareRules[0]
            console.log(this.param.firstRule, 'firstRule')
            break
          case 2:
            this.param.firstRule = this.param.shareRules[0]
            this.param.secondRule = this.param.shareRules[1]
            break
          case 3:
            this.param.firstRule = this.param.shareRules[0]
            this.param.secondRule = this.param.shareRules[1]
            this.param.thirdRule = this.param.shareRules[2]
            break
        }
      })
      // 仅邀请未访问过的用户有效；0否，1是
      switch (this.param.visitFirst) {
        case true:
          this.param.visitFirst = 1
          break
        case false:
          this.param.visitFirst = 0
          break
      }
      this.param.startTime = this.param.effectiveDate[0]
      this.param.endTime = this.param.effectiveDate[1]
      console.log(JSON.parse(JSON.stringify(this.param)))
      // 字段校验，校验通过后提交表单信息
      this.$refs['param'].validate((valid) => {
        if (valid) {
          console.log('校验通过！')
          console.log(JSON.parse(JSON.stringify(this.param)))
          if (this.flag === 0) {
            delete this.param.id
            addShareReward(this.param).then((res) => {
              if (res.error === 0) {
                console.log(JSON.parse(JSON.stringify(res)))
                this.$message.success('添加成功！')
                this.$router.push({
                  name: 'share_award'
                })
              } else {
                this.$message.error(res.message)
              }
            }).catch(() => {
              this.$message.error('操作失败')
            })
          } else if (this.flag === 1) {
            updateShareReward(this.param).then((res) => {
              if (res.error === 0) {
                console.log(JSON.parse(JSON.stringify(res)))
                this.$message.success('更新成功！')
                this.$router.push({
                  name: 'share_award'
                })
              } else {
                this.$message.error(res.message)
              }
            }).catch(() => {
              this.$message.error('操作失败')
            })
          }
        } else {
          this.$message.warning('请正确填写表单')
          return false
        }
      })
    },
    // 更新时初始化表单内容
    initForm () {
      if (this.param.id != null) {
        this.flag = 1
      }
      if (this.param.id != null) {
        getShareRewardInfo(this.param.id).then((res) => {
          console.log(res)
          if (res.error === 0) {
            this.$nextTick(() => {
              let data = res.content.shareRules
              // 获取优惠券库存
              data.map((item, index) => {
                console.log(item)
                if (item.reward_type === 2) {
                  coupondetail(item.coupon).then((res) => {
                    console.log(res)
                    item.coupon_name = res.content[0].actName
                    if (res.content[0].surplus === 0) {
                      item.couponStock = '不限制'
                    } else {
                      item.couponStock = res.content[0].surplus
                    }
                    this.couponIdList = res.content.map(item => item.id)
                  }).catch(() => {
                    this.$message.error('优惠券库存查询失败！')
                  })
                }
              })
              this.param.shareRules = Object.assign(res.content.shareRules, data)

              this.param = res.content
              this.param.effectiveDate = [this.param.startTime, this.param.endTime]
              if (res.content.condition === 2) {
                this.selectGoods = res.content.goodsIds.split(',').length
                this.goodIdList = res.content.goodsIds.split(',').map(Number)
              }
            })
          }
        }).catch(() => {
          this.$message.error('活动查询失败！')
        })
      }
    },
    // 支付奖励-幸运大抽奖-下拉框选项
    getIsGonigLotteryActivity () {
      isGoingAct().then(res => {
        if (res.error === 0) {
          console.log(res, 'get data--')
          this.lotteryOption = res.content.dataList
        }
      }).catch(err => console.log(err))
    },
    // 优惠券库存查询
    getCouponStock (id) {
      console.log(JSON.parse(JSON.stringify(id)))
      coupondetail(id).then((res) => {
        console.log(JSON.parse(JSON.stringify(res)))
        console.log(JSON.parse(JSON.stringify(res.content['0'].surplus)))
        return res.content['0'].surplus
      }).catch(() => {
        this.$message.error('优惠券库存查询失败！')
      })
    },
    resetForm () {
      this.$refs['param'].resetFields()
    },
    // 校验邀请人数
    validatePersonNumber (rule, value, callback, inviteNum) {
      console.log(inviteNum, 'inviteNum')
      var re = /^[1-5]$/
      if (!inviteNum) {
        callback(new Error('请输入要邀请的人数'))
      } else if (!re.test(value)) {
        callback(new Error('请输入1~5之间的整数'))
      } else {
        return callback()
      }
    },
    // 校验积分奖品份数
    validateScoreNumber (rule, value, callback, scoreNum) {
      console.log(scoreNum, 'scoreNum')
      var re = /^[1-9]\d*$/
      if (scoreNum === '') {
        callback(new Error('请输入奖品份数'))
      } else if (!re.test(value)) {
        callback(new Error('请输入正整数'))
      } else {
        callback()
      }
    },
    // 校验是否选择了优惠券
    validatedSelectCoupon (rule, value, callback, couponName, couponStock) {
      console.log(couponName, couponStock, 'get rewardCoupon')
      if (couponName === undefined || couponName === '') {
        callback(new Error('请选择优惠券'))
      } else if (couponStock === '不限制') {
        callback()
      } else {
        callback()
      }
    },
    // 验证优惠券奖励份数
    validateCouponNumber (rule, value, callback, couponNum, couponStock) {
      console.log(couponStock, value)
      var re = /^[1-9]\d*$/
      if (couponNum === '' || !couponNum) {
        callback(new Error('请输入奖品份数'))
      } else if (!re.test(value)) {
        callback(new Error('请输入正整数'))
      } else if (value > couponStock) {
        callback(new Error('奖品份数已大于库存'))
      } else {
        callback()
      }
    },
    // 验证幸运大抽奖奖励总份数
    validateRewardNumber (rule, value, callback, lotteryNum) {
      console.log(lotteryNum, 'lottery_num', value, 'get value')
      var re = /^[1-9]\d*$/
      if (lotteryNum === '' || !lotteryNum) {
        callback(new Error('请输入奖品份数'))
      } else if (!re.test(value)) {
        callback(new Error('请输入正整数'))
      } else {
        callback()
      }
    },
    // 验证幸运大抽奖
    validatelottery (rule, value, callback, lottery) {
      console.log(value, 'get value--')
      if (!lottery || lottery === '') {
        callback(new Error('请选择幸运大抽奖活动'))
      } else {
        callback()
      }
    },
    // 验证积分
    validateIntegral (rule, value, callback, score) {
      var re = /^(0|\+?[1-9][0-9]*)$/
      if (score === '') {
        callback(new Error('请输入积分'))
      } else if (!re.test(score)) {
        callback(new Error('请填写0或者正整数'))
      } else {
        callback()
      }
    },

    // 跳转到添加优惠券页面
    jumpToAddCoupon () {
      this.$router.push({
        name: 'add_coupon'
      })
    },

    // 跳转到优惠券列表页面
    jumpToOrdinaryCoupon () {
      this.$router.push({
        name: 'ordinary_coupon'
      })
    },

    // 优惠券刷新
    refreshCoupn (item, index) {
      this.$refs.templateRefresh.handleToSure()
      this.$nextTick(() => {
        this.param.shareRules[index].coupon_name = ''
        this.param.shareRules[index].couponStock = ''
        this.param.shareRules[index].coupon = []
        this.couponIdList = this.param.shareRules[index].coupon
        this.$forceUpdate()
        this.$message.success('刷新成功')
      })
    },

    // 跳转到新建幸运大抽奖活动页面
    toAddLuckyDrawActivity () {
      this.$router.push({
        name: 'lottery_activity',
        query: {
          add: 1
        }
      })
    },

    // 跳转到幸运大抽奖列表页面
    toLuckyDrawList () {
      this.$router.push({
        name: 'lottery_activity'
      })
    },

    // 幸运大抽奖刷新
    refreshLuckyDraw () {
      this.getIsGonigLotteryActivity()
      this.$nextTick(() => {
        this.$message.success('刷新成功')
      })
    }
  }
}
</script>

<style scoped>
* {
  box-sizing: border-box;
  margin: 0;
  padding: 0;
  font-size: 14px;
}
.bottomNavigationContent {
  position: relative;
  height: 100%;
  width: 100%;
}
.bottomNavigationContent_main {
  display: flex;
  position: relative;
  justify-content: center;
  background-color: #fff;
  padding-bottom: 96px;
  margin: 10px;
}

.cententLleft_title {
  height: 55px;
  background: url(../../../../../../assets/adminImg/phone_tops.png) no-repeat;
  text-align: center;
  padding-top: 9px;
}
.advan_li_left {
  width: 321px;
  height: 570px;
  float: left;
}
.advan_li_left > img {
  width: 100%;
  height: 100%;
}
#slider {
  width: 100%;
}
.cententLleft {
  width: 323px;
  height: 627px;
  border: 1px solid #ccc;
  background: #eee;
  position: relative;
  float: left;
  margin: 40px 0 60px 0;
}
.right_main {
  float: left;
  margin: 40px 0 0 15px;
}
.contentRight {
  border: 1px solid #e5e5e5;
  background: #f8f8f8;
  border-radius: 3px;
  padding: 10px;
  width: 515px;
}
.actInfo_content_item {
  display: flex;
}
.tips {
  margin-top: 10px;
  line-height: 1.4;
  font-size: 12px;
  color: #999;
}
.add_btn {
  width: 120px;
  height: 30px;
  line-height: 30px;
  text-align: center;
  color: #5a8bff;
  border: 1px solid #ccc;
  background: #fff;
  cursor: pointer;
  margin: 10px 10px 10px 0;
  display: inline-block;
}
.specify_goods {
  margin-left: 60px;
}
.actInfo {
  width: 100%;
  font-size: 14px;
  padding-bottom: 10px;
  border-bottom: 1px solid #e5e5e5;
}
.selectGoods {
  margin-left: 190px;
  width: 120px;
  height: 30px;
  line-height: 30px;
  text-align: center;
  border: 1px solid #ccc;
  cursor: pointer;
  color: #5a8bff;
}
.addRules {
  display: inline-block;
  width: 95px;
  height: 25px;
  line-height: 25px;
  padding: 0 5px;
  margin-top: -5px;
  border: 1px solid #5a8bff;
  color: #5a8bff;
  border-radius: 4px;
  cursor: pointer;
}
.rules_part {
  border-top: 1px dashed #ccc;
  padding: 10px 0 20px;
}
.footer {
  position: fixed;
  bottom: 0;
  right: 27px;
  left: 160px;
  height: 52px;
  padding: 10px 0;
  z-index: 2;
  background: #f2f2f2;
  text-align: center;
}
.save {
  width: 70px;
  height: 30px;
  line-height: 30px;
  border: none;
  background: #5a8bff;
  color: #fff;
  margin: auto;
  cursor: pointer;
}
.coupon-name >>> .el-input__inner {
  color: #606266 !important;
}
</style>
