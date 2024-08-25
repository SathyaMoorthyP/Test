package A2_JavaBasic2;
//5 th

public class B1_LearnConditionStatements {

	public static void main(String[] args) {
		
		int age = 20;
		
		if(age < 60 && age >= 18) {
			System.out.println("Adult");
		}
		
		else if (age < 18) {
			System.out.println("Minor");
		}
		
		else {
			System.out.println("Senior Citizen");
		}
	}		
}
	

