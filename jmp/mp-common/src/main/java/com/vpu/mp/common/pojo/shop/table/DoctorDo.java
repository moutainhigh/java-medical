/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.common.pojo.shop.table;


import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * @author chenjie
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@Data
public class DoctorDo   {

    private static final long serialVersionUID = -713395963;

    private Integer    id;
    private Integer    age;
    private Integer    workTime;
    private Byte       sex;
    private String     name;
    private String     url;
    private Byte       duty;
    private String     hospitalCode;
    private String     certificateCode;
    private String     professionalCode;
    private Date       registerTime;
    private String     registerHospital;
    private String     mobile;
    private Integer    titleId;
    private BigDecimal consultationPrice;
    private String     treatDisease;
    private Byte       status;
    private Integer    userId;
    private Byte       isDelete;
    private Timestamp  createTime;
    private Timestamp  updateTime;
    private Timestamp  onDutyTime;
    private Byte       isOnDuty;
    private Byte       canConsultation;
    private Integer    avgAnswerTime;
    private Integer    consultationNumber;
    private BigDecimal avgCommentStar;
    private Integer    attentionNumber;
    private String     userToken;
    private Timestamp  authTime;
    private BigDecimal consultationTotalMoney;
    private Byte       isFetch;
    private String     signature;
}
