(function(){
	$(function(){
		$('#uploadYszgzBtn').fileupload({
	        dataType: 'json',
	 
	        done: function (e, data) {
	            $("tr:has(td)").remove();
	            $.each(data.result, function (index, file) {
	 
	                $("#uploaded-files").append(
	                        $('<tr/>')
	                        .append($('<td/>').text(file.fileName))
	                        .append($('<td/>').text(file.fileSize))
	                        .append($('<td/>').text(file.fileType))
	                        .append($('<td/>').html("<a href='rest/controller/get/"+index+"'>Click</a>"))
	                        )
	            }); 
	        },
	 
	        progressall: function (e, data) {
	            var progress = parseInt(data.loaded / data.total * 100, 10);
	            //console.log(progress + '%');
	            /* $('#progress .bar').css(
	                'width',
	                progress + '%'
	            );*/
	        }
	        /*,dropZone: $('#dropzone')*/
	    });
		
		var $qualificationForm = $('#qualificationForm');
		$('#qualificationForm').submit(function() {
			var auditUser = $qualificationForm.find('select[name="auditUser"]').val();
			
			// 异步提交表单
			jQuery.ajax({
				url: appContext + 'web/qualificationApply/submitApplication.do',
				data: $qualificationForm.serialize(),
				type:"POST",
				beforeSend:function()
				{  
					$('#submitBtn').attr('disabled',true);
				},
				success:function(data){
					$('#submitBtn').attr('disabled',false);
					if( data && data.data == true ){
						$('#msgModal').find('.modal-body').html('申请成功提交。');
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
	
	var QualificationApplicationModule = (function(){
		return {
		}
	})();
	
})();