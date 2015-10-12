package com.medicalproj.web.dto.view;

import java.util.List;

public class SeriesViewerView {
	private String seriesDescription;
	private String seriesNumber;
	private List<InstanceViewerView> instanceList;
	public String getSeriesDescription() {
		return seriesDescription;
	}
	public void setSeriesDescription(String seriesDescription) {
		this.seriesDescription = seriesDescription;
	}
	public String getSeriesNumber() {
		return seriesNumber;
	}
	public void setSeriesNumber(String seriesNumber) {
		this.seriesNumber = seriesNumber;
	}
	public List<InstanceViewerView> getInstanceList() {
		return instanceList;
	}
	public void setInstanceList(List<InstanceViewerView> instanceList) {
		this.instanceList = instanceList;
	}
}
