<template>
  <div class="content">
    <div class="main">
      <el-tabs
        v-model="tabSwitch"
        @tab-click="initDataList"
      >
        <el-tab-pane
          v-for="item in tabInfo"
          :key="item.name"
          :label="item.title"
          :name="item.name"
        >
          <el-button
            type="primary"
            size="medium"
            v-if="tableListView"
            @click="addPolicy"
          >{{ $t('distribution.AddRebateStrategy') }}</el-button>
        </el-tab-pane>
      </el-tabs>
    </div>

    <!-- 添加 / 编辑 -->
    <addPolicy
      :isEdite="isEdite"
      :editId="editId"
      :status="status"
      v-if="tableListView===false"
      @addPolicySubmit="addPolicySubmit"
    />

    <div
      class="table_list"
      v-if="tableListView"
    >
      <el-table
        header-row-class-name="tableClss"
        :data="tableData"
        border
        style="width: 100%"
      >
        <template slot="empty">
          <tableEmpty />
        </template>
        <el-table-column
          prop="strategyName"
          :label="$t('distribution.strategyName')"
          align="center"
        >
        </el-table-column>

        <el-table-column
          :label="$t('distribution.strategyValidity')"
          align="center"
        >
          <template slot-scope="scope">
            {{scope.row.startTime}}<br>至<br>{{scope.row.endTime}}
          </template>
        </el-table-column>

        <el-table-column
          prop="fanliRatioRate"
          :label="$t('distribution.ratioRate')"
          align="center"
        >
        </el-table-column>

        <el-table-column
          prop="strategyLevel"
          :label="$t('distribution.strategyLevel')"
          align="center"
        >
        </el-table-column>

        <el-table-column
          prop="createTime"
          :label="$t('distribution.strategyCreateTime')"
          align="center"
        >
        </el-table-column>

        <el-table-column
          prop="statusText"
          :label="$t('distribution.strategyStatus')"
          align="center"
        >
        </el-table-column>

        <el-table-column
          :label="$t('distribution.strategyOption')"
          align="center"
        >
          <template slot-scope="scope">
            <el-tooltip
              :content="$t('seckill.edit')"
              placement="top"
              v-if="scope.row.currentState === 1 || scope.row.currentState === 2"
            >
              <span
                style="font-size: 22px;color: #5a8bff;"
                class="iconfont iconbianji"
                @click="editHandler(scope.row.id)"
              ></span>
            </el-tooltip>
            <el-tooltip
              :content="$t('seckill.delete')"
              placement="top"
              v-if="scope.row.currentState !== 1"
            >
              <span
                style="font-size: 22px;color: #5a8bff;"
                class="iconfont iconshanchu2"
                @click="deleteHandler(scope.row.id)"
              ></span>
            </el-tooltip>
            <el-tooltip
              :content="$t('seckill.stop')"
              placement="top"
              v-if="scope.row.currentState === 1 || scope.row.currentState === 2"
            >
              <span
                style="font-size: 22px;color: #5a8bff;"
                class="iconfont icontingyong"
                @click="stopHandler(scope.row.id)"
              ></span>
            </el-tooltip>
            <el-tooltip
              :content="$t('seckill.start')"
              placement="top"
              v-if="scope.row.currentState === 4"
            >
              <span
                style="font-size: 22px;color: #5a8bff;"
                class="iconfont iconqiyong"
                @click="startHandler(scope.row.id)"
              ></span>
            </el-tooltip>
            <el-tooltip
              :content="$t('distribution.strategyView')"
              placement="top"
              v-if="scope.row.currentState === 3"
            >
              <span
                style="font-size: 22px;color: #5a8bff;"
                class="iconfont iconchakanxiangqing"
                @click="viewHandler(scope.row.id)"
              ></span>
            </el-tooltip>
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
import pagination from '@/components/admin/pagination/pagination.vue'
import addPolicy from './policyAdd.vue'
import { getPolicyList, deletePolicy, stopPolicy, startPolicy } from '@/api/admin/marketManage/distribution.js'
export default {
  components: {
    pagination,
    addPolicy
  },
  data () {
    return {
      // tabs
      tableListView: true, // tab显示隐藏
      tabSwitch: '1',
      tabInfo: [],
      tableData: [], // 表格数据
      pageParams: {}, // 分页
      requestParams: {},
      editId: '', // 编辑的活动id
      isEdite: true, // 编辑状态
      status: true // 状态 (true未过期, false已过期)
    }
  },
  watch: {
    lang () {
      this.tabInfo = this.$t('distribution.policyTabInfo')
    }
  },
  mounted () {
    // 初始化数据
    this.langDefault()
    this.initDataList()
  },
  methods: {
    // 返利列表
    initDataList () {
      this.requestParams.nav = Number(this.tabSwitch)
      this.requestParams.currentPage = this.pageParams.currentPage
      this.requestParams.pageRows = this.pageParams.pageRows
      this.closeTabAddGroup()
      getPolicyList(this.requestParams).then((res) => {
        if (res.error === 0) {
          this.tableData = res.content.dataList
          this.pageParams = res.content.page
          // 表格数据处理
          this.tableData.map((item, index) => {
            if (item.status === 0) {
              item.status = 1 // 启用
            } else {
              item.status = 0 // 停用
            }

            item.fanliRatioRate = `${item.fanliRatio}` + `%`

            // 状态判断
            var startTime = new Date(item.startTime).getTime()
            var endTime = new Date(item.endTime).getTime()
            var nowTime = new Date().getTime()
            if (item.status === 1) {
              if ((nowTime >= startTime) && (nowTime <= endTime)) {
                // 进行中
                item.currentState = 1
              } else if (nowTime < startTime) {
                // 未开始
                item.currentState = 2
              } else if (nowTime > endTime) {
                // 已过期
                item.currentState = 3
              }
            } else {
              // 已停用
              item.currentState = 4
            }
            item.statusText = this.getActStatusString(item.currentState)
          })
        }
      })
    },

    // 添加
    addPolicy () {
      this.isEdite = false
      this.status = true
      this.showTabAddGroup(this.$t('distribution.addRebateStrategy'))
    },

    // 编辑
    editHandler (id) {
      this.editId = id
      this.isEdite = true
      this.status = true
      this.showTabAddGroup(this.$t('distribution.editRebateStrategy'))
    },

    // 查看
    viewHandler (id) {
      this.editId = id
      this.isEdite = true
      this.status = false
      this.showTabAddGroup(this.$t('distribution.editRebateStrategy'))
    },

    // 保存
    addPolicySubmit () {
      this.tabSwitch = '1'
      this.initDataList()
    },

    // 删除
    deleteHandler (id) {
      this.$confirm(this.$t('seckill.deleteTip'), {
        confirmButtonText: this.$t('seckill.sure'),
        cancelButtonText: this.$t('seckill.cancel'),
        type: 'warning'
      }).then(() => {
        deletePolicy(id).then((res) => {
          if (res.error === 0) {
            this.$message.success({ message: '删除成功!' })
            this.initDataList()
          }
        })
      }).catch(() => {
        this.$message.warning({ message: '删除失败!' })
      })
    },

    // 启用
    startHandler (id) {
      this.$confirm(this.$t('seckill.startTip'), {
        confirmButtonText: this.$t('seckill.sure'),
        cancelButtonText: this.$t('seckill.cancel'),
        type: 'warning'
      }).then(() => {
        startPolicy(id).then((res) => {
          if (res.error === 0) {
            this.$message.success({ message: this.$t('seckill.startSuccess') })
            this.initDataList()
          }
        })
      }).catch(() => {
        this.$message.info({ message: this.$t('seckill.startFail') })
      })
    },

    // 停用
    stopHandler (id) {
      this.$confirm(this.$t('seckill.stopTip'), {
        confirmButtonText: this.$t('seckill.sure'),
        cancelButtonText: this.$t('seckill.cancel'),
        type: 'warning'
      }).then(() => {
        stopPolicy(id).then((res) => {
          if (res.error === 0) {
            this.$message.success({ message: this.$t('seckill.stopSuccess') })
            this.initDataList()
          }
        })
      }).catch(() => {
        this.$message.info({ message: this.$t('seckill.stopFail') })
      })
    },

    showTabAddGroup (title) {
      if (this.tabSwitch === '6' || this.tabInfo.length > 5) {
        this.closeTabAddGroup()
      }
      this.tabInfo.push({
        title: title,
        name: '6'
      })
      this.tabSwitch = '6'
      this.tableListView = false
    },

    closeTabAddGroup () {
      // 新增标签
      if (this.tabSwitch === '6') {
        return
      }
      // 不是新增
      if (this.tabInfo.length > 5) {
        this.tableListView = true
        this.tabInfo.pop({
          title: '编辑返利策略',
          name: '6'
        })
        console.log('closeTabAddGroup', this.tabInfo)
      }
      return this.tabInfo
    }

  }

}

</script>
<style lang="scss" scoped>
@import "@/assets/aliIcon/iconfont.scss";
.option {
  color: #5a8bff;
  cursor: pointer;
}
.content {
  padding: 10px;
  min-width: 100%;
  font-size: 14px;
  height: 100%;
  .main {
    position: relative;
    background-color: #fff;
  }
}
.content /deep/ .el-tabs__nav-wrap {
  border: none;
}
/deep/ .tableClss th {
  background-color: #f5f5f5;
  border: none;
  height: 36px;
  font-weight: bold;
  color: #000;
  padding: 8px 10px;
}
.table_list {
  position: relative;
  margin-top: 10px;
  background-color: #fff;
  padding: 10px 0px 10px;
  .footer_right {
    padding: 20px 0 20px 20px;
    display: flex;
    justify-content: flex-end;
    span {
      display: block;
      height: 32px;
      line-height: 32px;
    }
  }
}
</style>
