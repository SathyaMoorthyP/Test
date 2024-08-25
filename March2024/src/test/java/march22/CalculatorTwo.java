package march22;

public class CalculatorTwo {
	
	public static void main(String[] args) {
		
		CalculatorOne cal = new CalculatorOne();
		cal.add(10, 10, 10);
		System.out.println(cal.sub(10, 10));
		System.out.println(cal.mul(10, 10));
		System.out.println(cal.divide(10, 10));
		
	}

}
