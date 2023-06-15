<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Email Composer</title>
</head>
<body>
<form action="sendTo" method="post">
		<pre>
		To<input type="text" name="sendTo" value="${email}">
		Subject<input type="text" name="subject">
		EmailBody<textarea name="emailBody" rows="10" cols="50"></textarea>
        <input type="Submit" value="send">
        </pre>
	</form>
</body>
</html>