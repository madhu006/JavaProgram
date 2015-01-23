package developer;

import java.util.regex.Pattern;

public class RegExpr9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pattern pat = Pattern.compile("[ ,.!]");
		
		String strs[] = pat.split("one two,alpha9 12!done.");
		
		
		for(int i=0; i<strs.length;i++)
			System.out.println("Next Token: "+strs[i]);
	}

}
