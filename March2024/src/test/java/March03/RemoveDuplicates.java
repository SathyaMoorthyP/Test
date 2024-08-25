package March03;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		int[] numbers = {1, 1, 2, 2, 3, 3, 4}; //o/p= {1, 2, 3, 4}
		
		//Set will no hold duplicate date so I'm creating a syntax for the Set
		Set<Integer> uniqueValues = new HashSet<Integer>();
		
		for(int i =0; i<numbers.length; i++) {
			uniqueValues.add(numbers[i]); 
		}
		System.out.println(uniqueValues);
	}
	
}
