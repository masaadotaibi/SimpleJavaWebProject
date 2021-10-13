<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Square</title>
	</head>
	
	<body>
		<%
			int num1 = (int) session.getAttribute("num1");
			int num2 = (int) session.getAttribute("num1");
			
			int sum = Integer.parseInt(request.getParameter("sum"));
			
			int sumSqaured = sum * sum;
			
			String sumResult = num1 + " + " + num2 + " = " + sum;
			String result = "And the sum squared " + sum + "² = " +  sumSqaured;
		%>
		
		<h4><%= sumResult %></h4>
		<h1><%= result %></h1>
	</body>
</html>