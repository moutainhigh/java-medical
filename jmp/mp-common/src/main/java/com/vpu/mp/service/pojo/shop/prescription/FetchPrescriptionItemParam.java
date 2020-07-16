package com.vpu.mp.service.pojo.shop.prescription;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

/**
 * @Description
 * @Author zhaoxiaodong
 * @create 2020-07-16 14:34
 */

@Data
@NoArgsConstructor
public class FetchPrescriptionItemParam {
    @NonNull
    private String prescriptionCode;
}
