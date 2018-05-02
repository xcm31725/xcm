<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
	<h3>用户信息修改</h3>
	<form action="" method="post">
		<table border="1" width="600">
			<tr>
				<td width="120px" align="right">账号:</td>
				<td><input type="text" name="sid" value="admin" /></td>
			</tr>
			<tr>
				<td align="right">密码:</td>
				<td><input type="text" name="sname" value="admin" /></td>
			</tr>
			<tr>
				<td align="right">性别:</td>
				<td><input type="radio" name="gender" value="男"
					checked="checked" />男 <input type="radio" name="gender" value="女" />女
				</td>
			</tr>
			<tr>
				<td align="right">Email:</td>
				<td><input type="text" name="email" value="admin@service.com" /></td>
			</tr>
			<tr>
				<td align="right">电话:</td>
				<td><input type="text" name="telephone" value="13700911010" /></td>
			</tr>
			<tr>
				<td align="right">生日:</td>
				<td><input type="text" name="birthday" value="1990-12-02" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="修改" /></td>
			</tr>
		</table>
	</form>
</body>
</html>
