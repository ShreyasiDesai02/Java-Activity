<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action = "insertmovie" method = "post">

Movie Name: <input type = "text" name = "mname"><br> <br>
Language: <select name = "lang">
<option value = "English">English</option>
<option value = "Hindi">Hindi</option>
<option value = "Other">Other</option>
</select><br><br>

Director:<input type = "text" name = "director"><br><br>
<input type = "submit" value ="Insert Movie">

</form>
</body>
</html>