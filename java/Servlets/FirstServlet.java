package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServlet implements Servlet {
	
	ServletConfig conf;

	//Life cycle method
	
	public void init(ServletConfig conf) {
		this.conf=conf;
		System.out.println("creating object");
	}
	public void service(ServletRequest req,ServletResponse resp) throws IOException {
		System.out.println("service");
		//set content type of response
		resp.setContentType("text/html");	
		PrintWriter out = resp.getWriter();
		out.println("<h1>hello</h1>");
		out.println("<h1>This is my output from Servlet"+new Date().toString() +"</h1>");
	}
	public void destroy() {
		System.out.println("going to destroy servlet object");
	}
	
	//non-life cycle method
	
	public ServletConfig getServletConfig() {
		return this.conf;
	}
	
	public String getServletInfo() {
		return "this servlet is created by Yash";
	}

}



