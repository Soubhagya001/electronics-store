package pack2;

import java.sql.Connection;
import java.sql.PreparedStatement;

import pack1.DBConnect;

public class CustomerRegisterDAO {
    public int registerCustomer(CustomerBean cb) {
        int rowCount = 0;
        try {
            Connection con = DBConnect.getCon();
            PreparedStatement ps = con.prepareStatement("INSERT INTO customer VALUES (?, ?, ?, ?, ?, ?, ?)");
            ps.setString(1, cb.getUname());
            ps.setString(2, cb.getPwd());
            ps.setString(3, cb.getFname());
            ps.setString(4, cb.getLname());
            ps.setString(5, cb.getAddr());
            ps.setString(6, cb.getMid());
            ps.setString(7, cb.getPhno());
            rowCount = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rowCount;
    }
}
