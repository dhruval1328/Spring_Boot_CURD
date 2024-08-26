<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- <h1><a href="logout">Logout</a></h1> -->
	<table border="2">
	
	<tr>
	<th>EID</th>
	<th>ENAME</th>
	<th>USERNAME</th>
	<th>PASSWORD</th>
	<th>DELETE</th>

	
	</tr>
	<c:forEach items="${data}" var="s">
	
	<tr>
	<td>${s.eid}</td>
	<td>${s.name}</td>
	<td>${s.username}</td>
	<td>${s.password}</td>
	<td><a href="delete?id=${s.eid}" >DELETE</a>||<a href="edit?id=${s.eid}" >UPDATE</a></td>
	
	
	</tr>
	</c:forEach>
	</table>
	<a href="paging?page=0">|1|</a><a href="paging?page=1">|2|</a><a href="paging?page=2">|3</a>
</body>
</html>