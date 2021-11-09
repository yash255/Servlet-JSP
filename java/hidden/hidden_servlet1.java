package hidden;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class hidden_servlet1
 */
@WebServlet("/hidden_servlet1")
public class hidden_servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		out.println("<h1>Say my name, "+name+"</h1>");
		
		
		
		
		out.println(""
				+ "<form action='hidden_servlet2'>"
				+ "<input type='hidden' name='name' value='"+name+"'/>"
				+ "<button>Go to second servlet</button>"
				+ ""
				+ ""
				+ "</form>");
	}

}
