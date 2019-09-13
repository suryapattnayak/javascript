package Invoice;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculatorService
 */
@WebServlet("/CalculatorService")
public class CalculatorService extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static ArrayList<Product> al = new ArrayList<>();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String prname = request.getParameter("pname").toLowerCase();
		int qty = Integer.parseInt(request.getParameter("qty"));
		PrintWriter out = response.getWriter();
		RequestDispatcher rd = request.getRequestDispatcher("product.html");
		int price = 0;
		switch(prname) {
		case "soap":
			price = 50;
			break;
		case "shampoo":
			price = 120;
			break;
		case "toothbrush":
			price = 50;
			break;
		case "facewash":
			price= 50;
			break;
		default:
			out.println("Product is not available<br><br><br><br>");
			rd.include(request, response);
			return;
		}
		Product p = new Product(prname, qty, price);
		if(al.contains(p)) {
			int index = al.indexOf(p);
			p = al.get(index);
			p.setQuantity(p.getQuantity()+qty);
		}
		else
			al.add(p);
		response.sendRedirect("cart.html");
	}

}
