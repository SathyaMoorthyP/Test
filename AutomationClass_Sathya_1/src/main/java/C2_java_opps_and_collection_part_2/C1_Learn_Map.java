package C2_java_opps_and_collection_part_2;

import java.util.HashMap;
import java.util.Map;

public class C1_Learn_Map {

	public static void main(String[] args) {
		
		Map<Integer, String> empDetails = new HashMap<Integer, String>();
		
		empDetails.put(1000, "Haja");
		empDetails.put(1001, "Hari");
		
		System.out.println(empDetails);
		System.out.println(empDetails.size());
		
		empDetails.remove(1001);
		System.out.println(empDetails); 
		
		System.out.println(empDetails.containsKey(1001));
		
	}
}
