package week1.day2;

import java.util.Iterator;

public class PrintPrimeNumbers {

	public static void main(String[] args) {
		
		int input = 9;
		
		int count = 0;
		
		// start the division from 1 and stop at 9
		
		for (int i = 1; i <= input ; i++) {
	
			if (input % i == 0 ) {
		
				count++;
			}
				
		}
		
		if(count==2){
		
			System.out.println("Given Number is a Prime");
			
		}
		
		else {
		
			System.out.println("Given Number is not a Prime Number");
			
		}
	}
			
}
	
