package pack1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@SuppressWarnings("serial")
@WebServlet("/delete")
public class DeleteProductServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        HttpSession session = req.getSession(false);
        if (session == null) {
            req.getRequestDispatcher("AdminLogin.html").forward(req, res);
            return;
        }

        String pcode = req.getParameter("pcode");
        DeleteProductDAO dao = new DeleteProductDAO();
        int rowCount = dao.deleteProduct(pcode);

        if (rowCount > 0) {
            // Update session product list to reflect deletion
            ArrayList<ProductBean> list = (ArrayList<ProductBean>) session.getAttribute("productlist");
            if (list != null) {
                Iterator<ProductBean> it = list.iterator();
                while (it.hasNext()) {
                    ProductBean pb = it.next();
                    if (pb.getP_code().equals(pcode)) {
                        it.remove();
                        break;
                    }
                }
            }
            req.setAttribute("msg", "Product deleted successfully.");
        } else {
            req.setAttribute("msg", "Product could not be deleted.");
        }

        req.getRequestDispatcher("DeleteProduct.jsp").forward(req, res);

    }
}
