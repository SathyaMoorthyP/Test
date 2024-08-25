package feb16_2024;

import java.util.Set;
import java.util.TreeSet;

public class Final_PrintDuplicate_Character {

	public static void main(String[] args) {

		String cName = "google";
		char[] charArray = cName.toCharArray();
	
		Set<Character> uni = new TreeSet<Character>();
		for (int i = 0; i < charArray.length; i++) {
			uni.add(charArray[i]);
		}
System.out.println(uni);
	}
}
