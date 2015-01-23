package developer;

/**
 * 
 */

/**
 * @author Madhulika
 *
 */
public class FindMiddleIndex {
	
	public static int computeMiddleIndex(int[] num) throws Exception{
		
		int sumRight =0;
		int sumLeft =0;
		int endIndex = num.length-1;
		int startIndex =0;
		while(true){
						if(sumRight >sumLeft){
								sumLeft += num[startIndex++];
						}
						else{
								sumRight += num[endIndex--];				
							}
						if(startIndex>endIndex){
								if(sumLeft == sumRight){
														System.out.print("The string is Middle index "+endIndex);
														break;
														}
			
								else{
									throw new Exception("This not a proper string");
								}
								}	
			}
		return endIndex;
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {2,5,3,1,6,3,9,3};		
		try {
			int index = computeMiddleIndex(num);
			System.out.println("Index is "+index);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
