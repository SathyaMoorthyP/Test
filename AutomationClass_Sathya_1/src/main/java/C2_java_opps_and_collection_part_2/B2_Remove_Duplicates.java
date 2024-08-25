package C2_java_opps_and_collection_part_2;

import java.util.HashSet; 
import java.util.Set;

public class B2_Remove_Duplicates {
		
	public static void main(String[] args) {
		
		int[] nums = {2, 4, 6, 3, 5, 3, 2, 1 };
		  // output = 2, 4, 6, 3, 5, 1
		
		Set<Integer> uniqueSet = new HashSet<Integer>();
		  for (int i = 0; i < nums.length; i++) {
			  uniqueSet.add(nums[i]);
		}
		System.out.println(uniqueSet);
	}
}
