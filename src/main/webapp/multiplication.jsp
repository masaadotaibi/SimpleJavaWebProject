<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	
	<body>
		
		<%
			int num1 = (int) session.getAttribute("num1");
			int num2 = (int) session.getAttribute("num2");
			
			String result = num1 + " * " + num2 + " = " + (num1 * num2);
		%>
		
		<h1><%= result %></h1>
		
	</body>
</html>