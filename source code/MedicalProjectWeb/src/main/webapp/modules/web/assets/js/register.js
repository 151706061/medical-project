
$(document).ready(function(){
	var $regForm = $('#regForm');
	$regForm.submit(function() {
		var password = $('#inputPassword').val();
		var passwordAgain = $('#inputPasswordAgain').val();
		if( password != passwordAgain){
			alert('密码与确认密码不一致');
			return false;
		}
		
		if(!$('#agreementCheckbox').is(':checked')){
			alert('钩选同意条款后才可注册');
			return false;
		}
		
		// 异步提交表单
		jQuery.ajax({
			url: appContext + '/web/auth/reg.do',
			data: $regForm.serialize(),
			type:"POST",
			beforeSend:function()
			{  
				$('#regBtn').attr('disabled',true);
			},
			success:function(data){
				$('#regBtn').attr('disabled',false);
				if( data && data.data == true ){
					$('#regSuccessModal').find('.modal-body').html('恭喜您，注册成功');
					$('#regSuccessModal').modal();
				}else{
					CommonModule.showMsg(data.msg);
				}
			}
		});

		return false;
	});
});