package developer;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
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
Would result in the output: "The total for John is 6. The total for Jane is
8."
2)
 */
public class Dealer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> mapKeyCount = getKeyCount("C:/Temp/input1.txt");
		Set<String> keys = mapKeyCount.keySet();
	
		for(String key: keys){
			System.out.println(key);
			System.out.println(mapKeyCount.get(key));
			
		}

	}
	
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
	                    if(keyCount.containsKey(tmp)){
	                    	keyCount.put(tmp, keyCount.get(tmp)+Integer.valueOf(st.nextToken()));
	                    } else {
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
