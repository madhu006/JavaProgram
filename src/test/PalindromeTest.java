
package test;

/*
 * Write a function that determines if a given string is a palindrome. A
palindrome is a word or phrase that is spelled exactly the same forwards
or backwards, like "pop" or "Ah, Satan sees Natasha". For this question,
ignore all non-alphanumeric characters and assume that upper-and lowercase
characters are identical. The function should output whether or not
the string is a palindrome and return a boolean.

@Author Madhulika Prasad
 */


import static org.junit.Assert.assertEquals;

import org.junit.Test;

import developer.Palindrome;

public class PalindromeTest {
	
	@Test
	public void testPalindrome() {

	   // Tests
	   assertEquals(Palindrome.checkPalindrome(""),true);
	   assertEquals(Palindrome.checkPalindrome("p"),true);
	   assertEquals(Palindrome.checkPalindrome("?"),true);	  
	   assertEquals(Palindrome.checkPalindrome("!1"),true);		  
	   assertEquals(Palindrome.checkPalindrome("pop"),true);
	   assertEquals(Palindrome.checkPalindrome("Ah, Satan sees Natasha"),true);
	   assertEquals(Palindrome.checkPalindrome("Ah, Satan sees Natasah"),false);
	   assertEquals(Palindrome.checkPalindrome("9dskdh!dfch?gfry g yrfg?hcfd!hdksd9"),true);
		 
	  } 


}
