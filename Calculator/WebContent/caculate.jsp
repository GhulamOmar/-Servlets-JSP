<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculation</title>
</head>
<body>
<h1>Welcome to calculator page</h1>
<h2>Calculator</h2><br>
<form method=post action="getCaculation">
 <input type=text name=userinput1 size= "20">
 <select name=operator class="a">
  <option selected>+</option>
  <option>-</option>
  <option>*</option>
  <option>/</option>
 </select>
 <input type=text name=userinput2 size= "20">
 <input type=submit value="=" size="5">
</form>
</body>
</html>