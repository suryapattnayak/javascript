package Assignment2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Country, Country> mc=new TreeMap<>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n-- > 0) {
			String[] str = sc.next().split("\\|");
			Country c = new Country(str[0]);
			if(mc.containsKey(c)) {
				c = mc.get(c);
				c.addState(str[1]);
				mc.put(c, c);
			}
			else {
				c.addState(str[1]);
				mc.put(c, c);
			}
		}
		for(Entry<Country,Country> e : mc.entrySet()) {
			Country c = e.getKey();
			System.out.println(c+" "+c.getStateList());
		}
		sc.close();
	}

}
class State implements Comparable<State>
{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public State(String name) {
		super();
		this.name = name;
	}

	@Override
	public int compareTo(State o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
	}
	public String toString() {
		return name;
	}

}
class Country implements Comparable<Country>
{
	private String name;
	List<State> li = new LinkedList<>();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<State> getLi() {
		return li;
	}
	public void setLi(List<State> li) {
		this.li = li;
	}
	public Country(String name) {
		super();
		this.name = name;
	}
	public void addState(String stateName)
	{
		li.add(new State(stateName));
	}
	public List<State> getStateList()
	{
		Collections.sort(li);
		return li;
	}
	@Override
	public int hashCode() {
	
		return name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		Country c=(Country)obj;
		return this.hashCode()==c.hashCode();
	}
	public String toString() {
		return name;
		
	}
	@Override
	public int compareTo(Country o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
	}
	
}