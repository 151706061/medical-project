package com.medicalproj.admin.dto.view;

import java.util.List;

import com.medicalproj.common.domain.QualificationApplicationView;
import com.medicalproj.web.dto.view.PagerView;

public class QualificationApplicationListView {
	private List<QualificationApplicationView> applications;
	private PagerView pager;
	public List<QualificationApplicationView> getApplications() {
		return applications;
	}
	public void setApplications(List<QualificationApplicationView> applications) {
		this.applications = applications;
	}
	public PagerView getPager() {
		return pager;
	}
	public void setPager(PagerView pager) {
		this.pager = pager;
	}
}
