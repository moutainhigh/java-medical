package com.vpu.mp.service.pojo.shop.doctor;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author chenjie
 * @date 2020年08月13日
 */
@Data
public class DoctorSortParam {
    /**
     * 医师Id
     */
    private Integer    doctorId;
    /**
     * 平均响应时间
     */
    private Integer    avgAnswerTime;
    /**
     * 接诊数
     */
    private Integer    consultationNumber;
    /**
     * 平均评分
     */
    private BigDecimal avgCommentStar;
}
