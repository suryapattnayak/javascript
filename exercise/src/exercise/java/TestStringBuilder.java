package exercise.java;

public class TestStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder strbuil=new StringBuilder("hello");
		System.out.println(strbuil.capacity());
		strbuil.append("tinky will have fun in the class room");
		System.out.println(strbuil);
		System.out.println(strbuil.capacity());
		strbuil.append(101);
		System.out.println(strbuil);
		System.out.println(strbuil.capacity());
		strbuil.replace(1, 4, "surya");
		System.out.println(strbuil);
		System.out.println(strbuil.capacity());
		strbuil.reverse();
		System.out.println(strbuil);
		System.out.println(strbuil.capacity());
		strbuil.insert(1, "java");
		System.out.println(strbuil);
		System.out.println(strbuil.capacity());
		strbuil.delete(1, 4);
		System.out.println(strbuil);
		System.out.println(strbuil.capacity());
	}

}
