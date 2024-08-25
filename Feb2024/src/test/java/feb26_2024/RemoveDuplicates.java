package feb26_2024;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
	
		int[] num = {1, 1, 2, 2, 3, 3, 4, 4};
		
		Set<Integer> uniqueSet = new HashSet<Integer>();
		
		for(int i = 0; i< num.length; i++) {
			uniqueSet.add(num[i]);
		}
	System.out.println(uniqueSet);
	}	
}
