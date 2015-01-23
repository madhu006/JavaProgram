package developer;

import java.util.Scanner;

/***
 * 
 * @author Madhulika Prasad
 *
 *Write a program that creates a two-dimensional array initialized with test data.
 * Use any primitive data type you wish. The program should have the following methods.

    getTotal - This method should accept a two-dimensional array as its 
    argument and return the total of all the values in the array.
    getAverage - This method should accept a two-dimensional array as its 
    argument and return the average of all the values in the array.
    getRowTotal. - This method should accept a two-dimensional array as its 
    first argument and an integer as its second argument. The second argument 
    should be the subscript of a row in the array. The method should return the
     total of the values in the specified row.
    getColumnTotal - This method should accept a two-dimensional array as its First
     argument and an integer as its second argument. The second argument should be 
     the subscript of a column in the array. The method should return the total of the values in the specified column.
    getHighestInRow - This method should accept a two-dimensional array as its First
     argument and an integer as its second argument. The second argument should be the 
     subscript of a row in the array. The method should return the Highest values in the specified row in the array.
    getLowestInRow - This method should accept a two-dimensional array as its First 
    argument and an integer as its second argument. The second argument should be the subscript
     of a row in the array. The method should return the lowest values in the specified row in the array.
 */

public class ArrayOperations {
	
	static int [][]a = new int[10][10];

	static void getAverage(int row){
		double sum =0;
		for(int i =0; i<2; i++)
			for (int j=0;j<row;j++)
			sum = sum +	a[i][j];
		double  m = row *2;
		double avg = sum/m;
		System.out.println("Average "+avg);
		
	}
	
	static void getRowTotal(int rowNum,int row){
		
		int rowSum =0;
		for(int k=0;k<row;k++)
			rowSum = rowSum + a[k][rowNum];

		System.out.println(rowSum);
		
		
	}
	static void getHighestInRow(int rowNum,int row){
		int rowHighest =0;
		for(int k=0;k<2;k++)
			if( a[k][rowNum] > rowHighest)
				rowHighest  = a[k][rowNum];
		System.out.println(rowHighest);
	}
	
	static void getLowestInRow( int rowNum, int row){
		int rowLowest =a[0][rowNum];
		for(int k=0;k<2;k++)
			if( a[k][rowNum] < rowLowest)
				rowLowest  = a[k][rowNum];
		System.out.println(rowLowest);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Please enter row numbers");
		Scanner input = new Scanner(System.in);
		int row = input.nextInt();
		
		System.out.println("Please enter row numbers");
		
	
		for(int i =0; i<2; i++)
			for (int j=0;j<row;j++)
				a[i][j] = input.nextInt();
		
		getAverage(row);
		System.out.println("Please enter row numbers");
		int rowNum = input.nextInt();
		
		getRowTotal(rowNum,row);
		getHighestInRow( rowNum,row);
		getLowestInRow( rowNum,row);
	}

}
