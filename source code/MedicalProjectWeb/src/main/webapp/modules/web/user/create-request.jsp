<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%-- 内容部分 --%>
<div class="padding">
	<div class="full col-sm-12">
		

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
<input type="file" name="file" multiple="" class="hide" data-url='<c:url value="/web/request/uploadDicom.do"/>' id="uploadFileInput" />
<%-- END 内容部分 --%>


<script id="uploadBoxTmpl" type="x-tmpl-mustache">
<div class="panel panel-default" id="uploadBox">
	<div class="panel-heading">本地导入</div>
	<div class="panel-body">
		<div class="row">
			<div class="col-sm-12">
				<div class="alert alert-warning" role="alert">请点击上传按钮，并选择同一个病人的dicom文件，若您选择的文件包含不同的病人，可以在点击完成按钮后选择病人。</div>
			</div>
			<div class="col-sm-12">
				<p class="text-info tip-text"></p>
			</div>
			<div class="col-sm-12 progress no-padding">
				<div class="progress-bar progress-bar-success progress-bar-striped upload-progress"
					role="progressbar" aria-valuenow="0" aria-valuemin="0"
					aria-valuemax="100" style="width: 0%">
					<span class="sr-only">40% Complete (success)</span>
				</div>
			</div>
			<div class="col-sm-5  col-sm-offset-4">
				<button class="btn btn-success" id="uploadDcmBtn">选取文件</button>
				<button class="btn btn-success" disabled id="completeUploadBtn">完成</button>
				<button class="btn btn-danger" id="reUploadBtn">重新上传</button>
			</div>
		</div>
	</div>
</div>
</script>

<script id="pacsBoxTmpl" type="x-tmpl-mustache">
<div class="panel panel-default" id="pacsBox">
	<div class="panel-heading">PACS 导入</div>
	<div class="panel-body">
		<div class="row">
			
			<div class="col-sm-12">
	<form>
		<div class="form-group">
			<label for="serverUrlInput">PACS 服务器地址</label> <input
				type="text" class="form-control" id="serverUrlInput"
				placeholder="PACS 服务器地址">
		</div>
		<div class="form-group">
			<label for="dateInput">日期</label> <input
				type="text" class="form-control" id="dateInput"
				placeholder="日期">
		</div>
<div class="form-group">
			<label for="devTypeInput">设备类型</label> <input
				type="text" class="form-control" id="devTypeInput"
				placeholder="设备类型">
		</div>
<div class="form-group">
			<label for="partsInput">检查部位</label> <input
				type="text" class="form-control" id="partsInput"
				placeholder="检查部位">
		</div>
		
	</form>
</div>
			<div class="col-sm-12 result-wrap">
				<div class="panel panel-success">
  <div class="panel-heading">查询结果</div>
  <div class="panel-body">
    查询到3个病例 
  </div>
	</div>



			</div>
			<div class="col-sm-5  col-sm-offset-4">
				<button class="btn btn-success btn-pacs-search" disabled>查询</button>
				<button class="btn btn-success btn-pacs-import" disabled>导入</button>
			</div>
		</div>
	</div>
</div>
</script>

<script id="medicalCaseTmpl" type="x-tmpl-mustache">
<div class="panel panel-primary case-wrap">
	<div class="panel-heading">
		<div class="row">
			<div class="col-sm-4 title-left"></div>
			<div class="col-sm-4 title-center"></div>
			<div class="col-sm-4 title-right">
				<a href="javascript:void(0)" class="glyphicon glyphicon-plus"></a>
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
