<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form>
<input type = "hidden" name = "mid" value= "${movie.movieid }"><br><br>
Movie Name: <input type = "text" name= "mname" value = "${movie.moviename }"><br><br>
Director: <input type = "text" name ="director" value = "${movie.director }"><br><br>
Language: <input type = "text" name= "language" value = "${movie.language }">
<input type = "submit" name = "submit">
</form>
</body>
</html>