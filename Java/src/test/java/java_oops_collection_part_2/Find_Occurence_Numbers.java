package java_oops_collection_part_2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Find_Occurence_Numbers {

	public static void main(String[] args) {
		
		int[] numbers = {9,6,7,7,2,6,3,0,2,5};
		
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		
		for (int i = 0; i < numbers.length; i++) {
		
		if(map.containsKey(numbers[i])) {
			map.put(numbers[i], map.get(numbers[i]+1));
		}
			
			
		else {
			map.put(numbers[i], 1);
		}
		}
		System.out.println(map);
	}
}
