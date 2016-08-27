routie({
    'notifications': function() {
    	$("body").ajaxMask();
    	$("#content").load(
    			"notification.jsp",
    			null,
    			function(){
    				$("body").ajaxMask({ stop: true });
    	}); 
    },
    'qualification-application': function() {
    	$("body").ajaxMask();
    	$("#content").load(
    			"qualification-application.jsp",
    			null,
    			function(){
    				$("body").ajaxMask({ stop: true });
    	}); 
    },
    'requests': function() {
    	$("body").ajaxMask();
    	$("#content").load(
    			"requests.jsp",
    			null,
    			function(){
			$("body").ajaxMask({ stop: true });
    	}); 
    },
    'recharge': function() {
    	$("body").ajaxMask();
    	$("#content").load(
    			"recharge.jsp",
    			null,
    			function(){
			$("body").ajaxMask({ stop: true });
    	}); 
    },
    'settings': function() {
    	$("body").ajaxMask();
    	$("#content").load(
    			"settings.jsp",
    			null,
    			function(){
			$("body").ajaxMask({ stop: true });
    	}); 
    },
    'transactions': function() {
    	$("body").ajaxMask();
    	$("#content").load(
    			"transactions.jsp",
    			null,
    			function(){
			$("body").ajaxMask({ stop: true });
    	});
    },
    'create-request': function() {
    	$("body").ajaxMask();
    	$("#content").load(
    			"create-request.jsp",
    			null,
    			function(){
			$("body").ajaxMask({ stop: true });
    	}); 
    }
});

$(function(){
});