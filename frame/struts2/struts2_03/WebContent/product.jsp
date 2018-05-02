<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品展示</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.8.3.js"></script>
<script type="text/javascript">
	$(function(){
		$("#a").toggle(function(){
			//alert(0);			
			$.post("${pageContext.request.contextPath}/showProduct",function(data){
				//alert(data);
				var html="<table border='1'><tr><td>商品编号</td><td>商品名称</td><td>商品价格</td></tr>";
				//var jp = eval("("+data+")");
				var jp = eval(data);
				
				for(var i=0; i<jp.length; i++) {
					html += "<tr><td>"+jp[i].id+"</td><td>"+jp[i].name+"</td><td>"+jp[i].price+"</td></tr>";
				}
				
				html += "</table>";
				$("#pMsg").html(html);
			},"json");
			
		},function(){
			//alert(1);
			$("#pMsg").html("");
			
		});
	});
</script>
</head>
<body>

	

	<a href="javascript:void(0)" id="a">显示商品信息</a>
	
	<div id="pMsg">
	</div>
</body>
</html>