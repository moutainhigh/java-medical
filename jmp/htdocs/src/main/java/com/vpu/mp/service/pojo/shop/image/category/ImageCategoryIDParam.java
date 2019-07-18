package com.vpu.mp.service.pojo.shop.image.category;

import com.vpu.mp.service.foundation.JsonResultMessage;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author 孔德成
 * @date 2019/7/15 17:27
 */
@Data
@NoArgsConstructor
public class ImageCategoryIDParam {

    @NotNull( message = JsonResultMessage.MSG_IMAGE_CATEGORY_IMGCATID_NOT_NULL)
    private Integer imgCatId;
}
