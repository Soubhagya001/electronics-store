package pack1;

import java.io.Serializable;

@SuppressWarnings("serial")
public class AdminBean implements Serializable {

	String a_name,a_pwd,a_fname,a_lname,a_addr,a_mail,a_pnno;

	public String getA_name() {
		return a_name;
	}

	public void setA_name(String a_name) {
		this.a_name = a_name;
	}

	public String getA_pwd() {
		return a_pwd;
	}

	public void setA_pwd(String a_pwd) {
		this.a_pwd = a_pwd;
	}

	public String getA_fname() {
		return a_fname;
	}

	public void setA_fname(String a_fname) {
		this.a_fname = a_fname;
	}

	public String getA_lname() {
		return a_lname;
	}

	public void setA_lname(String a_lname) {
		this.a_lname = a_lname;
	}

	public String getA_addr() {
		return a_addr;
	}

	public void setA_addr(String a_addr) {
		this.a_addr = a_addr;
	}

	public String getA_mail() {
		return a_mail;
	}

	public void setA_mail(String a_mail) {
		this.a_mail = a_mail;
	}

	public String getA_pnno() {
		return a_pnno;
	}

	public void setA_pnno(String a_pnno) {
		this.a_pnno = a_pnno;
	}
	
	public AdminBean() {}
}
