<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<body>
	<h1>Send An Omikuji!</h1>
	<form action="process" method="post">
		<div>
			<label for=""> Pick any number from 5 to 25:</label>
			<input type="number" name="number"/>
		</div>
		<div>
			<label for=""> Enter name of any city:</label>
			<input type="text" name="city"/>
		</div>
		<div>
			<label for=""> Enter name of any real person:</label>
			<input type="text" name="person"/>
		</div>
		<div>
			<label for=""> Enter professional endeavor or hobby:</label>
			<input type="text" name="profession"/>
		</div>
		<div>
			<label for=""> Enter any type of living thing:</label>
			<input type="text" name="living"/>
		</div>
		<div>
			<label for=""> Say something nice to someone:</label>
			<textarea rows="" cols="" name="message"></textarea>
		</div>
		<p>Send and show a friend </p>
		<input type="submit" value="Send"/>
	</form>
	
</body>
</html>