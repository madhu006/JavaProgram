package developer;

import java.util.ArrayList;
import java.util.Scanner;

/**
Program to duplicate number between 1 to N numbers
 * 
 */


/**
 * @author Madhulika
 *
 */
public class Add {

	
	public static void main(String[] args) {
		
		int c;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter total number");
		c = input.nextInt();
		ArrayList<Integer> ar = new ArrayList<Integer>();
		for(int i =0; i<c;i++){
			System.out.println("Enter the number");			
			ar.add(input.nextInt());		
		}
		duplicate(ar);					
	}

	/**
	 * @param ar
	 */
	private static void duplicate(ArrayList<Integer> ar) {
		// find duplicate numbers
		for(int i =0; i< ar.size();i++){
			for(int j =i+1 ; j < ar.size(); j++){
				if(ar.get(i).equals(ar.get(j))){
					System.out.println("This is a duplicate number "+ar.get(i));
				}				
			}
		}
	}
	
}
