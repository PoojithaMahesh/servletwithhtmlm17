<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%String message=(String)request.getAttribute("message"); %>
<%if(message!=null){%>
<%=message %>
<%}else{%>

<%="Welcome to LOGIN Page please Login" %>

<%} %>




<form action="login">
Email::<input type="text" name="email">

Password::<input type="text" name="password">
<input type="submit" value="LOGIN">


</form>




</body>
</html>