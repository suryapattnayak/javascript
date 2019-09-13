//Create a class 'Degree' having a method 'getDegree' that prints "I got a degree". It has two subclasses namely 'Undergraduate' and 'Postgraduate' each having a method with the same name that prints "I am an Undergraduate" and "I am a Postgraduate" respectively. Call the method by creating an object of each of the three classes.

package assignment.java;

public class Degree {
	
	public void getDegree()
	{
		System.out.println("i got a degreee");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Degree d=new Degree();
		d.getDegree();
		Undergraduate u=new Undergraduate();
		u.getDegree();
		Postgraduate p=new Postgraduate();
		p.getDegree();
	}
}
class Undergraduate 
{
	public void getDegree()
	{
		System.out.println("i am an undergraduate");
	}
}
class Postgraduate
{
	public void getDegree()
	{
		System.out.println("i am an postgraduate");
	}
}
	


