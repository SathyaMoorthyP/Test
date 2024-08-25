package feb16_2024;

import java.util.HashSet;
import java.util.Set;

public class Final_RemoveDuplicates {

	public static void main(String[] args) {
		
		int[] digits = {1, 2, 3, 1, 2, 3, 1, 2, 3};
		
		Set<Integer> uniqueSet = new HashSet<Integer>();
		
		for (int i = 0; i < digits.length; i++) {
				uniqueSet.add(digits[i]);
		}
	System.out.println(uniqueSet);	
	}
}
