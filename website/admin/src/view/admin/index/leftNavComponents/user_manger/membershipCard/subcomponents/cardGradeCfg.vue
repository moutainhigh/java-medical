<template>
  <div class="card-grade-div">
    <el-form
      :model="ruleForm"
      status-icon
      :rules="rules"
      ref="ruleForm"
      label-width="100px"
      :hide-required-asterisk="false"
      @submit.native.prevent
    >
      <el-form-item
        :label="$t('memberCard.gradeSetting')"
        class="grade-item"
        :rules="[{required: true}]"
      >
        <span class="grade-condition-tip">
          {{$t('memberCard.gradeTip')}}
        </span>
        <div class="grade-condition">
          <el-form-item class="grade-score">
            <el-checkbox-group v-model="val.checkedScore" @change="validScore" style="display: inline-block;">
              <el-checkbox label="on">{{$t('memberCard.gradeScore')}}</el-checkbox>
           </el-checkbox-group>
            <el-input-number
              v-model="ruleForm.gradeScore"
              size="small"
              :min="0"
              :max="999999999"
              :controls="false"
              @blur="checkGradeScore"
              @change="checkGradeScore"
            >
            </el-input-number>
            <span>{{$t('memberCard.unitM')}}</span>
            <span v-if="scoreValid" class="error-tip"> {{$t('memberCard.gradeScoreError')}} </span>
          </el-form-item>
          <el-form-item class="grade-amount">
            <el-checkbox-group v-model="val.checkedMoney" @change="validMoney" style="display: inline-block;">
              <el-checkbox label="on">{{$t('memberCard.gradeAmountCon')}}</el-checkbox>
           </el-checkbox-group>
            <el-input-number
              v-model="ruleForm.gradeCrash"
              size="small"
              :min="0"
              :max="999999999"
              :controls="false"
              @blur="checkGradeCrash"
              @change="checkGradeCrash"
            >
            </el-input-number>
            <span>{{$t('memberCard.yuan')}}</span>
            <span v-if="crashValid" class="error-tip"> {{$t('memberCard.gradeCrashError')}} </span>
            <span class="amount-tip">
              {{$t('memberCard.amountTip')}}
            </span>
          </el-form-item>
        </div>

      </el-form-item>
      <el-form-item
        :label="$t('memberCard.cardGrade')"
        class="grade-item"
        :rules="[{required: true}]"
      >
        <div class="grade-choose">
          <el-select
            v-model="ruleForm.gradeValue"
            :placeholder="$t('memberCard.cardGrade')"
            size="small"
          >
            <el-option
              v-for="(item,index) in gradeOptions"
              :key="index"
              :label="item.label"
              :value="item.value"
              :disabled="item.disabled"
            >
            </el-option>
          </el-select>
          <span v-if="valid" style="color: red;">{{ $t('memberCard.chooseGrade') }}</span>
          <div class="grade-condition-tip">
            {{$t('memberCard.gradeConditionTip')}}
          </div>
        </div>
      </el-form-item>
    </el-form>
  </div>
</template>
<script>
import {getAllNoDeleteGradeCard} from '@/api/admin/memberManage/memberCard.js'
export default {
  props: {
    val: {
      type: Object,
      required: true
    }
  },
  computed: {
    ruleForm: {
      get () {
        return this.val
      },
      set () {
        this.$emit('input', this.ruleForm)
      }
    },
    isCheckScoreOpt () {
      return this.val.checkedScore.length > 0 && this.val.checkedScore[0] === 'on'
    },
    isCheckCrashOpt () {
      return this.val.checkedMoney.length > 0 && this.val.checkedMoney[0] === 'on'
    }
  },
  watch: {
    'ruleForm.gradeScore': {
      handler (newName, oldName) {
        this.val.gradeScore = newName
        this.ruleForm = this.val
      },
      immediate: true
    },
    'ruleForm.gradeCrash': {
      handler (newName, oldName) {
        this.val.gradeCrash = newName
        this.ruleForm = this.val
      },
      immediate: true
    },
    'ruleForm.gradeValue': {
      handler (newName, oldName) {
        console.log(this.recordGrade)
        // 存储等级
        if (this.recordGrade && oldName) {
          this.recordGrade = false
          this.gradeOptions.forEach(item => {
            if (item.value === oldName) {
              console.log(oldName, item.value)
              item.disabled = false
            }
          })
          console.log(this.gradeOptions)
        }
        this.val.gradeValue = newName
        this.ruleForm = this.val
        this.valid = false
      },
      immediate: true
    }
  },
  mounted () {
    this.langDefault()
    this.initGradeOptions()
    this.$on('checkRule', () => {
      if (this.ruleForm.gradeValue) {
        this.valid = false
      } else {
        this.valid = true
      }

      this.checkGradeScore()
      this.checkGradeCrash()
      if (this.isCheckScoreOpt || this.isCheckCrashOpt) {
        if (this.valid || this.scoreValid || this.crashValid) {
        // 等级
          if (this.valid) {
            this.$message.warning(this.$t('memberCard.chooseGrade'))
          } else if (this.scoreValid) {
          // 升级积分
            this.$message.warning(this.$t('memberCard.gradeScoreError'))
          } else if (this.crashValid) {
          // 升级余额
            this.$message.warning(this.$t('memberCard.gradeCrashError'))
          }
        } else {
        // validate success
          this.ruleForm.valid = true
        }
      } else {
        this.scoreValid = true
        this.crashValid = true
        this.$message.warning('请选择升级条件')
      }
    })
  },
  data () {
    return {
      recordGrade: true,
      valid: false,
      scoreValid: false,
      crashValid: false,
      gradeOptions: [
        { label: '请选择', value: null, disabled: false },
        { label: 'v1', value: 'v1', disabled: false },
        { label: 'v2', value: 'v2', disabled: false },
        { label: 'v3', value: 'v3', disabled: false },
        { label: 'v4', value: 'v4', disabled: false },
        { label: 'v5', value: 'v5', disabled: false },
        { label: 'v6', value: 'v6', disabled: false },
        { label: 'v7', value: 'v7', disabled: false },
        { label: 'v8', value: 'v8', disabled: false },
        { label: 'v9', value: 'v9', disabled: false }
      ],
      rules: {

      }
    }
  },
  methods: {
    initGradeOptions () {
      getAllNoDeleteGradeCard().then(res => {
        console.log(this.ruleForm.gradeValue)
        if (res.error === 0) {
          console.log(res.content)
          this.gradeOptions.forEach(item => {
            if (res.content.includes(item.value)) {
              item.disabled = true
            }
          })
        }
      })
    },
    checkUndefindNullNotIncludeZero (val) {
      return !val && val !== 0
    },
    checkGradeScore () {
      if (this.isCheckScoreOpt) {
        let res = this.checkUndefindNullNotIncludeZero(this.ruleForm.gradeScore)
        this.scoreValid = res
      } else {
        this.scoreValid = false
      }
    },
    checkGradeCrash () {
      if (this.isCheckCrashOpt) {
        let res = this.checkUndefindNullNotIncludeZero(this.ruleForm.gradeCrash)
        this.crashValid = res
      } else {
        this.crashValid = false
      }
    },
    validScore () {
      if (!this.val.checkedScore.length > 0) {
        this.checkGradeScore()
      }
    },
    validMoney () {
      if (!this.val.checkedMoney.length > 0) {
        this.checkGradeCrash()
      }
    }
  }
}
</script>
<style scoped lang="scss">
*,/deep/ .el-form-item__label,
/deep/ .el-radio__label,
/deep/ .el-checkbox__label{
  font-size: 13px;
}
.card-grade-div {
  .grade-item {
    padding-left: 75px;
    .grade-condition-tip {
      color: #999;
      font-size: 13px;
      line-height: 20px;
    }
    .grade-condition {
      .grade-score {
        span {
          margin-right: 10px;
          margin-left: -10px;
        }
        /deep/ .el-input {
          width: 90%;
        }
      }
      .grade-amount {
        span {
          margin-right: 10px;
          margin-left: -10px;
        }
        /deep/ .el-input {
          width: 90%;
        }
        .amount-tip {
          color: #999;
          font-size: 13px;
        }
      }
    }
    .grade-choose {
      /deep/ .el-select {
        width: 18%;
      }
    }
  }
}
.error-tip{
  color: red;
}
</style>
