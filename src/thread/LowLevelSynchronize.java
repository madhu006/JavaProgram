package thread;

import java.util.LinkedList;
import java.util.Random;

public class LowLevelSynchronize {

	

	final static Procesor procesor = new Procesor();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new Runnable(){
			public void run(){
				
				try {
					procesor.producer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		Thread t2 = new Thread(new Runnable(){
			public void run(){
				
				try {
					procesor.consumer();
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

class Procesor{
	private LinkedList<Integer> list = new LinkedList<Integer>();
	private final int LIMIT =10;
	private Object lock = new Object();
	 
	public void producer() throws InterruptedException{
		int value =0;
		while(true){
			synchronized(lock){
				while(list.size() == LIMIT){
					lock.wait();
				}
					list.add(value++);
					lock.notify();
			}
		}
	}
	
	public void consumer() throws InterruptedException{
	
		Random random =new Random();
		while(true){
			synchronized(lock){
				while(list.size()== 0){
					lock.wait();
				}
				System.out.println("List size is " +list.size());
				int value = list.removeFirst();
				System.out.println("value is "+value);
				lock.notify();
			}
			Thread.sleep(random.nextInt(100));
		}
	}
}

