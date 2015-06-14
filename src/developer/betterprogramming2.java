package developer;

import java.util.Arrays;

public class betterprogramming2 {

	 public static void sortIgnoringSpaces(String[] a) {
	        /*
	          Please implement this method to
	          sort a given array of Strngs in alphabetical order
	          ignoring spaces (' ' symbols) within the strings.
	         */

		 for(int i=0;i<a.length;i++)
		 {
			 a[i].replace(" ", "");
		 }
	
			
		 Arrays.sort(a);
		 for(int i=0;i<a.length;i++)
		 System.out.println(a[i]);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a = {"mad hu","ab   c","mpc"};	
		sortIgnoringSpaces(a) ;
	}

}
