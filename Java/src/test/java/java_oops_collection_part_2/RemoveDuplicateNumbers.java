package java_oops_collection_part_2;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateNumbers {

	public static void main(String[] args) {
		int[] num = {1,2,3,4,5,1,2};
		
		Set<Integer> num1 = new TreeSet<Integer>();
		Set<Integer> num2 = new TreeSet<Integer>();
		
		for (int i = 0; i < num.length; i++) {
			
			boolean ch = num1.add(num[i]);
			
			if (ch==false) {
				num2.add(num[i]);
			}
		}
		
		//System.out.println(num1);
		System.err.println("Set values" + num1);
	
		System.out.println("Set values of set2" + num2);
	}
	
}
