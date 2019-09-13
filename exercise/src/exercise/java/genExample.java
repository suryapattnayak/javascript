package exercise.java;
class TestGeneric<T>
{
	TestGeneric obj;
	public TestGeneric() {
		// TODO Auto-generated constructor stub
		
	}
	public TestGeneric(TestGeneric t1) {
		// TODO Auto-generated constructor stub
		this.obj=t1;
	}
	public void display()
	{
		System.out.println("type of object is"+obj.getClass().getName());
	}
}

public class genExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestGeneric t1=new TestGeneric();
		TestGeneric<TestGeneric> tg=new TestGeneric(t1);
		tg.display();
	}

}
