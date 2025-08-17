package pack2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import pack1.DBConnect;
import pack1.ProductBean;

public class ViewCustomerProductDAO {
    public ArrayList<ProductBean> getAllProducts() {
        ArrayList<ProductBean> list = new ArrayList<>();
        try {
            Connection con = DBConnect.getCon();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM product");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                ProductBean pb = new ProductBean();
                pb.setP_code(rs.getString("PCODE"));
                pb.setP_name(rs.getString("PNAME"));
                pb.setP_comp(rs.getString("PCOMPANY"));
                pb.setP_price(rs.getString("PPRICE"));
                pb.setP_qty(rs.getString("PQTY"));
                list.add(pb);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
