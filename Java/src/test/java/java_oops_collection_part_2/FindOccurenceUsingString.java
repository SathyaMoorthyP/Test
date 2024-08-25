package java_oops_collection_part_2;

import java.util.HashMap;
import java.util.Map;

public class FindOccurenceUsingString {

	public static void main(String[] args) {
		
		String companyName = "amazon india";
		
        Map<Character, Integer> occurence = new HashMap<Character, Integer>();
        
        //change String value from "amazon india" to a,m,a,z,o,n,i,n,d,i,a so using toCharArray
        char[] charArray = companyName.toCharArray();
        
        //Iterating 
        for (int i = 0; i < charArray.length; i++) {
        	
        //to check whether my map contains particular key or not 
        if(occurence.containsKey(charArray[i])) {
        	
        //to obtain the value
        Integer Value = occurence.get(charArray[i]);
        
        //returns value 
        occurence.put(charArray[i], Value+1);
        
        }
        
        else {
        //want to add particular character as a key
        occurence.put(charArray[i], 1); //a=1, m=1, 
             }
     	}
        System.out.println(occurence);
	}
}
