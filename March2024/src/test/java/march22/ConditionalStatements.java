package march22;

public class ConditionalStatements {

	public static void main(String[] args) {
		
		int age = 61;
		
		if(age>=18 && age<60) {
			System.out.println("Adult");
		}
		else if(age<18) {
			System.out.println("Minor");
		}
		else {
			System.out.println("Senoir Citizen");
		}

	}

}
