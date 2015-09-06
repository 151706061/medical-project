<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
	<head>
		<title>发起请求 - 我的请求</title>
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
								  <h1>我的请求<small></small></h1>
								</div>
								
								<div id="create-req-wrap">
									<div class="col-sm-3  col-sm-offset-4 tab-wrap">
										<div class="btn-group btn-group-justified" role="group">
									      <a href='<c:url value="/modules/web/user/requests.jsp"/>' class="btn btn-default" role="button">历史请求</a>
									      <a href='<c:url value="/modules/web/user/create-request.jsp"/>' class="btn btn-success" role="button">发起请求</a>
									    </div>
									</div>
									<div class="col-sm-12" id="create-req-wrap">
										<form class="form-horizontal">
											<div class="form-group">
												<label class="col-sm-2 control-label">导入方式</label>
												<div class="col-sm-8">
													<select class="form-control">
														<option>本地导入</option>
														<option>从PACS系统导入</option>
													</select>
												</div>
											</div>
										</form>
										
										<div class="panel panel-primary case-wrap">
											<div class="panel-heading">
												<div class="row">
													<div class="col-sm-4 title-left"></div>
													<div class="col-sm-4 title-center"></div>
													<div class="col-sm-4 title-right"><a href="#" class="glyphicon glyphicon-plus"></a></div>
												</div>
											</div>
													<div class="panel-body">
														<div class="panel panel-primary case-item-wrap">
															<div class="panel-heading">
																<div class="row">
																	<div class="col-sm-4 title-left">病例1 (张三)</div>
																	<div class="col-sm-4 title-center">大脑</div>
																	<div class="col-sm-4 title-right">共4张</div>
																</div>
															</div>
															<div class="panel-body">
																<div class="row">
																	<div class="col-sm-2">
																		<img src="" alt="" class="img-thumbnail case-img" />
																	</div>
																	<div class="col-sm-2">
																		<img src="" alt="" class="img-thumbnail case-img" />
																	</div>
																	<div class="col-sm-2">
																		<img src="" alt="" class="img-thumbnail case-img" />
																	</div>
																	<div class="col-sm-2">
																		<img src="" alt="" class="img-thumbnail case-img" />
																	</div>
																	<div class="col-sm-2">
																		<img src="" alt="" class="img-thumbnail case-img" />
																	</div>
																</div>
															</div>
															<%-- <div class="panel-footer">状态：正在诊断</div> --%>
														</div>
														
														<div class="panel panel-primary case-item-wrap">
															<div class="panel-heading">
																<div class="row">
																	<div class="col-sm-4 title-left">病例2 (李四)</div>
																	<div class="col-sm-4 title-center">胸腔</div>
																	<div class="col-sm-4 title-right">共2张</div>
																</div>
															</div>
															<div class="panel-body">
																<div class="row">
																	<div class="col-sm-2">
																		<img src="" alt="" class="img-thumbnail case-img" />
																	</div>
																	<div class="col-sm-2">
																		<img src="" alt="" class="img-thumbnail case-img" />
																	</div>
																	<div class="col-sm-2">
																		<img src="" alt="" class="img-thumbnail case-img" />
																	</div>
																	<div class="col-sm-2">
																		<img src="" alt="" class="img-thumbnail case-img" />
																	</div>
																	<div class="col-sm-2">
																		<img src="" alt="" class="img-thumbnail case-img" />
																	</div>
																</div>
															</div>
															<%-- <div class="panel-footer">状态：完成诊断</div> --%>
														</div>
													</div>
													<%-- <div class="panel-footer">
														<div class="row">
															<div class="col-sm-6 left">2015-07-21 23:33</div>
															<div class="col-sm-6 right"><button type="button" class="btn btn-xs btn-link">查看报告</button></div>
														</div>
													</div> --%>
												</div>
												
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