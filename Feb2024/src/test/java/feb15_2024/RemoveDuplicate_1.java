package feb15_2024;

import java.util.HashSet;
import java.util.Set;


public class RemoveDuplicate_1 {

	public static void main (String[] args) {
		
		int[] num = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 5};
		
		Set<Integer> uniqueset = new HashSet<Integer> ();
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(uniqueset.add(num[i]));
		}	
		System.err.println(uniqueset);
	}	
}
