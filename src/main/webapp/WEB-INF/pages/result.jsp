<%@ page contentType="text/html; charset=ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="mvc"%>
<html>
<head>
<title>JavaSpringExamples Exception Handling</title>
</head>
<body>
	<h2>Search Country</h2>
	<table>
		<tr>
			<td>Country Name :</td>
			<td>${country.name}</td>
		</tr>
		<tr>
			<td>ISO Code :</td>
			<td>${country.isoCode}</td>
		</tr>
	</table>
</body>
</html>