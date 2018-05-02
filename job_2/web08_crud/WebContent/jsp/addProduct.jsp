<%@page import="com.itheima.utils.UUIDUtils"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String token = UUIDUtils.getUUID();
	session.setAttribute("token", token);
%>

<form action="${ pageContext.request.contextPath }/ProductAddServlet" method="post">
	<input type="hidden" name="token" value="${ token }" />
	<table border="1" width="600">
		<tr>
			<td>商品名称</td>
			<td><input type="text" name="pname"></td>
		</tr>
		<tr>
			<td>市场价格</td>
			<td><input type="text" name="market_price"></td>
		</tr>
		<tr>
			<td>商城价格</td>
			<td><input type="text" name="shop_price"></td>
		</tr>
		<tr>
			<td>是否热门</td>
			<td><input type="radio" name="is_hot" value="1" checked>是<input type="radio" name="is_hot" value="0">否</td>
		</tr>
		<tr>
			<td>是否下架</td>
			<td>
				<select name="pflag">
					<option value="0" selected>否</option>
					<option value="1" >是</option>
				</select>
			</td>
		</tr>
		<tr>
			<td>商品描述</td>
			<td><textarea name="pdesc" cols="20" rows="4"></textarea></td>
		</tr>
		<tr>
		<td>商品分类</td>
			<td>
			<select name="cid">
			  <option value="1">手机数码</option>
			  <option value="2">电脑办公</option>
			  <option value="3">汽车用品</option>
			  <option value="4">鞋靴箱包</option>
			</select>
			</td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="添加"></td>
		</tr>
	</table>
</form>
</body>
</html>