package developer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpr8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Jon Jonathan Frank Ken Todd";
		Pattern pat = Pattern.compile("Jon.*? ");
		Matcher mat = pat.matcher(str);
		
			System.out.println("Original Sequence : " +str);
			
			str = mat.replaceAll("Eric ");
			
			System.out.println("Modified Sequence : " +str);
	
		
		
	}

}
