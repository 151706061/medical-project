package com.medicalproj.web.dto.view;

import java.util.List;

public class MedicalCaseListView {
	private List<MedicalCaseView> medicalCaseList;
	private PagerView pager;
	public List<MedicalCaseView> getMedicalCaseList() {
		return medicalCaseList;
	}
	public void setMedicalCaseList(List<MedicalCaseView> medicalCaseList) {
		this.medicalCaseList = medicalCaseList;
	}
	public PagerView getPager() {
		return pager;
	}
	public void setPager(PagerView pager) {
		this.pager = pager;
	}
	
}
