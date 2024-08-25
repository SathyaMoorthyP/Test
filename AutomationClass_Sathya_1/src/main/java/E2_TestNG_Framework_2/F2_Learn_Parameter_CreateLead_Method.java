package E2_TestNG_Framework_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class F2_Learn_Parameter_CreateLead_Method extends F1_Learn_Parameter_CreateLead_BaseClass {
	@Test
	public void runCreateLead() {
			
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Google");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sathya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("P");
		driver.findElement(By.name("submitButton")).click();
		String firstName = driver.findElement(By.id("viewLead_firstName_sp")).getText();		
  }
	}
