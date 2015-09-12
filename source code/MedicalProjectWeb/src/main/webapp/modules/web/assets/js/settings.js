
$(function(){
	var $settingForm = $('#settingForm');
	$settingForm.submit(function() {
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
					$('#msgModal').find('.modal-body').html('保存设置成功');
					$('#msgModal').modal();
				}else{
					$('#msgModal').find('.modal-body').html(data.msg);
					$('#msgModal').modal();
				}
			}
		});

		return false;
	});
	
});
