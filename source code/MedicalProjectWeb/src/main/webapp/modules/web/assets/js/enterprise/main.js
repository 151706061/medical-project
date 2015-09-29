routie({
    'notifications': function() {
    	$("#content").load(
    			"notification.jsp",
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
    'user-manage': function() {
    	$("#content").load(
    			"user-manage.jsp",
    			null,
    			function(){
    	}); 
    }
});

$(function(){
});