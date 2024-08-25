package java_oops_collection;

public class OverLoadingExampleClassActivity2 {
	
	public void add1(int a, int b) {
		
		int c = a + b;
		System.out.println("Value of C is " + c);
	}
	
	public void add1(int a, int b, int c) {
	    int d = a+b+c;
	    System.out.println("Value of D is " + d);
	}
	
	public void sub(double a, double b) {
		
		double c = a-b;
		System.out.println("Value of C is " + c);
	}
	
	public void sub(int a, int b) {
        int c = a-b;
        System.out.println("Value of C is " + c);
	}
	
	public void mul(int a, double b) {
        double c = a*b;
        System.out.println("Value of C is " + c);
	}
	
	public void mul(double a, double b) {
		double c = a*b;
		System.out.println("Value of C is " + c);
	}
	
	public static void main(String[] args) {
		
		OverLoadingExampleClassActivity2 obj = new OverLoadingExampleClassActivity2();
		obj.add1(10, 20);
		obj.add1(10, 20, 30);
		obj.sub(10, 20);
		obj.sub(55, 56.21);
		obj.mul(54, 12);
		obj.mul(12, 10);
	}
}
