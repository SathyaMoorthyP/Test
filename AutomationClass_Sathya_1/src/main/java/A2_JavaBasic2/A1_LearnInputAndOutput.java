package A2_JavaBasic2;
//1st //pass input to a method

public class A1_LearnInputAndOutput {

	public void sum(int num1, int num2, int num3) {
		System.out.println(num1 + num2 + num3);

	}
	
	public static void main(String[] args) {
 
		A1_LearnInputAndOutput liao = new A1_LearnInputAndOutput();
		
		//call method
		liao.sum(10, 20, 30);
		
	}

}
