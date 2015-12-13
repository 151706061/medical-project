<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
	<head>
		<title>首页</title>
		<%@include file="/modules/web/include/common-head.jsp" %>
	</head>
	<body>
<div class="wrapper">
    <div class="box">
        <div class="row row-offcanvas row-offcanvas-left">
 
          
            <%@include file="/modules/web/include/juniordoctor-sidebar.jsp" %>
          
            <!-- main right col -->
            <div class="column col-sm-10 col-xs-11" id="main">
                
                <%@include file="/modules/web/include/user-top-nav.jsp" %>
              
              	<div id="content">
	              	<%-- 内容部分 --%>
	                <div class="padding">
	                    <div class="full col-sm-9">
	                      
	                    </div><!-- /col-9 -->
	                </div><!-- /padding -->
	                
	                <%-- END 内容部分 --%>
                </div>
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
	<script src='<c:url value="/modules/web/assets/js/secretary/main.js"/>'></script>
	</body>
</html>