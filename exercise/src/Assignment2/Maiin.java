package Assignment2;

import java.util.Scanner;

public class Maiin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		int n = UserMainCode.display(s1);
		if(n==1){
			System.out.println("Valid password");
		}else{
			System.out.println("Invalid password");
		}
		sc.close();
	}

}
class UserMainCode {


	public static int display(String password){
		if(password.matches(".*[0-9]{1,}.*") && password.matches(".*[@#$]{1,}.*") && password.length()>=8 && password.length()<=20)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}