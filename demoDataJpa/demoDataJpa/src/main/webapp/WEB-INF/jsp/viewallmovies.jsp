<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
      
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href = "viewmoviebyLang?Lang=English">English</a>
<a href = "viewmoviebyLang?Lang=Hindi">Hindi</a>
<a href = "viewmoviebyLang?Lang=Other">Others</a>
<h2>View All Movies</h2>
<p>${movies}</p>

<table>
<tr>
<th>Movie-Name</th>
<th>Director</th>
<th>Language</th>
</tr>

<c:forEach items= "${movies}" var="m">
<tr>
<td>${m.moviename }</td>
<td>${m.director }</td>
<td>${m.language }</td>
<td><a href= "editMovie?id = ${m.movieid }">Edit</a></td>
<td><a href= "deleteMovie?id = ${m.movieid }">Delete</a></td>
</tr>
</c:forEach>
</table>

</body>
</html>