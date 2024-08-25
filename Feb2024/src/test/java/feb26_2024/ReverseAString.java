package feb26_2024;

public class ReverseAString {

	public static void main(String[] args) {

		String str = "ABCDEF";
		String var = "";
		
		char[] ca = str.toCharArray();
		int length = ca.length; //4
		
		for(int i=length-1; i>=0; i--) {
			var = var + ca[i];
		}	
		System.out.println(var);
	}
}
