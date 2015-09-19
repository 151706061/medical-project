package com.medicalproj.web.dto.view;

import java.util.List;


public class MedicalCaseView extends com.medicalproj.common.domain.MedicalCaseView{
	private List<StudyView> studys;

	public List<StudyView> getStudys() {
		return studys;
	}

	public void setStudys(List<StudyView> studys) {
		this.studys = studys;
	}
}
