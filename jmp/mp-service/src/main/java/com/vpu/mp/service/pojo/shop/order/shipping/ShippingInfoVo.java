package com.vpu.mp.service.pojo.shop.order.shipping;

import java.math.BigDecimal;
import java.sql.Timestamp;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
/**
 * 	可发货信息
 * @author 王帅
 *
 */
@Getter
@Setter
public class ShippingInfoVo extends BaseShippingInfoVo{
	/**商品信息*/
	private List<Goods> goods;
	/**批次号：相同为同一批*/
	private String batchNo;
	@Data
	@AllArgsConstructor
	public static class Goods{
		/**id,方便修改物流单号*/
		private Integer orderGoodsId;
		private String goodsName;
		/**属性（规格）*/
		private String goodsAttr;
		/**发货数量*/
		private String sendNumber;
		private String goodsImg;
		private BigDecimal goodsPrice;
	}
	/*
	 * 以下属性不参与pojo->json
	 */
	/**id,方便修改物流单号*/
	@JsonIgnore
	private Integer recId;
	@JsonIgnore
	private String goodsName;
	/**属性（规格）*/
	@JsonIgnore
	private String goodsAttr;
	/**发货数量*/
	@JsonIgnore
	private String sendNumber;
	@JsonIgnore
	private Integer orderGoodsId;
	@Override
	public boolean equals(Object obj) {
		return ((ShippingInfoVo)obj).getBatchNo().equals(batchNo) ? true : false;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((goods == null) ? 0 : goods.hashCode());
		result = prime * result + ((confirmTime == null) ? 0 : confirmTime.hashCode());
		result = prime * result + ((goodsAttr == null) ? 0 : goodsAttr.hashCode());
		result = prime * result + ((goodsName == null) ? 0 : goodsName.hashCode());
		result = prime * result + ((orderSn == null) ? 0 : orderSn.hashCode());
		result = prime * result + ((recId == null) ? 0 : recId.hashCode());
		result = prime * result + ((sendNumber == null) ? 0 : sendNumber.hashCode());
		result = prime * result + ((shippingName == null) ? 0 : shippingName.hashCode());
		result = prime * result + ((shippingNo == null) ? 0 : shippingNo.hashCode());
		result = prime * result + ((shippingTime == null) ? 0 : shippingTime.hashCode());
		return result;
	}
}
