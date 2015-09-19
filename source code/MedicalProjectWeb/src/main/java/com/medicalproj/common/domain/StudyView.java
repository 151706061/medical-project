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

    private String reviewImagePerformance;

    private String reviewImageResult;

    private Integer reviewUserId;

    private String reviewUserName;

    private String reviewTime;

    private String status;

    private String modality;

    private String bodyPartExamined;

    private String stydyDescription;

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

    public Integer getReviewUserId() {
        return reviewUserId;
    }

    public void setReviewUserId(Integer reviewUserId) {
        this.reviewUserId = reviewUserId;
    }

    public String getReviewUserName() {
        return reviewUserName;
    }

    public void setReviewUserName(String reviewUserName) {
        this.reviewUserName = reviewUserName == null ? null : reviewUserName.trim();
    }

    public String getReviewTime() {
        return reviewTime;
    }

    public void setReviewTime(String reviewTime) {
        this.reviewTime = reviewTime == null ? null : reviewTime.trim();
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

    public String getStydyDescription() {
        return stydyDescription;
    }

    public void setStydyDescription(String stydyDescription) {
        this.stydyDescription = stydyDescription == null ? null : stydyDescription.trim();
    }
}