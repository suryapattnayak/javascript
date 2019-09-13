package exercise.java;

import java.util.TreeSet;

public class TreeSetdescendingOrderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Integer> t=new TreeSet<>();
		t.add(5);
		t.add(6);
		t.add(7);
		System.out.println(t.headSet(7));   
	}

}
