<template>
  <div class="content">
    <div class="main">
      <el-tabs
        v-model="activeName"
        @tab-click="handleClick"
      >
        <el-tab-pane
          :label="$t('groupIntegration.allActivities')"
          name="first"
        >
          <el-button
            type="primary"
            @click="addActivity"
          >{{$t('groupIntegration.addActivities')}}</el-button>
        </el-tab-pane>
        <el-tab-pane
          :label="$t('groupIntegration.processing')"
          name="second"
        >
          <el-button
            type="primary"
            @click="addActivity"
          >{{$t('groupIntegration.addActivities')}}</el-button>
        </el-tab-pane>
        <el-tab-pane
          :label="$t('groupIntegration.notStarted')"
          name="third"
        >
          <el-button
            type="primary"
            @click="addActivity"
          >{{$t('groupIntegration.addActivities')}}</el-button>
        </el-tab-pane>
        <el-tab-pane
          :label="$t('groupIntegration.expired')"
          name="fourth"
        >
          <el-button
            type="primary"
            @click="addActivity"
          >{{$t('groupIntegration.addActivities')}}</el-button>
        </el-tab-pane>
        <el-tab-pane
          :label="$t('groupIntegration.terminated')"
          name="fifth"
        >
          <el-button
            type="primary"
            @click="addActivity"
          >{{$t('groupIntegration.addActivities')}}</el-button>
        </el-tab-pane>
        <el-tab-pane
          :label="sixTitle"
          name="sixth"
          v-if="showSix"
        >
          <integrationAdd
            :isEditId="isEditId"
            @backHome="backHome"
          />
        </el-tab-pane>
      </el-tabs>
    </div>
    <div
      class="table_list"
      v-if="!showSix"
    >
      <el-table
        class="version-manage-table"
        header-row-class-name="tableClss"
        :data="tableData"
        border
        style="width: 100%"
      >
        <el-table-column
          prop="name"
          :label="$t('groupIntegration.name')"
          align="center"
        >

        </el-table-column>
        <el-table-column
          prop="content"
          :label="$t('groupIntegration.content')"
          align="center"
        >
        </el-table-column>
        <el-table-column
          :label="$t('groupIntegration.totalIntegration')"
          align="center"
        >
          <template slot-scope="scope">
            <div>
              <span>{{scope.row.totalIntegration}}</span>
              <br>
              <span>{{scope.row.leftIntegration}}</span>
            </div>
          </template>
        </el-table-column>
        <el-table-column
          prop="actDate"
          :label="$t('groupIntegration.actDate')"
          align="center"
        >
          <template slot-scope="scope">
            {{scope.row.startTime}}<br>至<br>{{scope.row.endTime}}
          </template>
        </el-table-column>
        <el-table-column
          prop="expire"
          :label="$t('groupIntegration.expireStatus')"
          align="center"
          width="80"
          :formatter="formatter"
        >

        </el-table-column>
        <el-table-column
          prop="inteUserSum"
          :label="$t('groupIntegration.inteUserSum')"
          align="center"
        >

        </el-table-column>
        <el-table-column
          prop="inteGroupSum"
          :label="$t('groupIntegration.inteGroupSum')"
          align="center"
        >

        </el-table-column>
        <el-table-column
          prop="useIntegration"
          :label="$t('groupIntegration.useIntegration')"
          align="center"
        >

        </el-table-column>
        <el-table-column
          :label="$t('groupIntegration.options')"
          align="center"
        >
          <template slot-scope="scope">
            <div class="opt">
              <el-tooltip
                :content="$t('groupIntegration.edit')"
                placement="top"
                v-if="scope.row.expire===1||scope.row.expire===2"
              >
                <span
                  class="iconfont iconbianji iconSpan"
                  @click="gotoEdit(scope.row.id)"
                ></span>
              </el-tooltip>
              <el-tooltip
                :content="$t('groupIntegration.share')"
                placement="top"
              >
                <span
                  class="iconfont iconfenxiang1 iconSpan"
                  @click="shareHandle(scope.row.id)"
                ></span>
              </el-tooltip>
              <el-tooltip
                :content="$t('groupIntegration.stop')"
                placement="top"
                v-if="scope.row.expire===1||scope.row.expire===2"
              >
                <span
                  @click="puaseGroupIntegration(scope.row.id)"
                  class="iconfont icontingyong  iconSpan"
                ></span>
              </el-tooltip>
              <el-tooltip
                :content="$t('groupIntegration.statrt')"
                placement="top"
                v-if="scope.row.expire===4"
              >
                <span
                  @click="upGroupIntegration(scope.row.id)"
                  class="iconfont iconqiyong iconSpan"
                ></span>
              </el-tooltip>
              <el-tooltip
                :content="$t('groupIntegration.participationDetails')"
                placement="top"
              >
                <span
                  @click="gotoDetail(scope.row.id)"
                  class="iconfont iconmingxi1 iconSpan"
                ></span>
              </el-tooltip>
              <el-tooltip
                :content="$t('groupIntegration.groupDetails')"
                placement="top"
              >
                <span
                  @click="gotoSuccess(scope.row.id)"
                  class="iconfont iconchengtuanmingxi iconSpan"
                ></span>
              </el-tooltip>
              <el-tooltip
                :content="$t('groupIntegration.delete')"
                placement="top"
                v-if="scope.row.expire===4||scope.row.expire===3"
              >
                <span
                  @click="delGroupIntegration(scope.row.id)"
                  class="iconfont iconshanchu2 iconSpan"
                ></span>
              </el-tooltip>
              <el-tooltip
                :content="$t('groupIntegration.activityPerformanceData')"
                placement="top"
              >
                <span
                  @click="gotoAnalysis(scope.row.id)"
                  class="iconfont iconfankuitongji iconSpan"
                ></span>
              </el-tooltip>
            </div>
          </template>
        </el-table-column>
      </el-table>
      <pagination
        :page-params.sync="pageParams"
        @pagination="seacherGroupIntegrationList"
      />
    </div>
    <shareDialog
      :imgPath="shareImgPath"
      :pagePath="sharePagePath"
      :show="shareDialogShow"
      @close="shareDialogShow=false"
    />
  </div>
</template>
<script>
import { groupIntegrationList, changeGroupIntegrationStatus, delGroupIntegration, shareActivity } from '@/api/admin/marketManage/groupIntegrationList.js'
import shareDialog from '@/components/admin/shareDialog'
import pagination from '@/components/admin/pagination/pagination'
import integrationAdd from './groupIntegrationInfo'
export default {
  components: {
    shareDialog, pagination, integrationAdd
  },
  data () {
    return {
      type: 0,
      activeName: 'second',
      shareImgPath: '',
      sharePagePath: '',
      shareDialogShow: false,
      tableData: [],
      pageParams: {
      },
      showSix: false,
      isEditId: 0,
      sixTitle: this.$t('groupIntegration.addActivities')
    }
  },
  mounted () {
    if (this.$route.params.calenderAdd) {
      this.addActivity()
    } else if (this.$route.params.calenderEdit) {
      this.gotoEdit(this.$route.params.id)
    }
    // 初始化数据
    this.langDefault()
    let params = {
      'index': 1
    }
    this.handleClick(params)
    // this.seacherGroupIntegrationList()
  },
  methods: {

    handleClick (e) {
      this.type = parseInt(e.index)
      this.pageParams.currentPage = 1
      if (this.activeName === 'sixth') {
        this.showSix = true
      } else {
        this.showSix = false
      }
      this.seacherGroupIntegrationList()
    },
    seacherGroupIntegrationList () {
      this.pageParams.type = this.type
      groupIntegrationList(this.pageParams).then((res) => {
        console.log(res)
        if (res.error === 0) {
          this.handleData(res.content.dataList)
          this.pageParams = res.content.page
        }
      })
    },
    // 对过期状态值设置对应显示
    formatter (row, column) {
      let expire = row.expire
      if (expire === 1) {
        return this.$t('groupIntegration.processing')
      } else if (expire === 2) {
        return this.$t('groupIntegration.notStarted')
      } else if (expire === 3) {
        return this.$t('groupIntegration.expired')
      } else if (expire === 4) {
        return this.$t('groupIntegration.terminated')
      }
    },
    // 表格数据处理
    handleData (data) {
      data.map((item, index) => {
        item.content = `${item.limitAmount}` + this.$t('groupIntegration.tip1') + `${item.inteGroup}`
        item.totalIntegration = `${item.inteTotal}` + this.$t('groupIntegration.tip2')
        item.leftIntegration = this.$t('groupIntegration.tip3') + `：${item.inteRemain}` + this.$t('groupIntegration.tip2')
        // item.actDate = `${item.startTime}至${item.endTime}`
        // item.expire = this.getExpireString(item.expire)
      })
      this.tableData = data
    },

    // 停用瓜分积分活动
    puaseGroupIntegration (id) {
      this.$alert(this.$t('groupIntegration.stopTip1') + '?', this.$t('groupIntegration.stopTip2'), {
        confirmButtonText: this.$t('groupIntegration.ok'),
        cancelButtonText: this.$t('groupIntegration.cancle'),
        type: 'warning'
      }).then(() => {
        let data = {
          'id': id,
          'status': 0
        }
        changeGroupIntegrationStatus(data).then(res => {
          console.log(res)
          if (res.error === 0) {
            this.$message.success(this.$t('groupIntegration.stopTip3'))
            this.seacherGroupIntegrationList()
          } else {
            this.$message.error(this.$t('groupIntegration.stopTip4'))
          }
        })
      })
    },
    // 启用瓜分积分活动
    upGroupIntegration (id) {
      this.$alert(this.$t('groupIntegration.statertTip1') + '?', this.$t('groupIntegration.stopTip2'), {
        confirmButtonText: this.$t('groupIntegration.ok'),
        cancelButtonText: this.$t('groupIntegration.cancle'),
        type: 'warning'
      }).then(() => {
        let data = {
          'id': id,
          'status': 1
        }
        changeGroupIntegrationStatus(data).then(res => {
          console.log(res)
          if (res.error === 0) {
            this.$message.success(this.$t('groupIntegration.statertTip2'))
            this.seacherGroupIntegrationList()
          } else {
            this.$message.error(this.$t('groupIntegration.statertTip3'))
          }
        })
      })
    },
    // 删除瓜分积分活动
    delGroupIntegration (id) {
      this.$alert(this.$t('groupIntegration.delTip1') + '?', this.$t('groupIntegration.stopTip2'), {
        confirmButtonText: this.$t('groupIntegration.ok'),
        cancelButtonText: this.$t('groupIntegration.cancle'),
        type: 'warning'
      }).then(() => {
        delGroupIntegration(id).then(res => {
          if (res.error === 0) {
            this.$message.success(this.$t('groupIntegration.delTip2'))
            this.seacherGroupIntegrationList()
          } else {
            this.$message.error(this.$t('groupIntegration.delTip3'))
          }
        })
      })
    },
    // 增加瓜分积分活动
    addActivity () {
      // this.$router.push({
      //   name: 'group_integration_add'
      // })
      this.isEditId = 0
      this.showSix = true
      this.activeName = 'sixth'
    },
    // 分享活动
    shareHandle (id) {
      shareActivity(id).then(res => {
        if (res.error === 0) {
          this.shareImgPath = res.content.imgUrl
          this.sharePagePath = res.content.pageUrl
          this.shareDialogShow = true
        }
      })
    },
    // 编辑活动
    gotoEdit (id) {
      // this.$router.push(`/admin/home/main/integration/edit/${id}`)
      this.sixTitle = this.$t('groupIntegration.eidtActivity')
      this.showSix = true
      this.isEditId = id
      this.activeName = 'sixth'
    },

    // 前往参与瓜分积分活动的用户明细页面
    gotoDetail (id) {
      this.$router.push(`/admin/home/main/integration/detail/${id}`)
    },
    // 前往成团明细页面
    gotoSuccess (id) {
      this.$router.push(`/admin/home/main/integration/success/${id}`)
    },
    gotoAnalysis (id) {
      console.log('活动效果数据' + id)
      this.$router.push(`/admin/home/main/integration/analysis/${id}`)
    },
    backHome (data) {
      if (data.flag === 6) {
        this.showSix = false
        this.activeName = 'first'
        this.type = 0
        this.seacherGroupIntegrationList()
      }
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
    padding: 10px 20px 10px 20px;
  }
}
.condition {
  position: relative;
  background-color: #fff;
  padding: 10px 20px 0 20px;
}
.p_top_right {
  display: flex;
  /deep/ .el-button {
    padding: none;
    height: 32px;
  }
  span {
    white-space: nowrap;
    height: 32px;
    line-height: 32px;
    margin-right: 10px;
  }
  .topRightDiv {
    &:nth-of-type(2) {
      margin: 0 10px 0 30px;
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
.table_list {
  position: relative;
  margin-top: 10px;
  background-color: #fff;
  padding: 10px 20px 0 20px;
}
.paginationfooter {
  padding: 20px 0 20px 20px;
  display: flex;
  justify-content: flex-end;
  span {
    display: block;
    height: 32px;
    line-height: 32px;
  }
}
.opt {
  text-align: left;
  color: #5a8bff;
  span {
    cursor: pointer;
  }
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
.iconSpan {
  font-size: 22px;
  color: #5a8bff;
  cursor: pointer !important;
  margin-top: 5px;
}
</style>
