<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
	<head>
		<title>资格申请</title>
		<%@include file="/modules/web/include/common-head.jsp" %>
	</head>
	<body>
		<div class="wrapper">
		    <div class="box">
		        <div class="row row-offcanvas row-offcanvas-left">
		 
		          
		            <%@include file="/modules/web/include/user-sidebar.jsp" %>
		          
		            <!-- main right col -->
		            <div class="column col-sm-10 col-xs-11" id="main">
		                
		                <%@include file="/modules/web/include/user-top-nav.jsp" %>
		              
		              	<%-- 内容部分 --%>
		                <div class="padding" id="qualification-application-wrap">
		                    <div class="full col-sm-12">
								<div class="page-header">
								  <h1>资格申请<small></small></h1>
								</div>
								<p class="text-muted">您可以申请成为影像医师或影像专家，申请需要上传医师资格证扫描件。</p>
								<div id="qualification-application-wrap">
									<button type="file" class="btn btn-success" id="upload-yszgz-btn">上传医师资格证</button>
									<img src="..." alt="医师资格证" class="img-thumbnail" id="yszgz-img" />

								<form>
									<div class="form-group">
										<label for="selectAuditUser">选择审核人员(非必需)</label> 
										<select class="form-control" id="selectAuditUser">
										  <option>Eden</option>
										  <option>Jack</option>
										  <option>Rose</option>
										</select>
									</div>
									<button type="submit" class="btn btn-success">提交申请</button>
								</form>

							</div>
							</div>
		                </div><!-- /padding -->
		                
		                <%-- END 内容部分 --%>
		            </div>
		            <!-- /main -->
		          
		        </div>
		    </div>
		</div>

	<%@include file="/modules/web/include/common-footer.jsp" %>
	</body>
</html>