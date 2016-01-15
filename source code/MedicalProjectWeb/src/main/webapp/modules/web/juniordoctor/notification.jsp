<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%-- 内容部分 --%>
<div class="padding">

	<div class="full col-sm-12">
		
		<div id="my-notification-wrap"></div>


	</div>
	<!-- /col-12 -->
	<div class="col-sm-12">
		<nav>
			<ul class="pager">
				<li class="previous prevBtn"><a href="javascript:void(0)"><span aria-hidden="true">&larr;</span>
						上一页</a></li>
				<li class="next nextBtn"><a href="javascript:void(0)">下一页 <span aria-hidden="true">&rarr;</span></a></li>
			</ul>
		</nav>
	</div>
</div>
<!-- /padding -->
<%-- END 内容部分 --%>


<script id="notificationTmpl" type="x-tmpl-mustache">
	<ul class="list-unstyled" id="notification-list-ul">
		{{#notifications}}
		<li data-notification-id="{{notificationId}}">
			<div style="float:right;">
				{{#showAcceptBtn}}
				<a class="btn btn-success btn-accept" href="javascript:void(0)" data-nid="{{notificationId}}">接受</a> 
				{{/showAcceptBtn}}
				{{#showRejectBtn}}
				<a class="btn btn-default btn-refuse" href="javascript:void(0)" data-nid="{{notificationId}}">拒绝</a> 
				{{/showRejectBtn}}
			</div>
			<div>
				<h5>{{content}}</h5>
				<div>
					<span>{{sendTime}}</span> <span class="label label-success read-status">{{readStatus}}</span>
				</div>
			</div>
		</li>
		{{/notifications}}

	</ul>
</script>
<script src='<c:url value="/modules/web/assets/js/user/notification.js"/>'></script>
