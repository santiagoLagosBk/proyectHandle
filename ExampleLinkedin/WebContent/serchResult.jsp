<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import= "beans.User" %>
<%@page import="java.util.List" errorPage="error.jsp" isErrorPage="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

List<User> users=(ArrayList)request.getAttribute("usuarios");
Iterator<User> iterator=users.iterator();
while(iterator.hasNext()){
	
	User user=iterator.next();%>
	
	<table>
		<tr>
			<th>Nick Name</th>
			<th>First Name</th>
			<th>Last Name</th>
		</tr>
		<tr>
			<td><%= user.getUserName() %></td>
			<td><%=user.getFisrtName() %></td>
			<td><%=user.getLastName() %></td>
		</tr>
	</table>
<% 	
}


%>
</body>
</html>