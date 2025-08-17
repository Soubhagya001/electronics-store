package pack2;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import pack1.DBConnect;
import pack1.ProductBean;

public class BuyProductServletDAO {
    public ProductBean getProductByCode(String pcode) {
        ProductBean pb = null;
        try {
            Connection con = DBConnect.getCon();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM product WHERE pcode = ?");
            ps.setString(1, pcode);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                pb = new ProductBean();
                pb.setP_code(rs.getString("pcode"));
                pb.setP_name(rs.getString("pname"));
                pb.setP_comp(rs.getString("pcompany"));
                pb.setP_price(rs.getString("pprice"));
                pb.setP_qty(rs.getString("pqty"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pb;
    }
}
