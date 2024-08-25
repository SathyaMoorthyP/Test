package stepdefinition;

public class A28_RevereseAString_2 {
	
	public static void main(String[] args) {
		
		String str = "ABCD";
		String rev = " ";
		
		char[] charArray = str.toCharArray();
		
		int len = str.length();
		
		for (int i = len-1; i >= 0; i--) {
			rev = rev + charArray[i];
		}
		
		System.out.println(rev);
	}

}
