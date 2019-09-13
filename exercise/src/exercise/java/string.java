package exercise.java;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="surya";
		String s2=new String("surya");
		StringBuilder sb1=new StringBuilder("surya");
		StringBuffer sb2=new StringBuffer("surya");
		System.out.println(s1==s2);
		System.out.println(s2==s1);
		System.out.println(sb1.equals(sb2));
		System.out.println(s1.equals(s2));
	}

}
