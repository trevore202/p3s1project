<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>

Welcome, ${user.getUsername()}<br/>
<font color="red">${updateMessage}</font><br/>


<form method="post" action = "edit">
<input type="hidden" name="name" value="${user.getUsername()}"/>
Email: <input type="email" name="email" value="${user.getEmail()}"/>
City: <input type="text" name="city" value="${user.getCity()}"/>
<button type="submit">Update</button>
</form>

</body>
</html>