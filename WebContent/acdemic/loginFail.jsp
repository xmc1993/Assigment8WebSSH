<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="acdemic.listener.OnlineCounter" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录失败</title>
<link href='css/res_style.css' rel='stylesheet' type='text/css'/>
</head>
<body>
<div id="header">
<div id="title">
<span>成绩查询</span>
</div>
</div>
<p class='warnning'>用户名不存在，或密码错误！</p>
<p class='bottom'><a href='enterLogin.action'>返回</a></p>
<br/>
<br/>
<p class="bottom">总在线人数:<%=OnlineCounter.getOnline()%>&nbsp游客人数:<%=OnlineCounter.getVistor() %>&nbsp用户人数:<%=OnlineCounter.getUser()%></p>
</body>
</html>