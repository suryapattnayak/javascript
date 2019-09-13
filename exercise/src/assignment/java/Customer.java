package assignment.java;

public class Customer {
	
	private String name;
	private String mobileno;
	private String email;
	public Customer(String name, String mobileno, String email) {
		super();
		this.name = name;
		this.mobileno = mobileno;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
