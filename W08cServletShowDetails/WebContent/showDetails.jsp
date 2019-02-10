<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Στοιχεία φυλλομετρητή</title>
</head>
<body>
<table border="1">
	<tr>
		<th>Επικεφαλίδα</th>
		<th>Τιμή</th>
	</tr>
	<tr>
		<td>Φυλλομετρητής</td>
		<td><%=request.getAttribute("client.browser")%></td>
	</tr>
	<tr>
		<td>Όνομα εξυπηρετητή</td>
		<td><%=request.getServerName()%></td>
	</tr>
	<tr>
		<td>Τοποθεσία</td>
		<td><%=request.getLocale()%></td>
	</tr>
</table>
</body>
</html>

<!-- http://localhost:8080/W08ThirdServlet/SnoopServlet -->