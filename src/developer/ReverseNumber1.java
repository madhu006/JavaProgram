package developer;

import java.util.Scanner;

/**
 * 
 */

/**
 * @author Madhulika
 *
 */
public class ReverseNumber1 {
	
	void findReverseNumber(int num){
		int reverse =0;
		while(num!=0){
		reverse = reverse*10 + num %10;
		num = num/10;
		}
		System.out.println(reverse);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		System.out.println("enter the number");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		ReverseNumber1 rn = new ReverseNumber1();
		rn.findReverseNumber(num);

	}

}
