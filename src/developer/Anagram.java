package developer;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Madhulika
 *
 */
public class Anagram {

	/**
	 * O(n) algorithm
	 */
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter first string");
		String leftString = in.next();
		System.out.println();
		System.out.println("Enter second string");
		String rightString = in.next();
		
				  if (leftString == null || rightString == null) {
			    System.out.println("false");
			  } else if (leftString.length() != rightString.length()) {
				  System.out.println("false");
			  }

			  Map<Character, Integer> occurrencesMap = new HashMap<>();

			  for(int i = 0; i < leftString.length(); i++){
			    char charFromLeft = leftString.charAt(i);
			    int nrOfCharsInLeft = occurrencesMap.containsKey(charFromLeft) ? occurrencesMap.get(charFromLeft) : 0;
			    occurrencesMap.put(charFromLeft, ++nrOfCharsInLeft);
			    char charFromRight = rightString.charAt(i);
			    int nrOfCharsInRight = occurrencesMap.containsKey(charFromRight) ? occurrencesMap.get(charFromRight) : 0;
			    occurrencesMap.put(charFromRight, --nrOfCharsInRight);
			  }
			  boolean flag = true;
			  for(int occurrencesNr : occurrencesMap.values()){
			    if(occurrencesNr != 0){
			    	  System.out.println("It is not an anagram ");
			    	  flag = false;
			    	  break;
			    }
			  }
			  if(flag)
			  System.out.println("It is an anagram ");
			}
		

	}


