package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.baseclass;

public class A4_MyLeadsPage extends baseclass {

	public A4_MyLeadsPage(WebDriver driver) {
		this.driver = driver;
	}
		
	public A5_CreateLeadPage clickCreateLeadbutton() {
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		return new A5_CreateLeadPage(driver);
		
	}	
	
	//TC002
	public void clickFindLead() {
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
	}
}

