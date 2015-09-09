<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
	<head>
		<title>注册</title>
		<%@include file="/modules/web/include/common-head.jsp" %>
		<style>
		body {
		  padding-top: 40px;
		  padding-bottom: 40px;
		  background-color: #eee;
		}
		</style>
	</head>
	<body>
	<div class="container">

		<form class="form-reg" id="regForm" method="POST" action='<c:url value="/web/auth/reg.do"/>'>
			<h2 class="form-reg-heading">注册</h2>
			<label for="selectUserType" class="sr-only">用户类型</label> 
			<select name="userType" class="form-control" id="selectUserType" required>
			  <option value="1">普通用户</option>
			  <option value="2">企业用户</option>
			</select>	
			
			<label for="inputUsername" class="sr-only">用户名</label> 
			<input
				type="text" name="userName" id="inputUsername" class="form-control"
				placeholder="请输入用户名" required>
			
			<label for="inputMobile" class="sr-only">用户名</label> 
			<input
				type="text" name="mobile" id="inputMobile" class="form-control"
				placeholder="请输入手机号" required>
				
			 
			 <label for="inputEmail" class="sr-only">邮箱</label> 
			<input
				type="email" name="email" id="inputEmail" class="form-control"
				placeholder="请输入邮箱" required>
				
			<label
				for="inputPassword" class="sr-only">密码</label> 
			<input
				type="password" name="password" id="inputPassword" class="form-control"
				placeholder="请输入密码" required>
				
			<label
				for="inputPasswordAgain" class="sr-only">确认密码</label> 
			<input
				type="password" id="inputPasswordAgain" class="form-control"
				placeholder="请再次输入密码" required>
				
			<div class="checkbox">
			  <label>
			    <input type="checkbox" id="agreementCheckbox" />
			        我同意xxx条款
			  </label>
			</div>
			
			<button id="regBtn" class="btn btn-lg btn-success btn-block" type="submit">注册</button>
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
	
	<%@include file="/modules/web/include/common-footer.jsp" %>
	<script src='<c:url value="/modules/web/assets/js/register.js"/>'></script>
	</body>
</html>