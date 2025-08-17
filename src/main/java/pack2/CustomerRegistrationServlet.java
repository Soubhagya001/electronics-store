package pack2;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@SuppressWarnings("serial")
@WebServlet("/CustomerRegistrationServlet")
public class CustomerRegistrationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        CustomerBean cb = new CustomerBean();
        cb.setUname(req.getParameter("uname"));
        cb.setPwd(req.getParameter("pwd"));
        cb.setFname(req.getParameter("fname"));
        cb.setLname(req.getParameter("lname"));
        cb.setAddr(req.getParameter("addr"));
        cb.setMid(req.getParameter("mid"));
        cb.setPhno(req.getParameter("phno"));

        CustomerRegisterDAO dao = new CustomerRegisterDAO();
        int rowCount = dao.registerCustomer(cb);

        if (rowCount > 0) {
            req.setAttribute("msg", "Registration successful! Please login.");
            req.getRequestDispatcher("CustomerLogin.html").forward(req, res);
        } else {
            req.setAttribute("msg", "Registration failed. Please try again.");
            req.getRequestDispatcher("CustomerRegister.html").forward(req, res);
        }
    }
}
