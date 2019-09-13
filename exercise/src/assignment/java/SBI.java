package assignment.java;

abstract class RBI {
	public double minInterestRate=0;
	public double maxWithdrawalLimit=100000;
	public double minBalanceAllowed=0;
	Customer c=new Customer("surya", "82490377424", "suryapattnayak@gmail.com");
	Account a=new Account("Sc0007", "06sc069");
	public double GetInterestRate()
	{
		return minInterestRate;
	}
	public double GetWithdrawalLimit()
	{
		return maxWithdrawalLimit;
		
	}
}
 class SBI extends RBI{
	
	 SBI s=new SBI();
	///s.minInterestRate=4;
}