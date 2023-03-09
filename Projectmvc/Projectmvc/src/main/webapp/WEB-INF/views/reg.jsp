<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<form action="checkuser">
User name:<input type = "text" name = "uname"><br><br>
<input type = "submit" value = "send"><br><br>
</form>

<h1>Post Method</h1>
<form action="finduser" method = "post">
User name:<input type = "text" name = "uname"><br><br>
<input type = "submit" value = "send"><br><br>
</form>
</body>
</html>