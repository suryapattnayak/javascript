package exercise.java;

import java.util.Scanner;

public class ThrowThrowsExample {
	
	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		try {
			if(b==0)
				throw new Exception("enter a valid value");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(a/b);
		}
		System.out.println(a/b);
		
	}

}
