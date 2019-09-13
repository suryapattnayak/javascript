package exercise.java;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ExceptinExample extends Exception {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		ExceptinExample ee=new ExceptinExample();
		try {
			
			if(ee.getConnection()!=null)
			{
				System.out.println("ip address found");
				System.out.println(ee.getConnection());
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}
	
	InetAddress getConnection() throws UnknownHostException
	{
		 InetAddress localhost = InetAddress.getLocalHost();
		 //localhost=null;
		return localhost;
		
	}

}
