package developer;

import java.util.Scanner;

public class BetterProgrammerTask {

	public void solve(int n, String auxiliary) {
		String start = "A";
		String end = "C";
		
		if (n == 1) {
	           System.out.println(start + " -> " + end);
	       } else {
	           solve(n - 1, start, end, auxiliary);
	           System.out.println(start + " -> " + end);
	           solve(n - 1, auxiliary, start, end);
	       }
	   }

	   public static void main(String[] args) {
		   BetterProgrammerTask towersOfHanoi = new BetterProgrammerTask();
	       System.out.print("Enter number of discs: ");
	       Scanner scanner = new Scanner(System.in);
	       int discs = scanner.nextInt();
	       towersOfHanoi.solve(discs, "A", "B", "C");
	   }
	

}
