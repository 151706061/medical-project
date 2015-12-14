<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE HTML>
<html>
<head>
  <!-- Support for mobile touch devices -->
  <meta name="apple-mobile-web-app-capable" content="yes">
  <meta name="viewport" content="user-scalable=no, width=device-width, initial-scale=1, maximum-scale=1, minimal-ui">

  <!-- CSS -->

  <!-- Font awesome CSS for tool icons -->
  <link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">

  <!-- Bootstrap CSS -->
  <link href="lib/bootstrap.min.css" rel="stylesheet">

  <!-- UI CSS -->
  <link href="lib/jquery-ui.min.css" rel="stylesheet">  

  <!-- Cornerstone Base CSS -->
  <link href="lib/cornerstone.min.css" rel="stylesheet">

  <!-- Cornerstone Demo CSS -->
  <link href="css/cornerstoneDemo.css" rel="stylesheet">
  
  <script>
	var appContext = '/MedicalProjectWeb/';
	<c:if test="${not empty param.taskId}">
	var taskId = ${param.taskId };
	</c:if>
	<c:if test="${not empty param.studyId}">
	var studyId = ${param.studyId };
	</c:if>
	</script>
	<style>
		.close{
			color:#fff;
		}
		.modal-header {
		    border-bottom: 1px solid #3C3C3C;
		}
		.modal-footer {
		    border-top: 1px solid #3C3C3C;
	    }
	</style>
</head>

<body>
  <div id="wrap">

    <!-- Nav bar -->
    <nav class="myNav navbar navbar-default" role="navigation">
      <div class="container-fluid">
        <div class="navbar-header">
          <a class="navbar-brand" href="javascript:void(0)">病例诊断</a>
        </div>
        <ul class="nav navbar-nav navbar-right">
          <li>
          		<button id="viewReportBtn" class="btn btn-success hide" data-toggle="modal" data-target="#viewReportModal" style="margin:10px 0 0 0;">
				 查看诊断报告
				</button>
	         	<button id="diagnoseBtn" class="btn btn-success hide" data-toggle="modal" data-target="#dignoseModal" style="margin:10px 0 0 0;">
				 诊断
				</button>
				<button id="auditBtn" class="btn btn-success hide" data-toggle="modal" data-target="#auditModal" style="margin:10px 0 0 0;">
			  	审查
				</button>
				<button id="firstReviewBtn" class="btn btn-success hide" data-toggle="modal" data-target="#auditModal" style="margin:10px 0 0 0;">
			  	初审
				</button>
				<button id="finalReviewBtn" class="btn btn-success hide" data-toggle="modal" data-target="#auditModal" style="margin:10px 0 0 0;">
			  	终审
				</button>
          </li>
          
          </li>
          <li><a id="help" href="#" class="button hidden-xs">Help</a></li>
        </ul>
      </div>
    </nav>

    <div class='main'>

      <!-- Tabs bar -->
      <ul id="tabs" class="nav nav-tabs" >
        <%-- <li class="active"><a href="#studyList" data-toggle="tab">Study List</a></li> --%>
      </ul>

      <!-- Tab content -->
      <div id="tabContent" class="tab-content">
        <!-- Study list -->
        <div id="studyList" class="tab-pane active">
          <div class="row">
            <table  class="col-md-12 table table-striped">
              <thead>
                <tr>
                  <th>Patient Name</th>
                  <th>Patient ID</th>
                  <th>Study Date</th>
                  <th>Modality</th>
                  <th>Study Description</th>
                  <th># Images</th>
                </tr>
              </thead>
              
              <tbody id="studyListData">
                <!-- Table rows get populated from the JSON studyList manifest -->
              </tbody>
            </table>
          </div>
        </div>
      </div>

      <!-- Study viewer tab content template -->
  </div>
</div>


<div id="dignoseModal" class="modal fade">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title">诊断</h4>
      </div>
      <div class="modal-body">
        <form>
		  <div class="form-group">
		    <label for="dignoseInputPerformance">影像表现</label>
		    <textarea class="form-control" id="dignoseInputPerformance" placeholder="请输入影像表现" style="height:120px"></textarea>
		  </div>
		  <div class="form-group">
		    <label for="dignoseInputResult">影像结论</label>
		    <textarea class="form-control" id="dignoseInputResult" placeholder="请输入影像结论" style="height:120px"></textarea>
		  </div>
		</form>


      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
        <button type="button" class="btn btn-success submitReport">提交</button>
      </div>
    </div>
  </div>
</div>


<div id="auditModal" class="modal fade">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title">审查</h4>
      </div>
      <div class="modal-body">
      	<form>
      	  <div class="form-group">
      	  	<p class="doc-name"></p>
      	  </div>
		  <div class="form-group">
		    <label for="exampleInputEmail1">影像表现</label>
		    <p class="performance">这里是影响表现</p>
		  </div>
		  <div class="form-group">
		    <label for="exampleInputPassword1">影像结论</label>
		    <p class="result">这里是影像结论</p>
		  </div>
		</form>
		<hr />
        <form>
		  <div class="form-group">
		    <label for="auditInputPerformance">影像表现</label>
		    <textarea class="form-control" id="auditInputPerformance" placeholder="请输入影像表现" style="height:120px"></textarea>
		  </div>
		  <div class="form-group">
		    <label for="auditInputResult">影像结论</label>
		    <textarea class="form-control" id="auditInputResult" placeholder="请输入影像结论" style="height:120px"></textarea>
		  </div>
		  <div class="form-group hide" id="remarkWrap">
		    <label for="auditInputRemark">评分</label>
		    <select class="form-control" id="auditInputRemark">
		    	<option value="1">1分</option>
		    	<option value="2">2分</option>
		    	<option value="3">3分</option>
		    	<option value="4">4分</option>
		    	<option value="5">5分</option>
		    </select>
		  </div>
		  
		</form>


      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
        <button type="button" class="btn btn-success submitReport">提交</button>
      </div>
    </div>
  </div>
</div>


<div id="viewReportModal" class="modal fade">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title">查看诊断报告</h4>
      </div>
      <div class="modal-body">
        <form>
          <div class="form-group">
      	  	<p class="doc-name"></p>
      	  </div>
		  <div class="form-group">
		    <label>影像表现</label>
		    <p class="performance">这里是影响表现</p>
		  </div>
		  <div class="form-group">
		    <label>影像结论</label>
		    <p class="result">这里是影像结论</p>
		  </div>
		</form>


      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
      </div>
    </div>
  </div>
</div>

<!-- Javascripts -->

<!-- Include JQuery -->
<script src="lib/jquery.min.js"></script>

<!-- Include JQuery UI for drag/drop -->
<script src="lib/jquery-ui.min.js"></script>

<!-- Include JQuery Hammerjs adapter for mobile touch-->
<script src="lib/hammer.min.js"></script>

<!-- Include Bootstrap js -->
<script src="lib/bootstrap.min.js"></script>

<!-- include the cornerstone library -->
<script src="lib/cornerstone.js"></script>

<!-- include the cornerstone library -->
<script src="lib/cornerstoneMath.js"></script>

<!-- include the cornerstone tools library -->
<script src="lib/cornerstoneTools.js"></script>

<!-- include the cornerstoneWADOImageLoader library -->
<script src="lib/cornerstoneWADOImageLoader.js"></script>

<!-- include the cornerstoneWebImageLoader library -->
<script src="lib/cornerstoneWebImageLoader.js"></script>

<!-- include the dicomParser library -->
<script src="lib/dicomParser.js"></script>

<!-- include cornerstoneDemo.js -->
<script src="js/setupViewport.js"></script>
<script src="js/displayThumbnail.js"></script>
<script src="js/loadStudy.js"></script>
<script src="js/setupButtons.js"></script>
<script src="js/disableAllTools.js"></script>
<script src="js/forEachViewport.js"></script>
<script src="js/imageViewer.js"></script>
<script src="js/loadTemplate.js"></script>
<script src="js/help.js"></script>
<script src="js/about.js"></script>
<script src="js/setupViewportOverlays.js"></script>
<script src="js/cornerstoneDemo.js"></script>

<script>
var auditType = null;
$(function(){
	$.get(
		appContext + 'web/dcmviewer/getOptionPermission.do',
		{
			studyId:studyId
		},
		function(resp){
			var canViewReport = resp.data.canViewReport;
			var canDiagnose = resp.data.canDiagnose;
			var canAudit = resp.data.canAudit;
			var canViewDiagnoseAndAuditReport = resp.data.canViewDiagnoseAndAuditReport;
			var canFirstReview = resp.data.canFirstReview;
			var canFinalReview = resp.data.canFinalReview;
			
			if( canDiagnose == true){
				$('#diagnoseBtn').removeClass('hide');
			}
			if( canAudit == true){
				$('#auditBtn').removeClass('hide');
			}
			if( canViewReport == true){
				$('#viewReportBtn').removeClass('hide');
			}
			if( canFirstReview == true ){
				$('#firstReviewBtn').removeClass('hide');
			}
			if( canFinalReview == true ){
				$('#finalReviewBtn').removeClass('hide');
			}
			
			/* 
			if( !$('.nav > li.options').hasClass('hide') ){
				$('.nav > li.options').addClass('hide');
			}
			
			if( canViewReport == true ){
				$('#viewReportBtn').removeClass('hide');
			}
			if( canDiagnose == true ){
				$('#diagnoseBtn').removeClass('hide');
			}
			if( canAudit == true ){
				$('#auditBtn').removeClass('hide');
			}
			if( canViewDiagnoseAndAuditReport == true ){
			} */
			
		},
		'json'
	);
	
	$('#viewReportBtn').on('click',function(){
		$.get(
			appContext + 'web/dcmviewer/loadStudyView.do',
			{
				studyId: studyId
			},	
			function(resp){
				var performance = resp.data.diagnoseImagePerformance;
				var result = resp.data.diagnoseImageResult;
				var docName = resp.data.diagnoseUserName;
				$('#viewReportModal .performance').text(performance);
				$('#viewReportModal .result').text(result);
				
				$('#viewReportModal .doc-name').text("诊断医生："+docName);
			},
			'json'
		);	
		
	});
	
	$('#auditModal .submitReport').on('click',function(){
		var performance = $.trim($('#auditInputPerformance').val());
		var result = $.trim($('#auditInputResult').val());
		
		if( performance == '' ){
			alert('影像表现不可为空');
			return false;
		}
		
		if( result == '' ){
			alert('影像结论不可为空');
			return false;
		}
		if( auditType == 1 ){
			$.post(
					appContext + 'web/dcmviewer/submitFirstReview.do',
					{
						taskId: taskId,
						performance:performance,
						result : result
					},
					function(resp){
						if( resp.data == true ){
							window.location.reload();
							
						}
					},
					'json'
				);
		}else if( auditType == 2 ){
			$('#remarkWrap').removeClass('hide');
			var remark = $.trim($('#auditInputRemark').val());
			console.log(remark);
			if( remark == '' ){
				alert('请填写分数');
				return false;
			}
			
			$.post(
				appContext + 'web/dcmviewer/submitFinalReview.do',
				{
					taskId: taskId,
					performance:performance,
					result : result,
					remark : remark
				},
				function(resp){
					if( resp.data == true ){
						window.location.reload();
						
					}
				},
				'json'
			);
		}
		$.post(
				appContext + 'web/dcmviewer/submitAudit.do',
				{
					taskId: taskId,
					performance:performance,
					result : result
				},
				function(resp){
					if( resp.data == true ){
						alert('诊断内容已提交');
						$('#auditInputPerformance').val('');
						$('#auditInputResult').val('');
						
						$('#dignoseModal').modal('hide');
						
						window.location.reload();
						
					}
				},
				'json'
			);
	});
		
	$('#dignoseModal .submitReport').on('click',function(){
		var performance = $.trim($('#dignoseInputPerformance').val());
		var result = $.trim($('#dignoseInputResult').val());
		
		if( performance == '' ){
			alert('影像表现不可为空');
			return false;
		}
		
		if( result == '' ){
			alert('影像结论不可为空');
			return false;
		}
		
		$.post(
			appContext + 'web/dcmviewer/submitDiagnose.do',
			{
				taskId: taskId,
				performance:performance,
				result : result
			},
			function(resp){
				if( resp.data == true ){
					alert('诊断内容已提交');
					$('#dignoseModal form')[0].reset();
					$('#dignoseModal').modal('hide');
					
					window.location.reload();
				}
			},
			'json'
		);
	});
	
	$('#diagnoseBtn').on('click',function(){
		$.get(
			appContext + 'web/dcmviewer/loadStudyView.do',
			{
				studyId: studyId
			},	
			function(resp){
				var performance = resp.data.diagnoseImagePerformance;
				var result = resp.data.diagnoseImageResult;
				$('#dignoseInputPerformance').text(performance);
				$('#dignoseInputResult').text(result);
			},
			'json'
		);	
		
	});
	
	
	
	$('#firstReviewBtn').on('click',function(){
		auditType = 1; //初审
		$.get(
			appContext + 'web/dcmviewer/loadStudyView.do',
			{
				studyId: studyId
			},	
			function(resp){
				var performance = resp.data.diagnoseImagePerformance;
				var result = resp.data.diagnoseImageResult;
				var docName = resp.data.diagnoseUserName;
				$('#auditModal .performance').text(performance);
				$('#auditModal .result').text(result);
				
				$('#auditModal .doc-name').text("诊断医生： " + docName);
			},
			'json'
		);	
		
	});
	
	$('#finalReviewBtn').on('click',function(){
		auditType = 2; //终审
		$.get(
			appContext + 'web/dcmviewer/loadStudyView.do',
			{
				studyId: studyId
			},	
			function(resp){
				var performance = resp.data.firstReviewImagePerformance;
				var result = resp.data.firstReviewImageResult;
				var docName = resp.data.firstReviewUserName;
				$('#auditModal .performance').text(performance);
				$('#auditModal .result').text(result);
				
				$('#auditModal .doc-name').text("诊断医生： " + docName);
			},
			'json'
		);	
		
	});
	
	
	$('#auditBtn').on('click',function(){
		$.get(
			appContext + 'web/dcmviewer/loadStudyView.do',
			{
				studyId: studyId
			},	
			function(resp){
				var performance = resp.data.diagnoseImagePerformance;
				var result = resp.data.diagnoseImageResult;
				var docName = resp.data.diagnoseUserName;
				$('#auditModal .performance').text(performance);
				$('#auditModal .result').text(result);
				
				$('#auditModal .doc-name').text("诊断医生： " + docName);
			},
			'json'
		);	
		
	});
});
</script>
</body>
</html>