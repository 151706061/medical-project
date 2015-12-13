var NotificationModule = (function() {
	
	var listNotificationParam = {
		notificationId : null,
		page: null,
		pageSize : 15,
		totalPage: null,
		t:null
	};
	
	var doReadNotification = function(notificationId, successFn) {
		$.ajax({
			url : appContext + 'web/notification/doReadNotification.do',
			data : {
				notificationId: notificationId
			},
			type : "POST",
			beforeSend : function() {
				// $('#regBtn').attr('disabled',true);
			},
			success : function(data) {
				successFn(data);
			}
		});
	};
	var processNotification = function(notifications){
		if( notifications ){
			$.each(notifications,function(i,n){
				if( n.statusCode == 1 /* 待审核 */ && n.typeCode == 1 /* 诊断邀请 */ ){
					n.showAcceptBtn = true;
					n.showRejectBtn = true;
					
				}else{
					n.showAcceptBtn = false;
					n.showRejectBtn = false;
				}
			});
		}
		return notifications;
	};
	
	var listNotification = function(page, successFn) {
		listNotificationParam.page = page;
		listNotificationParam.t = Math.random();
		$.ajax({
			url : appContext + 'web/notification/listNotification.do',
			data : listNotificationParam,
			type : "GET",
			beforeSend : function() {
				// $('#regBtn').attr('disabled',true);
			},
			success : function(result) {
				listNotificationParam.page = result.data.pager.page;
				listNotificationParam.totalPage = result.data.pager.totalPage;
				checkPageBtnStatus();
				
				// ********************
				if (result && result.data && result.data.notifications
						&& result.data.notifications.length > 0) {
					var template = $('#notificationTmpl').html();
					Mustache.parse(template);
					
					var processedNotifications = processNotification(result.data.notifications);

					var rendered = Mustache.render(template, {
						notifications : processedNotifications
					});

					$('#my-notification-wrap').html(rendered);

					$('#notification-list-ul > li').on(
							'mouseenter',
							function() {
								var $this = $(this);
								var notificationId = $this.data('notification-id');
								if ($.trim($this.find('.read-status').text()) == '未读') {
									NotificationModule.doReadNotification(notificationId,
											function(result) {
												$this.find('.read-status').text('已读');
											});
								} else {
									// have read
								}

							});

					$('.btn-accept').on('click', function() {
						var curNotificationId = $(this).data('nid');
						NotificationModule.doAccept(curNotificationId);
						return false;
					});

					$('.btn-refuse').on('click', function() {
						var curNotificationId = $(this).data('nid');
						NotificationModule.doReject(curNotificationId);
						return false;
					});

				}
			}
		});
	};
	var onPrevBtnClick = function(){
		if( listNotificationParam.page > 1 ){
			listNotificationParam.page = listNotificationParam.page -1 ;
			listNotification(listNotificationParam.page);
		}
	};
	
	var onNextBtnClick = function(){
		if( listNotificationParam.page < listNotificationParam.totalPage ){
			listNotificationParam.page = listNotificationParam.page + 1;
			listNotification(listNotificationParam.page);
		}
	};
	
	var checkPageBtnStatus = function(){
		if( listNotificationParam.page == 1 ){
			if( !$('.prevBtn').hasClass('disabled') ){
				$('.prevBtn').addClass('disabled');
			}
		}else{
			$('.prevBtn').removeClass('disabled');
		}
		
		if( listNotificationParam.totalPage != null ){
			if( listNotificationParam.page == listNotificationParam.totalPage ){
				if( !$('.nextBtn').hasClass('disabled') ){
					$('.nextBtn').addClass('disabled');
				}
			}else{
				$('.nextBtn').removeClass('disabled');
			}
		}
		
	};
	
	var doAccept = function( notificationId ){
		$.post(
			appContext + 'web/notification/doApprove.do',
			{
				notificationId : notificationId
			},
			function(resp){
				console.log(resp);
				listNotification( listNotificationParam.page );
			},
			'json'
		);
	};
	
	var doReject = function( notificationId ){
		$.post(
			appContext + 'web/notification/doReject.do',
			{
				notificationId : notificationId
			},
			function(resp){
				console.log(resp);
				listNotification( listNotificationParam.page );
			},
			'json'
		);
	};
	
	return {
		doReadNotification : doReadNotification,
		listNotification : listNotification,
		onPrevBtnClick:onPrevBtnClick,
		onNextBtnClick: onNextBtnClick,
		doAccept : doAccept,
		doReject : doReject
	}
})();

$(function() {

	NotificationModule.listNotification(1);
	
	
	$('.prevBtn').on('click',function(){
		NotificationModule.onPrevBtnClick();
	});

	$('.nextBtn').on('click',function(){
		NotificationModule.onNextBtnClick();
	});

});
