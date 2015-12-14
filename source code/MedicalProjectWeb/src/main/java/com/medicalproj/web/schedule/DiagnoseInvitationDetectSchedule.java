package com.medicalproj.web.schedule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.medicalproj.common.service.INotificationService;
import com.medicalproj.web.util.Constants;

@Component
public class DiagnoseInvitationDetectSchedule {
	@Autowired
	private INotificationService notificationService;
	
	@Scheduled(fixedDelay=3600000)
	public void detect() {
		notificationService.doExpireNotificationByPeriod(Constants.NOTIFICATION_CONFIRM_EXPIRE_PERIOD);
	}
}
