package exercise.java;

public class equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		myDate date1=new myDate(1, 5, 1);
		myDate date2=new myDate(1, 5, 1);
		
		
		date2=date1;
		if(date1==date2)
		{
			System.out.println("date1 is identical to date2");
		}
		else
		{
			System.out.println("date1 is not identical to date2");
		}
		if(date1.equals(date2))
		{
			System.out.println("date1 is equals to date2");
		}
		else
		{
			System.out.println("date1 is not equals to date2");
		}
		//int r=date1.hashCode();
		//System.out.println(date1.hashCode());
	}

}
