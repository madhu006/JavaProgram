package thread;

import java.util.Scanner;




 class  ProducerConsumerWaitNotify{
	
	public  void producer() throws InterruptedException {
		synchronized(this){
			System.out.println("Producer thread running");
			wait();
			System.out.println("Resumed ");
		}
	}
	
	public  void consumer() throws InterruptedException {
		Thread.sleep(2000);
		Scanner scanner = new Scanner(System.in);
		synchronized(this){
			System.out.println("Waiting for return key");	
			scanner.nextLine();
			System.out.println("Return Key pressed ");
			notify();
		    Thread.sleep(5000);
		}
	}

	
}

public class WaitNotify{
	final static ProducerConsumerWaitNotify producerConsumerWaitNotify = new ProducerConsumerWaitNotify();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new Runnable(){
			public void run(){
				
				try {
					producerConsumerWaitNotify.producer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		Thread t2 = new Thread(new Runnable(){
			public void run(){
				
				try {
					producerConsumerWaitNotify.consumer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	
}
