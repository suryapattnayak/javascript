package Assignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Maain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of input");
		int n=sc.nextInt();
		List<ContactInfo> li=new ArrayList<ContactInfo>();
		for(int i=1;i<=n;i++)
		{
			System.out.println("enter "+i+"th contact detail");
			System.out.println("enter your name");
			String name=sc.next();
			System.out.println("enter your email");
			String email=sc.next();
			System.out.println("enter your mobile no");
			Long mobile=sc.nextLong();
			System.out.println("enter your address");
			String address=sc.next();
			li.add(new ContactInfo(name, email, mobile, address));
		}
		Collections.sort(li);
		System.out.println(li);
		sc.close();
	}

}
class ContactInfo implements Comparable<ContactInfo>
{
	private String name;
	private String email;
	private Long mobile;
	private String address ;
	public ContactInfo(String name, String email, Long mobile, String address) {
		super();
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
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
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public int compareTo(ContactInfo o) {
		// TODO Auto-generated method stub
		return o.mobile.compareTo(mobile);

	}
	@Override
	public String toString() {
		return String.format(name+"-"+mobile);
	}
	
}