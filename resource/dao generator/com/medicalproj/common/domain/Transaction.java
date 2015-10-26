package com.medicalproj.common.domain;

import java.util.Date;

public class Transaction {
    private Integer id;

    private String transId;

    private String payPlatformTransId;

    private Date createTime;

    private Integer status;

    private Integer type;

    private Integer amount;

    private String desc;

    private String remark;

    private Integer ownerUserId;

    private Integer payPlatformType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTransId() {
        return transId;
    }

    public void setTransId(String transId) {
        this.transId = transId == null ? null : transId.trim();
    }

    public String getPayPlatformTransId() {
        return payPlatformTransId;
    }

    public void setPayPlatformTransId(String payPlatformTransId) {
        this.payPlatformTransId = payPlatformTransId == null ? null : payPlatformTransId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getOwnerUserId() {
        return ownerUserId;
    }

    public void setOwnerUserId(Integer ownerUserId) {
        this.ownerUserId = ownerUserId;
    }

    public Integer getPayPlatformType() {
        return payPlatformType;
    }

    public void setPayPlatformType(Integer payPlatformType) {
        this.payPlatformType = payPlatformType;
    }
}