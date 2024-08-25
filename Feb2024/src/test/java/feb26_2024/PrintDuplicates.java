package feb26_2024;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicates {

	public static void main(String[] args) {

		int[] nums = {1, 1, 2, 3, 3, 4, 5, 5};
		int length = nums.length;

		Set<Integer> uSet = new HashSet<Integer>();
		for(int i = 0; i< length; i++) {
			boolean add = uSet.add(nums[i]);
			if(!add) {
				System.out.println(nums[i]);
			}
			
		}
	}

}
