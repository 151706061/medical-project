package com.medicalproj.common.domain;

public class QualificationApplicationView {
    private Integer id;

    private String applyTime;

    private Integer applyUserId;

    private String applyUserName;

    private String applyUserMoobile;

    private String applyUserEmail;

    private String yszgzImgRelativePath;

    private Integer reviewUserId;

    private String reviewUserName;

    private String reviewUserMobile;

    private String reviewUserEmail;

    private String reviewTime;

    private String reviewText;

    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(String applyTime) {
        this.applyTime = applyTime == null ? null : applyTime.trim();
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

    public String getApplyUserMoobile() {
        return applyUserMoobile;
    }

    public void setApplyUserMoobile(String applyUserMoobile) {
        this.applyUserMoobile = applyUserMoobile == null ? null : applyUserMoobile.trim();
    }

    public String getApplyUserEmail() {
        return applyUserEmail;
    }

    public void setApplyUserEmail(String applyUserEmail) {
        this.applyUserEmail = applyUserEmail == null ? null : applyUserEmail.trim();
    }

    public String getYszgzImgRelativePath() {
        return yszgzImgRelativePath;
    }

    public void setYszgzImgRelativePath(String yszgzImgRelativePath) {
        this.yszgzImgRelativePath = yszgzImgRelativePath == null ? null : yszgzImgRelativePath.trim();
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

    public String getReviewUserMobile() {
        return reviewUserMobile;
    }

    public void setReviewUserMobile(String reviewUserMobile) {
        this.reviewUserMobile = reviewUserMobile == null ? null : reviewUserMobile.trim();
    }

    public String getReviewUserEmail() {
        return reviewUserEmail;
    }

    public void setReviewUserEmail(String reviewUserEmail) {
        this.reviewUserEmail = reviewUserEmail == null ? null : reviewUserEmail.trim();
    }

    public String getReviewTime() {
        return reviewTime;
    }

    public void setReviewTime(String reviewTime) {
        this.reviewTime = reviewTime == null ? null : reviewTime.trim();
    }

    public String getReviewText() {
        return reviewText;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText == null ? null : reviewText.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}