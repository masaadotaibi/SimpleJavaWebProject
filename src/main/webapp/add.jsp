<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="UTF-8">
		<title>Addition</title>
	</head>
	
	<body>
		<%
		
			int num1 = (int) session.getAttribute("num1");
			int num2 = (int) session.getAttribute("num2");
			
			int sum = num1 + num2;
			
			session.setAttribute("sum", session);
			
			String operation = (String) session.getAttribute("operation");
			
			String result = num1 + " + " + num2 + " = " + sum;
			
			System.out.println("Operation in add is " + operation);
			
			if(operation.equals("addition")) { %>
				<h2> <%= result %></h2>
			<%
			}
			else {
				response.sendRedirect("sum_square.jsp?sum="+sum + "&num1="+num1 + "&num2="+num2);
			}
		%>
	</body>
	
</html>
