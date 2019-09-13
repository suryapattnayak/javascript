package Test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AgeValidate
 */
@WebServlet("/AgeValidate")
public class AgeValidate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		int age=Integer.parseInt(request.getParameter("age"));
		PrintWriter out=response.getWriter();
		RequestDispatcher rd=request.getRequestDispatcher("/display.jsp");
		if(age==18 || age>18)
		{
			rd.forward(request, response);
			
		}
		else
		{
			out.println("pls enter a valid age");
			response.sendRedirect("Home.jsp");
		}
	}

}
