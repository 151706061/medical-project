(function(){
	var RequestModule = (function(){
		return {
			listRequest:function(page,pageSize,successFn){
				$.ajax({
					url: appContext + 'web/request/listRequest.do',
					data: {
						page: page,
						pageSize: pageSize
					},
					type:"GET",
					beforeSend:function()
					{  
						//$('#regBtn').attr('disabled',true);
					},
					success:function(data){
						successFn(data);
					}
				});
			}
		}
	})();
	
	
	var page = 1;
	var pageSize = 10;
	$(function(){
		RequestModule.listRequest(page, pageSize , function(data){
			var medicalCaseList = data.data.medicalCaseList;
			var template = $('#medicalCaseTmpl').html();
			Mustache.parse(template);  
			var rendered = Mustache.render(template, {medicalCaseList: medicalCaseList});
			
			$('#medicalCaseListWrap').html(rendered); 
		});
	});
	
})();