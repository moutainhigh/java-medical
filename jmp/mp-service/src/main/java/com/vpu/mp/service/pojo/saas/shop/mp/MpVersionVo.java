/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.service.pojo.saas.shop.mp;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class MpVersionVo {
	private Integer templateId;
	private String userVersion;
	private String userDesc;
	private Timestamp createTime;
	private Byte delFlag;
	private Byte currentInUse;
	private Byte packageVersion;

}
