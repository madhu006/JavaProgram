package developer;

import java.util.StringTokenizer;

public class betterprogrammer1 {
	 public static int countWords(String s) {
	        /*
	          Please implement this method to
	          return the word count in a given String.
	          Assume that the parameter String can only contain spaces and alphanumeric characters.
	         */
		 int count =0;
		 
			StringTokenizer st = new StringTokenizer(s);
	 
			System.out.println("---- Split by space ------");
			while (st.hasMoreElements()) {
				System.out.println(st.nextElement());
				count++;
			}
			return count;
	 
		 
	    }
	 public static void main(String[] args){
		 String s = "This is String , split by StringTokenizer, created by madhu";
			
		System.out.println( countWords( s) );
	 }

}
