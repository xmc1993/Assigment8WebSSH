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
<p class="warnning">*暂无任何课程成绩。</p>
<br/>
<p class="bottom">总在线人数:<%=OnlineCounter.getOnline()%>&nbsp游客人数:<%=OnlineCounter.getVistor() %>&nbsp用户人数:<%=OnlineCounter.getUser()%></p>
</body>
</html>














