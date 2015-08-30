<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
	<head>
		<title>我的消息</title>
		<%@include file="/modules/web/include/common-head.jsp" %>
	</head>
	<body>
<div class="wrapper">
    <div class="box">
        <div class="row row-offcanvas row-offcanvas-left">
 
          
            <!-- sidebar -->
            <div class="column col-sm-2 col-xs-1 sidebar-offcanvas" id="sidebar">
              
              	<ul class="nav lfpadding10">
          			<li><a href="#" data-toggle="offcanvas" class="visible-xs text-center"><i class="glyphicon glyphicon-chevron-right"></i></a></li>
            	</ul>
               
               <div class="column-sm-12 userinfo-col hidden-xs">
               		<div class="userinfo">
               			<div><img class="user-head" src='<c:url value="/modules/web/assets/img/head.png"/>'> <h3 class="username">王力宏</h3> </div> 
               			<ul class="list-unstyled user-info-extra">
               				<li>普通用户</li>
               				<li>14782394091</li>
               				<li>xinem@126.com</li>
               			</ul>
               		</div>
               </div>
                <ul class="nav hidden-xs" id="lg-menu">
                    <li><a href="#"><i class="glyphicon glyphicon-open"></i> 我的请求</a></li>
                    <li><a href="#"><i class="glyphicon glyphicon-yen"></i> 预存诊费</a></li>
                    <li><a href="#"><i class="glyphicon glyphicon-transfer"></i> 交易记录</a></li>
                    <li><a href="#"><i class="glyphicon glyphicon-book"></i> 资格申请</a></li>
                </ul>
                <ul class="list-unstyled hidden-xs lfpadding10" id="sidebar-footer">
                    <li>
                      <a href="#"><h5>Medical Project</h5></a>
                    </li>
                </ul>
              
              	<!-- tiny only nav-->
              <ul class="nav visible-xs lfpadding" id="xs-menu">
                  	<li><a href="#" class="text-center"><i class="glyphicon glyphicon-list-alt"></i></a></li>
                    <li><a href="#" class="text-center"><i class="glyphicon glyphicon-list"></i></a></li>
                  	<li><a href="#" class="text-center"><i class="glyphicon glyphicon-paperclip"></i></a></li>
                    <li><a href="#" class="text-center"><i class="glyphicon glyphicon-refresh"></i></a></li>
                </ul>
              
            </div>
            <!-- /sidebar -->
          
            <!-- main right col -->
            <div class="column col-sm-10 col-xs-11" id="main">
                
                <!-- top nav -->
              	<div class="navbar navbar-blue navbar-static-top">  
                    <div class="navbar-header">
                      <button class="navbar-toggle" type="button" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">Toggle</span>
                        <span class="icon-bar"></span>
          				<span class="icon-bar"></span>
          				<span class="icon-bar"></span>
                      </button>
                      <a href="/" class="navbar-brand logo">M</a>
                  	</div>
                  	<nav class="collapse navbar-collapse" role="navigation">
                    <%-- <form class="navbar-form navbar-left">
                        <div class="input-group input-group-sm" style="max-width:360px;">
                          <input type="text" class="form-control" placeholder="Search" name="srch-term" id="srch-term">
                          <div class="input-group-btn">
                            <button class="btn btn-default" type="submit"><i class="glyphicon glyphicon-search"></i></button>
                          </div>
                        </div>
                    </form>
                    <ul class="nav navbar-nav">
                      <li>
                        <a href="#"><i class="glyphicon glyphicon-home"></i> Home</a>
                      </li>
                      <li>
                        <a href="#postModal" role="button" data-toggle="modal"><i class="glyphicon glyphicon-plus"></i> Post</a>
                      </li>
                      <li>
                        <a href="#"><span class="badge">badge</span></a>
                      </li>
                    </ul> --%>
                    <ul class="nav navbar-nav navbar-right">
                      <li class="dropdown">
                        <a href="#"><i class="glyphicon glyphicon-envelope"></i><span class="badge">3</span></a>
                        <%-- <ul class="dropdown-menu">
                          <li><a href="javascript:void(0)"><i class="glyphicon glyphicon-cog"></i>我的设置</a></li>
                          <li><a href="javascript:void(0)"><i class="glyphicon glyphicon-off"></i>退出</a></li>
                        </ul> --%>
                      </li>
                      <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="glyphicon glyphicon-user"></i></a>
                        <ul class="dropdown-menu">
                          <li><a href="javascript:void(0)"><i class="glyphicon glyphicon-cog"></i>我的设置</a></li>
                          <li><a href="javascript:void(0)"><i class="glyphicon glyphicon-off"></i>退出</a></li>
                        </ul>
                      </li>
                    </ul>
                  	</nav>
                </div>
                <!-- /top nav -->
              
              	<%-- 内容部分 --%>
                <div class="padding">
                    <div class="full col-sm-12">


                     	<div id="my-notification-wrap">
	                     	<h1 class="well">我的消息</h1>
	                     	
	                     	<ul class="list-unstyled" id="notification-list-ul"> 
	                     		<li>
	                     			<div>
		                     			<h5>您的请求[胸腔 3张]已诊断完成，可以去支付并查看诊断报告了。</h5>
	                     				<div>
	                     					<span>2015-08-20 12:33</span>
	                     					<span class="label label-success">已读</span>
	                     				</div>
	                     			</div>
	                     			
	                     		</li>
	                     		<li>
	                     			<div>
		                     			<h5>您的请求[胸腔 3张]已诊断完成，可以去支付并查看诊断报告了。</h5>
	                     				<div>
	                     					<span>2015-08-20 12:33</span>
	                     					<span class="label label-success">已读</span>
	                     				</div>
	                     			</div>
	                     			
	                     		</li>
	                     		<li>
	                     			<div>
		                     			<h5>您的请求[胸腔 3张]已诊断完成，可以去支付并查看诊断报告了。</h5>
	                     				<div>
	                     					<span>2015-08-20 12:33</span>
	                     					<span class="label label-success">已读</span>
	                     				</div>
	                     			</div>
	                     			
	                     		</li>
	                     		<li>
	                     			<div>
		                     			<h5>您的请求[胸腔 3张]已诊断完成，可以去支付并查看诊断报告了。</h5>
	                     				<div>
	                     					<span>2015-08-20 12:33</span>
	                     					<span class="label label-success">已读</span>
	                     				</div>
	                     			</div>
	                     			
	                     		</li>
	                     		<li>
	                     			<div>
		                     			<h5>您的请求[胸腔 3张]已诊断完成，可以去支付并查看诊断报告了。</h5>
	                     				<div>
	                     					<span>2015-08-20 12:33</span>
	                     					<span class="label label-success">已读</span>
	                     				</div>
	                     			</div>
	                     			
	                     		</li>
	                     		<li>
	                     			<div>
		                     			<h5>您的请求[胸腔 3张]已诊断完成，可以去支付并查看诊断报告了。</h5>
	                     				<div>
	                     					<span>2015-08-20 12:33</span>
	                     					<span class="label label-success">已读</span>
	                     				</div>
	                     			</div>
	                     			
	                     		</li>
	                     		<li>
	                     			<div>
		                     			<h5>您的请求[胸腔 3张]已诊断完成，可以去支付并查看诊断报告了。</h5>
	                     				<div>
	                     					<span>2015-08-20 12:33</span>
	                     					<span class="label label-success">已读</span>
	                     				</div>
	                     			</div>
	                     			
	                     		</li>
	                     		<li>
	                     			<div>
		                     			<h5>您的请求[胸腔 3张]已诊断完成，可以去支付并查看诊断报告了。</h5>
	                     				<div> 
	                     					<span>2015-08-20 12:33</span>
	                     					<span class="label label-success">已读</span>
	                     				</div>
	                     			</div>
	                     			
	                     		</li>
	                     	</ul>
							
                     	</div>
                     
                     
                    </div><!-- /col-9 -->
                </div><!-- /padding -->
                
                <%-- END 内容部分 --%>
            </div>
            <!-- /main -->
          
        </div>
    </div>
</div>


<!--post modal-->
<div id="postModal" class="modal fade" tabindex="-1" role="dialog" aria-hidden="true">
  <div class="modal-dialog">
  <div class="modal-content">
      <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
			Update Status
      </div>
      <div class="modal-body">
          <form class="form center-block">
            <div class="form-group">
              <textarea class="form-control input-lg" autofocus="" placeholder="What do you want to share?"></textarea>
            </div>
          </form>
      </div>
      <div class="modal-footer">
          <div>
          <button class="btn btn-primary btn-sm" data-dismiss="modal" aria-hidden="true">Post</button>
            <ul class="pull-left list-inline"><li><a href=""><i class="glyphicon glyphicon-upload"></i></a></li><li><a href=""><i class="glyphicon glyphicon-camera"></i></a></li><li><a href=""><i class="glyphicon glyphicon-map-marker"></i></a></li></ul>
		  </div>	
      </div>
  </div>
  </div>
</div>
	<%@include file="/modules/web/include/common-footer.jsp" %>
	</body>
</html>