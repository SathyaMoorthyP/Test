package C1_java_oops_and_collection;

//Create class Calculator with below methods:
//- 2 methods for add. 1 method with 2 int args. 1 method with 3 int args
//- 2 method for sub. 1 method with 2 double args. 1 method with 2 int args
//- 2 method for mul. 1 method with 1 int and 1 double. 1 method with 2 double
//
//above is method overroading example

public class D1_CA_Calculator_Overroading {

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
		
		D1_CA_Calculator_Overroading obj = new D1_CA_Calculator_Overroading();
		obj.add1(10, 20);
		obj.add1(10, 20, 30);
		obj.sub(10, 20);
		obj.sub(55, 56.21);
		obj.mul(54, 12);
		obj.mul(12, 10);
	}	
}
