<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
	<head>
		<title>登录</title>
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

		<form class="form-signin" id="loginForm">
			<h2 class="form-signin-heading">登录</h2>
			<label for="inputAccount" class="sr-only">帐号</label> 
			<input name="account"
				type="text" id="inputAccount" class="form-control"
				placeholder="请输入邮箱或手机号" required autofocus> 
			<label
				for="inputPassword" class="sr-only">密码</label> 
			<input name="password"
				type="password" id="inputPassword" class="form-control"
				placeholder="请输入密码" required>
			<div class="forget-password pull-right">
				<a href="#" class="text-muted">忘记密码?</a>
			</div>
			<button id="loginBtn" class="btn btn-lg btn-success btn-block" type="submit">登录</button>
		</form>

	</div>
	<!-- /container -->

	<%@include file="/modules/web/include/common-footer.jsp" %>
	<script src='<c:url value="/modules/web/assets/js/login.js"/>'></script>
	</body>
</html>