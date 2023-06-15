<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
     <%@ include file="menu.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
<h2> All contacts</h2>
<form action="" method ="post">	
<table border='1'>
		<tr>
			<th>Id</th>
			<th>FirstName</th>
			<th>LastName</th>
			<th>City</th>
			<th>Mobile</th>
			<th>Email</th>
			<th>LeadSource</th>
			<th>Delete</th>
			<th>Update</th>
		</tr>
		
		<c:forEach items="${contact}" var="contact">
		<tr>
			<td>${contact.id}</td>
			<td><a href="contactInfo?id=${contact.id}">${contact.firstname} </a></td>
			<td>${contact.lastname}</td>
			<td>${contact.city}</td>
			<td>${contact.email}</td>
			<td>${contact.mobile}</td>
			<td>${contact.leadsource}</td>
			<td><a href="deleteContacts?id=${contact.id}">Delete</a></td>
			<td><a href="updateContacts?id=${contact.id}">Update</a></td>
		</tr>
		</c:forEach>
		</table>
</form>	
</body>
</html>