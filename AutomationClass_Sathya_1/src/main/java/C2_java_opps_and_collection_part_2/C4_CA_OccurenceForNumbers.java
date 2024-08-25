package C2_java_opps_and_collection_part_2;

import java.util.HashMap;
import java.util.Map;


public class C4_CA_OccurenceForNumbers {

	public static void main(String[] args) throws InterruptedException {
		
		int[] nums = {1, 2, 1, 3, 2, 5};
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < nums.length; i++) {
			
			if (map.containsKey(nums[i])) {
 				map.put(nums[i], map.get(nums[i])+1); 
			} 
			
			else {
				map.put(nums[i], 1);
			}
			
		}
		System.out.println(map);
	}
	
}
