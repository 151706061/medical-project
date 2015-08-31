<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!-- top nav -->
<div class="navbar navbar-blue navbar-static-top">
	<div class="navbar-header">
		<button class="navbar-toggle" type="button" data-toggle="collapse"
			data-target=".navbar-collapse">
			<span class="sr-only">Toggle</span> <span class="icon-bar"></span> <span
				class="icon-bar"></span> <span class="icon-bar"></span>
		</button>
		<!-- <a href="/" class="navbar-brand logo">我的消息</a> -->
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
			<li class="dropdown"><a href='<c:url value="/modules/web/user/notification.jsp"/>'><i
					class="glyphicon glyphicon-envelope"></i><span class="badge">3</span></a>
				<%-- <ul class="dropdown-menu">
                          <li><a href="javascript:void(0)"><i class="glyphicon glyphicon-cog"></i>我的设置</a></li>
                          <li><a href="javascript:void(0)"><i class="glyphicon glyphicon-off"></i>退出</a></li>
                        </ul> --%></li>
			<li class="dropdown"><a href="#" class="dropdown-toggle"
				data-toggle="dropdown"><i class="glyphicon glyphicon-user"></i></a>
				<ul class="dropdown-menu">
					<li><a href='<c:url value="/modules/web/user/settings.jsp"/>'><i
							class="glyphicon glyphicon-cog"></i>我的设置</a></li>
					<li><a href="javascript:void(0)"><i
							class="glyphicon glyphicon-off"></i>退出</a></li>
				</ul></li>
		</ul>
	</nav>
</div>
<!-- /top nav -->