package developer;



import java.util.List;
import java.util.Scanner;

class Hanoi {
   
   static int n; //number of disks
   
   public static void main (String[] args) { 
	   System.out.println("Enter integer");
	   Scanner in = new Scanner(System.in);
	  n= in.nextInt();
	  List<String> transferList = transferFromAtoC(n);
	  for(String transfer :transferList){
		  System.out.println(transfer);
	  }
         
   }
   public static List<String> transferFromAtoC(int n) {
	   
	   List<String> transferList = new ArrayList<String>();
	   int limit = (1 << n) - 1; 
	      for (int i = 0; i < limit; i++) {
	         int d = disk(i); //disk to be moved
	         int source = (movements(i,d)*direction(d))%3; 
	         int dest = (source + direction(d))%3; 
	    String transfer=  out(d,source,dest);
	    transferList.add(transfer);
	      }
		return transferList;  
   }
   
   //disk that will be moved in step i
   static int disk(int i) {
      int g, x = i+1;
      for (g = 0; x%2 == 0; g++) x /= 2;
      return g;
   }
   
   //how many times disk d is moved before stage i
   static int movements(int i, int d) {
      return ((i >> d) + 1) >> 1;
   }
   
   //disk d always moves in the same direction
   //clockwise=1, counterclockwise=2
   static int direction(int d) {
      return 2 - (n + d)%2;
   }
   
   static String out(int d, int source, int dest) {
	   String transfer ="Moving disk " + d + " from tower " + source + " to tower " + dest;
      return transfer;
   }
}
