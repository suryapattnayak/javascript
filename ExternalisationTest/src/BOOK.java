import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class BOOK implements Externalizable {

	private int bookid;
	private String title;
	private String author;
	private double price=500.50;
	public BOOK(int bookid, String title, String author, double price) {
		super();
		this.bookid = bookid;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public BOOK() {
		super();
		this.bookid = bookid;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "BOOK{" +"Book Id::"+bookid+" "+"Title::"+title+" "+"Author::"+author+" "+"price::"+price+"}";
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		out.write(bookid);
		out.writeObject(" ");
		out.writeChars(author);
	    out.writeObject(title);
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		this.author=in.readLine();
		//this.title=in.readLine();
	}
	
	

}
