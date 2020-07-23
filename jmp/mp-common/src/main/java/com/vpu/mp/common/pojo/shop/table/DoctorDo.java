/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.common.pojo.shop.table;


import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 医师表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DoctorDo implements Serializable {

    private static final long serialVersionUID = -763385213;

    private Integer   id;
    private Integer   accountId;
    private Integer   age;
    private Integer   workTime;
    private Byte      sex;
    private String    name;
    private String    url;
    private Byte      duty;
    private String    hospitalCode;
    private String    certificateCode;
    private String    professionalCode;
    private Date      registerTime;
    private String    registerHospital;
    private String    mobile;
    private Integer   titleId;
    private Byte      status;
    private Integer   userId;
    private Byte      isDelete;
    private Timestamp createTime;
    private Timestamp updateTime;

    public DoctorDo() {}

    public DoctorDo(DoctorDo value) {
        this.id = value.id;
        this.accountId = value.accountId;
        this.age = value.age;
        this.workTime = value.workTime;
        this.sex = value.sex;
        this.name = value.name;
        this.url = value.url;
        this.duty = value.duty;
        this.hospitalCode = value.hospitalCode;
        this.certificateCode = value.certificateCode;
        this.professionalCode = value.professionalCode;
        this.registerTime = value.registerTime;
        this.registerHospital = value.registerHospital;
        this.mobile = value.mobile;
        this.titleId = value.titleId;
        this.status = value.status;
        this.userId = value.userId;
        this.isDelete = value.isDelete;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
    }

    public DoctorDo(
        Integer   id,
        Integer   accountId,
        Integer   age,
        Integer   workTime,
        Byte      sex,
        String    name,
        String    url,
        Byte      duty,
        String    hospitalCode,
        String    certificateCode,
        String    professionalCode,
        Date      registerTime,
        String    registerHospital,
        String    mobile,
        Integer   titleId,
        Byte      status,
        Integer   userId,
        Byte      isDelete,
        Timestamp createTime,
        Timestamp updateTime
    ) {
        this.id = id;
        this.accountId = accountId;
        this.age = age;
        this.workTime = workTime;
        this.sex = sex;
        this.name = name;
        this.url = url;
        this.duty = duty;
        this.hospitalCode = hospitalCode;
        this.certificateCode = certificateCode;
        this.professionalCode = professionalCode;
        this.registerTime = registerTime;
        this.registerHospital = registerHospital;
        this.mobile = mobile;
        this.titleId = titleId;
        this.status = status;
        this.userId = userId;
        this.isDelete = isDelete;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAccountId() {
        return this.accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getWorkTime() {
        return this.workTime;
    }

    public void setWorkTime(Integer workTime) {
        this.workTime = workTime;
    }

    public Byte getSex() {
        return this.sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Byte getDuty() {
        return this.duty;
    }

    public void setDuty(Byte duty) {
        this.duty = duty;
    }

    public String getHospitalCode() {
        return this.hospitalCode;
    }

    public void setHospitalCode(String hospitalCode) {
        this.hospitalCode = hospitalCode;
    }

    public String getCertificateCode() {
        return this.certificateCode;
    }

    public void setCertificateCode(String certificateCode) {
        this.certificateCode = certificateCode;
    }

    public String getProfessionalCode() {
        return this.professionalCode;
    }

    public void setProfessionalCode(String professionalCode) {
        this.professionalCode = professionalCode;
    }

    public Date getRegisterTime() {
        return this.registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public String getRegisterHospital() {
        return this.registerHospital;
    }

    public void setRegisterHospital(String registerHospital) {
        this.registerHospital = registerHospital;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getTitleId() {
        return this.titleId;
    }

    public void setTitleId(Integer titleId) {
        this.titleId = titleId;
    }

    public Byte getStatus() {
        return this.status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Byte getIsDelete() {
        return this.isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    public Timestamp getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("DoctorDo (");

        sb.append(id);
        sb.append(", ").append(accountId);
        sb.append(", ").append(age);
        sb.append(", ").append(workTime);
        sb.append(", ").append(sex);
        sb.append(", ").append(name);
        sb.append(", ").append(url);
        sb.append(", ").append(duty);
        sb.append(", ").append(hospitalCode);
        sb.append(", ").append(certificateCode);
        sb.append(", ").append(professionalCode);
        sb.append(", ").append(registerTime);
        sb.append(", ").append(registerHospital);
        sb.append(", ").append(mobile);
        sb.append(", ").append(titleId);
        sb.append(", ").append(status);
        sb.append(", ").append(userId);
        sb.append(", ").append(isDelete);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);

        sb.append(")");
        return sb.toString();
    }
}
