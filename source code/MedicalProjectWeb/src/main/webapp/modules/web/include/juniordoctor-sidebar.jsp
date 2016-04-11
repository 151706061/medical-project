<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!-- sidebar -->
<div class="column col-sm-2 col-xs-1 sidebar-offcanvas" id="sidebar">
  
  	<ul class="nav lfpadding10">
	<li><a href="#" data-toggle="offcanvas" class="visible-xs text-center"><i class="glyphicon glyphicon-chevron-right"></i></a></li>
	</ul>
   
   <div class="column-sm-12 userinfo-col hidden-xs">
   		<div class="userinfo" id="user-info-wrap">
   			<div><img class="user-head" src='<c:url value="/modules/web/assets/img/head.png"/>'> <h3 class="username"></h3> </div> 
   			<ul class="list-unstyled user-info-extra">
   				<li class="userremark"></li>
   				<li class="usertype"></li>
   				<li class="mobile"></li>
   				<li class="email"></li>
   			</ul>
   		</div>
   </div>
    <ul class="nav hidden-xs" id="lg-menu">
        <li><a href='#requests'><i class="glyphicon glyphicon-open"></i> 我的请求</a></li>
        <li><a href='#tasks'><i class="glyphicon glyphicon-open"></i> 我的任务<span class="badge" style="display:none;">&nbsp;</span></a></li>
        <li><a href='#recharge'><i class="glyphicon glyphicon-yen"></i> 预存诊费</a></li>
        <li><a href='#transactions'><i class="glyphicon glyphicon-transfer"></i> 交易记录</a></li>
        <li><a href='#qualification-application'><i class="glyphicon glyphicon-book"></i> 资格申请</a></li> 
		<li><a href='#settings'><i class="glyphicon glyphicon-cog"></i> 我的设置</a></li>
		<li><a href='<c:url value="/web/common/logout.do" />'><i class="glyphicon glyphicon-off"></i> 退出</a></li>
    </ul>
    <ul class="list-unstyled hidden-xs lfpadding10" id="sidebar-footer">
        <li>
         
        </li>
    </ul>
  
  	<!-- tiny only nav-->
  <ul class="nav visible-xs lfpadding" id="xs-menu">
      	
    </ul>
  
</div>
<!-- /sidebar -->