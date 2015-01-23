package developer;

/**
 * 
 */

/**
 * @author rakesh
 *
 */

enum Apple2 {
	Jonathan(10),
	GoldenDel(9),
	RedDel(12),
	Winesap(15),
	Cortland(18);
	
	private int price;
	
	Apple2(int p){price = p;}
	
	int getPrice() {
		return price;
	}
}
public class EnumDemo4 {

	
	public static void main(String[] args) {
		System.out.println("Winesap costs" + Apple2.Winesap.getPrice());
		
		System.out.println("All Apple Prices");
		for(Apple2 a : Apple2.values()){
			System.out.println(" Apple type " + a +" cost " + a.getPrice());
		}

	}

}
