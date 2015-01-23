package developer;


import java.util.ArrayList;
import java.util.List;

/**
 * 
 */

/**
 * @author rakesh
 *
 */
public class DuplicateNumber1 {
	
	public void findDuplicateNumber(List<Integer> num){
		
		int highestNumber;
		highestNumber = num.size()-1;
		int total = sumOfList(num);
		int sums = highestNumber *(highestNumber +1)/2; 
		int duplicate = total - sums;
		System.out.println("Duplicate Number"+ duplicate);			
	}

	private int sumOfList(List<Integer> num) {
		int sum =0;
		for(Integer n : num)
		sum += n;
		return sum;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numList = new ArrayList<Integer>();
		
		for(int i =1; i<15;i++){
			numList.add(i);			
		}
		
		numList.add(29);
		
		DuplicateNumber1 dn1 = new DuplicateNumber1();
		dn1.findDuplicateNumber(numList);

	}

}
