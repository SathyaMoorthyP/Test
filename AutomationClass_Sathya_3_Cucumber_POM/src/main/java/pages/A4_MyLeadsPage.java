package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.baseclass;

public class A4_MyLeadsPage extends baseclass {

//	public A4_MyLeadsPage(WebDriver driver) {
//		this.driver = driver;
//	}
		
	public A5_CreateLeadPage clickCreateLeadbutton() {
		getDriver().findElement(By.xpath("//a[text()='Create Lead']")).click();
		return new A5_CreateLeadPage();
		
	}	
	
	//TC002
	public void clickFindLead() {
		getDriver().findElement(By.xpath("//a[text()='Find Leads']")).click();
		
	}
}

