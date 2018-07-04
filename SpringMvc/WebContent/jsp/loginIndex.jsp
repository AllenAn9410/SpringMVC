<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Login Index</title>
</head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<body>
	<a>this is login page</a>
	<button onclick="login()" >login</button>

</body>
<script>
 	var url = "/SpringMvc/mvc/login.index?name=allen&password=allen"
	function login(){
 		var xmlHttp = null;
 		xmlHttp = new XMLHttpRequest();
 	    xmlHttp.open( "GET", url, false );
 	    xmlHttp.send( null );
 	    return xmlHttp.responseText;
	}
	
</script>
</html>