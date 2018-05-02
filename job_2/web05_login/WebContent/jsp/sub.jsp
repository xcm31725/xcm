<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>GET提交</h1>
	<form action="${ pageContext.request.contextPath }/UserServlet" method="get">
		姓名：<input type="text" name="name" /><br>
		<input type="submit" value="提交" />
	</form>
<h1>POST提交</h1>
	<form action="${ pageContext.request.contextPath }/UserServlet" method="post">
		姓名：<input type="text" name="name" /><br>
		<input type="submit" value="提交" />
	</form>
</body>
</html>