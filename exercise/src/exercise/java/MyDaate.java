package exercise.java;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MyDaate {

	private int year,month,day;
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd");
	Calendar can=Calendar.getInstance();
	/*public MyDaate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
		
	}

	public MyDaate() {
		super();
		System.out.println();
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}
	public void  addDays()
	{
		//can.add(can.DAY_OF_MONTH, days);
		String mydate=sdf.format(can.getTime());
		System.out.println(mydate);
	}
	*/
	public static void main(String[] args)
	{
		MyDaate d=new MyDaate();
		Calendar can=Calendar.getInstance();
		can.set(2017, 0 
				, 36);
		System.out.println(can.getTime());
	}
}
