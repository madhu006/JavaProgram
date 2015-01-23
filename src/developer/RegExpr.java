package developer;

import java.util.regex.*;

public class RegExpr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pattern pat;
		Matcher mat;
		boolean found;
		
		pat = Pattern.compile("Java");
		mat = pat.matcher("Java");
		found = mat.matches();
		
		System.out.println("Testing Java Against Java");
		if(found)
			System.out.println("Matches");
		else
			System.out.println("No Match");
		
		System.out.println();
		
		System.out.println("Testing Java against Java 7");
		
		mat = pat.matcher("Java 7");
		found = mat.matches();
		
		if(found)
			System.out.println("Matches");
		else
			System.out.println("No Match");
		
	}

}
