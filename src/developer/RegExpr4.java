package developer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpr4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Pattern pat = Pattern.compile("W+");
		Matcher mat = pat.matcher("W WW WWW");
		
		while(mat.find()){
			System.out.println("Match " +mat.group());
		}
	}

}