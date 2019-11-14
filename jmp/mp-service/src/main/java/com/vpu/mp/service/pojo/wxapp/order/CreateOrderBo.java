package com.vpu.mp.service.pojo.wxapp.order;

import com.vpu.mp.db.shop.tables.records.OrderInfoRecord;
import com.vpu.mp.service.foundation.util.Util;
import com.vpu.mp.service.pojo.shop.member.address.UserAddressVo;
import com.vpu.mp.service.pojo.shop.order.OrderConstant;
import com.vpu.mp.service.pojo.shop.order.invoice.InvoiceVo;
import com.vpu.mp.service.pojo.shop.payment.PaymentVo;
import com.vpu.mp.service.pojo.shop.store.store.StorePojo;
import com.vpu.mp.service.pojo.wxapp.order.goods.OrderGoodsBo;
import com.vpu.mp.service.pojo.wxapp.order.marketing.coupon.OrderCouponVo;
import com.vpu.mp.service.pojo.wxapp.order.marketing.member.OrderMemberVo;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 创建订单bo
 * @author 王帅
 */
@Getter
@Setter
@Builder
@ToString
public class CreateOrderBo {
    private List<Byte> orderType;
    {
        orderType = new ArrayList<>();
    }
    private StorePojo store;
    private UserAddressVo address;
    private PaymentVo payment;
    private InvoiceVo invoice;
    private OrderMemberVo currencyMember;
    private OrderCouponVo currencyCupon;
    private List<OrderGoodsBo> orderGoodsBo;

    public void intoRecord(OrderInfoRecord orderRecord){
        if(address != null && !orderType.contains(OrderConstant.GOODS_TYPE_GIVE_GIFT)){
            //非送礼地址信息赋值
            orderRecord.setConsignee(address.getConsignee());
            orderRecord.setAddressId(address.getAddressId());
            orderRecord.setProvinceCode(address.getProvinceCode());
            orderRecord.setProvinceName(address.getProvinceName());
            orderRecord.setCityCode(address.getCityCode());
            orderRecord.setCityName(address.getCityName());
            orderRecord.setDistrictCode(address.getDistrictCode());
            orderRecord.setDistrictName(address.getDistrictName());
            orderRecord.setAddress(address.getAddress());
            orderRecord.setCompleteAddress(address.getCompleteAddress());
            orderRecord.setZipcode(address.getZipcode());
            orderRecord.setMobile(address.getMobile());
        }
        if (invoice != null) {
            //发票信息
            orderRecord.setInvoiceId(invoice.getId());
            orderRecord.setInvoiceContent((int)invoice.getType());
            orderRecord.setInvoiceTitle(Util.toJson(invoice.getTitle()));
        }
    }
}
