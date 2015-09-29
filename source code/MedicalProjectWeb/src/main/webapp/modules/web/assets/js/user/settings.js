(function(){
	/* MODULE START */
	var SettingModule = (function(){
		return {
			loadMySetting:function(successFn){
				jQuery.ajax({
					url: appContext + 'web/setting/loadMySetting.do',
					data: {},
					type:"GET",
					beforeSend:function()
					{  
						//$('#saveSettingBtn').attr('disabled',true);
					},
					success:function(data){
						var userData =data.data;
						successFn(userData);
						
					}
				});
			},
			onSettingFormSubmit: function() {
				jQuery.ajax({
					url: appContext + 'web/setting/saveSetting.do',
					data: $settingForm.serialize(),
					type:"POST",
					beforeSend:function()
					{  
						$('#saveSettingBtn').attr('disabled',true);
					},
					success:function(data){
						$('#saveSettingBtn').attr('disabled',false);
						if( data && data.data == true ){
							CommonModule.showMsg('保存设置成功',1);
						}else{
							CommonModule.showMsg(data.msg);
						}
					}
				});

				return false;
			}
		}
	})();
	/* MODULE END */
	
	SettingModule.loadMySetting(function(userData){
		$('#inputUserName').val(userData.userName);
		$('#inputMobile').val(userData.mobile);
		$('#inputEmail').val(userData.email);
		var isReceiveNotification = userData.isReceiveNotification;
		if( isReceiveNotification && isReceiveNotification == 1){
			$('#receiveNotificationCheckbox').attr('checked',true);
		}else{
			$('#receiveNotificationCheckbox').attr('checked',false);
		}
		
	});
	
	var $settingForm = $('#settingForm');
	$settingForm.submit(SettingModule.onSettingFormSubmit);
})();
