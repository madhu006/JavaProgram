
package developer;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.StringTokenizer;


/*
 * 
 * Write a function that sums up keys in a text file. The file contains data in
	the format of
	"key,count" where key is a string and count is an integer. Each line will
	only contain one key-count pair. The output should contain each key
	occurring in the file along with the sum of the count for all occurrences of
	a given key.
	For Example:
		John,2
		Jane,3
		John,4
		Jane,5
	Would result in the output: "The total for John is 6. The total for Jane is 8."

input : the location of file example: c:\temp\input1.txt
output : output is the sum of the count for all occurences of a given key
 */
public class KeyCountPair {

	public static void main(String[] args) {
		
		
		System.out.println("Please enter the file address. Example address c:\\temp\\input1.txt ");
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String s= in.nextLine();
		System.out.println("Print the file address "+s);
				// Print the Map
		    for (Entry<String, Integer> entry : getKeyCount(s).entrySet()) {
		       
				System.out.println("The total for "+entry.getKey() + " is "+ entry.getValue());			
				
		    }
	}
	
	/**
	 * 
	 * @param file address
	 * @return is Map of key and sum of count
	 */
	
	 public static Map<String, Integer> getKeyCount(String fileName){
		 
	        FileInputStream fis = null;
	        DataInputStream dis = null;
	        BufferedReader br = null;
	        Map<String, Integer> keyCount = new HashMap<String, Integer>();
	        try {
	            fis = new FileInputStream(fileName);
	            dis = new DataInputStream(fis);
	            br = new BufferedReader(new InputStreamReader(dis));
	            String line = null;
	            while((line = br.readLine()) != null){
	                StringTokenizer st = new StringTokenizer(line, ",");
	                while(st.hasMoreTokens()){
	                    String tmp = st.nextToken().toLowerCase();
	                    //check the map contains the key already.
	                    if(keyCount.containsKey(tmp)){
	                    	keyCount.put(tmp, keyCount.get(tmp)+Integer.valueOf(st.nextToken()));
	                    } else {
	                    	// If map does not contain the key then add the key and value in the map
	                    	keyCount.put(tmp, Integer.valueOf(st.nextToken()));
	                    }
	                }
	            }
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally{
	            try{if(br != null) br.close();}catch(Exception ex){}
	        }
	        return keyCount;
	    }
	     

}
