(function(){
	var page = 1;
	var pageSize = 10;
	$(function(){
		$('#notification-list-ul > li').on('mouseenter',function(){
			console.log(32);
		});
		
		SettingModule.listNotification(page,pageSize,new function(result){
			
		});
	});
	
	var SettingModule = (function(){
		return {
			listNotification:function(page,pageSize,successFn){
				alert(32);
			}
		}
	})();
	
})();