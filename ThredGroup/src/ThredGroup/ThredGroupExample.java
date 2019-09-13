package ThredGroup;
 class Cancellation extends Thread{	
		public void run() {
			System.out.println("i am cancelling Thred");
		}

	}
	class Reservation extends Thread
	{
		public void run()
		{
			System.out.println("i am reserving thred");
		}
	}
	public class ThredGroupExample
	{
		public static void main(String[] args)
		{
			Reservation res=new Reservation();
			Cancellation can=new Cancellation();
			ThreadGroup tg1=new ThreadGroup("first group");
			Thread t1=new Thread(tg1,res,"first group");
			Thread t2=new Thread(tg1,res,"second thred");
			ThreadGroup tg2=new ThreadGroup("second group");
			Thread t3=new Thread(tg2,can,"thrid thred");
			Thread t4=new Thread(tg2,can,"fourth group");
			System.out.println("parent of tg1="+tg1.getParent());
			tg1.setMaxPriority(7);
			System.out.println("Thred group of t1="+t1.getThreadGroup());
			System.out.println("Thred group of t3="+t3.getThreadGroup());
			t1.start();
			t2.start();
			t3.start();
			t4.start();
			System.out.println("no of thred active"+tg1.activeCount());
		}
	}


