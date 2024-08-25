package java_oops_collection_part_2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class FindOccurence_2 {

	public static void main(String[] args) {
		
		String name = "narayanan swamy";
		
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		char[] cha = name.toCharArray();
		
		for (int i = 0; i < cha.length; i++) {
		
		if(map.containsKey(cha[i])) {
			
			Integer value = map.get(cha[i]);
			
			map.put(cha[i], value+1);
		}

		else {
			map.put(cha[i], 1);
		}
		
		
		}
		
		System.out.println(map);
		
	}
	
}
