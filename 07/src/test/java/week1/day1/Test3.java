package week1.day1;

import org.testng.asserts.SoftAssert;

public class Test3 extends Test2  {

	int a = 200;
	int b = 100;
	int c;
	
	public void modulus() {
		c=a%b;
		System.out.println("Modulus value of a%b is "+c);
	}
	
	public void additions () {
c=a+b;
System.out.println("Addition value of a+b is "+c);
	}

	public static void main(String[] args) {
		
	
		Test3 hw3 = new Test3();
		hw3.modulus();
		hw3.addition();
		hw3.additions();
		hw3.multiplication();
		hw3.substraction();
		hw3.division();
	}
	
}
