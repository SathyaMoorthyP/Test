package feb19_2024;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class OccurenceNumber {

	public static void main(String[] args) {
		
		int[] num = {1, 2, 3, 4, 1, 2, 3};
		int length = num.length;

		Map<Integer, Integer> occ = new HashMap<Integer, Integer>();
		for (int i = 0; i < length; i++) {
			occ.put(num[i], occ.getOrDefault(num[i], 0)+1);
		/*	if(occ.containsKey(num[i])) {
				Integer integer = occ.get(num[i]);
				occ.put(num[i], integer+1);
			}
		else {
			occ.put(num[i], 1);
		}*/
		}
		
		System.out.println(occ);
		Set<Entry<Integer, Integer>> entrySet = occ.entrySet();
		for (Entry<Integer, Integer> entry : entrySet) {
			Integer value = entry.getValue();
			if(value==1) {
				System.out.println(entry.getKey()+":"+entry.getValue());
			}
		} 
	}
}
