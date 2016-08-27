<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%-- 内容部分 --%>
<div class="padding">

	<div class="full col-sm-12">
		
		<div class="col-sm-12">
			<table class="table table-hover table-with-bg-color">
				<thead>
					<tr>
						<th>时间</th>
						<th>任务类型</th>
						<th>病人姓名</th>
						<th>请求用户</th>
						<th>任务状态</th>
						<th>图像总数</th>
						<th>操作</th>
					</tr>
				</thead>
				<tbody id="taskListTbody">
					
				</tbody>
			</table>
		</div>


	</div>
	<!-- /col-12 -->


	<div class="col-sm-12">
		<nav>
			<ul class="pager">
				<li class="previous disabled taskPrevBtn"><a href="#"><span aria-hidden="true">&larr;</span>
						上一页</a></li>
				<li class="next disabled taskNextBtn"><a href="#">下一页 <span aria-hidden="true">&rarr;</span></a></li>
			</ul>
		</nav>
	</div>
</div>
<!-- /padding -->

<div id="assignTaskModal" class="modal fade">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title">分配任务</h4>
      </div>
      <div class="modal-body">
        <form>
		  <div class="form-group">
		    <label for="juniorDoctorSelect">医师</label>
		    <select class="form-control" id="juniorDoctorSelect">
		    	<option>Jack</option>
		    </select>
		  </div>
		</form>


      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
        <button type="button" class="btn btn-success assignBtn" >分配</button>
      </div>
    </div>
  </div>
</div>

<script id="taskListItemTmpl" type="x-tmpl-mustache">
{{#tasks}}
<tr data-taskid={{taskId}}>
	<td>{{taskCreateTimeStr}}</td>
	<td>{{taskType}}</td>
	<td>{{patientName}}</td>
	<td>{{medicalCaseCreatorUserName}}</td>
	<td>{{taskStatus}}</td>
	<td>{{totalImageCount}}</td>
	<td>
		{{#showAuditBtn}}<a href="../../cornerstone/index.jsp?studyId={{resourceId}}&taskId={{taskId}}" target="_blank" class="btn btn-success btn-xs audit-btn" >审核</a>{{/showAuditBtn}}
		{{#showAssignBtn}}<a href='javascript:void(0)' target="_blank" class="btn btn-success btn-xs assign-btn" style="margin-left:5px">分配</a>{{/showAssignBtn}}
		<a href="../../cornerstone/index.jsp?studyId={{resourceId}}&taskId={{taskId}}" target="_blank" class="btn btn-success btn-xs diagnose-btn" >查看病例</a>
	</td>
</tr>
{{/tasks}}
</script>
<%-- END 内容部分 --%>
<script src='<c:url value="/modules/web/assets/js/senior/task.js"/>'></script>
