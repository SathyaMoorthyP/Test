package feb16_2024;

import java.util.HashSet;
import java.util.Set;

public class Final_PrintDuplicate_Twice {

	public static void main(String[] args) {
		
		int[] sum = {1, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
		Set<Integer> unique = new HashSet<Integer>();
		Set<Integer> unique2 = new HashSet<Integer>();
		
		for (int i = 0; i < sum.length; i++) {
			boolean add = unique.add(sum[i]);
			if(!add) {
				unique2.add(sum[i]);
			}
		}
		System.out.println(unique2);
	}
}
