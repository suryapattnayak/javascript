package ECommerce.pojo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
class product
{
	private String ProductName;
	private int registationNo;
	private double Price;
	private String SellerName;
	private int MobileNo;
	public product(String productName, int registationNo, double price, String sellerName, int mobileNo) {
		super();
		this.ProductName = productName;
		this.registationNo = registationNo;
		this.Price = price;
		this.SellerName = sellerName;
		this.MobileNo = mobileNo;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public int getRegistationNo() {
		return registationNo;
	}
	public void setRegistationNo(int registationNo) {
		this.registationNo = registationNo;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public String getSellerName() {
		return SellerName;
	}
	public void setSellerName(String sellerName) {
		SellerName = sellerName;
	}
	public int getMobileNo() {
		return MobileNo;
	}
	public void setMobileNo(int mobileNo) {
		MobileNo = mobileNo;
	}
	
	
}

public class ecommerceAdmin {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String productName; int registationNo; double price; String sellerName; int mobileNo;
		List<product> l=new ArrayList<product>();
		System.out.println("      Welcome Admin    ");
		System.out.println("*********************************");
		System.out.println("***1.Enter new product details***");
		System.out.println("***2.View all products        ***");
		System.out.println("***3.Search for a product     ***");
		System.out.println("***4.Delete a product         ***");
		int option=sc.nextInt();
		switch (option) {
		case 1:
				System.out.println("Enter Product Name");
				productName=sc.next();
				System.out.println("Enter Registation no");
				registationNo=sc.nextInt();
				System.out.println("Enter Price");
				price=sc.nextDouble();
				System.out.println("Enter Sellername");
				sellerName=sc.nextLine();
				System.out.println("Enter MobileNo");
				mobileNo=sc.nextInt();
				l.add(new product(productName, registationNo, price, sellerName, mobileNo));
			
			break;
		case 2:
				System.out.println(l);
				
		case 3:
				System.out.println("pls enter the registration no");
				int newregistration=sc.nextInt();
				for (product product : l) {
					
				}

		default:
			break;
		}
		
	}

}
