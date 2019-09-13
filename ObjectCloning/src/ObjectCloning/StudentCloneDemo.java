package ObjectCloning;

class Student implements Cloneable{

	int id;
	String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public void getDetails() {
		System.out.println("id is"+id+"name is"+name);
	}
	public Object StudentClone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	@Override
	public String toString() {
		return String.format("Student [id=%s, name=%s]", id, name);
	}
	
}
public class StudentCloneDemo
{
	public static void main(String[] args)
	{
		Student s1=new Student(202, "priti");
		System.out.println("The poriginal object of Student is");
		s1.getDetails();
		try {
			 Student s2=(Student)s1.StudentClone();
			 System.out.println("The object is cloned...");
			 s2.getDetails();
			 System.out.println("The Details of s1"+s1+"The detail of s2"+s2);
		} catch (CloneNotSupportedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}