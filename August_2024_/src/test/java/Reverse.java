
public class Reverse {
	
	public static void main(String[] args) {
		String word = "Good Morning";
		String[] words = word.split(" ");
		String reverse = " ";
			for (int i = words.length-1; i >=0 ; i--) {
				reverse = reverse +" "+ words[i];
			}
		System.out.print(reverse);
	}
}
\