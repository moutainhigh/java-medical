package com.vpu.mp.service.pojo.shop.store.postsale;

import java.sql.Timestamp;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.vpu.mp.service.foundation.JsonResultMessage;
import com.vpu.mp.service.shop.store.postsale.ServiceTechnicianService;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 黄荣刚
 * @date 2019年7月16日
 *售后信息 修改或保存入参
 */
@Data
@NoArgsConstructor
public class ServiceTechnicianParam {
	
	private Integer id;
	@NotNull(message = JsonResultMessage.STORE_STORE_ID_NULL)
	private Integer storeId;
	@NotBlank(message = JsonResultMessage.STORE_TECHNICIAN_NAME_NULL)
	private String technicianName;
	@NotBlank(message = JsonResultMessage.STORE_TECHNICIAN_TELEPHONE_NULL)
	@Pattern(regexp = "^[0-9]{11}$",message = JsonResultMessage.STORE_TECHNICIAN_TELEPHONE_ILLEGAL)
	private String technicianMobile;
	private String bgImgPath;
	private String technicianIntroduce;
	private Integer groupId;
	private Byte serviceType = ServiceTechnicianService.SERVICE_TYPE_ALL;
	private List<Integer> serviceList;
	private String remarks;

}
