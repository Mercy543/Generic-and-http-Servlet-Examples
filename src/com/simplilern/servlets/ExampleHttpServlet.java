package com.simplilern.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ExampeServlet
 */

public class ExampleHttpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExampleHttpServlet() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//media type
				response.setContentType("text/html");
				
				//generate response
				PrintWriter outRes = response.getWriter();
				
				outRes.print("<html>");
				outRes.print("<body>");
				outRes.print("<h1>WELCOME TO HTTP SERVLET </h1>");
				outRes.print("<h2>hello Http Servlet Example</h2>");
				outRes.print("<p>Not a Protocol resticted Request</p>");
				outRes.print("<p>I have Successfuly Run the Servlet Example....Yay....</p>");
				outRes.print("</body>");
				outRes.print("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
