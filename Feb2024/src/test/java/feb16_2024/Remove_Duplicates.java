package feb16_2024;

import java.util.HashSet;
import java.util.Set;

public class Remove_Duplicates {
	
	public static void main(String[] args) {
		int[] num = {1, 1, 2, 2, 4, 5, 1, 1, 3, 3};
		
		Set<Integer> uniqueSet = new HashSet<Integer>();		
		
		for (int i = 0; i < num.length; i++) {
			uniqueSet.add(num[i]);
		}
		
		System.out.println(uniqueSet);
	}
}
