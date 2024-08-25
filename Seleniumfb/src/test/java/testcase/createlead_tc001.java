package testcase;

import org.testng.annotations.Test;

import Pages_POM_Video1.A1_LoginPage;
import pom_video1_baseclass.BaseClass;

public class createlead_tc001 extends BaseClass {

	@Test
	public void runTCCreateLead() {
		
		new A1_LoginPage(driver)
		.enterUname()
		.enterPassword()
		.clickLogin()
		.clickCRMSFA()
		.clickCreateLead()
		.enterCName()
		.enterFName()
		.enterLName()
		.clickLeadButton();
		
////		.clickCreateLead()
//		.enterCName()
//		.enterFName()
//		.enterLName()
//		.clickLeadButton();
	}
	
}
