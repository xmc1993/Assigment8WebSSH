<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
 <head> 
<title>请选择上传的图片</title> 
</head>  
<body> 
<h1>怎么没有字哦</h1>
<div>
<form action="upload.action" method="post" enctype="multipart/form-data" >
<input type="file" name="uploadFile">
<input type="submit" value="上传">
</form>
</div>
</body>
<html>