<template>
  <div class="content">
    <div class="main">
      <div class="navBox">
        <div class="filters">
          <div class="filters_item">
            <span>{{ $t('storeList.storeGroup') }}：</span>
            <el-select v-model="queryParams.groupId" size="small">
              <el-option
                :label="$t('storeCommon.all')"
                :value="null"
              ></el-option>
              <el-option
                v-for="item in storeGroup"
                :key="item.groupId"
                :label="item.groupName"
                :value="item.groupId"
              ></el-option>
            </el-select>
          </div>
          <!-- <div class="filters_item"><span>{{$t('storeList.isAuthPos')}}：</span>
            <el-select
              v-model="queryParams.isAuthPos"
              size="small"
              @change="initDataList"
            >
              <el-option
                :label="$t('storeCommon.all')"
                selected
                :value="null"
              ></el-option>
              <el-option
                :label="$t('storeCommon.yes')"
                :value="true"
              ></el-option>
              <el-option
                :label="$t('storeCommon.no')"
                :value="false"
              ></el-option>
            </el-select>
          </div> -->
          <div class="filters_item">
            <span>{{ $t('storeList.businessState') }}：</span>
            <el-select v-model="queryParams.businessState" size="small">
              <el-option
                selected
                :label="$t('storeCommon.all')"
                :value="null"
              ></el-option>
              <el-option :label="$t('storeList.open')" :value="1"></el-option>
              <el-option
                :label="$t('storeList.notOpen')"
                :value="0"
              ></el-option>
            </el-select>
          </div>
          <div class="filters_item">
            <span>门店信息：</span>
            <el-input
              v-model="queryParams.keywords"
              size="small"
              style="width: 160px"
              :placeholder="$t('storeList.storeInfoPlaceholder')"
            >
            </el-input>
          </div>
          <div class="filters_item">
            <span>{{ $t('storeList.storePickup') }}：</span>
            <el-select v-model="queryParams.autoPick" size="small">
              <el-option
                :label="$t('storeCommon.all')"
                :value="null"
              ></el-option>
              <el-option
                :label="$t('storeList.turnedOn')"
                :value="1"
              ></el-option>
              <el-option
                :label="$t('storeList.unopened')"
                :value="0"
              ></el-option>
            </el-select>
          </div>
          <div class="filters_item">
            <span>门店配送：</span>
            <el-select v-model="queryParams.storeExpress" size="small">
              <el-option
                :label="$t('storeCommon.all')"
                :value="null"
              ></el-option>
              <el-option
                :label="$t('storeList.turnedOn')"
                :value="1"
              ></el-option>
              <el-option
                :label="$t('storeList.unopened')"
                :value="0"
              ></el-option>
            </el-select>
          </div>
          <div class="filters_item">
            <el-button type="primary" size="small" @click="initDataList"
              >搜索</el-button
            >
          </div>
        </div>
        <div class="navBox-right">
          <el-popover width="300" trigger="hover">
            <p
              style="
                line-height: 20px;
                font-size: 12px;
                padding-bottom: 10px;
                border-bottom: 1px solid #eee;
              "
            >
              体验版最多创建1个门店 ，基础版最多创建5个门店
              ，高级版最多创建10个门店 ，旗舰版最多创建200个门店
            </p>
            <div style="text-align: center; padding-top: 10px">
              <el-button type="primary" size="small" @click="goMore">{{
                $t('storeList.understandMore')
              }}</el-button>
            </div>
            <p
              slot="reference"
              style="
                line-height: 30px;
                color: #999;
                padding: 0 12px;
                margin-bottom: 10px;
                font-size: 12px;
              "
            >
              {{ $t('storeList.currentVersion') }}{{ shopVersionText }}，{{
                $t('storeList.canAlsoCreate')
              }}
              {{ canCreateNum }} {{ $t('storeList.aStore') }}
              <i class="el-icon-question"></i>
            </p>
          </el-popover>
          <div>
            <el-button type="primary" size="small" @click="addStoreHandle"
              >新增门店</el-button
            >
          </div>
        </div>
      </div>
      <div class="table_box">
        <el-table
          v-loading="loading"
          :data="tableData"
          style="width: 100%"
          border
          :header-cell-style="{
            'background-color': '#f5f5f5',
            'text-align': 'center',
            border: 'none',
          }"
          :cell-style="{
            'text-align': 'center',
          }"
        >
          <el-table-column
            prop="storeName"
            :label="$t('storeList.storeName')"
          ></el-table-column>
          <el-table-column
            prop="storeCode"
            :label="$t('storeList.posShopId')"
          ></el-table-column>
          <!-- <el-table-column
            prop="posShopId"
            label="POS门店编号"
          ></el-table-column> -->
          <el-table-column prop="groupName" :label="$t('storeList.groupName')">
          </el-table-column>
          <el-table-column
            prop="address"
            :label="$t('storeList.storeAddress')"
          ></el-table-column>
          <el-table-column
            prop="manager"
            :label="$t('storeList.manager')"
          ></el-table-column>
          <el-table-column
            prop="mobile"
            :label="$t('storeList.mobile')"
          ></el-table-column>
          <el-table-column
            prop="businessHours"
            :label="$t('storeList.businessHours')"
          ></el-table-column>
          <!-- <el-table-column
            v-show="false"
            prop="businessStateName"
            :label="$t('storeList.businessState')"
          >
            <template slot-scope="scope">
              {{scope.row.businessStateName}}
              <a
                @click="closeDown(scope.row.storeId)"
                class="businessStateOperate"
                v-if="scope.row.businessState === 1"
              >{{$t('storeList.closeDown')}}</a>
              <a
                @click="opening(scope.row.storeId)"
                class="businessStateOperate"
                v-else
              >{{$t('storeList.opening')}}</a>
            </template>
          </el-table-column> -->
          <el-table-column :label="$t('storeList.storePickup')" prop="autoPick">
            <template slot-scope="{ row, $index }">
              <div>
                <el-checkbox
                  v-model="row.autoPick"
                  @change="changeState(row, 'autoPick', $index)"
                  :true-label="1"
                  :false-label="0"
                  :disabled="
                    Boolean(
                      deliveryConfig &&
                        deliveryConfig.fetch === 0 &&
                        row.autoPick === 0
                    )
                  "
                ></el-checkbox>
              </div>
            </template>
          </el-table-column>
          <el-table-column label="同城配送" prop="storeExpress">
            <template slot-scope="{ row, $index }">
              <div>
                <el-checkbox
                  v-model="row.storeExpress"
                  @change="changeState(row, 'storeExpress', $index)"
                  :true-label="1"
                  :false-label="0"
                  :disabled="row.storeExpress === 0"
                ></el-checkbox>
              </div>
            </template>
          </el-table-column>
          <el-table-column
            :label="$t('storeList.businessState')"
            prop="businessState"
          >
            <template slot-scope="{ row, $index }">
              <div>
                <el-checkbox
                  v-model="row.businessState"
                  @change="changeState(row, 'businessState', $index)"
                  :true-label="1"
                  :false-label="0"
                ></el-checkbox>
              </div>
            </template>
          </el-table-column>
          <el-table-column
            prop=""
            :label="$t('storeList.purchaseOrderCode')"
          ></el-table-column>

          <el-table-column :label="$t('marketCommon.operate')" width="230px">
            <template slot-scope="scope">
              <div class="operation">
                <el-tooltip
                  class="item"
                  effect="dark"
                  :content="$t('storeCommon.edit')"
                  placement="top"
                >
                  <a @click="edit('edit', scope.row.storeId, scope.row)">{{
                    $t('storeCommon.edit')
                  }}</a>
                </el-tooltip>
                <el-tooltip
                  class="item"
                  effect="dark"
                  :content="$t('storeList.goodsManage')"
                  placement="top"
                >
                  <a
                    @click="edit('goodsManage', scope.row.storeId, scope.row)"
                    >{{ $t('storeList.goodsManage') }}</a
                  >
                </el-tooltip>
                <el-tooltip
                  class="item"
                  effect="dark"
                  :content="$t('storeList.verifierManage')"
                  placement="top"
                >
                  <a
                    @click="
                      edit('verifierManage', scope.row.storeId, scope.row)
                    "
                    >{{ $t('storeList.verifierManage') }}</a
                  >
                </el-tooltip>
                <el-tooltip
                  class="item"
                  effect="dark"
                  :content="$t('storeCommon.delete')"
                  placement="top"
                >
                  <a @click="del(scope.row.storeId)">{{
                    $t('storeCommon.delete')
                  }}</a>
                </el-tooltip>
                <el-tooltip
                  class="item"
                  effect="dark"
                  :content="$t('storeList.storeManage')"
                  placement="top"
                >
                  <a
                    @click="edit('storeManage', scope.row.storeId, scope.row)"
                    >{{ $t('storeList.storeManage') }}</a
                  >
                </el-tooltip>
                <el-tooltip
                  class="item"
                  effect="dark"
                  :content="$t('storeCommon.share')"
                  placement="top"
                >
                  <a @click="edit('share', scope.row.storeId, scope.row)">{{
                    $t('storeCommon.share')
                  }}</a>
                </el-tooltip>
              </div>
            </template>
          </el-table-column>
        </el-table>
        <pagination :page-params.sync="pageParams" @pagination="initDataList" />
      </div>
    </div>

    <!-- 分享 -->
    <shareDialog
      :show="shareDialog"
      :imgPath="shareImg"
      :pagePath="sharePath"
      @close="shareDialog = false"
    />
  </div>
</template>

<script>
import { storeList, allStoreGroup, updateStore, delStore, shareStore, getDeliveryConfig } from '@/api/admin/storeManage/store'
import pagination from '@/components/admin/pagination/pagination'
// 地区编码
import chinaData from '@/assets/china-data'
import shareDialog from '@/components/admin/shareDialog'
export default {
  components: { pagination, shareDialog },
  data () {
    let that = this
    return {
      loading: false,
      langDefaultFlag: false,

      pageParams: {},
      queryParams: {
        groupId: null,
        isAuthPos: null,
        businessState: null,
        autoPick: null,
        cityService: null
      },
      tableData: [],
      storeGroup: [],

      // 表格原始数据
      originalData: [],

      shareImg: '',
      sharePath: '',
      shareDialog: false, // 分享弹窗
      canCreateNum: 0, // 可以创建门店数
      shopVersionText: that.$t('storeList.ultimate'), // 店铺版本
      deliveryConfig: null
    }
  },
  methods: {
    initDataList () {
      this.loading = true

      storeList(Object.assign(this.queryParams, this.pageParams)).then((res) => {
        if (res.error === 0) {
          this.originalData = res.content.storePageListVo.dataList
          let originalData = JSON.parse(JSON.stringify(this.originalData))
          this.handleData(originalData)
          this.pageParams = res.content.storePageListVo.page
          this.canCreateNum = res.content.canCreateNum
          switch (res.content.shopVersion) {
            case 'v1':
              this.shopVersionText = this.$t('storeList.trialVersion')
              break
            case 'v2':
              this.shopVersionText = this.$t('storeList.basicEdition')
              break
            case 'v3':
              this.shopVersionText = this.$t('storeList.preminumEdition')
              break
            default:
              this.shopVersionText = this.$t('storeList.ultimate')
          }
          this.loading = false
        }
      })
    },
    // 表格数据处理/渲染
    handleData (data) {
      data.map((item, index) => {
        item.address = this.getFullAddress(item)
        item.businessHours = (item.openingTime && item.closeTime) ? item.openingTime + ' - ' + item.closeTime : ''
        item.businessStateName = item.businessState === 1 ? this.$t('storeList.open') : this.$t('storeList.notOpen')
      })
      this.tableData = data
      this.langDefaultFlag = true
    },
    initGroupList () {
      allStoreGroup().then((res) => {
        if (res.error === 0) {
          this.storeGroup = res.content.storeGroups
        }
      })
      getDeliveryConfig().then(res => {
        if (res.error === 0) {
          this.deliveryConfig = res.content
        } else {
          this.$message.error(res.message)
        }
      })
    },
    getFullAddress (item) {
      var address = ''

      var province = chinaData.filter(function (area) {
        return area.provinceId === parseInt(item.provinceCode)
      })
      province = province[0]
      address += province.provinceName
      var areaCity = province.areaCity.filter(function (area) {
        return area.cityId === parseInt(item.cityCode)
      })
      areaCity = areaCity[0]
      address += ' ' + areaCity.cityName
      var areaDistrict = areaCity.areaDistrict.filter(function (area) {
        return area.districtId === parseInt(item.districtCode)
      })
      areaDistrict = areaDistrict[0]
      console.log(areaDistrict)
      address += ' ' + (areaDistrict ? areaDistrict.districtName : '') + ' ' + item.address

      return address
    },
    // 歇业
    // closeDown (id) {
    //   var param = {}
    //   param.storeId = id
    //   param.businessState = 0
    //   updateStore(param).then((res) => {
    //     if (res.error === 0) {
    //       this.$message.success({
    //         message: this.$t('marketCommon.successfulOperation')
    //       })
    //       this.initDataList()
    //     }
    //   })
    // },
    // 开业
    // opening (id) {
    //   var param = {}
    //   param.storeId = id
    //   param.businessState = 1
    //   updateStore(param).then((res) => {
    //     if (res.error === 0) {
    //       this.$message.success({
    //         message: this.$t('marketCommon.successfulOperation')
    //       })
    //       this.initDataList()
    //     }
    //   })
    // },
    changeState (row, operate, index) {
      // 根据限制
      console.log(row.autoPick, this.tableData[index].autoPick)
      if (this.deliveryConfig) {
        if (operate === 'autoPick' && this.deliveryConfig.fetch === 0 && row.autoPick === 1) {
          this.$message.warning('基础配置中自提功能未开启，门店不能开启自提功能')
          this.$set(this.tableData[index], 'autoPick', 0)
          this.$set(row, 'autoPick', 0)
          return false
        }
        if (operate === 'cityService' && this.deliveryConfig.cityService === 0 && row.cityService === 1) {
          this.$message.warning('基础配置中同城配送功能未开启，门店不能开启同城配送功能')
          this.$set(this.tableData[index], 'cityService', 0)
          return false
        }
        if (operate === 'storeExpress' && this.deliveryConfig.storeExpress === 0 && row.storeExpress === 1) {
          this.$message.warning('基础配置中同城配送功能未开启，门店不能开启同城配送功能')
          this.$set(this.tableData[index], 'cityService', 0)
          return false
        }
      }
      let params = {
        storeId: row.storeId,
        businessState: row.businessState,
        autoPick: row.autoPick,
        cityService: row.cityService,
        storeExpress: row.storeExpress,
        cityAccountIds: []
      }
      updateStore(params).then((res) => {
        if (res.error === 0) {
          this.$message.success({
            message: this.$t('marketCommon.successfulOperation')
          })
          this.initDataList()
        } else {
          this.$message.error('修改失败')
        }
      })
    },
    // 新增门店
    addStoreHandle () {
      this.$router.push({
        path: '/admin/home/main/store/addStore'
      })
    },
    // 删除门店
    del (id) {
      let param = {
        'storeId': id
      }
      this.$confirm(this.$t('storeList.delStoreTip'), this.$t('marketCommon.tip'), {
        confirmButtonText: this.$t('marketCommon.ok'),
        cancelButtonText: this.$t('marketCommon.cancel'),
        type: 'warning'
      }).then(() => {
        delStore(param).then((res) => {
          if (res.error === 0) {
            this.$message.success({
              message: this.$t('marketCommon.successfulOperation')
            })
            this.initDataList()
          }
        })
      })
    },
    edit (param, id, row) {
      console.log(param, id, row)
      switch (param) {
        case 'edit':
          console.log('edit', row)
          this.$router.push({
            path: '/admin/home/main/store/addStore',
            query: {
              id: id
            }
          })
          break
        case 'goodsManage':
          this.$router.push({
            path: '/admin/home/main/store/goods/list',
            query: {
              name: row.storeName,
              id: id
            }
          })
          break
        case 'verifierManage':
          this.$router.push({
            path: '/admin/home/main/store/verification/list',
            query: {
              id: id
            }
          })
          break
        case 'storeManage':
          this.$router.push({
            path: '/admin/home/main/store/storemanage',
            query: {
              id: id,
              businessHours: row.businessHours,
              businessType: row.businessType,
              businessState: row.businessState
            }
          })
          break
        case 'share':
          this.shareDialog = !this.shareDialog
          shareStore(id).then((res) => {
            if (res.error === 0) {
              this.shareImg = res.content.imageUrl
              this.sharePath = res.content.pagePath
            }
          })
          break
      }
    },
    goMore () {
      this.$router.push({
        path: '/admin/home/main/versionUpgrade',
        query: { mod: '门店列表' }
      })
    }
  },
  watch: {
    // data内变量国际化
    lang () {
      if (this.langDefaultFlag) {
        // 重新渲染表格数据
        let originalData = JSON.parse(JSON.stringify(this.originalData))
        this.handleData(originalData)
      }
    }
  },
  mounted () {
    if (this.$route.query.groupId) {
      this.$set(this.queryParams, 'groupId', Number(this.$route.query.groupId))
    }
    this.langDefault()
    this.initGroupList()
    this.initDataList()
  }

}
</script>

<style lang="scss" scoped>
.main {
  padding: 10px;
  .navBox {
    display: flex;
    width: 100%;
    background-color: #fff;
    padding: 15px;
    .filters {
      flex: 2;
      display: flex;
      flex-wrap: wrap;
      line-height: 32px;
      margin-left: -15px;
      margin-bottom: 10px;
      .filters_item {
        width: 250px;
        display: flex;
        justify-content: flex-start;
        margin-left: 15px;
        margin-bottom: 10px;
        > span {
          font-size: 14px;
          text-align: left;
        }
        .el-select {
          width: 120px;
        }
      }
    }
    .navBox-right {
      flex: 1;
      display: flex;
      justify-content: flex-end;
    }
  }
  .btn {
    margin-left: 5px;
  }

  .table_box {
    margin-top: 10px;
    background-color: #fff;
    padding: 15px;
    .operation {
      display: flex;
      flex-wrap: wrap;
      margin-left: -5px;
      > .item {
        font-size: 14px;
        color: #66b1ff;
        cursor: pointer;
        margin-right: 8px;
      }
    }
    .businessStateOperate {
      font-size: 14px;
      color: #66b1ff;
      cursor: pointer;
    }
    .tapOneblock {
      display: flex;
      justify-content: flex-end;
      margin-top: 10px;
      > span {
        height: 32px;
        line-height: 32px;
      }
    }
  }
}
</style>
