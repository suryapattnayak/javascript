package assignment.java;

public class Account {

	private String accountno;
	private String ifsccode;
	public Account(String accountno, String ifsccode) {
		super();
		this.accountno = accountno;
		this.ifsccode = ifsccode;
	}
	public String getAccountno() {
		return accountno;
	}
	public void setAccountno(String accountno) {
		this.accountno = accountno;
	}

	public String getIfsccode() {
		return ifsccode;
	}
	public void setIfsccode(String ifsccode) {
		this.ifsccode = ifsccode;
	}
	
	
}
