package practice;

public class AppThread {
	public static void main(String[] args){
	Runner t1 = new Runner();
	Runner t2 = new Runner();
	
	t1.start();
	t2.start();
	}
	
}

class Runner extends Thread {
	public void run(){
	for(int i=0;i <10;i++){
		System.out.println("Hello "+i);
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
}
