package developer;


/**
 * @author Madhulika
 * Find the sum of digits of a number
 */
public class MyNumberSumRec {
	
	public int findNumberSum(int num){
		int sum =0;
		if(num ==0){
			return sum+num;
		}
		else{
			sum += num%10 + findNumberSum(num/10);
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		int num = 236110;
		MyNumberSumRec mns = new MyNumberSumRec();
		int total = mns.findNumberSum(num);
		System.out.println("total values" +total);

	}

}
