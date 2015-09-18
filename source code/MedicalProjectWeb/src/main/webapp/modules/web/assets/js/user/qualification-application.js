(function(){
	var QualificationApplicationModule = (function(){
		return {
			initUpload:function(){
				$('#uploadYszgzBtn').fileupload({
			        dataType: 'json',
			 
			        done: function (e, data) {
			        	var result = data.result;
			        	if( result.msg ){
			        		$('#msgModal').find('.modal-body').html(result.msg);
							$('#msgModal').modal();
			        	}else{
			        		var imgPath = result.data.path;
			        		var imgId = result.data.id;
			        		$('#yszgz-img').attr('src',imgPath);
			        		$('#qualificationForm').find('input[name="yszgzId"]').val(imgId);
			        	}
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
			},
			initAuditUserCombo: function(successFn){
				$.ajax({
					url: appContext + 'web/qualificationApply/listAllSeniorDoctor.do',
					data: {
					},
					type:"GET",
					beforeSend:function()
					{  
						//$('#regBtn').attr('disabled',true);
					},
					success:function(data){
						successFn(data.data);
					}
				});
			}
		}
	})();
	
	$(function(){
		QualificationApplicationModule.initUpload();
		
		QualificationApplicationModule.initAuditUserCombo(function(userlist){
			if( userlist && userlist.length > 0){
				var template = '{{#userlist}}<option data-uid="{{id}}">{{name}}</option>{{/userlist}}';
				Mustache.parse(template);  
				var rendered = Mustache.render(template, {userlist : userlist});

				$('#selectAuditUser').children('option[value!="0"]').remove();
				$('#selectAuditUser').append(rendered);
			}
			
			
		});
		
		var $qualificationForm = $('#qualificationForm');
		$('#qualificationForm').submit(function() {
			var yszgzId = $('#qualificationForm').find('input[name="yszgzId"]').val();

			if( yszgzId == null || $.trim(yszgzId).length == 0 ){
				$('#msgModal').find('.modal-body').html('请先上传医师资格证');
				$('#msgModal').modal();
				return false;
			}
			
			var auditUser = $qualificationForm.find('select[name="auditUser"]').val();
			
			// 异步提交表单
			jQuery.ajax({
				url: appContext + 'web/qualificationApply/submitApplication.do',
				data: $qualificationForm.serialize() ,
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
	
})();