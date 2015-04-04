package thread;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class CallableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExecutorService executor = Executors.newCachedThreadPool();
		
		Future<Integer> future = executor.submit(new Callable<Integer>(){
		public Integer call() throws Exception{
			Random random = new Random();
			
			
			int duration = random.nextInt(4000);
			
			if(duration>2000){
				throw new IOException("Sleeping for too long");
			}
			System.out.println("Starting...");
			Thread.sleep(duration);
			
			System.out.println("Finished");
			return duration;
		}
		
		});
		executor.shutdown();
		//executor.awaitTermination(1, TimeUnit.DAYS);
		try {
			System.out.println("Results is "+future.get());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

