<template>
  <div class="total-content">
    <div class="container">
      <yesterdayStatistics class="distance" />
      <visitTrendStatistics class="distance" />
      <pageStatistics class="distance" />
      <hotMedicine class="distance" />
    </div>
  </div>
</template>
<script>
import yesterdayStatistics from './yesterdayStatistics'
import visitTrendStatistics from './visitTrendStatistics'
import pageStatistics from './pageStatistics'
import hotMedicine from './hotMedicine'
export default {
  components: { yesterdayStatistics, visitTrendStatistics, pageStatistics, hotMedicine },
  data () {
    return {}
  }
}
</script>
<style lang="scss" scoped>
.total-content {
  font-size: 14px;
  margin-top: 10px;
  .container {
    position: relative;
    .distance {
      margin-left: 10px;
      margin-right: 10px;
      margin-bottom: 10px;
    }
  }
}
</style>
