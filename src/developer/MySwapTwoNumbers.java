package developer;


/**
 * @author Madhulika
 * Swap two number without using third number
 */
public class MySwapTwoNumbers {

	public static void main(String[] args) {
		
		int x =5;
		int y =11;
		System.out.println("x =" +x);
		System.out.println("y =" +y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("x =" +x);
		System.out.println("y =" +y);
	
	}

}
