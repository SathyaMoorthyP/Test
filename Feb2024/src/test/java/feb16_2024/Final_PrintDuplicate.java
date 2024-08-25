package feb16_2024;

import java.util.HashSet;
import java.util.Set;

public class Final_PrintDuplicate {
	
	public static void main(String[] args) {
		
		int[] digits = {1, 2, 3, 1, 2, 3, 4};
		
		Set<Integer> uniqueSet = new HashSet<Integer>();
			
		for (int i = 0; i < digits.length; i++) {
			boolean add = uniqueSet.add(digits[i]);
			if(!add) {
				System.out.println(digits[i]);
			}
		}
	}
}
