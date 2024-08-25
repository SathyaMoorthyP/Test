package stepdefinition;

public class MethodOverLoading {
	
	public MethodOverLoading() {
		System.out.println("Testing");
	}
	
	
	public MethodOverLoading(String s) {
		System.out.println("Print the arguments " + s);
	}
	
	public static void main(String[] args) {
		MethodOverLoading mol = new MethodOverLoading();
		MethodOverLoading mol1 = new MethodOverLoading("Sathya");
	}

}
 