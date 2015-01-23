package developer;


import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;
import java.io.InputStreamReader;
public class AnagramCheck
{

    public static void main(String[] args) throws IOException
    {
        // TODO code application logic her
        BufferedReader reader1= new BufferedReader(new InputStreamReader(System.in));
            System.out.println("\nEnter first string:");
            String s1= reader1.readLine();
          
        BufferedReader reader2= new BufferedReader(new InputStreamReader(System.in));
            System.out.println("\nEnter first string:");
            String s2= reader2.readLine();
            char[] firstString = s1.toCharArray();
            char[] secondString = s2.toCharArray();
      
            Arrays.sort(firstString);
           Arrays.sort(secondString);
           boolean flag = true;
          
          for(int i =0;i<firstString.length;i++)
        	  if(firstString[i] != secondString[i])
        		  flag = false;
        		  
           if(flag)
            System.out.println(" String "+s1+" is anagram of "+s2);
           else
            System.out.println(" String "+s1+" is not anagram of "+s2);
    }
}

