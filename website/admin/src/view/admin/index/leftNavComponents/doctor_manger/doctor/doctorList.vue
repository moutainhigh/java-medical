<template>
  <div class="main">
    <div class="navBox">
      <div class="filters">
        <div class="filters_item">
          <span>姓名：</span>
          <el-input
            v-model="queryParams.name"
            size="small"
            style="width: 190px"
            placeholder="请输入姓名"
          >
          </el-input>
        </div>
        <div class="filters_item">
          <span>科室：</span>
          <el-input
            v-model="queryParams.departmentName"
            size="small"
            style="width: 190px"
            placeholder="请输入科室"
          >
          </el-input>
        </div>
        <div class="filters_item">
          <span>咨询费用：</span>
          <el-input-number
            v-model="queryParams.consultationMoneyMix"
            size="small"
            style="width: 100px"
            placeholder="最小"
            :min="0"
            controls-position="right"
          >
          </el-input-number
          >~
          <el-input-number
            v-model="queryParams.consultationMoneyMax"
            size="small"
            style="width: 100px"
            placeholder="最大"
            :min="0"
            controls-position="right"
          >
          </el-input-number>
        </div>
        <div class="btn_wrap">
          <el-button type="primary" size="small" @click="initDataList"
            >搜索</el-button
          >
          <el-button type="primary" size="small" @click="handleAddDoctor"
            >添加</el-button
          >
          <el-button type="primary" size="small" @click="fetch">同步</el-button>
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
          color: '#000',
        }"
        :cell-style="{
          'text-align': 'center',
        }"
      >
        <el-table-column
          prop="hospitalCode"
          label="医师院内编号"
        ></el-table-column>
        <el-table-column label="姓名">
          <template slot-scope="scope">
            <div
              class="doc_name_url"
              style="display: flex; justify-content: flex-start"
            >
              <img class="doc_img" v-if="scope.row.url" :src="scope.row.url" />
              <div>{{ scope.row.name }}</div>
            </div>
          </template>
        </el-table-column>
        <!-- <el-table-column label="年龄">
          <template slot-scope="scope">
            <span> {{scope.row.age}}</span>
          </template>
        </el-table-column> -->
        <el-table-column prop="departmentNames" label="职称/科室">
          <template slot-scope="scope">
            <span>
              {{ scope.row.titleName }}/{{ scope.row.departmentNames }}</span
            >
          </template>
        </el-table-column>
        <el-table-column prop="mobile" label="手机号"></el-table-column>
        <el-table-column label="评分星级" align="center" width="200px">
          <template slot-scope="scope">
            <div class="evaluation-info">
              <div
                class="evaluation-info_item"
                v-if="scope.row.avgCommentStar > 0"
              >
                <star :value="scope.row.avgCommentStar" />
                <div style="margin-top: 10px">
                  {{ scope.row.avgCommentStar }}
                </div>
                <a
                  href="javaScript:void(0);"
                  class="same_btn"
                  style="margin-top: 10px"
                  @click="toComment(scope.row.name)"
                  >查看</a
                >
              </div>
              <div v-else>暂无评价</div>
            </div>
          </template>
        </el-table-column>
        <el-table-column label="平均响应时间">
          <template v-slot="scope">
            <span>{{
              scope.row.answerHourInt > 0
                ? scope.row.answerHourInt + '小时'
                : ''
            }}</span
            ><span>{{
              scope.row.answerMunite != -1
                ? scope.row.answerMunite + '分钟'
                : '暂无接诊'
            }}</span>
          </template>
        </el-table-column>
        <el-table-column
          prop="attentionNumber"
          label="关注量"
        ></el-table-column>
        <el-table-column
          prop="consultationPrice"
          label="咨询费用"
        ></el-table-column>
        <el-table-column label="接诊量">
          <template v-slot="scope">
            <a
              href="javaScript:void(0);"
              class="same_btn"
              style="margin: 0px; display: block"
              @click="toAdvistory(scope.row.id)"
              v-if="scope.row.consultationNumber > 0"
              >{{ scope.row.consultationNumber }}</a
            >
            <span v-else>0</span>
          </template>
        </el-table-column>
        <el-table-column label="操作">
          <template slot-scope="scope">
            <div class="operation">
              <a
                href="javaScript:void(0);"
                class="same_btn"
                @click="editDoctor(scope.row.id)"
                >编辑</a
              >
              <a
                href="javaScript:void(0);"
                class="same_btn"
                v-if="scope.row.status == 1"
                @click="puaseDoctor(scope.row)"
                >停用</a
              >
              <a
                href="javaScript:void(0);"
                class="same_btn"
                v-if="scope.row.status == 0"
                @click="beginDoctor(scope.row)"
                >启用</a
              >
              <a
                href="javaScript:void(0);"
                class="same_btn"
                v-if="scope.row.userId !== 0"
                @click="setBundling(scope.row.id)"
                >解除绑定</a
              >
              <a
                href="javaScript:void(0);"
                class="same_btn"
                @click="setConsultation(scope.row)"
                >{{ scope.row.canConsultation ? '禁止问诊' : '允许问诊' }}</a
              >
              <a
                href="javaScript:void(0);"
                class="same_btn"
                @click="toDetail(scope.row.id, scope.row.hospitalCode)"
                >查看详情</a
              >
            </div>
          </template>
        </el-table-column>
      </el-table>
      <pagination :page-params.sync="pageParams" @pagination="initDataList" />
    </div>
  </div>
</template>

<script>
import { doctorList, enableDoctor, unBundling, updateConsultation, fetchDoctor } from '@/api/admin/doctorManage/doctorInfo/doctor'
import pagination from '@/components/admin/pagination/pagination'
import star from '@/components/admin/commonStar'
export default {
  components: { pagination, star },
  data () {
    return {
      loading: false,
      langDefaultFlag: false,
      pageParams: {},
      tableData: [],
      queryParams: {
        name: null,
        departmentName: null,
        consultationMoneyMix: undefined,
        consultationMoneyMax: undefined
      },
      // 表格原始数据
      originalData: [],
      imgHost: `${this.$imageHost}`
    }
  },
  methods: {
    // 数据初始化
    initDataList () {
      this.loading = true
      if (this.queryParams.name === '') {
        this.queryParams.name = null
      }
      if (this.queryParams.departmentName === '') {
        this.queryParams.departmentName = null
      }
      doctorList(Object.assign(this.queryParams, this.pageParams)).then((res) => {
        console.log(res)
        this.originalData = res.content.dataList
        let originalData = JSON.parse(JSON.stringify(this.originalData))
        for (let i in originalData) {
          if (originalData[i].departmentNames) {
            originalData[i].departmentNames = originalData[i].departmentNames.join('，')
          }
          // if (originalData[i].workTime !== null && originalData[i].workTime !== 0) {
          //   originalData[i].workTime = originalData[i].workTime.substr(0, 10)
          // }
          if (originalData[i].url === '') {
            originalData[i].url = this.imgHost + '/image/admin/doc_url_default.png'
          } else {
            originalData[i].url = this.imgHost + '/' + originalData[i].url
          }
        }
        console.log(originalData)
        this.handleData(originalData)
        this.pageParams = res.content.page
        this.loading = false
      })
    },
    // 渲染数据
    handleData (data) {
      this.tableData = data
      this.langDefaultFlag = true
    },
    // 添加医师
    handleAddDoctor () {
      this.$router.push({ name: 'addDoctor' })
      console.log(this.$router)
    },
    // 停用
    puaseDoctor (row) {
      let params = {
        id: row.id,
        status: 0
      }
      this.$confirm('此操作将停用该医生, 是否继续?', '提示', {
        confirmButtonText: '确定',
        cancelButtonText: '取消',
        type: 'warning'
      }).then(() => {
        enableDoctor(params).then(res => {
          if (res.error === 0) {
            this.$message.success({ message: '停用成功！' })
            this.initDataList()
          } else {
            this.$message.error({ message: '停用失败' })
          }
        })
      }).catch(() => {
        this.$message.info({ message: '已取消停用' })
      })
    },
    // 启用
    beginDoctor (row) {
      let params = {
        id: row.id,
        status: 1
      }
      this.$confirm('此操作将启用该医生, 是否继续?', '提示', {
        confirmButtonText: '确定',
        cancelButtonText: '取消',
        type: 'warning'
      }).then(() => {
        enableDoctor(params).then(res => {
          if (res.error === 0) {
            this.$message.success({ message: '启用成功！' })
            this.initDataList()
          } else {
            this.$message.error({ message: '启用失败' })
          }
        })
      }).catch(() => {
        this.$message.info({ message: '已取消启用' })
      })
    },
    // 编辑
    editDoctor (id) {
      this.$router.push({
        path: '/admin/home/main/doctor/updateDoctor',
        query: {
          id: id
        }
      })
    },
    // 解除绑定
    setBundling (id) {
      this.$confirm('此操作将解除该医生与小程序绑定, 是否继续?', '提示', {
        confirmButtonText: '确定',
        cancelButtonText: '取消',
        type: 'warning'
      }).then(() => {
        unBundling({ doctorId: id }).then(res => {
          if (res.error === 0) {
            this.$message.success({ message: '已解除绑定' })
            this.initDataList()
          }
        })
      }).catch(() => {
      })
    },
    // 切换问诊状态
    setConsultation ({ id: doctorId, canConsultation }) {
      this.$confirm(canConsultation ? '是否禁止该医生接诊' : '是否允许该医生接诊', '提示', {
        confirmButtonText: '确定',
        cancelButtonText: '取消',
        type: 'warning'
      }).then(() => {
        updateConsultation({ doctorId }).then(res => {
          if (res.error === 0) {
            this.$message.success({ message: canConsultation ? '已禁止' : '已允许' })
            this.initDataList()
          }
        })
      })
    },
    fetch () {
      fetchDoctor().then(res => {
        console.log(res)
      })
    },
    toAdvistory (id) {
      const { href } = this.$router.resolve({
        path: '/admin/home/main/orders/advisoryOrder/list',
        query: {
          doctorId: id
        }
      })
      window.open(href, '_blank')
    },
    toComment (name) {
      const { href } = this.$router.resolve({
        path: '/admin/home/main/doctor/comment/list',
        query: {
          name: name
        }
      })
      window.open(href, '_blank')
    },
    toDetail (id, code) {
      const { href } = this.$router.resolve({
        path: '/admin/home/main/doctor/detail',
        query: {
          id: id,
          code: code
        }
      })
      window.open(href, '_blank')
    }
  },
  watch: {
    lang () {
      if (this.langDefaultFlag) {
        // 重新渲染表格数据
        let originalData = JSON.parse(JSON.stringify(this.originalData))
        this.handleData(originalData)
      }
    }
  },
  mounted () {
    this.initDataList()
  }
}
</script>

<style scoped lang='scss'>
@import '@/assets/aliIcon/iconfont.scss';
.main {
  .navBox {
    display: flex;
    width: 100%;
    background-color: #fff;
    padding: 15px;
    .filters {
      flex: 2;
      display: flex;
      flex-wrap: wrap;
      line-height: 30px;
      margin-left: -15px;
      .filters_item {
        // width: 270px;
        display: flex;
        justify-content: flex-end;
        margin-left: 15px;
        > span {
          // width: 140px;
          font-size: 14px;
          text-align: right;
        }
      }
      .btn_wrap {
        margin-left: 20px;
      }
    }
  }
  .table_box {
    padding: 10px;
    background: #fff;
    margin-top: 10px;
    .doc_name_url {
      display: flex;
      align-items: center;
      justify-content: center;
      .doc_img {
        width: 45px;
        height: 45px;
        margin-right: 10px;
        border-radius: 100px;
        border: 1px solid #eee;
      }
    }
    .operation {
      display: flex;
      justify-content: center;
      flex-direction: column;
    }
    .same_btn {
      font-size: 12px;
      text-decoration: none;
      cursor: pointer;
      color: #5a8bff;
    }
  }
}
</style>
