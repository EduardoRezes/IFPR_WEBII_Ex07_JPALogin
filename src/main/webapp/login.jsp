<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<link rel="stylesheet" type="text/css" href="login.css"/>
<body>
	 
	<div class="login">
		<form action="${pageContext.request.contextPath}/login" >
			<label><strong>Login:</strong></label>
			<input class="log" type="text" name="login"  />
			<br />
			<br />
			<br />
			<label><Strong>Password:</Strong></label>
			<input class="log" type="password" name="password"  />
			<br />
			<br />
			<br />
			<input id="button" type="submit" value="submit" />
		</form>
	</div>
</body>
</html>