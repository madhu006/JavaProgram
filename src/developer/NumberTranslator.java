package developer;

import java.util.Scanner;

/**
 * 
 * @Madhulika Prasad
 *
 *Many companies use telephone numbers like 555-GET-Food so the number is easier
 * for their customers to remember. On a standard telephone, the alphabetic letters
 *  are mapped to numbers in the following fashion:

    A, B, and C = 2
    D, E, and F = 3
    G, H, and I = 4
    J, K, and L = 5
    M, N, and O = 6
    P, Q, R, and S = 7
    T, U, and V = 8
    W, X, y, and Z = 9

Write an application that asks the user to enter a 10-character telephone number
 in the format XXX-XXX-XXXX. The application should display the telephone number
  with any alphabetic characters that appeared in the original translated to their
   numeric equivalent. For example, if the user enters 555-GET-FOOD the application
    should display 555-438-3663.
 *
 */


public class NumberTranslator {
	
	public static void translator(String phoneNumber){
		char[] charArray = phoneNumber.toCharArray();
		for(int i =0;i< charArray.length;i++)
		{
		if(charArray[i] == 'A' || charArray[i] =='B' || charArray[i] =='C'){
		charArray[i] ='2';
		}
		if(charArray[i] == 'D' || charArray[i] =='E' || charArray[i] =='F'){
			charArray[i] ='3';
		}
			if(charArray[i] == 'G' || charArray[i] =='H' || charArray[i] =='I'){
				charArray[i] ='4';
			}
				if(charArray[i] == 'J' || charArray[i] =='K' || charArray[i] =='L'){
					charArray[i] ='5';
				}
					if(charArray[i] == 'M' || charArray[i] =='N' || charArray[i] =='O'){
						charArray[i] ='6';
					}
					
					if(charArray[i] == 'P' || charArray[i] =='Q' || charArray[i] =='R' || charArray[i] =='S'){
						charArray[i] ='7';
					}
						if(charArray[i] == 'T' || charArray[i] =='U' || charArray[i] =='V'){
							charArray[i] ='8';
						}
							if(charArray[i] == 'W' || charArray[i] =='X' || charArray[i] =='Y' || charArray[i] =='Z'){
								charArray[i] ='9';
							}
		}
		
		for(char c:charArray)
		System.out.print( c);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String phoneNumber;
		System.out.println("Please enter the telephone number");
		
		Scanner input = new Scanner(System.in);
		phoneNumber = input.next();
		
		translator(phoneNumber);
		
	}

}
