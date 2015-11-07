var TaskModule = (function(){
	var param = {
		page: 1,
		pageSize : 15,
		totalPage: null
	};
	
	var assignParam = {
		taskId : null,
		assignToUserId : null
	};
	
	var assignTask = function(assignToUserId){
		assignParam.assignToUserId = assignToUserId;
		$.post(
			appContext + 'web/task/assignTask.do',
			assignParam,
			function(resp){
				if( resp && resp.data && resp.data == true ){
					alert('任务分配成功');
					$('#assignTaskModal').modal('hide');
					
					param.page = 1;
					listTask();
				}else{
					alert(resp.msg);
				}
			},
			'json'
		);
	};
	
	var listTask = function(){
		var me = this;
		$.ajax({
			url: appContext + 'web/task/listTask.do',
			data:param,
			type:"GET",
			beforeSend:function()
			{  
				//$('#regBtn').attr('disabled',true);
			},
			success:function(result){
				param.page = result.data.pager.page;
				param.totalPage = result.data.pager.totalPage;
				checkPageBtnStatus();
				
				$('#taskListTbody').children().remove();
				if( result && result.data && result.data.tasks && result.data.tasks.length > 0 ){
					var template = $('#taskListItemTmpl').html();
					Mustache.parse(template);  
					
					processTaskData(result.data.tasks);
					console.log(result.data.tasks);
					var rendered = Mustache.render(template, {tasks: result.data.tasks});
					
					$('#taskListTbody').html(rendered);
					
					$('.assign-btn').off();
					$('.assign-btn').on('click',function(){
						$('#assignTaskModal').modal('show');
						
						initAssignTaskModalData();
						
						var taskId = $(this).closest('tr').data('taskid');
						assignParam.taskId = taskId;
					});
				}
			}
		});
	};
	var processTaskData = function(tasks){
		$.each(tasks,function(i,n){
			if( n.taskStatus == '待分配'){
				n.showAssignBtn = true;
			}else if( n.taskStatus == '待审核' ){
				n.showAuditBtn = true;
			}
		});
	};
	
	var initAssignTaskModalData = function(){
		$.get(
			appContext + 'web/common/listAllJuniorDoctor.do',
			{},
			function(resp){
				var template = '{{#users}}<option value="{{id}}">{{name}}</option>{{/users}}';
				Mustache.parse(template);  
				var rendered = Mustache.render(template, {users: resp.data});
				
				$('#juniorDoctorSelect').children().remove();
				$('#juniorDoctorSelect').html(rendered);
			},
			'json'
		);
	};
	
	var checkPageBtnStatus = function(){
		if( param.page == 1 ){
			if( !$('.taskPrevBtn').hasClass('disabled') ){
				$('.taskPrevBtn').addClass('disabled');
			}
		}else{
			$('.taskPrevBtn').removeClass('disabled');
		}
		
		if( param.totalPage != null ){
			if( param.page == param.totalPage ){
				if( !$('.taskNextBtn').hasClass('disabled') ){
					$('.taskNextBtn').addClass('disabled');
				}
			}else{
				$('.taskNextBtn').removeClass('disabled');
			}
		}
		
	};
	
	var onPrevBtnClick = function(){
		if( param.page > 1 ){
			param.page = param.page -1 ;
			listTask();
		}
	};
	
	var onNextBtnClick = function(){
		if( param.page < param.totalPage ){
			param.page = param.page + 1;
			listTask();
		}
	};
	
	return {
		listTask:listTask,
		assignTask:assignTask,
		onPrevBtnClick: onPrevBtnClick,
		onNextBtnClick:onNextBtnClick
	}
})();

$(function(){
	TaskModule.listTask();
	
	$('#assignTaskModal .assignBtn').off();
	$('#assignTaskModal .assignBtn').on('click',function(){
		var assignToUserId = $('#juniorDoctorSelect').val();
		
		TaskModule.assignTask(assignToUserId);
	});
	
	$('.taskPrevBtn').on('click',function(){
		TaskModule.onPrevBtnClick();
	});

	$('.taskNextBtn').on('click',function(){
		TaskModule.onNextBtnClick();
	});
	
});
	
