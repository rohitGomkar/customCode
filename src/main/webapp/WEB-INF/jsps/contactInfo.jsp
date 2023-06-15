<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Hello</h2>
	
      	ID        	:${contact.id}<br/>
		FirstName	:${contact.firstname}<br/>
		LastName  	:${contact.lastname}<br/>
	    City      	:${contact.city}<br/>
		Email     	:${contact.email}<br/>
		Mobile   	:${contact.mobile}<br/>
		LeadSource	:${contact.leadsource}<br/>		
     
     <form action="sendEmailTo" method="post">
     <input type ="hidden" name="email"value ="${contact.email}"> 
     <input type ="submit" value="sendEmail">
     </form>
</body>
</html>