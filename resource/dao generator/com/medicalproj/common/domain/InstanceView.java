package com.medicalproj.common.domain;

public class InstanceView {
    private Integer id;

    private Integer dicomFileId;

    private String dicomFilePath;

    private Integer jpgFileId;

    private String jpgFilePath;

    private Integer dicomFileSize;

    private String uploadTime;

    private String dicomMd5;

    private String instanceNumber;

    private Integer seriesId;

    private String createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDicomFileId() {
        return dicomFileId;
    }

    public void setDicomFileId(Integer dicomFileId) {
        this.dicomFileId = dicomFileId;
    }

    public String getDicomFilePath() {
        return dicomFilePath;
    }

    public void setDicomFilePath(String dicomFilePath) {
        this.dicomFilePath = dicomFilePath == null ? null : dicomFilePath.trim();
    }

    public Integer getJpgFileId() {
        return jpgFileId;
    }

    public void setJpgFileId(Integer jpgFileId) {
        this.jpgFileId = jpgFileId;
    }

    public String getJpgFilePath() {
        return jpgFilePath;
    }

    public void setJpgFilePath(String jpgFilePath) {
        this.jpgFilePath = jpgFilePath == null ? null : jpgFilePath.trim();
    }

    public Integer getDicomFileSize() {
        return dicomFileSize;
    }

    public void setDicomFileSize(Integer dicomFileSize) {
        this.dicomFileSize = dicomFileSize;
    }

    public String getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(String uploadTime) {
        this.uploadTime = uploadTime == null ? null : uploadTime.trim();
    }

    public String getDicomMd5() {
        return dicomMd5;
    }

    public void setDicomMd5(String dicomMd5) {
        this.dicomMd5 = dicomMd5 == null ? null : dicomMd5.trim();
    }

    public String getInstanceNumber() {
        return instanceNumber;
    }

    public void setInstanceNumber(String instanceNumber) {
        this.instanceNumber = instanceNumber == null ? null : instanceNumber.trim();
    }

    public Integer getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(Integer seriesId) {
        this.seriesId = seriesId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }
}