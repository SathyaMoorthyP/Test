package E2_TestNG_Framework_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class C2_Learn_DataProvider_CreateLead_Method extends C1_Learn_DataProvider_CreateLead_BaseClass2 {
	
	
	@Test(dataProvider = "fetchData")
	public void runCreateLead(String cName, String fname, String lName) {
			
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.name("submitButton")).click();
		String firstName = driver.findElement(By.id("viewLead_firstName_sp")).getText();		
	}
		
		@DataProvider(name = "fetchData")
		public String[][] setData() {
			String [] [] data = new String[2][3];
			
			data [0] [0] = "Test Leaf";
			data [0] [1] = "Haja";
			data [0] [2] = "J";
			
			data [1] [0] = "QEagle";
			data [1] [1] = "Hari";
			data [1] [2] = "R";
			
			return data;
		}
  }
	
