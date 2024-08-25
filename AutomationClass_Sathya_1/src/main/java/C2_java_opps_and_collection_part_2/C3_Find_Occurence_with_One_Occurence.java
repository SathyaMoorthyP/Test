package C2_java_opps_and_collection_part_2;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class C3_Find_Occurence_with_One_Occurence {
	public static void main(String[] args) {
		String cName = "amazon india";
		// m=1, z=1, o=1, d=1, =1
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
	//System.out.println(occ);
		//Print the characters which has only one Occurence
		Set<Entry<Character, Integer>> entrySet = occ.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {
			Integer value = entry.getValue();
			if (value==1) {
				System.out.println(entry.getKey() + ":" + entry.getValue());
			}
		}
		
	}
}
