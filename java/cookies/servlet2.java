package cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servlet2
 */
@WebServlet("/servlet2")
public class servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		//getting all the cookies
	Cookie[] cookies =	request.getCookies();
	
	boolean f = false;
	String name = "";
	
	if(cookies ==null) {
		out.println("<h1>You are new user</h1>");
		return;
	}
	else {
		for(Cookie c:cookies) {
		String tname = 	c.getName();
		if (tname.equals("user_name")) {
			f=true;
			name = c.getValue();
			
		} 
		}
	}
		
	if (f) {
		
		
		
		
//		String name = request.getParameter("name");
		
		out.println("<h1>Hello," +name+"</h1>");
		out.println("<h1>thank you</h1>");
	}
	else {
		out.println("<h1>You are new user</h1>");
	}
	
	}

}
