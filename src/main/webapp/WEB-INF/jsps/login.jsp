<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
<h2>Login</h2>
    <form action="login" method="post">
    <pre>
       User Name:-<input type="text" value="username">
       Password:-<input type="password" value="passwoord">
       <input type="submit" value="Login">
    
    </pre>
    
    </form>
    ${msg}
</body>
</html>