package feb28;

public class ExtractTheWord {
	
	static String name = "ttterer";
	public static void main(String[] args) {
		
		String sentencee = "Sun"+name+"Moon";
		String[] split2 = sentencee.split("o");
		System.out.println(split2[1]);
		
		String hex = "Star Sun Moon";
		String[] split = hex.split(" ");
//		String[] split = hex.split(" ");
//		System.out.println(split[1]);
		
		
//		for (int i = 0; i < split2.length; i++) {
//			System.out.println(split2[i]);
//		}
		
//		String sentence = "Sun Star Moon";
//		String[] split = sentence.split(" ");
//		System.out.println("Number of words : " + split.length);
//		for (int i = 0; i < split.length; i++) {
//			System.out.println(split[i]);
//		}
		
	}
}
