<template>
  <div class="content">

    <!-- tab -->
    <div class="main">
      <el-tabs
        v-model="tabSwitch"
        @tab-click="initDataList"
        :lazy="true"
      >
        <el-tab-pane
          v-for="(item, index) in tabInfo"
          :key="index"
          :label="item.title"
          :name="item.name"
        >
          <el-row
            :gutter="20"
            type="flex"
          >
            <el-col
              :span="10"
              style="height:30px;line-height: 30px;font-size: 14px;"
            >{{ $t('gift.activityName') + '：' }}</el-col>
            <el-input
              :span="3"
              clearable
              v-model="activityName"
              style="margin-left:-20px;"
              size="small"
              :placeholder="$t('gift.searchTip')"
            ></el-input>
            <el-col :span="3">
              <el-button
                type="primary"
                @click="initDataList"
                size="small"
              >{{ $t('gift.search') }}</el-button>
            </el-col>
            <el-col
              :span="4"
              :offset="15"
            >
              <el-button
                type="primary"
                size="small"
                @click="gotoAddGift"
              >{{ $t('gift.addGift') }}</el-button>
            </el-col>

          </el-row>

        </el-tab-pane>
      </el-tabs>
    </div>

    <div class="giftCondition">
      <span>赠品叠加：当买家满足多个活动的赠品条件时，</span>
      <el-radio
        v-model="cfg"
        :label=1
      >只赠送其中优先级最高的活动赠品</el-radio>
      <el-radio
        v-model="cfg"
        :label=0
      >赠送满足赠品条件的所有赠品</el-radio>
      <el-button
        type="primary"
        size="small"
        @click="setGiftConfig"
      >保存设置</el-button>
    </div>

    <!-- 表格 -->
    <div class="table_list">
      <el-table
        class="version-manage-table"
        header-row-class-name="tableClss"
        :data="tableData"
        border
        style="width: 100%"
      >
        <el-table-column
          prop="name"
          :label="$t('gift.activityName')"
          align="center"
        >
        </el-table-column>
        <el-table-column
          prop="validity"
          :label="$t('gift.validDate')"
          align="center"
        >
          <template slot-scope="scope">
            {{scope.row.startTime}}<br>至<br>{{scope.row.endTime}}
          </template>
        </el-table-column>
        <el-table-column
          prop="level"
          :label="$t('gift.level')"
          align="center"
        >
          <template slot-scope="scope">
            <inputEdit
              v-model="scope.row.level"
              @update="updateGiftLevel(scope.row.id, scope.row.level, arguments)"
            />
            <!-- @update="updateGiftLevel(scope.row.id, scope.row.level)" -->
          </template>
        </el-table-column>
        <el-table-column
          prop="giftTimes"
          :label="$t('gift.giftTimes')"
          align="center"
        >
        </el-table-column>
        <el-table-column
          prop="statusText"
          :label="$t('gift.activityStatus')"
          align="center"
        >
        </el-table-column>
        <el-table-column
          :label="$t('gift.option')"
          align="center"
        >
          <template slot-scope="scope">
            <el-row>
              <el-tooltip
                :content="$t('gift.edit')"
                placement="top"
                v-if="scope.row.currentState === 2 || scope.row.currentState === 1"
              >
                <i
                  @click="editGift(scope.row.id)"
                  class="iconfont iconbianji"
                  style="font-size: 22px;color: #5a8bff;"
                ></i>
              </el-tooltip>
              <el-tooltip
                :content="$t('gift.stop')"
                placement="top"
                v-if="scope.row.currentState === 2 || scope.row.currentState === 1"
              >
                <i
                  @click="disableGift(scope.row.id)"
                  class="iconfont icontingyong"
                  style="font-size: 22px;color: #5a8bff;"
                ></i>
              </el-tooltip>
              <el-tooltip
                :content="$t('gift.start')"
                placement="top"
                v-if="scope.row.currentState === 4"
              >
                <i
                  @click="enableGift(scope.row.id)"
                  class="iconfont iconqiyong"
                  style="font-size: 22px;color: #5a8bff;"
                ></i>
              </el-tooltip>
              <el-tooltip
                :content="$t('gift.detail')"
                placement="top"
              >
                <i
                  @click="gotoGiftDetail(scope.row.id)"
                  class="iconfont iconmingxi1"
                  style="font-size: 22px;color: #5a8bff;"
                ></i>
              </el-tooltip>
              <el-tooltip
                class="item"
                :content="$t('gift.delete')"
                placement="top"
                v-if="scope.row.currentState !== 1"
              >
                <i
                  @click="deleteGift(scope.row.id)"
                  class="iconfont iconshanchu2"
                  style="font-size: 22px;color: #5a8bff;"
                ></i>
              </el-tooltip>
            </el-row>
          </template>
        </el-table-column>
      </el-table>
      <pagination
        :page-params.sync="pageParams"
        @pagination="initDataList"
      />
    </div>

  </div>
</template>
<script>
// 引入组件
import inputEdit from '@/components/admin/inputEdit'
import pagination from '@/components/admin/pagination/pagination.vue'
import { giftList, deleteGift, disableGift, enableGift, updateGiftLevel, queryGiftConfig, giftConfig } from '@/api/admin/marketManage/gift'

export default {

  components: {
    inputEdit,
    pagination
  },
  data () {
    return {
      tabSwitch: '1',
      tabInfo: this.$t('gift.tabInfo'),
      activityName: '', // 活动名称
      tableData: [], // 表格数据
      pageParams: {}, // 分页
      requestParams: {},
      cfg: ''
    }
  },
  watch: {
    lang () {
      this.tabInfo = this.$t('gift.tabInfo')
      this.initDataList()
    }
  },
  mounted () {
    // 初始化数据
    this.langDefault()
    this.initDataList()
    if (this.$route.params.calenderEdit) {
      this.editGift(this.$route.params.id)
    }
  },
  methods: {
    // 赠品列表
    initDataList () {
      this.requestParams.name = this.activityName
      this.requestParams.status = Number(this.tabSwitch)
      this.requestParams.currentPage = this.pageParams.currentPage
      this.requestParams.pageRows = this.pageParams.pageRows
      giftList(this.requestParams).then(res => {
        if (res.error === 0) {
          this.tableData = res.content.dataList
          this.pageParams = res.content.page
          this.tableData.map((item, index) => {
            item.statusText = this.getActStatusString(item.currentState)
            item.giftTimes = item.giftTimes ? item.giftTimes : 0
          })
        }
      })
      queryGiftConfig().then((res) => {
        console.log(res)
        if (res.error === 0) {
          this.cfg = res.content
          console.log(this.cfg, 'cfg--')
        }
      }).catch(err => console.log(err))
    },

    // 修改活动优先级
    updateGiftLevel (id, level, data) {
      updateGiftLevel({ id, level }).then((res) => {
        if (res.error === 0) {
          this.$message.success({ message: this.$t('gift.editSuccess') })
          this.initDataList()
        }
      })
    },

    // 删除
    deleteGift (id) {
      this.$confirm(this.$t('seckill.deleteTip'), {
        confirmButtonText: this.$t('seckill.sure'),
        cancelButtonText: this.$t('seckill.cancel'),
        type: 'warning'
      }).then(() => {
        deleteGift(id).then((res) => {
          if (res.error === 0) {
            this.initDataList()
            this.$message.success({ message: this.$t('seckill.deleteSuccess') })
          }
        })
      }).catch(() => {
        this.$message.info({ message: this.$t('seckill.deleteFail') })
      })
    },

    // 停用
    disableGift (id) {
      this.$confirm(this.$t('seckill.stopTip'), {
        confirmButtonText: this.$t('seckill.sure'),
        cancelButtonText: this.$t('seckill.cancel'),
        type: 'warning'
      }).then(() => {
        disableGift(id).then((res) => {
          if (res.error === 0) {
            this.initDataList()
            this.$message.success({ message: this.$t('seckill.stopSuccess') })
          }
        })
      }).catch(() => {
        this.$message.info({ message: this.$t('seckill.stopFail') })
      })
    },

    // 启用
    enableGift (id) {
      this.$confirm(this.$t('seckill.startTip'), {
        confirmButtonText: this.$t('seckill.sure'),
        cancelButtonText: this.$t('seckill.cancel'),
        type: 'warning'
      }).then(() => {
        enableGift(id).then((res) => {
          if (res.error === 0) {
            this.initDataList()
            this.$message.success({ message: this.$t('seckill.startSuccess') })
          }
        })
      }).catch(() => {
        this.$message.info({ message: this.$t('seckill.startFail') })
      })
    },

    // 跳转创建赠品页
    gotoAddGift () {
      this.$router.push('/admin/home/main/gift/add')
    },
    // 跳转编辑活动页
    editGift (id) {
      this.$router.push(`/admin/home/main/gift/add/${id}`)
    },
    // 跳转赠送明细页
    gotoGiftDetail (id) {
      this.$router.push(`/admin/home/main/gift/giftDetail/${id}`)
    },

    setGiftConfig () {
      giftConfig(this.cfg).then((res) => {
        console.log(res)
        if (res.error === 0) {
          this.$message.success('设置成功')
        } else {
          this.$message.warning('设置失败')
        }
      }).catch(err => console.log(err))
    }
  }
}
</script>
<style lang="scss" scoped>
@import "@/assets/aliIcon/iconfont.scss";
.content {
  padding: 10px;
  min-width: 100%;
  font-size: 14px;
  height: 100%;
  .main {
    position: relative;
    background-color: #fff;
    padding: 15px;
    .wrapper {
      .el-button {
        margin-left: 5px;
      }
    }
  }
}
/deep/ .tableClss th {
  background-color: #f5f5f5;
  border: none;
  height: 36px;
  font-weight: bold;
  color: #000;
  padding: 8px 10px;
}
.giftCondition {
  padding: 15px 20px;
  margin: 10px 0;
  background: #fff;
}
.table_list {
  position: relative;
  margin-top: 10px;
  background-color: #fff;
  padding: 15px;
}
.balanceDialo .el-dialog__body {
  padding-bottom: 0 !important;
}
.balanceDialo .el-dialog__footer {
  border-top: 1px solid #eee;
}
.setUpDialog .el-dialog__body {
  padding-top: 10px !important;
}
.add_coupon {
  float: left;
  margin-left: 65%;
}
.footer {
  padding: 20px 0 20px 20px;
  display: flex;
  justify-content: flex-end;
  span {
    display: block;
    height: 32px;
    line-height: 32px;
    float: left;
  }
}
.search_content {
  width: 220px;
}
.opt {
  text-align: left;
  color: #5a8bff;
  span {
    cursor: pointer;
  }
}
</style>
