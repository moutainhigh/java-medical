package com.vpu.mp.service.pojo.shop.order.write.operate.prescription;

import com.vpu.mp.common.foundation.util.Page;
import com.vpu.mp.service.pojo.shop.order.OrderConstant;
import com.vpu.mp.service.pojo.shop.order.write.operate.AbstractOrderOperateQueryParam;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 订单审核查询
 * @author 孔德成
 * @date 2020/7/9 10:24
 */
@Data
public class PrescriptionQueryParam extends AbstractOrderOperateQueryParam {


    private Integer orderId;
    private Byte auditType = OrderConstant.MEDICAL_ORDER_AUDIT_TYPE_AUDIT;
    private Byte auditStatus =OrderConstant.MEDICAL_AUDIT_DEFAULT;

    @NotNull
    private Integer accountId;

    private Integer currentPage = Page.DEFAULT_CURRENT_PAGE;

    private Integer pageRows = Page.DEFAULT_PAGE_ROWS;

}
