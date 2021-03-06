package com.vpu.mp.service.pojo.shop.member.exception;

import com.vpu.mp.common.foundation.data.JsonResultCode;
import com.vpu.mp.service.foundation.exception.MpException;
/**
 * 
 * @author 黄壮壮
 * 	会员卡激活异常
 */
public class CardActivateException extends MpException {
	private static final long serialVersionUID = 1L;
	public CardActivateException(Exception e) {
		super(e);
	}
	public CardActivateException() {
		super(JsonResultCode.CODE_CARD_ACTIVATE_FAIL);
	}
	public CardActivateException(JsonResultCode errorCode) {
		super(errorCode);
	}

}
