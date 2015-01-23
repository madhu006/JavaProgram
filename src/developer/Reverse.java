package developer;

import java.util.Scanner;

/**
 * 
 */

/**
 * @author Madhulika
 * Reverse string
 */
public class Reverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String reverse;
		System.out.println("Enter aa string");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		reverse = input.next();
		char[] newCharArray = reverse.toCharArray();
		for(int i = newCharArray.length -1; i>=0; i--)
			System.out.print(newCharArray[i]);
		
	}

}
