<%@page import="com.itheima.domian.User"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>	
	<h1>登录成功！！！</h1>
	<%
		if(request.getSession().getAttribute("existUser") == null){
	%>
		<h1>您还没有登录！请先去<a href="/web02_login/login.jsp">登录</a>！</h1>
	<%
		}else{
	%>
		<h1>用户登录成功！</h1>
	<%
		User existUser = (User)request.getSession().getAttribute("existUser");
	%>
	<h3>您好：<%= existUser.getNickname() %><a href="/web02_login/LogoutServlet">退出</a></h3>
	<%} %>
</body>
</html>