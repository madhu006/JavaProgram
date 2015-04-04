package thread;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Runer {
	
	private int count =0;
	private Lock lock = new ReentrantLock();
	private Condition cond = lock.newCondition();
	private void increment(){
		for(int i=0;i<10000;i++){
			count++;
		}
	}
	
	public void firstThread() throws InterruptedException{
		lock.lock();
		System.out.println("waiting --");
		cond.await();
		System.out.println("woken up --");
		
		try{
			increment();
		}
		finally {
			lock.unlock();
		}
	}
	
	@SuppressWarnings("resource")
	public void secondThread() throws InterruptedException{
		Thread.sleep(1000);
		lock.lock();
		System.out.println("Press the return key");
		new Scanner(System.in).nextLine();
		System.out.println("Got return key");
		
		cond.signal();
		try{
			increment();
		}
		finally {
			lock.unlock();
		}
	}
	
	public void finished(){
		System.out.println("Count is " +count);
	}
}

public class ReEntranLock {

		final static Runer procesor = new Runer();
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Thread t1 = new Thread(new Runnable(){
				public void run(){
					
					try {
						procesor.firstThread();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});

			Thread t2 = new Thread(new Runnable(){
				public void run(){
					
					try {
						procesor.secondThread();
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
			
			procesor.finished();
		}

	}


