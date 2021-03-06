/**
  * Copyright 2019 bejson.com 
  */
package com.vpu.mp.service.pojo.shop.recommend.order;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * Auto-generated: 2019-11-12 10:52:53
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
@Data
public class PlatformCategoryList {

	@JsonProperty(value = "category_id")
    private int categoryId;
	
	@JsonProperty(value = "category_name")
    private String categoryName;
}