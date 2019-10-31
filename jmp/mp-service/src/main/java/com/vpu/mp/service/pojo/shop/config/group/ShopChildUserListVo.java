package com.vpu.mp.service.pojo.shop.config.group;


import java.sql.Timestamp;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vpu.mp.service.foundation.util.PageResult;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 子账户管理返回
 * 
 * @author zhaojianqiang
 *
 */
@Data
@NoArgsConstructor
public class ShopChildUserListVo {
	private Integer accountId;
	private String accountName;
	private String mobile;
	private Timestamp createTime;
	
	private List<ShopChildUserShopInfoVo> shopInfo;
	
}
