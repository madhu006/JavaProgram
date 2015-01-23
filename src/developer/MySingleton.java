package developer;


/**
 * @author Madhulika
 * This program implements Singleton pattern
 */
public class MySingleton {
	
	
		private static MySingleton newObj = null;
		
		private	MySingleton(){};
		
		static {
			newObj = new MySingleton();
		}
		
		public static MySingleton getInstance(){
			return newObj;
		}
		
		public void test(){
			System.out.println("This is a singleton class");
		}
	
	public static void main(String[] args) {
		
		MySingleton ms = getInstance();
		
		ms.test();
		

	}

}
