
Stringpackage developer;

import java.util.StringTokenizer;


/**
 * @author Madhulika
 * 
 * This program parse the sentence and display the words with vowel
 *
 */
public class DisplayWordsWithVowels {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "This is String , split by StringTokenizer, created by mkyong";
		StringTokenizer st = new StringTokenizer(str);
 
		System.out.println("---- Split by space ------");
		
		while (st.hasMoreElements()) {
		String	subStr = st.nextToken();
			
			 for(int i=0;i <subStr.length();i++){
		            if((subStr.charAt(i) == 'a') || 
		                (subStr.charAt(i) == 'e')  ||
		                (subStr.charAt(i) == 'i') || 
		                (subStr.charAt(i) == 'o') ||
		                (subStr.charAt(i) == 'u')) {
		                System.out.println(subStr +" The String contains " + subStr.charAt(i));
		            }
		}
			 System.out.println();

	}

	}
}