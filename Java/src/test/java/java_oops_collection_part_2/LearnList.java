package java_oops_collection_part_2;

import java.util.ArrayList;
import java.util.List;

public class LearnList {

	 public static void main(String[] args) {
		
	 List<String> mini = new ArrayList<String>();
	 mini.add("India");
	 mini.add("Srilanka");
	 mini.add("Pakistan");
	 mini.add("America");
	 
	System.out.println(mini);
	
	System.out.println(mini.size());
	
	mini.remove(2);
	System.out.println(mini);
	
	String mini1 = mini.get(0);
	System.out.println(mini1);
	
	boolean contains = mini.contains("America");
	System.out.println(contains);
	
	mini.clear();
	System.out.println(mini);
	
	boolean empty1 = mini.isEmpty();
	System.out.println(empty1);
	
	
	}
	
}
