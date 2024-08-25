package feb16_2024;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String num = "ABCD";
		//String rev = "";

		StringBuffer ind = new StringBuffer(num);
		System.out.println(ind.reverse());
		
		/*int length = num.length(); //4
		char[] ch = num.toCharArray(); // {A, B, C, D}
		
		for (int i = length-1; i >= 0; i--) {
			rev = rev + ch[i];
		}
		System.out.println(rev);*/
		
//		int len = num.length(); //4
//		
//		for (int i = len-1; i >= 0; i--) {
//			rev = rev + num.charAt(i);
//			System.out.println(rev);
//		}	
	}
}
