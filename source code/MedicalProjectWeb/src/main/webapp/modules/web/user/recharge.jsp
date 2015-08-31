<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
	<head>
		<title>预存诊费</title>
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
		                <div class="padding">
		                    <div class="full col-sm-12">
								<div class="page-header">
								  <h1>预存诊费<small></small></h1>
								</div>
								<p class="text-muted">您可以使用支付宝充值到您的帐户，帐户余额可用于xxx,xxx,xxxx。</p>
								
								<div id="recharge-wrap">
									<div class="col-sm-3  col-sm-offset-4">
										<div class="btn-group btn-group-justified" role="group" aria-label="Justified button group">
									      <a href="#" class="btn btn-default" role="button">线上支付</a>
									      <a href="#" class="btn btn-default" role="button">线下支付</a>
									    </div>
									</div>
									
									<div class="col-sm-6 col-sm-offset-3" id="recharge-form-wrap">
										
										<form>
											<div class="col-sm-8">
												<div class="form-group">
													<label class="sr-only" for="exampleInputAmount">Amount
														(in dollars)</label>
													<div class="input-group">
														<div class="input-group-addon">￥</div>
														<input type="text" class="form-control"
															id="exampleInputAmount" placeholder="请输入金额">
													</div>
												</div>
												<p class="text-muted">
													您的当前帐户余额为：￥4500
												</p>
											</div>
											<div class="col-sm-4">
											  <button type="submit" class="btn btn-success recharge-btn">去充值</button>
											</div>
										</form>
										
									</div>
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