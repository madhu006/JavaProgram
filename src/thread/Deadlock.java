package thread;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


class Runners {
	
	private Account acc1 = new Account();
	private Account acc2 = new Account();
	
	private Lock lock1 = new ReentrantLock();
	private Lock lock2 = new ReentrantLock();
	
	private void acquireLocks(Lock firstLock, Lock secondLock) throws InterruptedException{
		while(true){
			// Acquire the lock
			boolean gotFirstLock =false;
			boolean gotSecondLock = false;
			
			try{
				gotFirstLock = firstLock.tryLock();
				gotSecondLock= secondLock.tryLock();
			}
			finally{
				if(gotFirstLock && gotSecondLock)
					return;
				
				if(gotFirstLock){
					firstLock.unlock();
				}
				
				if(gotSecondLock){
					secondLock.unlock();
				}
			}
			
			// Locks not acquired
			
			Thread.sleep(1);
		}
	}
	
	
	public void firstThread() throws InterruptedException{
		
		Random random = new Random();
		for(int i=0;i<10000;i++){
			
			acquireLocks(lock1,lock2);
			lock1.lock();
			lock2.lock();
			try{
			Account.transfer(acc1, acc2, random.nextInt(100));
			}
			finally{
				lock1.unlock();
				lock2.unlock();
			
			}
		}
	}
	
	@SuppressWarnings("resource")
	public void secondThread() throws InterruptedException{
		Random random = new Random();
		for(int i=0;i<10000;i++){
		//	acquireLocks(lock1,lock2);
			lock2.lock();
			lock1.lock();
			try{
			Account.transfer(acc2, acc1, random.nextInt(100));
			}
			finally{
				lock1.unlock();
				lock2.unlock();
			}
		}
	}
	
	public void finished(){
		System.out.println("Account 1 balance is " +acc1.getBalance());
		System.out.println("Account 2 balance is " +acc2.getBalance());
		System.out.println("Total balance is " +(acc1.getBalance()+ acc2.getBalance()));
		
	}
}
public class Deadlock {
	
	final static Runners procesor = new Runners();
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
