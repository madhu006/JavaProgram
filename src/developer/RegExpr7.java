package developer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpr7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pattern pat = Pattern.compile("[a-z]+");
		Matcher mat = pat.matcher("this is a test.");
		
		while(mat.find()){
			System.out.println("Match : " +mat.group());
		}

	}

}
