<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
<h1>Login</h1>
<br><br>
<div class="container">
<form action="Register" method="post" onsubmit="return validate()">
<table>
	<tr>
		<td>
			<label>Name :</label>
		</td>
		<td>
			<input type="text" id="name" name="name" placeholder="Enter your name" required>
		</td>
		
	</tr>
	
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
			<label>Phone :</label>
		</td>
	<td>
	<br>
			<input type="text" id="phone" name="phone" placeholder="Enter your phone" required>
	</td>
	</tr>
	<tr>
		<td>
		<br>
			<label>Age :</label>
		</td>
	<td>
	<br>
			<input type="number" id="age" name="age" placeholder="Enter your age" required>
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
	
	<tr>
		<td>
		<br>
			<label>Confirm :</label>
		</td>
	<td>
	<br>
			<input type="password" id="repass" name="repass" placeholder="Re-enter your password" required>
	</td>
	</tr>
</table>
<br>
<input type="submit" value="sign up" id="register">

<br>
<p>Already have account?  <a href="login.jsp"> Click here to Login</a></p>


</form>
</div>
</body>
<script type="text/javascript">
function validate() 
{
    var z=true;
    var letters = /^[A-Za-z]+$/;
    var name=document.getElementById("name");
    if(name.value.match(letters))
    {

    }
    else
    {
        alert("Name should contain alphabets only");
        z=false;
    }

    var phone=document.getElementById("phone").value.length;
    if(phone!=10)
    {
        alert("Please enter a valid phone number")
        z=false;
    }
    
    var password=document.getElementById("password").value;
    var re_password=document.getElementById("repass").value;
    if(password!==re_password)
    {
        alert("password and confirm password dont match \n please enter again");
        z=false;
    }
    
console.log(z);
    if(z)
    {
        alert("Successfully registered");
        return z;
    }
    else
    	{
    	return z;
    	}
}

</script>
</html>