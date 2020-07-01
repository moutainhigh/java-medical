package com.vpu.jmd.service.shop.bo.officeAccount;

import com.vpu.mp.db.main.tables.records.ShopAccountRecord;
import com.vpu.mp.service.pojo.saas.shop.ShopChildAccountPojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 *
 * @author zhaojianqiang 2020年4月13日下午3:34:26
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CanSendVo {
	private Boolean canSend = false;
	private ShopAccountRecord accountInfo;
	private List<ShopChildAccountPojo> subccountList;
}