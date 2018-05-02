<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<h1>登录页面！！</h1>
<h3><font color="red">${ msg }</font> </h3> 
<body>
	<form action="${ pageContext.request.contextPath }/UserServlet" method="post">
		用户名：<input type="text" name="username" /><br/>
		密码：<input type="password" name="password" /><br/>
		<input type="submit" value="登录" />
	</form>
</body>
</html>