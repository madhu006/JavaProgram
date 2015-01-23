package developer;

import java.util.Scanner;


/***
 * 
 * @author Madhulika
 * 
 * Write a program that uses nested loops to collect data and calculate the average rainfall over
 *  a period of years. The program should first ask for the number of years. The outer loop will
 *   iterate once for each year. The inner loop will iterate twelve times, once for each month.
 *    Each iteration of the inner loop will ask the user for the inches of rainfall for that month.
 *     After all iterations, the program should display the number of months, the total inches of 
 *     rainfall, and the average rainfall per month for the entire period.
 *
 */



public class AverageRainfall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[][] rain = new double[13][13];
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the start year");
		int beginYear = input.nextInt();
		
		System.out.println("Enter the end year");
		int endYear = input.nextInt();
		int years = endYear +1 -beginYear;
		int months = years * 12;
		System.out.println("Months"+months);
		double totalRain =0;
		for(int x=1; x<=years; x++){
			for(int y=1;y<13;y++){
				System.out.println("Enter the rain");
				rain[x][y] =input.nextDouble();
				totalRain = totalRain + rain[x][y];
			}
		}
		
		double averageRain = totalRain/(years*12);
		for(int x=1; x<=years; x++){
			for(int y=1;y<13;y++){
			System.out.print("    "+rain[x][y]);
				
			}
			System.out.println(" ");
		}
		
		System.out.println(averageRain);

	}

}
