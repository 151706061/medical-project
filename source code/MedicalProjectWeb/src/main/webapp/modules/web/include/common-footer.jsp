<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div id="msgModal" class="modal fade bs-example-modal-sm" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel">
  <div class="modal-dialog modal-sm">
    <div class="modal-content">
    	<div class="modal-header">
    	提示
    	</div>
    	<div class="modal-body">
    	
	    </div>
    	<div class="modal-footer">
	        <button type="button" class="btn btn-default" data-dismiss="modal">确定</button>
	    </div>
    </div>
    
  </div>
</div>

<div id="uploadingModal" class="modal fade bs-example-modal-sm" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel">
  <div class="modal-dialog modal-sm">
    <div class="modal-content">
    	<div class="modal-header">
    	上传
    	</div>
    	<div class="modal-body">
    	正在上传文件...
	    </div>
	    <div class="modal-footer">
	        <button type="button" class="btn btn-default" data-dismiss="modal">后台上传</button>
	    </div>
    </div>
    
  </div>
</div>
<div id="fakeLoader"></div>
<!-- script references -->
<script src='<c:url value="/modules/web/assets/libs/jquery/jquery-1.11.3.min.js"/>'></script>
<script src='<c:url value="/modules/web/assets/libs/bootstrap-3.3.5/js/bootstrap.js"/>'></script>
<script src='<c:url value="/modules/web/assets/libs/jquery.blockUI.js"/>'></script>

<script src='<c:url value="/modules/web/assets/libs/routie.js"/>'></script>
<script src='<c:url value="/modules/web/assets/libs/mustache.min.js"/>'></script>
<script src='<c:url value="/modules/web/assets/js/fbscripts.js"/>'></script>
<script src='<c:url value="/modules/web/assets/js/script.js"/>'></script>
<script>
$(function(){
	commonObj.loadUserInfo();
	commonObj.getUnreadNotificationCount();
});

var CommonModule = (function(){
	return {
		showMsg: function(msg,hasBtn){
			$.blockUI({
				fadeIn:0,
				fadeOut:0,
				message: '<div class="alert alert-info" role="alert">'+msg+'</div>' 
			});
			/* $('#msgModal').find('.modal-body').html(msg);
			$('#msgModal').modal('show');
			if( !hasBtn ){
				$('#msgModal .modal-footer').hide();
			}else{
				$('#msgModal .modal-footer').show();
			} */
		},
		hideMsg: function(){
			$.unblockUI();
			//$('#msgModal').modal('hide');
		},
		onDicomUploadProgressUpdate :function(progress){
			$('.upload-progress-text').html('文件上传中...'+progress);		
		},
		onDicomUploadComplete:function(){
			$('.upload-progress-text').html('上传完成!');
		}
	}
})();
</script>