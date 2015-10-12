routie({
    'notifications': function() {
    	$("#content").load(
    			"notification.jsp",
    			null,
    			function(){
    	}); 
    },
    'tasks': function() {
    	$("#content").load(
    			"tasks.jsp",
    			null,
    			function(){
    	}); 
    },
    'qualification-audit': function() {
    	$("#content").load(
    			"qualification-audit.jsp",
    			null,
    			function(){
    	}); 
    },
    'requests': function() {
    	$("#content").load(
    			"requests.jsp",
    			null,
    			function(){
    	}); 
    },
    'recharge': function() {
    	$("#content").load(
    			"recharge.jsp",
    			null,
    			function(){
    	}); 
    },
    'settings': function() {
    	$("#content").load(
    			"settings.jsp",
    			null,
    			function(){
    	}); 
    },
    'transactions': function() {
    	$("#content").load(
    			"transactions.jsp",
    			null,
    			function(){
    	});
    },
    'create-request': function() {
    	$("#content").load(
    			"create-request.jsp",
    			null,
    			function(){
    	}); 
    }
});

$(function(){
});