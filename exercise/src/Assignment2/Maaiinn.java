package Assignment2;


import java.time.LocalDate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Employee implements Comparable<Employee>{

	private static int counter;
	private int id;
	private String name;
	private String department;
	private LocalDate dateOfJoining;
	private int age;
	private int salary;
	public Employee(String name, String department, LocalDate dateOfJoining, int age, int salary) {
		super();
		this.id = ++counter;
		this.name = name;
		this.department = department;
		this.dateOfJoining = dateOfJoining;
		this.age = age;
		this.salary = salary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	
	
	@Override
	public String toString() {
		return String.format("%-15s %-30s %-30s %-10s %-10s\n", id, name,
				department, dateOfJoining, age, salary);
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return o.salary-salary;
	}
}
class EmployeeBO
{
	public static void printEmployees(List<Employee> employeeList) {
		for(Employee e : employeeList)
			System.out.println(e);
	}
}
public class Maaiinn
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		List<Employee> li=new ArrayList<>();
		li.add(new Employee("Rohini","Data Analyist",LocalDate.of(2000,10, 10) , 45, 90000));
		li.add(new Employee("Ranganathan", "Production",LocalDate.of(2000,10, 9), 23, 92000));
		li.add(new Employee("Pankaj", "Marketing", LocalDate.of(2000,02, 02), 38, 75000));
		EmployeeBO.printEmployees(li);
		System.out.println("..................Chose one Option..............................");
		System.out.println("..................1.for sorting by salary........................");
		System.out.println("...................2.for sorting by age/dateOfJoining............");
		int option=sc.nextInt();
		switch (option) {
		case 1:Collections.sort(li);
				System.out.println(li);
		break;
		
		case 2:Collections.sort(li, new AgeComparator());
				System.out.println(li);

		default:
			break;
		}
		sc.close();
	}
}
class AgeComparator implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.getAge()>o2.getAge())
		return -1;
		else if(o1.getAge()<o2.getAge())
			return +1;
		else
		{
			if(o1.getDateOfJoining().isEqual(o2.getDateOfJoining()))
				return 1;
			else if(o1.getDateOfJoining().isEqual(o2.getDateOfJoining()))
				return -1;
			else
				return 0;
		}
	}
	
}