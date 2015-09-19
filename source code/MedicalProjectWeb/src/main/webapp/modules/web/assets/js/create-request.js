

(function(){
	$('#uploadFileInput').fileupload({
		sequentialUploads: true,
		singleFileUploads:true,
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
				$('#uploadFileInput').click();
				
				$('#importMethodSelect> option:selected').attr('selected',false);
				$('#importMethodSelect> option:eq(0)').attr('selected',true);
			}else if( importMethodVal == 'pacs' ){
				
			}
		}
	});
})();