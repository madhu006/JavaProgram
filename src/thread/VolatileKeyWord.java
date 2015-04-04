package thread;

import java.util.Scanner;

class Processor extends Thread{
	
	private volatile boolean running = true;
	public void run(){
		while(running){
			System.out.println("Hello");
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public void shutdown(){
		running = false;
	}
}
public class VolatileKeyWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Processor proc1 = new Processor();
		proc1.start();
		
		System.out.println("Press enter to stop");
		
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		
		proc1.shutdown();
		

	}

}
