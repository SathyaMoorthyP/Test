package feb17_2024;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindOccurence {

	public static void main(String[] args) {
	
		String cName = "Sathya Moorthy P";
		char[] car = cName.toCharArray();
		
		Map<Character, Integer> cc = new LinkedHashMap<Character, Integer>();
		
		for (int i = 0; i < car.length; i++) {
		if(cc.containsKey(car[i])) {
			Integer val = cc.get(car[i]);
			cc.put(car[i], val+1);
		}	
		else {
			cc.put(car[i], 1); //s=1,
		}
		}
		System.out.println(cc);
	}
}
