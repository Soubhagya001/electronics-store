package pack2;


import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import pack1.ProductBean;

@SuppressWarnings("serial")
@WebServlet("/ViewCustomerProductsServlet")
	public class ViewCustomerProductsServlet extends HttpServlet {
	    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	        HttpSession session = req.getSession(false);
	        if (session == null) {
	            res.sendRedirect("CustomerLogin.html");
	            return;
	        }
	        ArrayList<ProductBean> list = new ViewCustomerProductDAO().getAllProducts();
	        session.setAttribute("productlist", list);
	        req.getRequestDispatcher("ViewProduct.jsp").forward(req, res);
	    }
}


