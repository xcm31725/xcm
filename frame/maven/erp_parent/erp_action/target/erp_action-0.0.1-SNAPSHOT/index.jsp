<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Maven測試</title>
</head>
<body>
	<h3>欢迎来到maven世界</h3><br>
	
	<c:forEach var="i" items="${list}">
		${i.uuid} 		${i.name}  		${i.tele} <br>
	</c:forEach>
	
</body>
</html>