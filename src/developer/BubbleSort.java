package developer;


/**
 * @author Madhulika
 * This program implements Bubble Sort
 */
public class BubbleSort {

	public static void main(String[] args) {
		// array 
		int[] a = {9,5,1,11,2,7,3,27,15,17,21};
		
		BubbleSort bs = new BubbleSort();
		bs.impleBubbleSort(a);
	}

	private void impleBubbleSort(int[] a) {
	
		int m = a.length-1;
		for(int i =0;i<=m;i++){
			for(int j=0;j<m;j++){
				int k = j+1;
				if(a[j]>a[k])
					swap(j,k, a);
			}
		}
		// display array
		for(int num :a){
			System.out.print(" "+num);
		}
	}

	private void swap(int i, int j,int[] a) {
		
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		
	}

}
