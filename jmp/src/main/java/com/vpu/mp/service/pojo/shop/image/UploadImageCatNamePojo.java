package com.vpu.mp.service.pojo.shop.image;

import java.sql.Timestamp;

import lombok.Data;

/**
 * 
 * @author 新国
 *
 */
@Data
public class UploadImageCatNamePojo {
	 private Integer   imgId;
	    private String    imgType;
	    private Integer   imgSize;
	    private String    imgName;
	    private String    imgPath;
	    private String    imgUrl;
	    private Integer   imgCatId;
	    private Integer   imgWidth;
	    private Integer   imgHeight;
	    private Timestamp uploadTime;
	 private String    imgCatName;
}
