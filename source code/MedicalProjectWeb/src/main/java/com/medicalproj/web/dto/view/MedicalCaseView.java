package com.medicalproj.web.dto.view;

import java.util.List;


public class MedicalCaseView extends com.medicalproj.common.domain.MedicalCaseView{
	private List<StudyView> studys;
	
	private boolean canViewMedicalCase;

	public List<StudyView> getStudys() {
		return studys;
	}

	public void setStudys(List<StudyView> studys) {
		this.studys = studys;
	}

	public boolean isCanViewMedicalCase() {
		return canViewMedicalCase;
	}

	public void setCanViewMedicalCase(boolean canViewMedicalCase) {
		this.canViewMedicalCase = canViewMedicalCase;
	}
}
