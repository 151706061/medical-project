<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
	<head>
		<title>注册读片哥</title>
		<%@include file="/modules/web/include/common-head.jsp" %>
		<style>
		body {
		  padding-top: 0px;
		  padding-bottom: 0px;
		  background-color: #ffe342;
		}
		</style>
	</head>
	<body>
	<div class="container">

		<form class="form-reg" id="regForm" method="POST" action='<c:url value="/web/auth/reg.do"/>'>
			<h2 class="form-reg-heading"></h2>
			<label for="selectUserType" class="sr-only">用户类型</label> 
			<select name="userType" class="form-control" id="selectUserType" required>
			  <option value="1">普通用户</option>
			  <option value="4">企业用户</option>
			</select>	
			<div class="enterprise-input-wrap">
				
			</div>
			<div class="user-input-wrap">
				<label for="inputUsername" class="sr-only">名称</label> 
				<input
					type="text" name="userName" id="inputUsername" class="form-control"
					placeholder="请输入您的名称" required />
				
				<label for="inputMobile" class="sr-only">手机号</label> 
				<input
					type="text" name="mobile" id="inputMobile" class="form-control"
					placeholder="请输入手机号" required />
					
				 
				 <label for="inputEmail" class="sr-only">邮箱</label> 
				<input
					type="email" name="email" id="inputEmail" class="form-control"
					placeholder="请输入邮箱" required />
			</div>
			<label
				for="inputPassword" class="sr-only">密码</label> 
			<input
				type="password" name="password" id="inputPassword" class="form-control"
				placeholder="请输入密码" required />
				
			<label
				for="inputPasswordAgain" class="sr-only">确认密码</label> 
			<input
				type="password" id="inputPasswordAgain" class="form-control"
				placeholder="请再次输入密码" required />
				
			<div class="checkbox">
			  <label>
			    <input type="checkbox" id="agreementCheckbox" style="display:none" checked />
			        
			  </label>
			</div>    
			<button id="regBtn" class="btn btn-lg btn-success btn-block" type="submit">注册</button>
			<a class="btn btn-link" href="login.jsp" style="display:block;text-align:center">已有账号? 登录</a>
		</form>

	</div>
	<!-- /container -->

	<div id="regSuccessModal" class="modal fade bs-example-modal-sm" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel">
	  <div class="modal-dialog modal-sm">
	    <div class="modal-content">
	    	<div class="modal-header">
	    	注册
	    	</div>
	    	<div class="modal-body">
	    	恭喜您,注册成功
		    </div>
	    	<div class="modal-footer">
		        <a href='<c:url value="/modules/web/login.jsp"/>' class="btn btn-default">去登陆</a>
		    </div>
	    </div>
	    
	  </div>
	</div>

	
	<script id="enterpriseInputTmpl" type="x-tmpl-mustache">
	<label for="inputCompanyName" class="sr-only">单位名称</label>
	<input type="text" name="companyName" id="inputCompanyName"
		class="form-control" placeholder="请输入单位名称" required />

	<label for="inputContactUserName" class="sr-only">联系人</label>
	<input type="text" name="contactUserName" id="inputContactUserName"
		class="form-control" placeholder="请输入联系人姓名" required />

	<label for="inputContactPhone" class="sr-only">联系电话</label>
	<input type="text" name="contactPhone" id="inputContactPhone"
		class="form-control" placeholder="请输入联系电话" required />
	</script>

	
	<script id="userInputTmpl" type="x-tmpl-mustache">
	<label for="inputUsername" class="sr-only">用户名</label>
	<input type="text" name="userName" id="inputUsername"
		class="form-control" placeholder="请输入用户名" required />

	<label for="inputMobile" class="sr-only">手机号</label>
	<input type="text" name="mobile" id="inputMobile" class="form-control"
		placeholder="请输入手机号" required />


	<label for="inputEmail" class="sr-only">邮箱</label>
	<input type="email" name="email" id="inputEmail" class="form-control"
		placeholder="请输入邮箱" required />
	</script>
	<%@include file="/modules/web/include/common-footer.jsp" %>
	<script src='<c:url value="/modules/web/assets/js/register.js"/>'></script>
	</body>
</html>