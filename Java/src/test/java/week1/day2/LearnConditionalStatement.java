package week1.day2;

public class LearnConditionalStatement {

	public static void main(String[] args) {

		int age = 60;
		//if condition is used for comparison
		
		if (age >= 18 && age <60) {
		System.out.println("Adult");
		}
		
		else if(age < 18) {
		System.out.println("Minor");
		}
		
		//if (age < 60)
		else {
		System.out.println("Senior Citizen");
		}
	}

}
