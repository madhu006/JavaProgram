package practice;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Deadlock  {

	public static void main(String[] args){
		
		Runner1 processor = new Runner1();
		
		Thread t1 = new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					processor.stageOne();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		});
		
		Thread t2 = new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					processor.stageTwo();
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
		processor.finished();
	}
	
}

class Runner1{
	
	Random random = new Random();
	
	Account acct1 = new Account();
	Account acct2 = new Account();
	
	Lock lock1 = new ReentrantLock();
	Lock lock2 = new ReentrantLock();
	
	public void acquireLock(Lock firstLock, Lock secondLock) throws InterruptedException{
		
		boolean gotFirstLock = false;
		boolean gotSecondLock = false;
		while(true){
			try{
			gotFirstLock=firstLock.tryLock();
			gotSecondLock=secondLock.tryLock();
			}
			finally{
				if(gotFirstLock && gotSecondLock)
					return;
				if(gotFirstLock)
					firstLock.unlock();
				if(gotSecondLock)
					secondLock.unlock();
			}
			Thread.sleep(1);
		}
		
	}
	public void stageOne() throws InterruptedException{
		
		for(int i=0;i<10000;i++){
			lock1.lock();
			lock2.lock();
			//	acquireLock(lock1,lock2);
			try{
			acct1.transfer(acct1, acct2, random.nextInt(100));
			}
			finally{
				lock1.unlock();
				lock2.unlock();
				
			}
		}
		
	}
	
	public void stageTwo() throws InterruptedException{
		
		for(int i=0;i<10000;i++){
			lock2.lock();
			lock1.lock();
		//	acquireLock(lock1,lock2);
		try{
			acct1.transfer(acct2, acct1, random.nextInt(100));
		}
		finally{
			lock1.unlock();
			lock2.unlock();
		}
		}
		
	}
	
	public void finished(){
		
		System.out.println("Account1 balance "+acct1.getBalance());
		System.out.println("Account2 balance "+acct2.getBalance());
		System.out.println("Account balance "+(acct1.getBalance()+acct2.getBalance()));
		
	}
}
