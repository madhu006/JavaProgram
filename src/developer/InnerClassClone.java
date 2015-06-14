package developer;

public class InnerClassClone {
	public static void main(String[] args) {

	     CoffeeCup original = new CoffeeCup();
	     original.add(75); // original now contains 75 ml of coffee
	     CoffeeCup copy = (CoffeeCup) original.clone();
	     copy.releaseOneSip(25);
	     // Copy now contains 50 ml of coffee.
	     // Original still has 75 ml of coffee.

	     // Figure 15-3 shows the heap at this point in the program

	     int origAmount = original.spillEntireContents();
	     int copyAmount = copy.spillEntireContents();
	     System.out.println("Original has " + origAmount
	         + " ml of coffee.");
	     System.out.println("Copy has " + copyAmount
	         + " ml of coffee.");
	 }

}
