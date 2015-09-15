(function(){
	var page = 1;
	var pageSize = 10;
	$(function(){
		UserManageModule.listUser(page,pageSize,function(result){
			if( result && result.data && result.data.notifications && result.data.notifications.length > 0 ){
				var template = $('#notificationTmpl').html();
				Mustache.parse(template);  
				var rendered = Mustache.render(template, {notifications : result.data.notifications});
				
				$('#my-notification-wrap').html(rendered);
				
				$('#notification-list-ul > li').on('mouseenter',function(){
					var $this = $(this);
					var notificationId = $this.data('notification-id');
					if( $.trim($this.find('.read-status').text()) == '未读' ){
						SettingModule.doReadNotification(notificationId,function(result){
							$this.find('.read-status').text('已读');
						});
					}else{
						// have read
					}
					
				});
			}
		});
	});
	
	var UserManageModule = (function(){
		return {
			listUser:function(page,pageSize,successFn){
				$.ajax({
					url: appContext + 'web/notification/listNotification.do',
					data: {
						page: page,
						pageSize: pageSize
					},
					type:"GET",
					beforeSend:function()
					{  
						//$('#regBtn').attr('disabled',true);
					},
					success:function(data){
						successFn(data);
					}
				});
			}
		}
	})();
	
})();