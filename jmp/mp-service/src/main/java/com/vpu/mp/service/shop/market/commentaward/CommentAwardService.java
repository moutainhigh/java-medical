package com.vpu.mp.service.shop.market.commentaward;

import static com.vpu.mp.db.shop.Tables.COMMENT_AWARD;
import static com.vpu.mp.service.foundation.data.BaseConstant.ACTIVITY_IS_FOREVER;
import static com.vpu.mp.service.foundation.data.BaseConstant.ACTIVITY_NOT_FOREVER;
import static com.vpu.mp.service.foundation.data.BaseConstant.ACTIVITY_STATUS_DISABLE;
import static com.vpu.mp.service.foundation.data.BaseConstant.ACTIVITY_STATUS_NORMAL;

import java.sql.Timestamp;

import com.vpu.mp.service.foundation.data.BaseConstant;
import com.vpu.mp.service.foundation.util.Util;
import com.vpu.mp.service.pojo.shop.market.commentaward.CommentAwardIdParam;
import org.jooq.Record;
import org.jooq.SelectConditionStep;
import org.springframework.stereotype.Service;

import com.vpu.mp.db.shop.tables.records.CommentAwardRecord;
import com.vpu.mp.service.foundation.data.DelFlag;
import com.vpu.mp.service.foundation.service.ShopBaseService;
import com.vpu.mp.service.foundation.util.PageResult;
import com.vpu.mp.service.pojo.shop.market.commentaward.CommentAwardListParam;
import com.vpu.mp.service.pojo.shop.market.commentaward.CommentAwardListVo;
import com.vpu.mp.service.pojo.shop.market.commentaward.CommentAwardParam;
import com.vpu.mp.service.pojo.shop.market.commentaward.CommentAwardVo;

import javax.validation.Valid;

/**
 * @author 孔德成
 * @date 2019/8/20 13:57
 */
@Service
public class CommentAwardService extends ShopBaseService {


    /**
     * 添加
     * @param param commentAward
     * @return  1成功
     */
    public int addCommentAwardActivity(CommentAwardParam param) {
        param.setId(null);
        CommentAwardRecord record  =db().newRecord(COMMENT_AWARD,param);
        return  record.insert();
    }

    /**
     * 跟新
     * @param param commentAward
     * @return 1 成功
     */
    public int updateCommentAwardActivity(CommentAwardParam param) {
        if (param.getId()!=null){
            CommentAwardRecord record  =db().newRecord(COMMENT_AWARD,param);
            return  record.update();
        }
        return 0;
    }

    /**
     * 跟新妆台1
     * @param id id
     * @return 1 成功
     */
    public int changeCommentAwardActivity(Integer id) {
        Byte status = db().select(COMMENT_AWARD.STATUS).from(COMMENT_AWARD)
                .where(COMMENT_AWARD.ID.eq(id)).fetchOne().component1();
        if (ACTIVITY_STATUS_DISABLE.equals(status)){
            return db().update(COMMENT_AWARD).set(COMMENT_AWARD.STATUS, ACTIVITY_STATUS_NORMAL)
                    .where(COMMENT_AWARD.ID.eq(id)).execute();
        }else {
           return  db().update(COMMENT_AWARD).set(COMMENT_AWARD.STATUS,ACTIVITY_STATUS_DISABLE)
                    .where(COMMENT_AWARD.ID.eq(id)).execute();
        }
    }


    /**
     *  查询单个活动
     * @param id id
     * @return commentAwardVo
     */
    public CommentAwardVo getCommentAwardActivity(Integer id) {
        CommentAwardVo commentAwardVo = db().select().from(COMMENT_AWARD)
                .where(COMMENT_AWARD.ID.eq(id)).fetchOneInto(CommentAwardVo.class);
        return commentAwardVo;
    }


    /**
     * 查询列表
     * @param param
     * @return
     */
    public PageResult<CommentAwardListVo> getCommentAwardActivityList(CommentAwardListParam param) {
        SelectConditionStep<? extends Record> select = db()
                .select(COMMENT_AWARD.ID,
                        COMMENT_AWARD.NAME,
                        COMMENT_AWARD.GOODS_TYPE,
                        COMMENT_AWARD.AWARD_TYPE,
                        COMMENT_AWARD.IS_FOREVER,
                        COMMENT_AWARD.START_TIME,
                        COMMENT_AWARD.END_TIME,
                        COMMENT_AWARD.COMMENT_TYPE,
                        COMMENT_AWARD.LEVEL,
                        COMMENT_AWARD.STATUS)
                .from(COMMENT_AWARD)
                .where(COMMENT_AWARD.DEL_FLAG.eq(DelFlag.NORMAL_VALUE));
        buildParam(select,param);
        PageResult<CommentAwardListVo> pageResult = getPageResult(select, param.getCurrentPage(), param.getPageRows(), CommentAwardListVo.class);
        pageResult.getDataList().forEach(commentaward->{
            commentaward.setCurrentStatus(Util.getActStatus(commentaward.getStatus(),commentaward.getStartTime(),commentaward.getEndTime(),commentaward.getIsForever()));
        });
        return pageResult;
    }

    private void buildParam(SelectConditionStep<? extends Record> select, CommentAwardListParam param) {
        Timestamp nowTime =new Timestamp(System.currentTimeMillis());
        if (param.getNavType()!=null){
            switch (param.getNavType()){
                case BaseConstant.NAVBAR_TYPE_ONGOING:
                    select.and(COMMENT_AWARD.IS_FOREVER.eq(ACTIVITY_IS_FOREVER)
                            .or(COMMENT_AWARD.START_TIME.lt(nowTime).and(COMMENT_AWARD.END_TIME.gt(nowTime))))
                            .and(COMMENT_AWARD.STATUS.eq(ACTIVITY_STATUS_NORMAL));
                    break;
                case BaseConstant.NAVBAR_TYPE_NOT_STARTED:
                    select.and(COMMENT_AWARD.IS_FOREVER.eq(ACTIVITY_NOT_FOREVER))
                            .and(COMMENT_AWARD.START_TIME.gt(nowTime))
                            .and(COMMENT_AWARD.STATUS.eq(ACTIVITY_STATUS_NORMAL));
                    break;
                case BaseConstant.NAVBAR_TYPE_FINISHED:
                    select.and(COMMENT_AWARD.IS_FOREVER.eq(ACTIVITY_NOT_FOREVER))
                            .and(COMMENT_AWARD.END_TIME.lt(nowTime))
                            .and(COMMENT_AWARD.STATUS.eq(ACTIVITY_STATUS_NORMAL));
                    break;
                case BaseConstant.NAVBAR_TYPE_DISABLED:
                    select.and(COMMENT_AWARD.STATUS.eq(ACTIVITY_STATUS_DISABLE));
                    break;
                default:
            }
        }
    }

    /**
     * 删除活动
     * @param param
     * @return
     */
    public int deleteCommentAwardActivity(@Valid CommentAwardIdParam param) {
       return  db().update(COMMENT_AWARD).set(COMMENT_AWARD.DEL_FLAG, DelFlag.DISABLE_VALUE).where(COMMENT_AWARD.ID.eq(param.getId())).execute();
    }
}
