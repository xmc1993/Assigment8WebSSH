<%@ page language="java" contentType="text/html; charse=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="acdemic.listener.OnlineCounter" %>
<%@ taglib prefix="MyTag" uri="/WEB-INF/tlds/checkSession.tld" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<MyTag:checkSession/>
<html>
<head>
<title>查询结果</title>
<link href='css/res_style.css' rel='stylesheet' type='text/css'/>
</head>
<body>
<jsp:useBean id="user" type="acdemic.model.User" scope="session"></jsp:useBean>
<div id="header">
<div id="title">
<span>成绩查询</span>
</div>
<div id="login-info">
<span><a href="logout.action">注销</a></span>
<span><jsp:getProperty name="user" property="name"/></span>
<span><img src='images/smalluser.png' alt=''></span>
</div>
</div>
<p class='top'>查询结果</p>
<hr/>
<br/>
<jsp:useBean id="listCourse" type="acdemic.action.course.CourseListBean" scope="session"></jsp:useBean>
<jsp:useBean id="course" class="acdemic.model.Course" scope="page"></jsp:useBean>
<div id="main">
<table id="customers">
<tr><th>序号</th><th>课程名称</th><th>课程成绩</th></tr>
<%for(int i=0;i<listCourse.getCourseList().size();i++){
	String index="alt";
	pageContext.setAttribute("course", listCourse.getCourseList(i));
	if((i%2)==0){
		index="odd";
	}
%>
<tr class="<%=index %>">
<td><jsp:getProperty name="course" property="id"/></td>
<td><jsp:getProperty name="course" property="courseName"/></td>
<td><jsp:getProperty name="course" property="score"/></td>
</tr>
<%} 
%>
</table>
</div>
<br/>
<p class="bottom">总在线人数:<%=OnlineCounter.getOnline()%>&nbsp游客人数:<%=OnlineCounter.getVistor() %>&nbsp用户人数:<%=OnlineCounter.getUser()%></p>
</body>
</html>














