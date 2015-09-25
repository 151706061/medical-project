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

		<div id="create-req-wrap">
			<div class="col-sm-3  col-sm-offset-4 tab-wrap">
				<div class="btn-group btn-group-justified" role="group">
					<a href='#requests'
						class="btn btn-default" role="button">历史请求</a> <a
						href='#create-request'
						class="btn btn-success" role="button">发起请求</a>
				</div>
			</div>
			<div class="col-sm-12" id="create-req-wrap">
				<form class="form-horizontal">
					<div class="form-group">
						<label class="col-sm-2 control-label">导入方式</label>
						<div class="col-sm-8">
							<select id="importMethodSelect" class="form-control">
								<option>请选择导入方式</option>
								<option value="local">本地导入</option>
								<option value="pacs">从PACS系统导入</option>
							</select>
						</div>
					</div>
				</form>
				<div id="case-container">
				
				</div>
			</div>
			
		</div>

	</div>
</div>
<!-- /padding -->
<input type="file" name="file" <%-- multiple="" --%> class="hide" data-url='<c:url value="/web/request/uploadDicom.do"/>' id="uploadFileInput" />
<%-- END 内容部分 --%>

<script id="medicalCaseTmpl" type="x-tmpl-mustache">
<div class="panel panel-primary case-wrap">
	<div class="panel-heading">
		<div class="row">
			<div class="col-sm-4 title-left"></div>
			<div class="col-sm-4 title-center"></div>
			<div class="col-sm-4 title-right">
				<a href="javascript:void(0)" id="uploadDicomBtn" class="glyphicon glyphicon-plus"></a>
			</div>
		</div>
	</div>
	<div class="panel-body">
		<div class="panel panel-primary case-item-wrap">
			<div class="panel-heading">
				<div class="row">
					<div class="col-sm-4 title-left">Study ID 1 (张三)</div>
					<div class="col-sm-4 title-center">Study</div>
					<div class="col-sm-4 title-right">包含3个Series</div>
				</div>
			</div>
			<div class="panel-body">
				<div class="row">
					<div class="col-sm-2">
						<img src="" alt="Series1" class="img-thumbnail case-img" />
					</div>
				</div>
			</div>
			<%-- <div class="panel-footer">状态：正在诊断</div> --%>
		</div>

	</div>
	<%-- <div class="panel-footer">
										<div class="row">
											<div class="col-sm-6 left">2015-07-21 23:33</div>
											<div class="col-sm-6 right"><button type="button" class="btn btn-xs btn-link">查看报告</button></div>
										</div>
									</div> --%>
</div>
</script>
				
<script
	src='<c:url value="/modules/web/assets/libs/jquery.ui.widget.js"/>'></script>
<script
	src='<c:url value="/modules/web/assets/libs/jquery.fileupload.js"/>'></script>
<script
	src='<c:url value="/modules/web/assets/libs/jquery.iframe-transport.js"/>'></script>
<script
	src='<c:url value="/modules/web/assets/js/user/create-request.js"/>'></script>
