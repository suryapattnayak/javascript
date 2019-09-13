
package volatileTest;

public class Data {

	public volatile int counter=0;

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}
	
	public void countIncreament()
	{
		try {
			
			Thread.sleep(10);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		++counter;
	}
}
class myTask implements Runnable
{

	private Data data;
	
	public myTask(Data data) {
		super();
		this.data = data;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("value for thred"+Thread.currentThread().getName()+"before increament....\t"+data.getCounter());
		data.countIncreament();
		System.out.println("value for thred"+Thread.currentThread().getName()+"after increament......\t"+data.getCounter());
	}
	
}