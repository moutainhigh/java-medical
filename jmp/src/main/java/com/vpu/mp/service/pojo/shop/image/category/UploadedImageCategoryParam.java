/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.service.pojo.shop.image.category;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * @author 新国，孔德成
 */
@Data
@NoArgsConstructor
public class UploadedImageCategoryParam {

    @NotNull
    private Integer imgCatId;
    @NotNull
    private Integer imgCatParentId;
    private Integer sort;

}
