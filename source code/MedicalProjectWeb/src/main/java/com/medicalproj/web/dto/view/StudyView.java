package com.medicalproj.web.dto.view;

import java.util.List;

public class StudyView extends com.medicalproj.common.domain.StudyView {
	private List<SeriesView> seriesList;

	public List<SeriesView> getSeriesList() {
		return seriesList;
	}

	public void setSeriesList(List<SeriesView> seriesList) {
		this.seriesList = seriesList;
	}
	
}
