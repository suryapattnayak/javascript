package Lambda;

import java.util.function.Function;

public class Functionalambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Function<String,Integer>len=(str)->str.length();
		String str="hello lambda";
		System.out.println("length of the string is::"+len.apply(str));
		//Function<String, Integer> pars
		Function<Integer, Integer> absint=Math :: abs;
	}

}
