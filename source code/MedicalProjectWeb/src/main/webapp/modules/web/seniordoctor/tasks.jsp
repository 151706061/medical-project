<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
	<head>
		<title>我的任务</title>
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
						  <h1>我的任务 <small></small></h1>
						</div>
                     	<div class="col-sm-12">
	                     	<ul class="list-unstyled"> 
	                     		<li>
	                     			<div>
		                     			<h5>您的请求[胸腔 3张]已诊断完成，可以去支付并查看诊断报告了。</h5>
	                     				<div>
	                     					<span>2015-08-20 12:33</span>
	                     					<span class="label label-default">已读</span>
	                     				</div>
	                     			</div>
	                     		</li>
	                     	</ul>
							
                     	</div>
                     
                     
                    </div><!-- /col-12 -->
                    
                    
                    <div class="col-sm-12">
						<nav>
						  <ul class="pager">
						    <li class="previous"><a href="#"><span aria-hidden="true">&larr;</span> 上一页</a></li>
						    <li class="next"><a href="#">下一页 <span aria-hidden="true">&rarr;</span></a></li>
						  </ul>
						</nav>
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