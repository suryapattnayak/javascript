package exercise.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInputInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		List<Integer> user=new ArrayList<Integer>();
		for(int i=0;i<5;i++)
		{
			user.add(sc.nextInt());
		}
		System.out.println(user);
		sc.close();
		System.out.println(user.size());
	}

}
