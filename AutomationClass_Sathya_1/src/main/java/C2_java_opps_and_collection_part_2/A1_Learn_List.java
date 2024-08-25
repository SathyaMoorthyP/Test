package C2_java_opps_and_collection_part_2;

import java.util.ArrayList;
import java.util.List;

public class A1_Learn_List {

	public static void main(String[] args) {
		
		List<String> mentors = new ArrayList<String>();
		mentors.add("Haja");
		mentors.add("Hari");
		mentors.add("Babu");
		mentors.add("Balaji");
		
		System.out.println(mentors);
		System.out.println(mentors.size());
		
		mentors.remove(1); //index automatically changes after remove
		System.out.println(mentors);
	
		String mentor = mentors.get(1);
		System.out.println(mentor);
		
		boolean containss = mentors.contains("Hari");
		System.out.println(containss);
		
		mentors.clear();
		System.out.println(mentors);
		
		boolean empty1 = mentors.isEmpty();
		System.out.println(empty1);
	}
}
 