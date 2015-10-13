var medicalCaseId = null;
var uploadNo = null;
var uploadIndex = 1;
var CreateRequestModule = (function(){
	return {
		checkIncompleteRequest:function(successFn){
			$.ajax({
				url: appContext + 'web/request/checkIncompleteRequest.do',
				data: {
				},
				type:"GET",
				beforeSend:function()
				{  
					CommonModule.showMsg('正在初始化,请稍候...');
					//$('#regBtn').attr('disabled',true);
				},
				success:function(data){
					CommonModule.hideMsg();
					successFn(data);
				}
			});
		},
		showUploadBox:function(){
			var template = $('#uploadBoxTmpl').html();
			Mustache.parse(template);  
			var rendered = Mustache.render(template, {});
			
			$('#case-container').html(rendered);
		},
		clearOldUpload: function(successFn){
			$.ajax({
				url: appContext + 'web/request/clearOldUpload.do',
				data: {
				},
				type:"POST",
				beforeSend:function()
				{  
					CommonModule.showMsg('正在初始化,请稍候...');
				},
				success:function(data){
					CommonModule.hideMsg();
					successFn(data);
				}
			});
		},
		completeRequest: function(successFn){
			$.ajax({
				url: appContext + 'web/request/completeRequest.do',
				data: {
				},
				type:"POST",
				beforeSend:function()
				{  
					CommonModule.showMsg('请稍候...');
				},
				success:function(data){
					CommonModule.hideMsg();
					successFn(data);
				}
			});
		}
	}
})();

(function(){
	if( isCurrentUploadComplete != null && isCurrentUploadComplete == false ){
		CreateRequestModule.showUploadBox();
	}
	
	$('#uploadFileInput').fileupload({
		sequentialUploads: true,
		singleFileUploads:true,
		submit:function(e,data){
			if( uploadNo == null ){
				uploadNo = new Date().getTime();
			}
			
			if( data.uploadIndex == null ){
				data.uploadIndex = 1;
			}
			data.formData = {
				medicalCaseId: medicalCaseId,
				uploadNo: uploadNo,
				uploadIndex: uploadIndex
			};
			data.uploadIndex ++;
			
		},
	    progressall: function (e, data) {
	    	//console.log(data);
	        var progressVal = parseInt(data.loaded / data.total * 100, 10);

	        CommonModule.onDicomUploadProgressUpdate(progressVal + '%');
	        
	        var progress = $('#create-req-wrap .upload-progress');
	        if( progress.length > 0 ){
	        	progress.css('width',progressVal + '%');
	        }
	        
	        var tipText = $('#uploadBox .tip-text');
	        if( tipText.length > 0 ){
	        	tipText.text('正在上传文件...'+ progressVal + '%');
	        }
	        /* $('#progress .bar').css(
	            'width',
	            progress + '%'
	        );*/
	    },
	    send: function(e,data){
	    	isCurrentUploadComplete = false;
	    	$('#completeUploadBtn').attr('disabled',true);
	    }, 
	    done:function(e,data){
	    	var result = data.result;
	    	if( result.data == true ){
	    		CommonModule.onDicomUploadComplete();
	    		
	    		var tipText = $('#uploadBox .tip-text');
		        if( tipText.length > 0 ){
		        	tipText.text('所有文件上传完成.');
		        	$('#completeUploadBtn').attr('disabled',false);
		        }
	    	}
	    	else{
	    		//出错
	    		CommonModule.showMsg(result.msg,1);
	    	}
	    },
	    always : function(e,data){
	    	/*console.log(e);
	    	console.log(data);*/
	    }
	});
	
	$('#importMethodSelect').off('change');
	$('#importMethodSelect').on('change',function(){
		var importMethodVal = $('#importMethodSelect> option:selected').val();
		if( importMethodVal ){
			if( importMethodVal == 'local'){
				/*$('#importMethodSelect> option:selected').attr('selected',false);
				$('#importMethodSelect> option:eq(0)').attr('selected',true);*/
				
				CreateRequestModule.checkIncompleteRequest(function(data){
					if( data.data != null ){
						uploadNo = data.data.uploadNo;
						var firstUploadTime = data.data.firstUploadTime;
						var alreadyUploadCount = data.data.alreadyUploadCount;
						
						CommonModule.showConfirm('您有未完成的请求，您在'+ firstUploadTime +'上传了' + alreadyUploadCount + '个文件，是否继续上传，点确定继续上传，点取消重新上传。',
							function(){
								//ok
								var template = $('#uploadBoxTmpl').html();
								Mustache.parse(template);  
								var rendered = Mustache.render(template, {});
								
								$('#case-container').html(rendered);
								
								CommonModule.hideConfirm();
							},
							function(){
								// cancel
								CreateRequestModule.clearOldUpload(function(data){
									if( data.data == true ){
										uploadNo = null;
										CreateRequestModule.showUploadBox();
									}
								});
							}
						);
					}else{
						//创建新病例
						/*CreateRequestModule.initNewMedicalCase(function(data){
							medicalCaseId = data.data;
							console.log(medicalCaseId);
							// 渲染病例到页面
							var template = $('#medicalCaseTmpl').html();
							Mustache.parse(template);  
							var rendered = Mustache.render(template, {});
							
							$('#case-container').html(rendered);
							
						});*/
						CreateRequestModule.showUploadBox();
					}
				});
				
				/*$('#uploadFileInput').click();
				
				$('#importMethodSelect> option:selected').attr('selected',false);
				$('#importMethodSelect> option:eq(0)').attr('selected',true);*/
			}else if( importMethodVal == 'pacs' ){
				
			}
		}
	});

	$(document).off("click","#uploadDcmBtn"); 
	$(document).on("click","#uploadDcmBtn",function(){
		$('#uploadFileInput').click();
		return false;
	}); 
	
	$(document).off("click","#completeUploadBtn"); 
	$(document).on("click","#completeUploadBtn",function(){
		CreateRequestModule.completeRequest(function(data){
			if( data.data ){
				isCurrentUploadComplete = true;
				CommonModule.showConfirm('病例已生成，点确定查看病例，点取消上传新病例。',function(){
					routie('requests');
				},
				function(){
					uploadNo = null;
					CreateRequestModule.showUploadBox();
				});
			}
		});
		
		return false;
	});
	
	$(document).off("click","#reUploadBtn"); 
	$(document).on("click","#reUploadBtn",function(){
		CreateRequestModule.clearOldUpload(function(data){
			if( data.data == true ){
				uploadNo = null;
				CreateRequestModule.showUploadBox();
			}
		});
		return false;
	});
})();