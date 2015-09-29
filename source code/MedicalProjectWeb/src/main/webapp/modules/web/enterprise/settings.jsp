<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%-- 内容部分 --%>
<div class="padding">
	<div class="full col-sm-12">
		<div class="page-header">
			<h1>
				我的设置 <small></small>
			</h1>
		</div>

		<div class="col-sm-8" id="settings-wrap">

			<form class="form-horizontal" id="settingForm">
				<div class="form-group">
					<label for="inputCompanyName" class="col-sm-2 control-label">单位名称</label>
					<div class="col-sm-10">
						<input type="text" name="userName" class="form-control"
							id="inputCompanyName" placeholder="单位名称" >
					</div>
				</div>
				<div class="form-group">
					<label for="inputContactUserName" class="col-sm-2 control-label">联系人</label>
					<div class="col-sm-10">
						<input type="tel" name="contactUserName" class="form-control"
							id="inputContactUserName" placeholder="联系人" >
					</div>
				</div>
				<div class="form-group">
					<label for="inputContactUserPhone" class="col-sm-2 control-label">联系电话</label>
					<div class="col-sm-10">
						<input type="text" name="mobile" class="form-control"
							id="inputContactUserPhone" placeholder="联系电话" >
					</div>
				</div>

				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<div class="checkbox">
							<label> <input type="checkbox" name="receiveNotification" id="receiveNotificationCheckbox" />
								有新消息时，是否短信/邮件通知
							</label>
						</div>
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<button type="submit" class="btn btn-success" id="saveSettingBtn">保存设置</button>
					</div>
				</div>
			</form>

		</div>

	</div>
</div>
<!-- /padding -->

<%-- END 内容部分 --%>

<!--post modal-->
	<div id="postModal" class="modal fade" tabindex="-1" role="dialog"
		aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">×</button>
					Update Status
				</div>
				<div class="modal-body">
					<form class="form center-block">
						<div class="form-group">
							<textarea class="form-control input-lg" autofocus=""
								placeholder="What do you want to share?"></textarea>
						</div>
					</form>
				</div>
				<div class="modal-footer">
					<div>
						<button class="btn btn-primary btn-sm" data-dismiss="modal"
							aria-hidden="true">Post</button>
						<ul class="pull-left list-inline">
							<li><a href=""><i class="glyphicon glyphicon-upload"></i></a></li>
							<li><a href=""><i class="glyphicon glyphicon-camera"></i></a></li>
							<li><a href=""><i class="glyphicon glyphicon-map-marker"></i></a></li>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script src='<c:url value="/modules/web/assets/js/enterprise/settings.js"/>'></script>