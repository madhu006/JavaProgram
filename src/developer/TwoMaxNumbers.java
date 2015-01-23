package developer;


/**
 * @author Madhulika
 * Find First two highest number of the array
 */
public class TwoMaxNumbers {

	public static void main(String[] args) {
		int[] n = {9,2,5,11,12,1,4,95,25,46,106,8}; 
		TwoMaxNumbers tm = new TwoMaxNumbers();
		tm.findTwoMaxNumbers(n);	
	}

	private void findTwoMaxNumbers(int[] n) {
		int oneMax =0;
		int twoMax =0;
		System.out.println(n.length);
		for(int i=0;i<n.length;i++){
			if(n[i]>oneMax){
				twoMax =oneMax;
				oneMax = n[i];
			}
			else if(n[i]>twoMax){
				twoMax =n[i];
			}
		}
		System.out.println("oneMax "+ oneMax);
		System.out.println("twoMax "+ twoMax);
		
	}

}
