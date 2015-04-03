package test;

import static org.junit.Assert.assertEquals;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;
import developer.KeyCountPair;

public class KeyCountPairTest {
	
	@Test
	public void testKeyCount() {
		
		String fileName ="C:/Temp/input1.txt";
		  Map<String, Integer> keyCount = new HashMap<String, Integer>();
		  keyCount.put("a", 39);
		  keyCount.put("monika", 2);
		  keyCount.put("james", 9);
		  keyCount.put("lili", 10);
		  keyCount.put("mary", 3);
		  keyCount.put("john", 6);
		  keyCount.put("jane", 8);
		  keyCount.put("madhulika", 6);
		     
	   // Tests
	   assertEquals(KeyCountPair.getKeyCount(fileName),keyCount);
	   
	  } 

	@Test
	public void keyCountWithEmptyFile() {  
	 String fileName = "C:/Temp/input2.txt";
	  Map<String, Integer> keyCount = new HashMap<String, Integer>();	
	  assertEquals(KeyCountPair.getKeyCount(fileName),keyCount);
	   }
	
}
