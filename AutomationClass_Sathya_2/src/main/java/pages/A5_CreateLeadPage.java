package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.baseclass;

public class A5_CreateLeadPage extends baseclass{

	public A5_CreateLeadPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public A5_CreateLeadPage enterCname(String cName) {
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys(cName);
		//return new A5_CreateLeadPage(driver);
		return this;
	}
	
	public A5_CreateLeadPage enterFname(String fName) {
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys(fName);
		//return new A5_CreateLeadPage(driver);
		return this;
	}
	
	public A5_CreateLeadPage enterLname(String lName) {
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys(lName);
		//return new A5_CreateLeadPage(driver);
		return this;
	}
	
	public A6_ViewLeadPage clickCreateLead() {
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		return new A6_ViewLeadPage(driver);	
	}
}
