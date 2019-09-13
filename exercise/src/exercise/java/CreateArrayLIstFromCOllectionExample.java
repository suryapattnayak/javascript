package exercise.java;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayLIstFromCOllectionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> firstfiveprimenumbers=new ArrayList<>();
		firstfiveprimenumbers.add(2);
		firstfiveprimenumbers.add(3);
		firstfiveprimenumbers.add(5);
		firstfiveprimenumbers.add(7);
		firstfiveprimenumbers.add(11);
		List<Integer> firsttenprimenumbers=new ArrayList<>(firstfiveprimenumbers);
		List<Integer> nextfiveprimenumbrs=new ArrayList<>();
		nextfiveprimenumbrs.add(13);
		nextfiveprimenumbrs.add(17);
		nextfiveprimenumbrs.add(19);
		nextfiveprimenumbrs.add(23);
		nextfiveprimenumbrs.add(29);
		firsttenprimenumbers.addAll(nextfiveprimenumbrs);
		
		System.out.println(firsttenprimenumbers);
		
		
	}

}
