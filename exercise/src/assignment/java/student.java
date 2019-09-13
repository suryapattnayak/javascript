//Create a class 'Student' with three data members which are name, age and address. The constructor of the class assigns default values name as "unknown", age as '0' and address as "not available". It has two members with the same name 'setInfo'. First method has two parameters for name and age and assigns the same whereas the second method takes has three parameters which are assigned to name, age and address respectively. Print the name, age and address of 10 students.

package assignment.java;

import java.util.Scanner;

public class student {

	String name;
	int age;
	String address;
	
	
	public student(String name, int age, String address) {
		super();
		this.name = "unknown";
		this.age = 0;
		this.address ="not available";
	}

	public void setInfo(String name,int age)
	{
		this.age=0;
		this.name="unknown";
	}
	public void setInfo(String name,int age,String address) {
		
		this.address=address;
		System.out.println(address);
		this.age=age;
		System.out.println(age);
		this.name=name;
		System.out.println(name);
	}
	public String toString()
	{
		return name+" "+age+" "+address;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		student[] arr=new student[10];
		for(int i=0;i<10;i++)
		{
			System.out.println("Enter your name");
			String name=sc.next();
			System.out.println("enter your age");
			int age=sc.nextInt();
			System.out.println("enter your address");
			String address=sc.next();
			arr[i]=new student(name, age, address);
		}
		for(int i=0;i<10;i++)
		{
			System.out.println(arr[i]);
		}
		sc.close();
	}

	
}
