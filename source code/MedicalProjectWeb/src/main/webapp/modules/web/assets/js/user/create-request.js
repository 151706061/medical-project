var medicalCaseId = null;
var CreateRequestModule = (function(){
	return {
		listIncompleteMedicalCase:function(successFn){
			$.ajax({
				url: appContext + 'web/request/listIncompleteRequest.do',
				data: {
				},
				type:"GET",
				beforeSend:function()
				{  
					CommonModule.showMsg('正在初始化,请稍候...',false);
					//$('#regBtn').attr('disabled',true);
				},
				success:function(data){
					CommonModule.hideMsg();
					successFn(data);
				}
			});
		},
		initNewMedicalCase:function(successFn){
			$.ajax({
				url: appContext + 'web/request/initNewMedicalCase.do',
				data: {
				},
				type:"POST",
				beforeSend:function()
				{  
					CommonModule.showMsg('正在创建新病例,请稍候...',false);
					//$('#regBtn').attr('disabled',true);
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
	
	$('#uploadFileInput').fileupload({
		sequentialUploads: true,
		singleFileUploads:true,
		submit:function(e,data){
			data.formData = {medicalCaseId: medicalCaseId};
		},
	    progressall: function (e, data) {
	    	//console.log(data);
	        var progress = parseInt(data.loaded / data.total * 100, 10);

	        CommonModule.onDicomUploadProgressUpdate(progress + '%');
	        /* $('#progress .bar').css(
	            'width',
	            progress + '%'
	        );*/
	    },
	    send: function(e,data){
	    }, 
	    done:function(e,data){
	    	var result = data.result;
	    	if( result.data == true ){
	    		CommonModule.onDicomUploadComplete();
	    	}
	    	else{
	    		//出错
	    		CommonModule.showMsg(result.msg);
	    	}
	    },
	    always : function(e,data){
	    	/*console.log(e);
	    	console.log(data);*/
	    }
	});
	
	$('#importMethodSelect').on('change',function(){
		var importMethodVal = $('#importMethodSelect> option:selected').val();
		if( importMethodVal ){
			if( importMethodVal == 'local'){
				$('#importMethodSelect> option:selected').attr('selected',false);
				$('#importMethodSelect> option:eq(0)').attr('selected',true);
				
				CreateRequestModule.listIncompleteMedicalCase(function(data){
					if( data.data.medicalCaseList && data.data.medicalCaseList.length > 0 ){
						//alert('提示有未完成的 ');
						
					}else{
						//创建新病例
						CreateRequestModule.initNewMedicalCase(function(data){
							medicalCaseId = data.data;
							console.log(medicalCaseId);
							// 渲染病例到页面
							var template = $('#medicalCaseTmpl').html();
							Mustache.parse(template);  
							var rendered = Mustache.render(template, {});
							
							$('#case-container').html(rendered);
							
						});
					}
				});
				
				/*$('#uploadFileInput').click();
				
				$('#importMethodSelect> option:selected').attr('selected',false);
				$('#importMethodSelect> option:eq(0)').attr('selected',true);*/
			}else if( importMethodVal == 'pacs' ){
				
			}
		}
	});

	$(document).on("click","#uploadDicomBtn",function(){
		$('#uploadFileInput').click();
		return false;
	}); 
})();