<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户注册</title>
<script type="text/javascript">
	var ctxpath = '${pageContext.request.contextPath }';
</script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/register.js"></script>
</head>
<body>
	<h3>用户注册</h3>
	<form action="${pageContext.request.contextPath }/RegistServlet"
		method="post">
		<table border="1" width="600">
			<tr>
				<td width="120px" align="right">账号:</td>
				<td><input type="text" name="username" value="" id="username" /><span id="snameSpan"></span></td>
			</tr>
			<tr>
				<td align="right">密码:</td>
				<td><input type="text" name="password" value="" /></td>
			</tr>
			<tr>
				<td align="right">性别:</td>
				<td><input type="radio" name="gender" value="男"
					checked="checked" />男 <input type="radio" name="gender" value="女" />女
				</td>
			</tr>
			<tr>
				<td align="right">Email:</td>
				<td><input type="text" name="email" value="" /></td>
			</tr>
			<tr>
				<td align="right">电话:</td>
				<td><input type="text" name="telephone" value="" /></td>
			</tr>
			<tr>
				<td align="right">生日:</td>
				<td><input type="text" name="birthday" value="" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="注册" id="regBtn"/></td>
			</tr>
		</table>
	</form>
</body>

</html>