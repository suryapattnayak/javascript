//Create a class named 'PrintNumber' to print various numbers of different datatypes by creating different methods with the same name 'printn' having a parameter for each datatype.

package assignment.java;

import java.util.Scanner;

public class PrintNumber {

	public int print(int n)
	{
		System.out.println("your entered is of integer type");
		return n;
		
	}
	public double print(double n)
	{
		System.out.println("your entered type is of double type");
		return n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		PrintNumber p=new PrintNumber();
		System.out.println("enter a number");
		p.print(sc.nextDouble());
		sc.close();
	}

}
