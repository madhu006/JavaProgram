package developer;

/**
 * 
 */

/**
 * @author rakesh
 *
 */
public class PerfectNumber1 {

	public void isPerfectNumber(int n){
		int sum =0;
		for(int i=1;i<=n/2;i++){
			if(n%i==0)
				sum += i;
				
		}
		if(sum == n)
			System.out.println("It is a perfect number");
		else
			System.out.println("It is not perfect Number");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PerfectNumber1 perfectNumber = new PerfectNumber1();
		perfectNumber.isPerfectNumber(9);

	}

}
