package march21;

public class PassInputToAMethod {
	
	public void su(int num1, int num2, int num3) {
		System.out.println(num1 + num2 + num3);
	}

	public static void main(String[] args) {
		
		PassInputToAMethod pitm = new PassInputToAMethod();
		pitm.su(1, 10, 5);
		
	}
}
