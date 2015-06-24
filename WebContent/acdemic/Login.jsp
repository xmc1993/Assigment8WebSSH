<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<link href="css/style.css" rel='stylesheet' type='text/css' />
<meta name="viewport" content="width=device-width, initial-scale=1">
<script>
	function check(obj){
		if((obj.name.value=="")||(obj.password.value=="")){
			alert("用户名或密码不能为空");
			return false;
		}
		return true;
	}
</script>
</head>
 
<body>
	<div class="main">
		<div class="user">
			<img src="images/user.png" alt="">
		</div>
		<div class="login">
			<div class="inset">
				<!-----start-main---->
				<form method="post" action="login.action" onsubmit="return check(this)">
			         <div>
						<span><label>学号</label></span>
						<span><input type="text" class="textbox" id="active" name="id"></span>
					 </div>
					 <div>
						<span><label>密码</label></span>
					    <span><input type="password" class="password" name="password"></span>
					 </div>
					<div class="sign">
						<div class="submit">
						  <input type="submit" onclick="myFunction()" value="登录" >
						</div>
						<span class="forget-pass">
						</span>
							<div class="clear"> </div>
					</div>
					</form>
				</div>
			</div>
		<!-----//end-main---->
		</div>
		 <!-----start-copyright---->
   					<div class="copy-right">
						<p>Author by <a href="#">xmc</a></p> 
					</div>
				<!-----//end-copyright---->
	 
</body>
</html>