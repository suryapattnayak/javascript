package exercise.java;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> numbermaping=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			numbermaping.put(sc.nextInt(), sc.next());
		}
		
		System.out.println(numbermaping);
		System.out.println(numbermaping);
		sc.close();

	}
	

}

