package practice;



public class Thread1  {
	
	 public static void main(String[] args){
			Thread t1  = new Thread(new Runable());
			Thread t2 = new Thread(new Runable());
		//	t1.start();
		//	t2.start();
			t1.run();
			t2.run();
			
		}
	

}

 class Runable implements Runnable{

	
	 @Override
		public void run() {
			// TODO Auto-generated method stub
			
			for(int i=0;i<10;i++)
				System.out.println("Hello " +i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	
	
}