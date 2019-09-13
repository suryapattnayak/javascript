//Create a class to print an integer and a character with two methods having the same name but different sequence of the integer and the character parameters.
//For example, if the parameters of the first method are of the form (int n, char c), then that of the second method will be of the form (char c, int n).

package assignment.java;

import java.util.Scanner;

public class parameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String c=sc.next();
		parameter p=new parameter();
		p.param(n, c);
		p.param(c, n);
		sc.close();
		
	}
	public void param(int n,String c)
	{
		System.out.println(n+" "+c);
	}
	public void param(String c,int n)
	{
		System.out.println(c+" "+n);
	}

}
