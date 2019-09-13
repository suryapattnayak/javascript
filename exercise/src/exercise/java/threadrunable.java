package exercise.java;

 class testrunable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++)
		{
			System.out.println("Child Thred");
		}
		System.out.println("inside child thred....."+Thread.currentThread().getName());
				Thread.currentThread().setName("java thred");
		System.out.println(Thread.currentThread().getPriority());
				Thread.currentThread().setPriority(1);
		System.out.println(Thread.currentThread());

	}

}
public class threadrunable
{
	public static void main(String[] args)
	{
		testrunable tr=new testrunable();
		Thread t=new Thread(tr);
		t.start();
		for(int i=0;i<5;i++)
		{
			System.out.println("main thred");
		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(t.getName());
		Thread.currentThread().setName("my name");
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(5);
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread());
	
	}
}
