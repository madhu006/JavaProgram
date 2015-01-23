package developer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpr3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pattern pat;
		Matcher mat;
		boolean found;
		
		pat = Pattern.compile("test");
		mat = pat.matcher("test 1 2 3 test");
		
		while(mat.find()){
			System.out.println("test found at index " +mat.start());
		}
	}

}
