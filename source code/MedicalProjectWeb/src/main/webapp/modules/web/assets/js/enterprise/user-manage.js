(function(){
	var UserManageModule = (function(){
		return {
			listUser:function(page,pageSize,successFn){
				$.ajax({
					url: appContext + '/web/enterprise/userManage/listAuthorizeUser.do',
					data: {
						page: page,
						pageSize: pageSize
					},
					type:"GET",
					beforeSend:function()
					{  
						//$('#regBtn').attr('disabled',true);
					},
					success:function(data){
						successFn(data);
					}
				});
			},
			authorize: function(authId,successFn){
				$.ajax({
					url: appContext + '/web/enterprise/userManage/authorize.do',
					data: {
						authId: authId
					},
					type:"POST",
					beforeSend:function()
					{  
					},
					success:function(data){
						successFn(data);
					}
				});
			},
			unauthorize: function(authId,successFn){
				$.ajax({
					url: appContext + '/web/enterprise/userManage/unauthorize.do',
					data: {
						authId: authId
					},
					type:"POST",
					beforeSend:function()
					{  
					},
					success:function(data){
						successFn(data);
					}
				});
			}
		}
	})();
	
	var page = 1;
	var pageSize = 10;
	$(function(){
		UserManageModule.listUser(page,pageSize,function(result){
			
			console.log(result);
			if( result && result.data && result.data.users && result.data.users.length > 0 ){
				var template = $('#userAuthTmpl').html();
				Mustache.parse(template);  
				var userList = result.data.users;
				var view = [];
				for(var i=0;i<userList.length;i++ ){
					(function(){
						var curUser = userList[i];
						var viewItem = {
							applyTime: curUser.applyTime,
							applyUserName : curUser.applyUserName,
							applyUserMobile : curUser.applyUserMobile,
							applyUserEmail : curUser.applyUserEmail,
							authId: curUser.authId,
							authClass :function(){
								if( curUser.authorizeStatus == null || curUser.authorizeStatus == '未授权'){
									return '';
								}
								return 'hide';
							},
							cancelAuthClass: function(){
								if( curUser.authorizeStatus != null && curUser.authorizeStatus == '已授权'){
									return '';
								}
								return 'hide';
							}
						}
						view.push(viewItem);
					})();
				}
				
				var rendered = Mustache.render(template, 
						{
							userList : view
						});
				
				$('#userTableTbody').html(rendered);
				
				$('.auth-btn').off('click');
				$('.auth-btn').on('click',function(){
					var $this = $(this);
					var authId = $this.data('authid');
					
					UserManageModule.authorize(authId,function(result){
						$this.parent().siblings('.hide').removeClass('hide');
						$this.parent().addClass('hide');
					});
					
					return false;
				});
				
				$('.cancel-auth-btn').off('click');
				$('.cancel-auth-btn').on('click',function(){
					var $this = $(this);
					var authId = $this.data('authid');
					
					UserManageModule.unauthorize(authId,function(result){
						$this.parent().siblings('.hide').removeClass('hide');
						$this.parent().addClass('hide');
					});
					return false;
				});
			}
		});
	});
	
})();