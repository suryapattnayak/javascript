package exercise.java;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;
class Name
{
	private String name;
	private int age;
	public Name(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String toString()
	{
		return age+" " +name;
		
	}
	
	
}

public class TreeSetExample implements Comparator<Name> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Name> l=new ArrayList<>();
		l.add(new Name("surya", 24));
		l.add(new Name("surya", 25));
		l.add(new Name("vinay", 23));
		Collections.sort(l, new TreeSetExample());
		System.out.println(l);
		}

	

	@Override
	public int compare(Name o1, Name o2) {
		// TODO Auto-generated method stub
		if(o1.getName().compareTo(o2.getName())<0)
			return -1;
		else if(o1.getName().compareTo(o2.getName())>0)
			return +1;
		else
		{
			if(o1.getAge()>o2.getAge())
				return 1;
			else if(o1.getAge()<o2.getAge())
				return -1;
			else
				return 0;
		}
	}

}
