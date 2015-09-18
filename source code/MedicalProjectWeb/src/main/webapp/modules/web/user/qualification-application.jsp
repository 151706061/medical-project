<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%-- 内容部分 --%>
<div class="padding" id="qualification-application-wrap">
	<div class="full col-sm-12">
		<div class="page-header">
			<h1>
				资格申请<small></small>
			</h1>
		</div>
		<p class="text-muted">您可以申请成为影像医师或影像专家，申请需要上传医师资格证扫描件。</p>
		<div id="qualification-application-wrap">
			<label>上传医师资格证</label> <input id="uploadYszgzBtn" type="file"
				name="file" data-url='<c:url value="/"/>upload.do' />
			<!-- <input type="file" class="btn btn-success" id="uploadYszgzBtn"></input> -->
			<img src="" alt="医师资格证" class="img-thumbnail" id="yszgz-img" />
			<form id="qualificationForm">
				<input type="hidden" name="yszgzId" />
				<div class="form-group">
					<label for="selectAuditUser">选择审核人员(非必需)</label> <select
						name="auditUserId" class="form-control" id="selectAuditUser">
						<option value="0">---随机分配---</option>
					</select>
				</div>
				<button type="submit" class="btn btn-success" id="submitBtn">提交申请</button>
			</form>

		</div>
	</div>
</div>
<!-- /padding -->

<%-- END 内容部分 --%>

<script
	src='<c:url value="/modules/web/assets/libs/jquery.ui.widget.js"/>'></script>
<script
	src='<c:url value="/modules/web/assets/libs/jquery.fileupload.js"/>'></script>
<script
	src='<c:url value="/modules/web/assets/libs/jquery.iframe-transport.js"/>'></script>
<script
	src='<c:url value="/modules/web/assets/js/user/qualification-application.js"/>'></script>
