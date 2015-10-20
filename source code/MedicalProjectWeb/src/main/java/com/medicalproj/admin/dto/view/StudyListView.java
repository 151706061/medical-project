package com.medicalproj.admin.dto.view;

import java.util.List;

import com.medicalproj.common.domain.DetailedStudyView;
import com.medicalproj.web.dto.view.PagerView;

public class StudyListView {
	private List<DetailedStudyView> studies;
	private PagerView pager;
	public List<DetailedStudyView> getStudies() {
		return studies;
	}
	public void setStudies(List<DetailedStudyView> studies) {
		this.studies = studies;
	}
	public PagerView getPager() {
		return pager;
	}
	public void setPager(PagerView pager) {
		this.pager = pager;
	}
}
