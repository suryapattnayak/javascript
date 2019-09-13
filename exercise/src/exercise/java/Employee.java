package exercise.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class Employee {

	public static List<EmployeeName> createEmployee()
	{
		return Arrays.asList(
				
				new EmployeeName("surya", Gender.MALE, 24),
				new EmployeeName("ravi", Gender.MALE, 22),
				new EmployeeName("snaresh", Gender.MALE, 23),
				new EmployeeName("vijay", Gender.MALE, 24),
				new EmployeeName("laxmi", Gender.FEMALE, 25),
				new EmployeeName("ansu", Gender.FEMALE, 24),
				new EmployeeName("monika", Gender.FEMALE, 23)
				);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<EmployeeName> emplon=createEmployee();
		System.out.println("printing list before stream");
		System.out.println(emplon);
		List<String> empo=new ArrayList<>();
		for(EmployeeName emp: emplon)
		{
			if(emp.getAge()<25)
			{
				empo.add(emp.getName().toUpperCase());
			}
		}
		System.out.println(empo);
		List<String> empl=
				emplon.stream()
				.filter(emp->emp.getAge()<25)
				.map(emp->emp.getName())
				.map(name->name.toUpperCase())
				//we can use lambda or scope operator
				//.map(EmployeeName::getName)
				//.map()
				//.map(String::toUpperCase)
				.collect(Collectors.toList());
		System.out.println(empl);
				emplon.stream()
				.filter(emp->emp.getGender()==Gender.MALE)
				.map(emp->new EmployeeName(emp.getName().toUpperCase(),emp.getGender(),emp.getAge()))
				.forEach(System.out::println);
		System.out.println("========================");
		System.out.println("print sum of ages");
		System.out.println(
				emplon.stream()
				.mapToInt(EmployeeName::getAge)
				.sum()
				);
		System.out.println(
				
				emplon.stream()
				.min((emp1,emp2)->emp1.getAge()>emp2.getAge()?1:-1));
		
		System.out.println("======================");
		System.out.println(
				
				emplon.stream()
				.filter(emp->emp.getAge()<22)
				.count()
				
				);
		
		List<String> enam=
				emplon.stream()
				.filter(emp->emp.getAge()>18)
				.map(emp->emp.getName().toUpperCase())
				.collect(Collectors.toList());
		System.out.println(enam);
		
		
		System.out.println("=====================");
		System.out.println("print set of employees");
		
		Set<EmployeeName> males=
				emplon.stream()
				.filter(emp->emp.getGender()==Gender.MALE)
				.collect(Collectors.toSet());
		System.out.println(males);
		
		//make a set of male employes with name only
		
		System.out.println("=========================");
		System.out.println("print set of male employees with name");
		Set<String> malenames=
				emplon.stream()
				.filter(emp->emp.getGender()==Gender.MALE)
				.map(EmployeeName::getName)
				.collect(Collectors.toSet());
		System.out.println(malenames);
		
		//to make the map of objects
		
		java.util.Map<String, EmployeeName> map=
				emplon.stream()
				.collect(Collectors.toMap(emp->emp.getName()+":"+emp.getAge(),emp->emp));
		System.out.println(map);
		
	}

}
