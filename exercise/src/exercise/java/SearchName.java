package exercise.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class SearchName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		List<String> str=new ArrayList<String>();
		for(int i=0;i<5;i++)
		{
			str.add(sc.next());
		}
		System.out.println("enter name you want to find");
		String s=sc.next();
		System.out.println(str.indexOf(s));
		sc.close();
		//System.out.println(str.hashCode());
		HashSet<Integer> nas=new HashSet<>();
		System.out.println(nas.getClass());
	}

}
