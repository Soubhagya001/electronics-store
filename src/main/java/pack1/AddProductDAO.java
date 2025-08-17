package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AddProductDAO {

	public int insertProductDetails(ProductBean pb) throws Exception {
		int rowCount=0;
		try {
			Connection con=DBConnect.getCon();
			PreparedStatement pstmt=con.prepareStatement("insert into product values(?,?,?,?,?)");
			pstmt.setString(1,pb.getP_code());
			pstmt.setString(2,pb.getP_name());
			pstmt.setString(3,pb.getP_comp());
			pstmt.setString(4,pb.getP_price());
			pstmt.setString(5,pb.getP_qty());
			rowCount=pstmt.executeUpdate();
		}
		catch(Exception e) {
//			e.printStackTrace();
			throw e;
		}
		return rowCount;
	}
}
