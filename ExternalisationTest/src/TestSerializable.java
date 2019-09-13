import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.util.Scanner;

public class TestSerializable {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		BOOK b=new BOOK();
		Scanner sc=new  Scanner(System.in);
		String auth=sc.next();
		b.setAuthor(auth);
		b.setBookid(1111);
		b.setTitle("C++");
		BOOK b1=new BOOK(100, "java", "Anand", 400);
		
		try {
			//serialize the object
			System.out.println("Before serialization"+ b);
			FileOutputStream fos=new FileOutputStream("BOOK.ser");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(b);
			System.out.println("Book is successfully serialized..");
			//deserialize the book object
			FileInputStream fis=new FileInputStream("BOOK.ser");
			ObjectInputStream ois=new ObjectInputStream(fis);
			
			b1=(BOOK) ois.readObject();
			System.out.println("Book is successfully retrieved from serialized object");
			System.out.println("After serialization .."+ b1);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		//BOOK book=new BOOK(1201, "the complete reference java", "Herber Sheild", 500);
		/*try {
			FileOutputStream fos=new FileOutputStream("BOOK.ser");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(book);
			System.out.println("book is successfully serialized");
			FileInputStream fi=new FileInputStream("BOOK.ser");
			ObjectInputStream objectInputStream=new ObjectInputStream(fi);
			BOOK mybook=(BOOK) objectInputStream.readObject();
			System.out.println("book is sucessfully retrived from serialized object");
			System.out.println("After serialization..:"+mybook);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}

}
