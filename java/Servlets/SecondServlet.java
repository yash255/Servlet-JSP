package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SecondServlet extends GenericServlet {
	
	@Override
	public void service(ServletRequest req,ServletResponse resp) throws IOException {
		System.out.println("servlet using  genric servlet");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<h1>This is my second servlet using generic servlet");
	}
}
