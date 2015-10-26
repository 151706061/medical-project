package com.medicalproj.common.domain;

import java.util.Date;

public class PayAuthorize {
    private Integer id;

    private Integer userId;

    private Integer enterpriseUserId;

    private Date applyTime;

    private Date processTime;

    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getEnterpriseUserId() {
        return enterpriseUserId;
    }

    public void setEnterpriseUserId(Integer enterpriseUserId) {
        this.enterpriseUserId = enterpriseUserId;
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public Date getProcessTime() {
        return processTime;
    }

    public void setProcessTime(Date processTime) {
        this.processTime = processTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}