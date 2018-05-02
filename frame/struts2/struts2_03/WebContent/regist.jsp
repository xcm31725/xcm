<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册页面</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.8.3.js"></script>
<script type="text/javascript">
	function checkUname(){
		var _uname = $("#uanme").val();
		//alert(_uname);
		$.post("${pageContext.request.contextPath}/checkUname",{uname:_uname},function(data){
			//alert(data);
			var jo = eval("("+data+")");
			//alert(jo.flag);
			//alert(jo.message);
			var html="";
			if(jo.flag) {
				html="<font color='green'>"+jo.message+"</font>";
			}else {
				html="<font color='red'>"+jo.message+"</font>";
			}
			
			$("#msg").html(html);
		});
		
	}

</script>
</head>
<body>
	<form action="">
		用户名：<input type="text" name="uname" id="uanme" onblur="checkUname()" /><span id="msg"></span> <br>
		用户名：<input type="password" name="password" /> 
	
	</form>

</body>
</html>