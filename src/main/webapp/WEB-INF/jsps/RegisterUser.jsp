<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register User</title>
</head>
<body>
	<h2>Register User</h2>
	<form action="RegisterUser" method="post">
		<pre>
     <h5>First Name:-</h5>
			<input type="text" name="FIRST_NAME" />
     <h5>Last Name:-</h5>
			<input type="text" name="LAST_NAME" />
     <h5>UserName/Email_ID:-</h5>
			<input type="text" name="EMAIL" />
     <h5>Password:-</h5>
			<input type="password" name="PASSWORD" />
     <h5>Conform Password:-</h5>
			<input type="conformPassword" />
     <input type="submit" value="Register" />
     </pre>
	</form>
	${msg}
</body>
</html>