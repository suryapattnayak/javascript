package exercise.java;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("this is inside:"+Thread.currentThread().getName());
		System.out.println("creating Executor service with thred pool size of 2");
		
		ExecutorService executorService=Executors.newFixedThreadPool(1);
		Runnable task1=new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Executing task 1 inside"+Thread.currentThread().getName());
				try {
					
						Thread.sleep(100);
						
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		};
		Runnable task2=new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Executing task 2 inside"+Thread.currentThread().getName());
				try {
						try {
							
							Thread.sleep(200);
							
						} catch (InterruptedException e) {
							// TODO: handle exception
							e.printStackTrace();
						}
				} catch (IllegalStateException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		};
		Runnable task3=new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("executing task 3 inside:"+Thread.currentThread().getName());
				try {
					
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				} catch (IllegalStateException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		};
		executorService.submit(task1);
		executorService.submit(task2);
		executorService.submit(task3);
		executorService.shutdown();
		System.out.println("the thred:"+Thread.currentThread().getName());
	}

}
