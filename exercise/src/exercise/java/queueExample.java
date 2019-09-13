package exercise.java;

import java.util.LinkedList;
import java.util.Queue;

public class queueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> watingquee=new LinkedList<>();
		watingquee.add("surya");
		watingquee.add("ravi");
		watingquee.add("abhiral");
		watingquee.add("abhisek");
		System.out.println(watingquee);
		watingquee.remove();
		System.out.println(watingquee);
		watingquee.poll();
		System.out.println(watingquee);
	}

}
