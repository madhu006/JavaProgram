package thread;

import java.util.Random;

public class InterruptingThreads {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.out.println("Starting");
		
		Thread t = new Thread(new Runnable(){
			public void run(){
				Random ran =new Random();
				
				for(int i=0;i<1E8;i++){
					if(Thread.currentThread().isInterrupted()){
						System.out.println("Interrupted");
						break;
					}
					Math.sin(ran.nextDouble());
				}
			}
		});
		
		t.start();
		Thread.sleep(500);
		t.interrupt();
		t.join();
		System.out.println("Finished");

	}

}
