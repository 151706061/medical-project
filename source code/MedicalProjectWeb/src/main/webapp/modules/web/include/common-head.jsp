<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<!--[if lt IE 9]>
	<script src="//html5shim.googlecode.com/svn/trunk/html5.js"></script>
<![endif]-->
<link href='<c:url value="/modules/web/assets/libs/bootstrap-3.3.5/css/bootstrap.css"/>' rel="stylesheet">
<link href='<c:url value="/modules/web/assets/css/fbstyles.css"/>' rel="stylesheet">
<link href='<c:url value="/modules/web/assets/css/style.css"/>' rel="stylesheet">
<link href='<c:url value="/modules/web/assets/libs/ajaxmask/ajaxmask.css"/>' rel="stylesheet" type="text/css"/>


<script>
var appContext = '${pageContext.request.contextPath}/';
var isCurrentUploadComplete = null;
</script>