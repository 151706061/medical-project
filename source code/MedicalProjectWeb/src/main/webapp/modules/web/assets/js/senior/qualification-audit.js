var QualificationAuditModule = (function(){
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
					search();
				}else{
					alert(resp.msg);
				}
			},
			'json'
		);
	};
	
	var search = function(){
		var me = this;
		$.ajax({
			url: appContext + 'web/qualificationApply/listQualificationApplication.do',
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
				if( result && result.data && result.data.applications && result.data.applications.length > 0 ){
					$.each(result.data.applications,function(i,n){
						if( n.status == '待审核' ){
							n.isApproveShow = true ;
							n.isRejectShow = true ;
							n.isDetailShow = false ;
						}else if( n.status == '通过' || n.status == '未通过'){
							n.isApproveShow = false ;
							n.isRejectShow = false ;
							n.isDetailShow = true;
						}
					});
					console.log(result.data.applications );
					var template = $('#qualificationApplicationTmpl').html();
					Mustache.parse(template);  
					var rendered = Mustache.render(template, {applications: result.data.applications});
					
					$('#applicationContainer').html(rendered);
					
					/*$('.assign-btn').off();
					$('.assign-btn').on('click',function(){
						$('#assignTaskModal').modal('show');
						
						initAssignTaskModalData();
						
						var taskId = $(this).closest('tr').data('taskid');
						assignParam.taskId = taskId;
					});*/
				}
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
			if( !$('.prevBtn').hasClass('disabled') ){
				$('.prevBtn').addClass('disabled');
			}
		}else{
			$('.prevBtn').removeClass('disabled');
		}
		
		if( param.totalPage != null ){
			if( param.page == param.totalPage ){
				if( !$('.nextBtn').hasClass('disabled') ){
					$('.nextBtn').addClass('disabled');
				}
			}else{
				$('.nextBtn').removeClass('disabled');
			}
		}
		
	};
	
	var onPrevBtnClick = function(){
		if( param.page > 1 ){
			param.page = param.page -1 ;
			search();
		}
	};
	
	var onNextBtnClick = function(){
		if( param.page < param.totalPage ){
			param.page = param.page + 1;
			search();
		}
	};
	
	return {
		search:search,
		assignTask:assignTask,
		onPrevBtnClick: onPrevBtnClick,
		onNextBtnClick:onNextBtnClick
	}
})();

$(function(){
	QualificationAuditModule.search();
	
	/*$('#assignTaskModal .assignBtn').off();
	$('#assignTaskModal .assignBtn').on('click',function(){
		var assignToUserId = $('#juniorDoctorSelect').val();
		
		TaskModule.assignTask(assignToUserId);
	});*/
	
	$('.prevBtn').on('click',function(){
		QualificationAuditModule.onPrevBtnClick();
	});

	$('.nextBtn').on('click',function(){
		QualificationAuditModule.onNextBtnClick();
	});
	
});
	
