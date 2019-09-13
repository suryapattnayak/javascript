package exercise.java;

public interface fruit {

	public void taste();
	public void color();
	public default int add(int a,int b)
	{
		return a+b;
	}
}
