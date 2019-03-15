<%@ page contentType="text/html; charset=ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="mvc"%>
<html>
<head>
<title>JavaSpringExamples Exception Handling</title>
</head>
<body>

	<h2>Search Country</h2>
	<mvc:form modelAttribute="country" action="result.mvc">
		<table>
			<tr>
				<td><mvc:label path="name">Country Name</mvc:label></td>
				<td><mvc:input path="name" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Search" /></td>
			</tr>
		</table>
	</mvc:form>
</body>
</html>