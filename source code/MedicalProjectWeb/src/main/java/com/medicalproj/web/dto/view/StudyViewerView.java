package com.medicalproj.web.dto.view;

import java.util.List;

public class StudyViewerView {
	private String patientName;
	private String patientId;
	private String studyDate;
	private String modality;
	private String studyDescription;
	private String numImages;
	private String studyId;
	private List<SeriesViewerView> seriesList;
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getPatientId() {
		return patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	public String getStudyDate() {
		return studyDate;
	}
	public void setStudyDate(String studyDate) {
		this.studyDate = studyDate;
	}
	public String getModality() {
		return modality;
	}
	public void setModality(String modality) {
		this.modality = modality;
	}
	public String getStudyDescription() {
		return studyDescription;
	}
	public void setStudyDescription(String studyDescription) {
		this.studyDescription = studyDescription;
	}
	public String getNumImages() {
		return numImages;
	}
	public void setNumImages(String numImages) {
		this.numImages = numImages;
	}
	public String getStudyId() {
		return studyId;
	}
	public void setStudyId(String studyId) {
		this.studyId = studyId;
	}
	public List<SeriesViewerView> getSeriesList() {
		return seriesList;
	}
	public void setSeriesList(List<SeriesViewerView> seriesList) {
		this.seriesList = seriesList;
	}
	
}
