package feb25_2024;

public class ReverseAClass {

	public static void main(String[] args) {

		String str = "ABCD";
		String rev = "";
		
		int len = str.length(); //4

		for (int i = len-1; i >= 0 ; i--) {
			rev = rev + str.charAt(i); //D C B A
		}
		System.out.println(rev);
	}
}
