<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>文件上传页面</h1>
	<!-- 
		* 表单的提交的方式必须是POST.
		* 表单中需要有文件上传的表单元素:这个元素这个元素必须有name属性和值:<input type=”file” name=”upload”>
		* 表单的enctype属性的值必须是multipart/form-data.
	 -->
	<form action="${ pageContext.request.contextPath }/UploadServlet" method="post" enctype="multipart/form-data">
		<table border="1" width="600">
			<tr>
				<td>文件描述</td>
				<td><input type="text" name="filedesc"></td>
			</tr>
			<tr>
				<td>文件上传</td>
				<td><input type="file" name="upload"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="上传"></td>
			</tr>
		</table>
	</form>
</body>
</html>