package developer;

import java.util.Arrays;

/**
 * 
 */

/**
 * @author Madhulika
 *
 */
public class IsAnagram {

	/**
	 * @param args
	 * @return 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String firstWord = "army";
		String secondWord ="ma ry";
		     char[] word1 = firstWord.replaceAll("[\\s]", "").toCharArray();
		     char[] word2 = secondWord.replaceAll("[\\s]", "").toCharArray();
	//	char[] word1 = firstWord.toCharArray();
	//	char[] word2 = secondWord.toCharArray();
		     Arrays.sort(word1);
		     Arrays.sort(word2);
		     System.out.println(Arrays.equals(word1, word2)); 
		

	}

}
