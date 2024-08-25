package feb26_2024;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindOccurence {

	public static void main(String[] args) {
		
		String cName = "sathya moorthy";
		char[] charArray = cName.toCharArray();
		
		Map<Character, Integer> occ = new HashMap<Character, Integer>();
		
		for(int i = 0; i< charArray.length; i++) {
			
			if(occ.containsKey(charArray[i])) {
				Integer integer = occ.get(charArray[i]);
				occ.put(charArray[i], integer+1);
			}
			else {
				occ.put(charArray[i], 1);
			}
			
		}
		System.out.println(occ);
		
	}

}
