$(function() {
	//为省份下拉列表绑定事件：
	$("#province").change(function(){
		var pid = $(this).val();
		//alert(pid);
		//alert("Ss");
		$.post(lj+"/CityJOSNServlet",{pid:pid},function(data){
			//alert(data);
			var $city = $("#city");
			$city.html("<option>-请选择-</option>");
			$(data).each(function(i,n){
				//alert(i);
				//alert(n);
				$city.append("<option value='"+n.cid+"'>"+n.cname+"</option>");
			});
		},"json");
	});
});