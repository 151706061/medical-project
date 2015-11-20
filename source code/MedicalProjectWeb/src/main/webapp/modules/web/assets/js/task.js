(function(){
	var TaskModule = (function(){
		return {
			listTask:function(page,pageSize){
				$.ajax({
					url: appContext + 'web/task/listTask.do',
					data: {
						t: Math.random(),
						page: page,
						pageSize: pageSize
					},
					type:"GET",
					beforeSend:function()
					{  
						//$('#regBtn').attr('disabled',true);
					},
					success:function(result){
						if( result && result.data && result.data.tasks && result.data.tasks.length > 0 ){
							var template = $('#taskListItemTmpl').html();
							Mustache.parse(template);  
							var rendered = Mustache.render(template, {tasks: result.data.tasks});
							
							$('#taskListTbody').html(rendered);
						}
					}
				});
			}
		}
	})();
	
	var page = 1;
	var pageSize = 10;
	$(function(){
		TaskModule.listTask(page,pageSize);
	});
	
})();