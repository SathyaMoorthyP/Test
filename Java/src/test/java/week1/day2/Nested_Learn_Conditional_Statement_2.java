package week1.day2;

public class Nested_Learn_Conditional_Statement_2 {
	
	public static void main(String[] args) {
		
		int age = 60;
		//if condition is used for comparison
		
		if (age >= 18 && age <60) {
		System.out.println("Adult");
		}
		
		// Nested 
		else if(age < 18) {
				
			if (age >10) {
			System.out.println("Kid");
			}
				
			else {
			System.out.println("Minor");
			}
		}
			
		else {
		System.out.println("Senior Citizen");
		}
	}
}
