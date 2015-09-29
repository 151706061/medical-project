<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%-- 内容部分 --%>
<div class="padding">
	<div class="full col-sm-12">
		<div class="page-header">
			<h1>
				用户管理<small></small>
			</h1>
		</div>

		<div id="transactions-wrap">
			<table class="table table-hover table-with-bg-color">
				<thead>
					<tr>
						<th>申请时间</th>
						<th>医生姓名</th>
						<th>手机号</th>
						<th>Email</th>
						<th>操作</th>
					</tr>
				</thead>
				<tbody id="userTableTbody">
					
				</tbody>
			</table>
			<nav>
				<ul class="pager">
					<li class="previous"><a href="#"><span
							aria-hidden="true">&larr;</span> 上一页</a></li>
					<li class="next"><a href="#">下一页 <span
							aria-hidden="true">&rarr;</span></a></li>
				</ul>
			</nav>

		</div>

	</div>
</div>
<!-- /padding -->

<script id="userAuthTmpl" type="x-tmpl-mustache">
{{#userList}}
<tr>
	<td>{{applyTime}}</td>
	<td>{{applyUserName}}</td>
	<td>{{applyUserMobile}}</td>
	<td>{{applyUserEmail}}</td>
	<td class="{{authClass}}"><button type="button" class="btn btn-success btn-xs auth-btn" data-authid="{{authId}}">授权</button></td>
	<td class="{{cancelAuthClass}}"><button type="button" class="btn btn-default btn-xs cancel-auth-btn" data-authid="{{authId}}">取消授权</button></td>
</tr>
{{/userList}}
</script>
<%@include file="/modules/web/include/common-footer.jsp"%>
<script src='<c:url value="/modules/web/assets/js/enterprise/user-manage.js"/>'></script>
