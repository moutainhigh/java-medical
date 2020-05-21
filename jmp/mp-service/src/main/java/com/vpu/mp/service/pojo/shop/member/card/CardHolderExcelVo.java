package com.vpu.mp.service.pojo.shop.member.card;

import java.sql.Timestamp;
import java.util.Map;

import com.vpu.mp.service.foundation.excel.annotation.ExcelColumn;
import com.vpu.mp.service.foundation.excel.annotation.ExcelDynamicColumn;
import com.vpu.mp.service.foundation.excel.annotation.ExcelIgnore;
import com.vpu.mp.service.foundation.excel.annotation.ExcelSheet;

import lombok.Data;

/**
 * 持卡会员excel-出参
 * 
 * @author zhaojianqiang
 * @time 下午2:46:43
 */
@Data
@ExcelSheet
public class CardHolderExcelVo {
	/** - 会员ID */
	@ExcelColumn(columnIndex = 0, columnName = "usercard.import.userId")
	private Integer userId;
	
	/** - 昵称 */
	@ExcelColumn(columnIndex = 1, columnName = "usercard.import.username")
	private String username;
	
	@ExcelColumn(columnIndex = 2, columnName = "usercard.import.mobile")
	/** - 手机号 */
	private String mobile;
	
	@ExcelColumn(columnIndex = 3, columnName = "usercard.import.invitedName")
	/** - 邀请人 */
	private String invitedName;
	
	@ExcelColumn(columnIndex = 4, columnName = "usercard.import.nacreateTimeme")
	/** -领卡时间 */
	private Timestamp createTime;
	
	@ExcelColumn(columnIndex = 5, columnName = "usercard.import.cardNo")
	/** - 会员卡号 */
	private String cardNo;
	
	@ExcelColumn(columnIndex = 6, columnName = "usercard.import.nflag")
	private String nflag;
	
	
	@ExcelDynamicColumn
	private Map<String,Object> other;
	
	
	/** -过期时间 */
	@ExcelIgnore
	private Timestamp expireTime;
	@ExcelIgnore
	private Byte flag;
	/** 更新时间 */
	@ExcelIgnore
	private Timestamp updateTime;
	/**	审核状态 */
	@ExcelIgnore
	private Byte status;
}
