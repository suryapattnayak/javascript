package exercise.java;

import java.util.ArrayList;
import java.util.Vector;

public class vector1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<Object> v1=new Vector<>();
		v1.add(1);
		v1.add(2);
		v1.add(3);
		v1.add("surya");
		System.out.println(v1);
		System.out.println(v1.size());
		v1.remove(2);
		System.out.println(v1.size());
		ArrayList<Object> l1=new ArrayList<>();
		System.out.println(l1.size());
		l1.add(22);
		l1.add(22);
		l1.add(22);
		l1.add(22);
		System.out.println(l1.size());
	}

}
