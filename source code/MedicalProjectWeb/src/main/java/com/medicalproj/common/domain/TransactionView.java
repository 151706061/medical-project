package com.medicalproj.common.domain;

public class TransactionView {
    private Integer transId;

    private String transTime;

    private String transAmount;

    private String transDesc;

    private Integer ownerUserId;

    private String transType;

    public Integer getTransId() {
        return transId;
    }

    public void setTransId(Integer transId) {
        this.transId = transId;
    }

    public String getTransTime() {
        return transTime;
    }

    public void setTransTime(String transTime) {
        this.transTime = transTime == null ? null : transTime.trim();
    }

    public String getTransAmount() {
        return transAmount;
    }

    public void setTransAmount(String transAmount) {
        this.transAmount = transAmount == null ? null : transAmount.trim();
    }

    public String getTransDesc() {
        return transDesc;
    }

    public void setTransDesc(String transDesc) {
        this.transDesc = transDesc == null ? null : transDesc.trim();
    }

    public Integer getOwnerUserId() {
        return ownerUserId;
    }

    public void setOwnerUserId(Integer ownerUserId) {
        this.ownerUserId = ownerUserId;
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType == null ? null : transType.trim();
    }
}