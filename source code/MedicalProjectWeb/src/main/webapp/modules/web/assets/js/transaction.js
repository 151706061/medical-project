(function(){
	var page = 1;
	var pageSize = 10;
	$(function(){
		$('#periodBtnGroup > a').on('click',function(){
			var $this = $(this);
			var periodType = $this.data('period-type');

			$('#periodBtnGroup > a.btn-success').removeClass('btn-success').addClass('btn-default');
			$this.removeClass('btn-default').addClass('btn-success');
			
			TransactionModule.listTransaction(periodType,page,pageSize);
		});
		
		var periodType = null;
		TransactionModule.listTransaction(periodType,page,pageSize);
	});
	
	var TransactionModule = (function(){
		return {
			listTransaction:function(periodType,page,pageSize){
				$.ajax({
					url: appContext + 'web/transaction/listTransaction.do',
					data: {
						periodType: periodType,
						page: page,
						pageSize: pageSize
					},
					type:"GET",
					beforeSend:function()
					{  
						//$('#regBtn').attr('disabled',true);
					},
					success:function(result){
						if( result && result.data && result.data.transactions && result.data.transactions.length > 0 ){
							var template = $('#transTableTmpl').html();
							Mustache.parse(template);  
							var rendered = Mustache.render(template, {transactions: result.data.transactions});
							
							$('#transTableWrap').html(rendered);
						}
					}
				});
			}
		}
	})();
	
})();