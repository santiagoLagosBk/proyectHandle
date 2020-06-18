<%@page import="java.util.Calendar"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<header>

<%= getDate() %>
</header>
<main>
<form action="loginUsers" method="post">
<label>User</label>
<input type="text" name="userName">
<input type="password" name="userPass">
<input type="submit" value="submit">

</form>


</main>
<footer></footer>
<%!

public String getDate(){
    SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-dd-mm hh:mm");
    Date date= Calendar.getInstance().getTime();

    return dateFormat.format(date);
}


%>

</body>
</html>