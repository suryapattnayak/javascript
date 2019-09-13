//A boy has his money deposited $1000, $1500 and $2000 in banks-Bank A, Bank B and Bank C respectively. We have to print the money deposited by him in a particular bank. 
//Create a class 'Bank' with a method 'getBalance' which returns 0. Make its three subclasses named 'BankA', 'BankB' and 'BankC' with a method with the same name 'getBalance' which returns the amount deposited in that particular bank. Call the method 'getBalance' by the object of each of the three banks.

package assignment.java;

public class Bank {
	
	public int getBalance()
	{
		return 0;
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank b=new Bank();
		System.out.println(b.getBalance());
		BankA ba=new BankA();
		System.out.println(ba.getBalance());
		BankB bb=new BankB();
		System.out.println(bb.getBalance());
		BankC bc=new BankC();
		System.out.println(bc.getBalance());
		
		
	}

}
class BankA
{
	public int getBalance()
	{
		return 1000;
		
	}
}
class BankB
{
	public int getBalance()
	{
		return 1500;
		
	}
}
class BankC
{
	
	public int getBalance()
	{
		return 2000;
		
	}
}
