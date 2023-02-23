<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<style>
    body{
        background-image:url("login.jpeg");
        background-size:cover;
        background: position 70px;;
    }
    h1 {
    
    }
    
</style>
</head>
<body>
<div align=center>
    <h1>WelCome</h1>
    <h1>BirthBrands Pharmacy's</h1>
<h1>Admin login</h1>
<form action=LoginServlet method=post>
<table>
<tr><td>Admin Name:</td><td><input type=text name=txtName></td></tr>
<tr><td>Admin password:</td><td><input type=password name=txtpwd></td></tr>
<tr><td><input type=submit value=Login></td><td><input type=reset></td></tr>
</table>
</form>
</div>
</body>
</html>