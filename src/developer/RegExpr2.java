package developer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pattern pat;
		Matcher mat;
		
		pat = Pattern.compile("Java");
		mat = pat.matcher("Java 7");
		
		
		System.out.println("Testing Java against Java 7");
		
		
		if(mat.find())
			System.out.println("Subsequence Found");
		else
			System.out.println("No Match");
		
	}

}
