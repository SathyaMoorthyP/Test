package week1.day2;

public class LearnOutputFromMethod {

    public int sum(int num1, int num2, int num3) {
    	
    	int result = num1 + num2 + num3;
    	System.out.println(result);
	
    	return result;
	}

		public static void main(String[] args) {
			
			LearnOutputFromMethod obj1 = new LearnOutputFromMethod();
			
			// call method 
			int result = obj1.sum(20,40,60);
			
			//Arithmetic calculation
			System.out.println(result * 300/10 );

		}
	
	
}
