package pack1;

import java.io.Serializable;

public class ProductBean implements Serializable {

	private String p_code,p_name,p_comp,p_price,p_qnty;

	public String getP_code() {
		return p_code;
	}

	public void setP_code(String p_code) {
		this.p_code = p_code;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public String getP_comp() {
		return p_comp;
	}

	public void setP_comp(String p_comp) {
		this.p_comp = p_comp;
	}

	public String getP_price() {
		return p_price;
	}

	public void setP_price(String p_price) {
		this.p_price = p_price;
	}

	public String getP_qty() {
		return p_qnty;
	}

	public void setP_qty(String p_qty) {
		this.p_qnty = p_qty;
	}
	
	public ProductBean() {};
}
