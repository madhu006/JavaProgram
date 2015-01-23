package developer;

import java.util.HashMap;
import java.util.Map;


/**
 * @author Madhulika
 * Write a program to find duplicate character in a string
 */
public class DuplicateCharacter {
	
	public void findDuplicateChar(String str){
		Map<Character,Integer> mapCharToCount = new HashMap<Character,Integer>();
		char[] strToCharArray = str.toCharArray();
		for(Character c : strToCharArray){
			if(mapCharToCount.containsKey(c)){
				mapCharToCount.put(c, mapCharToCount.get(c)+1);
			}
			else{
				mapCharToCount.put(c,1);
			}								
		}
		// display duplicate character
		for(Character chr : mapCharToCount.keySet()){
			if(mapCharToCount.get(chr) >1){
				System.out.println("Character is "+chr+ " Count is "+mapCharToCount.get(chr));
			}
			
		}
	}

	public static void main(String[] args) {
		
		String str = "JavaProgrammingWorld";
		
		DuplicateCharacter dc = new DuplicateCharacter();
		dc.findDuplicateChar(str);
		

	}

}
