package exercise.java;

import java.util.Scanner;

class CustomException  extends Exception{
         
			public CustomException(String msg) {
				// TODO Auto-generated constructor stub
				super(msg);
			}
 }
class A
{
	public void getConnection(String ipad) throws CustomException
	{
		String ip="192.168.2.2";
		if(!ipad.equals(ip))
			throw new CustomException("ip is not found");
	}
}
public class MyException
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		A a=new A();
		String s=sc.next();
		try {
			
			a.getConnection(s);
			System.out.println(s);
		} catch (CustomException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
