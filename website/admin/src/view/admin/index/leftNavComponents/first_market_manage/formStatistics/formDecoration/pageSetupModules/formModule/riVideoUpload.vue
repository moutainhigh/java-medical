<template>
  <div class="riName">
    <div class="riNameMain">
      <!--模块私有区域-->
      <div class="main">
        <div class="list">
          <span>{{$t('formDecorationModel.titleText')}}</span>
          <el-input
            v-model="modulesSaveData.form_title"
            size="small"
            :maxlength="20"
            :disabled="isProhibit"
          ></el-input>
        </div>
        <div class="list">
          <span></span>
          <div class="tips">{{$t('formDecorationModel.titleTextTip')}}</div>
        </div>
        <div class="list">
          <span>{{$t('formDecorationModel.conditionValidation')}}</span>
          <el-checkbox
            :disabled="isProhibit"
            v-model="modulesSaveData.confirm"
          >{{$t('formDecorationModel.mustFill')}}</el-checkbox>
        </div>
        <div class="videoTips">
          <span>{{$t('formDecorationModel.note')}}</span>
          <div class="videoTipsContent">{{$t('formDecorationModel.videoTip')}}</div>
        </div>
        <!--模块私有end-->
        <div class="sure">
          <el-button
            type="primary"
            size="small"
            @click="handleToClickSure()"
          >{{$t('formDecorationModel.determine')}}</el-button>
        </div>
      </div>
    </div>
  </div>
</template>
<script>
import decMixins from '@/mixins/decorationModulesMixins/decorationModulesMixins'
export default {
  mixins: [decMixins],
  props: {
    modulesData: Object, // 模块公共
    sortIndex: Number // 模块公共
  },
  data () {
    return {
      isProhibit: false, // 是否全部禁用
      imageTuneUp: false, // 图片选择弹窗调起
      modulesSaveData: {
        'form_title': '图片上传',
        'max_number': '6',
        'size_types': 0,
        'width_size': '',
        'height_size': '',
        'confirm': 0,
        'ok_ajax': 1
      }, // 模块保存数据
      options: [{
        value: '6',
        label: '6'
      }, {
        value: '5',
        label: '5'
      }, {
        value: '4',
        label: '4'
      }, {
        value: '3',
        label: '3'
      }, {
        value: '2',
        label: '2'
      },
      {
        value: '1',
        label: '1'
      }
      ]
    }
  },
  watch: {
    // 中间模块当前高亮index
    sortIndex: { // 模块公共
      handler (newData) {
        console.log(newData, this.modulesData)
        if (this.modulesData !== -1) {
          if (this.modulesData.confirm === 1) {
            this.modulesData.confirm = true
          } else {
            this.modulesData.confirm = false
          }
          this.modulesSaveData = this.modulesData
        }
      },
      immediate: true
    },
    // 监听数据变换
    modulesSaveData: { // 模块公共
      handler (newData) {
        console.log(newData)
        this.$emit('handleToBackData', newData)
      },
      deep: true
    }
  },
  mounted () {
    this.$nextTick(() => {
      console.log(localStorage.getItem('isProhibitForm'))
      this.isProhibit = JSON.parse(localStorage.getItem('isProhibitForm'))
    })
  },
  methods: {
    // 点击确定按钮
    handleToClickSure () {
      if (this.isProhibit) return
      this.modulesSaveData.ok_ajax = 1
      this.$message.success({
        message: this.$t('formDecorationModel.savedSuccessfully'),
        showClose: true
      })
    }
  }
}
</script>
<style lang="scss" scoped>
.riName {
  .riNameMain {
    background: #f8f8f8;
    border: 1px solid #e5e5e5;
    height: 550px;
    overflow-y: auto;
    padding: 20px 2%;
    .list {
      margin-bottom: 20px;
      span {
        display: inline-block;
        width: 100px;
        display: flex;
        justify-content: flex-end;
        align-items: center;
      }
      display: flex;
      /deep/ .el-input {
        width: 220px;
      }
      .tips {
        color: #a7a7a7;
        font-size: 12px;
      }
      .sizeTypes {
        display: flex;
        align-items: center;
        /deep/ .el-input {
          width: 90px;
        }
      }
    }
    .videoTips {
      padding-left: 30px;
      display: flex;
      color: #999;
      line-height: 20px;
      .videoTipsContent {
        width: 270px;
        text-align: justify;
      }
    }
    .select {
      /deep/ .el-input {
        width: 100px;
      }
      i {
        display: flex;
        align-items: center;
        margin-right: 5px;
      }
    }
    .sure {
      display: flex;
      justify-content: center;
    }
    //end
  }
}
</style>
