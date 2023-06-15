<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update</title>
</head>
<body>
<h2>Update all Customer Here...</h2>
	<form action="updateContactsData" method="post">
		<pre>
		Id<input type="text" name="id" value="${contact.id}" readonly />
		FirstName<input type="text" name="firstname"value="${contact.firstname}" />
		LastName<input type="text" name="lastname"value="${contact.lastname}" />
		City<input type="text" name="city" value="${contact.city}" />
		Email<input type="text" name="email" value="${contact.email}"readonly />
		Mobile<input type="text" name="mobile" value="${contact.mobile}" />

		<label for="leadsource">Choose a leadSource:</label>
         <select id="leadsource" name="leadsource">
         <option value="newsPaper">Newspaper</option>
         <option value="socialMedia">SocialMedia</option>
         <option value="friends">Friends</option>
         <option value="other">Other</option>
        </select>		
		<input type="submit" value="update" />
	</pre>
	</form>
</body>
</html>