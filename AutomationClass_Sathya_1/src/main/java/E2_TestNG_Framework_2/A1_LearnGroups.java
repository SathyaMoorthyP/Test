package E2_TestNG_Framework_2;

import org.testng.annotations.Test;

public class A1_LearnGroups {

	@Test(groups= {"sanity"})
	public void createLead () {
		System.out.println("Create Lead");
	}
	
	@Test(groups= {"smoke"})
	public void editLead () {
		System.out.println("Edit Lead");
	}
}
