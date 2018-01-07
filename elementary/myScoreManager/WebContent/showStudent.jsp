<%@page import="com.lan.entity.Student"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.lanou.dao.StudentDaoImpl"%>
<%@page import="com.lanou.dao.IStudentDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<!-- start: Meta -->
<meta charset="utf-8">
<title>所有学员</title>

<!-- end: Meta -->

<!-- start: Mobile Specific -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- end: Mobile Specific -->

<!-- start: CSS -->
<link id="bootstrap-style" href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/bootstrap-responsive.min.css" rel="stylesheet">
<link id="base-style" href="css/style.css" rel="stylesheet">
<link id="base-style-responsive" href="css/style-responsive.css"
	rel="stylesheet">
<link
	href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800&subset=latin,cyrillic-ext,latin-ext'
	rel='stylesheet' type='text/css'>
<!-- end: CSS -->

</head>
   <%
   	IStudentDao dao = new StudentDaoImpl();
    //搜索框传过来的key值
   	String key = request.getParameter("key");
    //如果没有页面,默认当前页面为1
    int index = 1;
    //如果有index页面传过来,那么页码就为传过来的值
    String indexStr = request.getParameter("index");
    if(indexStr!=null){
    	index = Integer.valueOf(indexStr);
    }
    //自定义每页显示2个
    int count = 6;
    //当前student表中数据最多可以显示多少页
    int pageCount = dao.getPageCount(count);
    //把pageCount和index保存在session对象中
    session.setAttribute("index",index);
    session.setAttribute("pageCount",pageCount);
    //根据当前页码和每页显示个数查询student对象
    
	//判断如果key值为空,没有进行搜索 
	if(key==null){
   		//获取所有的学生对象
   		ArrayList<Student> stus = dao.getStudentByIndex(index, count);
    	//将查询出来的stus集合存到session对象中
   		 session.setAttribute("stus",stus);
	}else{//如果不为空,根据key进行模糊搜索
		ArrayList<Student> stus = dao.getStudentByKey(key);
	    //将查询出来的stus集合存到session对象中
    	session.setAttribute("stus",stus);
	}
   %>
   
<body>
	<!-- start: Header -->
	<div class="navbar">
		<div class="navbar-inner">
			<div class="container-fluid">
				<a class="btn btn-navbar" data-toggle="collapse"
					data-target=".top-nav.nav-collapse,.sidebar-nav.nav-collapse">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
				</a> <a class="brand" href="#"><span>蓝鸥学员管理系统</span></a>
				<!-- start: Header Menu -->
				<div class="nav-no-collapse header-nav">
					<ul class="nav pull-right">
						<!-- start: User Dropdown -->
						<li class="dropdown"><a class="btn dropdown-toggle"
							data-toggle="dropdown" href="#"> <i
								class="halflings-icon white user"></i>${username }<span
								class="caret"></span>
						</a>
							<ul class="dropdown-menu">
								<li class="dropdown-menu-title"><span>账户设置</span></li>
								<li><a href="LogOutAction"><i
										class="halflings-icon off"></i> 退出登录</a></li>
							</ul></li>
						<!-- end: User Dropdown -->
					</ul>
				</div>
			</div>
		</div>
	</div>
	<!-- start: Header -->

	<div class="container-fluid-full">
		<div class="row-fluid">
			<!-- start: Content -->
			<div id="content" class="span10">
				<div class="row-fluid sortable">
					<div class="box span12">
						<div class="box-header" data-original-title>
							<h2>
								<i class="halflings-icon white user"></i><span class="break"></span>所有学员
							</h2>
							<div style="margin-top: -8px" align="right">
							  <form action="showStudent.jsp">
								<input type="text" class="form-control" name="key">
								<input type="submit" value="搜索" style="margin-top: -8px">
								<input type="button" onclick="window.location.replace('addStudent.jsp')" value="添加" style="margin-top: -8px">
							  </form>
							</div>
						</div>
						<div class="box-content">
							<table
								class="table table-striped table-bordered bootstrap-datatable ">
								<thead>
									<tr>
										<th>姓名</th>
										<th>性别</th>
										<th>数学</th>
										<th>英语</th>
										<th>语文</th>
										<th>操作</th>
									</tr>
								</thead>
								<tbody>	
								<!-- 在stus中遍历，每次遍历得到的结果名为student
								     ${stus}为从session对象中取出的集合
								 -->
								<c:forEach var="student" items="${stus}">
										<tr>
											<td>${student.name }</td>
											<td class="center">${student.sex }</td>
											<td class="center">${student.math }</td>
											<td class="center">${student.english }</td>
											<td class="center">${student.chinses }</td>
											
											<td class="center">
											 <a class="btn btn-info" href="signup.jsp?id=${student.id }"> <i class="halflings-icon white edit"></i></a> 
											 <a class="btn btn-danger" onclick="return confirm('确认删除吗?')" href="deleteServlet?id=${student.id }" > <i class="halflings-icon white trash"></i></a>
											 </td>
										</tr>
								</c:forEach>
								</tbody>
							</table>
							<div align="center">
							<c:if test="${index>1}">
								
								<a href="showStudent.jsp?index=${index-1 }">上一页</a> 
								</c:if>
								<b>第${index}页,共${pageCount }页</b> 
								<c:if test="${index<pageCount }">
								<a href="showStudent.jsp?index=${index+1 }">下一页</a>
								</c:if>
							</div>

						</div>
					</div>
					<!--/span-->

				</div>
				<!--/row-->
			</div>
		</div>
	</div>
	<!--/fluid-row-->
	<div id="main"  style="width: 100%;height:400px; background-color: white;"></div>
	
	<div class="clearfix"></div>


    
	<footer>

	<p>
		<span style="text-align: left; float: left">&copy; 2017 <a
			href="#">开发小组:甲骨文 成员: 杨xx 王xx 刘xx</a></span>
	</p>

	</footer>

	<!-- start: JavaScript-->

	<script src="js/jquery-1.9.1.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/echarts.min.js"></script>
	<script type="text/javascript">
	// 基于准备好的dom，初始化echarts实例
    var myChart = echarts.init(document.getElementById('main'));
	var a = 10;
    // 指定图表的配置项和数据
    
    $.ajax({
        url:"GraphiceAction",
        type:"get",
        success:function(result){
        	var arr = result.split(",");
        	var option = {
        	        title: {
        	            text: '各学科及格率'
        	        },
        	        tooltip: {},
        	        legend: {
        	        	
        	            data:['jg']
        	        },
        	        xAxis: {
        	            data: ["数学","英语","语文",'综合成绩']
        	        },
        	        yAxis: {},
        	        series: [{
        	            type: 'bar',
        	            data: arr
        	        }]
        	    };
          	myChart.setOption(option); 
        },
    }); 	
    // 使用刚指定的配置项和数据显示图表。
    
	</script>
	 
        
	<!-- end: JavaScript-->
	
</body>
</html>