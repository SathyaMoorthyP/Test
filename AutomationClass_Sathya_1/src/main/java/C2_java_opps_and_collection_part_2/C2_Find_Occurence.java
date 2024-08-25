package C2_java_opps_and_collection_part_2;

import java.util.HashMap;
import java.util.Map;

public class C2_Find_Occurence {

	public static void main(String[] args) {

		String cName = "amazon india";
		// a=3, m=1, z=1, o=1, n=2, i=2, d=1
		
		Map<Character, Integer> occ = new HashMap<Character, Integer>();
		
		char[] charArray = cName.toCharArray();
		
		for (int i = 0; i < charArray.length; i++) {
			
			if(occ.containsKey(charArray[i])) {
				
				Integer value = occ.get(charArray[i]);
				occ.put(charArray[i], value+1);
			}
			else {
			occ.put(charArray[i], 1); //a=1, m=1
		   }
		}
	System.out.println(occ);
	}
}
