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
			double num1 = (int) session.getAttribute("num1");
			double num2 = (int) session.getAttribute("num2");
			
			if(num2 == 0) {
				String err = "We cannot divide by 0";
				
				response.sendRedirect("arithmetic-calc.html");
			}
			else {
				
				double result = num1 / num2; %>
				
				<h1><%= (int) num1 %>  / <%= (int) num2 %> = <%= result %></h1>
			
		<%	
			}
		%>
	</body>
</html>