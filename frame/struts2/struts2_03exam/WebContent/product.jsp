<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Insert title here</title>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-1.8.3.js"></script>
<script type="text/javascript">
	$(function() {

		$("#a")
				.toggle(
						function() {
							//向服务器发送请求，得到商品信息，并展示
							$
									.post(
											"${pageContext.request.contextPath}/showProduct",
											function(data) {
												//1.通过eval将data转换成js对象
												var obj = eval(data);
												if (obj.type == "0") {
													alert(obj.message);
												} else if (obj.type == "1") {
													var jsonObj = obj.content;
													//2.得到html
													var html = "<table border='1'><tr><td>编号</td><td>名称</td><td>数量</td><td>价格</td></tr>";
													//3.遍历jsonObj添加商品信息到html
													for (var i = 0; i < jsonObj.length; i++) {
														html += "<tr><td>"
																+ jsonObj[i].id
																+ "</td><td>"
																+ jsonObj[i].name
																+ "</td><td>"
																+ jsonObj[i].count
																+ "</td><td>"
																+ jsonObj[i].price
																+ "</td></tr>"
													}
													//4.将html代码展示
													html += "</table>";
													$("#d").html(html);
												}
											}, "json");
						}, function() {
							//将div中的信息清空
							$("#d").html("");
						})

	});
</script>

</head>
<body>
	<a href="javascript:void(0)" id="a">查看商品信息</a>
	<div id="d"></div>
</body>
</html>