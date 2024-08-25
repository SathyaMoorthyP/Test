package feb26_2024;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateCharacters {

	public static void main(String[] args) {
		
		String cName = "Google";
		char[] charArray = cName.toCharArray();
		int length = charArray.length;
		
		Set<Character> uniqueseet = new HashSet<Character>();
		
		for (int i = 0; i < charArray.length; i++) {
			uniqueseet.add(charArray[i]);
			//uniqueseet.add(charArray[i]);
		}
		System.out.println(uniqueseet);
	}

}
