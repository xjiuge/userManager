<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>  
<html>
<head>
	<style type="text/css">
		.login_border{
			width: 400px;
			height:200px;
			margin-left: 40%;
			margin-top: 8%;
			border: 1px solid;
			padding-top: 50px;
		}
		.login_border p{
			height: 50px;
			margin-left: 60px;
		}
		.login_border p input{
			height: 40px;
			width: 200px;
		}
		.login_border button{
			padding:8px 20px;
			background: #7ca5db;
			color:#fff;
			margin-left: 160px;
			text-align: center;
			border-radius:5px;
		}
		
	</style>
</head>
<body>
<form action="${base}/login" id="loginForm">
<div class="login_border">
	<p>用户名：<input type="text" name="username"></p>
	<p>密　码：<input type="password" name="password"></p>
	
	<button onclick="login()">登录</button>
</div>
</form>
<script type="text/javascript">
	function login(){
		$("#loginForm").submit();
	}
</script>
</body>
</html>
