$(function(){
	$("#username").blur(function(){
		//alert(ctxpath);
		var username = $("this").val();
		$.get(ctxpath+"/SetvletDemo3",{username:username},function(data){
			//alert(data);
			if(data == 1){
				$("#snameSpan").html("<font color='green'>用户名可以使用</font>");
				$("#regBtn").attr("disabled",false);
			}else if(data == 2){
				$("#snameSpan").html("<font color='red'>用户名已经存在</font>");
				$("#regBtn").attr("disabled",true);
			}
		});
	});
});