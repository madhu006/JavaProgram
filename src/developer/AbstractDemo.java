package developer;


/**
 * @author Madhulika
 * This program demonstrates abstract class and inherit the 
 * abstract class
 */

	
	
	abstract class A {
		abstract void callme();
		void callmetoo(){
			System.out.println("This is a concrete method ");
		}
	}
	
	class B extends A {
		void callme() {
			System.out.println("B's implemention of callme ");
		}
	}

	/**
	 * @param args
	 */
	public class AbstractDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B b = new B();
		b.callme();
		b.callmetoo();

	}

}
