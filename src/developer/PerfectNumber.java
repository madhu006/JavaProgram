package developer;


/**
 * @author Madhulika
 * Check the number is perfect or not
 */
public class PerfectNumber {
	public void isPerfectNumber(int num){
		int sum =0;
		for(int i =1; i<=num/2;i++){
			if(num%i ==0)
				sum += i;
		}
		if(sum == num)
			System.out.println("This is a perfect number");
		else
			System.out.println("This is not a perfect number ");
	}

	public static void main(String[] args) {
		PerfectNumber pn = new PerfectNumber();
		pn.isPerfectNumber(7);

	}

}
