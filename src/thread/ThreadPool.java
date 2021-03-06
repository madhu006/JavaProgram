package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Processor1 implements Runnable{

	private int id;
	public Processor1(int id){
		this.id =id;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("Starting " +id);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Completed " +id);
		
	}
	
}
public class ThreadPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExecutorService executor = Executors.newFixedThreadPool(2);

		for(int i=0;i<=5;i++){
			executor.submit(new Processor1(i));
		}
		executor.shutdown();
		
		System.out.println("All the task submitted");
		
		try {
			executor.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("All task submitted");
	}

}
