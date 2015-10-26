package com.medicalproj.common.domain;

import java.util.Date;

public class User {
    private Integer id;

    private String name;

    private String mobile;

    private String email;

    private String password;

    private Integer userType;

    private Integer balance;

    private Date regTime;

    private String verifyCode;

    private Date verifyCodeUpdateTime;

    private Integer isReceiveNotification;

    private String companyContactUserName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode == null ? null : verifyCode.trim();
    }

    public Date getVerifyCodeUpdateTime() {
        return verifyCodeUpdateTime;
    }

    public void setVerifyCodeUpdateTime(Date verifyCodeUpdateTime) {
        this.verifyCodeUpdateTime = verifyCodeUpdateTime;
    }

    public Integer getIsReceiveNotification() {
        return isReceiveNotification;
    }

    public void setIsReceiveNotification(Integer isReceiveNotification) {
        this.isReceiveNotification = isReceiveNotification;
    }

    public String getCompanyContactUserName() {
        return companyContactUserName;
    }

    public void setCompanyContactUserName(String companyContactUserName) {
        this.companyContactUserName = companyContactUserName == null ? null : companyContactUserName.trim();
    }
}