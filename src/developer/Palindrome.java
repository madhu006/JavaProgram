package developer;

import java.util.Scanner;

/*
 * Write a function that determines if a given string is a palindrome. A
palindrome is a word or phrase that is spelled exactly the same forwards
or backwards, like "pop" or "Ah, Satan sees Natasha". For this question,
ignore all non-alphanumeric characters and assume that upper-and lowercase
characters are identical. The function should output whether or not
the string is a palindrome and return a boolean.

@author Madhulika Prasad
 */

public class Palindrome {
	
	public static  boolean checkPalindrome(String s){
		boolean isPalindrome = false;
		
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		s=s.toLowerCase();		
		System.out.println(" The string is " +s);
		
		/*
		 * Assumption is empty string is a palindrome	
		 * example string "?"
		 * This string contains a alphanumeric character. After removing the 
		 * alphanumeric character from the string it becomes an empty string
		 */
		
		if(s.isEmpty()){
			System.out.println("It is an empty string");
			return !isPalindrome;
		}
											
		if(s.length()==1)
			return !isPalindrome;
		
		int begin =0;
		int end = s.length()-1;
					
		while (begin<end) {
			if( s.charAt(begin) == s.charAt(end)){
				isPalindrome = true;
				begin++;
				end--;
				}
			else{
				isPalindrome = false;
				return isPalindrome;
				}
		}
				
		return isPalindrome;		
	}

	public static void main(String[] args) {
			
		System.out.println(" Please enter the string" );
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String s= in.nextLine();		
				
		if(checkPalindrome(s))
			System.out.println("Is a palindrome");
		else
			System.out.println("Is  not palindrome");
				
	}	
}

