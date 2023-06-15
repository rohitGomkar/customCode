<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
<h2>Hello</h2>
	
      	ID        	:${customer.id}<br/>
		FirstName	:${customer.firstname}<br/>
		LastName  	:${customer.lastname}<br/>
	    City      	:${customer.city}<br/>
		Email     	:${customer.email}<br/>
		Mobile   	:${customer.mobile}<br/>
		LeadSource	:${customer.leadsource}<br/>		
     
     <form action="sendEmail" method="post">
     <input type ="hidden" name="email"value ="${customer.email}"> 
     <input type ="submit" value="sendEmail">
     </form>
     
     
     <form action="contact" method ="post">
     
     <input type="hidden" name ="id" value=${customer.id}>
     <input type="hidden" name ="firstname" value="${customer.firstname}">
     <input type="hidden" name ="lastname" value="${customer.lastname}">
     <input type="hidden" name ="city" value="${customer.city}">
     <input type="hidden" name ="email" value="${customer.email}">
     <input type="hidden" name ="mobile" value="${customer.mobile}">
      <input type="hidden" name ="leadsource" value="${customer.leadsource}">
     
     <input type ="submit" value="convert to sales">
     </form>
</body>
</html>