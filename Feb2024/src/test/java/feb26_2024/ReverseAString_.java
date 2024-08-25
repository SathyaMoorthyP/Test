package feb26_2024;

public class ReverseAString_ {

	public static void main(String[] args) {

		String str = "ABCD";
		String var = "";
		
		int length = str.length(); //4
		
		for (int i = length-1; i >= 0; i--) {
			var = var + str.charAt(i); //D C B A
		}
		System.out.println(var);
		
	}

}
