package week1.day1;

public class Mathematics {

	// Global varibales	
	int a = 5;
	int b = 5;
	int c ;
	
//	Normal methods
	public void addition() {
		c=a+b;
		System.out.println("Addition value is " +c);
	}
	
	public void subtraction() {
		c=a-b;
		System.out.println("Subtraction value is " + c);
	}
	
	private void multiplication() {
		c=a*b;
		System.out.println("Multiplication value is " + c);
	}
	
	void modulus() {
		c=a%b;
		System.err.println("Modulus valud is " + c);
	}
	
	protected void division() {
		c=a/b;
		System.out.println("Division value is " + c);
	}
	
//	Main method using object
	public static void main(String[] args) {
				
		Mathematics test = new Mathematics();
		test.addition();
		test.division();
		test.modulus();
		test.multiplication();
		test.subtraction();
	}
}
