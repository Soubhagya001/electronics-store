package pack2;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import pack1.DBConnect;

public class CustomerLoginDAO {
    public CustomerBean checkLogin(String uname, String pwd) {
        CustomerBean cb = null;
        try {
            Connection con = DBConnect.getCon();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM customer WHERE uname = ? AND pword = ?");
            ps.setString(1, uname);
            ps.setString(2, pwd);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                cb = new CustomerBean();
                cb.setUname(rs.getString("uname"));
                cb.setPwd(rs.getString("pword"));
                cb.setFname(rs.getString("fname"));
                cb.setLname(rs.getString("lname"));
                cb.setAddr(rs.getString("addr"));
                cb.setMid(rs.getString("mid"));
                cb.setPhno(rs.getString("phno"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cb;
    }
}
