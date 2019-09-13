package exercise.java;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("This is inside:"+Thread.currentThread().getName());
		System.out.println("Executor service is getting creates...");
		ExecutorService exeservice=Executors.newSingleThreadExecutor();
		System.out.println("creating a runnable");
		Runnable runs=new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Thread.currentThread().setName("my thred");
				System.out.println("This is runnable..:"+Thread.currentThread().getName());
			}
		};
		
		System.out.println("now we are submitting the runnable object...");
		exeservice.submit(runs);
		exeservice.shutdown();
		System.out.println("this is after shutdown the thred which is running.....:"+Thread.currentThread().getName());
	}

}
