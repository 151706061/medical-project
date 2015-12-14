package com.medicalproj.common.domain;

public class StudyView {
    private Integer id;

    private Integer medicalCaseId;

    private String studyId;

    private String studyDate;

    private String createTime;

    private String diagnoseImagePerformance;

    private String diagnoseImageResult;

    private Integer diagnoseUserId;

    private String diagnoseUserName;

    private String diagnoseTime;

    private String firstReviewImagePerformance;

    private String firstReviewImageResult;

    private Integer firstReviewUserId;

    private String firstReviewUserName;

    private String firstReviewTime;

    private String finalReviewImagePerformance;

    private String finalReviewImageResult;

    private Integer finalReviewUserId;

    private String finalReviewUserName;

    private String finalReviewTime;

    private String status;

    private String modality;

    private String bodyPartExamined;

    private String studyDescription;

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

    public String getStudyDate() {
        return studyDate;
    }

    public void setStudyDate(String studyDate) {
        this.studyDate = studyDate == null ? null : studyDate.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
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

    public String getDiagnoseUserName() {
        return diagnoseUserName;
    }

    public void setDiagnoseUserName(String diagnoseUserName) {
        this.diagnoseUserName = diagnoseUserName == null ? null : diagnoseUserName.trim();
    }

    public String getDiagnoseTime() {
        return diagnoseTime;
    }

    public void setDiagnoseTime(String diagnoseTime) {
        this.diagnoseTime = diagnoseTime == null ? null : diagnoseTime.trim();
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

    public String getFirstReviewUserName() {
        return firstReviewUserName;
    }

    public void setFirstReviewUserName(String firstReviewUserName) {
        this.firstReviewUserName = firstReviewUserName == null ? null : firstReviewUserName.trim();
    }

    public String getFirstReviewTime() {
        return firstReviewTime;
    }

    public void setFirstReviewTime(String firstReviewTime) {
        this.firstReviewTime = firstReviewTime == null ? null : firstReviewTime.trim();
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

    public Integer getFinalReviewUserId() {
        return finalReviewUserId;
    }

    public void setFinalReviewUserId(Integer finalReviewUserId) {
        this.finalReviewUserId = finalReviewUserId;
    }

    public String getFinalReviewUserName() {
        return finalReviewUserName;
    }

    public void setFinalReviewUserName(String finalReviewUserName) {
        this.finalReviewUserName = finalReviewUserName == null ? null : finalReviewUserName.trim();
    }

    public String getFinalReviewTime() {
        return finalReviewTime;
    }

    public void setFinalReviewTime(String finalReviewTime) {
        this.finalReviewTime = finalReviewTime == null ? null : finalReviewTime.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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
}