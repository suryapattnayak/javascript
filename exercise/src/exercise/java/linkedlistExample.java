package exercise.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class linkedlistExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> friends=new LinkedList<>();
		friends.add(""
				+ "");
		friends.add("BLACKWIDOW");
		friends.add("THOR");
		System.out.println(friends);
		friends.add(1, "naresh");
		System.out.println(friends);
		friends.addFirst("ironman");
		System.out.println(friends);
		friends.addLast("captain amerika");
		System.out.println(friends);
		List<String> newfriends=new ArrayList<>();
		newfriends.add("deadpool");
		newfriends.add("hulk");
		friends.addAll(newfriends);
		System.out.println(friends);
		friends.remove(2);
		System.out.println(friends);
	}

}
