package feb16_2024;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicate {
	
public static void main(String[] args) {
	
	int[] num = {1, 2, 3, 4, 1, 1, 1, 2};
	
	Set<Integer> uniqueSet1 = new HashSet<Integer>();
	Set<Integer> uniqueSet2 = new HashSet<Integer>();
	Set<Integer> uniqueSet3 = new HashSet<Integer>();
	
	for (int i = 0; i < num.length; i++) {
		boolean add = uniqueSet1.add(num[i]);
		if(!add) {
			uniqueSet2.add(num[i]);
		}
		else{
			uniqueSet3.add(num[i]);
		}
	}
	System.out.println(uniqueSet2);
	System.err.println(uniqueSet3);
}
}
