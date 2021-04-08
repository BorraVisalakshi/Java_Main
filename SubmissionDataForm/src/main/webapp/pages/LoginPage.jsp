<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Page</title>
</head>
<body>
	<form method="post" action="details">
		<table>
			<tr>
				<td>Enter SID</td>
				<td>:</td>
				<td><input type="text" name="SID" placeholder="Enter SID"></td>
			</tr>
			<tr>
				<td>Enter name</td>
				<td>:</td>
				<td><input type="text" name="name" placeholder="Enter name"></td>
			</tr>
			<tr>
				<td>Select Application</td>
				<td>:</td>
				<td><select name="app">
						<option value="MDM">MDM</option>
						<option value="PDS">PDS</option>
						<option value="Jenkins">Jenkins</option>
				</select></td>
			</tr>
			<tr>
				<td>Enter Task</td>
				<td>:</td>
				<td><textarea name="task"></textarea></td>
			</tr>
			<tr>
				<td></td>
				<td></td>
				<td><input type="submit" value="submit"></td>
			</tr>
		</table>

	</form>
</body>
</html>