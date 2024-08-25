package Test_NG_FrameWork_2;

import org.testng.annotations.Test;

public class LearnGroups {
	
	@Test(groups = {"Regression", "Sanity"})
	public void narayanan() {
		System.out.println("Narayanana");
	}

	@Test(groups = {"Sanity", "Smoke"})
	public void naresh() {
		System.out.println("Naresh");
	}
	
	@Test(groups = {"Smoke","Regression"})
	public void sathya() {
		System.out.println("Sathya");
	}
}
