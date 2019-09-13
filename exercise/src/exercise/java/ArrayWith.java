package exercise.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

public class ArrayWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li=new ArrayList<Integer>();
		li.add(5);
		li.add(6);
		li.add(7);
		li.add(8);
		int r=li.size();
		
		Iterator it=li.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		System.out.println();
		for(int i=0;i<r;i++)
		{
			System.out.print(li.get(i)+" ");
		}
		System.out.println();
		for(Integer in:li)
		{
			System.out.print(in+" ");
		}
		System.out.println();
		Enumeration<Integer> enm=Collections.enumeration(li);
		while(enm.hasMoreElements())
		{
			System.out.print(enm.nextElement()+" ");
		}
	}

}
