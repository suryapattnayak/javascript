package test.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationController
 */
@WebServlet("/RegistrationController")
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		if(name.trim().length()==0)
		{
			response.sendRedirect("RegiStration.html?status=Name can not be empty");
			return;
		}
		if(email.trim().length()==0)
		{
			response.sendRedirect("RegiStration.html?status=email can not be empty");
			return;
		}
		response.sendRedirect("Login.html");
	}

}
