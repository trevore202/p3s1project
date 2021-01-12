<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<font color="red">${errormessage}</font><br/>

Login<br/>

<form method="post">
Name: <input type="text" name="uname"/><br/>
Password: <input type="password" name="pass"/><br/>
<button type="submit">Login</button>

</form>

</body>
</html>