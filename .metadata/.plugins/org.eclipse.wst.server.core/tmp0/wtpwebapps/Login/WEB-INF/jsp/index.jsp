<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome ${username }</h1>
	<table>
		<tr>
			<th>Student ID</th>
			<th>Student Name</th>
			<th>Address</th>
		</tr>
		<c:forEach var="student" items="${list }">
			<tr>
				<td>${student.id }</td>
				<td>${student.name }</td>
				<td>${student.address }</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="3">Total: ${list.size() } student(s)</td>
		</tr>
	</table>
</body>
</html>