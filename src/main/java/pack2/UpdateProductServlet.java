package pack2;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import pack1.ProductBean;

@WebServlet("/UpdateProductServlet")
public class UpdateProductServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        ProductBean pb = (ProductBean) req.getAttribute("product");
        int reqqty = (int) req.getAttribute("reqqty");
        int charge = (int) req.getAttribute("charge");
        int newqty = (int) req.getAttribute("newqty");

        UpdateProductServletDAO dao = new UpdateProductServletDAO();
        int updated = dao.updateProductQty(pb.getP_code(), newqty);

        if (updated > 0) {
            req.setAttribute("msg", "Order placed successfully!");
            req.setAttribute("charge", charge);
            req.getRequestDispatcher("OrderConfirmed.jsp").forward(req, res);
        } else {
            req.setAttribute("msg", "Order failed. Try again.");
            req.getRequestDispatcher("ViewCustomerProductsServlet").forward(req, res);
        }
    }
}
