package exercise.java;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThredSheduleExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ScheduledExecutorService sec=Executors.newScheduledThreadPool(1);
		Runnable run1=new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Executing task1 at:"+System.nanoTime());
				System.out.println(Thread.currentThread().getName());
				
			}
		};
		
		System.out.println("submitting task at...:"+System.nanoTime()+"\n"+"will execute after 5 second");
		sec.schedule(run1, 5, TimeUnit.SECONDS);
		System.out.println(Thread.currentThread().getName());
		sec.shutdown();
		System.out.println("After shut down"+Thread.currentThread().getName());
	}

}
