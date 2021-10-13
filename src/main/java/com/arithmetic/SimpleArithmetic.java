package com.arithmetic;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SimpleArithmetic
 */
@WebServlet("/arithmetic")
public class SimpleArithmetic extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SimpleArithmetic() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String operation = request.getParameter("operations");
		
		System.out.println("The operations is: " + operation);
		
		HttpSession session = request.getSession();
		
		session.setAttribute("num1", Integer.parseInt(request.getParameter("num1")));
		
		session.setAttribute("num2", Integer.parseInt(request.getParameter("num2")));
		
		session.setAttribute("operation", operation);
		
		switch (operation) {
			case "addition":
				response.sendRedirect("add.jsp");
				break;
			case "subtraction":
				response.sendRedirect("subtract.jsp");
				break;
			case "multiplication":
				response.sendRedirect("multiplication.jsp");
				break;
			case "division":
				response.sendRedirect("division.jsp");
				break;
			case "square":
				response.sendRedirect("add.jsp");
				break;
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
