package com.vpu.mp.service.pojo.shop.prescription;

import com.vpu.mp.common.pojo.shop.base.BasePageParam;
import com.vpu.mp.service.pojo.shop.patient.UserPatientParam;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author 孔德成
 * @date 2020/7/6 9:36
 */
@Data
public class PrescriptionPatientListParam  extends BasePageParam {

    /**
     * 患者id
     */
    @NotNull
    private Integer patientId;

    private Integer userId;

    private UserPatientParam userPatientParam;

    private List<String> prescriptionNos;
}