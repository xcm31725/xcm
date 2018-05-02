$(function(){
	//页面加载就绪后，立即加载省份数据
	$("#province").html("<option value=''>-请输入-</option>");
	$.post(lj+"/ProvinceServletDemo1",function(data){
		alert(data);
		$(data).each(function(){
			$("#province").append("<option value='"+this.pid+"'>"+this.pname+"</option>");
		});
		
		$("#province").trigger("change");
	},"json");
	
	
	$("#province").change(function(){
		$("#city").html("<option value=''>-请输入-</option>");
		var pid = $(this).val();
		$.post(lj+"/CityServletDemo1",{pid:pid},function(data){
			alert(data);
			$(data).each(function(){
				$("#city").append("<option value='"+this.cid+"'>"+this.cname+"</option>");
			});
			
		},"json");
	});
});