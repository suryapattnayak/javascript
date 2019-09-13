package exercise.java;

import java.util.Stack;

public class stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> st=new Stack<>();
		st.add("surya");
		st.add("ravi");
		st.add("abhi");
		st.add("babu");
		
		System.out.println(st);
		System.out.println(st.peek());
		System.out.println(st);
		System.out.println(st.pop());
		System.out.println(st);
		st.push("naresh");
		System.out.println(st);
	}

}
