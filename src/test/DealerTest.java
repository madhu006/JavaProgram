package test;

/*
 * Write a function that determines if a given string is a palindrome. A
palindrome is a word or phrase that is spelled exactly the same forwards
or backwards, like "pop" or "Ah, Satan sees Natasha". For this question,
ignore all non-alphanumeric characters and assume that upper-and lowercase
characters are identical. The function should output whether or not
the string is a palindrome and return a boolean.
 */


import static org.junit.Assert.assertEquals;

import org.junit.Test;

import developer.Dealer;

public class DealerTest {
	
	@Test
	public void testPalindrome() {

	   // Tests
		 assertEquals(Dealer.checkPalindrome(""),false);
		 assertEquals(Dealer.checkPalindrome("p"),true);
	   assertEquals(Dealer.checkPalindrome("pop"),true);
	   assertEquals(Dealer.checkPalindrome("Ah, Satan sees Natasha"),true);
	   assertEquals(Dealer.checkPalindrome("Ah, Satan sees Natasah"),false);
		 
	  } 


}
