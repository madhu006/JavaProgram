package developer;

public class Immutable {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		StringBuffer x=new StringBuffer("Madhu");
		System.out.println("StringBuffer "+x);
		
		
		String oldString = new String( x );
		
		String newString = oldString;
		
		System.out.println(" OldString "+oldString);
		
		System.out.println("NewString "+newString);
		String replacedString = oldString.replace("ad", "xy");
		oldString.toLowerCase();
		x.replace(2, 3, "kl");
		
		System.out.println("OldString "+oldString);
		System.out.println("NewString "+newString);
		System.out.println("ReplacedString " +replacedString);
		System.out.println("X "+x);
		

	}

}
