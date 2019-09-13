package exercise.java;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		LocalDate today=LocalDate.now();
		System.out.println(today);
		LocalTime timeob=LocalTime.now();
		System.out.println(timeob);
		LocalDateTime dttime=LocalDateTime.now();
		System.out.println(dttime);
		DateTimeFormatter fmtdt=DateTimeFormatter.ofPattern("dd-mm-yy hh:mm:ss:ms");
		String formated=fmtdt.format(dttime);
		System.out.println(formated);
	}

}
