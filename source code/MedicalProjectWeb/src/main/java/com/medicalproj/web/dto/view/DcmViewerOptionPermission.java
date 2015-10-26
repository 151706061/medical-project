package com.medicalproj.web.dto.view;

public class DcmViewerOptionPermission {
	private boolean canViewReport;
	private boolean canDiagnose;
	private boolean canAudit;
	private boolean canViewDiagnoseAndAuditReport;
	
	public DcmViewerOptionPermission(boolean canViewReport,
			boolean canDiagnose, boolean canAudit,
			boolean canViewDiagnoseAndAuditReport) {
		super();
		this.canViewReport = canViewReport;
		this.canDiagnose = canDiagnose;
		this.canAudit = canAudit;
		this.canViewDiagnoseAndAuditReport = canViewDiagnoseAndAuditReport;
	}
	public boolean isCanViewReport() {
		return canViewReport;
	}
	public void setCanViewReport(boolean canViewReport) {
		this.canViewReport = canViewReport;
	}
	public boolean isCanDiagnose() {
		return canDiagnose;
	}
	public void setCanDiagnose(boolean canDiagnose) {
		this.canDiagnose = canDiagnose;
	}
	public boolean isCanAudit() {
		return canAudit;
	}
	public void setCanAudit(boolean canAudit) {
		this.canAudit = canAudit;
	}
	public boolean isCanViewDiagnoseAndAuditReport() {
		return canViewDiagnoseAndAuditReport;
	}
	public void setCanViewDiagnoseAndAuditReport(
			boolean canViewDiagnoseAndAuditReport) {
		this.canViewDiagnoseAndAuditReport = canViewDiagnoseAndAuditReport;
	}
}
