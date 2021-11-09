package attr;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class a2
 */
/* @WebServlet("/a2") */
public class a2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		int nn1 = Integer.parseInt(request.getParameter("n1"));
		int nn2 = Integer.parseInt(request.getParameter("n2"));
		
		int p=nn1*nn2;
		
		//get attribute from request object
		
	   int sum=	(int) request.getAttribute("sum");
	   
	   PrintWriter out = response.getWriter();
	   
	   out.println("<h1>");
	   out.println("sum is = "+ sum);
	   out.println("product is = "+ p);
	   out.println("</h1>");
	}

}
