package Jan21_2024;

public class ConditionalStatements_AGE {

	public static void main(String[] args) {

		int age = 17;
		
		if(age <= 60 && age >= 18) {
			System.out.println("Adult");
		}
		
		else if(age < 18) {
			System.out.println("Minor");
		}
		
		else{
			System.out.println("Senior Citizen");
		}
	}

		
}
