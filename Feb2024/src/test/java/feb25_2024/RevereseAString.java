package feb25_2024;

public class RevereseAString {
	
	public static void main (String[] args) {
		
		String str = "1234";
		String rev = "";
		
		char[] a = str.toCharArray();
		int length = a.length;
		
		for (int i = length-1; i >= 0; i--) {
			rev = rev+a[i];
		}
		System.out.println(rev);
	}
}

