package exercise.java;

public class objectswap {
	int id;
	String name;
	

	public objectswap(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	public String toString()
	{
		return id+" "+name;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		objectswap obj=new objectswap(1, "surya");
		objectswap ob=new objectswap(2, "ravi");
		replace(obj, ob);
		System.out.println(obj);
		System.out.println(ob);
	}
	public static void replace(objectswap obj,objectswap ob)
	{
		String temp;
		temp=obj.name;
		obj.name=ob.name;
		ob.name=temp;
		
	}

}
