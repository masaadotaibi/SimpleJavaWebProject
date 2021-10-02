package com.arithmetic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SimpleDivision
 */
@WebServlet("/division")
public class SimpleDivision extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SimpleDivision() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		double num1 = Integer.parseInt(request.getParameter("num1"));
		double num2 = Integer.parseInt(request.getParameter("num2"));
		
		PrintWriter out = response.getWriter();
		
		if(num2 == 0) {
			
			RequestDispatcher rd = request.getRequestDispatcher("arithmetic-calc.html");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			rd.include(request, response);
			out.println("<span style='color:red'> Division by 0 !!"
					+ "<br>You wanted to calculate " + (int)num1 + "/" + (int)num2
					+ "<br>Actually it is too hard for us to caclulate a divison by zero :) </span>");
		}
		else {
			double divResult = num1 / num2;
			
			out.println((int)num1 + "/" + (int)num2 + " = " + divResult);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
