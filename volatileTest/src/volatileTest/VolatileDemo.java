package volatileTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class VolatileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Data d=new Data();
		ExecutorService exs=Executors.newFixedThreadPool(5);
		
		exs.execute(new myTask(d));
		exs.execute(new myTask(d));
		exs.execute(new myTask(d));
		exs.execute(new myTask(d));
		exs.execute(new myTask(d));
		exs.shutdown();
	}

}
