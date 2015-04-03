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
		
	//	System.out.println(" Enter a number");		
		int number = 10;
		int fib1, fib2=0, fib3=1;
		System.out.print(fib3);
		for(number = 1; number<10;number++){
			fib1 = fib2;
			fib2 = fib3;
			fib3 = fib1+ fib2;
			System.out.print("   "+fib3);		
			
		}			
		System.out.println();
		System.out.println("Recursive Fibonacci");
		for(number = 1; number<=10;number++){
			System.out.print("   "+ fibonacci(number));	
			
		}	
		
		}
	static	int fibonacci(int n) {
	    if(n <= 1) {
	        return n;
	    } else {
	    	return(fibonacci(n - 1) + fibonacci(n - 2));
	     
	    }
		
	}

}
