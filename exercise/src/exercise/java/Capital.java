package exercise.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Capital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> proglag=new ArrayList<String>();
		proglag.add("python");
		proglag.add("java");
		proglag.add("c");
		proglag.add("c++");
		proglag.add("perl");
		List<String> result = proglag.stream().filter(s->s.startsWith("j")).map(String::toUpperCase).
                collect(Collectors.toList());
		System.out.println(result);
	}

}
