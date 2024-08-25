package A2_JavaBasic2;
//12 th

public class C6_SumOfDigits {

	public static void main(String[] args) {
		
		int input = 345; //3+4+5 -> 12
		int sum = 0;
		
		while(input > 0) {
		
			int rem = input % 10; //reminder as 5-> 4-> 3
			
			sum = sum + rem; // 0+5
			
			input = input / 10; //345 -> 34 -> 3
		}
		System.out.println(sum);
	}
}
