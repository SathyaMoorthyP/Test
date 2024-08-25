package B2_selenium_basics_2;
//1st

public class A1_LearnString {

	public static void main(String[] args) {
		
		//String Literal
		String s = "TestLeaf";
		String sa = "Welcome to Test Leaf";
		
		//String Object
		String s2 = new String("TestLeaf");
		
		//Compare two strings
		boolean isEqual = s.equals(s2);
		System.out.println(isEqual);
		
		//memory comparison
		System.out.println(s==s2);

		//to get the number of Strings
		int length = s.length();
		System.out.println(length);
		
		//to convert String to char Array
		char[] charArray = s.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			System.out.println(charArray[i]);
		}
		
		//to get particular char
		char charAt = s.charAt(7);
		System.out.println(charAt);
		
		//to get a last character
		char charAt2 = s.charAt(s.length()-1);
		System.out.println(charAt2);
		
		//to get position of a specific char
		int indexOf = s.indexOf('t');
		System.out.println(indexOf);
	
		//to check if string contains specific text
		boolean contains = s.contains("eaf");
		System.out.println(contains);
		
		//to split the string
		String[] split = sa.split(" ");   //" " - denotes space
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}
	}
}
