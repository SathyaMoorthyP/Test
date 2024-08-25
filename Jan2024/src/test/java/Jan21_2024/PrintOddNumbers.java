package Jan21_2024;

public class PrintOddNumbers {

	public static void main(String[] args) {

		for (int i = 1; i < 50; i++) {
			if(i%2 == 1) {
				System.out.println(i);
			}
		}
		
		for (int i = 50; i >= 1; i--) {
			if(i%2 ==1) {
				System.err.println(i);
			}
		}
		
	}

	public void methodD() {
		int a = 7;
		String name = "India";
		System.out.println(name);
	}
}
