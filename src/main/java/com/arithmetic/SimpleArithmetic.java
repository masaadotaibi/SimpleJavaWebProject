package com.arithmetic;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		
		RequestDispatcher rd = null;
		
		switch (operation) {
			case "addition":
				rd = request.getRequestDispatcher("add");
				break;
			case "subtraction":
				rd = request.getRequestDispatcher("subtraction");
				break;
			case "multiplication":
				rd = request.getRequestDispatcher("multiplication");
				break;
			case "division":
				rd = request.getRequestDispatcher("division");
				break;
			case "square":
				rd = request.getRequestDispatcher("add");
				break;
		}
		
		rd.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
