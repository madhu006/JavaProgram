package developer;

/**
 * 
 */

/**
 * @author Madhulika
 *
 */

enum Apple1 {
	Jonathan,
	GoldenDel,
	RedDel,
	Winesap,
	Cortland
}
public class EnumDemo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Apple1 ap;
		System.out.println("Here are all apple constants");
		
		Apple1 allApples[] = Apple1.values();
		for(Apple1 a : allApples)
			System.out.println(a);
		System.out.println();
		// use valueOf()
		ap = Apple1.valueOf("Winesap");
		System.out.println(" ap contains " +ap);

	}

}
