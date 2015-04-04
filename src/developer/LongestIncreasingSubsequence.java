package developer;

// Dynamic Programming problem

public class LongestIncreasingSubsequence {
	
	public static void printLIS(int[] nums){
		
		String[] paths = new String[nums.length];
		int[] sizes = new int[nums.length];
		
		for(int i=0;i<nums.length;i++){
			sizes[i] =1;
			paths[i] = nums[i] + " ";
		}
		
		int maxLength =1;
		
		for(int i=1;i<nums.length;i++){
			for(int j=0;j<i;j++){
				if(nums[i]>nums[j]&& sizes[i]<sizes[j]+1){
					sizes[i] = sizes[j]+1;
					paths[i] =paths[j] +nums[i] +" ";
					
					if(maxLength <sizes[i])
						maxLength = sizes[i];
						
				}
			}
		}
		for(int i=1;i<nums.length; i++){
			if(sizes[i] == maxLength)
				System.out.println("LIS:" +paths[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {2,6,4,5,1,3};
		printLIS(nums);
		

	}

}
