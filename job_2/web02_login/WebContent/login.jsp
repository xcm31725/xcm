<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登录页面</title>
</head>
<script type="text/javascript">
	function changeImg() {
		document.getElementById("img1").src="/web02_login/CheckImgServlet?time="+new Date().getTime();
	}
</script>
<body>
	<h1>登录页面</h1>
	<%
		String msg = "";
		if(request.getAttribute("msg") != null) {
			msg = (String)request.getAttribute("msg");
		}
	%>
	<h3><font color="red"><%= msg %></font></h3>
	<form action="/web02_login/LoginServlet" method="post">
		用户名：<input type="text" name="username" value="${ cookie.remember.value }"/><br/>
		密码：<input type="password" name="password" /><br/>
		验证码：<input type="text" name="checkcode" size="6" />
		<img id="img1" src="/web02_login/CheckImgServlet"/>
		<a href="#" onclick="changeImg()">看不清，换一张</a>
		<br/>
		<input type="checkbox" value="true" name="remember" />记住用户名<br/>
		<input type="submit" value="登录" />
	</form>
</body>
</html>