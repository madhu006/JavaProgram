package developer;

/**
 * 
 */

/**
 * @author Madhulika
 *
 */
public class MyDeadlock1 {
	
	 String str1 = "JAVA";
	 String str2 = "UNIX";
	 
	 Thread thd1 = new Thread("thread1"){
		 public void run(){
			 			while(true){
			 					synchronized(str1){
			 							synchronized(str2){
			 								System.out.println(str1+str2);
			 												}
					 
			 										}
			 			}
			 						
			 }
	 };
	 
	 Thread thd2 = new Thread("thread2"){
		 public void run(){
			 			while(true){
			 					synchronized(str2){
			 							synchronized(str1){
			 								System.out.println(str2+str1);
			 												}
					 
			 										}
			 			}
			 						
			 }
	 };
	 
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		MyDeadlock1 md1 = new MyDeadlock1();
		md1.thd1.start();
		md1.thd2.start();
		
		// TODO Auto-generated method stub

	}

}
