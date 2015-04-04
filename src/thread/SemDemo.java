package thread;

//A simple semaphore example
/***
 *  Madhulika
 *  program to show semaphore
 */


import java.util.concurrent.*;

public class SemDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Semaphore sem = new Semaphore(1);
		sem.acquire();
		sem.release();
		
		System.out.println("Available permit "+ sem.availablePermits());
		
		new IncThread(sem,"A");
		new IncThread(sem,"B");
	}

}

// A Shared resource

class Shared {
	static int count =0;
}

//A thread of execution that increments count
class IncThread implements Runnable {

	String name;
	Semaphore sem;
	
	
	public IncThread( Semaphore s,String n) {
		 name=n;
		sem = s;
		
		new Thread(this).start();
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("Starting " +name);
		
		try{
			System.out.println(name+ "is waiting for permit");
			sem.acquire();
			System.out.println(name+ "get a permit");
			//Now access shared resources
			for(int i=0;i<5;i++){
				Shared.count++;
				System.out.println(name+":" +Shared.count);
				Thread.sleep(10);
			}
		}
		catch(InterruptedException exc) {
			System.out.println(exc);
		}	
			
		System.out.println(name+ "release the permit");	
			sem.release();									
		}
	}
	
class DecThread implements Runnable {
	String name;
	Semaphore sem;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Starting " + name);
		try{
			System.out.println(name +"is waiting for a permit");
			sem.acquire();
			System.out.println(name +"get a permit");
			
			//Now access shared resource
			for(int i=0;i<5;i++) {
				Shared.count--;
				System.out.println(name +":"+Shared.count);
				
				//Now allow a context switch -- if possible
				Thread.sleep(10);
				
			}
				
				
		}
		catch(InterruptedException exc){
			System.out.println(exc);
		}
		
		//Release the permit
		System.out.println(name+ "release the permit");
		sem.release();
	}
	

}