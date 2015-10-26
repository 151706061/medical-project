<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%-- 内容部分 --%>
<div class="padding" id="qualification-application-wrap">
	<div class="full col-sm-12">
		<div class="page-header">
			<h1>
				资格审查<small></small>
			</h1>
		</div>
		<div class="col-sm-12">
			<table class="table table-hover table-with-bg-color">
				<thead>
					<tr>
						<th>用户名</th>
						<th>用户类型</th>
						<th>申请时间</th>
						<th>状态</th>
						<th>医师资格证</th>
						<th>操作</th>
					</tr>
				</thead>
				<tbody id="applicationContainer">
					
				</tbody>
			</table>
		</div>

		<div class="col-sm-12">
			<nav>
				<ul class="pager">
					<li class="previous prevBtn"><a href="#"><span aria-hidden="true">&larr;</span>
							上一页</a></li>
					<li class="next nextBtn"><a href="#">下一页 <span aria-hidden="true">&rarr;</span></a></li>
				</ul>
			</nav>
		</div>
	</div>
</div>
</div>
<!-- /padding -->


<!-- Modal -->
<div class="modal fade" id="imgModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-body" style="text-align:center">
       	<img src="" id="yszgzImg" />
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
      </div>
    </div>
  </div>
</div>

<script id="qualificationApplicationTmpl" type="x-tmpl-mustache">
{{#applications}}
<tr>
	<td>{{applyUserName}}</td>
	<td>{{applyUserType}}</td>
	<td>{{applyTime}}</td>
	<td>{{status}}</td>
	<td><a class="viewYszgz" data-src="${sessionScope["SESSION_KEY_FILE_BASE_PATH"]}{{yszgzImgRelativePath}}" href="javascript:void(0)">查看</a></td>
	<td>
		{{#isApproveShow}}
		<button type="button" class="btn btn-success btn-xs approveBtn" data-applicationid={{id}}>批准</button>
		{{/isApproveShow}}
		{{#isRejectShow}}
		<button type="button" class="btn btn-danger btn-xs rejectBtn" data-applicationid={{id}}>拒绝</button>
		{{/isRejectShow}}
	</td>
</tr>
{{/applications}}
</script>

<%-- END 内容部分 --%>
<script src='<c:url value="/modules/web/assets/js/senior/qualification-audit.js"/>'></script>