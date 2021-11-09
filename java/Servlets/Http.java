package Servlets;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;


public class Http extends HttpServlet {
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
		System.out.println("this is get method");
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<h1>this is get method of Http servlet</h1>");
	}

}
