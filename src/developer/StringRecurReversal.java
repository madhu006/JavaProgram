package developer;

/**
 * 
 */

/**
 * @author Madhulika
 *
 */
public class StringRecurReversal {

	public String reversedString(String str){
		String reversed = "";
		if(str.length()==1)
			return str;
		else{
		reversed += str.charAt(str.length()-1) + reversedString(str.substring(0, str.length()-1));
		return reversed;
			}
	}
	
	public static void main(String[] args) {
		
		StringRecurReversal srr = new StringRecurReversal();
		String rev = srr.reversedString("madhu lika");
		System.out.println(rev);

	}

}
