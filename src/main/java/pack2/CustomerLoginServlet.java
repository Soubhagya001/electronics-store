package pack2;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import pack2.CustomerBean;      
import pack2.CustomerLoginDAO;

@WebServlet("/CustomerLoginServlet")
public class CustomerLoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String uname = req.getParameter("uname");
        String pwd = req.getParameter("pwd");

        CustomerLoginDAO dao = new CustomerLoginDAO();
        CustomerBean cb = dao.checkLogin(uname, pwd);

        if (cb != null) {
            HttpSession session = req.getSession();
            session.setAttribute("cbean", cb);
            req.getRequestDispatcher("CustomerHome.jsp").forward(req, res);
        } else {
            req.setAttribute("msg", "Invalid credentials. Try again.");
            req.getRequestDispatcher("CustomerLogin.html").forward(req, res);
        }
    }
}
