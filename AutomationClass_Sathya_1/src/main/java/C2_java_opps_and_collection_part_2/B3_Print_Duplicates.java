package C2_java_opps_and_collection_part_2;

import java.util.HashSet; 
import java.util.Set;

public class B3_Print_Duplicates {
		
	public static void main(String[] args) {
		
		int[] nums = {2, 4, 6, 3, 5, 3, 2, 1 };
		  // output = 2, 4, 
		
		Set<Integer> uniqueSet = new HashSet<Integer>();
		  for (int i = 0; i < nums.length; i++) {
			  boolean add = uniqueSet.add(nums[i]);
			   if(!add) {
				   System.out.println(nums[i]);
			   }
		} 
	}
}
