//A class has an integer data member 'i' and a method named 'printNum' to print thevalue of 'i'. Its subclass also has an integer data member 'j' and a method named 'printNum' to print the value of 'j'. Make an object of the subclass and use it to assign a value to 'i' and to 'j'. Now call the method 'printNum' by this object.

package assignment.java;

class parent {

	int i;
	public void printNum()
	{
		System.out.println(i);
	}
	
}
class child extends parent
{
	int j;
	public void printNum()
	{
		super.printNum();
		System.out.println(j);
	}
}
public class test
{
	public static void main(String args[])
	{
		child c=new child();
		c.i=10;
		c.j=20;
		c.printNum();
		
	}
}