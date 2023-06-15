<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ include file="menu.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>All customers</h2>
<form action="getCustomerData" method="post"></form>
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
		
		<c:forEach items="${customer}" var="customer">
		<tr>
			<td>${customer.id}</td>
			<td><a href="customerInfo?id=${customer.id}">${customer.firstname} </a></td>
			<td>${customer.lastname}</td>
			<td>${customer.city}</td>
			<td>${customer.email}</td>
			<td>${customer.mobile}</td>
			<td>${customer.leadsource}</td>
			<td><a href="delete?id=${customer.id}">Delete</a></td>
			<td><a href="update?id=${customer.id}">Update</a></td>
		</tr>
		</c:forEach>
		</table>
</body>
</html>