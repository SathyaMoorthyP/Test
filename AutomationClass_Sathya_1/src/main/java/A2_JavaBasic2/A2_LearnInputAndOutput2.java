package A2_JavaBasic2;
//2nd //pass output to a method

public class A2_LearnInputAndOutput2 {

	public long sum(int num1, int num2, int num3) {
		
		int result = num1+num2+num3;
        System.out.println(result);
		
        return result;
	}
	
	public static void main(String[] args) {
		
		A2_LearnInputAndOutput2 liao2 = new A2_LearnInputAndOutput2();
		
		long result1 = liao2.sum(10, 20, 30);
		
		System.out.println(result1 / 2);
		
		
	}
}
