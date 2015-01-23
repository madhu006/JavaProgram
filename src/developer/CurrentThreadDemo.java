package developer;


public class CurrentThreadDemo {

	public static void main(String[] args) {
		
		Thread t = Thread.currentThread();
		
		// TODO Auto-generated method stub
		System.out.println("Current Thread " +t);
		t.setName("Madhu");
		System.out.println("After name change" +t);
		
		try {
			for(int n=5; n>0;n--){
				System.out.println(n);
				Thread.sleep(1000);
			}
		}
			catch(InterruptedException e){
				System.out.println("Main thread interrupted");
			}
		}

	

}
