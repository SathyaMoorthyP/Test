package C2_java_opps_and_collection_part_2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class B5_CA_RemoveDuplicates {

	public static void main(String[] args) {

		String companyName = "google";
		
		char[] charArray = companyName.toCharArray();
		
		Set<Character> unique = new HashSet<Character>(); 
		
		for (int i = 0; i < charArray.length; i++) {
			unique.add(charArray[i]);
		}
		System.out.println(unique) ;
	}

}
