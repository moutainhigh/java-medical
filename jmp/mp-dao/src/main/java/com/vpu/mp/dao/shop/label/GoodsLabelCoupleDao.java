package com.vpu.mp.dao.shop.label;

import com.vpu.mp.common.pojo.shop.table.GoodsLabelCoupleDo;
import com.vpu.mp.dao.foundation.base.ShopBaseDao;
import com.vpu.mp.db.shop.tables.records.GoodsLabelCoupleRecord;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

import static com.vpu.mp.db.shop.Tables.GOODS_LABEL_COUPLE;

/**
 * @author 李晓冰
 * @date 2020年07月02日
 */

@Repository
public class GoodsLabelCoupleDao extends ShopBaseDao {

    /**
     * 批量新增关联关系
     * @param goodsLabelCoupleDos
     */
    public void batchInsert(List<GoodsLabelCoupleDo> goodsLabelCoupleDos){
        List<GoodsLabelCoupleRecord> goodsLabelCoupleRecords = new ArrayList<>(goodsLabelCoupleDos.size());

        for (GoodsLabelCoupleDo goodsLabelCoupleDo : goodsLabelCoupleDos) {
            GoodsLabelCoupleRecord record = new GoodsLabelCoupleRecord();
            record.setLabelId(goodsLabelCoupleDo.getLabelId());
            record.setGtaId(goodsLabelCoupleDo.getGtaId());
            record.setType(goodsLabelCoupleDo.getType());
            goodsLabelCoupleRecords.add(record);
        }

        db().batchInsert(goodsLabelCoupleRecords).execute();
    }

    /**
     * 删除标签关联信息
     * @param gtaIds
     * @param gtaType
     */
    public void deleteCouple(List<Integer> gtaIds, Byte gtaType){
        db().deleteFrom(GOODS_LABEL_COUPLE).where(GOODS_LABEL_COUPLE.GTA_ID.in(gtaIds).and(GOODS_LABEL_COUPLE.TYPE.eq(gtaType)))
            .execute();
    }
}