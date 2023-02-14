<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body >
<form action="LoginCtrl" method="post">

<table>
<tr>
<th>Username:</th>
<td><input type="text" name="uname"></td>
</tr>
<tr>
<th>Password:</th>
<td><input type="password" name="pwd"></td>
</tr>
<tr>
<th><input type="submit" value="Login"></th>
<td> <a href="regiPage.jsp">New Account</a></td>
</tr>
</table>
</form>
</body>
</html>