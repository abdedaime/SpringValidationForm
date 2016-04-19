<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
</head>
<body>

<form:form modelAttribute="userForm" action="register">
	<table>
		<tr>
			<td>Nom</td>
			<td><form:input path="nom" /></td>
			<td><form:errors path="nom" /></td>

		</tr>
		<tr>
			<td>Prenom</td>
			<td><form:input path="prenom" /></td>
			<td><form:errors path="prenom" /></td>

		</tr>
		<tr>
			<td>Email</td>
			<td><form:input path="email" /></td>
			<td><form:errors path="email" /></td>

		</tr>


	</table>
	<input type="submit"  value="ADD">
</form:form>

</body>
</html>