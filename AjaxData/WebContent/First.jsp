<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% out.println("hello! 5's table is as below"); %>
<%

	int i,var=5;
for(i=0;i<=10;i++)
{
	out.println(var*i);
}

%>
</body>
</html>