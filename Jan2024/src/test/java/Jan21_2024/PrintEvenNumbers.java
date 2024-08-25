package Jan21_2024;
public class PrintEvenNumbers {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 50; i++)
			if(i%2 ==0) {
				System.out.println(i);
			}	
		
		for (int i = 50; i >= 1; i--) {
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
	}
	
}
