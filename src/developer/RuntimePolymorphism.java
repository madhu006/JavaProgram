package developer;


/**
 * @author Madhulika
 * This program demo Runtime Polymorphism
 *
 */

class Motor {
	void callme(){
		System.out.println("Inside Motor's callme method");
	}
}

class Bus extends Motor{
	void callme(){
		System.out.println("Inside Bus's callme method");
	}
}

class Car extends Motor{
	void callme(){
		System.out.println("Inside Car's callme method");
	}
}

public class RuntimePolymorphism {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Motor motorObject = new Motor();
		Bus busObject = new Bus();
		Car carObject = new Car();
		
		Motor referenceToMotor;
		
		referenceToMotor = motorObject;  // This is Runtime Polymorphism
		referenceToMotor.callme(); //refers to Motor callme
		
		referenceToMotor = busObject;   // This is Runtime Polymorphism
		referenceToMotor.callme(); //refers to Bus callme
		
		referenceToMotor = carObject;   // This is Runtime Polymorphism
		referenceToMotor.callme(); //refers to Car callme		
	// Try the commented code understand why these assignments cause error
	//	Motor motorObject = new Bus();
	//	Bus bus = new Motor();
	//	busObject = motorObject;
	//	carObject = new Bus();

	}

}
