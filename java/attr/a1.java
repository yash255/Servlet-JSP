package attr;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class a1
 */
/* @WebServlet("/a1") */
public class a1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
PrintWriter out = response.getWriter();
		
		String n1 = request.getParameter("n1");
		String n2 = request.getParameter("n2");
		
		int nn1 = Integer.parseInt(n1);
		int nn2 = Integer.parseInt(n2);
		
		//add
		
		int s = nn1+nn2;
		
		//attribute
		request.setAttribute("sum", s);
		
		//request   request dispatcher
		RequestDispatcher rd = request.getRequestDispatcher("a2");
		rd.forward(request, response);
	}

}
