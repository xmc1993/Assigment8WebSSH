<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<link href='css/res_style.css' rel='stylesheet' type='text/css'/>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Welcome</title>
</head>
<body class="loop">
<div id="header">
<div id="title">
<span>成绩查询系统</span>
</div>
<div id="login-info">
<span><a href="enterLogin.action">登录</a></span>
<span>尚未登录</span>
<span><img src='<%=session.getAttribute("path") %>' alt=''></span>
</div>
</div>
<div id="welcome">
<img src="images/welcome5.jpg" class="center">
</div>
</body>
</html>