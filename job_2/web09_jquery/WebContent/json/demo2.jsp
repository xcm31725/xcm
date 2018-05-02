<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	var lj = "${ pageContext.request.contextPath }";
</script>
<script type="text/javascript" src="${ pageContext.request.contextPath }/js/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="${ pageContext.request.contextPath }/js/json1.js"></script>
</head>
<body>
	省：
	<select id="province" name="province">
		
	</select>
	市：
	<select id="city" name="city">
		
	</select>
</body>
</html>