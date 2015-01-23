package developer;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;


/**
 * @author Madhulika
 * 
 * This program demo HashMap and HashTable 
 * It shows features of HashMap vs HashTable
 *
 */
public class HashMapDemo {

	
	public static void main(String[] args) {
		
		// Created a HashMap
		Map<String,Integer> hm = new HashMap<String,Integer>();
		hm.put("Madhulika", 5);
		// Add key is null and value is null
		hm.put(null, null);
		hm.put("stat", null);
		hm.put("prasad", null);
		hm.put("math", 9);
		// Display HashMap
		System.out.println(hm.get("Madhulika"));
		System.out.println(hm.get(null));
		System.out.println(hm.get("stat"));
		System.out.println(hm.get("prasad"));
		
		// Created a HashTable
		Map<String,Integer> ht = new Hashtable<String,Integer>();
		ht.put("madhu", 5);
		//HashTable does not allow key = null and value = null
		//ht.put(null, null);
		// HashTable does not allow value = null
		//	ht.put("prasad", null);
		System.out.println(ht.get("madhu"));
		//	System.out.println(ht.get(null));
		//	System.out.println(ht.get("prasad"));
		
	}

}
