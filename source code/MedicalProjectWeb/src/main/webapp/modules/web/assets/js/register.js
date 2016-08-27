
$(document).ready(function(){
	var $regForm = $('#regForm');
	$regForm.submit(function() {
		var password = $('#inputPassword').val();
		var passwordAgain = $('#inputPasswordAgain').val();
		if( password != passwordAgain){
			CommonModule.showMsg('密码与确认密码不一致',1);
			return false;
		}
		
		if(!$('#agreementCheckbox').is(':checked')){
			CommonModule.showMsg('钩选同意条款后才可注册',1);
			return false;
		}
		
		// 异步提交表单
		jQuery.ajax({
			url: appContext + 'web/auth/reg.do',
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
					CommonModule.showMsg(data.msg,1);
				}
			}
		});

		return false;
	});
	
	$('#selectUserType').on('change',function(){
		var userType = $('#selectUserType > option:selected').val();
		if( userType ){
			if( userType == 1){ 
				// user 
				$('.enterprise-input-wrap').children().remove();
				$('.user-input-wrap').children().remove();
				
				var template = $('#userInputTmpl').html();
				Mustache.parse(template);  
				var rendered = Mustache.render(template, {});
				$('.user-input-wrap').html(rendered);
				
			}else if( userType == 4 ){
				// enterprise
				$('.enterprise-input-wrap').children().remove();
				$('.user-input-wrap').children().remove();
				
				var template = $('#enterpriseInputTmpl').html();
				Mustache.parse(template);  
				var rendered = Mustache.render(template, {});
				$('.enterprise-input-wrap').html(rendered);
			}
		}
		
	});
});