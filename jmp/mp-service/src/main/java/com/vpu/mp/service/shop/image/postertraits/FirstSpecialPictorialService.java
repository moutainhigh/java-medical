package com.vpu.mp.service.shop.image.postertraits;

import com.upyun.UpException;
import com.vpu.mp.db.main.tables.records.ShopRecord;
import com.vpu.mp.db.shop.tables.records.FirstSpecialRecord;
import com.vpu.mp.db.shop.tables.records.GoodsRecord;
import com.vpu.mp.db.shop.tables.records.PictorialRecord;
import com.vpu.mp.service.foundation.data.BaseConstant;
import com.vpu.mp.service.foundation.data.JsonResultMessage;
import com.vpu.mp.service.foundation.util.ImageUtil;
import com.vpu.mp.service.foundation.util.Util;
import com.vpu.mp.service.pojo.shop.config.PictorialShareConfig;
import com.vpu.mp.service.pojo.shop.qrcode.QrCodeTypeEnum;
import com.vpu.mp.service.pojo.wxapp.share.*;
import com.vpu.mp.service.pojo.wxapp.share.firstspecial.FirstSpecialShareInfoParam;
import com.vpu.mp.service.shop.image.QrCodeService;
import com.vpu.mp.service.shop.market.firstspecial.FirstSpecialService;
import org.jooq.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 * @author 李晓冰
 * @date 2020年02月07日
 */
@Service
public class FirstSpecialPictorialService extends ShareBaseService {
    @Autowired
    FirstSpecialService firstSpecialService;
    @Autowired
    private QrCodeService qrCodeService;

    @Override
    Record getActivityRecord(Integer activityId) {
        return firstSpecialService.getFirstSpecialRecord(activityId);
    }

    @Override
    PictorialShareConfig getPictorialConfig(Record aRecord, GoodsRecord goodsRecord) {
        FirstSpecialRecord record = (FirstSpecialRecord) aRecord;
        return Util.parseJson(record.getShareConfig(), PictorialShareConfig.class);
    }

    /**
     * 首单特惠分享背景图片地址
     */
    private static final String FIRST_SPECIAL_SHARE_BG_IMG = "image/wxapp/first_special_share.png";

    @Override
    String createShareImage(Record aRecord, GoodsRecord goodsRecord, GoodsShareBaseParam baseParam) {
        FirstSpecialRecord firstSpecialRecord = (FirstSpecialRecord) aRecord;
        FirstSpecialShareInfoParam param = (FirstSpecialShareInfoParam) baseParam;

        PictorialRecord pictorialRecord = pictorialService.getPictorialDao(goodsRecord.getGoodsId(), param.getActivityId(), PictorialConstant.FIRST_SPECIAL_ACTION_SHARE, null);
        // 已存在生成的图片
        if (pictorialRecord != null && pictorialService.isGoodsSharePictorialRecordCanUse(pictorialRecord.getRule(), goodsRecord.getUpdateTime(), firstSpecialRecord.getUpdateTime())) {
            return pictorialRecord.getPath();
        }

        try (InputStream bgInputStream = Util.loadFile(FIRST_SPECIAL_SHARE_BG_IMG)) {
            BufferedImage firstSpecialBufferImg = ImageIO.read(bgInputStream);
            BufferedImage goodsBufferImg = ImageIO.read(new URL(imageService.getImgFullUrl(goodsRecord.getGoodsImg())));

            int goodsHeight = 367;
            int goodsWidth = 458;
            int toTop = 30;
            int toLeft = goodsWidth - 30 - firstSpecialBufferImg.getWidth();

            goodsBufferImg = ImageUtil.resizeImage(goodsWidth, goodsHeight, goodsBufferImg);
            ImageUtil.addTwoImage(goodsBufferImg, firstSpecialBufferImg, toLeft, toTop);

            // 上传u盘云并缓存入库
            String relativePath = createFilePath(firstSpecialRecord.getId());
            PictorialRule pictorialRule = new PictorialRule(goodsRecord.getUpdateTime(), firstSpecialRecord.getUpdateTime());
            pictorialService.uploadToUpanYun(goodsBufferImg, relativePath, pictorialRule, goodsRecord.getGoodsId(), param.getActivityId(), PictorialConstant.FIRST_SPECIAL_ACTION_SHARE, pictorialRecord, param.getUserId());

            return relativePath;
        } catch (IOException e) {
            shareLog(getActivityName(), "图片生成错误：" + e.getMessage());
        } catch (UpException e) {
            shareLog(getActivityName(), "UpanYun上传错误：" + e.getMessage());
        }
        return null;
    }

    @Override
    String createDefaultShareDoc(String lang, Record aRecord, GoodsRecord goodsRecord, GoodsShareBaseParam baseParam) {
        return Util.translateMessage(lang, JsonResultMessage.WX_MA_NORMAL_GOODS_SHARE_INFO, null, "messages", baseParam.getUserName(), goodsRecord.getGoodsName());
    }

    @Override
    String createMpQrCode(Record aRecord, GoodsRecord goodsRecord, GoodsShareBaseParam baseParam) {
        FirstSpecialRecord firstSpecialRecord = (FirstSpecialRecord) aRecord;
        return qrCodeService.getMpQrCode(QrCodeTypeEnum.GOODS_ITEM, String.format("uid=%d&gid=%d&aid=%d&atp=%d", baseParam.getUserId(), goodsRecord.getGoodsId(), firstSpecialRecord.getId(), BaseConstant.ACTIVITY_TYPE_FIRST_SPECIAL));
    }

    @Override
    void createPictorialImg(BufferedImage qrCodeBufferImg, BufferedImage goodsImg, PictorialUserInfo userInfo, String shareDoc, Record aRecord, GoodsRecord goodsRecord, ShopRecord shop, GoodsShareBaseParam baseParam, GoodsPictorialInfo goodsPictorialInfo) {
        PictorialImgPx imgPx = new PictorialImgPx();
        // 拼装背景图
        pictorialLog(getActivityName(), "拼装背景图");
        String firstSpecialTip = Util.translateMessage(shop.getShopLanguage(), JsonResultMessage.WX_MA_FIRST_SPECIAL_INFO, "messages");
        BufferedImage bgBufferedImage = pictorialService.createPictorialBgImage(userInfo, shop, qrCodeBufferImg, goodsImg, shareDoc, goodsRecord.getGoodsName(), firstSpecialTip, baseParam.getRealPrice(), baseParam.getLinePrice(), imgPx);
        pictorialLog(getActivityName(), "拼装背景图完成");

        pictorialLog(getActivityName(), "转换base64");
        String base64 = ImageUtil.toBase64(bgBufferedImage);
        goodsPictorialInfo.setBase64(base64);
        goodsPictorialInfo.setBgImg(bgBufferedImage);
    }

    @Override
    protected String getActivityName() {
        return "first_special";
    }
}
