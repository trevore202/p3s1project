<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
<br/>
<form method="post">
<br/>
Name:<input type="text" name = "uname"/><br/>
Password:<input type="password" name = "pass"/><br/>
Email:<input type="email" name = "email"/><br/>
City:<input type="text" name = "city"/><br/>
<button type="submit">Register</button>


</form>

</body>
</html>