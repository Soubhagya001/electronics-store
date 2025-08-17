package pack2;

import java.sql.Connection;
import java.sql.PreparedStatement;

import pack1.DBConnect;

public class UpdateProductServletDAO {
    public int updateProductQty(String pcode, int newQty) {
        int rowCount = 0;
        try {
            Connection con = DBConnect.getCon();
            PreparedStatement ps = con.prepareStatement("UPDATE product SET pqty = ? WHERE pcode = ?");
            ps.setInt(1, newQty);
            ps.setString(2, pcode);
            rowCount = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rowCount;
    }
}
