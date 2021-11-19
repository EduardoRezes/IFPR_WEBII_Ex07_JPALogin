<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Logout</title>
</head>
<link rel="stylesheet" type="text/css" href="logout.css"/>
<body>
	<div class="logout">
		<h2>Successfully Login!!!</h2>
		<p>Logout</p>
		<form action="${pageContext.request.contextPath}/logout">
			<% String user = (String) session.getAttribute("user"); %>
			<input id="button" type="submit" value="Logout" />
		</form>
	</div>
</body>
</html>