package exercise.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length!=2)
		{
			System.out.println("usag:java testregex string regexp");
			System.exit(0);
		}
		
		System.out.println("input:\""+args[0]+"\"");
		System.out.println("regular expression:\""+args[1]+"\"");
		Pattern p=Pattern.compile(args[1]);
		Matcher m=p.matcher(args[0]);
		while(m.find())
		{
			System.out.println("match\""+m.group()+"\"at position"+m.start()+"-"+(m.end()-1));
		}

	}

}
