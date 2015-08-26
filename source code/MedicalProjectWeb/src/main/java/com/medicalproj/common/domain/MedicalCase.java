package com.medicalproj.common.domain;

import java.util.Date;

public class MedicalCase {
    private Integer id;

    private String diagnoseImagePerformance;

    private String diagnoseImageResult;

    private Integer diagnoseUserId;

    private Date diagnoseTime;

    private Integer reviewUserId;

    private String reviewImagePerformance;

    private String reviewImageResult;

    private Date reviewTime;

    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDiagnoseImagePerformance() {
        return diagnoseImagePerformance;
    }

    public void setDiagnoseImagePerformance(String diagnoseImagePerformance) {
        this.diagnoseImagePerformance = diagnoseImagePerformance == null ? null : diagnoseImagePerformance.trim();
    }

    public String getDiagnoseImageResult() {
        return diagnoseImageResult;
    }

    public void setDiagnoseImageResult(String diagnoseImageResult) {
        this.diagnoseImageResult = diagnoseImageResult == null ? null : diagnoseImageResult.trim();
    }

    public Integer getDiagnoseUserId() {
        return diagnoseUserId;
    }

    public void setDiagnoseUserId(Integer diagnoseUserId) {
        this.diagnoseUserId = diagnoseUserId;
    }

    public Date getDiagnoseTime() {
        return diagnoseTime;
    }

    public void setDiagnoseTime(Date diagnoseTime) {
        this.diagnoseTime = diagnoseTime;
    }

    public Integer getReviewUserId() {
        return reviewUserId;
    }

    public void setReviewUserId(Integer reviewUserId) {
        this.reviewUserId = reviewUserId;
    }

    public String getReviewImagePerformance() {
        return reviewImagePerformance;
    }

    public void setReviewImagePerformance(String reviewImagePerformance) {
        this.reviewImagePerformance = reviewImagePerformance == null ? null : reviewImagePerformance.trim();
    }

    public String getReviewImageResult() {
        return reviewImageResult;
    }

    public void setReviewImageResult(String reviewImageResult) {
        this.reviewImageResult = reviewImageResult == null ? null : reviewImageResult.trim();
    }

    public Date getReviewTime() {
        return reviewTime;
    }

    public void setReviewTime(Date reviewTime) {
        this.reviewTime = reviewTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}