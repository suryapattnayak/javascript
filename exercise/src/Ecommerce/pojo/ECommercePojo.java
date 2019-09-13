package Ecommerce.pojo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Costumer
	{
		private String name,email,city,country,state,mobileno;
	
	public  Costumer(String name,String email,String city,String country,String state,String mobileno) {
		this.name=name;
		this.email=email;
		this.city=city;
		this.country=country;
		this.state=state;
		this.mobileno=mobileno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	
	}
	public class ECommercePojo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Costumer> cust=new ArrayList<Costumer>();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<1;i++)
		{
			cust.add(new Costumer(
					sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next()));
		}
		for(Costumer cmr:cust)
		{
			System.out.println("customer details are");
			System.out.println("name:"+cmr.getName()+"\n"+"email:"+cmr.getEmail()+"\n"+"city:"+cmr.getCity()+"\n"+"country:"+cmr.getCountry()+"\n"+"state:"+cmr.getState()+"\n"+"mobileno:"+cmr.getMobileno());
			System.out.println();
		}
		sc.close();
	}

}
