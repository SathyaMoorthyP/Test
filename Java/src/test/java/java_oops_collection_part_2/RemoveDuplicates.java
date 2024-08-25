package java_oops_collection_part_2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	
	
	public static void main(String[] args) {
		
		String name = "Learn Automation";
		
		//output = L, e, a, r, n, A, u, t, o, m, i
		
		char[] charArray = name.toCharArray();
		
		Set<Character> allUnique = new LinkedHashSet<Character>();
		
		for (int i = 0; i < charArray.length; i++) {
			allUnique.add(charArray[i]);
			
		}
		
		System.out.println(allUnique);
	}

}


