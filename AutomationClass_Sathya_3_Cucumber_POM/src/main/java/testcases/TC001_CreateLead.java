package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.baseclass;
import pages.A1_LoginPage;

public class TC001_CreateLead extends baseclass{
	
	@BeforeClass
	public void setData() {
		//fileName = "EditLead";
	fileName = "CreateLead";
	}
	
	@Test(dataProvider = "fetchData")
	public void runCreateLead(String uName, String pWord, String cName, String fName, String lName) {
		
		new A1_LoginPage()
		.enterUserName(uName)
		.enterPassword(pWord);
//		.clickLogin()
//		.clickCRMSFA()
//		.clickLeads()
//		.clickCreateLeadbutton()
//		.enterCname(cName)
//		.enterFname(fName)
//		.enterLname(lName)
//		.clickCreateLead();

	}
}
