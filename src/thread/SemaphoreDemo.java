package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SemaphoreDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ExecutorService executor = Executors.newCachedThreadPool();
	for(int i=0;i<200;i++){
		executor.submit(new Runnable(){
			public void run(){
				Connection.getInstance().connect();
			}
		});
	}
	executor.shutdown();
	executor.awaitTermination(1, TimeUnit.DAYS);
	}

}
