package Login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestVaid
 */
@WebServlet("/TestVaid")
public class TestVaid extends HttpServlet {
	private static final long serialVersionUID = 1L;

	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String un=request.getParameter("username");
		String pass=request.getParameter("pwd");
		PrintWriter out=response.getWriter();
		if(un.equals("surya")&& pass.equals("pass"))
		{
			out.println("welcome surya");
		}
		else
		{
			out.println("wrong credentials");
		}
	}

}
