package com.vpu.mp.service.pojo.shop.goods.sort;

import com.vpu.mp.service.pojo.shop.goods.GoodsConstant;
import lombok.Data;

/**
 * @author 李晓冰
 * @date 2019年11月20日
 */
@Data
public class GoodsNormalSortAddParam {
    private String sortName;
    private Integer parentId;
    private Short level;
    private String sortImg;
    private String imgLink;
    private Short first;
    private Byte type  = GoodsConstant.NORMAL_SORT;
}
