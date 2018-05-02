<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登录页面</title>
</head>
<body>
	<h1>登录页面</h1>
	<%
		String msg = "";
		if(request.getAttribute("msg") != null) {
			msg = (String)request.getAttribute("msg");
		}
	%>
	<form action="/login/LoginServlet" method="post">
		用户名：<input type="text" name="username" /><h3><font color="red"><%= msg %></font></h3><br/>
		密码：<input type="password" name="password" /><br/>
		<input type="submit" value="登录" />
	</form>
</body>
</html>