<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Enter a person details to insert into the DB: <br><br>
	<form action="/insertPerson">
		ID:	 <input type="text" name="id"><br>
		NAME:<input type="text" name="name"><br>
		AGE: <input type="text" name="age"><br>
		<input type="submit" name="SUBMIT"><br>
	</form>
	<br><br><br>
		Enter a person ID to fetch the details: <br><br>
	<form action="/getPerson">
		ID:	 <input type="text" name="id"><br>
		<input type="submit" name="SUBMIT"><br>
	</form>
	<br><br><br>
		Enter the new person details that you want to change to: <br><br>
	<form action="/putPerson">
		ID:	 <input type="text" name="id"><br>
		NAME:<input type="text" name="name"><br>
		AGE: <input type="text" name="age"><br>
		<input type="submit" name="SUBMIT"><br>
	</form>
	<br><br><br>
		Enter a person ID that you want to delete from the DB: <br><br>
	<form action="/deletePerson">
		ID:	 <input type="text" name="id"><br>
		<input type="submit" name="SUBMIT"><br>
	</form>
</body>
</html>