package stepdefinition;

public class A24_PassOutputToAMethod {
	
	public int potm (int a, int b, int c) {
		int result = a+b+c;
		return result;
	}

	public static void main(String[] args) {
		A24_PassOutputToAMethod pot = new A24_PassOutputToAMethod();
		int result2 = pot.potm(1, 1, 1);
		System.out.println(result2); 
	}
}
