package thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class Processor5 implements Runnable{

	private CountDownLatch latch;
	
	public Processor5(CountDownLatch latch){
		this.latch = latch;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Started ");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		latch.countDown();
	}
	
}
public class CountDwnLatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CountDownLatch latch = new CountDownLatch(3);
		
		ExecutorService executor = Executors.newFixedThreadPool(3);
		
		for(int i=0;i<3;i++){
			executor.submit(new Processor5(latch));
		}
		try {
			latch.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Completed");

	}

}
