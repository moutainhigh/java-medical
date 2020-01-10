/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RecordAdminAction implements Serializable {

    private static final long serialVersionUID = 163242420;

    private Integer   id;
    private Integer   sysId;
    private Integer   accountId;
    private Byte      actionType;
    private String    templateId;
    private String    templateData;
    private String    userName;
    private String    mobile;
    private Timestamp createTime;
    private Timestamp updateTime;
    private Byte      accountType;

    public RecordAdminAction() {}

    public RecordAdminAction(RecordAdminAction value) {
        this.id = value.id;
        this.sysId = value.sysId;
        this.accountId = value.accountId;
        this.actionType = value.actionType;
        this.templateId = value.templateId;
        this.templateData = value.templateData;
        this.userName = value.userName;
        this.mobile = value.mobile;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
        this.accountType = value.accountType;
    }

    public RecordAdminAction(
        Integer   id,
        Integer   sysId,
        Integer   accountId,
        Byte      actionType,
        String    templateId,
        String    templateData,
        String    userName,
        String    mobile,
        Timestamp createTime,
        Timestamp updateTime,
        Byte      accountType
    ) {
        this.id = id;
        this.sysId = sysId;
        this.accountId = accountId;
        this.actionType = actionType;
        this.templateId = templateId;
        this.templateData = templateData;
        this.userName = userName;
        this.mobile = mobile;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.accountType = accountType;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSysId() {
        return this.sysId;
    }

    public void setSysId(Integer sysId) {
        this.sysId = sysId;
    }

    public Integer getAccountId() {
        return this.accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Byte getActionType() {
        return this.actionType;
    }

    public void setActionType(Byte actionType) {
        this.actionType = actionType;
    }

    public String getTemplateId() {
        return this.templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public String getTemplateData() {
        return this.templateData;
    }

    public void setTemplateData(String templateData) {
        this.templateData = templateData;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
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

    public Byte getAccountType() {
        return this.accountType;
    }

    public void setAccountType(Byte accountType) {
        this.accountType = accountType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("RecordAdminAction (");

        sb.append(id);
        sb.append(", ").append(sysId);
        sb.append(", ").append(accountId);
        sb.append(", ").append(actionType);
        sb.append(", ").append(templateId);
        sb.append(", ").append(templateData);
        sb.append(", ").append(userName);
        sb.append(", ").append(mobile);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);
        sb.append(", ").append(accountType);

        sb.append(")");
        return sb.toString();
    }
}
