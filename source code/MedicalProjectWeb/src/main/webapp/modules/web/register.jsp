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

		<form class="form-reg">
			<h2 class="form-reg-heading">注册</h2>
			<label for="selectUserType" class="sr-only">用户类型</label> 
			<select class="form-control" id="selectUserType" required>
			  <option>1</option>
			  <option>2</option>
			  <option>3</option>
			  <option>4</option>
			  <option>5</option>
			</select>	
			
			<label for="inputUsername" class="sr-only">用户名</label> 
			<input
				type="text" id="inputUsername" class="form-control"
				placeholder="请输入用户名" required>
			
			<label for="inputMobile" class="sr-only">用户名</label> 
			<input
				type="text" id="inputMobile" class="form-control"
				placeholder="请输入手机号" required>
				
			 
			 <label for="inputEmail" class="sr-only">邮箱</label> 
			<input
				type="text" id="inputEmail" class="form-control"
				placeholder="请输入邮箱" required>
				
			<label
				for="inputPassword" class="sr-only">密码</label> 
			<input
				type="password" id="inputPassword" class="form-control"
				placeholder="请输入密码" required>
				
			<label
				for="inputPasswordAgain" class="sr-only">确认密码</label> 
			<input
				type="password" id="inputPasswordAgain" class="form-control"
				placeholder="请再次输入密码" required>
				
			<div class="checkbox">
			  <label>
			    <input type="checkbox" value="">
			        我同意xxx条款
			  </label>
			</div>
			
			<button class="btn btn-lg btn-success btn-block" type="submit">注册</button>
		</form>

	</div>
	<!-- /container -->

	<%@include file="/modules/web/include/common-footer.jsp" %>
	</body>
</html>