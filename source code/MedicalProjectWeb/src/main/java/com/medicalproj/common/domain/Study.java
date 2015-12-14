package com.medicalproj.common.domain;

import java.util.Date;

public class Study {
    private Integer id;

    private Integer medicalCaseId;

    private String studyId;

    private Date studyDate;

    private Date createTime;

    private Integer status;

    private String modality;

    private String bodyPartExamined;

    private String studyDescription;

    private Integer isDiagnosed;

    private String diagnoseImagePerformance;

    private String diagnoseImageResult;

    private Integer diagnoseUserId;

    private Date diagnoseTime;

    private Integer isFirstReviewed;

    private String firstReviewImagePerformance;

    private String firstReviewImageResult;

    private Integer firstReviewUserId;

    private Date firstReviewTime;

    private Integer isFinalReviewed;

    private String finalReviewImagePerformance;

    private String finalReviewImageResult;

    private Integer finalReviewRemark;

    private Integer finalReviewUserId;

    private Date finalReviewTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMedicalCaseId() {
        return medicalCaseId;
    }

    public void setMedicalCaseId(Integer medicalCaseId) {
        this.medicalCaseId = medicalCaseId;
    }

    public String getStudyId() {
        return studyId;
    }

    public void setStudyId(String studyId) {
        this.studyId = studyId == null ? null : studyId.trim();
    }

    public Date getStudyDate() {
        return studyDate;
    }

    public void setStudyDate(Date studyDate) {
        this.studyDate = studyDate;
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

    public String getModality() {
        return modality;
    }

    public void setModality(String modality) {
        this.modality = modality == null ? null : modality.trim();
    }

    public String getBodyPartExamined() {
        return bodyPartExamined;
    }

    public void setBodyPartExamined(String bodyPartExamined) {
        this.bodyPartExamined = bodyPartExamined == null ? null : bodyPartExamined.trim();
    }

    public String getStudyDescription() {
        return studyDescription;
    }

    public void setStudyDescription(String studyDescription) {
        this.studyDescription = studyDescription == null ? null : studyDescription.trim();
    }

    public Integer getIsDiagnosed() {
        return isDiagnosed;
    }

    public void setIsDiagnosed(Integer isDiagnosed) {
        this.isDiagnosed = isDiagnosed;
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

    public Integer getIsFirstReviewed() {
        return isFirstReviewed;
    }

    public void setIsFirstReviewed(Integer isFirstReviewed) {
        this.isFirstReviewed = isFirstReviewed;
    }

    public String getFirstReviewImagePerformance() {
        return firstReviewImagePerformance;
    }

    public void setFirstReviewImagePerformance(String firstReviewImagePerformance) {
        this.firstReviewImagePerformance = firstReviewImagePerformance == null ? null : firstReviewImagePerformance.trim();
    }

    public String getFirstReviewImageResult() {
        return firstReviewImageResult;
    }

    public void setFirstReviewImageResult(String firstReviewImageResult) {
        this.firstReviewImageResult = firstReviewImageResult == null ? null : firstReviewImageResult.trim();
    }

    public Integer getFirstReviewUserId() {
        return firstReviewUserId;
    }

    public void setFirstReviewUserId(Integer firstReviewUserId) {
        this.firstReviewUserId = firstReviewUserId;
    }

    public Date getFirstReviewTime() {
        return firstReviewTime;
    }

    public void setFirstReviewTime(Date firstReviewTime) {
        this.firstReviewTime = firstReviewTime;
    }

    public Integer getIsFinalReviewed() {
        return isFinalReviewed;
    }

    public void setIsFinalReviewed(Integer isFinalReviewed) {
        this.isFinalReviewed = isFinalReviewed;
    }

    public String getFinalReviewImagePerformance() {
        return finalReviewImagePerformance;
    }

    public void setFinalReviewImagePerformance(String finalReviewImagePerformance) {
        this.finalReviewImagePerformance = finalReviewImagePerformance == null ? null : finalReviewImagePerformance.trim();
    }

    public String getFinalReviewImageResult() {
        return finalReviewImageResult;
    }

    public void setFinalReviewImageResult(String finalReviewImageResult) {
        this.finalReviewImageResult = finalReviewImageResult == null ? null : finalReviewImageResult.trim();
    }

    public Integer getFinalReviewRemark() {
        return finalReviewRemark;
    }

    public void setFinalReviewRemark(Integer finalReviewRemark) {
        this.finalReviewRemark = finalReviewRemark;
    }

    public Integer getFinalReviewUserId() {
        return finalReviewUserId;
    }

    public void setFinalReviewUserId(Integer finalReviewUserId) {
        this.finalReviewUserId = finalReviewUserId;
    }

    public Date getFinalReviewTime() {
        return finalReviewTime;
    }

    public void setFinalReviewTime(Date finalReviewTime) {
        this.finalReviewTime = finalReviewTime;
    }
}