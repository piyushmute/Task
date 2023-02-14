<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
<form action="RegiCtrl.jsp" method="post"></form>
		<table>
			<tr>
				<th>Name:</th>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<th>Email:</th>
				<td><input type="text" name ="email"></td>
			</tr>
			<tr>
				<th>Password:</th>
				<td><input type ="password" name="pwd"></td>
			</tr>
			<tr>
				<th>Gender:</th>
				<td>
				male:<input type="radio" name="gender" value="male">
				female:<input type="radio" name="gender" value="female">
				other:<input type="radio" name="gender" value="other">
				</td>
			</tr>
			<tr>
				<th>Country:</th>
				<td><input type="text" name="country" value="India"></td>
			</tr>
			<tr>
				<th>Phno:</th>
				<td><input type="text" name="phno"></td>
			</tr>
			<tr>
				<th><input type="submit" value="Register"></th>
				<td></td>
			</tr>
		</table>
		
</body>
</html>