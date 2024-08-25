package feb15_2024;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main (String[] args) {
		
		int[] num = {1, 1, 2, 2, 3, 4, 5};
		
		Set<Integer> uniqueset = new HashSet<Integer> ();
		Set<Integer> onlyuniqueset = new HashSet<Integer> ();
		
		for (int i = 0; i < num.length; i++) {
			boolean add = uniqueset.add(num[i]);
			if(!add) {
			//onlyuniqueset.add(num[i]);
			System.out.println(num[i]);
			}
		}	
	//	System.err.println(uniqueset);
	}
	
}
