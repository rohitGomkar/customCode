<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ include file="menu.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Save</title>
</head>
<body>
      <h2>Save details here</h2>
      <form action="saveCustomerData" method="post">
       <pre>
        FirstName<input type="text" name="firstname">
        LastName<input type="text" name="lastname">
        City<input type="text" name="city">
         Email<input type="text" name="email">
         Mobile<input type="text" name="mobile">
         
        <label for="leadsource">Choose a leadSource:</label>
         <select id="leadsource" name="leadsource">
         <option value="newsPaper">Newspaper</option>
         <option value="socialMedia">SocialMedia</option>
         <option value="friends">Friends</option>
         <option value="other">Other</option>
        </select>
        <input type="submit" value="Save">
           </pre>
         </form>
       ${msg}
</body>
</html>