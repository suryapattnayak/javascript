package exercise.java;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WritefileClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name");

		try {
			
			FileWriter fileWriter=new FileWriter("D:\\\\file.txt");
			BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
			bufferedWriter.write(sc.next());
			bufferedWriter.newLine();
			bufferedWriter.append("welcome to niit ");
			bufferedWriter.newLine();
			bufferedWriter.append("empcode is 50043772");
			bufferedWriter.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
			FileReader fileReader=new FileReader("D:\\\\file.txt");
			int i;
			while((i=fileReader.read())!=-1)
			{
				System.out.print((char)i);
			}
			System.out.println();
		System.out.println("sucess........");
		sc.close();
	}
	

}
