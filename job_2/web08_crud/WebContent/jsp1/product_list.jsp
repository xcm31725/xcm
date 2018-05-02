<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="${ pageContext.request.contextPath }/js/jquery-1.8.3.js"></script>
<script type="text/javascript">
	function addPage(){
		window.location.href="${ pageContext.request.contextPath }/jsp/addProduct.jsp";
	}
	
	function del(pid){
		var flag = window.confirm("您确定删除这条记录吗?");
		if(flag == true){
			window.location.href="${ pageContext.request.contextPath }/ProductDeleteServlet?pid="+pid;
		}
	}
	
	function delAll(){
		document.getElementById("form1").submit();
	}
	
	function search(){
		// 获得文本框的值:
		var pname = document.getElementById("pname").value;
		// 获得表单:
		document.getElementById("form1").action="${ pageContext.request.contextPath }/ProductSearchServlet";
		// 表单提交:
		document.getElementById("form1").submit();
	}
	
	$(function(){
		$("#selectAll").click(function(){
			$("input[id='ids']").prop("checked",this.checked);
		});
	});
</script>
</head>
<body>
<h1>商品的列表页面</h1>
<form id="form1" action="${ pageContext.request.contextPath }/ProductDeleteAllServlet" method="post">
<table border="1" width="800">
	<tr>
		<td colspan="8">
			名称:<input type="text" id="pname" name="pname"><input type="button" value="查询" onclick="search()">&nbsp;&nbsp;&nbsp;&nbsp;
			<input type="button" value="添加" onclick="addPage()"/>&nbsp;&nbsp;&nbsp;&nbsp;
			<input type="button" value="删除" onclick="delAll()"/>&nbsp;&nbsp;&nbsp;&nbsp;
		</td>	
	</tr>
	<tr>
		<td>序号</td>
		<td><input type="checkbox" id="selectAll" /></td>
		<td>商品名称</td>
		<td>市场价格</td>
		<td>商城价格</td>
		<td>是否热门</td>
		<td>是否下架</td>
		<td>操作</td>
	</tr>
	<c:forEach var="p" items="${ list }" varStatus="status">
	<tr>
		<td>${ status.count }</td>
		<td><input type="checkbox" name="ids" value="${ p.pid }"/></td>
		<td>${ p.pname }</td>
		<td>${ p.market_price }</td>
		<td>${ p.shop_price }</td>
		<td>
			<c:if test="${ p.is_hot == 1 }">
				是
			</c:if>
			<c:if test="${ p.is_hot == 0 }">
				否
			</c:if>
		</td>
		<td>
			<c:if test="${ p.pflag == 1 }">
				已下架
			</c:if>
			<c:if test="${ p.pflag == 0 }">
				未下架
			</c:if>
		</td>
		<td><a href="${ pageContext.request.contextPath }/ProductEditServlet?pid=${p.pid}">修改</a>|<a href="#" onclick="del('${p.pid}')">删除</a></td>
	</tr>
	</c:forEach>
</table>
</form>
</body>
</html>