<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Login Index</title>
</head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<body>
	<form method="post" action="login.index">
       <p>user:<input type="text" name ="name"/></p>
       <p>password:<input type="password" name="password"/></p>
       <input type="submit" value="login"/>
       <h6>${err_msg}</h6>
    </form>
</body>
</html>