package A2_JavaBasic2;
//6th continuation of 5th
public class B2_LearnConditionStatements_Nested {
	
	public static void main(String[] args) {
        int age = 20;
		
		if(age < 60 && age >= 18) {
			System.out.println("Adult");
		}
		else if (age < 18) {
			if (age < 10) {
				System.out.println("kid");
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
