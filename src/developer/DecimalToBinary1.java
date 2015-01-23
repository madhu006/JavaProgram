package developer;

/**
 * 
 */

/**
 * @author rakesh
 *
 */
public class DecimalToBinary1 {
	
	public void computeBinary(int n){
		int[] binary =new int[25];
		int index =0;
		while(n!=0){
			binary[index++] =  n%2;
			n= n/2;
		}
		for(int i =index-1;i>=0;i--)
		System.out.print(binary[i]);
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		DecimalToBinary1 db = new DecimalToBinary1();
		db.computeBinary(25);
		
		// TODO Auto-generated method stub

	}

}
