package Pages_POM_Video1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pom_video1_baseclass.BaseClass;

public class A4_LeadPage extends BaseClass {

	public A4_LeadPage(WebDriver driver) {
		this.driver = driver;
	}

	public A4_LeadPage enterCName() {
		driver.findElement(By.xpath("//*[text()='Company Name']/following::input[@name='companyName']")).sendKeys("Automations");
		return this;
		}
	
	public A4_LeadPage enterFName() {
		driver.findElement(By.xpath("//*[text()='First name']/following::*[@name='firstName']")).sendKeys("Task");
		return this;
		}

	public A4_LeadPage enterLName() {
		driver.findElement(By.xpath("//*[text()='Last name']/following::*[@name='lastName']")).sendKeys("Automations");
		return this;
		}

	public A5_CreateLeadPage clickLeadButton() {
		driver.findElement(By.xpath("//*[@name='submitButton']")).click();
		return new A5_CreateLeadPage();
		
	}
	
}
