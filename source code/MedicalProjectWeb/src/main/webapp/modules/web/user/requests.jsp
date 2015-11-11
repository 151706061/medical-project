<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%-- 内容部分 --%>
<div class="padding">
	<div class="full col-sm-12">
		<div class="page-header">
			<h1>
				我的请求<small></small>
			</h1>
		</div>

		<div id="requests-wrap">
			<div class="col-sm-3  col-sm-offset-4 tab-wrap">
				<div class="btn-group btn-group-justified" role="group">
					<a href='#requests'
						class="btn btn-success" role="button">历史请求</a> <a
						href='#create-request'
						class="btn btn-default" role="button">发起请求</a>
				</div>
			</div>
			<div class="col-sm-12" id="req-history-list-wrap">
				<ul class="list-unstyled" id="medicalCaseListWrap">
					
				</ul>


				<div class="col-sm-12">
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

	</div>
</div>
<!-- /padding -->

<script id="medicalCaseTmpl" type="x-tmpl-mustache">
{{#medicalCaseList}}
<li data-mcid="{{medicalCaseId}}">
	<div class="panel panel-primary case-wrap">
		<div class="panel-heading">
			<div class="row">
				<div class="col-sm-4 title-left">病例({{patientName}})</div>
				<div class="col-sm-4 title-center"></div>
				<div class="col-sm-4 title-right">共{{studys.length}}个Study</div>
			</div>
		</div>
		<div class="panel-body">
			{{#studys}}
			<%-- study --%>
			<div class="panel panel-primary">
				<div class="panel-heading">
					<div class="row">
						<div class="col-sm-4 title-left">Study ({{studyId}})</div>
						<div class="col-sm-4 title-center">{{studyDate}} {{studyDescription}}</div>
						<div class="col-sm-4 title-right">共{{seriesList.length}}个Series</div>
					</div>
				</div>
				<div class="panel-body">
					{{#seriesList}}
					<div class="panel panel-primary case-item-wrap">
						<div class="panel-heading">
							<div class="row">
								<div class="col-sm-4 title-left">Series({{ seriesNumber }})</div>
								<div class="col-sm-4 title-center"></div>
								<div class="col-sm-4 title-right">共{{instanceList.length}}个Instance</div>
							</div>
						</div>
						<div class="panel-body">
							<div class="row">
								<%--
								{{#instanceList}}
								<div class="col-sm-2">
									<img src="/ftp/{{jpgFilePath}}" alt="" class="img-thumbnail case-img" />
								</div>
								{{/instanceList}}
								--%>
								<p class="alert alert-warning">共{{instanceList.length}}个图像，点击查看病例可查看上传的病例</p>
							</div>
						</div>

					</div>
					{{/seriesList}}
				</div>
				<div class="panel-footer">
					<div class="row">
						<div class="col-sm-6 left">{{medicalCaseStatus}}</div>
						<div class="col-sm-6 right">
							<a target="_blank" href='<c:url value="/modules/cornerstone/index.jsp?studyId={{id}}"/>' class="btn btn-xs btn-link">查看病例</a>
						</div>
					</div>
				</div>
			</div>
			<%-- study end --%>
			{{/studys}}
		</div>
		<div class="panel-footer">
			<div class="row">
				<div class="col-sm-6 left">{{createTime}}</div>
				<div class="col-sm-6 right">
					
				</div>
			</div>
		</div>
	</div>


</li>
{{/medicalCaseList}}
</script>

<%-- END 内容部分 --%>
<script src='<c:url value="/modules/web/assets/js/user/requests.js"/>'></script>
	