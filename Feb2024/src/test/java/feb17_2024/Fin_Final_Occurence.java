package feb17_2024;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import org.openqa.selenium.Keys;

public class Fin_Final_Occurence {

	public static void main(String[] args) {
		
		String dName = "viha.ss";
		char[] nam = dName.toCharArray(); //v i h a . s

		Map<Character, Integer> occ = new LinkedHashMap<Character, Integer>();
		
		for(int i=0; i < nam.length; i++) {  // v
			if(occ.containsKey(nam[i])) {
				Integer value = occ.get(nam[i]);
				occ.put(nam[i], value+1);
			}
			else {
				occ.put(nam[i], 1); //v=1 i=1
			}
		}
	//System.out.println(occ);
		Set<Entry<Character, Integer>> entrySet = occ.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {
					Integer value = entry.getValue();
					if(value == 1) {
						System.out.println(entry.getKey()+":"+ entry.getValue());
					}
			
		}
		
	}
}
