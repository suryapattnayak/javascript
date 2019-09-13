import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;

public class TestSerializable {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		BOOK book=new BOOK(1201, "the complete reference java", "Herber Sheild", 500);
		try {
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
		}
	}

}
