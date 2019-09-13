package exercise.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CreateHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numberdivisibleby5=new ArrayList<Integer>();
		numberdivisibleby5.add(5);
		numberdivisibleby5.add(10);
		numberdivisibleby5.add(15);
		numberdivisibleby5.add(20);
		
		List<Integer> numberdivisibleby3=new ArrayList<>();
		numberdivisibleby3.add(3);
		numberdivisibleby3.add(6);
		numberdivisibleby3.add(9);
		numberdivisibleby3.add(12);
		
		Set<Integer> numbersdivisbleby5or3=new HashSet<>(numberdivisibleby5);
		numbersdivisbleby5or3.addAll(numberdivisibleby3);
		
		System.out.println(numbersdivisbleby5or3);
		
	}

}
