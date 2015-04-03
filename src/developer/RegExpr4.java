package developer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpr4 {

	public static void main(String[] args) {
		

		final String IPADDRESS = "^([01]?\\d\\d?)\\." +
				"([01]?\\d\\d?)\\." +
				"([01]?)\\." +
				"([01]?\\d)$";
				
		
		Pattern pat = Pattern.compile(IPADDRESS);
		Matcher mat = pat.matcher("199.169.0.10");
		
		while(mat.find()){
			System.out.println("Match " +mat.group());
		}
	}

}
