<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<h1>Login</h1>
<br><br>
<div class="container">
<form action="Login" method="post">
<table>
	<tr>
		<td>
		<br>
			<label>Email :</label>
		</td>
		<td>
		<br>
			<input type="email" id="email" name="email" placeholder="Enter your email" required>
		</td>
	</tr>
	<tr>

		<td>
		<br>
			<label>Password :</label>
		</td>
	<td>
	<br>
			<input type="password" id="password" name="password" placeholder="Enter your password" required>
	</td>
	</tr>
	
</table>
<br>
<input type="submit" value="sign in" id="login" onclick="validate()">

<br>
<p>New user?  <a href="register.jsp"> Click here to Register</a></p>


</form>
</div>
</body>

</html>