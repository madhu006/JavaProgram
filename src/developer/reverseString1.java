package developer;

import java.util.Scanner;

/**
 * 
 */

/**
 * @author Madhulika
 *
 */
public class reverseString1 {
	
	String reverse = "";
	public String findReverseString(String str){
		if(str.length() == 1)
			return str;
		else		
		reverse += str.charAt(str.length() -1) + findReverseString(str.substring(0, str.length() -1));
		return reverse;
		
	}

	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str;
		System.out.println("Enter a string");
		
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		
		reverseString1 rs = new reverseString1();
		System.out.println(rs.findReverseString(str));
		

	}

}
