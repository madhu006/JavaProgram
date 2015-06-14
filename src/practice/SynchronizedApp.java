package practice;

public class SynchronizedApp {
	private int count =0;
	
	public synchronized void increment(){
		count++;
	}

	public static void main(String[] args){
		SynchronizedApp app = new SynchronizedApp();
		app.doWork();
		
	}
	
	public void doWork(){
		Thread t1 = new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0;i<10000;i++){
					System.out.println("Hello "+i);
					
					increment();
				}
			}
			
		});
		
		Thread t2 = new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0;i<100;i++){
					System.out.println("Hello "+i);
					
					increment();
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
		
		System.out.println("Count is "+count);
	}
}
