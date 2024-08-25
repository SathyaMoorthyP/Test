package stepdefinition;

public class A24_PassInputToAMethod {

	public void sum(int a, int b, int c) {
		System.out.println(a+b+c);
			}
	
	public static void main(String[] args) {
		
		A24_PassInputToAMethod pitm = new A24_PassInputToAMethod();
		pitm.sum(1, 2, 3);
	}

}
