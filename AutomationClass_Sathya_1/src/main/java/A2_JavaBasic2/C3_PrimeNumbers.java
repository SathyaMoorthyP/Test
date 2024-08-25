package A2_JavaBasic2;

import java.util.Iterator;

//9th

public class C3_PrimeNumbers {

	public static void main(String[] args) {
		int input = 7;
		int count = 0;
		
		for (int i = 1; i <= input; i++) {
			
			if (input % i==0) {
				count++;
			}
		}
	 if (count == 2) {
		 System.out.println("Given number is PrimeNumber");
	 }
	 else {
		 System.out.println("Given number is not a PrimeNumber");
	 }
		
	}

}
