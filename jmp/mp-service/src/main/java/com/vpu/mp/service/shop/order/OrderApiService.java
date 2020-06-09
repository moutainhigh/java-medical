package com.vpu.mp.service.shop.order;

import com.vpu.mp.config.ApiExternalGateConfig;
import com.vpu.mp.service.foundation.exception.MpException;
import com.vpu.mp.service.foundation.service.ShopBaseService;
import com.vpu.mp.service.foundation.util.Util;
import com.vpu.mp.service.pojo.saas.api.ApiExternalGateParam;
import com.vpu.mp.service.pojo.saas.api.ApiJsonResult;
import com.vpu.mp.service.pojo.shop.order.api.ApiReturnParam;
import com.vpu.mp.service.pojo.shop.order.api.ApiShippingParam;
import com.vpu.mp.service.shop.order.action.ReturnService;
import com.vpu.mp.service.shop.order.action.ShipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 王帅
 */
@Service
public class OrderApiService extends ShopBaseService {

    @Autowired
    public ShipService shipService;
    @Autowired
    public ReturnService returnService;
    /**
     * 发货
     * @param gateParam
     * @return
     */
    public ApiJsonResult shipping(ApiExternalGateParam gateParam) {
        try {
            return shipService.shippingApi(Util.parseJson(gateParam.getContent(), ApiShippingParam.class));
        } catch (MpException e) {
            ApiJsonResult apiJsonResult = new ApiJsonResult();
            apiJsonResult.setCode(ApiExternalGateConfig.ERROR_LACK_PARAM);
            apiJsonResult.setMsg(e.getMessage());
            return apiJsonResult;
        }
    }

    /**
     * 退款/退货
     * @param param
     * @return
     */
    public ApiJsonResult returnOrder(ApiExternalGateParam param) {
        return returnService.returnOrderApi(Util.parseJson(param.getContent(), ApiReturnParam.class));
    }
}
