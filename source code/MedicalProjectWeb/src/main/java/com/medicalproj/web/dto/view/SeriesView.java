package com.medicalproj.web.dto.view;

import java.util.List;

public class SeriesView extends com.medicalproj.common.domain.SeriesView{
	private List<InstanceView> instanceList;

	public List<InstanceView> getInstanceList() {
		return instanceList;
	}

	public void setInstanceList(List<InstanceView> instanceList) {
		this.instanceList = instanceList;
	}
	
}
