package com.vpu.mp.controller.admin;

import com.vpu.mp.common.foundation.data.JsonResult;
import com.vpu.mp.common.foundation.util.RequestUtil;
import com.vpu.mp.service.foundation.exception.MpException;
import com.vpu.mp.service.pojo.shop.distribution.withdraw.WithdrawAuditParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 分销提现相关
 * @author ws
 */
@RestController
@RequestMapping("/api/admin/distribution/withdraw")
public class AdminDistributionWithdrawController extends AdminBaseController {
    /**
     * 提现审核出账
     * @param param
     * @return
     * @throws MpException
     */
    @PostMapping("/audit")
    public JsonResult audit(@RequestBody WithdrawAuditParam param) throws MpException {
        param.setClientIp(RequestUtil.getIp(request));
        shop().withdrawService.audit(param);
        return this.success();
    }

}

