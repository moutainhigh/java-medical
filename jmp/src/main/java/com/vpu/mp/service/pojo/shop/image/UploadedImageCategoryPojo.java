/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.service.pojo.shop.image;


import java.sql.Timestamp;
import lombok.Data;

@Data
public class UploadedImageCategoryPojo  {
    private Integer   imgCatId;
    private Integer   shopId;
    private String    imgCatName;
    private Integer   imgCatParentId;
    private Timestamp createTime;
    private String    catIds;
    private Byte      level;
    private Integer   sort;

}
