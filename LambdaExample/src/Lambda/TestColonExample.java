package Lambda;

public class TestColonExample {

	static void disp()
	{
		System.out.println("This is disp method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable run=()->System.out.println("hello from lambda");
		run.run();
		Runnable run2=TestColonExample :: disp;
		run2.run();
	}

}
