package com.medicalproj.common.domain;

public class AuthorizeUserView {
    private Integer authId;

    private Integer applyUserId;

    private String applyUserName;

    private String applyUserEmail;

    private String applyUserMobile;

    private String applyTime;

    private String authorizeStatus;

    private String processTime;

    private Integer enterpriseUserId;

    private String enterpriseUserName;

    public Integer getAuthId() {
        return authId;
    }

    public void setAuthId(Integer authId) {
        this.authId = authId;
    }

    public Integer getApplyUserId() {
        return applyUserId;
    }

    public void setApplyUserId(Integer applyUserId) {
        this.applyUserId = applyUserId;
    }

    public String getApplyUserName() {
        return applyUserName;
    }

    public void setApplyUserName(String applyUserName) {
        this.applyUserName = applyUserName == null ? null : applyUserName.trim();
    }

    public String getApplyUserEmail() {
        return applyUserEmail;
    }

    public void setApplyUserEmail(String applyUserEmail) {
        this.applyUserEmail = applyUserEmail == null ? null : applyUserEmail.trim();
    }

    public String getApplyUserMobile() {
        return applyUserMobile;
    }

    public void setApplyUserMobile(String applyUserMobile) {
        this.applyUserMobile = applyUserMobile == null ? null : applyUserMobile.trim();
    }

    public String getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(String applyTime) {
        this.applyTime = applyTime == null ? null : applyTime.trim();
    }

    public String getAuthorizeStatus() {
        return authorizeStatus;
    }

    public void setAuthorizeStatus(String authorizeStatus) {
        this.authorizeStatus = authorizeStatus == null ? null : authorizeStatus.trim();
    }

    public String getProcessTime() {
        return processTime;
    }

    public void setProcessTime(String processTime) {
        this.processTime = processTime == null ? null : processTime.trim();
    }

    public Integer getEnterpriseUserId() {
        return enterpriseUserId;
    }

    public void setEnterpriseUserId(Integer enterpriseUserId) {
        this.enterpriseUserId = enterpriseUserId;
    }

    public String getEnterpriseUserName() {
        return enterpriseUserName;
    }

    public void setEnterpriseUserName(String enterpriseUserName) {
        this.enterpriseUserName = enterpriseUserName == null ? null : enterpriseUserName.trim();
    }
}