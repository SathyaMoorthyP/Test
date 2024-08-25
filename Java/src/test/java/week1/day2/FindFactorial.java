package week1.day2; 

public class FindFactorial {

	public static void main(String[] args) {
		
		// declare your input as 5
		int input = 5;
		
		//declare a integer variable fact as 1
		int fact = 1;
		
		//Iterate from 1 to your input (tip using loop concept)
		for (int i = input; i > 0; i--) {
		
		//Within the loop: Multiply fact with the iterator variable (Tip: Assign it to the 'fact' variable)
			fact = fact*i;
			
		}
		
		System.out.println(fact);
	}
    	
}
