<template>
  <div class="scheduling_page">
    <div class="order_container">
      <div class="order_header">
        <addSheduling
          :businessHours="businessHours"
          :storeId="storeId"
        ></addSheduling>
        <span class="tips">{{businessType == 1? $t('schedulingManage.businessHoursTip') : '工作日'}} {{businessHours}}</span>
      </div>
      <div class="order_content">
        <div class="week_picker_wrap">
          <WeekPicker
            ref="weekPicker"
            :startDate.sync="queryParams.beginTime"
            :endDate.sync="queryParams.endTime"
            @change="weekChangeHandle"
          ></WeekPicker>
          <span
            class="reload_week"
            @click="resetWeek"
          >{{$t('schedulingManage.thisWeek')}}</span>
        </div>
        <el-table
          ref="schedulingTable"
          :data="tableData"
          class="tableClass"
          max-height="500"
          border
          :header-cell-style="{
            'background-color':'#f5f5f5',
            'border':'none'
          }"
        >
          <el-table-column
            :label="$t('schedulingManage.technician')"
            prop="technicianName"
          >
          </el-table-column>
          <el-table-column
            :label="$t('schedulingManage.Monday')"
            prop="monday"
          >
            <template slot-scope="{row}">
              <div>
                <p class="iconSpan">{{row.monday.scheduleName}}</p>
                <p v-if="row.monday.begcreateTime">{{row.monday.begcreateTime}} - {{row.monday.endTime}}</p>
              </div>
            </template>
          </el-table-column>
          <el-table-column
            :label="$t('schedulingManage.Tuesday')"
            prop="tuesday"
          >
            <template slot-scope="{row}">
              <div>
                <p class="iconSpan">{{row.tuesday.scheduleName}}</p>
                <p v-if="row.tuesday.begcreateTime">{{row.tuesday.begcreateTime}} - {{row.tuesday.endTime}}</p>
              </div>
            </template>
          </el-table-column>
          <el-table-column
            :label="$t('schedulingManage.Wednesday')"
            prop="wednesday"
          >
            <template slot-scope="{row}">
              <div>
                <p class="iconSpan">{{row.wednesday.scheduleName}}</p>
                <p v-if="row.wednesday.begcreateTime">{{row.wednesday.begcreateTime}} - {{row.wednesday.endTime}}</p>
              </div>
            </template>
          </el-table-column>
          <el-table-column
            :label="$t('schedulingManage.Thursday')"
            prop="thursday"
          >
            <template slot-scope="{row}">
              <div>
                <p class="iconSpan">{{row.thursday.scheduleName}}</p>
                <p v-if="row.thursday.begcreateTime">{{row.thursday.begcreateTime}} - {{row.thursday.endTime}}</p>
              </div>
            </template>
          </el-table-column>
          <el-table-column
            :label="$t('schedulingManage.Friday')"
            prop="friday"
          >
            <template slot-scope="{row}">
              <div>
                <p class="iconSpan">{{row.friday.scheduleName}}</p>
                <p v-if="row.friday.begcreateTime">{{row.friday.begcreateTime}} - {{row.friday.endTime}}</p>
              </div>
            </template>
          </el-table-column>
          <el-table-column
            :label="$t('schedulingManage.Saturday')"
            prop="saturday"
          >
            <template slot-scope="{row}">
              <div>
                <p class="iconSpan">{{row.saturday.scheduleName}}</p>
                <p v-if="row.saturday.begcreateTime">{{row.saturday.begcreateTime}} - {{row.saturday.endTime}}</p>
              </div>
            </template>
          </el-table-column>
          <el-table-column
            :label="$t('schedulingManage.Sunday')"
            prop="sunday"
          >
            <template slot-scope="{row}">
              <div>
                <p class="iconSpan">{{row.sunday.scheduleName}}</p>
                <p v-if="row.sunday.begcreateTime">{{row.sunday.begcreateTime}} - {{row.sunday.endTime}}</p>
              </div>
            </template>
          </el-table-column>
          <el-table-column
            :label="$t('schedulingManage.operate')"
            prop="operate"
            align="center"
          >
            <template>
              <div>
                <editTechnicianscheduling
                  :storeId="storeId"
                  :technicianId="technicianId"
                  :beginTime="queryParams.beginTime"
                  :businessType="businessType"
                  :datas="tableData[0]"
                  @change="initDataList"
                ></editTechnicianscheduling>
              </div>
            </template>
          </el-table-column>
        </el-table>
      </div>
    </div>
  </div>
</template>

<script>
import { getScheduleList } from '@/api/admin/storeManage/schedulingManage'
import WeekPicker from '@/components/admin/weekPicker'
import addSheduling from './addSheduling'
import editTechnicianscheduling from './editTechnicianscheduling'

export default {
  components: { WeekPicker, addSheduling, editTechnicianscheduling },
  data () {
    return {
      storeId: '',
      businessHours: '', // 营业时间
      businessType: 1, // 工作日0，还是每天1
      technicianId: null, // 技师id
      technicianName: '', // 技师名称
      queryParams: {
        beginTime: '',
        endTime: ''
      },
      tableData: [{
        technicianName: '',
        monday: {
          scheduleName: this.$t('schedulingManage.noShift')
        },
        tuesday: {
          scheduleName: this.$t('schedulingManage.noShift')
        },
        wednesday: {
          scheduleName: this.$t('schedulingManage.noShift')
        },
        thursday: {
          scheduleName: this.$t('schedulingManage.noShift')
        },
        friday: {
          scheduleName: this.$t('schedulingManage.noShift')
        },
        saturday: {
          scheduleName: this.$t('schedulingManage.noShift')
        },
        sunday: {
          scheduleName: this.$t('schedulingManage.noShift')
        }
      }]
    }
  },
  created () {
    this.storeId = this.$route.query.id
    this.businessHours = this.$route.query.businessHours
    this.businessType = this.$route.query.businessType
    this.technicianId = this.$route.query.technicianId
    this.technicianName = this.$route.query.technicianName
    this.langDefault()
    this.$set(this.tableData[0], 'technicianName', this.technicianName)
  },
  methods: {
    initDataList () {
      // 先初始化表格数据
      this.initTableData()
      let params = Object.assign({
        storeId: Number(this.storeId),
        technicianId: Number(this.technicianId)
      }, this.queryParams)
      getScheduleList(params).then(res => {
        if (res.error === 0) {
          if (res.content.length > 0) {
            res.content.forEach(item => {
              // 遍历返回值：workDate - queryParams.beginTime
              let workDate = new Date(item.workDate)
              let startDate = new Date(this.queryParams.beginTime)
              let oneDayTime = 24 * 60 * 60 * 1000
              switch (Math.floor((workDate - startDate) / oneDayTime)) {
                case -1:
                  this.$set(this.tableData[0], 'monday', item)
                  break
                case 0:
                  this.$set(this.tableData[0], 'tuesday', item)
                  break
                case 1:
                  this.$set(this.tableData[0], 'wednesday', item)
                  break
                case 2:
                  this.$set(this.tableData[0], 'thursday', item)
                  break
                case 3:
                  this.$set(this.tableData[0], 'friday', item)
                  break
                case 4:
                  this.$set(this.tableData[0], 'saturday', item)
                  break
                case 5:
                  this.$set(this.tableData[0], 'sunday', item)
                  break
              }
            })
          }
        }
      })
    },
    initTableData () {
      let data = this.tableData[0]
      for (const key in data) {
        if (data.hasOwnProperty(key) && key !== 'technicianName') {
          this.$set(data, key, {
            scheduleName: this.$t('schedulingManage.noShift')
          })
        }
      }
    },
    // 初始化时也会调用
    weekChangeHandle () {
      this.initDataList()
    },
    resetWeek () {
      this.$refs.weekPicker.initDate()
    }
  }
}
</script>

<style lang="scss" scoped>
.scheduling_page {
  padding: 10px;
  font-size: 14px;
  .order_container {
    padding: 0 20px 20px;
    background: #fff;
    .order_header {
      display: flex;
      line-height: 30px;
      padding: 18px 0;
      border-bottom: 1px solid #eee;
      .tips {
        margin-left: 10px;
      }
    }
    .order_content {
      .week_picker_wrap {
        position: relative;
        display: flex;
        justify-content: center;
        align-items: center;
        width: 100%;
        padding: 25px 0;
        .reload_week {
          position: absolute;
          right: 10px;
          color: #5a8bff;
          text-decoration: none;
          cursor: pointer !important;
        }
      }
      .iconSpan {
        color: #5a8bff;
        text-decoration: none;
        cursor: pointer !important;
      }
    }
  }
}
</style>
