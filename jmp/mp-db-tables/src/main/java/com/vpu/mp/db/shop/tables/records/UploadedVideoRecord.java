/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables.records;


import com.vpu.mp.db.shop.tables.UploadedVideo;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record22;
import org.jooq.Row22;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 小视频
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UploadedVideoRecord extends UpdatableRecordImpl<UploadedVideoRecord> implements Record22<Integer, String, Integer, String, String, String, String, String, Integer, Integer, Integer, String, Byte, Integer, Byte, Timestamp, Timestamp, Integer, Integer, Timestamp, Byte, Integer> {

    private static final long serialVersionUID = -822722164;

    /**
     * Setter for <code>mini_shop_471752.b2c_uploaded_video.video_id</code>.
     */
    public void setVideoId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_uploaded_video.video_id</code>.
     */
    public Integer getVideoId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_uploaded_video.video_type</code>.
     */
    public void setVideoType(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_uploaded_video.video_type</code>.
     */
    public String getVideoType() {
        return (String) get(1);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_uploaded_video.video_size</code>.
     */
    public void setVideoSize(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_uploaded_video.video_size</code>.
     */
    public Integer getVideoSize() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_uploaded_video.video_name</code>. 视频名称，用于前端显示
     */
    public void setVideoName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_uploaded_video.video_name</code>. 视频名称，用于前端显示
     */
    public String getVideoName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_uploaded_video.video_orig_fname</code>.
     */
    public void setVideoOrigFname(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_uploaded_video.video_orig_fname</code>.
     */
    public String getVideoOrigFname() {
        return (String) get(4);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_uploaded_video.video_path</code>.
     */
    public void setVideoPath(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_uploaded_video.video_path</code>.
     */
    public String getVideoPath() {
        return (String) get(5);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_uploaded_video.video_snap_path</code>. 视频截图
     */
    public void setVideoSnapPath(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_uploaded_video.video_snap_path</code>. 视频截图
     */
    public String getVideoSnapPath() {
        return (String) get(6);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_uploaded_video.video_url</code>.
     */
    public void setVideoUrl(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_uploaded_video.video_url</code>.
     */
    public String getVideoUrl() {
        return (String) get(7);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_uploaded_video.video_cat_id</code>. 视频分类
     */
    public void setVideoCatId(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_uploaded_video.video_cat_id</code>. 视频分类
     */
    public Integer getVideoCatId() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_uploaded_video.video_width</code>.
     */
    public void setVideoWidth(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_uploaded_video.video_width</code>.
     */
    public Integer getVideoWidth() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_uploaded_video.video_height</code>.
     */
    public void setVideoHeight(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_uploaded_video.video_height</code>.
     */
    public Integer getVideoHeight() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_uploaded_video.video_meta</code>. 视频信息,json
     */
    public void setVideoMeta(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_uploaded_video.video_meta</code>. 视频信息,json
     */
    public String getVideoMeta() {
        return (String) get(11);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_uploaded_video.is_refer</code>. 是否引用
     */
    public void setIsRefer(Byte value) {
        set(12, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_uploaded_video.is_refer</code>. 是否引用
     */
    public Byte getIsRefer() {
        return (Byte) get(12);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_uploaded_video.shop_id</code>. 店铺id
     */
    public void setShopId(Integer value) {
        set(13, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_uploaded_video.shop_id</code>. 店铺id
     */
    public Integer getShopId() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_uploaded_video.del_flag</code>.
     */
    public void setDelFlag(Byte value) {
        set(14, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_uploaded_video.del_flag</code>.
     */
    public Byte getDelFlag() {
        return (Byte) get(14);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_uploaded_video.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(15, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_uploaded_video.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(15);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_uploaded_video.update_time</code>. 最后修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(16, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_uploaded_video.update_time</code>. 最后修改时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(16);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_uploaded_video.duration</code>. 视频时长
     */
    public void setDuration(Integer value) {
        set(17, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_uploaded_video.duration</code>. 视频时长
     */
    public Integer getDuration() {
        return (Integer) get(17);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_uploaded_video.user_id</code>. 用户ID
     */
    public void setUserId(Integer value) {
        set(18, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_uploaded_video.user_id</code>. 用户ID
     */
    public Integer getUserId() {
        return (Integer) get(18);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_uploaded_video.del_time</code>. 删除时间
     */
    public void setDelTime(Timestamp value) {
        set(19, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_uploaded_video.del_time</code>. 删除时间
     */
    public Timestamp getDelTime() {
        return (Timestamp) get(19);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_uploaded_video.upyun_del</code>. 又拍云是否删除
     */
    public void setUpyunDel(Byte value) {
        set(20, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_uploaded_video.upyun_del</code>. 又拍云是否删除
     */
    public Byte getUpyunDel() {
        return (Byte) get(20);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_uploaded_video.video_duration</code>. 视频时长
     */
    public void setVideoDuration(Integer value) {
        set(21, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_uploaded_video.video_duration</code>. 视频时长
     */
    public Integer getVideoDuration() {
        return (Integer) get(21);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record22 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row22<Integer, String, Integer, String, String, String, String, String, Integer, Integer, Integer, String, Byte, Integer, Byte, Timestamp, Timestamp, Integer, Integer, Timestamp, Byte, Integer> fieldsRow() {
        return (Row22) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row22<Integer, String, Integer, String, String, String, String, String, Integer, Integer, Integer, String, Byte, Integer, Byte, Timestamp, Timestamp, Integer, Integer, Timestamp, Byte, Integer> valuesRow() {
        return (Row22) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return UploadedVideo.UPLOADED_VIDEO.VIDEO_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return UploadedVideo.UPLOADED_VIDEO.VIDEO_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return UploadedVideo.UPLOADED_VIDEO.VIDEO_SIZE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return UploadedVideo.UPLOADED_VIDEO.VIDEO_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return UploadedVideo.UPLOADED_VIDEO.VIDEO_ORIG_FNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return UploadedVideo.UPLOADED_VIDEO.VIDEO_PATH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return UploadedVideo.UPLOADED_VIDEO.VIDEO_SNAP_PATH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return UploadedVideo.UPLOADED_VIDEO.VIDEO_URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return UploadedVideo.UPLOADED_VIDEO.VIDEO_CAT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return UploadedVideo.UPLOADED_VIDEO.VIDEO_WIDTH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field11() {
        return UploadedVideo.UPLOADED_VIDEO.VIDEO_HEIGHT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return UploadedVideo.UPLOADED_VIDEO.VIDEO_META;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field13() {
        return UploadedVideo.UPLOADED_VIDEO.IS_REFER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field14() {
        return UploadedVideo.UPLOADED_VIDEO.SHOP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field15() {
        return UploadedVideo.UPLOADED_VIDEO.DEL_FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field16() {
        return UploadedVideo.UPLOADED_VIDEO.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field17() {
        return UploadedVideo.UPLOADED_VIDEO.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field18() {
        return UploadedVideo.UPLOADED_VIDEO.DURATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field19() {
        return UploadedVideo.UPLOADED_VIDEO.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field20() {
        return UploadedVideo.UPLOADED_VIDEO.DEL_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field21() {
        return UploadedVideo.UPLOADED_VIDEO.UPYUN_DEL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field22() {
        return UploadedVideo.UPLOADED_VIDEO.VIDEO_DURATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getVideoId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getVideoType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getVideoSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getVideoName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getVideoOrigFname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getVideoPath();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getVideoSnapPath();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getVideoUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component9() {
        return getVideoCatId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component10() {
        return getVideoWidth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component11() {
        return getVideoHeight();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getVideoMeta();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component13() {
        return getIsRefer();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component14() {
        return getShopId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component15() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component16() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component17() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component18() {
        return getDuration();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component19() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component20() {
        return getDelTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component21() {
        return getUpyunDel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component22() {
        return getVideoDuration();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getVideoId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getVideoType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getVideoSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getVideoName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getVideoOrigFname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getVideoPath();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getVideoSnapPath();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getVideoUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getVideoCatId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getVideoWidth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value11() {
        return getVideoHeight();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getVideoMeta();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value13() {
        return getIsRefer();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value14() {
        return getShopId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value15() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value16() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value17() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value18() {
        return getDuration();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value19() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value20() {
        return getDelTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value21() {
        return getUpyunDel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value22() {
        return getVideoDuration();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UploadedVideoRecord value1(Integer value) {
        setVideoId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UploadedVideoRecord value2(String value) {
        setVideoType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UploadedVideoRecord value3(Integer value) {
        setVideoSize(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UploadedVideoRecord value4(String value) {
        setVideoName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UploadedVideoRecord value5(String value) {
        setVideoOrigFname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UploadedVideoRecord value6(String value) {
        setVideoPath(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UploadedVideoRecord value7(String value) {
        setVideoSnapPath(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UploadedVideoRecord value8(String value) {
        setVideoUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UploadedVideoRecord value9(Integer value) {
        setVideoCatId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UploadedVideoRecord value10(Integer value) {
        setVideoWidth(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UploadedVideoRecord value11(Integer value) {
        setVideoHeight(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UploadedVideoRecord value12(String value) {
        setVideoMeta(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UploadedVideoRecord value13(Byte value) {
        setIsRefer(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UploadedVideoRecord value14(Integer value) {
        setShopId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UploadedVideoRecord value15(Byte value) {
        setDelFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UploadedVideoRecord value16(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UploadedVideoRecord value17(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UploadedVideoRecord value18(Integer value) {
        setDuration(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UploadedVideoRecord value19(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UploadedVideoRecord value20(Timestamp value) {
        setDelTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UploadedVideoRecord value21(Byte value) {
        setUpyunDel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UploadedVideoRecord value22(Integer value) {
        setVideoDuration(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UploadedVideoRecord values(Integer value1, String value2, Integer value3, String value4, String value5, String value6, String value7, String value8, Integer value9, Integer value10, Integer value11, String value12, Byte value13, Integer value14, Byte value15, Timestamp value16, Timestamp value17, Integer value18, Integer value19, Timestamp value20, Byte value21, Integer value22) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        value21(value21);
        value22(value22);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UploadedVideoRecord
     */
    public UploadedVideoRecord() {
        super(UploadedVideo.UPLOADED_VIDEO);
    }

    /**
     * Create a detached, initialised UploadedVideoRecord
     */
    public UploadedVideoRecord(Integer videoId, String videoType, Integer videoSize, String videoName, String videoOrigFname, String videoPath, String videoSnapPath, String videoUrl, Integer videoCatId, Integer videoWidth, Integer videoHeight, String videoMeta, Byte isRefer, Integer shopId, Byte delFlag, Timestamp createTime, Timestamp updateTime, Integer duration, Integer userId, Timestamp delTime, Byte upyunDel, Integer videoDuration) {
        super(UploadedVideo.UPLOADED_VIDEO);

        set(0, videoId);
        set(1, videoType);
        set(2, videoSize);
        set(3, videoName);
        set(4, videoOrigFname);
        set(5, videoPath);
        set(6, videoSnapPath);
        set(7, videoUrl);
        set(8, videoCatId);
        set(9, videoWidth);
        set(10, videoHeight);
        set(11, videoMeta);
        set(12, isRefer);
        set(13, shopId);
        set(14, delFlag);
        set(15, createTime);
        set(16, updateTime);
        set(17, duration);
        set(18, userId);
        set(19, delTime);
        set(20, upyunDel);
        set(21, videoDuration);
    }
}
