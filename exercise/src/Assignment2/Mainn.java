package Assignment2;

import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Mainn {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		LetterSequence ls = new LetterSequence(kb.nextLine());
		ls.displayLetterFrequency(ls.computeFrequency());
		kb.close();
	}

}

class LetterSequence{
	private String sentence;

	public LetterSequence(String sentence) {
		this.sentence = sentence;
	}

	public String getSentence() {
		return sentence;
	}
	public void setSentence(String sentence) {
		this.sentence = sentence;
	}
	
	public TreeMap<Character,Integer>computeFrequency() {
		TreeMap<Character,Integer> tm = new TreeMap<Character, Integer>();
		int len = sentence.length();
		for(int i=0;i<len;i++) {
			char c = sentence.charAt(i);
			if(c==' ')
				continue;
			if(tm.containsKey(c)) {
				int count = tm.get(c);
				tm.put(c, ++count);
			}
			else {
				tm.put(c,1);
			}
		}
		return tm;
	}
	public void displayLetterFrequency(TreeMap<Character,Integer>frequencyMap) {
		for(Entry<Character,Integer> e : frequencyMap.entrySet()) {
			System.out.print(e.getKey()+" : ");
			int i = e.getValue();
			while(i-- > 0)
				System.out.print("*");
			System.out.println();
		}
	}
}
