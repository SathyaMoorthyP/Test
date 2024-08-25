package A2_JavaBasic2;
//4th class activity continuation of 3rd

public class A3_ClassActivityMyCalculator {

	public static void main(String[] args) {

		A4_ClassActivityCalculator cal = new A4_ClassActivityCalculator();
		
		int add = cal.add(10, 20, 30);
		int sub = cal.sub(30, 20);
		double mul = cal.mul(60, 30);
		float divide = cal.divide(100, 50);
		
		System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(divide);
	}

}
