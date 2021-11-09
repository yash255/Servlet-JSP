package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

public class RegisterServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<h1>welcome to register servlet</h1>");

		String name = request.getParameter("user_name");
		String password = request.getParameter("user_password");
		String email = request.getParameter("user_email");
		String gender = request.getParameter("user_gender");
		String course = request.getParameter("user_course");
		
		
		
		
		
		

		String condition = request.getParameter("condition");
		if (condition != null) {

			if (condition.equals("checked")) {
				out.println("<h2>Name: " + name + " </h2>");
				out.println("<h2>Password: " + password + " </h2>");
				out.println("<h2>Email: " + email + " </h2>");
				out.println("<h2>Gender: " + gender + " </h2>");
				out.println("<h2>Course: " + course + " </h2>");
				
				
				//Request Dispatcher
				//forword
				RequestDispatcher rd  =request.getRequestDispatcher("Success");
				rd.forward(request, response);
				
				

			} else {
				out.println("<h2>You have not accepted T&C <h2>");

			}
		} else {
			out.println("<h2>You have not accepted T&C <h2>");
			
			//include output of index.html
			
			//get the object of RequestDispatcher
			RequestDispatcher rd = request.getRequestDispatcher("NewFile.html");
			
			//include
			rd.include(request, response);

		}
	}

}
