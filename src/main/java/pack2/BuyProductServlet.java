package pack2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pack1.ProductBean;

@WebServlet("/BuyProductServlet")
public class BuyProductServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String pcode = req.getParameter("pcode");
        int reqqty = Integer.parseInt(req.getParameter("reqqty"));

        ProductBean pb = new BuyProductServletDAO().getProductByCode(pcode);

        if (pb != null && Integer.parseInt(pb.getP_qty()) >= reqqty) {
            req.setAttribute("product", pb);
            req.setAttribute("reqqty", reqqty);
            req.setAttribute("newqty", Integer.parseInt(pb.getP_qty()) - reqqty);
            req.setAttribute("charge", Integer.parseInt(pb.getP_price()) * reqqty);
            req.getRequestDispatcher("UpdateProductServlet").forward(req, res);
        } else {
            req.setAttribute("msg", "Invalid quantity or product not available.");
            req.getRequestDispatcher("ViewCustomerProductsServlet").forward(req, res);
        }
    }
}
