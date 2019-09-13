package exercise.java;

import java.util.Arrays;
import java.util.List;

public class SUVExample {
	 public static void main(String args[])
	 {
		 List<Integer> list1=Arrays.asList(45,0,2,3);
		 printSuperclass(list1);
		 List<Number> list2=Arrays.asList(4.5,5,6,7);
		 printSuperclass(list2);
	 }
	 

	private static void printSuperclass(List<? super Integer> list) {
		// TODO Auto-generated method stub
		System.out.println(list);
	}

}
