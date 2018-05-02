<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>欢迎来到数据处理</h1>
<a href="${ pageContext.request.contextPath }/ProductFindAllServlet">查询所有数据</a>|
<a href="${ pageContext.request.contextPath }/ProductFindByPageServlet?currPage=1">分页查询商品</a>
</body>
</html>