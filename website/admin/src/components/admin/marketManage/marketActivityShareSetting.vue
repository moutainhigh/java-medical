<!--活动分享模块-->
<template>
  <div>
    <div>
      <section>
        <el-radio
          v-model="shareConfig.shareAction"
          :label=1
        >{{$t('marketCommon.defaultStyle')}}</el-radio>
        <el-popover
          placement="right-start"
          width="220"
          trigger="hover"
        >
          <el-image :src="srcList.src1"></el-image>
          <span
            slot="reference"
            class="operate"
          >{{$t('marketCommon.viewExample')}}</span>
        </el-popover>
        <el-popover
          placement="right-start"
          width="220"
          trigger="hover"
        >
          <el-image :src="srcList.src2"></el-image>
          <span
            slot="reference"
            class="operate"
          >{{$t('marketCommon.downloadPoster')}}</span>
        </el-popover>
      </section>

      <section>
        <el-radio
          v-model="shareConfig.shareAction"
          :label=2
        >
          {{$t('marketCommon.customStyle')}}
          <div
            style="margin: 15px 0"
            v-if="shareConfig.shareAction == 2"
          >
            <span style="color:#606266">{{$t('marketCommon.copywriting')}}:</span>
            <el-input
              v-model="shareConfig.shareDoc"
              size="small"
              style="width:200px"
            ></el-input>
          </div>
          <div v-if="shareConfig.shareAction == 2">
            <span style="color:#606266">{{$t('marketCommon.sharedPicture')}}:</span>
            <el-radio
              v-model="shareConfig.shareImgAction"
              :label=1
              style="margin-left:10px"
            >{{$t('marketCommon.goodsInformationPicture')}}</el-radio>

            <div style="margin: 10px 0 0 60px">
              <el-radio
                v-model="shareConfig.shareImgAction"
                :label=2
              >{{$t('marketCommon.customPicture')}}</el-radio>
            </div>
            <div
              style="margin: 10px 0 0 60px; display:flex"
              v-if="shareConfig.shareImgAction=== 2"
            >
              <!-- <span
                @click="deleteSelectImg()"
                v-if="this.srcList.src3 !==`${this.$imageHost}/image/admin/shop_beautify/add_decorete.png`"
                class="deleteIcon"
              >×</span> -->
              <div
                class="choose"
                @click="addGoodsImg"
              >
                <!-- :src="$imageHost+'/image/admin/shop_beautify/add_decorete.png'" -->

                <!-- :src="srcList.src3" -->
                <div>
                  <img
                    v-if="shareConfig.shareImg === '' || shareConfig.shareImg === null"
                    :src="$imageHost+'/image/admin/btn_add.png'"
                    alt=""
                  >
                  <img
                    v-if=" shareConfig.shareImg !== null || shareConfig.shareImg !== ''"
                    :src="shareConfig.shareImg"
                    alt=""
                    class="selectImage"
                  >
                </div>
              </div>
              <span style="margin: 30px 0 0 30px">{{$t('marketCommon.customPictureTip')}}</span>
            </div>
          </div>
        </el-radio>
        <ImageDalog
          pageIndex='pictureSpace'
          :imageSize=[800,800]
          :tuneUp="showImageDialog"
          @handleSelectImg='handleSelectImg'
        />
      </section>
    </div>
  </div>
</template>

<script>
import ImageDalog from '@/components/admin/imageDalog'

export default {
  components: { ImageDalog },
  props: ['shareConfig'],
  data () {
    return {
      srcList: {
        src1: `${this.$imageHost}/image/admin/share/bargain_share.jpg`,
        src2: `${this.$imageHost}/image/admin/share/bagain_pictorial.jpg`,
        src3: `${this.$imageHost}/image/admin/shop_beautify/add_decorete.png`,
        imageUrl: ``
      },
      showImageDialog: false
    }
  },
  methods: {
    // 活动分享 -- 添加图片点击事件，弹出图片选择组件
    addGoodsImg () {
      console.log(this.shareConfig)
      this.showImageDialog = !this.showImageDialog
    },
    // 图片点击回调函数
    handleSelectImg (res) {
      console.log(res)
      if (res != null) {
        console.log(res)
        // this.srcList.src3 = res.imgUrl
        this.shareConfig.shareImg = res.imgUrl
      }
    }
    // // 删除商品图片
    // deleteSelectImg () {
    //   this.srcList.src3 = `${this.$imageHost}/image/admin/shop_beautify/add_decorete.png`
    // }
  }

}

</script>
<style lang="scss" scoped>
.choose {
  display: block;
  width: 70px;
  height: 70px;
  line-height: 70px;
  background: #fff;
  border: 1px solid #e4e4e4;
  cursor: pointer;
  text-align: center;
}
.selectImage {
  width: 100%;
  height: 100%;
}
// .deleteIcon {
//   width: 17px;
//   height: 17px;
//   color: #fff;
//   background: #ccc;
//   border: 1px solid #ccc;
//   border-radius: 50%;
//   line-height: 17px;
//   text-align: center;
//   position: relative;
//   top: -8px;
//   right: -80px;
//   cursor: pointer;
//   opacity: 0.8;
// }
.operate {
  cursor: pointer;
  color: #409eff;
}
.operate {
  margin-left: 10px;
}
</style>
