var commonObj = (function(){
	
	return {
		loadUserInfo:function(){
			
			$.ajax({
				url: appContext + '/web/common/getLoginUserInfo.do',
				//data: $regForm.serialize(),
				type:"GET",
				beforeSend:function()
				{  
					//$('#regBtn').attr('disabled',true);
				},
				success:function(data){
					if( data && data.data ){
						var $userInfoWrap = $('#user-info-wrap');
						
						if( $userInfoWrap ){
							var userData = data.data;
							var userName = userData.name;
							var email = userData.email;
							var mobile = userData.mobile;
							var userType = userData.userTypeStr;
							
							$userInfoWrap.find('.username').html(userName);
							$userInfoWrap.find('.usertype').html(userType);
							$userInfoWrap.find('.mobile').html(mobile);
							$userInfoWrap.find('.email').html(email);
						}
					
					}
				}
			});
		},
		getUnreadNotificationCount: function(){
			$.ajax({
				url: appContext + '/web/common/getUnreadNotificationCount.do',
				//data: $regForm.serialize(),
				type:"GET",
				beforeSend:function()
				{  
					//$('#regBtn').attr('disabled',true);
				},
				success:function(data){
					if( data && data.data ){
						var unreadNotificationCount = data.data;
						var $notificationCount = $('.unread-notification-count');
						if( $notificationCount ){
							
							if( unreadNotificationCount && unreadNotificationCount > 0 ){
								$notificationCount.html(unreadNotificationCount);
								$notificationCount.show();
							}else{
								$notificationCount.hide();
							}
						}
						
					}
					
					
				}
			});
			
			
		},
		hasNewTask : function(){
			$.get(
				appContext + 'web/task/hasNewTask.do',
				{},
				function(result){
					if( result ){
						if( result.data == true ){
							$('#lg-menu .badge').show();
						}else{
							$('#lg-menu .badge').hide();
						}
					}
				},
				'json'
			);
		}
	};
})();

