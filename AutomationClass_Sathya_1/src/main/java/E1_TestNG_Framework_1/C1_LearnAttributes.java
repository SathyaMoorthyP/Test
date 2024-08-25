package E1_TestNG_Framework_1;

//priority = 1 , alwaysRun = True, enabled = true
//depends on Methods = 'Create Lead'

public class C1_LearnAttributes {
	
	public void createLead() {
		System.out.println("Create Lead");
	}
	
	public void editLead() {
		System.out.println("Edit Lead");
	}

	public void deleteLead() {
		System.out.println("Delete Lead");
	}
}
