package Test_NG_Framework_2;

import org.testng.annotations.Test;

public class A1_LearnGroups {

	@Test(groups = "smoke")
	public void createLead() {
		System.out.println("Create Lead");
	}
	
	@Test(groups = "sanity")
	public void editLead() {
		System.out.println("Edit Lead");
	}
		 
}
