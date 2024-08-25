package java_oops_collection_part_2;

import java.util.HashMap;
import java.util.Map;

public class FindOccurenceUsingNumbers {
	
	public static void main(String[] args) {
		
		int[] nums = {1, 2, 1, 3, 2, 5};
		
		Map<Integer, Integer> occurence2 = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < nums.length; i++) 
		{
		if(occurence2.containsKey(nums[i])) {
			occurence2.put(nums[i], occurence2.get(nums[i]+ 1));
		}
		
		else {
			occurence2.put(nums[i], 1);
		}
		}
		System.out.println(occurence2);
	}
}
