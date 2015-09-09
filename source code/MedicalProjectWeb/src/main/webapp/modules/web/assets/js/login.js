
$(document).ready(function(){
	var $loginForm = $('#loginForm');
	$loginForm.submit(function() {
		var account = $('#inputAccount').val();
		var password = $('#inputPassword').val();
		
		// 异步提交表单
		jQuery.ajax({
			url: appContext + '/web/auth/login.do',
			data: $loginForm.serialize(),
			type:"POST",
			beforeSend:function()
			{  
				$('#loginBtn').attr('disabled',true);
			},
			success:function(data){
				$('#loginBtn').attr('disabled',false);
				if( data && data.data == true ){
					location = appContext + 'web/common/home.do';
				}else{
					$('#msgModal').find('.modal-body').html(data.msg);
					$('#msgModal').modal();
				}
			}
		});

		return false;
	});
});