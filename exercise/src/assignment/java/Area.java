/*Create a class to print the area of a square and a rectangle. The class has two methods with the same name but different number of parameters. The method for printing area of rectangle has two parameters which are length and breadth respetively while the other method for printing area of square has one parameter which is side of square.*/

package assignment.java;

import java.util.Scanner;

public class Area {
	
	public double rectangle(double a,double b) {
		return a*b;
		
	}
	public double square(double c)
	{
		return c*c;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Area a=new Area();
		System.out.println("enter lengtgh and breth of rectangle");
		System.out.println("area of rectangle is::"+a.rectangle(sc.nextDouble(), sc.nextDouble()));
		System.out.println("enter side of the square");
		System.out.println("area of square is::"+a.square(sc.nextDouble()));
		sc.close();
	}

}
