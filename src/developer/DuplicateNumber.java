package developer;

import java.util.ArrayList;
import java.util.List;


/**
 * @author Madhulika
 * Program to find a duplicate number in the array
 * The array contains consecutive number except last number 
 * in array is repeated.
 */
public class DuplicateNumber {
	
	public void findDuplicateNumber(List<Integer> n){
		int highestNumber = n.size()-1;
		System.out.println("highestNumber "+highestNumber);
		int total = sumOfList(n);
		int duplicate = total -highestNumber*(highestNumber +1)/2;
		System.out.println("the duplicate number "+ duplicate);
	}

	private int sumOfList(List<Integer> n) {
		int sum=0;
		for(Integer num : n)
			sum +=num;
		return sum;
	}

	public static void main(String[] args) {
		List<Integer> n = new ArrayList<Integer>();
		for(int i =1;i <15;i++)
			n.add(i);
		n.add(9);
		DuplicateNumber dn = new DuplicateNumber();
		dn.findDuplicateNumber(n);

	}

}
