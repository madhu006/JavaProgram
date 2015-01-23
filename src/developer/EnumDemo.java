package developer;

/**
 * 
 */



// An enumeration of Apple varities

enum Apple {
	Jonathan,
	GoldenDel,
	RedDel,
	Winesap,
	Cortland
}
public class EnumDemo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Apple ap;
		ap = Apple.RedDel;
		
		//Output an enum value
		System.out.println("Value of ap "+ ap);
		System.out.println();
		
		ap = Apple.GoldenDel;
		
		//compare two enum values
		if(ap == Apple.GoldenDel)
			System.out.println("ap contains GoldenDel \n");
		
		switch(ap) {
			case Jonathan :
				System.out.println("Jonathan is red");
				break;
			case GoldenDel :
				System.out.println("Golden Delicious is yellow");
				break;
			case RedDel :
				System.out.println("Red Delicious is red");
				break;
			case Winesap :
				System.out.println("Winesap is red");
				break;
			case Cortland :
				System.out.println("Cortland is red");
				break;
		
		}

	}

}
