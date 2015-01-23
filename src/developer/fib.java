package developer;

/**
 * 
 */

/**
 * @author Madhulika
 *
 */
public class fib {

	/**
	 * Fibonnaci series
	 */
	public static void main(String[] args) {
		
		System.out.println(" Enter a number");		
		int number = 10;
		int fib1, fib2=0, fib3=1;
		for(number = 1; number<10;number++){
			fib1 = fib2;
			fib2 = fib3;
			fib3 = fib1+ fib2;
			System.out.println(fib3);
			
		}
		
	}

}
